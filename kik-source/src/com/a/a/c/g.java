// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import b.a.a.a.a.b.h;
import b.a.a.a.a.b.j;
import b.a.a.a.a.b.p;
import b.a.a.a.a.b.t;
import b.a.a.a.a.c.r;
import b.a.a.a.a.e.b;
import b.a.a.a.a.g.e;
import b.a.a.a.a.g.m;
import b.a.a.a.a.g.q;
import b.a.a.a.d;
import b.a.a.a.l;
import b.a.a.a.o;
import com.a.a.a.a;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.a.a.c:
//            r, j, x, v, 
//            w, a, ay, k, 
//            ap, n, h, ao, 
//            i, aw, l, u, 
//            au, an

public class g extends l
{
    private final class a
    {

        final g a;
        private boolean b;
        private final CountDownLatch c;

        final void a(boolean flag)
        {
            b = flag;
            c.countDown();
        }

        final boolean a()
        {
            return b;
        }

        final void b()
        {
            try
            {
                c.await();
                return;
            }
            catch (InterruptedException interruptedexception)
            {
                return;
            }
        }

        private a()
        {
            a = g.this;
            super();
            b = false;
            c = new CountDownLatch(1);
        }

        a(byte byte0)
        {
            this();
        }
    }


    private final long a;
    private final ConcurrentHashMap b;
    private File c;
    private u d;
    private x j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r;
    private float s;
    private boolean t;
    private final au u;
    private b.a.a.a.a.e.g v;
    private com.a.a.c.r w;
    private com.a.a.c.a.a x;

    public g()
    {
        this((byte)0);
    }

    private g(byte byte0)
    {
        this(b.a.a.a.a.b.p.a("Crashlytics Exception Handler"));
    }

    private g(ExecutorService executorservice)
    {
        k = null;
        l = null;
        m = null;
        b = new ConcurrentHashMap();
        a = System.currentTimeMillis();
        s = 1.0F;
        d = null;
        u = null;
        t = false;
        w = new com.a.a.c.r(executorservice);
    }

    private void A()
    {
        w.b(new com.a.a.c.j(this));
    }

    static int a(float f1, int i1)
    {
        return (int)((float)i1 * f1);
    }

    static File a(g g1)
    {
        return g1.c;
    }

    private void a(int i1, String s1, String s2)
    {
        while (t || !e("prior to logging messages.")) 
        {
            return;
        }
        long l1 = System.currentTimeMillis();
        long l2 = a;
        j.a(l1 - l2, (new StringBuilder()).append(b.a.a.a.a.b.j.b(i1)).append("/").append(s1).append(" ").append(s2).toString());
    }

    private boolean a(Context context)
    {
        if (t)
        {
            return false;
        }
        new h();
        if (b.a.a.a.a.b.h.a(context) == null)
        {
            return false;
        }
        b.a.a.a.d.c();
        c = new File(q(), "initialization_marker");
        if (u == null) goto _L2; else goto _L1
_L1:
        Object obj = new w(u);
_L8:
        v = new b(b.a.a.a.d.c());
        v.a(((b.a.a.a.a.e.h) (obj)));
        o = context.getPackageName();
        p = u().h();
        b.a.a.a.d.c();
        (new StringBuilder("Installer package name is: ")).append(p);
        obj = context.getPackageManager().getPackageInfo(o, 0);
        q = Integer.toString(((PackageInfo) (obj)).versionCode);
        if (((PackageInfo) (obj)).versionName != null) goto _L4; else goto _L3
_L3:
        obj = "0.0";
_L9:
        r = ((String) (obj));
        n = b.a.a.a.a.b.j.m(context);
_L10:
        Exception exception;
        boolean flag;
        try
        {
            u().i();
            (new com.a.a.c.a(n, b.a.a.a.a.b.j.a(context, "com.crashlytics.RequireBuildId", true))).a();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            b.a.a.a.d.c().b("Fabric", "Crashlytics was not started due to an exception during initialization", context);
            return false;
        }
        obj = new ay(v(), n, o);
        b.a.a.a.d.c();
        j = new x(Thread.getDefaultUncaughtExceptionHandler(), w, u(), ((ay) (obj)), this);
        flag = ((Boolean)w.a(new k(this))).booleanValue();
        j.b();
        Thread.setDefaultUncaughtExceptionHandler(j);
        b.a.a.a.d.c();
_L11:
        if (!flag) goto _L6; else goto _L5
_L5:
        if (!b.a.a.a.a.b.j.n(context)) goto _L6; else goto _L7
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
        b.a.a.a.d.c().b("Fabric", "Error setting up app properties", exception);
          goto _L10
        context;
        throw new r(context);
        exception;
        flag = false;
_L12:
        b.a.a.a.d.c().b("Fabric", "There was a problem installing the exception handler.", exception);
          goto _L11
_L6:
        return true;
        exception;
          goto _L12
    }

