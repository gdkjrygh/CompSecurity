// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package a.a.a.a:
//            d, b

final class c
    implements android.app.Application.ActivityLifecycleCallbacks
{

    final d a;
    final b b;

    c(b b1, d d1)
    {
        b = b1;
        a = d1;
        super();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle)
    {
        a.a(activity);
    }

    public final void onActivityDestroyed(Activity activity)
    {
        a.g(activity);
    }

    public final void onActivityPaused(Activity activity)
    {
        a.d(activity);
    }

    public final void onActivityResumed(Activity activity)
    {
        a.c(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
        a.f(activity);
    }

    public final void onActivityStarted(Activity activity)
    {
        a.b(activity);
    }

    public final void onActivityStopped(Activity activity)
    {
        a.e(activity);
    }
}
