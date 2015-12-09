// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mobiletrack;

import java.util.Date;

public class PedometerMinuteData
{

    private Integer entityStatus;
    private Long id;
    private double metsCount;
    private Integer minuteType;
    private Long serverId;
    private int stepsCount;
    private Date timeCreated;
    private Date timeUpdated;
    private long timestamp;
    private String uuid;

    public PedometerMinuteData()
    {
    }

    public PedometerMinuteData(Long long1)
    {
        id = long1;
    }

    public PedometerMinuteData(Long long1, Long long2, String s, Date date, Date date1, Integer integer, long l, int i, double d, Integer integer1)
    {
        id = long1;
        serverId = long2;
        uuid = s;
        timeCreated = date;
        timeUpdated = date1;
        entityStatus = integer;
        timestamp = l;
        stepsCount = i;
        metsCount = d;
        minuteType = integer1;
    }

    public Integer getEntityStatus()
    {
        return entityStatus;
    }

    public Long getId()
    {
        return id;
    }

    public double getMetsCount()
    {
        return metsCount;
    }

    public Integer getMinuteType()
    {
        return minuteType;
    }

    public Long getServerId()
    {
        return serverId;
    }

    public int getStepsCount()
    {
        return stepsCount;
    }

    public Date getTimeCreated()
    {
        return timeCreated;
    }

    public Date getTimeUpdated()
    {
        return timeUpdated;
    }

    public long getTimestamp()
    {
        return timestamp;
    }

    public String getUuid()
    {
        return uuid;
    }

    public void setEntityStatus(Integer integer)
    {
        entityStatus = integer;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setMetsCount(double d)
    {
        metsCount = d;
    }

    public void setMinuteType(Integer integer)
    {
        minuteType = integer;
    }

    public void setServerId(Long long1)
    {
        serverId = long1;
    }

    public void setStepsCount(int i)
    {
        stepsCount = i;
    }

    public void setTimeCreated(Date date)
    {
        timeCreated = date;
    }

    public void setTimeUpdated(Date date)
    {
        timeUpdated = date;
    }

    public void setTimestamp(long l)
    {
        timestamp = l;
    }

    public void setUuid(String s)
    {
        uuid = s;
    }
}
