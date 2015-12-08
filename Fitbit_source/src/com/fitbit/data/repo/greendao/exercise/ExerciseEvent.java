// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.exercise;

import java.util.Date;

public class ExerciseEvent
{

    private Float accuracy;
    private Double altitude;
    private Float bearing;
    private Integer entityStatus;
    private Long id;
    private String label;
    private Double latitude;
    private Double longitude;
    private Long serverId;
    private String sessionId;
    private Float speed;
    private Date time;
    private Date timeCreated;
    private Date timeUpdated;
    private String uuid;

    public ExerciseEvent()
    {
    }

    public ExerciseEvent(Long long1)
    {
        id = long1;
    }

    public ExerciseEvent(Long long1, Long long2, String s, Date date, Date date1, Integer integer, Date date2, 
            Double double1, Double double2, Float float1, Double double3, Float float2, Float float3, String s1, 
            String s2)
    {
        id = long1;
        serverId = long2;
        uuid = s;
        timeCreated = date;
        timeUpdated = date1;
        entityStatus = integer;
        time = date2;
        latitude = double1;
        longitude = double2;
        accuracy = float1;
        altitude = double3;
        bearing = float2;
        speed = float3;
        label = s1;
        sessionId = s2;
    }

    public Float getAccuracy()
    {
        return accuracy;
    }

    public Double getAltitude()
    {
        return altitude;
    }

    public Float getBearing()
    {
        return bearing;
    }

    public Integer getEntityStatus()
    {
        return entityStatus;
    }

    public Long getId()
    {
        return id;
    }

    public String getLabel()
    {
        return label;
    }

    public Double getLatitude()
    {
        return latitude;
    }

    public Double getLongitude()
    {
        return longitude;
    }

    public Long getServerId()
    {
        return serverId;
    }

    public String getSessionId()
    {
        return sessionId;
    }

    public Float getSpeed()
    {
        return speed;
    }

    public Date getTime()
    {
        return time;
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

    public void setAccuracy(Float float1)
    {
        accuracy = float1;
    }

    public void setAltitude(Double double1)
    {
        altitude = double1;
    }

    public void setBearing(Float float1)
    {
        bearing = float1;
    }

    public void setEntityStatus(Integer integer)
    {
        entityStatus = integer;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setLabel(String s)
    {
        label = s;
    }

    public void setLatitude(Double double1)
    {
        latitude = double1;
    }

    public void setLongitude(Double double1)
    {
        longitude = double1;
    }

    public void setServerId(Long long1)
    {
        serverId = long1;
    }

    public void setSessionId(String s)
    {
        sessionId = s;
    }

    public void setSpeed(Float float1)
    {
        speed = float1;
    }

    public void setTime(Date date)
    {
        time = date;
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
