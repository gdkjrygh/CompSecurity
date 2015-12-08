// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

public class akl extends gyh
{

    public ala a;
    private String b;
    private String c;
    private long d;
    private akp e;
    private gxw f;

    public akl()
    {
    }

    private Boolean d()
    {
        Object obj;
        Object obj1;
        Object obj2;
        try
        {
            obj1 = hbw.a().a();
        }
        catch (Exception exception)
        {
            gya.a().c("Answers", "Error dealing with settings", exception);
            return Boolean.valueOf(false);
        }
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        gya.a().e("Answers", "Failed to retrieve settings");
        return Boolean.valueOf(false);
        if (((hbz) (obj1)).d.c)
        {
            gya.a().a("Answers", "Analytics collection enabled");
            obj = a;
            obj1 = ((hbz) (obj1)).e;
            obj2 = CommonUtils.d(super.k, "com.crashlytics.ApiEndpoint");
            obj = ((ala) (obj)).a;
            ((akm) (obj)).a(new akm._cls1(((akm) (obj)), ((hbg) (obj1)), ((String) (obj2))));
            return Boolean.valueOf(true);
        }
        gya.a().a("Answers", "Analytics collection disabled");
        obj = f;
        if (((gxw) (obj)).a != null)
        {
            obj = ((gxw) (obj)).a;
            for (obj1 = ((gxx) (obj)).a.iterator(); ((Iterator) (obj1)).hasNext(); ((gxx) (obj)).b.unregisterActivityLifecycleCallbacks(((android.app.Application.ActivityLifecycleCallbacks) (obj2))))
            {
                obj2 = (android.app.Application.ActivityLifecycleCallbacks)((Iterator) (obj1)).next();
            }

        }
        akm akm1 = a.a;
        akm1.a(new akm._cls2(akm1));
        return Boolean.valueOf(false);
    }

    public final String a()
    {
        return "1.3.2.79";
    }

    public final String b()
    {
        return "com.crashlytics.sdk.android:answers";
    }

    protected final boolean c_()
    {
        Context context;
        PackageInfo packageinfo;
        context = super.k;
        e = new akp(new hbe(context, "settings"));
        f = new gxw(context);
        packageinfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        b = Integer.toString(packageinfo.versionCode);
        Object obj;
        boolean flag;
        long l;
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
                gya.a().c("Answers", "Error retrieving app properties", exception);
                return false;
            }
        }
        c = ((String) (obj));
        if (android.os.Build.VERSION.SDK_INT < 9) goto _L2; else goto _L1
_L1:
        d = packageinfo.firstInstallTime;
_L6:
        obj = new alf(context, super.m, b, c);
        obj = new akm(this, context, new akn(context, new hbc(this)), ((alf) (obj)), new hav(gya.a()));
        ((akm) (obj)).a(new akm._cls4(((akm) (obj))));
        a = new ala(((akm) (obj)));
        f.a(new ako(a));
        l = d;
        if (e.a.a().getBoolean("analytics_launched", false)) goto _L4; else goto _L3
_L3:
        if (System.currentTimeMillis() - l < 0x36ee80L)
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
            break MISSING_BLOCK_LABEL_331;
        }
        gya.a().a("Answers", "New app install detected");
        obj = a;
        gya.a().a("Answers", "Logged install");
        ((ala) (obj)).a.a(new alc(com.crashlytics.android.answers.SessionEvent.Type.j), false, true);
        obj = e;
        ((akp) (obj)).a.a(((akp) (obj)).a.b().putBoolean("analytics_launched", true));
_L8:
        return true;
_L2:
        d = (new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir)).lastModified();
          goto _L6
_L4:
        flag = false;
          goto _L7
        Exception exception1;
        exception1;
        gya.a().c("Answers", "Failed to initialize", exception1);
          goto _L8
_L5:
        if (!flag) goto _L4; else goto _L9
_L9:
        flag = true;
          goto _L7
    }

    protected final Object e()
    {
        return d();
    }
}
