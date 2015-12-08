// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ridehistory;

import me.lyft.android.analytics.studies.RideHistoryAnalytics;
import me.lyft.android.common.AppFlow;
import me.lyft.android.domain.ridehistory.PassengerRideHistoryItem;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.ridehistory:
//            PassengerRideHistoryListView

class this._cls0
    implements Action1
{

    final PassengerRideHistoryListView this$0;

    public volatile void call(Object obj)
    {
        call((PassengerRideHistoryItem)obj);
    }

    public void call(PassengerRideHistoryItem passengerridehistoryitem)
    {
        passengerridehistoryitem = passengerridehistoryitem.getId();
        RideHistoryAnalytics.trackIndividualItemTap(passengerridehistoryitem);
        appFlow.goTo(new eHistoryDetailedScreen(passengerridehistoryitem));
    }

    eHistoryDetailedScreen()
    {
        this$0 = PassengerRideHistoryListView.this;
        super();
    }
}
