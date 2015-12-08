// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.food;

import de.greenrobot.dao.DaoException;

// Referenced classes of package com.fitbit.data.repo.greendao.food:
//            DaoSession, FavoriteFoodDao, FoodItemDao, FoodItem

public class FavoriteFood
{

    private transient DaoSession daoSession;
    private Integer entityStatus;
    private Long foodId;
    private FoodItem foodItem;
    private Long foodItem__resolvedKey;
    private Long id;
    private transient FavoriteFoodDao myDao;
    private Long serverFoodId;

    public FavoriteFood()
    {
    }

    public FavoriteFood(Long long1)
    {
        id = long1;
    }

    public FavoriteFood(Long long1, Long long2, Integer integer, Long long3)
    {
        id = long1;
        serverFoodId = long2;
        entityStatus = integer;
        foodId = long3;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        daoSession = daosession;
        if (daosession != null)
        {
            daosession = daosession.getFavoriteFoodDao();
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

    public Long getServerFoodId()
    {
        return serverFoodId;
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

    public void setServerFoodId(Long long1)
    {
        serverFoodId = long1;
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
