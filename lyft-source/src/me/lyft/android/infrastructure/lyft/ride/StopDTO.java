// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ride;

import me.lyft.android.infrastructure.lyft.location.LocationDTO;

public class StopDTO
{

    public final Boolean completed;
    public final Boolean inGeoFence;
    public final Boolean isInHotspot;
    public final LocationDTO location;
    public final String passengerId;
    public final String rideId;
    public final String stopType;

    public StopDTO(Boolean boolean1, LocationDTO locationdto, String s, String s1, String s2, Boolean boolean2, Boolean boolean3)
    {
        completed = boolean1;
        location = locationdto;
        passengerId = s;
        rideId = s1;
        stopType = s2;
        isInHotspot = boolean2;
        inGeoFence = boolean3;
    }

    public Boolean getCompleted()
    {
        return completed;
    }

    public Boolean getInGeoFence()
    {
        return inGeoFence;
    }

    public Boolean getIsInHotspot()
    {
        return isInHotspot;
    }

    public LocationDTO getLocation()
    {
        return location;
    }

    public String getPassengerId()
    {
        return passengerId;
    }

    public String getRideId()
    {
        return rideId;
    }

    public String getStopType()
    {
        return stopType;
    }
}
