// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import a.a.a.a.a.b.j;
import a.a.a.a.a.b.l;
import a.a.a.a.a.b.t;
import a.a.a.a.a.b.x;
import a.a.a.a.a.c.y;
import a.a.a.a.a.c.z;
import a.a.a.a.a.e.b;
import a.a.a.a.a.e.m;
import a.a.a.a.a.g.e;
import a.a.a.a.a.g.o;
import a.a.a.a.a.g.q;
import a.a.a.a.a.g.v;
import a.a.a.a.f;
import a.a.a.a.p;
import a.a.a.a.s;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.b.a.a.a;
import com.b.a.c.a.a.d;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.b.a.c:
//            u, k, y, z, 
//            a, bu, aa, l, 
//            at, t, o, i, 
//            as, j, br, m, 
//            x, bn, ar

public class h extends p
{

    private final long a;
    private final ConcurrentHashMap b;
    private File c;
    private File d;
    private com.b.a.c.x j;
    private aa k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private String s;
    private float t;
    private boolean u;
    private final bn v;
    private m w;
    private u x;
    private com.b.a.c.a.a y;

    public h()
    {
        this(1.0F, null, null, false);
    }

    h(float f1, com.b.a.c.x x1, bn bn, boolean flag)
    {
        this(f1, x1, bn, flag, a.a.a.a.a.b.t.a("Crashlytics Exception Handler"));
    }

    private h(float f1, com.b.a.c.x x1, bn bn, boolean flag, ExecutorService executorservice)
    {
        l = null;
        m = null;
        n = null;
        b = new ConcurrentHashMap();
        a = System.currentTimeMillis();
        t = f1;
        j = x1;
        v = bn;
        u = flag;
        x = new u(executorservice);
    }

    private void A()
    {
        x.b(new k(this));
    }

    static int a(float f1, int i1)
    {
        return (int)((float)i1 * f1);
    }

    static File a(h h1)
    {
        return h1.d;
    }

    static void a(String s1)
    {
        a a1 = (a)a.a.a.a.f.a(com/b/a/a/a);
        if (a1 != null)
        {
            a1.a(new a.a.a.a.a.b.p(s1));
        }
    }

    private boolean a(Context context)
    {
        if (u)
        {
            return false;
        }
        new j();
        if (a.a.a.a.a.b.j.a(context) == null)
        {
            return false;
        }
        a.a.a.a.f.d().a("CrashlyticsCore", "Initializing Crashlytics 2.3.5.79");
        d = new File(q(), "initialization_marker");
        if (v == null) goto _L2; else goto _L1
_L1:
        Object obj = new com.b.a.c.z(v);
_L8:
        w = new b(a.a.a.a.f.d());
        w.a(((a.a.a.a.a.e.n) (obj)));
        p = context.getPackageName();
        q = u().h();
        a.a.a.a.f.d();
        (new StringBuilder("Installer package name is: ")).append(q);
        obj = context.getPackageManager().getPackageInfo(p, 0);
        r = Integer.toString(((PackageInfo) (obj)).versionCode);
        if (((PackageInfo) (obj)).versionName != null) goto _L4; else goto _L3
_L3:
        obj = "0.0";
_L9:
        s = ((String) (obj));
        o = a.a.a.a.a.b.l.l(context);
_L10:
        Exception exception;
        boolean flag;
        try
        {
            u().j();
            (new com.b.a.c.a(o, a.a.a.a.a.b.l.a(context, "com.crashlytics.RequireBuildId", true))).a();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            a.a.a.a.f.d().b("CrashlyticsCore", "Crashlytics was not started due to an exception during initialization", context);
            return false;
        }
        obj = new bu(v(), o, p);
        a.a.a.a.f.d();
        k = new aa(Thread.getDefaultUncaughtExceptionHandler(), x, u(), ((bu) (obj)), this);
        flag = ((Boolean)x.a(new com.b.a.c.l(this))).booleanValue();
        k.b();
        Thread.setDefaultUncaughtExceptionHandler(k);
        a.a.a.a.f.d();
_L11:
        if (!flag) goto _L6; else goto _L5
_L5:
        if (!a.a.a.a.a.b.l.m(context)) goto _L6; else goto _L7
_L7:
        z();
        return false;
_L2:
        obj = null;
          goto _L8
_L4:
        obj = ((PackageInfo) (obj)).versionName;
          goto _L9
        exception;
        a.a.a.a.f.d().b("CrashlyticsCore", "Error setting up app properties", exception);
          goto _L10
        context;
        throw new z(context);
        exception;
        flag = false;
_L12:
        a.a.a.a.f.d().b("CrashlyticsCore", "There was a problem installing the exception handler.", exception);
          goto _L11
_L6:
        return true;
        exception;
          goto _L12
    }

