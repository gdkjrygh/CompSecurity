// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.infrastructure.sms.ISmsService;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRideOverflowMenuView

class val.shareRouteAnalytics extends AsyncCall
{

    final PassengerRideOverflowMenuView this$0;
    final AsyncActionAnalytics val$shareRouteAnalytics;

    public void onFail(Throwable throwable)
    {
        val$shareRouteAnalytics.trackResponseFailure(throwable);
        viewErrorHandler.handle(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        super.onSuccess(s);
        val$shareRouteAnalytics.trackResponseSuccess();
        smsService.sendShareRouteMessage(s);
    }

    public void onUnsubscribe()
    {
        dialogFlow.dismiss(me/lyft/android/ui/passenger/PassengerDialogs$PassengerRideOverflowMenuScreen);
        progressController.enableUI();
        progressController.hideProgress();
    }

    rflowMenuScreen()
    {
        this$0 = final_passengerrideoverflowmenuview;
        val$shareRouteAnalytics = AsyncActionAnalytics.this;
        super();
    }
}
