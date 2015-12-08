// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.widgets;

import java.util.List;
import me.lyft.android.application.ride.IRequestRideTypeProvider;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.domain.ride.Pricing;
import me.lyft.android.domain.ride.RequestRideType;
import me.lyft.android.ui.Presenter;
import rx.functions.Action1;

public class PrimeTimeWidgetPresenter extends Presenter
{

    private final Action1 onRideTypesChange = new Action1() {

        final PrimeTimeWidgetPresenter this$0;

        public volatile void call(Object obj)
        {
            call((List)obj);
        }

        public void call(List list)
        {
            list = rideRequestSession.getCurrentRideType().getPricing().getDynamicPricing();
            ((PrimeTimeWidgetView)getCurrentRideType).setPrimeTimeAmount(list.intValue());
        }

            
            {
                this$0 = PrimeTimeWidgetPresenter.this;
                super();
            }

        private class PrimeTimeWidgetView
            implements me.lyft.android.ui.Presenter.View
        {

            public abstract void setPrimeTimeAmount(int i);
        }

    };
    final IRequestRideTypeProvider requestRideTypeProvider;
    final IRideRequestSession rideRequestSession;

    public PrimeTimeWidgetPresenter(IRideRequestSession iriderequestsession, IRequestRideTypeProvider irequestridetypeprovider)
    {
        rideRequestSession = iriderequestsession;
        requestRideTypeProvider = irequestridetypeprovider;
    }

    protected void onAttach()
    {
        bind(requestRideTypeProvider.observeRideTypes(), onRideTypesChange);
    }

}