    static boolean a(h h1, Activity activity, o o1)
    {
        at at1 = new at(activity, o1);
        com.b.a.c.t t1 = new com.b.a.c.t(h1, (byte)0);
        activity.runOnUiThread(new com.b.a.c.o(h1, activity, t1, at1, o1));
        a.a.a.a.f.d();
        t1.b();
        return t1.a();
    }

    public static h f()
    {
        return (h)a.a.a.a.f.a(com/b/a/c/h);
    }

    static a.a.a.a.a.g.p s()
    {
        v v1 = a.a.a.a.a.g.q.a().b();
        if (v1 == null)
        {
            return null;
        } else
        {
            return v1.b;
        }
    }

    private void z()
    {
        Object obj = new i(this);
        for (Iterator iterator = y().iterator(); iterator.hasNext(); ((a.a.a.a.a.c.s) (obj)).a((y)iterator.next())) { }
        obj = w().c().submit(((java.util.concurrent.Callable) (obj)));
        a.a.a.a.f.d();
        try
        {
            ((Future) (obj)).get(4L, TimeUnit.SECONDS);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            a.a.a.a.f.d().b("CrashlyticsCore", "Crashlytics was interrupted during initialization.", interruptedexception);
            return;
        }
        catch (ExecutionException executionexception)
        {
            a.a.a.a.f.d().b("CrashlyticsCore", "Problem encountered during Crashlytics initialization.", executionexception);
            return;
        }
        catch (TimeoutException timeoutexception)
        {
            a.a.a.a.f.d().b("CrashlyticsCore", "Crashlytics timed out during initialization.", timeoutexception);
        }
    }

    final ar a(v v1)
    {
        if (v1 != null)
        {
            return new as(this, a.a.a.a.a.b.l.c(v(), "com.crashlytics.ApiEndpoint"), v1.a.d, w);
        } else
        {
            return null;
        }
    }

    public final String a()
    {
        return "2.3.5.79";
    }

    public final String b()
    {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    protected final Object d()
    {
        return e();
    }

    protected final Void e()
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        x.a(new com.b.a.c.j(this));
        k.d();
        flag2 = true;
        flag1 = true;
        flag = flag2;
        Object obj = a.a.a.a.a.g.q.a().b();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        flag = flag2;
        a.a.a.a.f.d().b("CrashlyticsCore", "Received null settings, skipping initialization!");
        A();
        return null;
        flag = flag2;
        if (!((v) (obj)).d.c) goto _L2; else goto _L1
_L1:
        flag2 = false;
        flag1 = false;
        flag = flag2;
        k.c();
        flag = flag2;
        obj = a(((v) (obj)));
        if (obj == null) goto _L4; else goto _L3
_L3:
        flag = flag2;
        (new br(((ar) (obj)))).a(t);
_L2:
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        a.a.a.a.f.d();
        A();
        return null;
_L4:
        flag = flag2;
        a.a.a.a.f.d().b("CrashlyticsCore", "Unable to create a call to upload reports.");
          goto _L2
        Object obj1;
        obj1;
        a.a.a.a.f.d().b("CrashlyticsCore", "Error dealing with settings", ((Throwable) (obj1)));
        flag1 = flag;
          goto _L2
        obj1;
        a.a.a.a.f.d().b("CrashlyticsCore", "Problem encountered during Crashlytics initialization.", ((Throwable) (obj1)));
        A();
        return null;
        obj1;
        A();
        throw obj1;
    }

    protected final boolean e_()
    {
        return a(super.v());
    }

    final Map g()
    {
        return Collections.unmodifiableMap(b);
    }

    final String h()
    {
        return p;
    }

    final String i()
    {
        return q;
    }

    final String j()
    {
        return s;
    }

    final String k()
    {
        return r;
    }

    final aa l()
    {
        return k;
    }

    final String m()
    {
        if (u().a())
        {
            return l;
        } else
        {
            return null;
        }
    }

    final String n()
    {
        if (u().a())
        {
            return m;
        } else
        {
            return null;
        }
    }

    final String o()
    {
        if (u().a())
        {
            return n;
        } else
        {
            return null;
        }
    }

    final d p()
    {
        d d1 = null;
        if (y != null)
        {
            d1 = y.a();
        }
        return d1;
    }

    final File q()
    {
        if (c == null)
        {
            c = (new a.a.a.a.a.f.b(this)).a();
        }
        return c;
    }

    final boolean r()
    {
        return ((Boolean)a.a.a.a.a.g.q.a().a(new com.b.a.c.m(this), Boolean.valueOf(false))).booleanValue();
    }
}
