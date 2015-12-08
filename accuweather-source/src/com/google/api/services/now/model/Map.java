// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

// Referenced classes of package com.google.api.services.now.model:
//            Location

public final class Map extends GenericJson
{

    private Location location;
    private Boolean showRoute;
    private Boolean showUserLocation;

    public Map()
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

    public Map clone()
    {
        return (Map)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public Location getLocation()
    {
        return location;
    }

    public Boolean getShowRoute()
    {
        return showRoute;
    }

    public Boolean getShowUserLocation()
    {
        return showUserLocation;
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public Map set(String s, Object obj)
    {
        return (Map)super.set(s, obj);
    }

    public Map setLocation(Location location1)
    {
        location = location1;
        return this;
    }

    public Map setShowRoute(Boolean boolean1)
    {
        showRoute = boolean1;
        return this;
    }

    public Map setShowUserLocation(Boolean boolean1)
    {
        showUserLocation = boolean1;
        return this;
    }
}
