// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import b.a.a.a.a.b.j;
import b.a.a.a.a.b.l;
import b.a.a.a.a.b.t;
import b.a.a.a.a.b.x;
import b.a.a.a.a.c.s;
import b.a.a.a.a.c.y;
import b.a.a.a.a.c.z;
import b.a.a.a.a.e.b;
import b.a.a.a.a.e.m;
import b.a.a.a.a.g.e;
import b.a.a.a.a.g.v;
import b.a.a.a.f;
import b.a.a.a.o;
import b.a.a.a.p;
import b.a.a.a.q;
import com.a.a.a.a;
import com.a.a.c.a.d;
import java.io.File;
import java.util.Arrays;
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

// Referenced classes of package com.a.a:
//            t, i, k, x, 
//            y, a, bn, z, 
//            l, as, s, o, 
//            ar, j, bk, m, 
//            w, bi, aq

public class h extends o
    implements p
{

    private final long a;
    private final ConcurrentHashMap g;
    private final Collection h;
    private File i;
    private w j;
    private com.a.a.z k;
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
    private final bi v;
    private m w;
    private com.a.a.t x;
    private com.a.a.c.a y;

    public h()
    {
        this((byte)0);
    }

    private h(byte byte0)
    {
        this(b.a.a.a.a.b.t.a("Crashlytics Exception Handler"));
    }

    private h(ExecutorService executorservice)
    {
        l = null;
        m = null;
        n = null;
        g = new ConcurrentHashMap();
        a = System.currentTimeMillis();
        t = 1.0F;
        j = null;
        v = null;
        u = false;
        x = new com.a.a.t(executorservice);
        h = Collections.unmodifiableCollection(Arrays.asList(new o[] {
            new a(), new com.a.a.b.a()
        }));
    }

    private void A()
    {
        Object obj = new i(this);
        for (Iterator iterator = z().iterator(); iterator.hasNext(); ((s) (obj)).a((y)iterator.next())) { }
        obj = x().b().submit(((java.util.concurrent.Callable) (obj)));
        b.a.a.a.f.c().a("Fabric", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try
        {
            ((Future) (obj)).get(4L, TimeUnit.SECONDS);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            b.a.a.a.f.c().c("Fabric", "Crashlytics was interrupted during initialization.", interruptedexception);
            return;
        }
        catch (ExecutionException executionexception)
        {
            b.a.a.a.f.c().c("Fabric", "Problem encountered during Crashlytics initialization.", executionexception);
            return;
        }
        catch (TimeoutException timeoutexception)
        {
            b.a.a.a.f.c().c("Fabric", "Crashlytics timed out during initialization.", timeoutexception);
        }
    }

    private void B()
    {
        x.b(new k(this));
    }

    static int a(float f1, int i1)
    {
        return (int)((float)i1 * f1);
    }

    static File a(h h1)
    {
        return h1.i;
    }

    static void a(String s1)
    {
        a a1 = (a)b.a.a.a.f.a(com/a/a/a/a);
        if (a1 != null)
        {
            a1.a(new b.a.a.a.a.b.p(s1));
        }
    }

    public static void a(String s1, boolean flag)
    {
label0:
        {
            String s3 = Boolean.toString(flag);
            h h1 = f();
            boolean flag1;
            if (h1 == null || h1.u)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!flag1)
            {
                String s2 = b(s1);
                if (f().g.size() >= 64 && !f().g.containsKey(s2))
                {
                    break label0;
                }
                if (s3 == null)
                {
                    s1 = "";
                } else
                {
                    s1 = b(s3);
                }
                f().g.put(s2, s1);
            }
            return;
        }
        b.a.a.a.f.c().a("Fabric", "Exceeded maximum number of custom attributes (64)");
    }

    private boolean a(Context context)
    {
        if (u)
        {
            return false;
        }
        new j();
        if (b.a.a.a.a.b.j.a(context) == null)
        {
            return false;
        }
        b.a.a.a.f.c().b("Fabric", "Initializing Crashlytics 2.2.4.42");
        i = new File(q(), "initialization_marker");
        if (v == null) goto _L2; else goto _L1
_L1:
        Object obj = new com.a.a.y(v);
_L8:
        w = new b(b.a.a.a.f.c());
        w.a(((b.a.a.a.a.e.n) (obj)));
        p = context.getPackageName();
        q = v().h();
        b.a.a.a.f.c().a("Fabric", (new StringBuilder("Installer package name is: ")).append(q).toString());
        obj = context.getPackageManager().getPackageInfo(p, 0);
        r = Integer.toString(((PackageInfo) (obj)).versionCode);
        if (((PackageInfo) (obj)).versionName != null) goto _L4; else goto _L3
_L3:
        obj = "0.0";
_L9:
        s = ((String) (obj));
        o = b.a.a.a.a.b.l.l(context);
_L10:
        Exception exception;
        boolean flag;
        try
        {
            v().i();
            (new com.a.a.a(o, b.a.a.a.a.b.l.a(context, "com.crashlytics.RequireBuildId", true))).();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            b.a.a.a.f.c().c("Fabric", "Crashlytics was not started due to an exception during initialization", context);
            return false;
        }
        obj = new bn(w(), o, p);
        b.a.a.a.f.c().a("Fabric", "Installing exception handler...");
        k = new com.a.a.z(Thread.getDefaultUncaughtExceptionHandler(), x, v(), ((bn) (obj)), this);
        flag = ((Boolean)x.a(new com.a.a.l(this))).booleanValue();
        k.b();
        Thread.setDefaultUncaughtExceptionHandler(k);
        b.a.a.a.f.c().a("Fabric", "Successfully installed exception handler.");
_L11:
        if (!flag) goto _L6; else goto _L5
_L5:
        if (!b.a.a.a.a.b.l.m(context)) goto _L6; else goto _L7
_L7:
        A();
        return false;
_L2:
        obj = null;
          goto _L8
_L4:
        obj = ((PackageInfo) (obj)).versionName;
          goto _L9
        exception;
        b.a.a.a.f.c().c("Fabric", "Error setting up app properties", exception);
          goto _L10
        context;
        throw new z(context);
        exception;
        flag = false;
_L12:
        b.a.a.a.f.c().c("Fabric", "There was a problem installing the exception handler.", exception);
          goto _L11
_L6:
        return true;
        exception;
          goto _L12
    }

    static boolean a(h h1, Activity activity, b.a.a.a.a.g.o o1)
    {
        as as1 = new as(activity, o1);
        com.a.a.s s1 = new com.a.a.s(h1, (byte)0);
        activity.runOnUiThread(new com.a.a.o(h1, activity, s1, as1, o1));
        b.a.a.a.f.c().a("Fabric", "Waiting for user opt-in.");
        s1.b();
        return s1.a();
    }

    private static String b(String s1)
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

    public static h f()
    {
        h h1;
        try
        {
            h1 = (h)b.a.a.a.f.a(com/a/a/h);
        }
        catch (IllegalStateException illegalstateexception)
        {
            b.a.a.a.f.c().c("Fabric", "Crashlytics must be initialized by calling Fabric.with(Context) prior to calling Crashlytics.getInstance()", null);
            throw illegalstateexception;
        }
        return h1;
    }

    static b.a.a.a.a.g.p s()
    {
        v v1 = b.a.a.a.a.g.q.a().b();
        if (v1 == null)
        {
            return null;
        } else
        {
            return v1.b;
        }
    }

    final aq a(v v1)
    {
        if (v1 != null)
        {
            return new ar(this, b.a.a.a.a.b.l.d(f().w(), "com.crashlytics.ApiEndpoint"), v1.a.d, w);
        } else
        {
            return null;
        }
    }

    protected final boolean a()
    {
        return a(super.w());
    }

    protected final Void b()
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        x.a(new com.a.a.j(this));
        k.e();
        flag2 = true;
        flag1 = true;
        flag = flag2;
        Object obj = b.a.a.a.a.g.q.a().b();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        flag = flag2;
        b.a.a.a.f.c().c("Fabric", "Received null settings, skipping initialization!");
        B();
        return null;
        flag = flag2;
        if (!((v) (obj)).d.c) goto _L2; else goto _L1
_L1:
        flag2 = false;
        flag1 = false;
        flag = flag2;
        k.d();
        flag = flag2;
        obj = a(((v) (obj)));
        if (obj == null) goto _L4; else goto _L3
_L3:
        flag = flag2;
        (new bk(((aq) (obj)))).a(t);
_L2:
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        b.a.a.a.f.c().a("Fabric", "Crash reporting disabled.");
        B();
        return null;
_L4:
        flag = flag2;
        b.a.a.a.f.c().c("Fabric", "Unable to create a call to upload reports.");
          goto _L2
        Object obj1;
        obj1;
        b.a.a.a.f.c().c("Fabric", "Error dealing with settings", ((Throwable) (obj1)));
        flag1 = flag;
          goto _L2
        obj1;
        b.a.a.a.f.c().c("Fabric", "Problem encountered during Crashlytics initialization.", ((Throwable) (obj1)));
        B();
        return null;
        obj1;
        B();
        throw obj1;
    }

    public final String c()
    {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    public final String d()
    {
        return "2.2.4.42";
    }

    public final Collection e()
    {
        return h;
    }

    final Map g()
    {
        return Collections.unmodifiableMap(g);
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

    final com.a.a.z l()
    {
        return k;
    }

    final String m()
    {
        if (v().a())
        {
            return l;
        } else
        {
            return null;
        }
    }

    final String n()
    {
        if (v().a())
        {
            return m;
        } else
        {
            return null;
        }
    }

    final String o()
    {
        if (v().a())
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
        return (new b.a.a.a.a.f.a(this)).a();
    }

    final boolean r()
    {
        return ((Boolean)b.a.a.a.a.g.q.a().a(new com.a.a.m(this), Boolean.valueOf(false))).booleanValue();
    }

    protected final Object t()
    {
        return b();
    }
}
