// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import b.a.a.a.a.b.j;
import b.a.a.a.a.b.p;
import b.a.a.a.a.b.t;
import b.a.a.a.a.b.z;
import b.a.a.a.a.d.q;
import b.a.a.a.a.e.b;
import b.a.a.a.a.f.c;
import b.a.a.a.a.g.m;
import b.a.a.a.d;
import b.a.a.a.l;
import b.a.a.a.o;
import java.io.File;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.a.a.a:
//            m, s, r, c, 
//            t, f, o, q

public class a extends l
{

    com.a.a.a.o a;
    private String b;
    private String c;
    private b.a.a.a.a.f.b d;
    private long j;

    public a()
    {
    }

    public static a c()
    {
        return (a)b.a.a.a.d.a(com/a/a/a/a);
    }

    private Boolean f()
    {
        Context context = v();
        Object obj;
        Object obj1;
        Object obj2;
        obj = new com.a.a.a.m(context, new s(), new z(), new q(v(), (new b.a.a.a.a.f.a(this)).a(), "session_analytics.tap", "session_analytics_to_send"));
        obj2 = u();
        Object obj3 = ((t) (obj2)).g();
        obj1 = context.getPackageName();
        obj2 = ((t) (obj2)).b();
        String s1 = (String)((Map) (obj3)).get(b.a.a.a.a.b.t.a.d);
        String s2 = (String)((Map) (obj3)).get(b.a.a.a.a.b.t.a.g);
        obj3 = (String)((Map) (obj3)).get(b.a.a.a.a.b.t.a.c);
        String s3 = b.a.a.a.a.b.j.m(context);
        String s4 = t.d();
        String s5 = t.e();
        obj1 = new r(((String) (obj1)), UUID.randomUUID().toString(), ((String) (obj2)), s1, s2, ((String) (obj3)), s3, s4, s5, b, c);
        obj2 = (Application)v().getApplicationContext();
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT < 14) goto _L2; else goto _L3
_L3:
        b b1 = new b(b.a.a.a.d.c());
        java.util.concurrent.ScheduledExecutorService scheduledexecutorservice1 = p.b("Crashlytics Trace Manager");
        a = new com.a.a.a.c(((r) (obj1)), new com.a.a.a.t(((Context) (obj2)), new f(((Context) (obj2)), scheduledexecutorservice1, ((com.a.a.a.m) (obj)), b1), ((com.a.a.a.m) (obj)), scheduledexecutorservice1), ((Application) (obj2)));
_L8:
        long l1 = j;
        if (d.a().getBoolean("analytics_launched", false)) goto _L5; else goto _L4
_L4:
        java.util.concurrent.ScheduledExecutorService scheduledexecutorservice;
        boolean flag;
        if (System.currentTimeMillis() - l1 < 0x36ee80L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L6
_L9:
        if (flag)
        {
            try
            {
                b.a.a.a.d.c();
                obj = a;
                ((com.a.a.a.o) (obj)).b.a(q.a(((com.a.a.a.o) (obj)).a), true);
                d.a(d.b().putBoolean("analytics_launched", true));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                b.a.a.a.a.b.j.a(context, "Crashlytics failed to initialize session analytics.");
            }
        }
        try
        {
            obj = b.a.a.a.a.g.q.a().b();
        }
        catch (Exception exception)
        {
            b.a.a.a.d.c().b("Answers", "Error dealing with settings", exception);
            return Boolean.valueOf(false);
        }
        if (obj == null)
        {
            return Boolean.valueOf(false);
        }
          goto _L7
_L2:
        obj2 = new b(b.a.a.a.d.c());
        scheduledexecutorservice = p.b("Crashlytics SAM");
        a = new com.a.a.a.o(((r) (obj1)), new com.a.a.a.t(context, new f(context, scheduledexecutorservice, ((com.a.a.a.m) (obj)), ((b.a.a.a.a.e.g) (obj2))), ((com.a.a.a.m) (obj)), scheduledexecutorservice));
          goto _L8
_L5:
        flag = false;
          goto _L9
_L7:
        if (((b.a.a.a.a.g.t) (obj)).d.d)
        {
            a.a(((b.a.a.a.a.g.t) (obj)).e, b.a.a.a.a.b.j.c(v(), "com.crashlytics.ApiEndpoint"));
            return Boolean.valueOf(true);
        }
        b.a.a.a.a.b.j.e(context);
        a.a();
        return Boolean.valueOf(false);
_L6:
        if (!flag) goto _L5; else goto _L10
_L10:
        flag = true;
          goto _L9
    }

    public final String a()
    {
        return "1.2.2.56";
    }

    public final void a(b.a.a.a.a.b.l.a a1)
    {
        if (a != null)
        {
            com.a.a.a.o o1 = a;
            a1 = a1.a();
            if (Looper.myLooper() == Looper.getMainLooper())
            {
                throw new IllegalStateException("onCrash called from main thread!!!");
            }
            o1.b.a(com.a.a.a.q.b(o1.a, a1));
        }
    }

    public final void a(b.a.a.a.a.b.l.b b1)
    {
        if (a != null)
        {
            com.a.a.a.o o1 = a;
            b1 = b1.a();
            o1.b.a(q.a(o1.a, b1), false);
        }
    }

    protected final boolean a_()
    {
        Context context;
        PackageInfo packageinfo;
        d = new c(this);
        context = v();
        packageinfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        b = Integer.toString(packageinfo.versionCode);
        String s1;
        if (packageinfo.versionName == null)
        {
            s1 = "0.0";
        } else
        {
            try
            {
                s1 = packageinfo.versionName;
            }
            catch (Exception exception)
            {
                b.a.a.a.d.c().b("Answers", "Error setting up app properties", exception);
                return false;
            }
        }
        c = s1;
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            j = packageinfo.firstInstallTime;
            break MISSING_BLOCK_LABEL_134;
        }
        j = (new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir)).lastModified();
        return true;
    }

    public final String b()
    {
        return "com.crashlytics.sdk.android:answers";
    }

    protected final Object e()
    {
        return f();
    }
}
