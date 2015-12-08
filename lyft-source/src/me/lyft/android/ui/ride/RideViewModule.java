// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ride;

import me.lyft.android.application.passenger.IPassengerRideProvider;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.ui.passenger.PassengerActiveRideZoomingController;

// Referenced classes of package me.lyft.android.ui.ride:
//            RideMap

public class RideViewModule
{

    public RideViewModule()
    {
    }

    PassengerActiveRideZoomingController providePassengerClassicRideZoomingController(ILocationService ilocationservice, IPassengerRideProvider ipassengerrideprovider, RideMap ridemap)
    {
        return new PassengerActiveRideZoomingController(ilocationservice, ipassengerrideprovider, ridemap);
    }
}
