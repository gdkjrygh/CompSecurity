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
import b.a.a.a.a.b.ah;
import b.a.a.a.a.b.l;
import b.a.a.a.a.b.p;
import b.a.a.a.a.b.t;
import b.a.a.a.a.b.x;
import b.a.a.a.a.b.y;
import b.a.a.a.a.d.r;
import b.a.a.a.a.e.b;
import b.a.a.a.a.f.c;
import b.a.a.a.a.g.m;
import b.a.a.a.a.g.v;
import b.a.a.a.f;
import b.a.a.a.o;
import b.a.a.a.q;
import java.io.File;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.a.a.a:
//            i, p, o, c, 
//            q, f, k, m

public class a extends o
{

    k a;
    private String g;
    private String h;
    private b.a.a.a.a.f.b i;
    private long j;

    public a()
    {
    }

    public static a b()
    {
        return (a)f.a(com/a/a/a/a);
    }

    private Boolean e()
    {
        Context context = w();
        Object obj;
        Object obj1;
        Object obj2;
        obj = new i(context, new com.a.a.a.p(), new ah(), new r(w(), (new b.a.a.a.a.f.a(this)).a(), "session_analytics.tap", "session_analytics_to_send"));
        obj2 = v();
        Object obj3 = ((x) (obj2)).g();
        obj1 = context.getPackageName();
        obj2 = ((x) (obj2)).b();
        String s = (String)((Map) (obj3)).get(y.d);
        String s1 = (String)((Map) (obj3)).get(y.g);
        obj3 = (String)((Map) (obj3)).get(y.c);
        String s2 = l.l(context);
        String s3 = x.d();
        String s4 = x.e();
        obj1 = new com.a.a.a.o(((String) (obj1)), UUID.randomUUID().toString(), ((String) (obj2)), s, s1, ((String) (obj3)), s2, s3, s4, g, h);
        obj2 = (Application)w().getApplicationContext();
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT < 14) goto _L2; else goto _L3
_L3:
        b b1 = new b(f.c());
        java.util.concurrent.ScheduledExecutorService scheduledexecutorservice1 = b.a.a.a.a.b.t.b("Crashlytics Trace Manager");
        a = new com.a.a.a.c(((com.a.a.a.o) (obj1)), new com.a.a.a.q(((Context) (obj2)), new com.a.a.a.f(((Context) (obj2)), scheduledexecutorservice1, ((i) (obj)), b1), ((i) (obj)), scheduledexecutorservice1), ((Application) (obj2)));
_L8:
        long l1 = j;
        if (i.a().getBoolean("analytics_launched", false)) goto _L5; else goto _L4
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
                f.c().a("Answers", "First launch");
                obj = a;
                ((k) (obj)).b.a(m.a(((k) (obj)).a), true);
                i.a(i.b().putBoolean("analytics_launched", true));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                l.b(context, "Crashlytics failed to initialize session analytics.");
            }
        }
        try
        {
            obj = b.a.a.a.a.g.q.a().b();
        }
        catch (Exception exception)
        {
            f.c().c("Answers", "Error dealing with settings", exception);
            return Boolean.valueOf(false);
        }
        if (obj == null)
        {
            return Boolean.valueOf(false);
        }
          goto _L7
_L2:
        obj2 = new b(f.c());
        scheduledexecutorservice = b.a.a.a.a.b.t.b("Crashlytics SAM");
        a = new k(((com.a.a.a.o) (obj1)), new com.a.a.a.q(context, new com.a.a.a.f(context, scheduledexecutorservice, ((i) (obj)), ((b.a.a.a.a.e.m) (obj2))), ((i) (obj)), scheduledexecutorservice));
          goto _L8
_L5:
        flag = false;
          goto _L9
_L7:
        if (((v) (obj)).d.d)
        {
            a.a(((v) (obj)).e, l.d(w(), "com.crashlytics.ApiEndpoint"));
            return Boolean.valueOf(true);
        }
        l.a(context, "Disabling analytics collection based on settings flag value.");
        a.a();
        return Boolean.valueOf(false);
_L6:
        if (!flag) goto _L5; else goto _L10
_L10:
        flag = true;
          goto _L9
    }

    public final void a(p p1)
    {
        if (a != null)
        {
            k k1 = a;
            p1 = p1.a();
            if (Looper.myLooper() == Looper.getMainLooper())
            {
                throw new IllegalStateException("onCrash called from main thread!!!");
            }
            k1.b.a(m.a(k1.a, p1));
        }
    }

    protected final boolean a()
    {
        Context context;
        PackageInfo packageinfo;
        i = new c(this);
        context = w();
        packageinfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        g = Integer.toString(packageinfo.versionCode);
        String s;
        if (packageinfo.versionName == null)
        {
            s = "0.0";
        } else
        {
            try
            {
                s = packageinfo.versionName;
            }
            catch (Exception exception)
            {
                f.c().c("Answers", "Error setting up app properties", exception);
                return false;
            }
        }
        h = s;
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            j = packageinfo.firstInstallTime;
            break MISSING_BLOCK_LABEL_133;
        }
        j = (new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir)).lastModified();
        return true;
    }

    public final String c()
    {
        return "com.crashlytics.sdk.android:answers";
    }

    public final String d()
    {
        return "1.2.0.42";
    }

    protected final Object t()
    {
        return e();
    }
}
