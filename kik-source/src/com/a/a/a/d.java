// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.a.a.a:
//            o, q, t, c

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
        ((o) (bundle)).b.a(q.a(((o) (bundle)).a, q.a.a, activity), false);
    }

    public final void onActivityDestroyed(Activity activity)
    {
        c c = a;
        ((o) (c)).b.a(q.a(((o) (c)).a, q.a.g, activity), false);
    }

    public final void onActivityPaused(Activity activity)
    {
        c c = a;
        ((o) (c)).b.a(q.a(((o) (c)).a, q.a.e, activity), false);
    }

    public final void onActivityResumed(Activity activity)
    {
        c c = a;
        ((o) (c)).b.a(q.a(((o) (c)).a, q.a.c, activity), false);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
        bundle = a;
        ((o) (bundle)).b.a(q.a(((o) (bundle)).a, q.a.d, activity), false);
    }

    public final void onActivityStarted(Activity activity)
    {
        c c = a;
        ((o) (c)).b.a(q.a(((o) (c)).a, q.a.b, activity), false);
    }

    public final void onActivityStopped(Activity activity)
    {
        c c = a;
        ((o) (c)).b.a(q.a(((o) (c)).a, q.a.f, activity), false);
    }
}
