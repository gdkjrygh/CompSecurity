// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.rx.ReactiveProperty;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverCourierPickupView

class this._cls0
    implements Action1
{

    final DriverCourierPickupView this$0;

    public volatile void call(Object obj)
    {
        call((DriverRide)obj);
    }

    public void call(DriverRide driverride)
    {
        DriverCourierPickupView.access$002(DriverCourierPickupView.this, driverride.getCurrentPassenger());
        DriverCourierPickupView.access$1000(DriverCourierPickupView.this).onNext(DriverCourierPickupView.access$000(DriverCourierPickupView.this).getPhotoUrl());
        DriverCourierPickupView.access$1100(DriverCourierPickupView.this).onNext(Integer.valueOf(DriverCourierPickupView.access$000(DriverCourierPickupView.this).getPartySize()));
    }

    _cls9()
    {
        this$0 = DriverCourierPickupView.this;
        super();
    }
}
