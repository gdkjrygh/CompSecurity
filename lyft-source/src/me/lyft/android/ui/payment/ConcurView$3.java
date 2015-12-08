// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.payment;

import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;
import me.lyft.android.utils.WebBrowser;

// Referenced classes of package me.lyft.android.ui.payment:
//            ConcurView

class lytics extends AsyncCall
{

    final ConcurView this$0;
    final AsyncActionAnalytics val$analytics;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        val$analytics.trackResponseFailure(throwable);
        viewErrorHandler.handle(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        super.onSuccess(s);
        val$analytics.trackResponseSuccess();
        WebBrowser.open(getContext(), s);
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.hideProgress();
    }

    lytics()
    {
        this$0 = final_concurview;
        val$analytics = AsyncActionAnalytics.this;
        super();
    }
}
