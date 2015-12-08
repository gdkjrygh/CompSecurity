// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.rx.ReactiveProperty;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideRatingAndEarningsView

class this._cls0 extends AsyncCall
{

    final DriverRideRatingAndEarningsView this$0;

    public void onFail(Throwable throwable)
    {
        viewErrorHandler.handle(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        if (routeProvider.getDriverRide().isCourier())
        {
            DriverRideRatingAndEarningsView.access$400(DriverRideRatingAndEarningsView.this).onNext(DriverRideRatingAndEarningsView.access$300(DriverRideRatingAndEarningsView.this).getId());
        }
    }

    public void onUnsubscribe()
    {
        progressController.enableUI();
    }

    A()
    {
        this$0 = DriverRideRatingAndEarningsView.this;
        super();
    }
}
