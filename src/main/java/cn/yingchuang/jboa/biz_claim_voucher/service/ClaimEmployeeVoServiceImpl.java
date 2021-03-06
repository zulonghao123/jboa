package cn.yingchuang.jboa.biz_claim_voucher.service;

import cn.yingchuang.jboa.biz_claim_voucher.dao.ClaimEmployeeVoMapper;
import cn.yingchuang.jboa.biz_claim_voucher.entity.ClaimEmployeeVo;
import cn.yingchuang.jboa.command.util.PageUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 祖龙浩 on 2018/3/13.
 */
@Service
public class ClaimEmployeeVoServiceImpl implements ClaimEmployeeVoService {
    @Resource
    private ClaimEmployeeVoMapper claimEmployeeVoMapper;
    @Override
    public PageUtil<ClaimEmployeeVo> queryClaimEmployeeVoByStatus(Integer pageNum,Integer pageSize,String status) {
        PageHelper.startPage(pageNum, pageSize);
        List<ClaimEmployeeVo> list = claimEmployeeVoMapper.queryClaimEmployeeVoByStatus(status);
        PageInfo<ClaimEmployeeVo> pageInfo = new PageInfo<>(list);
        PageUtil<ClaimEmployeeVo> pageUtil = new PageUtil<>(pageInfo);

        return pageUtil;
    }

    @Override
    public PageUtil<ClaimEmployeeVo> queryClaimEmployeeVoByCheckGM(Integer pageNum,Integer pageSize,String CheckGM) {
        PageHelper.startPage(pageNum, pageSize);
        List<ClaimEmployeeVo> list = claimEmployeeVoMapper.queryClaimEmployeeVoByCheckGM(CheckGM);
        PageInfo<ClaimEmployeeVo> pageInfo = new PageInfo<>(list);
        PageUtil<ClaimEmployeeVo> pageUtil = new PageUtil(pageInfo);
        return pageUtil;
    }

    @Override
    public PageUtil<ClaimEmployeeVo> queryClaimEmployeeVoByCheckDMAndMoney(Integer pageNum,Integer pageSize,String CheckDM) {

        PageHelper.startPage(pageNum, pageSize);
        List<ClaimEmployeeVo> list = claimEmployeeVoMapper.queryClaimEmployeeVoByCheckDMAndMoney(CheckDM);
        PageInfo<ClaimEmployeeVo> pageInfo = new PageInfo<>(list);
        PageUtil<ClaimEmployeeVo> pageUtil = new PageUtil(pageInfo);
        return pageUtil;

    }

    @Override
    public ClaimEmployeeVo queryClaimEmployeeVoById(Integer id) {
        return claimEmployeeVoMapper.queryClaimEmployeeVoById(id);
    }

    @Override
    public PageUtil<ClaimEmployeeVo> queryClaimEmployeeVoByCreateSn(Integer pageNum,Integer pageSize,Integer createSn) {
        PageHelper.startPage(pageNum, pageSize);
        List<ClaimEmployeeVo> list = claimEmployeeVoMapper.queryClaimEmployeeVoByCreateSn(createSn);
        PageInfo<ClaimEmployeeVo> pageInfo = new PageInfo<>(list);
        PageUtil<ClaimEmployeeVo> pageUtil = new PageUtil(pageInfo);
        return pageUtil;
    }

}
