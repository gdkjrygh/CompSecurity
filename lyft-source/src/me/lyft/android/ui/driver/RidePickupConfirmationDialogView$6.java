// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.common.Objects;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.rx.ReactiveProperty;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            RidePickupConfirmationDialogView

class this._cls0
    implements Action1
{

    final RidePickupConfirmationDialogView this$0;

    public volatile void call(Object obj)
    {
        call((DriverRide)obj);
    }

    public void call(DriverRide driverride)
    {
        Stop stop = driverride.getCurrentStop();
        driverride = driverride.getCurrentPassenger();
        ReactiveProperty reactiveproperty = RidePickupConfirmationDialogView.access$200(RidePickupConfirmationDialogView.this);
        boolean flag;
        if (stop.isArrived() && Objects.equals(driverride.getId(), RidePickupConfirmationDialogView.access$100(RidePickupConfirmationDialogView.this).getId()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        reactiveproperty.onNext(Boolean.valueOf(flag));
    }

    ()
    {
        this$0 = RidePickupConfirmationDialogView.this;
        super();
    }
}
