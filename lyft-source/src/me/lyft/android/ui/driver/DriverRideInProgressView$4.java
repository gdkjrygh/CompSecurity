// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.domain.location.Location;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Stop;
import me.lyft.android.utils.Navigator;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideInProgressView

class this._cls0
    implements android.view.ogressView._cls4
{

    final DriverRideInProgressView this$0;

    public void onClick(View view)
    {
        view = DriverRideInProgressView.access$100(DriverRideInProgressView.this).getLocation();
        if (view.isNull())
        {
            DriverRideInProgressView.access$300(DriverRideInProgressView.this);
            return;
        }
        if (DriverRideInProgressView.access$200(DriverRideInProgressView.this).isTrainingRide())
        {
            dialogFlow.queue(new avigationDialog());
            return;
        } else
        {
            navigator.navigate(view);
            return;
        }
    }

    avigationDialog()
    {
        this$0 = DriverRideInProgressView.this;
        super();
    }
}
