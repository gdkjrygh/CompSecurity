// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.crashlytics.android.internal.a;
import com.crashlytics.android.internal.al;
import com.crashlytics.android.internal.ao;
import com.crashlytics.android.internal.ap;
import com.crashlytics.android.internal.aq;
import com.crashlytics.android.internal.ar;
import com.crashlytics.android.internal.aw;
import com.crashlytics.android.internal.ba;
import com.crashlytics.android.internal.be;
import com.crashlytics.android.internal.bf;
import com.crashlytics.android.internal.bh;
import com.crashlytics.android.internal.bn;
import com.crashlytics.android.internal.bu;
import com.crashlytics.android.internal.c;
import com.crashlytics.android.internal.cj;
import com.crashlytics.android.internal.ck;
import com.crashlytics.android.internal.cl;
import com.crashlytics.android.internal.cm;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.crashlytics.android:
//            ak, al, bc, ba, 
//            ab, bb, aw, ac, 
//            x, af, ai, f, 
//            as, at, au, z, 
//            av, u, e

public final class d extends cl
{

    private static ContextWrapper j;
    private static String k;
    private static String l;
    private static String m;
    private static String n;
    private static String o;
    private static String p;
    private static String q;
    private static boolean r = false;
    private static u s = null;
    private static bu t;
    private static float u;
    private static d v;
    private final long a = System.currentTimeMillis();
    private final ConcurrentHashMap b = new ConcurrentHashMap();
    private e c;
    private bc d;
    private bn e;
    private String f;
    private String g;
    private String h;
    private String i;

    public d()
    {
        e = null;
        f = null;
        g = null;
        h = null;
    }

    static int a(d d1, float f1, int i1)
    {
        return (int)((float)i1 * f1);
    }

    private ak a(ac ac1)
    {
        String s1 = ba.a(new String[] {
            i
        });
        int i1 = bh.a(l).a();
        return new ak(p, k, o, n, s1, m, i1, q, "0", ac1);
    }

    static bc a(d d1)
    {
        return d1.d;
    }

