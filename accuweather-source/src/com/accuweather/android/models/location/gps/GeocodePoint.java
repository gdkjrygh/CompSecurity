// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.location.gps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeocodePoint
{

    private Map additionalProperties;
    private String calculationMethod;
    private List coordinates;
    private String type;
    private List usageTypes;

    public GeocodePoint()
    {
        coordinates = new ArrayList();
        usageTypes = new ArrayList();
        additionalProperties = new HashMap();
    }

    public Map getAdditionalProperties()
    {
        return additionalProperties;
    }

    public String getCalculationMethod()
    {
        return calculationMethod;
    }

    public List getCoordinates()
    {
        return coordinates;
    }

    public String getType()
    {
        return type;
    }

    public List getUsageTypes()
    {
        return usageTypes;
    }

    public void setAdditionalProperty(String s, Object obj)
    {
        additionalProperties.put(s, obj);
    }

    public void setCalculationMethod(String s)
    {
        calculationMethod = s;
    }

    public void setCoordinates(List list)
    {
        coordinates = list;
    }

    public void setType(String s)
    {
        type = s;
    }

    public void setUsageTypes(List list)
    {
        usageTypes = list;
    }
}
