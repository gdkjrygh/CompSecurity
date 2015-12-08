// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import me.lyft.android.analytics.studies.AppLaunchAnalytics;
import me.lyft.android.common.DialogFlow;
import me.lyft.android.common.Unit;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.landing:
//            AppLoadingView

class this._cls0
    implements Action1
{

    final AppLoadingView this$0;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        AppLaunchAnalytics.onLoadingAnimationComplete();
        dialogFlow.dismiss(me/lyft/android/ui/landing/LandingDialogs$AppLoadingDialog);
    }

    pLoadingDialog()
    {
        this$0 = AppLoadingView.this;
        super();
    }
}
