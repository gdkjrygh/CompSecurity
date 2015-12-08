// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.polling;

import java.util.List;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;

public class LocationUpdateRequestDTO
{

    public final String appInfoRevision;
    public final String clientRideId;
    public final LocationDTO destinationMarker;
    public final List locations;
    public final LocationDTO marker;
    public final String rideTypeId;

    public LocationUpdateRequestDTO(LocationDTO locationdto, LocationDTO locationdto1, List list, String s, String s1, String s2)
    {
        marker = locationdto;
        destinationMarker = locationdto1;
        locations = list;
        clientRideId = s;
        appInfoRevision = s1;
        rideTypeId = s2;
    }
}
