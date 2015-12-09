// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.swap;

import de.greenrobot.dao.DaoException;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.swap:
//            DaoSession, SwapHeartRateExerciseSummaryDao, SwapHeartRateZoneDao

public class SwapHeartRateExerciseSummary
{

    private Integer averageHeartRate;
    private List customZones;
    private transient DaoSession daoSession;
    private Date dateTime;
    private Long id;
    private transient SwapHeartRateExerciseSummaryDao myDao;
    private Integer restingHeartRate;
    private List zones;

    public SwapHeartRateExerciseSummary()
    {
    }

    public SwapHeartRateExerciseSummary(Long long1)
    {
        id = long1;
    }

    public SwapHeartRateExerciseSummary(Long long1, Date date, Integer integer, Integer integer1)
    {
        id = long1;
        dateTime = date;
        averageHeartRate = integer;
        restingHeartRate = integer1;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        daoSession = daosession;
        if (daosession != null)
        {
            daosession = daosession.getSwapHeartRateExerciseSummaryDao();
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

    public Integer getAverageHeartRate()
    {
        return averageHeartRate;
    }

    public List getCustomZones()
    {
        if (customZones != null) goto _L2; else goto _L1
_L1:
        if (daoSession == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        }
        List list = daoSession.getSwapHeartRateZoneDao()._querySwapHeartRateExerciseSummary_CustomZones(id);
        this;
        JVM INSTR monitorenter ;
        if (customZones == null)
        {
            customZones = list;
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return customZones;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Date getDateTime()
    {
        return dateTime;
    }

    public Long getId()
    {
        return id;
    }

    public Integer getRestingHeartRate()
    {
        return restingHeartRate;
    }

    public List getZones()
    {
        if (zones != null) goto _L2; else goto _L1
_L1:
        if (daoSession == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        }
        List list = daoSession.getSwapHeartRateZoneDao()._querySwapHeartRateExerciseSummary_Zones(id);
        this;
        JVM INSTR monitorenter ;
        if (zones == null)
        {
            zones = list;
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return zones;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
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

    public void resetCustomZones()
    {
        this;
        JVM INSTR monitorenter ;
        customZones = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void resetZones()
    {
        this;
        JVM INSTR monitorenter ;
        zones = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setAverageHeartRate(Integer integer)
    {
        averageHeartRate = integer;
    }

    public void setDateTime(Date date)
    {
        dateTime = date;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setRestingHeartRate(Integer integer)
    {
        restingHeartRate = integer;
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
