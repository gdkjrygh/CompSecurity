// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.placesearch;

import java.util.List;
import me.lyft.android.domain.location.Location;

public class PlaceSearchResultItemDTO
{

    public final double lat;
    public final double lng;
    public final String placeId;
    public final String placeName;
    public final String routableAddress;
    public final List types;

    public PlaceSearchResultItemDTO(double d, double d1, String s, String s1, String s2, 
            List list)
    {
        lat = d;
        lng = d1;
        routableAddress = s;
        placeName = s1;
        placeId = s2;
        types = list;
    }

    public Location toDomainLocation()
    {
        Location location = new Location(lat, lng);
        location.setPlaceName(placeName);
        location.setRoutableAddress(routableAddress);
        location.setPlaceId(placeId);
        return location;
    }
}
