// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.exercise;

import java.util.Date;

public class Split
{

    private Double altitude;
    private Double distance;
    private Integer entityStatus;
    private Long id;
    private Double latitude;
    private Double longitude;
    private Double mets;
    private Long serverId;
    private String sessionId;
    private Long startEventId;
    private Long time;
    private Date timeCreated;
    private Long timeRange;
    private Date timeUpdated;
    private String uuid;

    public Split()
    {
    }

    public Split(Long long1)
    {
        id = long1;
    }

    public Split(Long long1, Long long2, String s, Date date, Date date1, Integer integer, Long long3, 
            Double double1, Double double2, Double double3, Double double4, Long long4, Double double5, String s1, 
            Long long5)
    {
        id = long1;
        serverId = long2;
        uuid = s;
        timeCreated = date;
        timeUpdated = date1;
        entityStatus = integer;
        time = long3;
        latitude = double1;
        longitude = double2;
        distance = double3;
        altitude = double4;
        timeRange = long4;
        mets = double5;
        sessionId = s1;
        startEventId = long5;
    }

    public Double getAltitude()
    {
        return altitude;
    }

    public Double getDistance()
    {
        return distance;
    }

    public Integer getEntityStatus()
    {
        return entityStatus;
    }

    public Long getId()
    {
        return id;
    }

    public Double getLatitude()
    {
        return latitude;
    }

    public Double getLongitude()
    {
        return longitude;
    }

    public Double getMets()
    {
        return mets;
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

    public Long getTime()
    {
        return time;
    }

    public Date getTimeCreated()
    {
        return timeCreated;
    }

    public Long getTimeRange()
    {
        return timeRange;
    }

    public Date getTimeUpdated()
    {
        return timeUpdated;
    }

    public String getUuid()
    {
        return uuid;
    }

    public void setAltitude(Double double1)
    {
        altitude = double1;
    }

    public void setDistance(Double double1)
    {
        distance = double1;
    }

    public void setEntityStatus(Integer integer)
    {
        entityStatus = integer;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setLatitude(Double double1)
    {
        latitude = double1;
    }

    public void setLongitude(Double double1)
    {
        longitude = double1;
    }

    public void setMets(Double double1)
    {
        mets = double1;
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

    public void setTime(Long long1)
    {
        time = long1;
    }

    public void setTimeCreated(Date date)
    {
        timeCreated = date;
    }

    public void setTimeRange(Long long1)
    {
        timeRange = long1;
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
