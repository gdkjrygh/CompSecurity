// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.activity;

import java.util.Date;

public class MostRecentActivity
{

    private Integer calories;
    private Date date;
    private String description;
    private Double distance;
    private Integer duration;
    private Integer entityStatus;
    private String group;
    private Long id;
    private String name;
    private Long serverId;
    private Date timeCreated;
    private Date timeUpdated;
    private String uuid;

    public MostRecentActivity()
    {
    }

    public MostRecentActivity(Long long1)
    {
        id = long1;
    }

    public MostRecentActivity(Long long1, Long long2, String s, Date date1, Date date2, Integer integer, Integer integer1, 
            String s1, Double double1, Integer integer2, String s2, String s3, Date date3)
    {
        id = long1;
        serverId = long2;
        uuid = s;
        timeCreated = date1;
        timeUpdated = date2;
        entityStatus = integer;
        calories = integer1;
        description = s1;
        distance = double1;
        duration = integer2;
        name = s2;
        group = s3;
        date = date3;
    }

    public Integer getCalories()
    {
        return calories;
    }

    public Date getDate()
    {
        return date;
    }

    public String getDescription()
    {
        return description;
    }

    public Double getDistance()
    {
        return distance;
    }

    public Integer getDuration()
    {
        return duration;
    }

    public Integer getEntityStatus()
    {
        return entityStatus;
    }

    public String getGroup()
    {
        return group;
    }

    public Long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
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

    public String getUuid()
    {
        return uuid;
    }

    public void setCalories(Integer integer)
    {
        calories = integer;
    }

    public void setDate(Date date1)
    {
        date = date1;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setDistance(Double double1)
    {
        distance = double1;
    }

    public void setDuration(Integer integer)
    {
        duration = integer;
    }

    public void setEntityStatus(Integer integer)
    {
        entityStatus = integer;
    }

    public void setGroup(String s)
    {
        group = s;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setServerId(Long long1)
    {
        serverId = long1;
    }

    public void setTimeCreated(Date date1)
    {
        timeCreated = date1;
    }

    public void setTimeUpdated(Date date1)
    {
        timeUpdated = date1;
    }

    public void setUuid(String s)
    {
        uuid = s;
    }
}
