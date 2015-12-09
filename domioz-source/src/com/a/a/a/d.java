// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.a.a.a:
//            k, n, m, q, 
//            c

final class d
    implements android.app.Application.ActivityLifecycleCallbacks
{

    final c a;

    d(c c)
    {
        a = c;
        super();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle)
    {
        bundle = a;
        ((k) (bundle)).b.a(m.a(((k) (bundle)).a, n.a, activity), false);
    }

    public final void onActivityDestroyed(Activity activity)
    {
        c c = a;
        ((k) (c)).b.a(m.a(((k) (c)).a, n.g, activity), false);
    }

    public final void onActivityPaused(Activity activity)
    {
        c c = a;
        ((k) (c)).b.a(m.a(((k) (c)).a, n.e, activity), false);
    }

    public final void onActivityResumed(Activity activity)
    {
        c c = a;
        ((k) (c)).b.a(m.a(((k) (c)).a, n.c, activity), false);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
        bundle = a;
        ((k) (bundle)).b.a(m.a(((k) (bundle)).a, n.d, activity), false);
    }

    public final void onActivityStarted(Activity activity)
    {
        c c = a;
        ((k) (c)).b.a(m.a(((k) (c)).a, n.b, activity), false);
    }

    public final void onActivityStopped(Activity activity)
    {
        c c = a;
        ((k) (c)).b.a(m.a(((k) (c)).a, n.f, activity), false);
    }
}
