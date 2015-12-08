// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.answers;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.crashlytics.android.answers:
//            AutoSessionAnalyticsManager

class a
    implements android.app.allbacks
{

    final AutoSessionAnalyticsManager a;

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        a.a(activity);
    }

    public void onActivityDestroyed(Activity activity)
    {
        a.b(activity);
    }

    public void onActivityPaused(Activity activity)
    {
        a.c(activity);
    }

    public void onActivityResumed(Activity activity)
    {
        a.d(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
        a.e(activity);
    }

    public void onActivityStarted(Activity activity)
    {
        a.f(activity);
    }

    public void onActivityStopped(Activity activity)
    {
        a.g(activity);
    }

    (AutoSessionAnalyticsManager autosessionanalyticsmanager)
    {
        a = autosessionanalyticsmanager;
        super();
    }
}
