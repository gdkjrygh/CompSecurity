// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.File;

// Referenced classes of package com.crashlytics.android.internal:
//            cl, cm, j, w, 
//            bg, bi, bn, e, 
//            ai, cj, n, ar, 
//            aw, ao, ba, be, 
//            bf, bu, d

public class c extends cl
{

    private String a;
    private String b;
    private String c;
    private bn d;
    private ai e;
    private long f;
    private bu g;
    private n h;

    public c()
    {
    }

    public static c a()
    {
        return (c)cm.a().a(com/crashlytics/android/internal/c);
    }

    static void a(c c1)
    {
        Object obj = c1.w();
        j j1;
        String s;
        String s1;
        String s2;
        String s3;
        android.app.Application application;
        j1 = new j(new w(), new bg(), new bi(cm.a().i(), "session_analytics.tap", "session_analytics_to_send"));
        s = c1.d.b();
        s1 = c1.d.g();
        s2 = c1.d.c();
        s3 = c1.d.d();
        application = cm.a().c();
        if (application == null) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT < 14) goto _L2; else goto _L3
_L3:
        c1.h = new e(application, ((Context) (obj)).getPackageName(), s, s1, s2, s3, c1.b, c1.c, j1, c1.g);
_L11:
        long l = c1.f;
        if (c1.e.a().getBoolean("analytics_launched", false)) goto _L5; else goto _L4
_L4:
        boolean flag;
        if (System.currentTimeMillis() - l < 0x36ee80L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L6
_L12:
        if (flag)
        {
            try
            {
                cm.a().b().a("Crashlytics", "First launch");
                if (c1.h != null)
                {
                    c1.h.b();
                    c1.e.a(c1.e.b().putBoolean("analytics_launched", true));
                }
            }
            catch (Exception exception)
            {
                ba.d("Crashlytics failed to initialize session analytics.");
            }
        }
        ar.a().a(((Context) (obj)), c1.g, c1.b, c1.c, c1.b()).c();
        obj = ar.a().b();
        if (obj == null) goto _L8; else goto _L7
_L7:
        if (((aw) (obj)).d.c) goto _L10; else goto _L9
_L9:
        ba.c("Disabling analytics collection based on settings flag value.");
        c1.h.a();
_L8:
        return;
_L2:
        c1.h = new n(((Context) (obj)).getPackageName(), s, s1, s2, s3, c1.b, c1.c, j1, c1.g);
          goto _L11
_L5:
        flag = false;
          goto _L12
_L10:
        try
        {
            c1.h.a(((aw) (obj)).e, c1.b());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            cm.a().b().a("Crashlytics", "Error dealing with settings", c1);
        }
        return;
_L6:
        if (!flag) goto _L5; else goto _L13
_L13:
        flag = true;
          goto _L12
    }

    private String b()
    {
        return ba.a(w(), "com.crashlytics.ApiEndpoint");
    }

    public final void a(be be1)
    {
        if (h != null)
        {
            h.a(be1.a());
        }
    }

    public final void a(bf bf1)
    {
        if (h != null)
        {
            h.b(bf1.a());
        }
    }

    protected final void e()
    {
        Context context;
        PackageInfo packageinfo;
        g = new bu(cm.a().b());
        e = new ai(cm.a().a(com/crashlytics/android/internal/c));
        context = w();
        PackageManager packagemanager = context.getPackageManager();
        d = new bn(context);
        a = context.getPackageName();
        packageinfo = packagemanager.getPackageInfo(a, 0);
        b = Integer.toString(packageinfo.versionCode);
        if (packageinfo.versionName != null) goto _L2; else goto _L1
_L1:
        String s = "0.0";
_L3:
        c = s;
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        f = packageinfo.firstInstallTime;
_L4:
        (new Thread(new d(this), "Crashlytics Initializer")).start();
        return;
_L2:
        s = packageinfo.versionName;
          goto _L3
        try
        {
            f = (new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir)).lastModified();
        }
        catch (Exception exception)
        {
            cm.a().b().a("Crashlytics", "Error setting up app properties", exception);
        }
          goto _L4
    }
}
