// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.widgets;

import me.lyft.android.analytics.studies.RideAnalytics;
import me.lyft.android.application.ride.IPreRideInfoRepository;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.domain.ride.FareEstimate;
import me.lyft.android.domain.ride.PreRideInfo;
import me.lyft.android.ui.Presenter;
import me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter;
import rx.functions.Action1;

public class PriceEstimatePresenter extends Presenter
{

    final IPreRideInfoRepository preRideInfoRepository;
    final IRideRequestSession rideRequestSession;
    final PassengerRequestRideRouter router;

    public PriceEstimatePresenter(IPreRideInfoRepository iprerideinforepository, IRideRequestSession iriderequestsession, PassengerRequestRideRouter passengerrequestriderouter)
    {
        preRideInfoRepository = iprerideinforepository;
        rideRequestSession = iriderequestsession;
        router = passengerrequestriderouter;
    }

    protected void onAttach()
    {
        bind(preRideInfoRepository.observePreRideInfo(), new Action1() {

            final PriceEstimatePresenter this$0;

            public volatile void call(Object obj)
            {
                call((PreRideInfo)obj);
            }

            public void call(PreRideInfo prerideinfo)
            {
                prerideinfo = prerideinfo.getFareEstimate();
                if (prerideinfo.isNull())
                {
                    ((PriceEstimateView)getFareEstimate).showNeedsEstimate(true);
                    return;
                } else
                {
                    ((PriceEstimateView)getFareEstimate).showNeedsEstimate(false);
                    ((PriceEstimateView)getFareEstimate).setEstimate(prerideinfo.getHighMoney(), prerideinfo.getLowMoney());
                    return;
                }
            }

            
            {
                this$0 = PriceEstimatePresenter.this;
                super();
            }

            private class PriceEstimateView
                implements me.lyft.android.ui.Presenter.View
            {

                public abstract void setEstimate(Money money, Money money1);

                public abstract void showNeedsEstimate(boolean flag);
            }

        });
    }

    public void onPriceEstimateClick()
    {
        RideAnalytics.trackRequestPriceEstimate();
        router.showDropoffPlaceSearchAndReturnTo(me.lyft.android.domain.ride.PassengerRideRequest.RequestRideStep.CONFIRM_REQUEST_WITH_DESTINATION);
    }



}
