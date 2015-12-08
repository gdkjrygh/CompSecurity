// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.widgets;

import me.lyft.android.application.IUserProvider;
import me.lyft.android.application.payment.IChargeAccountsProvider;
import me.lyft.android.application.ride.IPreRideInfoRepository;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.ui.passenger.v2.PassengerRequestRidePresenterV2;
import me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter;

// Referenced classes of package me.lyft.android.ui.passenger.v2.widgets:
//            PriceEstimatePresenter, FixedFareWidgetPresenter, PaymentWidgetPresenter, PrimeTimeWidgetPresenter, 
//            WidgetContainerPresenter

public class WidgetModule
{

    public WidgetModule()
    {
    }

    PriceEstimatePresenter provideFareEstimatePresenter(IPreRideInfoRepository iprerideinforepository, IRideRequestSession iriderequestsession, PassengerRequestRideRouter passengerrequestriderouter)
    {
        return new PriceEstimatePresenter(iprerideinforepository, iriderequestsession, passengerrequestriderouter);
    }

    FixedFareWidgetPresenter provideFixedFareWidgetPresenter(IPreRideInfoRepository iprerideinforepository, IRideRequestSession iriderequestsession, PassengerRequestRidePresenterV2 passengerrequestridepresenterv2, PassengerRequestRideRouter passengerrequestriderouter)
    {
        return new FixedFareWidgetPresenter(iprerideinforepository, iriderequestsession, passengerrequestridepresenterv2, passengerrequestriderouter);
    }

    PaymentWidgetPresenter providePaymentWidgetPresenter(IChargeAccountsProvider ichargeaccountsprovider, IUserProvider iuserprovider, PassengerRequestRideRouter passengerrequestriderouter)
    {
        return new PaymentWidgetPresenter(ichargeaccountsprovider, iuserprovider, passengerrequestriderouter);
    }

    PrimeTimeWidgetPresenter providePrimeTimeWidgetPresenter(IRideRequestSession iriderequestsession, IRequestRideTypeProvider irequestridetypeprovider)
    {
        return new PrimeTimeWidgetPresenter(iriderequestsession, irequestridetypeprovider);
    }

    WidgetContainerPresenter provideWidgetContainerPresenter(IRideRequestSession iriderequestsession, IRequestRideTypeProvider irequestridetypeprovider, IPreRideInfoRepository iprerideinforepository)
    {
        return new WidgetContainerPresenter(iriderequestsession, irequestridetypeprovider, iprerideinforepository);
    }
}
