// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.geo;

import java.util.List;

public class CachedDirections
{

    private final String id;
    private final List legs;
    private final List route;
    private final long timestamp;

    public CachedDirections(long l, String s, List list, List list1)
    {
        timestamp = l;
        id = s;
        route = list;
        legs = list1;
    }

    public String getId()
    {
        return id;
    }

    public List getLegs()
    {
        return legs;
    }

    public List getRoute()
    {
        return route;
    }

    public long getTimestamp()
    {
        return timestamp;
    }
}
