// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;


// Referenced classes of package me.lyft.android.ui.placesearch:
//            PlaceSearchScreens

public abstract class rideStep extends PlaceSearchScreens
{

    private final me.lyft.android.domain.ride.en.rideStep rideStep;

    public me.lyft.android.domain.ride.en getNextRequestRideStep()
    {
        return rideStep;
    }

    public (me.lyft.android.domain.ride.en en)
    {
        rideStep = en;
    }
}
