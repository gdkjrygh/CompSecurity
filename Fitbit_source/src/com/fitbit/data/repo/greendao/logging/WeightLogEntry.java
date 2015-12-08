// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.logging;

import java.util.Date;

public class WeightLogEntry
{

    private Double bmi;
    private Integer entityStatus;
    private Long id;
    private Date logDate;
    private Long serverId;
    private Date timeCreated;
    private Date timeUpdated;
    private String trackerType;
    private String uuid;
    private Double value;

    public WeightLogEntry()
    {
    }

    public WeightLogEntry(Long long1)
    {
        id = long1;
    }

    public WeightLogEntry(Long long1, Long long2, String s, Date date, Date date1, Integer integer, Double double1, 
            String s1, Date date2, Double double2)
    {
        id = long1;
        serverId = long2;
        uuid = s;
        timeCreated = date;
        timeUpdated = date1;
        entityStatus = integer;
        value = double1;
        trackerType = s1;
        logDate = date2;
        bmi = double2;
    }

    public Double getBmi()
    {
        return bmi;
    }

    public Integer getEntityStatus()
    {
        return entityStatus;
    }

    public Long getId()
    {
        return id;
    }

    public Date getLogDate()
    {
        return logDate;
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

    public String getTrackerType()
    {
        return trackerType;
    }

    public String getUuid()
    {
        return uuid;
    }

    public Double getValue()
    {
        return value;
    }

    public void setBmi(Double double1)
    {
        bmi = double1;
    }

    public void setEntityStatus(Integer integer)
    {
        entityStatus = integer;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setLogDate(Date date)
    {
        logDate = date;
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

    public void setTrackerType(String s)
    {
        trackerType = s;
    }

    public void setUuid(String s)
    {
        uuid = s;
    }

    public void setValue(Double double1)
    {
        value = double1;
    }
}
