// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.wearable.messages;

import me.lyft.android.domain.location.Location;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;

public class WearableLocation
{

    String address;
    Double latitude;
    Double longitude;
    String routableAddress;

    public WearableLocation()
    {
    }

    public static WearableLocation fromLyftLocation(Location location)
    {
        WearableLocation wearablelocation = new WearableLocation();
        wearablelocation.setLatitude(location.getLat());
        wearablelocation.setLongitude(location.getLng());
        wearablelocation.setAddress(location.getAddress());
        wearablelocation.setRoutableAddress(location.getRoutableAddress());
        return wearablelocation;
    }

    public String getAddress()
    {
        return address;
    }

    public Double getLatitude()
    {
        return latitude;
    }

    public Double getLongitude()
    {
        return longitude;
    }

    public String getRoutableAddress()
    {
        return routableAddress;
    }

    public void setAddress(String s)
    {
        address = s;
    }

    public void setLatitude(Double double1)
    {
        latitude = double1;
    }

    public void setLongitude(Double double1)
    {
        longitude = double1;
    }

    public void setRoutableAddress(String s)
    {
        routableAddress = s;
    }

    public LocationDTO toLyftLocation()
    {
        return new LocationDTO(latitude, longitude, address, null, routableAddress, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
