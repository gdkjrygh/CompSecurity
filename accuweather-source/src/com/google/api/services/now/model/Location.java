// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

public final class Location extends GenericJson
{

    private Double latitude;
    private Double longitude;
    private String name;
    private Integer radiusMeters;

    public Location()
    {
    }

    public volatile GenericJson clone()
    {
        return clone();
    }

    public volatile GenericData clone()
    {
        return clone();
    }

    public Location clone()
    {
        return (Location)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public Double getLatitude()
    {
        return latitude;
    }

    public Double getLongitude()
    {
        return longitude;
    }

    public String getName()
    {
        return name;
    }

    public Integer getRadiusMeters()
    {
        return radiusMeters;
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public Location set(String s, Object obj)
    {
        return (Location)super.set(s, obj);
    }

    public Location setLatitude(Double double1)
    {
        latitude = double1;
        return this;
    }

    public Location setLongitude(Double double1)
    {
        longitude = double1;
        return this;
    }

    public Location setName(String s)
    {
        name = s;
        return this;
    }

    public Location setRadiusMeters(Integer integer)
    {
        radiusMeters = integer;
        return this;
    }
}
