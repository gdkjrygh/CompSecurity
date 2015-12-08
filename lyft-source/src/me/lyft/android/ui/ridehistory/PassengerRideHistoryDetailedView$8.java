// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.ridehistory;

import android.view.View;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.domain.ridehistory.PassengerRideHistoryDetails;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.ridehistory:
//            PassengerRideHistoryDetailedView

class val.analyitcs extends AsyncCall
{

    final PassengerRideHistoryDetailedView this$0;
    final AsyncActionAnalytics val$analyitcs;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        val$analyitcs.trackResponseFailure(throwable);
        retryView.setVisibility(0);
        viewErrorHandler.handle(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((PassengerRideHistoryDetails)obj);
    }

    public void onSuccess(PassengerRideHistoryDetails passengerridehistorydetails)
    {
        PassengerRideHistoryDetailedView.access$500(PassengerRideHistoryDetailedView.this, passengerridehistorydetails);
        contentContainerView.setVisibility(0);
        val$analyitcs.trackResponseSuccess();
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.hideProgress();
    }

    ()
    {
        this$0 = final_passengerridehistorydetailedview;
        val$analyitcs = AsyncActionAnalytics.this;
        super();
    }
}
