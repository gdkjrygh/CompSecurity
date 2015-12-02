// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.appstatelogger;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

// Referenced classes of package com.facebook.analytics.appstatelogger:
//            AppStateLogger

class a
    implements android.app.ctivityLifecycleCallbacks
{

    private final AppStateLogger a;

    public final void a(Application application)
    {
        application.registerActivityLifecycleCallbacks(this);
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
        AppStateLogger.a(a, activity, 1);
    }

    public void onActivityDestroyed(Activity activity)
    {
        AppStateLogger.a(a, activity, 2);
    }

    public void onActivityPaused(Activity activity)
    {
        AppStateLogger.a(a, activity, 6);
    }

    public void onActivityResumed(Activity activity)
    {
        AppStateLogger.a(a, activity, 5);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
        AppStateLogger.a(a, activity, 3);
    }

    public void onActivityStopped(Activity activity)
    {
        AppStateLogger.a(a, activity, 4);
    }

    public (AppStateLogger appstatelogger)
    {
        a = appstatelogger;
    }
}
