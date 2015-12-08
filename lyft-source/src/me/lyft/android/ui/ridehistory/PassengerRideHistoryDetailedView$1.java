// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ridehistory;

import android.view.View;
import me.lyft.android.analytics.studies.RideHistoryAnalytics;

// Referenced classes of package me.lyft.android.ui.ridehistory:
//            PassengerRideHistoryDetailedView

class this._cls0
    implements android.view.oryDetailedView._cls1
{

    final PassengerRideHistoryDetailedView this$0;

    public void onClick(View view)
    {
        RideHistoryAnalytics.trackAddTipTap(PassengerRideHistoryDetailedView.access$000(PassengerRideHistoryDetailedView.this));
        PassengerRideHistoryDetailedView.access$200(PassengerRideHistoryDetailedView.this, PassengerRideHistoryDetailedView.access$100(PassengerRideHistoryDetailedView.this, "/addtip"));
    }

    ()
    {
        this$0 = PassengerRideHistoryDetailedView.this;
        super();
    }
}
