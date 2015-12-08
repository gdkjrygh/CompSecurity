// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;


// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRequestRideView

class 
{

    static final int $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RideStep[];

    static 
    {
        $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RideStep = new int[me.lyft.android.domain.ride.p.values().length];
        try
        {
            $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RideStep[me.lyft.android.domain.ride.p.SET_PICKUP.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RideStep[me.lyft.android.domain.ride.p.SET_DROPOFF.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RideStep[me.lyft.android.domain.ride.p.CONFIRM_REQUEST.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
