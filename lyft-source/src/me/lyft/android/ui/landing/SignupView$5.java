// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;

// Referenced classes of package me.lyft.android.ui.landing:
//            SignupView, LandingFlow

class s extends AsyncCall
{

    final SignupView this$0;
    final ActionAnalytics val$analytics;

    public void onFail(Throwable throwable)
    {
        val$analytics.trackFailure(throwable);
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        val$analytics.trackSuccess();
        landingFlow.goToNextScreenInSignupFlow();
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.hideProgress();
    }

    s()
    {
        this$0 = final_signupview;
        val$analytics = ActionAnalytics.this;
        super();
    }
}
