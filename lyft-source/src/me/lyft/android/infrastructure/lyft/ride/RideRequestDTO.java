// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ride;

import me.lyft.android.infrastructure.lyft.location.LocationDTO;

public class RideRequestDTO
{

    public final String chargeToken;
    public final LocationDTO dropoffLocation;
    public final Integer dynamicPricing;
    public final Object fare;
    public final String fixedFareToken;
    public final Integer partySize;
    public final LocationDTO pickupLocation;
    public final Integer pickupOffsetMinutes;
    public final String rideTypeId;

    public RideRequestDTO(LocationDTO locationdto, LocationDTO locationdto1, Integer integer, Object obj, String s, String s1, Integer integer1, 
            String s2, Integer integer2)
    {
        pickupLocation = locationdto;
        dropoffLocation = locationdto1;
        partySize = integer;
        fare = obj;
        fixedFareToken = s;
        rideTypeId = s1;
        dynamicPricing = integer1;
        chargeToken = s2;
        pickupOffsetMinutes = integer2;
    }
}
