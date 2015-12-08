// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.domain.ride.Stop;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            AutoNavigationToastView

class this._cls0
    implements Action1
{

    final AutoNavigationToastView this$0;

    public volatile void call(Object obj)
    {
        call((DriverRide)obj);
    }

    public void call(DriverRide driverride)
    {
        boolean flag;
        if (Objects.equals(Boolean.valueOf(driverride.getCurrentStop().isPickup()), Boolean.valueOf(AutoNavigationToastView.access$000(AutoNavigationToastView.this).isPickup())) && Objects.equals(driverride.getCurrentStop().getPassenger().getId(), AutoNavigationToastView.access$000(AutoNavigationToastView.this).getPassenger().getId()) && Objects.equals(driverride.getCurrentStop().getRideId(), AutoNavigationToastView.access$000(AutoNavigationToastView.this).getRideId()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!driverride.isInProgress() || !flag)
        {
            dialogFlow.dismiss();
        }
    }

    _cls9()
    {
        this$0 = AutoNavigationToastView.this;
        super();
    }
}
