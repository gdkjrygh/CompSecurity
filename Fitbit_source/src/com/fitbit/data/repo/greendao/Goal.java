// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import java.util.Date;

public class Goal
{

    private Date dueDate;
    private Integer entityStatus;
    private String frequency;
    private String goalJson;
    private String goalType;
    private Long id;
    private Boolean isActive;
    private Double result;
    private String resultMeasurement;
    private Long serverId;
    private Double start;
    private Date startDate;
    private String startMeasurement;
    private Integer status;
    private Double target;
    private String targetMeasurement;
    private Date targetTimeUpdated;
    private Date timeCreated;
    private Date timeUpdated;
    private String uuid;

    public Goal()
    {
    }

    public Goal(Long long1)
    {
        id = long1;
    }

    public Goal(Long long1, Long long2, String s, Date date, Date date1, Integer integer, Integer integer1, 
            String s1, Double double1, String s2, Double double2, String s3, Double double3, String s4, 
            String s5, Date date2, Date date3, Boolean boolean1, Date date4, String s6)
    {
        id = long1;
        serverId = long2;
        uuid = s;
        timeCreated = date;
        timeUpdated = date1;
        entityStatus = integer;
        status = integer1;
        targetMeasurement = s1;
        target = double1;
        resultMeasurement = s2;
        result = double2;
        startMeasurement = s3;
        start = double3;
        goalJson = s4;
        frequency = s5;
        startDate = date2;
        dueDate = date3;
        isActive = boolean1;
        targetTimeUpdated = date4;
        goalType = s6;
    }

    public Date getDueDate()
    {
        return dueDate;
    }

    public Integer getEntityStatus()
    {
        return entityStatus;
    }

    public String getFrequency()
    {
        return frequency;
    }

    public String getGoalJson()
    {
        return goalJson;
    }

    public String getGoalType()
    {
        return goalType;
    }

    public Long getId()
    {
        return id;
    }

    public Boolean getIsActive()
    {
        return isActive;
    }

    public Double getResult()
    {
        return result;
    }

    public String getResultMeasurement()
    {
        return resultMeasurement;
    }

    public Long getServerId()
    {
        return serverId;
    }

    public Double getStart()
    {
        return start;
    }

    public Date getStartDate()
    {
        return startDate;
    }

    public String getStartMeasurement()
    {
        return startMeasurement;
    }

    public Integer getStatus()
    {
        return status;
    }

    public Double getTarget()
    {
        return target;
    }

    public String getTargetMeasurement()
    {
        return targetMeasurement;
    }

    public Date getTargetTimeUpdated()
    {
        return targetTimeUpdated;
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

    public void setDueDate(Date date)
    {
        dueDate = date;
    }

    public void setEntityStatus(Integer integer)
    {
        entityStatus = integer;
    }

    public void setFrequency(String s)
    {
        frequency = s;
    }

    public void setGoalJson(String s)
    {
        goalJson = s;
    }

    public void setGoalType(String s)
    {
        goalType = s;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setIsActive(Boolean boolean1)
    {
        isActive = boolean1;
    }

    public void setResult(Double double1)
    {
        result = double1;
    }

    public void setResultMeasurement(String s)
    {
        resultMeasurement = s;
    }

    public void setServerId(Long long1)
    {
        serverId = long1;
    }

    public void setStart(Double double1)
    {
        start = double1;
    }

    public void setStartDate(Date date)
    {
        startDate = date;
    }

    public void setStartMeasurement(String s)
    {
        startMeasurement = s;
    }

    public void setStatus(Integer integer)
    {
        status = integer;
    }

    public void setTarget(Double double1)
    {
        target = double1;
    }

    public void setTargetMeasurement(String s)
    {
        targetMeasurement = s;
    }

    public void setTargetTimeUpdated(Date date)
    {
        targetTimeUpdated = date;
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
