// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.pickup;

import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.facades.UserModeSwitchFacade;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.ui.passenger.v2.PassengerRequestRidePresenterV2;
import me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter;
import me.lyft.android.ui.ride.RideMap;

// Referenced classes of package me.lyft.android.ui.passenger.v2.pickup:
//            RideTypeSwitcherPresenter, SetPickupPresenter

public class SetPickupModule
{

    public SetPickupModule()
    {
    }

    RideTypeSwitcherPresenter provideRideTypeSwitcherPresenter(IRideRequestSession iriderequestsession, IRequestRideTypeProvider irequestridetypeprovider, IConstantsProvider iconstantsprovider, PassengerRequestRidePresenterV2 passengerrequestridepresenterv2, ILyftPreferences ilyftpreferences, PassengerRequestRideRouter passengerrequestriderouter)
    {
        return new RideTypeSwitcherPresenter(iriderequestsession, irequestridetypeprovider, iconstantsprovider, passengerrequestridepresenterv2, ilyftpreferences, passengerrequestriderouter);
    }

    SetPickupPresenter provideSetPickupPresenter(ILocationService ilocationservice, IRideRequestSession iriderequestsession, IGeoService igeoservice, IRequestRideTypeProvider irequestridetypeprovider, IConstantsProvider iconstantsprovider, RideMap ridemap, IUserProvider iuserprovider, 
            UserModeSwitchFacade usermodeswitchfacade, PassengerRequestRidePresenterV2 passengerrequestridepresenterv2, PassengerRequestRideRouter passengerrequestriderouter)
    {
        return new SetPickupPresenter(ilocationservice, iriderequestsession, igeoservice, irequestridetypeprovider, iconstantsprovider, ridemap, iuserprovider, usermodeswitchfacade, passengerrequestridepresenterv2, passengerrequestriderouter);
    }
}
