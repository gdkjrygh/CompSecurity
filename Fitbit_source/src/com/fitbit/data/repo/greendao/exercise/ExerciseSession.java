// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.exercise;

import java.util.Date;

public class ExerciseSession
{

    private long activityType;
    private Integer cueIndex;
    private Integer entityStatus;
    private Long id;
    private Long serverId;
    private Date startTime;
    private String status;
    private Date stopTime;
    private Date timeCreated;
    private Date timeUpdated;
    private String uuid;
    private String wireId;

    public ExerciseSession()
    {
    }

    public ExerciseSession(Long long1)
    {
        id = long1;
    }

    public ExerciseSession(Long long1, Long long2, String s, Date date, Date date1, Integer integer, String s1, 
            Date date2, Date date3, Integer integer1, long l, String s2)
    {
        id = long1;
        serverId = long2;
        uuid = s;
        timeCreated = date;
        timeUpdated = date1;
        entityStatus = integer;
        status = s1;
        startTime = date2;
        stopTime = date3;
        cueIndex = integer1;
        activityType = l;
        wireId = s2;
    }

    public long getActivityType()
    {
        return activityType;
    }

    public Integer getCueIndex()
    {
        return cueIndex;
    }

    public Integer getEntityStatus()
    {
        return entityStatus;
    }

    public Long getId()
    {
        return id;
    }

    public Long getServerId()
    {
        return serverId;
    }

    public Date getStartTime()
    {
        return startTime;
    }

    public String getStatus()
    {
        return status;
    }

    public Date getStopTime()
    {
        return stopTime;
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

    public String getWireId()
    {
        return wireId;
    }

    public void setActivityType(long l)
    {
        activityType = l;
    }

    public void setCueIndex(Integer integer)
    {
        cueIndex = integer;
    }

    public void setEntityStatus(Integer integer)
    {
        entityStatus = integer;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setServerId(Long long1)
    {
        serverId = long1;
    }

    public void setStartTime(Date date)
    {
        startTime = date;
    }

    public void setStatus(String s)
    {
        status = s;
    }

    public void setStopTime(Date date)
    {
        stopTime = date;
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

    public void setWireId(String s)
    {
        wireId = s;
    }
}
