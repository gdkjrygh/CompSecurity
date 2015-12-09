// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.food;

import de.greenrobot.dao.DaoException;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao.food:
//            DaoSession, MealItemDao, FoodItemDao, FoodItem, 
//            MealDao, Meal

public class MealItem
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
    private Meal meal;
    private Long mealId;
    private Integer mealType;
    private Long meal__resolvedKey;
    private transient MealItemDao myDao;
    private String name;
    private Long serverId;
    private Date timeCreated;
    private Date timeUpdated;
    private String unitName;
    private String unitNamePlural;
    private String uuid;

    public MealItem()
    {
    }

    public MealItem(Long long1)
    {
        id = long1;
    }

    public MealItem(Long long1, Long long2, String s, Date date, Date date1, Integer integer, Double double1, 
            String s1, Double double2, Integer integer1, String s2, String s3, String s4, Long long3, 
            Long long4)
    {
        id = long1;
        serverId = long2;
        uuid = s;
        timeCreated = date;
        timeUpdated = date1;
        entityStatus = integer;
        amount = double1;
        brand = s1;
        calories = double2;
        mealType = integer1;
        name = s2;
        unitName = s3;
        unitNamePlural = s4;
        foodId = long3;
        mealId = long4;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        daoSession = daosession;
        if (daosession != null)
        {
            daosession = daosession.getMealItemDao();
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

    public Meal getMeal()
    {
        Long long1 = mealId;
        if (meal__resolvedKey != null && meal__resolvedKey.equals(long1)) goto _L2; else goto _L1
_L1:
        if (daoSession == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        }
        Meal meal1 = (Meal)daoSession.getMealDao().load(long1);
        this;
        JVM INSTR monitorenter ;
        meal = meal1;
        meal__resolvedKey = long1;
        this;
        JVM INSTR monitorexit ;
_L2:
        return meal;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Long getMealId()
    {
        return mealId;
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

    public void setMeal(Meal meal1)
    {
        this;
        JVM INSTR monitorenter ;
        meal = meal1;
        if (meal1 != null) goto _L2; else goto _L1
_L1:
        meal1 = null;
_L4:
        mealId = meal1;
        meal__resolvedKey = mealId;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        meal1 = meal1.getId();
        if (true) goto _L4; else goto _L3
_L3:
        meal1;
        this;
        JVM INSTR monitorexit ;
        throw meal1;
    }

    public void setMealId(Long long1)
    {
        mealId = long1;
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