    static boolean a(g g1, Activity activity, b.a.a.a.a.g.o o1)
    {
        ap ap1 = new ap(activity, o1);
        a a1 = g1. new a((byte)0);
        activity.runOnUiThread(new n(g1, activity, a1, ap1, o1));
        b.a.a.a.d.c();
        a1.b();
        return a1.a();
    }

    static void c(String s1)
    {
        com.a.a.a.a a1 = (com.a.a.a.a)b.a.a.a.d.a(com/a/a/a/a);
        if (a1 != null)
        {
            a1.a(new b.a.a.a.a.b.l.b(s1));
        }
    }

    static void d(String s1)
    {
        com.a.a.a.a a1 = (com.a.a.a.a)b.a.a.a.d.a(com/a/a/a/a);
        if (a1 != null)
        {
            a1.a(new b.a.a.a.a.b.l.a(s1));
        }
    }

    private static boolean e(String s1)
    {
        g g1 = f();
        if (g1 == null || g1.j == null)
        {
            b.a.a.a.d.c().b("Fabric", (new StringBuilder("Crashlytics must be initialized by calling Fabric.with(Context) ")).append(s1).toString(), null);
            return false;
        } else
        {
            return true;
        }
    }

    public static g f()
    {
        return (g)b.a.a.a.d.a(com/a/a/c/g);
    }

    private static String f(String s1)
    {
        String s2 = s1;
        if (s1 != null)
        {
            s1 = s1.trim();
            s2 = s1;
            if (s1.length() > 1024)
            {
                s2 = s1.substring(0, 1024);
            }
        }
        return s2;
    }

    static b.a.a.a.a.g.p s()
    {
        b.a.a.a.a.g.t t1 = b.a.a.a.a.g.q.a().b();
        if (t1 == null)
        {
            return null;
        } else
        {
            return t1.b;
        }
    }

    private void z()
    {
        Object obj = new com.a.a.c.h(this);
        for (Iterator iterator = y().iterator(); iterator.hasNext(); ((b.a.a.a.a.c.l) (obj)).a((b.a.a.a.a.c.q)iterator.next())) { }
        obj = w().b().submit(((java.util.concurrent.Callable) (obj)));
        b.a.a.a.d.c();
        try
        {
            ((Future) (obj)).get(4L, TimeUnit.SECONDS);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            b.a.a.a.d.c().b("Fabric", "Crashlytics was interrupted during initialization.", interruptedexception);
            return;
        }
        catch (ExecutionException executionexception)
        {
            b.a.a.a.d.c().b("Fabric", "Problem encountered during Crashlytics initialization.", executionexception);
            return;
        }
        catch (TimeoutException timeoutexception)
        {
            b.a.a.a.d.c().b("Fabric", "Crashlytics timed out during initialization.", timeoutexception);
        }
    }

    final an a(b.a.a.a.a.g.t t1)
    {
        if (t1 != null)
        {
            return new ao(this, b.a.a.a.a.b.j.c(v(), "com.crashlytics.ApiEndpoint"), t1.a.d, v);
        } else
        {
            return null;
        }
    }

