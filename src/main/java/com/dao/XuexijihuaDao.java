package com.dao;

import com.entity.XuexijihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexijihuaVO;
import com.entity.view.XuexijihuaView;


/**
 * 学习计划
 * 
 * @author 
 * @email 
 * @date 2022-04-28 12:09:05
 */
public interface XuexijihuaDao extends BaseMapper<XuexijihuaEntity> {
	
	List<XuexijihuaVO> selectListVO(@Param("ew") Wrapper<XuexijihuaEntity> wrapper);
	
	XuexijihuaVO selectVO(@Param("ew") Wrapper<XuexijihuaEntity> wrapper);
	
	List<XuexijihuaView> selectListView(@Param("ew") Wrapper<XuexijihuaEntity> wrapper);

	List<XuexijihuaView> selectListView(Pagination page,@Param("ew") Wrapper<XuexijihuaEntity> wrapper);
	
	XuexijihuaView selectView(@Param("ew") Wrapper<XuexijihuaEntity> wrapper);
	

}
