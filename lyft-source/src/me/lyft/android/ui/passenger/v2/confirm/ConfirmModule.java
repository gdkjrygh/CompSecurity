// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.confirm;

import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.application.ride.IRideRequestService;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.infrastructure.location.ILocationService;
import me.lyft.android.infrastructure.locationsettings.ILocationSettingsService;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.ui.passenger.v2.PassengerRequestRidePresenterV2;
import me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter;
import me.lyft.android.ui.ride.RideMap;

// Referenced classes of package me.lyft.android.ui.passenger.v2.confirm:
//            RequestRideButtonPresenter, ConfirmPresenter

public class ConfirmModule
{

    public ConfirmModule()
    {
    }

    RequestRideButtonPresenter provideRequestRideButtonController(IRideRequestService iriderequestservice, IProgressController iprogresscontroller, IViewErrorHandler iviewerrorhandler, IChargeAccountsProvider ichargeaccountsprovider, ILocationSettingsService ilocationsettingsservice, RideMap ridemap, MessageBus messagebus, 
            PassengerRequestRideRouter passengerrequestriderouter, PassengerRequestRidePresenterV2 passengerrequestridepresenterv2, IRideRequestSession iriderequestsession)
    {
        return new RequestRideButtonPresenter(iriderequestservice, iprogresscontroller, iviewerrorhandler, ichargeaccountsprovider, ilocationsettingsservice, ridemap, messagebus, passengerrequestriderouter, passengerrequestridepresenterv2, iriderequestsession);
    }

    ConfirmPresenter provideSetDestinationController(PassengerRequestRidePresenterV2 passengerrequestridepresenterv2, RideMap ridemap, ILocationService ilocationservice, IRideRequestSession iriderequestsession, IGeoService igeoservice, PassengerRequestRideRouter passengerrequestriderouter, IConstantsProvider iconstantsprovider)
    {
        return new ConfirmPresenter(passengerrequestridepresenterv2, ridemap, ilocationservice, iriderequestsession, igeoservice, passengerrequestriderouter, iconstantsprovider);
    }
}
