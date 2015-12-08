// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            h, au, at, ag, 
//            t, aj, an, g, 
//            p, av, k, y, 
//            x, z, e, u, 
//            aa, af

public class c extends h
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


    private static boolean a;
    private static c l;
    private boolean b;
    private af c;
    private u d;
    private Context e;
    private volatile Boolean f;
    private e g;
    private String h;
    private String i;
    private Set j;
    private boolean k;

    protected c(Context context)
    {
        this(context, ((af) (au.a(context))), ((u) (at.c())));
    }

    private c(Context context, af af1, u u1)
    {
        f = Boolean.valueOf(false);
        k = false;
        if (context == null)
        {
            throw new IllegalArgumentException("context cannot be null");
        } else
        {
            e = context.getApplicationContext();
            c = af1;
            d = u1;
            ag.a(e);
            t.a(e);
            aj.a(e);
            g = new an();
            j = new HashSet();
            g();
            return;
        }
    }

    static c a()
    {
        com/google/android/gms/analytics/c;
        JVM INSTR monitorenter ;
        c c1 = l;
        com/google/android/gms/analytics/c;
        JVM INSTR monitorexit ;
        return c1;
        Exception exception;
        exception;
        com/google/android/gms/analytics/c;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static c a(Context context)
    {
        com/google/android/gms/analytics/c;
        JVM INSTR monitorenter ;
        if (l == null)
        {
            l = new c(context);
        }
        context = l;
        com/google/android/gms/analytics/c;
        JVM INSTR monitorexit ;
        return context;
        context;
        com/google/android/gms/analytics/c;
        JVM INSTR monitorexit ;
        throw context;
    }

    private g a(g g1)
    {
        if (i != null)
        {
            g1.a("&an", i);
        }
        if (h != null)
        {
            g1.a("&av", h);
        }
        return g1;
    }

    private int b(String s)
    {
        s = s.toLowerCase();
        if ("verbose".equals(s))
        {
            return 0;
        }
        if ("info".equals(s))
        {
            return 1;
        }
        if ("warning".equals(s))
        {
            return 2;
        }
        return !"error".equals(s) ? -1 : 3;
    }

    private void g()
    {
        if (!a)
        {
            Object obj;
            try
            {
                obj = e.getPackageManager().getApplicationInfo(e.getPackageName(), 129);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                p.c((new StringBuilder()).append("PackageManager doesn't know about package: ").append(obj).toString());
                obj = null;
            }
            if (obj == null)
            {
                p.d("Couldn't get ApplicationInfo to load gloabl config.");
                return;
            }
            obj = ((ApplicationInfo) (obj)).metaData;
            if (obj != null)
            {
                int i1 = ((Bundle) (obj)).getInt("com.google.android.gms.analytics.globalConfigResource");
                if (i1 > 0)
                {
                    k k1 = (k)(new av(e)).a(i1);
                    if (k1 != null)
                    {
                        a(k1);
                        return;
                    }
                }
            }
        }
    }

    public g a(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        g g1;
        y.a().a(y.a.N);
        g1 = new g(null, this, e);
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        z z1 = (z)(new x(e)).a(i1);
        if (z1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        g1.a(z1);
        g1 = a(g1);
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
        y.a().a(y.a.N);
        s = a(new g(s, this, e));
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void a(Activity activity)
    {
        if (!k)
        {
            b(activity);
        }
    }

    public void a(Application application)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14 && !k)
        {
            application.registerActivityLifecycleCallbacks(new b());
            k = true;
        }
    }

    void a(a a1)
    {
        j.add(a1);
        if (e instanceof Application)
        {
            a((Application)e);
        }
    }

    public void a(e e1)
    {
        y.a().a(y.a.ae);
        g = e1;
    }

    void a(k k1)
    {
        p.c("Loading global config values.");
        if (k1.a())
        {
            i = k1.b();
            p.c((new StringBuilder()).append("app name loaded: ").append(i).toString());
        }
        if (k1.c())
        {
            h = k1.d();
            p.c((new StringBuilder()).append("app version loaded: ").append(h).toString());
        }
        if (k1.e())
        {
            int i1 = b(k1.f());
            if (i1 >= 0)
            {
                p.c((new StringBuilder()).append("log level loaded: ").append(i1).toString());
                d().a(i1);
            }
        }
        if (k1.g())
        {
            d.a(k1.h());
        }
        if (k1.i())
        {
            a(k1.j());
        }
    }

    void a(Map map)
    {
        this;
        JVM INSTR monitorenter ;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        throw new IllegalArgumentException("hit cannot be null");
        map;
        this;
        JVM INSTR monitorexit ;
        throw map;
        aa.a(map, "&ul", aa.a(Locale.getDefault()));
        aa.a(map, "&sr", t.a());
        map.put("&_u", y.a().c());
        y.a().b();
        c.a(map);
        this;
        JVM INSTR monitorexit ;
    }

    public void a(boolean flag)
    {
        y.a().a(y.a.ac);
        b = flag;
    }

    public void b(int i1)
    {
        d.a(i1);
    }

    void b(Activity activity)
    {
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((a)iterator.next()).a(activity)) { }
    }

    void b(a a1)
    {
        j.remove(a1);
    }

    public void b(boolean flag)
    {
        y.a().a(y.a.Q);
        f = Boolean.valueOf(flag);
        if (f.booleanValue())
        {
            c.b();
        }
    }

    public boolean b()
    {
        y.a().a(y.a.ad);
        return b;
    }

    public void c(Activity activity)
    {
        if (!k)
        {
            d(activity);
        }
    }

    public boolean c()
    {
        y.a().a(y.a.R);
        return f.booleanValue();
    }

    public e d()
    {
        return g;
    }

    void d(Activity activity)
    {
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((a)iterator.next()).b(activity)) { }
    }

    public void e()
    {
        d.a();
    }

    void f()
    {
        c.f();
    }
}
