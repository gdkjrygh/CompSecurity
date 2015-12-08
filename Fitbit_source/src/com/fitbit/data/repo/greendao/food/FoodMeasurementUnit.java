// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.food;

import java.util.Date;

public class FoodMeasurementUnit
{

    private Integer entityStatus;
    private Integer foodMeasurementUnitTypeBitmap;
    private Long id;
    private String name;
    private String pluralForm;
    private Long serverId;
    private Date timeCreated;
    private Date timeUpdated;
    private String uuid;

    public FoodMeasurementUnit()
    {
    }

    public FoodMeasurementUnit(Long long1)
    {
        id = long1;
    }

    public FoodMeasurementUnit(Long long1, Long long2, String s, Date date, Date date1, Integer integer, String s1, 
            String s2, Integer integer1)
    {
        id = long1;
        serverId = long2;
        uuid = s;
        timeCreated = date;
        timeUpdated = date1;
        entityStatus = integer;
        name = s1;
        pluralForm = s2;
        foodMeasurementUnitTypeBitmap = integer1;
    }

    public Integer getEntityStatus()
    {
        return entityStatus;
    }

    public Integer getFoodMeasurementUnitTypeBitmap()
    {
        return foodMeasurementUnitTypeBitmap;
    }

    public Long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getPluralForm()
    {
        return pluralForm;
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

    public void setEntityStatus(Integer integer)
    {
        entityStatus = integer;
    }

    public void setFoodMeasurementUnitTypeBitmap(Integer integer)
    {
        foodMeasurementUnitTypeBitmap = integer;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setPluralForm(String s)
    {
        pluralForm = s;
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

    public void setUuid(String s)
    {
        uuid = s;
    }
}
