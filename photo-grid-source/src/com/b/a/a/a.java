// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a;

import a.a.a.a.a.b.l;
import a.a.a.a.a.f.b;
import a.a.a.a.a.f.d;
import a.a.a.a.a.g.m;
import a.a.a.a.a.g.q;
import a.a.a.a.a.g.v;
import a.a.a.a.f;
import a.a.a.a.p;
import a.a.a.a.s;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import java.io.File;
import java.util.Collections;

// Referenced classes of package com.b.a.a:
//            v, b, y, z, 
//            j, ac, h, i

public class a extends p
{

    j a;
    com.b.a.a.v b;
    a.a.a.a.a c;
    private String d;
    private String j;
    private long k;

    public a()
    {
    }

    private Boolean e()
    {
        com.b.a.a.v v1;
        Object obj;
        String s1;
        try
        {
            obj = q.a().b();
        }
        catch (Exception exception)
        {
            f.d().b("Answers", "Error dealing with settings", exception);
            return Boolean.valueOf(false);
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        f.d().c("Answers", "Failed to retrieve settings");
        return Boolean.valueOf(false);
        if (((v) (obj)).d.d)
        {
            f.d();
            v1 = b;
            obj = ((v) (obj)).e;
            s1 = l.c(v(), "com.crashlytics.ApiEndpoint");
            v1.a.a(((a.a.a.a.a.g.b) (obj)), s1);
            return Boolean.valueOf(true);
        }
        f.d();
        c.a();
        b.a.a();
        return Boolean.valueOf(false);
    }

    public final String a()
    {
        return "1.3.2.79";
    }

    public final void a(a.a.a.a.a.b.p p1)
    {
        if (b != null)
        {
            Object obj = b;
            Object obj1 = p1.a();
            if (Looper.myLooper() == Looper.getMainLooper())
            {
                throw new IllegalStateException("onCrash called from main thread!!!");
            }
            f.d();
            p1 = ((com.b.a.a.v) (obj)).a;
            obj = Collections.singletonMap("sessionId", obj1);
            obj1 = new y(z.i);
            obj1.c = ((java.util.Map) (obj));
            p1.a(((y) (obj1)), true, false);
        }
    }

    public final String b()
    {
        return "com.crashlytics.sdk.android:answers";
    }

    protected final Object d()
    {
        return e();
    }

    protected final boolean e_()
    {
        Context context;
        PackageInfo packageinfo;
        context = v();
        a = new j(new d(context, "settings"));
        c = new a.a.a.a.a(context);
        packageinfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        d = Integer.toString(packageinfo.versionCode);
        Object obj;
        boolean flag;
        long l1;
        if (packageinfo.versionName == null)
        {
            obj = "0.0";
        } else
        {
            try
            {
                obj = packageinfo.versionName;
            }
            catch (Exception exception)
            {
                f.d().b("Answers", "Error retrieving app properties", exception);
                return false;
            }
        }
        j = ((String) (obj));
        if (android.os.Build.VERSION.SDK_INT < 9) goto _L2; else goto _L1
_L1:
        k = packageinfo.firstInstallTime;
_L6:
        obj = new ac(context, u(), d, j);
        obj = new com.b.a.a.b(this, context, new h(context, new b(this)), ((ac) (obj)), new a.a.a.a.a.e.b(f.d()));
        ((com.b.a.a.b) (obj)).c();
        b = new com.b.a.a.v(((com.b.a.a.b) (obj)));
        c.a(new i(b));
        l1 = k;
        if (a.b()) goto _L4; else goto _L3
_L3:
        if (System.currentTimeMillis() - l1 < 0x36ee80L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L5
_L7:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        f.d();
        obj = b;
        f.d();
        ((com.b.a.a.v) (obj)).a.a(new y(z.j), false, true);
        a.a();
_L8:
        return true;
_L2:
        k = (new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir)).lastModified();
          goto _L6
_L4:
        flag = false;
          goto _L7
        Exception exception1;
        exception1;
        f.d().b("Answers", "Failed to initialize", exception1);
          goto _L8
_L5:
        if (!flag) goto _L4; else goto _L9
_L9:
        flag = true;
          goto _L7
    }
}
