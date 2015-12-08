// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.location.gps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResourceSet
{

    private Map additionalProperties;
    private Integer estimatedTotal;
    private List resources;

    public ResourceSet()
    {
        resources = new ArrayList();
        additionalProperties = new HashMap();
    }

    public Map getAdditionalProperties()
    {
        return additionalProperties;
    }

    public Integer getEstimatedTotal()
    {
        return estimatedTotal;
    }

    public List getResources()
    {
        return resources;
    }

    public void setAdditionalProperty(String s, Object obj)
    {
        additionalProperties.put(s, obj);
    }

    public void setEstimatedTotal(Integer integer)
    {
        estimatedTotal = integer;
    }

    public void setResources(List list)
    {
        resources = list;
    }
}
