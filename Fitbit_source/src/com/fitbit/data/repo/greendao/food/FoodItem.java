// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.food;

import de.greenrobot.dao.DaoException;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.food:
//            DaoSession, FoodItemDao, LightServingDao

public class FoodItem
{

    private String brand;
    private Double calories;
    private transient DaoSession daoSession;
    private Integer entityStatus;
    private Long id;
    private Boolean isCustom;
    private Boolean isGeneric;
    private Boolean isRaw;
    private List lightServings;
    private String locale;
    private Double maxGenericCalories;
    private Double minGenericCalories;
    private Double mostGenericCalories;
    private transient FoodItemDao myDao;
    private String name;
    private String nutritionalValues;
    private Boolean populated;
    private Long serverId;

    public FoodItem()
    {
    }

    public FoodItem(Long long1)
    {
        id = long1;
    }

    public FoodItem(Long long1, Long long2, String s, String s1, Double double1, String s2, Boolean boolean1, 
            Boolean boolean2, Boolean boolean3, String s3, Double double2, Double double3, Double double4, Boolean boolean4, 
            Integer integer)
    {
        id = long1;
        serverId = long2;
        name = s;
        brand = s1;
        calories = double1;
        nutritionalValues = s2;
        isCustom = boolean1;
        isRaw = boolean2;
        isGeneric = boolean3;
        locale = s3;
        minGenericCalories = double2;
        mostGenericCalories = double3;
        maxGenericCalories = double4;
        populated = boolean4;
        entityStatus = integer;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        daoSession = daosession;
        if (daosession != null)
        {
            daosession = daosession.getFoodItemDao();
        } else
        {
            daosession = null;
        }
        myDao = daosession;
    }

    public void delete()
    {
        if (myDao == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        } else
        {
            myDao.delete(this);
            return;
        }
    }

    public String getBrand()
    {
        return brand;
    }

    public Double getCalories()
    {
        return calories;
    }

    public Integer getEntityStatus()
    {
        return entityStatus;
    }

    public Long getId()
    {
        return id;
    }

    public Boolean getIsCustom()
    {
        return isCustom;
    }

    public Boolean getIsGeneric()
    {
        return isGeneric;
    }

    public Boolean getIsRaw()
    {
        return isRaw;
    }

    public List getLightServings()
    {
        if (lightServings != null) goto _L2; else goto _L1
_L1:
        if (daoSession == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        }
        List list = daoSession.getLightServingDao()._queryFoodItem_LightServings(id);
        this;
        JVM INSTR monitorenter ;
        if (lightServings == null)
        {
            lightServings = list;
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return lightServings;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String getLocale()
    {
        return locale;
    }

    public Double getMaxGenericCalories()
    {
        return maxGenericCalories;
    }

    public Double getMinGenericCalories()
    {
        return minGenericCalories;
    }

    public Double getMostGenericCalories()
    {
        return mostGenericCalories;
    }

    public String getName()
    {
        return name;
    }

    public String getNutritionalValues()
    {
        return nutritionalValues;
    }

    public Boolean getPopulated()
    {
        return populated;
    }

    public Long getServerId()
    {
        return serverId;
    }

    public void refresh()
    {
        if (myDao == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        } else
        {
            myDao.refresh(this);
            return;
        }
    }

    public void resetLightServings()
    {
        this;
        JVM INSTR monitorenter ;
        lightServings = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setBrand(String s)
    {
        brand = s;
    }

    public void setCalories(Double double1)
    {
        calories = double1;
    }

    public void setEntityStatus(Integer integer)
    {
        entityStatus = integer;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setIsCustom(Boolean boolean1)
    {
        isCustom = boolean1;
    }

    public void setIsGeneric(Boolean boolean1)
    {
        isGeneric = boolean1;
    }

    public void setIsRaw(Boolean boolean1)
    {
        isRaw = boolean1;
    }

    public void setLocale(String s)
    {
        locale = s;
    }

    public void setMaxGenericCalories(Double double1)
    {
        maxGenericCalories = double1;
    }

    public void setMinGenericCalories(Double double1)
    {
        minGenericCalories = double1;
    }

    public void setMostGenericCalories(Double double1)
    {
        mostGenericCalories = double1;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setNutritionalValues(String s)
    {
        nutritionalValues = s;
    }

    public void setPopulated(Boolean boolean1)
    {
        populated = boolean1;
    }

    public void setServerId(Long long1)
    {
        serverId = long1;
    }

    public void update()
    {
        if (myDao == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        } else
        {
            myDao.update(this);
            return;
        }
    }
}
