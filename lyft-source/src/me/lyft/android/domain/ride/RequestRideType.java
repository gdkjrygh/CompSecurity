// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.domain.ride;

import java.util.Collections;
import java.util.List;
import me.lyft.android.common.Objects;

// Referenced classes of package me.lyft.android.domain.ride:
//            NullRequestRideType, RideType, Pricing

public class RequestRideType
{

    private Long closestDriverEta;
    private List drivers;
    private Boolean isDefault;
    private Pricing pricing;
    private RideType rideType;

    public RequestRideType(RideType ridetype, Pricing pricing1, Boolean boolean1, List list, Long long1)
    {
        rideType = ridetype;
        pricing = pricing1;
        isDefault = boolean1;
        drivers = list;
        closestDriverEta = long1;
    }

    public static RequestRideType empty()
    {
        return NullRequestRideType.getInstance();
    }

    public void clearDrivers()
    {
        drivers = Collections.emptyList();
    }

    public Long getClosestDriverEta()
    {
        return closestDriverEta;
    }

    public List getDrivers()
    {
        return (List)Objects.firstNonNull(drivers, Collections.emptyList());
    }

    public String getId()
    {
        return rideType.getType();
    }

    public Pricing getPricing()
    {
        return (Pricing)Objects.firstNonNull(pricing, Pricing.empty());
    }

    public RideType getRideType()
    {
        return rideType;
    }

    public boolean isCourier()
    {
        return rideType.isCourier();
    }

    public Boolean isDefault()
    {
        return isDefault;
    }

    public boolean isNull()
    {
        return false;
    }

    public boolean isStandard()
    {
        return rideType.isStandard();
    }
}