    public final String a()
    {
        return "2.3.2.56";
    }

    public final void a(String s1)
    {
        a(3, "Fabric", s1);
    }

    public final void a(String s1, String s2)
    {
        a(1, s1, s2);
        b.a.a.a.d.c().a(1, s1, s2, true);
    }

    public final void a(Throwable throwable)
    {
        while (t || !e("prior to logging exceptions.")) 
        {
            return;
        }
        if (throwable == null)
        {
            b.a.a.a.d.c().a(5, "Fabric", "Crashlytics is ignoring a request to log a null exception.");
            return;
        } else
        {
            j.a(Thread.currentThread(), throwable);
            return;
        }
    }

    protected final boolean a_()
    {
        return a(super.v());
    }

    public final String b()
    {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    public final void b(String s1)
    {
        if (t)
        {
            return;
        } else
        {
            k = f(s1);
            return;
        }
    }

    public final void b(String s1, String s2)
    {
        if (t)
        {
            return;
        }
        String s3 = f(s1);
        if (b.size() < 64 || b.containsKey(s3))
        {
            if (s2 == null)
            {
                s1 = "";
            } else
            {
                s1 = f(s2);
            }
            b.put(s3, s1);
            return;
        } else
        {
            b.a.a.a.d.c();
            return;
        }
    }

    protected final Void c()
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        w.a(new i(this));
        j.e();
        flag2 = true;
        flag1 = true;
        flag = flag2;
        Object obj = b.a.a.a.a.g.q.a().b();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        flag = flag2;
        b.a.a.a.d.c().a("Fabric", "Received null settings, skipping initialization!");
        A();
        return null;
        flag = flag2;
        if (!((b.a.a.a.a.g.t) (obj)).d.c) goto _L2; else goto _L1
_L1:
        flag2 = false;
        flag1 = false;
        flag = flag2;
        j.d();
        flag = flag2;
        obj = a(((b.a.a.a.a.g.t) (obj)));
        if (obj == null) goto _L4; else goto _L3
_L3:
        flag = flag2;
        (new aw(((an) (obj)))).a(s);
_L2:
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        b.a.a.a.d.c();
        A();
        return null;
_L4:
        flag = flag2;
        b.a.a.a.d.c().a("Fabric", "Unable to create a call to upload reports.");
          goto _L2
        Object obj1;
        obj1;
        b.a.a.a.d.c().b("Fabric", "Error dealing with settings", ((Throwable) (obj1)));
        flag1 = flag;
          goto _L2
        obj1;
        b.a.a.a.d.c().b("Fabric", "Problem encountered during Crashlytics initialization.", ((Throwable) (obj1)));
        A();
        return null;
        obj1;
        A();
        throw obj1;
    }

    protected final Object e()
    {
        return c();
    }

    final Map g()
    {
        return Collections.unmodifiableMap(b);
    }

    final String h()
    {
        return o;
    }

    final String i()
    {
        return p;
    }

    final String j()
    {
        return r;
    }

    final String k()
    {
        return q;
    }

    final x l()
    {
        return j;
    }

    final String m()
    {
        if (u().a())
        {
            return k;
        } else
        {
            return null;
        }
    }

    final String n()
    {
        if (u().a())
        {
            return l;
        } else
        {
            return null;
        }
    }

    final String o()
    {
        if (u().a())
        {
            return m;
        } else
        {
            return null;
        }
    }

    final com.a.a.c.a.a.d p()
    {
        com.a.a.c.a.a.d d1 = null;
        if (x != null)
        {
            d1 = x.a();
        }
        return d1;
    }

    final File q()
    {
        return (new b.a.a.a.a.f.a(this)).a();
    }

    final boolean r()
    {
        return ((Boolean)b.a.a.a.a.g.q.a().a(new com.a.a.c.l(this), Boolean.valueOf(false))).booleanValue();
    }
}
