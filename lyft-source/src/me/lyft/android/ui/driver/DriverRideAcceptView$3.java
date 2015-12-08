// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.RideStatus;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideAcceptView

class this._cls0
    implements Action1
{

    final DriverRideAcceptView this$0;

    public volatile void call(Object obj)
    {
        call((DriverRide)obj);
    }

    public void call(DriverRide driverride)
    {
        if (driverride.getStatus().isLapsed())
        {
            DriverRideAcceptView.access$800(DriverRideAcceptView.this);
            return;
        } else
        {
            DriverRideAcceptView.access$100(DriverRideAcceptView.this);
            return;
        }
    }

    ()
    {
        this$0 = DriverRideAcceptView.this;
        super();
    }
}
