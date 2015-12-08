// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.application.ride.IDriverRideProvider;
import me.lyft.android.common.Unit;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.rx.Binder;
import me.lyft.android.services.TimerManager;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideAcceptView

class this._cls0
    implements Action1
{

    final DriverRideAcceptView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        DriverRideAcceptView.access$1000(DriverRideAcceptView.this).unsubscribe();
        DriverRideAcceptView.access$1002(DriverRideAcceptView.this, DriverRideAcceptView.access$300(DriverRideAcceptView.this).bind(timerManager.getTimer("incoming_ride", routeProvider.getDriverRide().getCurrentRideId(), Long.valueOf(routeProvider.getDriverRide().getLapseTimerSeconds())).observeOn(AndroidSchedulers.mainThread()), DriverRideAcceptView.access$1100(DriverRideAcceptView.this)));
        DriverRideAcceptView.access$1200(DriverRideAcceptView.this);
    }

    der()
    {
        this$0 = DriverRideAcceptView.this;
        super();
    }
}
