// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.swap;

import java.util.Date;

public class SwapTimeSeriesObject
{

    private Date dateTime;
    private Integer entityStatus;
    private Long foreignId;
    private Long id;
    private Integer level;
    private Integer objectType;
    private Double value;

    public SwapTimeSeriesObject()
    {
    }

    public SwapTimeSeriesObject(Long long1)
    {
        id = long1;
    }

    public SwapTimeSeriesObject(Long long1, Date date, Double double1, Integer integer, Integer integer1, Integer integer2, Long long2)
    {
        id = long1;
        dateTime = date;
        value = double1;
        objectType = integer;
        entityStatus = integer1;
        level = integer2;
        foreignId = long2;
    }

    public Date getDateTime()
    {
        return dateTime;
    }

    public Integer getEntityStatus()
    {
        return entityStatus;
    }

    public Long getForeignId()
    {
        return foreignId;
    }

    public Long getId()
    {
        return id;
    }

    public Integer getLevel()
    {
        return level;
    }

    public Integer getObjectType()
    {
        return objectType;
    }

    public Double getValue()
    {
        return value;
    }

    public void setDateTime(Date date)
    {
        dateTime = date;
    }

    public void setEntityStatus(Integer integer)
    {
        entityStatus = integer;
    }

    public void setForeignId(Long long1)
    {
        foreignId = long1;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setLevel(Integer integer)
    {
        level = integer;
    }

    public void setObjectType(Integer integer)
    {
        objectType = integer;
    }

    public void setValue(Double double1)
    {
        value = double1;
    }
}
