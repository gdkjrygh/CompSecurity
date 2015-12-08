// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.view.View;
import me.lyft.android.domain.ride.Passenger;
import me.lyft.android.flows.ProfileFlow;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverRideInProgressView

class this._cls0
    implements android.view.ogressView._cls2
{

    final DriverRideInProgressView this$0;

    public void onClick(View view)
    {
        profileFlow.openPassengerRideProfile(DriverRideInProgressView.access$000(DriverRideInProgressView.this).getId());
    }

    ()
    {
        this$0 = DriverRideInProgressView.this;
        super();
    }
}
