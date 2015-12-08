// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;

// Referenced classes of package me.lyft.android.ui.landing:
//            VerifyPhoneNumberView

class val.analytics extends AsyncCall
{

    final VerifyPhoneNumberView this$0;
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
        val$analytics.trackSuccess();
    }

    ()
    {
        this$0 = final_verifyphonenumberview;
        val$analytics = ActionAnalytics.this;
        super();
    }
}
