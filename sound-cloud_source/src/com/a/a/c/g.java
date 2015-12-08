// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import b.a.a.a.a.b.h;
import b.a.a.a.a.b.j;
import b.a.a.a.a.b.p;
import b.a.a.a.a.b.t;
import b.a.a.a.a.c.r;
import b.a.a.a.a.e.b;
import b.a.a.a.a.g.m;
import b.a.a.a.a.g.o;
import b.a.a.a.a.g.q;
import b.a.a.a.d;
import b.a.a.a.k;
import b.a.a.a.l;
import com.a.a.a.a;
import com.a.a.a.e;
import com.a.a.a.z;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

// Referenced classes of package com.a.a.c:
//            r, Q, n, v, 
//            w, a, ac, x, 
//            k, A, h, j, 
//            P, L, z, i, 
//            C, B, aa, l, 
//            u, W, O

public class g extends l
{
    private final class a
    {

        boolean a;
        final CountDownLatch b;
        final g c;

        final void a(boolean flag)
        {
            a = flag;
            b.countDown();
        }

        private a()
        {
            c = g.this;
            super();
            a = false;
            b = new CountDownLatch(1);
        }

        a(byte byte0)
        {
            this();
        }
    }


    final ConcurrentHashMap a;
    public x b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    public boolean j;
    com.a.a.c.a.a k;
    private final long q;
    private File r;
    private File s;
    private u t;
    private String u;
    private float v;
    private final W w;
    private b.a.a.a.a.e.g x;
    private com.a.a.c.r y;

    public g()
    {
        this((byte)0);
    }

    private g(byte byte0)
    {
        ExecutorService executorservice = Executors.newSingleThreadExecutor(p.a("Crashlytics Exception Handler"));
        p.a("Crashlytics Exception Handler", executorservice);
        this(executorservice);
    }

    private g(ExecutorService executorservice)
    {
        c = null;
        d = null;
        e = null;
        a = new ConcurrentHashMap();
        q = System.currentTimeMillis();
        v = 1.0F;
        t = null;
        w = null;
        j = false;
        y = new com.a.a.c.r(executorservice);
    }

    static int a(float f1, int i1)
    {
        return (int)((float)i1 * f1);
    }

    static File a(g g1)
    {
        return g1.s;
    }

    static void a(String s1)
    {
        Object obj = (com.a.a.a.a)b.a.a.a.d.a(com/a/a/a/a);
        if (obj != null)
        {
            s1 = new b.a.a.a.a.b.l.b(s1);
            if (((com.a.a.a.a) (obj)).b != null)
            {
                obj = ((com.a.a.a.a) (obj)).b;
                Object obj1 = ((b.a.a.a.a.b.l) (s1)).a;
                b.a.a.a.d.a();
                s1 = ((z) (obj)).a;
                obj = Collections.singletonMap("sessionId", obj1);
                obj1 = new com.a.a.a.B.a(com.a.a.a.B.b.h);
                obj1.c = ((java.util.Map) (obj));
                s1.a(((com.a.a.a.B.a) (obj1)), false, false);
            }
        }
    }

    private boolean a(Activity activity, o o)
    {
        Q q1 = new Q(activity, o);
        a a1 = new a((byte)0);
        activity.runOnUiThread(new n(this, activity, a1, q1, o));
        b.a.a.a.d.a();
        try
        {
            a1.b.await();
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity) { }
        return a1.a;
    }

