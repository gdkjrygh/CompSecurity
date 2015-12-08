// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2;


// Referenced classes of package me.lyft.android.ui.passenger.v2:
//            PassengerRequestRideViewV2

class tep
{

    static final int $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RequestRideStep[];

    static 
    {
        $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RequestRideStep = new int[me.lyft.android.domain.ride.ideStep.values().length];
        try
        {
            $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RequestRideStep[me.lyft.android.domain.ride.ideStep.SET_PICKUP.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RequestRideStep[me.lyft.android.domain.ride.ideStep.SET_DROPOFF.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RequestRideStep[me.lyft.android.domain.ride.ideStep.CONFIRM_REQUEST.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RequestRideStep[me.lyft.android.domain.ride.ideStep.CONFIRM_REQUEST_WITH_DESTINATION.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
