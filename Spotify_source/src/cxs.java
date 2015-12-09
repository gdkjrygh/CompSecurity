// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Bundle;

final class cxs
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private final cxk a;

    public cxs(cxk cxk1)
    {
        a = cxk1;
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
        a.b.b();
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
            a.b.b(activity);
            a.b.a(activity);
            return;
        }
    }

    public final void onActivityStopped(Activity activity)
    {
    }
}