    private boolean a(Context context)
    {
        if (j)
        {
            return false;
        }
        new h();
        if (b.a.a.a.a.b.h.a(context) == null)
        {
            return false;
        }
        b.a.a.a.d.a();
        s = new File(g(), "initialization_marker");
        if (w == null) goto _L2; else goto _L1
_L1:
        Object obj = new w(w);
_L5:
        x = new b(b.a.a.a.d.a());
        x.a(((b.a.a.a.a.e.h) (obj)));
        f = context.getPackageName();
        g = super.p.e();
        b.a.a.a.d.a();
        (new StringBuilder("Installer package name is: ")).append(g);
        obj = context.getPackageManager().getPackageInfo(f, 0);
        h = Integer.toString(((PackageInfo) (obj)).versionCode);
        if (((PackageInfo) (obj)).versionName != null) goto _L4; else goto _L3
_L3:
        obj = "0.0";
_L6:
        i = ((String) (obj));
        u = b.a.a.a.a.b.j.m(context);
_L7:
        try
        {
            super.p.h();
            obj = new com.a.a.c.a(u, b.a.a.a.a.b.j.a(context, "com.crashlytics.RequireBuildId", true));
            if (b.a.a.a.a.b.j.d(((com.a.a.c.a) (obj)).a) && ((com.a.a.c.a) (obj)).b)
            {
                throw new v("This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            b.a.a.a.d.a();
            return false;
        }
        break MISSING_BLOCK_LABEL_272;
        context;
        throw new r(context);
_L2:
        obj = null;
          goto _L5
_L4:
        obj = ((PackageInfo) (obj)).versionName;
          goto _L6
        obj;
        b.a.a.a.d.a();
          goto _L7
        if (!((com.a.a.c.a) (obj)).b)
        {
            b.a.a.a.d.a();
        }
        boolean flag;
        ac ac1 = new ac(super.n, u, f);
        b.a.a.a.d.a();
        b = new x(Thread.getDefaultUncaughtExceptionHandler(), y, super.p, ac1, this);
        flag = ((Boolean)y.a(new com.a.a.c.k(this))).booleanValue();
        x x1 = b;
        x1.f.b(new A(x1));
        Thread.setDefaultUncaughtExceptionHandler(b);
        b.a.a.a.d.a();
_L9:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!b.a.a.a.a.b.j.n(context))
        {
            break; /* Loop/switch isn't completed */
        }
        m();
        return false;
_L10:
        b.a.a.a.d.a();
        if (true) goto _L9; else goto _L8
_L8:
        return true;
        Exception exception;
        exception;
          goto _L10
        exception;
        flag = false;
          goto _L10
    }

    static boolean a(g g1, Activity activity, o o)
    {
        return g1.a(activity, o);
    }

    static void b(String s1)
    {
        Object obj = (com.a.a.a.a)b.a.a.a.d.a(com/a/a/a/a);
        if (obj != null)
        {
            s1 = new b.a.a.a.a.b.l.a(s1);
            if (((com.a.a.a.a) (obj)).b != null)
            {
                obj = ((com.a.a.a.a) (obj)).b;
                Object obj1 = ((b.a.a.a.a.b.l) (s1)).a;
                if (Looper.myLooper() == Looper.getMainLooper())
                {
                    throw new IllegalStateException("onCrash called from main thread!!!");
                }
                b.a.a.a.d.a();
                s1 = ((z) (obj)).a;
                obj = Collections.singletonMap("sessionId", obj1);
                obj1 = new com.a.a.a.B.a(com.a.a.a.B.b.i);
                obj1.c = ((java.util.Map) (obj));
                s1.a(((com.a.a.a.B.a) (obj1)), true, false);
            }
        }
    }

    private static String c(String s1)
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

    public static g f()
    {
        return (g)b.a.a.a.d.a(com/a/a/c/g);
    }

    static b.a.a.a.a.g.p i()
    {
        b.a.a.a.a.g.t t1 = b.a.a.a.a.g.q.a.a().a();
        if (t1 == null)
        {
            return null;
        } else
        {
            return t1.b;
        }
    }

    public static boolean j()
    {
        g g1 = f();
        if (g1 == null || g1.b == null)
        {
            b.a.a.a.d.a();
            return false;
        } else
        {
            return true;
        }
    }

    private void m()
    {
        Object obj = new com.a.a.c.h(this);
        for (Iterator iterator = super.m.f().iterator(); iterator.hasNext(); ((b.a.a.a.a.c.l) (obj)).a((b.a.a.a.a.c.q)iterator.next())) { }
        obj = super.l.c.submit(((java.util.concurrent.Callable) (obj)));
        b.a.a.a.d.a();
        try
        {
            ((Future) (obj)).get(4L, TimeUnit.SECONDS);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            b.a.a.a.d.a();
            return;
        }
        catch (ExecutionException executionexception)
        {
            b.a.a.a.d.a();
            return;
        }
        catch (TimeoutException timeoutexception)
        {
            b.a.a.a.d.a();
        }
    }

    private void n()
    {
        y.b(new com.a.a.c.j(this));
    }

    final O a(b.a.a.a.a.g.t t1)
    {
        if (t1 != null)
        {
            return new P(this, b.a.a.a.a.b.j.b(super.n, "com.crashlytics.ApiEndpoint"), t1.a.d, x);
        } else
        {
            return null;
        }
    }

    public final String a()
    {
        return "2.3.5.79";
    }

    public final void a(int i1, String s1, String s2)
    {
        while (j || !j()) 
        {
            return;
        }
        long l1 = System.currentTimeMillis();
        long l2 = q;
        x x1 = b;
        s1 = (new StringBuilder()).append(b.a.a.a.a.b.j.b(i1)).append("/").append(s1).append(" ").append(s2).toString();
        x1.f.b(new L(x1, l1 - l2, s1));
    }

    public final void a(String s1, String s2)
    {
        if (j)
        {
            return;
        }
        if (s1 == null)
        {
            if (super.n != null && b.a.a.a.a.b.j.j(super.n))
            {
                throw new IllegalArgumentException("Custom attribute key must not be null.");
            } else
            {
                b.a.a.a.d.a();
                return;
            }
        }
        String s3 = c(s1);
        if (a.size() < 64 || a.containsKey(s3))
        {
            if (s2 == null)
            {
                s1 = "";
            } else
            {
                s1 = c(s2);
            }
            a.put(s3, s1);
            s1 = b;
            s2 = a;
            ((x) (s1)).f.b(new com.a.a.c.z(s1, s2));
            return;
        } else
        {
            b.a.a.a.d.a();
            return;
        }
    }

    public final String b()
    {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    protected final Void c()
    {
        boolean flag;
        y.a(new i(this));
        x x1 = b;
        x1.f.a(new C(x1));
        flag = true;
        Object obj = b.a.a.a.a.g.q.a.a().a();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        b.a.a.a.d.a();
        n();
        return null;
        boolean flag2 = ((b.a.a.a.a.g.t) (obj)).d.c;
        if (!flag2) goto _L2; else goto _L1
_L1:
        boolean flag1;
        flag1 = false;
        flag = false;
        x x2 = b;
        ((Boolean)x2.f.a(new B(x2))).booleanValue();
        obj = a(((b.a.a.a.a.g.t) (obj)));
        if (obj == null) goto _L4; else goto _L3
_L3:
        (new aa(((O) (obj)))).a(v);
_L2:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        b.a.a.a.d.a();
        n();
        return null;
_L4:
        b.a.a.a.d.a();
        flag = false;
          goto _L2
        Object obj1;
        obj1;
        flag = true;
_L5:
        b.a.a.a.d.a();
          goto _L2
        obj1;
        b.a.a.a.d.a();
        n();
        return null;
        obj1;
        n();
        throw obj1;
        obj1;
        flag = flag1;
          goto _L5
    }

    protected final Object d()
    {
        return c();
    }

    protected final boolean e()
    {
        return a(super.n);
    }

    final File g()
    {
        if (r == null)
        {
            r = (new b.a.a.a.a.f.b(this)).a();
        }
        return r;
    }

    final boolean h()
    {
        return ((Boolean)b.a.a.a.a.g.q.a.a().a(new com.a.a.c.l(this), Boolean.valueOf(false))).booleanValue();
    }
}
