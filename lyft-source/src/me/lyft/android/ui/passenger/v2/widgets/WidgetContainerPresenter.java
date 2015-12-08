// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.widgets;

import java.util.List;
import me.lyft.android.application.ride.IPreRideInfoRepository;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.ride.FixedFare;
import me.lyft.android.domain.ride.PreRideInfo;
import me.lyft.android.domain.ride.Pricing;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.features.FeatureFlag;
import me.lyft.android.features.Features;
import me.lyft.android.ui.Presenter;
import rx.functions.Action1;

public class WidgetContainerPresenter extends Presenter
{

    final IPreRideInfoRepository preRideInfoRepository;
    final IRequestRideTypeProvider requestRideTypeProvider;
    final IRideRequestSession rideRequestSession;

    public WidgetContainerPresenter(IRideRequestSession iriderequestsession, IRequestRideTypeProvider irequestridetypeprovider, IPreRideInfoRepository iprerideinforepository)
    {
        rideRequestSession = iriderequestsession;
        requestRideTypeProvider = irequestridetypeprovider;
        preRideInfoRepository = iprerideinforepository;
    }

    private void updateFixedFareWidgetState(RequestRideType requestridetype, PreRideInfo prerideinfo)
    {
        boolean flag = true;
        prerideinfo = FixedFare.findFareByPartySize(prerideinfo.getFares(), 1);
        boolean flag1 = requestridetype.isCourier();
        requestridetype = (WidgetContainerView)view;
        if (prerideinfo.isNull() || !flag1)
        {
            flag = false;
        }
        requestridetype.showFixedFareWidget(flag);
    }

    private void updatePaymentWidgetState()
    {
        ((WidgetContainerView)view).showPaymentWidget(true);
    }

    private void updatePrimeTimeWidgetState(RequestRideType requestridetype)
    {
        int i = requestridetype.getPricing().getDynamicPricing().intValue();
        requestridetype = (WidgetContainerView)view;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        requestridetype.showPrimeTimeWidget(flag);
    }

    private void updateWidgetStates(PreRideInfo prerideinfo, RequestRideType requestridetype)
    {
        String s = prerideinfo.getErrorMessage();
        if (!prerideinfo.getRouteIsValid() && !Strings.isNullOrBlank(s))
        {
            ((WidgetContainerView)view).showErrorMessage(s);
            ((WidgetContainerView)view).showErrorWidget(true);
            ((WidgetContainerView)view).showPrimeTimeWidget(false);
            ((WidgetContainerView)view).showPriceEstimateWidget(false);
            ((WidgetContainerView)view).showPaymentWidget(false);
            ((WidgetContainerView)view).showFixedFareWidget(false);
            return;
        } else
        {
            ((WidgetContainerView)view).showErrorWidget(false);
            updatePriceEstimateWidgetState(requestridetype);
            updateFixedFareWidgetState(requestridetype, prerideinfo);
            updatePaymentWidgetState();
            updatePrimeTimeWidgetState(requestridetype);
            return;
        }
    }

    protected void onAttach()
    {
        RequestRideType requestridetype = rideRequestSession.getCurrentRideType();
        updatePriceEstimateWidgetState(requestridetype);
        updateFixedFareWidgetState(requestridetype, preRideInfoRepository.getPreRideInfo());
        updatePaymentWidgetState();
        updatePrimeTimeWidgetState(requestridetype);
        bind(preRideInfoRepository.observePreRideInfo(), new Action1() {

            final WidgetContainerPresenter this$0;

            public volatile void call(Object obj)
            {
                call((PreRideInfo)obj);
            }

            public void call(PreRideInfo prerideinfo)
            {
                RequestRideType requestridetype1 = rideRequestSession.getCurrentRideType();
                updateWidgetStates(prerideinfo, requestridetype1);
            }

            
            {
                this$0 = WidgetContainerPresenter.this;
                super();
            }
        });
        bind(requestRideTypeProvider.observeRideTypes(), new Action1() {

            final WidgetContainerPresenter this$0;

            public volatile void call(Object obj)
            {
                call((List)obj);
            }

            public void call(List list)
            {
                list = preRideInfoRepository.getPreRideInfo();
                RequestRideType requestridetype1 = rideRequestSession.getCurrentRideType();
                updateWidgetStates(list, requestridetype1);
            }

            
            {
                this$0 = WidgetContainerPresenter.this;
                super();
            }
        });
    }

    void updatePriceEstimateWidgetState(RequestRideType requestridetype)
    {
        WidgetContainerView widgetcontainerview = (WidgetContainerView)view;
        boolean flag;
        if (Features.PRICE_ESTIMATE_WIDGET.isEnabled() && !requestridetype.isCourier())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        widgetcontainerview.showPriceEstimateWidget(flag);
    }


    private class WidgetContainerView
        implements me.lyft.android.ui.Presenter.View
    {

        public abstract void showErrorMessage(String s);

        public abstract void showErrorWidget(boolean flag);

        public abstract void showFixedFareWidget(boolean flag);

        public abstract void showPaymentWidget(boolean flag);

        public abstract void showPriceEstimateWidget(boolean flag);

        public abstract void showPrimeTimeWidget(boolean flag);
    }

}
