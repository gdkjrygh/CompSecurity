// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import java.util.Date;

public class DietPlan
{

    private Integer caloriesDeficitPerDay;
    private Integer entityStatus;
    private Date estimateDate;
    private Long id;
    private Boolean personalized;
    private String planIntensity;
    private String weightObjective;
    private Double weightPerWeek;
    private String weightPerWeekUnits;

    public DietPlan()
    {
    }

    public DietPlan(Long long1)
    {
        id = long1;
    }

    public DietPlan(Long long1, String s, Double double1, Date date, Integer integer, String s1, String s2, 
            Integer integer1, Boolean boolean1)
    {
        id = long1;
        weightPerWeekUnits = s;
        weightPerWeek = double1;
        estimateDate = date;
        caloriesDeficitPerDay = integer;
        planIntensity = s1;
        weightObjective = s2;
        entityStatus = integer1;
        personalized = boolean1;
    }

    public Integer getCaloriesDeficitPerDay()
    {
        return caloriesDeficitPerDay;
    }

    public Integer getEntityStatus()
    {
        return entityStatus;
    }

    public Date getEstimateDate()
    {
        return estimateDate;
    }

    public Long getId()
    {
        return id;
    }

    public Boolean getPersonalized()
    {
        return personalized;
    }

    public String getPlanIntensity()
    {
        return planIntensity;
    }

    public String getWeightObjective()
    {
        return weightObjective;
    }

    public Double getWeightPerWeek()
    {
        return weightPerWeek;
    }

    public String getWeightPerWeekUnits()
    {
        return weightPerWeekUnits;
    }

    public void setCaloriesDeficitPerDay(Integer integer)
    {
        caloriesDeficitPerDay = integer;
    }

    public void setEntityStatus(Integer integer)
    {
        entityStatus = integer;
    }

    public void setEstimateDate(Date date)
    {
        estimateDate = date;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setPersonalized(Boolean boolean1)
    {
        personalized = boolean1;
    }

    public void setPlanIntensity(String s)
    {
        planIntensity = s;
    }

    public void setWeightObjective(String s)
    {
        weightObjective = s;
    }

    public void setWeightPerWeek(Double double1)
    {
        weightPerWeek = double1;
    }

    public void setWeightPerWeekUnits(String s)
    {
        weightPerWeekUnits = s;
    }
}
