// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;

// Referenced classes of package me.lyft.android.application:
//            LogoutService

class val.analytics extends AsyncCall
{

    final LogoutService this$0;
    final ActionAnalytics val$analytics;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        val$analytics.trackFailure(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        super.onSuccess(unit);
        val$analytics.trackSuccess();
    }

    ()
    {
        this$0 = final_logoutservice;
        val$analytics = ActionAnalytics.this;
        super();
    }
}
