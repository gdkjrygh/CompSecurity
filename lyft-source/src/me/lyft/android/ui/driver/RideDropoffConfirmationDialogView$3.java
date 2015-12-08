// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.ride.DriverRide;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            RideDropoffConfirmationDialogView

class this._cls0
    implements Action1
{

    final RideDropoffConfirmationDialogView this$0;

    public volatile void call(Object obj)
    {
        call((DriverRide)obj);
    }

    public void call(DriverRide driverride)
    {
        boolean flag;
        if (!Objects.equals(RideDropoffConfirmationDialogView.access$000(RideDropoffConfirmationDialogView.this), driverride.getCurrentStop()))
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
        this$0 = RideDropoffConfirmationDialogView.this;
        super();
    }
}
