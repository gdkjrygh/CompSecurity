// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ride;

import java.util.List;
import me.lyft.android.infrastructure.lyft.location.LocationDTO;

public class NearbyDriverDTO
{

    public final String id;
    public final LocationDTO location;
    public final List recentLocations;

    public NearbyDriverDTO(String s, LocationDTO locationdto, List list)
    {
        id = s;
        location = locationdto;
        recentLocations = list;
    }

    public String toString()
    {
        return (new StringBuilder()).append("NearbyDriverDTO{id='").append(id).append('\'').append(", location=").append(location).append(", recentLocations=").append(recentLocations).append('}').toString();
    }
}
