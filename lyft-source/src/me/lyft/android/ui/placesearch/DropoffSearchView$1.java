// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.placesearch;


// Referenced classes of package me.lyft.android.ui.placesearch:
//            DropoffSearchView

class deStep
{

    static final int $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RequestRideStep[];
    static final int $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RideStep[];

    static 
    {
        $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RequestRideStep = new int[me.lyft.android.domain.ride..RequestRideStep.values().length];
        try
        {
            $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RequestRideStep[me.lyft.android.domain.ride..RequestRideStep.SET_DROPOFF.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RequestRideStep[me.lyft.android.domain.ride..RequestRideStep.CONFIRM_REQUEST.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RideStep = new int[me.lyft.android.domain.ride..RideStep.values().length];
        try
        {
            $SwitchMap$me$lyft$android$domain$ride$PassengerRideRequest$RideStep[me.lyft.android.domain.ride..RideStep.SET_DROPOFF.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
