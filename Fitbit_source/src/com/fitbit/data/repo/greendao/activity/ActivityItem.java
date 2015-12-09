// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.activity;

import de.greenrobot.dao.DaoException;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.activity:
//            DaoSession, ActivityItemDao, ActivityLevelDao

public class ActivityItem
{

    private String accessLevel;
    private List activityLevelList;
    private transient DaoSession daoSession;
    private Boolean hasSpeed;
    private Long id;
    private Double mets;
    private transient ActivityItemDao myDao;
    private String name;
    private Boolean populated;
    private Long serverId;

    public ActivityItem()
    {
    }

    public ActivityItem(Long long1)
    {
        id = long1;
    }

    public ActivityItem(Long long1, Long long2, String s, Boolean boolean1, String s1, Double double1, Boolean boolean2)
    {
        id = long1;
        serverId = long2;
        accessLevel = s;
        hasSpeed = boolean1;
        name = s1;
        mets = double1;
        populated = boolean2;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        daoSession = daosession;
        if (daosession != null)
        {
            daosession = daosession.getActivityItemDao();
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

    public String getAccessLevel()
    {
        return accessLevel;
    }

    public List getActivityLevelList()
    {
        if (activityLevelList != null) goto _L2; else goto _L1
_L1:
        if (daoSession == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        }
        List list = daoSession.getActivityLevelDao()._queryActivityItem_ActivityLevelList(id);
        this;
        JVM INSTR monitorenter ;
        if (activityLevelList == null)
        {
            activityLevelList = list;
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return activityLevelList;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Boolean getHasSpeed()
    {
        return hasSpeed;
    }

    public Long getId()
    {
        return id;
    }

    public Double getMets()
    {
        return mets;
    }

    public String getName()
    {
        return name;
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

    public void resetActivityLevelList()
    {
        this;
        JVM INSTR monitorenter ;
        activityLevelList = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setAccessLevel(String s)
    {
        accessLevel = s;
    }

    public void setHasSpeed(Boolean boolean1)
    {
        hasSpeed = boolean1;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setMets(Double double1)
    {
        mets = double1;
    }

    public void setName(String s)
    {
        name = s;
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
