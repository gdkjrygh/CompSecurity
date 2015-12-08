// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            h

class i
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private final h a;

    public i(h h1)
    {
        a = h1;
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
        a.e().e();
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
            a.e().b(activity);
            a.e().a(activity);
            return;
        }
    }

    public void onActivityStopped(Activity activity)
    {
    }
}
