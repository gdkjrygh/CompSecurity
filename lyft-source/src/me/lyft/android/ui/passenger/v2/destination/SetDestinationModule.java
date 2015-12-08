// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.destination;

import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.ui.passenger.v2.PassengerRequestRidePresenterV2;
import me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter;
import me.lyft.android.ui.ride.RideMap;

// Referenced classes of package me.lyft.android.ui.passenger.v2.destination:
//            SetDestinationPresenter

public class SetDestinationModule
{

    public SetDestinationModule()
    {
    }

    SetDestinationPresenter provideSetDestinationPresenter(PassengerRequestRidePresenterV2 passengerrequestridepresenterv2, RideMap ridemap, ILocationService ilocationservice, IRideRequestSession iriderequestsession, IGeoService igeoservice, PassengerRequestRideRouter passengerrequestriderouter, PassengerRequestRidePresenterV2 passengerrequestridepresenterv2_1)
    {
        return new SetDestinationPresenter(passengerrequestridepresenterv2, ridemap, ilocationservice, iriderequestsession, igeoservice, passengerrequestriderouter, passengerrequestridepresenterv2_1);
    }
}
