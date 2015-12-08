// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.heartrate;

import de.greenrobot.dao.DaoException;

// Referenced classes of package com.fitbit.data.repo.greendao.heartrate:
//            DaoSession, HeartRateZoneDao, HeartRateDailySummaryDao, HeartRateDailySummary

public class HeartRateZone
{

    private Double caloriesOut;
    private transient DaoSession daoSession;
    private Integer highValue;
    private Long id;
    private Integer lowValue;
    private transient HeartRateZoneDao myDao;
    private String name;
    private HeartRateDailySummary summary;
    private Long summaryId;
    private Long summary__resolvedKey;
    private Integer timeInZone;
    private String type;

    public HeartRateZone()
    {
    }

    public HeartRateZone(Long long1)
    {
        id = long1;
    }

    public HeartRateZone(Long long1, Integer integer, Integer integer1, String s, Integer integer2, String s1, Double double1, 
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
            daosession = daosession.getHeartRateZoneDao();
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

    public HeartRateDailySummary getSummary()
    {
        Long long1 = summaryId;
        if (summary__resolvedKey != null && summary__resolvedKey.equals(long1)) goto _L2; else goto _L1
_L1:
        if (daoSession == null)
        {
            throw new DaoException("Entity is detached from DAO context");
        }
        HeartRateDailySummary heartratedailysummary = (HeartRateDailySummary)daoSession.getHeartRateDailySummaryDao().load(long1);
        this;
        JVM INSTR monitorenter ;
        summary = heartratedailysummary;
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

    public void setSummary(HeartRateDailySummary heartratedailysummary)
    {
        this;
        JVM INSTR monitorenter ;
        summary = heartratedailysummary;
        if (heartratedailysummary != null) goto _L2; else goto _L1
_L1:
        heartratedailysummary = null;
_L4:
        summaryId = heartratedailysummary;
        summary__resolvedKey = summaryId;
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        heartratedailysummary = heartratedailysummary.getId();
        if (true) goto _L4; else goto _L3
_L3:
        heartratedailysummary;
        this;
        JVM INSTR monitorexit ;
        throw heartratedailysummary;
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
