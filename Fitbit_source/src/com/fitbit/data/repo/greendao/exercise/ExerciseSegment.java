// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.exercise;

import java.util.Date;

public class ExerciseSegment
{

    private Long endEventId;
    private Integer entityStatus;
    private Long id;
    private Long serverId;
    private String sessionId;
    private Long startEventId;
    private Date startTime;
    private Date stopTime;
    private Date timeCreated;
    private Date timeUpdated;
    private String uuid;

    public ExerciseSegment()
    {
    }

    public ExerciseSegment(Long long1)
    {
        id = long1;
    }

    public ExerciseSegment(Long long1, Long long2, String s, Date date, Date date1, Integer integer, Date date2, 
            Date date3, String s1, Long long3, Long long4)
    {
        id = long1;
        serverId = long2;
        uuid = s;
        timeCreated = date;
        timeUpdated = date1;
        entityStatus = integer;
        startTime = date2;
        stopTime = date3;
        sessionId = s1;
        startEventId = long3;
        endEventId = long4;
    }

    public Long getEndEventId()
    {
        return endEventId;
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

    public String getSessionId()
    {
        return sessionId;
    }

    public Long getStartEventId()
    {
        return startEventId;
    }

    public Date getStartTime()
    {
        return startTime;
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

    public void setEndEventId(Long long1)
    {
        endEventId = long1;
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

    public void setSessionId(String s)
    {
        sessionId = s;
    }

    public void setStartEventId(Long long1)
    {
        startEventId = long1;
    }

    public void setStartTime(Date date)
    {
        startTime = date;
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
}
