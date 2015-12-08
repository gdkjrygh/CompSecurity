// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.domain.ride.DriverRide;
import me.lyft.android.domain.ride.Stop;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideInProgressView

class this._cls0
    implements android.view.ogressView._cls3
{

    final DriverRideInProgressView this$0;

    public void onClick(View view)
    {
        if (DriverRideInProgressView.access$100(DriverRideInProgressView.this).isDropOff())
        {
            if (DriverRideInProgressView.access$200(DriverRideInProgressView.this).showEndRideConfirmation())
            {
                dialogFlow.show(new ConfirmationDialog());
                return;
            } else
            {
                dialogFlow.show(new nfirmationDialog());
                return;
            }
        }
        if (DriverRideInProgressView.access$100(DriverRideInProgressView.this).isInGeofence())
        {
            dialogFlow.show(new nfirmationDialog());
            return;
        } else
        {
            showTapToArriveConfirmation();
            return;
        }
    }

    nfirmationDialog()
    {
        this$0 = DriverRideInProgressView.this;
        super();
    }
}
