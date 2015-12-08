// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            v

final class ab
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private final v a;

    public ab(v v1)
    {
        a = v1;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public final void onActivityDestroyed(Activity activity)
    {
    }

    public final void onActivityPaused(Activity activity)
    {
    }

    public final void onActivityResumed(Activity activity)
    {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public final void onActivityStarted(Activity activity)
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

    public final void onActivityStopped(Activity activity)
    {
    }
}
