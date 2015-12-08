// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ride;

import java.util.List;
import me.lyft.android.infrastructure.lyft.profile.UserDTO;

// Referenced classes of package me.lyft.android.infrastructure.lyft.ride:
//            NullRouteDTO

public class RouteDTO
{

    public final String currentStopRideId;
    public final UserDTO driver;
    public final Float estimatedFareAmount;
    public final List passengers;
    public final List stops;

    public RouteDTO(UserDTO userdto, List list, String s, List list1, Float float1)
    {
        driver = userdto;
        passengers = list;
        currentStopRideId = s;
        stops = list1;
        estimatedFareAmount = float1;
    }

    public String getCurrentStopRideId()
    {
        return currentStopRideId;
    }

    public UserDTO getDriver()
    {
        return driver;
    }

    public List getPassengers()
    {
        return passengers;
    }

    public List getStops()
    {
        return stops;
    }

    public boolean isNull()
    {
        return equals(NullRouteDTO.getInstance());
    }
}
