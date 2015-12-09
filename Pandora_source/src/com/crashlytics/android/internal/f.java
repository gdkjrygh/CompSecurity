// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.crashlytics.android.internal:
//            e

final class f
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private e a;

    f(e e1)
    {
        a = e1;
        super();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle)
    {
        a.a(activity);
    }

    public final void onActivityDestroyed(Activity activity)
    {
        a.b(activity);
    }

    public final void onActivityPaused(Activity activity)
    {
        a.c(activity);
    }

    public final void onActivityResumed(Activity activity)
    {
        a.d(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
        a.e(activity);
    }

    public final void onActivityStarted(Activity activity)
    {
        a.f(activity);
    }

    public final void onActivityStopped(Activity activity)
    {
        a.g(activity);
    }
}
