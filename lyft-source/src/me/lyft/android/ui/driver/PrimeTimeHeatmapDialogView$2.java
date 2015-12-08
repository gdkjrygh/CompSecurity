// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import me.lyft.android.common.DialogFlow;
import me.lyft.android.domain.ride.DriverRide;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            PrimeTimeHeatmapDialogView

class this._cls0
    implements Action1
{

    final PrimeTimeHeatmapDialogView this$0;

    public volatile void call(Object obj)
    {
        call((DriverRide)obj);
    }

    public void call(DriverRide driverride)
    {
        if (driverride.isPending() || driverride.isInProgress())
        {
            dialogFlow.dismiss();
        }
    }

    ()
    {
        this$0 = PrimeTimeHeatmapDialogView.this;
        super();
    }
}