    public static d a()
    {
        com/crashlytics/android/d;
        JVM INSTR monitorenter ;
        d d1 = (d)cm.a().a(com/crashlytics/android/d);
        if (d1 == null) goto _L2; else goto _L1
_L1:
        com/crashlytics/android/d;
        JVM INSTR monitorexit ;
        return d1;
_L2:
        if (v == null)
        {
            v = new d();
        }
        d1 = v;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(Context context)
    {
        a(context, 1.0F);
    }

    public static void a(Context context, float f1)
    {
        u = f1;
        if (!ba.d(context))
        {
            cm.a().a(new a());
        }
        cm.a(context, new cl[] {
            a(), new c()
        });
    }

    static void a(String s1)
    {
        c c1 = (c)cm.a().a(com/crashlytics/android/internal/c);
        if (c1 != null)
        {
            c1.a(new bf(s1));
        }
    }

    private void a(String s1, Context context, float f1)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        if (j == null) goto _L2; else goto _L1
_L1:
        cm.a().b().a("Crashlytics", "Crashlytics already started, ignoring re-initialization attempt.");
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        p = s1;
        j = new ContextWrapper(context.getApplicationContext());
        t = new bu(cm.a().b());
        cm.a().b().b("Crashlytics", (new StringBuilder("Initializing Crashlytics ")).append(c()).toString());
        Object obj;
        k = j.getPackageName();
        obj = j.getPackageManager();
        l = ((PackageManager) (obj)).getInstallerPackageName(k);
        cm.a().b().a("Crashlytics", (new StringBuilder("Installer package name is: ")).append(l).toString());
        obj = ((PackageManager) (obj)).getPackageInfo(k, 0);
        n = Integer.toString(((PackageInfo) (obj)).versionCode);
        if (((PackageInfo) (obj)).versionName != null) goto _L4; else goto _L3
_L3:
        obj = "0.0";
_L8:
        o = ((String) (obj));
        m = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
        q = Integer.toString(context.getApplicationInfo().targetSdkVersion);
        i = ba.i(context);
_L9:
        e = new bn(j);
        e.h();
        (new com.crashlytics.android.al(i, ba.a(j, "com.crashlytics.RequireBuildId", true))).a(s1, k);
        boolean flag = flag1;
        cm.a().b().a("Crashlytics", "Installing exception handler...");
        flag = flag1;
        d = new bc(Thread.getDefaultUncaughtExceptionHandler(), c, i);
        flag = flag1;
        flag1 = d.f();
        flag = flag1;
        d.d();
        flag = flag1;
        d.c();
        flag = flag1;
        d.h();
        flag = flag1;
        Thread.setDefaultUncaughtExceptionHandler(d);
        flag = flag1;
        cm.a().b().a("Crashlytics", "Successfully installed exception handler.");
        flag = flag1;
_L10:
        s1 = new CountDownLatch(1);
        (new Thread(new com.crashlytics.android.ba(this, context, f1, s1), "Crashlytics Initializer")).start();
        if (!flag) goto _L6; else goto _L5
_L5:
        cm.a().b().a("Crashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        if (s1.await(4000L, TimeUnit.MILLISECONDS)) goto _L6; else goto _L7
_L7:
        cm.a().b().c("Crashlytics", "Crashlytics initialization was not completed in the allotted time.");
          goto _L6
        s1;
        cm.a().b().a("Crashlytics", "Crashlytics was interrupted during initialization.", s1);
          goto _L6
        s1;
        throw s1;
_L4:
        obj = ((PackageInfo) (obj)).versionName;
          goto _L8
        Exception exception;
        exception;
        cm.a().b().a("Crashlytics", "Error setting up app properties", exception);
          goto _L9
        s1;
        cm.a().b().a("Crashlytics", "There was a problem installing the exception handler.", s1);
          goto _L10
    }

    public static void a(Throwable throwable)
    {
        d d1 = a();
        if (d1 == null || d1.d == null)
        {
            cm.a().b().a("Crashlytics", "Crashlytics must be initialized by calling Crashlytics.start(Context) prior to logging exceptions.", null);
            return;
        }
        if (throwable == null)
        {
            cm.a().b().a(5, "Crashlytics", "Crashlytics is ignoring a request to log a null exception.");
            return;
        } else
        {
            d1.d.a(Thread.currentThread(), throwable);
            return;
        }
    }

    static void a(boolean flag)
    {
        ba.a().edit().putBoolean("always_send_reports_opt_in", true).commit();
    }

    static boolean a(d d1, Activity activity, ap ap)
    {
        ab ab1 = new ab(activity, ap);
        bb bb1 = new bb(d1, (byte)0);
        activity.runOnUiThread(new com.crashlytics.android.aw(d1, activity, bb1, ab1, ap));
        cm.a().b().a("Crashlytics", "Waiting for user opt-in.");
        bb1.b();
        return bb1.a();
    }

    static boolean a(d d1, Context context, float f1)
    {
        return d1.b(context, f1);
    }

    static void b(String s1)
    {
        c c1 = (c)cm.a().a(com/crashlytics/android/internal/c);
        if (c1 != null)
        {
            c1.a(new be(s1));
        }
    }

    private boolean b(Context context, float f1)
    {
        Object obj;
        al al1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5 = true;
        flag4 = true;
        flag1 = false;
        obj = ba.g(w());
        try
        {
            ar.a().a(context, t, n, o, l()).c();
            context = ar.a().b();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            cm.a().b().a("Crashlytics", "Error dealing with settings", context);
            context = null;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_440;
        }
        al1 = ((aw) (context)).a;
        if (!"new".equals(al1.a)) goto _L2; else goto _L1
_L1:
        obj = a(com.crashlytics.android.ac.a(w(), ((String) (obj))));
        if (!(new x(l(), al1.b, t)).a(((ak) (obj)))) goto _L4; else goto _L3
_L3:
        flag2 = ar.a().d();
_L7:
        try
        {
            flag3 = ((aw) (context)).d.b;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            cm.a().b().a("Crashlytics", "Error getting collect reports setting.", context);
            flag3 = false;
        }
_L9:
        if (!flag2 || !flag3) goto _L6; else goto _L5
_L5:
        flag2 = flag5;
        flag3 = d.b() & true;
        flag2 = flag3;
        context = t();
        flag = flag1;
        flag2 = flag3;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        flag2 = flag3;
        (new af(context)).a(f1);
        flag2 = flag3;
        flag = flag1;
_L8:
        if (flag)
        {
            cm.a().b().a("Crashlytics", "Crash reporting disabled.");
        }
        return flag2;
_L4:
        cm.a().b().a("Crashlytics", "Failed to create app with Crashlytics service.", null);
        flag2 = false;
          goto _L7
_L2:
        try
        {
label0:
            {
                if (!"configured".equals(al1.a))
                {
                    break label0;
                }
                flag2 = ar.a().d();
            }
        }
        catch (Exception exception)
        {
            cm.a().b().a("Crashlytics", "Error performing auto configuration.", exception);
            flag2 = false;
        }
          goto _L7
        if (al1.d)
        {
            cm.a().b().a("Crashlytics", "Server says an update is required - forcing a full App update.");
            obj = a(com.crashlytics.android.ac.a(w(), ((String) (obj))));
            (new ai(l(), al1.b, t)).a(((ak) (obj)));
        }
        flag2 = true;
          goto _L7
        context;
        cm.a().b().a("Crashlytics", "Error sending crash report", context);
        flag = flag1;
          goto _L8
_L6:
        flag = true;
        flag2 = flag4;
          goto _L8
        flag3 = false;
        flag2 = false;
          goto _L9
    }

    public static String c()
    {
        return a().f();
    }

    public static void c(String s1)
    {
        a().f = d(s1);
    }

    private static String d(String s1)
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

    static String g()
    {
        return k;
    }

    static String h()
    {
        return l;
    }

    static String i()
    {
        return o;
    }

    static String j()
    {
        return n;
    }

    static String k()
    {
        return m;
    }

    static String l()
    {
        return ba.a(j, "com.crashlytics.ApiEndpoint");
    }

    static boolean n()
    {
        return ba.a().getBoolean("always_send_reports_opt_in", false);
    }

    static bu v()
    {
        return t;
    }

    final Map b()
    {
        return Collections.unmodifiableMap(b);
    }

    final bn d()
    {
        return e;
    }

    protected final void e()
    {
        Context context = super.w();
        String s1 = ck.a(context, false);
        if (s1 == null)
        {
            return;
        }
        try
        {
            a(s1, context, u);
            return;
        }
        catch (f f1)
        {
            throw f1;
        }
        catch (Exception exception)
        {
            cm.a().b().a("Crashlytics", "Crashlytics was not started due to an exception during initialization", exception);
        }
    }

    public final String f()
    {
        return cm.a().f();
    }

    final boolean m()
    {
        return ((Boolean)ar.a().a(new as(this), Boolean.valueOf(false))).booleanValue();
    }

    final bc o()
    {
        return d;
    }

    final String p()
    {
        if (e.a())
        {
            return f;
        } else
        {
            return null;
        }
    }

    final String q()
    {
        if (e.a())
        {
            return g;
        } else
        {
            return null;
        }
    }

    final String r()
    {
        if (e.a())
        {
            return h;
        } else
        {
            return null;
        }
    }

    final boolean s()
    {
        return ((Boolean)ar.a().a(new at(this), Boolean.valueOf(true))).booleanValue();
    }

    final z t()
    {
        return (z)ar.a().a(new au(this), null);
    }

    final aq u()
    {
        return (aq)ar.a().a(new av(this), null);
    }

}
