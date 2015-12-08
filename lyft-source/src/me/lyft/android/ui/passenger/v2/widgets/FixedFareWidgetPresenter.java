// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.widgets;

import me.lyft.android.application.ride.IPreRideInfoRepository;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.payment.NullMoney;
import me.lyft.android.domain.ride.FixedFare;
import me.lyft.android.domain.ride.PreRideInfo;
import me.lyft.android.ui.Presenter;
import me.lyft.android.ui.passenger.v2.PassengerRequestRidePresenterV2;
import me.lyft.android.ui.passenger.v2.PassengerRequestRideRouter;
import rx.functions.Action1;

public class FixedFareWidgetPresenter extends Presenter
{

    static final int WIDGET_PAYMENT_PARTY_SIZE = 1;
    private final Action1 onLocationUpdateStateChange = new Action1() ;
    final PassengerRequestRidePresenterV2 passengerRequestRidePresenter;
    final IPreRideInfoRepository preRideInfoRepository;
    final IRideRequestSession rideRequestSession;
    final PassengerRequestRideRouter router;

    public FixedFareWidgetPresenter(IPreRideInfoRepository iprerideinforepository, IRideRequestSession iriderequestsession, PassengerRequestRidePresenterV2 passengerrequestridepresenterv2, PassengerRequestRideRouter passengerrequestriderouter)
    {
        preRideInfoRepository = iprerideinforepository;
        rideRequestSession = iriderequestsession;
        passengerRequestRidePresenter = passengerrequestridepresenterv2;
        router = passengerrequestriderouter;
    }

    protected void onAttach()
    {
        bind(passengerRequestRidePresenter.observeLocationUpdateServiceState(), onLocationUpdateStateChange);
        bind(preRideInfoRepository.observePreRideInfo(), new Action1() {

            final FixedFareWidgetPresenter this$0;

            public volatile void call(Object obj)
            {
                call((PreRideInfo)obj);
            }

            public void call(PreRideInfo prerideinfo)
            {
                Object obj = FixedFare.findFareByPartySize(prerideinfo.getFares(), 1);
                ((FixedFareView)getTotalMoney).setFarePrice(((FixedFare) (obj)).getTotalMoney());
                prerideinfo = ((FixedFare) (obj)).getComparisonMoney();
                obj = ((FixedFare) (obj)).getComparisonText();
                if (NullMoney.isNull(prerideinfo) || Strings.isNullOrEmpty(((String) (obj))))
                {
                    ((FixedFareView)getTotalMoney).showComparisonLabel(false);
                    return;
                } else
                {
                    ((FixedFareView)getTotalMoney).setComparisonLabel(prerideinfo, ((String) (obj)));
                    ((FixedFareView)getTotalMoney).showComparisonLabel(true);
                    return;
                }
            }

            
            {
                this$0 = FixedFareWidgetPresenter.this;
                super();
            }

            private class FixedFareView
                implements me.lyft.android.ui.Presenter.View
            {

                public abstract void setComparisonLabel(Money money, String s);

                public abstract void setFarePrice(Money money);

                public abstract void setLoading(boolean flag);

                public abstract void showComparisonLabel(boolean flag);
            }

        });
    }

    void onFixedFareWidgetClick()
    {
        FixedFare fixedfare = FixedFare.findFareByPartySize(preRideInfoRepository.getPreRideInfo().getFares(), 1);
        router.showCourierRideTypeInfoDialog(fixedfare);
    }





}
