// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.activity;

import de.greenrobot.dao.DaoException;

// Referenced classes of package com.fitbit.data.repo.greendao.activity:
//            DaoSession, ActivityLevelDao, ActivityItemDao, ActivityItem

public class ActivityLevel
{

    private ActivityItem activityItem;
    private Long activityItemId;
    private Long activityItem__resolvedKey;
    private transient DaoSession daoSession;
    private Long id;
    private Double maxSpeedMPH;
    private Double mets;
    private Double minSpeedMPH;
    private transient ActivityLevelDao myDao;
    private String name;
    private Long serverId;

    public ActivityLevel()
    {
    }

    public ActivityLevel(Long long1)
    {
        id = long1;
    }

    public ActivityLevel(Long long1, Long long2, Double double1, Double double2, Double double3, String s, Long long3)
    {
        id = long1;
        serverId = long2;
        maxSpeedMPH = double1;
        minSpeedMPH = double2;
        mets = double3;
        name = s;
        activityItemId = long3;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        daoSession = daosession;
        if (daosession != null)
        {
            daosession = daosession.getActivityLevelDao();
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

    public ActivityItem getActivityItem()
    {
        Long long1 = activityItemId;
        if (activityItem__resolvedKey != null && activityItem__resolvedKey.equals(long1)) goto _L2; else goto _L1
_L1:
        if (daoSession == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        }
        ActivityItem activityitem = (ActivityItem)daoSession.getActivityItemDao().load(long1);
        this;
        JVM INSTR monitorenter ;
        activityItem = activityitem;
        activityItem__resolvedKey = long1;
        this;
        JVM INSTR monitorexit ;
_L2:
        return activityItem;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Long getActivityItemId()
    {
        return activityItemId;
    }

    public Long getId()
    {
        return id;
    }

    public Double getMaxSpeedMPH()
    {
        return maxSpeedMPH;
    }

    public Double getMets()
    {
        return mets;
    }

    public Double getMinSpeedMPH()
    {
        return minSpeedMPH;
    }

    public String getName()
    {
        return name;
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

    public void setActivityItem(ActivityItem activityitem)
    {
        this;
        JVM INSTR monitorenter ;
        activityItem = activityitem;
        if (activityitem != null) goto _L2; else goto _L1
_L1:
        activityitem = null;
_L4:
        activityItemId = activityitem;
        activityItem__resolvedKey = activityItemId;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        activityitem = activityitem.getId();
        if (true) goto _L4; else goto _L3
_L3:
        activityitem;
        this;
        JVM INSTR monitorexit ;
        throw activityitem;
    }

    public void setActivityItemId(Long long1)
    {
        activityItemId = long1;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setMaxSpeedMPH(Double double1)
    {
        maxSpeedMPH = double1;
    }

    public void setMets(Double double1)
    {
        mets = double1;
    }

    public void setMinSpeedMPH(Double double1)
    {
        minSpeedMPH = double1;
    }

    public void setName(String s)
    {
        name = s;
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
