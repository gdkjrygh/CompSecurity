// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ridehistory;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.List;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.domain.ridehistory.PassengerRideHistory;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.ridehistory:
//            PassengerRideHistoryListView, PassengerRideHistoryAdapter

class val.loadRideHistory extends AsyncCall
{

    final PassengerRideHistoryListView this$0;
    final AsyncActionAnalytics val$loadRideHistory;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        val$loadRideHistory.trackResponseFailure(throwable);
        emptyListContainer.setVisibility(8);
        rideHistoryRecyclerView.setVisibility(8);
        retryViewContainer.setVisibility(0);
        viewErrorHandler.handle(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((PassengerRideHistory)obj);
    }

    public void onSuccess(PassengerRideHistory passengerridehistory)
    {
        super.onSuccess(passengerridehistory);
        if (passengerridehistory.getRideHistory().size() > 0)
        {
            val$loadRideHistory.trackResponseSuccess();
            emptyListContainer.setVisibility(8);
            rideHistoryRecyclerView.setVisibility(0);
        } else
        {
            emptyListContainer.setVisibility(0);
            val$loadRideHistory.trackResponseSuccess("no rides");
        }
        PassengerRideHistoryListView.access$200(PassengerRideHistoryListView.this).setHasMore(passengerridehistory.hasMore());
        PassengerRideHistoryListView.access$200(PassengerRideHistoryListView.this).setItems(passengerridehistory.getRideHistory());
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.hideProgress();
        PassengerRideHistoryListView.access$302(PassengerRideHistoryListView.this, false);
    }

    ()
    {
        this$0 = final_passengerridehistorylistview;
        val$loadRideHistory = AsyncActionAnalytics.this;
        super();
    }
}
