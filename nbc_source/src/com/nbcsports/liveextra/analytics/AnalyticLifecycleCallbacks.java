// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics;

import android.app.Activity;
import android.os.Bundle;
import com.comscore.analytics.comScore;
import com.phunware.nbc.sochi.metrics.TrackingHelper;

public class AnalyticLifecycleCallbacks
    implements android.app.Application.ActivityLifecycleCallbacks
{

    public AnalyticLifecycleCallbacks()
    {
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public void onActivityDestroyed(Activity activity)
    {
    }

    public void onActivityPaused(Activity activity)
    {
        comScore.onExitForeground();
        TrackingHelper.stopActivity();
    }

    public void onActivityResumed(Activity activity)
    {
        comScore.onEnterForeground();
        TrackingHelper.startActivity();
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
    }

    public void onActivityStopped(Activity activity)
    {
    }
}
