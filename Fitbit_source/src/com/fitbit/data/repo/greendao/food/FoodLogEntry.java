// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.food;

import de.greenrobot.dao.DaoException;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao.food:
//            DaoSession, FoodLogEntryDao, FoodItemDao, FoodItem

public class FoodLogEntry
{

    private Double amount;
    private String brand;
    private Double calories;
    private transient DaoSession daoSession;
    private Integer entityStatus;
    private Long foodId;
    private FoodItem foodItem;
    private Long foodItem__resolvedKey;
    private Long id;
    private Boolean isQuickCaloriesAdd;
    private Date logDate;
    private Integer mealType;
    private transient FoodLogEntryDao myDao;
    private String name;
    private Long serverId;
    private Date timeCreated;
    private Date timeUpdated;
    private String trackerType;
    private String unitName;
    private String unitNamePlural;
    private String uuid;
    private Double value;

    public FoodLogEntry()
    {
    }

    public FoodLogEntry(Long long1)
    {
        id = long1;
    }

    public FoodLogEntry(Long long1, Long long2, String s, Date date, Date date1, Integer integer, Double double1, 
            String s1, Date date2, Boolean boolean1, Double double2, String s2, Double double3, Integer integer1, 
            String s3, String s4, String s5, Long long3)
    {
        id = long1;
        serverId = long2;
        uuid = s;
        timeCreated = date;
        timeUpdated = date1;
        entityStatus = integer;
        value = double1;
        trackerType = s1;
        logDate = date2;
        isQuickCaloriesAdd = boolean1;
        amount = double2;
        brand = s2;
        calories = double3;
        mealType = integer1;
        name = s3;
        unitName = s4;
        unitNamePlural = s5;
        foodId = long3;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        daoSession = daosession;
        if (daosession != null)
        {
            daosession = daosession.getFoodLogEntryDao();
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

    public Double getAmount()
    {
        return amount;
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

    public Long getFoodId()
    {
        return foodId;
    }

    public FoodItem getFoodItem()
    {
        Long long1 = foodId;
        if (foodItem__resolvedKey != null && foodItem__resolvedKey.equals(long1)) goto _L2; else goto _L1
_L1:
        if (daoSession == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        }
        FoodItem fooditem = (FoodItem)daoSession.getFoodItemDao().load(long1);
        this;
        JVM INSTR monitorenter ;
        foodItem = fooditem;
        foodItem__resolvedKey = long1;
        this;
        JVM INSTR monitorexit ;
_L2:
        return foodItem;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Long getId()
    {
        return id;
    }

    public Boolean getIsQuickCaloriesAdd()
    {
        return isQuickCaloriesAdd;
    }

    public Date getLogDate()
    {
        return logDate;
    }

    public Integer getMealType()
    {
        return mealType;
    }

    public String getName()
    {
        return name;
    }

    public Long getServerId()
    {
        return serverId;
    }

    public Date getTimeCreated()
    {
        return timeCreated;
    }

    public Date getTimeUpdated()
    {
        return timeUpdated;
    }

    public String getTrackerType()
    {
        return trackerType;
    }

    public String getUnitName()
    {
        return unitName;
    }

    public String getUnitNamePlural()
    {
        return unitNamePlural;
    }

    public String getUuid()
    {
        return uuid;
    }

    public Double getValue()
    {
        return value;
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

    public void setAmount(Double double1)
    {
        amount = double1;
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

    public void setFoodId(Long long1)
    {
        foodId = long1;
    }

    public void setFoodItem(FoodItem fooditem)
    {
        this;
        JVM INSTR monitorenter ;
        foodItem = fooditem;
        if (fooditem != null) goto _L2; else goto _L1
_L1:
        fooditem = null;
_L4:
        foodId = fooditem;
        foodItem__resolvedKey = foodId;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        fooditem = fooditem.getId();
        if (true) goto _L4; else goto _L3
_L3:
        fooditem;
        this;
        JVM INSTR monitorexit ;
        throw fooditem;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setIsQuickCaloriesAdd(Boolean boolean1)
    {
        isQuickCaloriesAdd = boolean1;
    }

    public void setLogDate(Date date)
    {
        logDate = date;
    }

    public void setMealType(Integer integer)
    {
        mealType = integer;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setServerId(Long long1)
    {
        serverId = long1;
    }

    public void setTimeCreated(Date date)
    {
        timeCreated = date;
    }

    public void setTimeUpdated(Date date)
    {
        timeUpdated = date;
    }

    public void setTrackerType(String s)
    {
        trackerType = s;
    }

    public void setUnitName(String s)
    {
        unitName = s;
    }

    public void setUnitNamePlural(String s)
    {
        unitNamePlural = s;
    }

    public void setUuid(String s)
    {
        uuid = s;
    }

    public void setValue(Double double1)
    {
        value = double1;
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
