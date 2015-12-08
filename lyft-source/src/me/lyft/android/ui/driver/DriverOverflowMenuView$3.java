// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.application.ride.IDestinySession;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.features.FeatureFlag;
import me.lyft.android.features.Features;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverOverflowMenuView

class this._cls0
    implements Action1
{

    final DriverOverflowMenuView this$0;

    public volatile void call(Object obj)
    {
        call((DriverRide)obj);
    }

    public void call(DriverRide driverride)
    {
        boolean flag3 = true;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag4;
        if (driverride.isPending() || driverride.isInProgress())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        DriverOverflowMenuView.access$100(DriverOverflowMenuView.this, 0x7f0d0016, flag1);
        if (!driverride.getCurrentStop().isNull())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag4 = driverride.isCourier();
        driverride = DriverOverflowMenuView.this;
        if (flag1 && flag)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        DriverOverflowMenuView.access$100(driverride, 0x7f0d0002, flag2);
        driverride = DriverOverflowMenuView.this;
        if (flag1 && flag4 && flag)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        DriverOverflowMenuView.access$100(driverride, 0x7f0d0023, flag2);
        driverride = DriverOverflowMenuView.this;
        if (flag1 && flag4)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        DriverOverflowMenuView.access$100(driverride, 0x7f0d0000, flag2);
        driverride = DriverOverflowMenuView.this;
        if (flag1 && flag)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        DriverOverflowMenuView.access$100(driverride, 0x7f0d0003, flag2);
        driverride = DriverOverflowMenuView.this;
        if (!flag1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        DriverOverflowMenuView.access$100(driverride, 0x7f0d0010, flag2);
        driverride = DriverOverflowMenuView.this;
        if (!flag1 && Features.DESTINY.isEnabled() && !destinySession.isDriverInDestinyMode())
        {
            flag1 = flag3;
        } else
        {
            flag1 = false;
        }
        DriverOverflowMenuView.access$100(driverride, 0x7f0d000e, flag1);
        if (!Objects.equals(DriverOverflowMenuView.access$200(DriverOverflowMenuView.this), DriverOverflowMenuView.access$300(DriverOverflowMenuView.this)))
        {
            dialogFlow.dismiss();
        }
    }

    ()
    {
        this$0 = DriverOverflowMenuView.this;
        super();
    }
}
