// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.food;


public class LightServing
{

    private Long foodId;
    private Long id;
    private Boolean isDefault;
    private Double multiplier;
    private String unitName;
    private String unitNamePlural;

    public LightServing()
    {
    }

    public LightServing(Long long1)
    {
        id = long1;
    }

    public LightServing(Long long1, Boolean boolean1, Double double1, String s, String s1, Long long2)
    {
        id = long1;
        isDefault = boolean1;
        multiplier = double1;
        unitName = s;
        unitNamePlural = s1;
        foodId = long2;
    }

    public Long getFoodId()
    {
        return foodId;
    }

    public Long getId()
    {
        return id;
    }

    public Boolean getIsDefault()
    {
        return isDefault;
    }

    public Double getMultiplier()
    {
        return multiplier;
    }

    public String getUnitName()
    {
        return unitName;
    }

    public String getUnitNamePlural()
    {
        return unitNamePlural;
    }

    public void setFoodId(Long long1)
    {
        foodId = long1;
    }

    public void setId(Long long1)
    {
        id = long1;
    }

    public void setIsDefault(Boolean boolean1)
    {
        isDefault = boolean1;
    }

    public void setMultiplier(Double double1)
    {
        multiplier = double1;
    }

    public void setUnitName(String s)
    {
        unitName = s;
    }

    public void setUnitNamePlural(String s)
    {
        unitNamePlural = s;
    }
}
