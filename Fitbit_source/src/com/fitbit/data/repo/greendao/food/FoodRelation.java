// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.food;

import de.greenrobot.dao.DaoException;
import java.util.Date;

// Referenced classes of package com.fitbit.data.repo.greendao.food:
//            DaoSession, FoodRelationDao, FoodItemDao, FoodItem

public class FoodRelation
{

    private Double amount;
    private String brand;
    private Double calories;
    private transient DaoSession daoSession;
    private Date dateLastEaten;
    private Integer displayIndex;
    private Long foodId;
    private FoodItem foodItem;
    private Long foodItem__resolvedKey;
    private Integer group;
    private Long id;
    private Integer mealType;
    private transient FoodRelationDao myDao;
    private String name;
    private String unitName;
    private String unitNamePlural;

    public FoodRelation()
    {
    }

    public FoodRelation(Long long1)
    {
        id = long1;
    }

    public FoodRelation(Long long1, Date date, Integer integer, Integer integer1, Double double1, String s, Double double2, 
            Integer integer2, String s1, String s2, String s3, Long long2)
    {
        id = long1;
        dateLastEaten = date;
        group = integer;
        displayIndex = integer1;
        amount = double1;
        brand = s;
        calories = double2;
        mealType = integer2;
        name = s1;
        unitName = s2;
        unitNamePlural = s3;
        foodId = long2;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        daoSession = daosession;
        if (daosession != null)
        {
            daosession = daosession.getFoodRelationDao();
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

    public Date getDateLastEaten()
    {
        return dateLastEaten;
    }

    public Integer getDisplayIndex()
    {
        return displayIndex;
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

    public Integer getGroup()
    {
        return group;
    }

    public Long getId()
    {
        return id;
    }

    public Integer getMealType()
    {
        return mealType;
    }

    public String getName()
    {
        return name;
    }

    public String getUnitName()
    {
        return unitName;
    }

    public String getUnitNamePlural()
    {
        return unitNamePlural;
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

    public void setDateLastEaten(Date date)
    {
        dateLastEaten = date;
    }

    public void setDisplayIndex(Integer integer)
    {
        displayIndex = integer;
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

    public void setGroup(Integer integer)
    {
        group = integer;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setMealType(Integer integer)
    {
        mealType = integer;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setUnitName(String s)
    {
        unitName = s;
    }

    public void setUnitNamePlural(String s)
    {
        unitNamePlural = s;
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
