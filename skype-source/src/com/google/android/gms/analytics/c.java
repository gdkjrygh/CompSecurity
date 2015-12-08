// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.analytics.internal.aa;
import com.google.android.gms.analytics.internal.al;
import com.google.android.gms.analytics.internal.f;
import com.google.android.gms.analytics.internal.n;
import com.google.android.gms.analytics.internal.o;
import com.google.android.gms.analytics.internal.s;
import com.google.android.gms.common.internal.y;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            h, g, e

public final class c extends h
{
    static interface a
    {

        public abstract void a(Activity activity);

        public abstract void c_();
    }

    final class b
        implements android.app.Application.ActivityLifecycleCallbacks
    {

        final c a;

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
            a.a(activity);
        }

        public final void onActivityStopped(Activity activity)
        {
            a.e();
        }

        b()
        {
            a = c.this;
            super();
        }
    }


    private static List b = new ArrayList();
    private boolean c;
    private boolean d;
    private Set e;
    private boolean f;
    private boolean g;
    private volatile boolean h;
    private boolean i;

    public c(s s1)
    {
        super(s1);
        e = new HashSet();
    }

    public static c a(Context context)
    {
        return s.a(context).j();
    }

    public static void c()
    {
        com/google/android/gms/analytics/c;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run()) { }
        break MISSING_BLOCK_LABEL_50;
        Exception exception;
        exception;
        com/google/android/gms/analytics/c;
        JVM INSTR monitorexit ;
        throw exception;
        b = null;
        com/google/android/gms/analytics/c;
        JVM INSTR monitorexit ;
    }

    public final g a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        s1 = new g(i(), s1);
        s1.C();
        this;
        JVM INSTR monitorexit ;
        return s1;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public final void a()
    {
        n n1 = i().k();
        if (n1.d())
        {
            com.google.android.gms.analytics.internal.f.a().a(n1.e());
        }
        if (n1.h())
        {
            g = n1.i();
        }
        if (n1.d())
        {
            e e1 = com.google.android.gms.analytics.internal.f.a();
            if (e1 != null)
            {
                e1.a(n1.e());
            }
        }
        c = true;
    }

    final void a(Activity activity)
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((a)iterator.next()).a(activity)) { }
    }

    final void a(a a1)
    {
        e.add(a1);
        a1 = i().a();
        if (a1 instanceof Application)
        {
            a1 = (Application)a1;
            if (android.os.Build.VERSION.SDK_INT >= 14 && !f)
            {
                a1.registerActivityLifecycleCallbacks(new b());
                f = true;
            }
        }
    }

    public final void a(e e1)
    {
        com.google.android.gms.analytics.internal.f.a(e1);
        if (!i)
        {
            Log.i((String)al.c.a(), (new StringBuilder("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.")).append((String)al.c.a()).append(" DEBUG").toString());
            i = true;
        }
    }

    final void b(a a1)
    {
        e.remove(a1);
    }

    public final boolean b()
    {
        return c && !d;
    }

    public final boolean d()
    {
        return g;
    }

    final void e()
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((a)iterator.next()).c_()) { }
    }

    public final boolean f()
    {
        return h;
    }

    public final String g()
    {
        y.c("getClientId can not be called from the main thread");
        return i().o().b();
    }

    public final void h()
    {
        i().h().c();
    }

}
