// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.util;

import com.digby.localpoint.sdk.core.ILPGeopoint;
import com.digby.localpoint.sdk.core.ILPID;
import com.digby.localpoint.sdk.core.ILPLocation;
import com.digby.mm.android.library.geofence.IGeoFence;
import com.digby.mm.android.library.geoshape.IGeoShape;
import com.digby.mm.android.library.geoshape.impl.CircularGeoShape;
import java.util.Set;

public class LPGeoFence
    implements IGeoFence
{

    private String BSSID;
    private String SSID;
    private String description;
    private long id;
    private String locationCode;
    private String name;
    private CircularGeoShape shape;
    private Set tags;

    public LPGeoFence(ILPLocation ilplocation)
    {
        id = Long.parseLong(ilplocation.getID().getValue());
        BSSID = ilplocation.getBSSID();
        SSID = ilplocation.getSSID();
        name = ilplocation.getName();
        description = ilplocation.getDescription();
        locationCode = ilplocation.getCode();
        tags = ilplocation.getTags();
        shape = new CircularGeoShape(ilplocation.getCenter().getLatitude(), ilplocation.getCenter().getLongitude(), 0.0F);
    }

    public String getBSSID()
    {
        return BSSID;
    }

    public String getDescription()
    {
        return description;
    }

    public IGeoShape getGeoShape()
    {
        return shape;
    }

    public long getID()
    {
        return id;
    }

    public String getLocationCode()
    {
        return locationCode;
    }

    public String getName()
    {
        return name;
    }

    public String getSSID()
    {
        return SSID;
    }

    public Set getTags()
    {
        return tags;
    }

    public boolean isValidEventType(Class class1)
    {
        return false;
    }
}
