// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productentity;

import java.io.Serializable;
import java.util.List;

public class VDataOptionEntity
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String description;
    private String displayText;
    private String id;
    private String inputType;
    private double maxRange;
    private double maxValue;
    private double minRange;
    private double minValue;
    private String name;
    private String title;
    private String type;
    private List vDataOptionValues;

    public VDataOptionEntity()
    {
    }

    public String getDescription()
    {
        return description;
    }

    public String getDisplayText()
    {
        return displayText;
    }

    public String getId()
    {
        return id;
    }

    public String getInputType()
    {
        return inputType;
    }

    public double getMaxRange()
    {
        return maxRange;
    }

    public double getMaxValue()
    {
        return maxValue;
    }

    public double getMinRange()
    {
        return minRange;
    }

    public double getMinValue()
    {
        return minValue;
    }

    public String getName()
    {
        return name;
    }

    public String getTitle()
    {
        return title;
    }

    public String getType()
    {
        return type;
    }

    public List getvDataOptionValues()
    {
        return vDataOptionValues;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setDisplayText(String s)
    {
        displayText = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setInputType(String s)
    {
        inputType = s;
    }

    public void setMaxRange(double d)
    {
        maxRange = d;
    }

    public void setMaxValue(double d)
    {
        maxValue = d;
    }

    public void setMinRange(double d)
    {
        minRange = d;
    }

    public void setMinValue(double d)
    {
        minValue = d;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void setType(String s)
    {
        type = s;
    }

    public void setvDataOptionValues(List list)
    {
        vDataOptionValues = list;
    }
}
