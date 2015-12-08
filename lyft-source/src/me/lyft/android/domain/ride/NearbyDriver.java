// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import java.util.List;
import me.lyft.android.domain.location.Location;

public class NearbyDriver
{

    private String id;
    private Location location;
    private List recentLocations;

    public NearbyDriver()
    {
    }

    public String getId()
    {
        return id;
    }

    public Location getLocation()
    {
        return location;
    }

    public List getRecentLocations()
    {
        return recentLocations;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLocation(Location location1)
    {
        location = location1;
    }

    public void setRecentLocations(List list)
    {
        recentLocations = list;
    }
}
