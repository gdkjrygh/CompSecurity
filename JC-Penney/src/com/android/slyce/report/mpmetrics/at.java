// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            af, ak

class at
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private final af a;

    public at(af af1)
    {
        a = af1;
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public void onActivityDestroyed(Activity activity)
    {
    }

    public void onActivityPaused(Activity activity)
    {
    }

    public void onActivityResumed(Activity activity)
    {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
        if (!activity.isTaskRoot())
        {
            return;
        } else
        {
            a.c().b(activity);
            a.c().a(activity);
            return;
        }
    }

    public void onActivityStopped(Activity activity)
    {
    }
}
