// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ridehistory;

import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.domain.ridehistory.PassengerRideHistory;
import me.lyft.android.rx.AsyncCall;

// Referenced classes of package me.lyft.android.ui.ridehistory:
//            PassengerRideHistoryListView, PassengerRideHistoryAdapter

class val.loadMoreRideHistory extends AsyncCall
{

    final PassengerRideHistoryListView this$0;
    final AsyncActionAnalytics val$loadMoreRideHistory;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        val$loadMoreRideHistory.trackResponseFailure(throwable);
        PassengerRideHistoryListView.access$200(PassengerRideHistoryListView.this).setHasError(true);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((PassengerRideHistory)obj);
    }

    public void onSuccess(PassengerRideHistory passengerridehistory)
    {
        super.onSuccess(passengerridehistory);
        val$loadMoreRideHistory.trackResponseSuccess();
        PassengerRideHistoryListView.access$200(PassengerRideHistoryListView.this).setHasMore(passengerridehistory.hasMore());
        PassengerRideHistoryListView.access$200(PassengerRideHistoryListView.this).addItems(passengerridehistory.getRideHistory());
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        PassengerRideHistoryListView.access$302(PassengerRideHistoryListView.this, false);
    }

    ()
    {
        this$0 = final_passengerridehistorylistview;
        val$loadMoreRideHistory = AsyncActionAnalytics.this;
        super();
    }
}
