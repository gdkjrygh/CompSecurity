// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.analytics.internal.ab;
import com.google.android.gms.analytics.internal.am;
import com.google.android.gms.analytics.internal.f;
import com.google.android.gms.analytics.internal.l;
import com.google.android.gms.analytics.internal.m;
import com.google.android.gms.analytics.internal.o;
import com.google.android.gms.analytics.internal.p;
import com.google.android.gms.analytics.internal.t;
import com.google.android.gms.common.internal.z;
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

        public abstract void b(Activity activity);
    }

    class b
        implements android.app.Application.ActivityLifecycleCallbacks
    {

        final c a;

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
            a.b(activity);
        }

        public void onActivityStopped(Activity activity)
        {
            a.d(activity);
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

    public c(t t1)
    {
        super(t1);
        e = new HashSet();
    }

    public static c a(Context context)
    {
        return t.a(context).k();
    }

    public static void d()
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

    private p p()
    {
        return k().i();
    }

    private o q()
    {
        return k().l();
    }

    public g a(int k)
    {
        this;
        JVM INSTR monitorenter ;
        g g1 = new g(k(), null, null);
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        m m1 = (m)(new l(k())).a(k);
        if (m1 == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        g1.a(m1);
        g1.E();
        this;
        JVM INSTR monitorexit ;
        return g1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public g a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = new g(k(), s, null);
        s.E();
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void a()
    {
        b();
        c = true;
    }

    public void a(Activity activity)
    {
        if (!f)
        {
            b(activity);
        }
    }

    public void a(Application application)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && !f)
        {
            application.registerActivityLifecycleCallbacks(new b());
            f = true;
        }
    }

    void a(a a1)
    {
        e.add(a1);
        a1 = k().b();
        if (a1 instanceof Application)
        {
            a((Application)a1);
        }
    }

    public void a(e e1)
    {
        com.google.android.gms.analytics.internal.f.a(e1);
        if (!i)
        {
            Log.i((String)am.c.a(), (new StringBuilder()).append("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.").append((String)am.c.a()).append(" DEBUG").toString());
            i = true;
        }
    }

    public void a(boolean flag)
    {
        g = flag;
    }

    void b()
    {
        o o1 = q();
        if (o1.d())
        {
            g().a(o1.e());
        }
        if (o1.h())
        {
            a(o1.i());
        }
        if (o1.d())
        {
            e e1 = com.google.android.gms.analytics.internal.f.a();
            if (e1 != null)
            {
                e1.a(o1.e());
            }
        }
    }

    void b(Activity activity)
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((a)iterator.next()).a(activity)) { }
    }

    void b(a a1)
    {
        e.remove(a1);
    }

    public void c(Activity activity)
    {
        if (!f)
        {
            d(activity);
        }
    }

    public boolean c()
    {
        return c && !d;
    }

    void d(Activity activity)
    {
        for (Iterator iterator = e.iterator(); iterator.hasNext(); ((a)iterator.next()).b(activity)) { }
    }

    public boolean e()
    {
        return g;
    }

    public boolean f()
    {
        return h;
    }

    public e g()
    {
        return com.google.android.gms.analytics.internal.f.a();
    }

    public String h()
    {
        z.c("getClientId can not be called from the main thread");
        return k().p().b();
    }

    public void i()
    {
        p().c();
    }

    void j()
    {
        p().d();
    }

}
