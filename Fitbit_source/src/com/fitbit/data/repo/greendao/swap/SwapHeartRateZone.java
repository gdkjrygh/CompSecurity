// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.swap;

import de.greenrobot.dao.DaoException;

// Referenced classes of package com.fitbit.data.repo.greendao.swap:
//            DaoSession, SwapHeartRateZoneDao, SwapHeartRateExerciseSummaryDao, SwapHeartRateExerciseSummary

public class SwapHeartRateZone
{

    private Double caloriesOut;
    private transient DaoSession daoSession;
    private Integer highValue;
    private Long id;
    private Integer lowValue;
    private transient SwapHeartRateZoneDao myDao;
    private String name;
    private SwapHeartRateExerciseSummary summary;
    private Long summaryId;
    private Long summary__resolvedKey;
    private Integer timeInZone;
    private String type;

    public SwapHeartRateZone()
    {
    }

    public SwapHeartRateZone(Long long1)
    {
        id = long1;
    }

    public SwapHeartRateZone(Long long1, Integer integer, Integer integer1, String s, Integer integer2, String s1, Double double1, 
            Long long2)
    {
        id = long1;
        highValue = integer;
        lowValue = integer1;
        name = s;
        timeInZone = integer2;
        type = s1;
        caloriesOut = double1;
        summaryId = long2;
    }

    public void __setDaoSession(DaoSession daosession)
    {
        daoSession = daosession;
        if (daosession != null)
        {
            daosession = daosession.getSwapHeartRateZoneDao();
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

    public Double getCaloriesOut()
    {
        return caloriesOut;
    }

    public Integer getHighValue()
    {
        return highValue;
    }

    public Long getId()
    {
        return id;
    }

    public Integer getLowValue()
    {
        return lowValue;
    }

    public String getName()
    {
        return name;
    }

    public SwapHeartRateExerciseSummary getSummary()
    {
        Long long1 = summaryId;
        if (summary__resolvedKey != null && summary__resolvedKey.equals(long1)) goto _L2; else goto _L1
_L1:
        if (daoSession == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        }
        SwapHeartRateExerciseSummary swapheartrateexercisesummary = (SwapHeartRateExerciseSummary)daoSession.getSwapHeartRateExerciseSummaryDao().load(long1);
        this;
        JVM INSTR monitorenter ;
        summary = swapheartrateexercisesummary;
        summary__resolvedKey = long1;
        this;
        JVM INSTR monitorexit ;
_L2:
        return summary;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public Long getSummaryId()
    {
        return summaryId;
    }

    public Integer getTimeInZone()
    {
        return timeInZone;
    }

    public String getType()
    {
        return type;
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

    public void setCaloriesOut(Double double1)
    {
        caloriesOut = double1;
    }

    public void setHighValue(Integer integer)
    {
        highValue = integer;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setLowValue(Integer integer)
    {
        lowValue = integer;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setSummary(SwapHeartRateExerciseSummary swapheartrateexercisesummary)
    {
        this;
        JVM INSTR monitorenter ;
        summary = swapheartrateexercisesummary;
        if (swapheartrateexercisesummary != null) goto _L2; else goto _L1
_L1:
        swapheartrateexercisesummary = null;
_L4:
        summaryId = swapheartrateexercisesummary;
        summary__resolvedKey = summaryId;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        swapheartrateexercisesummary = swapheartrateexercisesummary.getId();
        if (true) goto _L4; else goto _L3
_L3:
        swapheartrateexercisesummary;
        this;
        JVM INSTR monitorexit ;
        throw swapheartrateexercisesummary;
    }

    public void setSummaryId(Long long1)
    {
        summaryId = long1;
    }

    public void setTimeInZone(Integer integer)
    {
        timeInZone = integer;
    }

    public void setType(String s)
    {
        type = s;
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
