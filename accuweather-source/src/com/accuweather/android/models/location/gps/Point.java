// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.location.gps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Point
{

    private Map additionalProperties;
    private List coordinates;
    private String type;

    public Point()
    {
        coordinates = new ArrayList();
        additionalProperties = new HashMap();
    }

    public Map getAdditionalProperties()
    {
        return additionalProperties;
    }

    public List getCoordinates()
    {
        return coordinates;
    }

    public String getType()
    {
        return type;
    }

    public void setAdditionalProperty(String s, Object obj)
    {
        additionalProperties.put(s, obj);
    }

    public void setCoordinates(List list)
    {
        coordinates = list;
    }

    public void setType(String s)
    {
        type = s;
    }
}
