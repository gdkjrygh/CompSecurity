// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2;

import android.content.res.Resources;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.geo.IGeoService;
import me.lyft.android.application.polling.ILocationUpdateService;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.application.system.ILyftSystemRepository;
import me.lyft.android.common.AppFlow;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.errorhandling.IDefaultErrorHandler;
import me.lyft.android.facades.UserModeSwitchFacade;
import me.lyft.android.infrastructure.appboy.IAppboyService;
import me.lyft.android.infrastructure.notifications.InAppNotificationService;
import me.lyft.android.infrastructure.splitfare.ISplitFareRequestRepository;
import me.lyft.android.rx.MessageBus;
import me.lyft.android.ui.SlideMenuController;
import me.lyft.android.ui.landing.LandingFlow;
import me.lyft.android.ui.ride.RideMap;

// Referenced classes of package me.lyft.android.ui.passenger.v2:
//            PassengerRequestRidePresenterV2, PassengerRequestRideRouter, PickupETAPresenter

public class PassengerModuleV2
{

    public PassengerModuleV2()
    {
    }

    PassengerRequestRidePresenterV2 providePassengerRequestRidePresenterV2(SlideMenuController slidemenucontroller, IRideRequestSession iriderequestsession, RideMap ridemap, ILocationUpdateService ilocationupdateservice, IDefaultErrorHandler idefaulterrorhandler, IRequestRideTypeProvider irequestridetypeprovider, ISplitFareRequestRepository isplitfarerequestrepository, 
            IUserProvider iuserprovider, ILyftPreferences ilyftpreferences, IAppboyService iappboyservice, InAppNotificationService inappnotificationservice, UserModeSwitchFacade usermodeswitchfacade, PassengerRequestRideRouter passengerrequestriderouter)
    {
        return new PassengerRequestRidePresenterV2(slidemenucontroller, iriderequestsession, ridemap, ilocationupdateservice, idefaulterrorhandler, irequestridetypeprovider, isplitfarerequestrepository, iuserprovider, ilyftpreferences, iappboyservice, inappnotificationservice, usermodeswitchfacade, passengerrequestriderouter);
    }

    PassengerRequestRideRouter providePassengerRequestRideRouter(AppFlow appflow, DialogFlow dialogflow, LandingFlow landingflow, Resources resources)
    {
        return new PassengerRequestRideRouter(appflow, dialogflow, landingflow, resources);
    }

    PickupETAPresenter providePickupETAController(MessageBus messagebus, IGeoService igeoservice, ILyftSystemRepository ilyftsystemrepository, IRideRequestSession iriderequestsession)
    {
        return new PickupETAPresenter(messagebus, igeoservice, ilyftsystemrepository, iriderequestsession);
    }
}
