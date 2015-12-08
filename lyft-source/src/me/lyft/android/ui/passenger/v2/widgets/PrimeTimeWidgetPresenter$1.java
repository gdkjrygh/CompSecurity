// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.widgets;

import java.util.List;
import me.lyft.android.application.ride.IRideRequestSession;
import me.lyft.android.domain.ride.Pricing;
import me.lyft.android.domain.ride.RequestRideType;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger.v2.widgets:
//            PrimeTimeWidgetPresenter

class this._cls0
    implements Action1
{

    final PrimeTimeWidgetPresenter this$0;

    public volatile void call(Object obj)
    {
        call((List)obj);
    }

    public void call(List list)
    {
        list = rideRequestSession.getCurrentRideType().getPricing().getDynamicPricing();
        ((imeTimeWidgetView)PrimeTimeWidgetPresenter.access$000(PrimeTimeWidgetPresenter.this)).setPrimeTimeAmount(list.intValue());
    }

    imeTimeWidgetView()
    {
        this$0 = PrimeTimeWidgetPresenter.this;
        super();
    }
}
