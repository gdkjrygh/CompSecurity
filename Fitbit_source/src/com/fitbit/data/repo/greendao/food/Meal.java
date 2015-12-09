// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.food;

import de.greenrobot.dao.DaoException;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.food:
//            DaoSession, MealDao, MealItemDao

public class Meal
{

    private transient DaoSession daoSession;
    private String description;
    private Integer entityStatus;
    private Long id;
    private List mealItemList;
    private transient MealDao myDao;
    private String name;
    private Long serverId;
    private Date timeCreated;
    private Date timeUpdated;
    private String uuid;

    public Meal()
    {
    }

    public Meal(Long long1)
    {
        id = long1;
    }

    public Meal(Long long1, Long long2, String s, Date date, Date date1, Integer integer, String s1, 
            String s2)
    {
        id = long1;
        serverId = long2;
        uuid = s;
        timeCreated = date;
        timeUpdated = date1;
        entityStatus = integer;
        name = s1;
        description = s2;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        daoSession = daosession;
        if (daosession != null)
        {
            daosession = daosession.getMealDao();
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

    public String getDescription()
    {
        return description;
    }

    public Integer getEntityStatus()
    {
        return entityStatus;
    }

    public Long getId()
    {
        return id;
    }

    public List getMealItemList()
    {
        if (mealItemList != null) goto _L2; else goto _L1
_L1:
        if (daoSession == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        }
        List list = daoSession.getMealItemDao()._queryMeal_MealItemList(id);
        this;
        JVM INSTR monitorenter ;
        if (mealItemList == null)
        {
            mealItemList = list;
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return mealItemList;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
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

    public void resetMealItemList()
    {
        this;
        JVM INSTR monitorenter ;
        mealItemList = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setEntityStatus(Integer integer)
    {
        entityStatus = integer;
    }

    public void setId(Long long1)
    {
        id = long1;
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
