// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a;

import android.app.Activity;
import android.os.Bundle;

final class b
    implements android.app.Application.ActivityLifecycleCallbacks
{

    final a.b a;
    final a.a b;

    b(a.a a1, a.b b1)
    {
        b = a1;
        a = b1;
        super();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle)
    {
        a.a(activity);
    }

    public final void onActivityDestroyed(Activity activity)
    {
    }

    public final void onActivityPaused(Activity activity)
    {
    }

    public final void onActivityResumed(Activity activity)
    {
        a.c(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public final void onActivityStarted(Activity activity)
    {
        a.b(activity);
    }

    public final void onActivityStopped(Activity activity)
    {
    }
}
