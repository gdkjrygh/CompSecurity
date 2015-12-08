// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.ride.DriverRide;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverEndRideConfirmationDialogView

class this._cls0
    implements Action1
{

    final DriverEndRideConfirmationDialogView this$0;

    public volatile void call(Object obj)
    {
        call((DriverRide)obj);
    }

    public void call(DriverRide driverride)
    {
        boolean flag;
        if (!Objects.equals(DriverEndRideConfirmationDialogView.access$000(DriverEndRideConfirmationDialogView.this), driverride.getCurrentStop()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            dialogFlow.dismiss();
        }
    }

    ()
    {
        this$0 = DriverEndRideConfirmationDialogView.this;
        super();
    }
}
