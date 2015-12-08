// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.logging;

import java.util.Date;

public class SleepLogEntry
{

    private Integer awakeCount;
    private Integer awakeningsCount;
    private Integer duration;
    private Double efficiency;
    private Integer entityStatus;
    private Long id;
    private Boolean isMainSleep;
    private Date logDate;
    private Integer minutesAfterWakeup;
    private Integer minutesAsleep;
    private Integer minutesAwake;
    private Integer minutesToFallAsleep;
    private Integer restlessCount;
    private Long serverId;
    private Date startTime;
    private Date timeCreated;
    private Integer timeInBed;
    private Date timeUpdated;
    private String trackerType;
    private String uuid;
    private Double value;

    public SleepLogEntry()
    {
    }

    public SleepLogEntry(Long long1)
    {
        id = long1;
    }

    public SleepLogEntry(Long long1, Long long2, String s, Date date, Date date1, Integer integer, Double double1, 
            String s1, Date date2, Boolean boolean1, Double double2, Date date3, Integer integer1, Integer integer2, 
            Integer integer3, Integer integer4, Integer integer5, Integer integer6, Integer integer7, Integer integer8, Integer integer9)
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
        isMainSleep = boolean1;
        efficiency = double2;
        startTime = date3;
        duration = integer1;
        minutesToFallAsleep = integer2;
        minutesAsleep = integer3;
        minutesAwake = integer4;
        minutesAfterWakeup = integer5;
        awakeningsCount = integer6;
        timeInBed = integer7;
        awakeCount = integer8;
        restlessCount = integer9;
    }

    public Integer getAwakeCount()
    {
        return awakeCount;
    }

    public Integer getAwakeningsCount()
    {
        return awakeningsCount;
    }

    public Integer getDuration()
    {
        return duration;
    }

    public Double getEfficiency()
    {
        return efficiency;
    }

    public Integer getEntityStatus()
    {
        return entityStatus;
    }

    public Long getId()
    {
        return id;
    }

    public Boolean getIsMainSleep()
    {
        return isMainSleep;
    }

    public Date getLogDate()
    {
        return logDate;
    }

    public Integer getMinutesAfterWakeup()
    {
        return minutesAfterWakeup;
    }

    public Integer getMinutesAsleep()
    {
        return minutesAsleep;
    }

    public Integer getMinutesAwake()
    {
        return minutesAwake;
    }

    public Integer getMinutesToFallAsleep()
    {
        return minutesToFallAsleep;
    }

    public Integer getRestlessCount()
    {
        return restlessCount;
    }

    public Long getServerId()
    {
        return serverId;
    }

    public Date getStartTime()
    {
        return startTime;
    }

    public Date getTimeCreated()
    {
        return timeCreated;
    }

    public Integer getTimeInBed()
    {
        return timeInBed;
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

    public void setAwakeCount(Integer integer)
    {
        awakeCount = integer;
    }

    public void setAwakeningsCount(Integer integer)
    {
        awakeningsCount = integer;
    }

    public void setDuration(Integer integer)
    {
        duration = integer;
    }

    public void setEfficiency(Double double1)
    {
        efficiency = double1;
    }

    public void setEntityStatus(Integer integer)
    {
        entityStatus = integer;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setIsMainSleep(Boolean boolean1)
    {
        isMainSleep = boolean1;
    }

    public void setLogDate(Date date)
    {
        logDate = date;
    }

    public void setMinutesAfterWakeup(Integer integer)
    {
        minutesAfterWakeup = integer;
    }

    public void setMinutesAsleep(Integer integer)
    {
        minutesAsleep = integer;
    }

    public void setMinutesAwake(Integer integer)
    {
        minutesAwake = integer;
    }

    public void setMinutesToFallAsleep(Integer integer)
    {
        minutesToFallAsleep = integer;
    }

    public void setRestlessCount(Integer integer)
    {
        restlessCount = integer;
    }

    public void setServerId(Long long1)
    {
        serverId = long1;
    }

    public void setStartTime(Date date)
    {
        startTime = date;
    }

    public void setTimeCreated(Date date)
    {
        timeCreated = date;
    }

    public void setTimeInBed(Integer integer)
    {
        timeInBed = integer;
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
