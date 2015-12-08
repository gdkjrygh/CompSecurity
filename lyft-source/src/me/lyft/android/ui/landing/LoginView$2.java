// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import me.lyft.android.analytics.ActionAnalytics;
import me.lyft.android.application.landing.exceptions.InvalidPhoneExeception;
import me.lyft.android.common.Unit;
import me.lyft.android.rx.AsyncCall;
import me.lyft.android.ui.IProgressController;
import me.lyft.android.ui.IViewErrorHandler;

// Referenced classes of package me.lyft.android.ui.landing:
//            LoginView, LandingFlow

class cs extends AsyncCall
{

    final LoginView this$0;
    final ActionAnalytics val$analytics;
    final String val$phoneNumberStr;

    public void onFail(Throwable throwable)
    {
        super.onFail(throwable);
        val$analytics.trackFailure(throwable);
        if (throwable instanceof InvalidPhoneExeception)
        {
            LoginView.access$100(LoginView.this);
            return;
        } else
        {
            viewErrorHandler.handle(throwable);
            return;
        }
    }

    public volatile void onSuccess(Object obj)
    {
        onSuccess((Unit)obj);
    }

    public void onSuccess(Unit unit)
    {
        super.onSuccess(unit);
        LoginView.access$000(LoginView.this, val$phoneNumberStr);
        val$analytics.trackSuccess();
        landingFlow.openLoginVerifyPhoneScreen(val$phoneNumberStr);
    }

    public void onUnsubscribe()
    {
        super.onUnsubscribe();
        progressController.hideProgress();
    }

    cs()
    {
        this$0 = final_loginview;
        val$phoneNumberStr = s;
        val$analytics = ActionAnalytics.this;
        super();
    }
}
