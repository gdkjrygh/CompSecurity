// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;

// Referenced classes of package com.flurry.sdk:
//            hg, hh, gd, fp

public class fm
    implements hh.a
{

    private static fm a;
    private static final String b = com/flurry/sdk/fm.getSimpleName();
    private String c;
    private String d;

    private fm()
    {
        hg hg1 = hg.a();
        c = (String)hg1.a("VersionName");
        hg1.a("VersionName", this);
        gd.a(4, b, (new StringBuilder()).append("initSettings, VersionName = ").append(c).toString());
    }

    public static fm a()
    {
        com/flurry/sdk/fm;
        JVM INSTR monitorenter ;
        fm fm1;
        if (a == null)
        {
            a = new fm();
        }
        fm1 = a;
        com/flurry/sdk/fm;
        JVM INSTR monitorexit ;
        return fm1;
        Exception exception;
        exception;
        throw exception;
    }

    public static void b()
    {
        if (a != null)
        {
            hg.a().b("VersionName", a);
        }
        a = null;
    }

    private String f()
    {
        Object obj;
        obj = fp.a().c();
        obj = ((Context) (obj)).getPackageManager().getPackageInfo(((Context) (obj)).getPackageName(), 0);
        if (((PackageInfo) (obj)).versionName != null)
        {
            return ((PackageInfo) (obj)).versionName;
        }
        if (((PackageInfo) (obj)).versionCode == 0)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        obj = Integer.toString(((PackageInfo) (obj)).versionCode);
        return ((String) (obj));
        Throwable throwable;
        throwable;
        gd.a(6, b, "", throwable);
        return "Unknown";
    }

    public void a(String s, Object obj)
    {
        if (s.equals("VersionName"))
        {
            c = (String)obj;
            gd.a(4, b, (new StringBuilder()).append("onSettingUpdate, VersionName = ").append(c).toString());
            return;
        } else
        {
            gd.a(6, b, "onSettingUpdate internal error!");
            return;
        }
    }

    public String c()
    {
        return android.os.Build.VERSION.RELEASE;
    }

    public String d()
    {
        return Build.DEVICE;
    }

    public String e()
    {
        this;
        JVM INSTR monitorenter ;
        if (TextUtils.isEmpty(c)) goto _L2; else goto _L1
_L1:
        String s = c;
_L4:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        if (!TextUtils.isEmpty(d))
        {
            s = d;
            continue; /* Loop/switch isn't completed */
        }
        d = f();
        s = d;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

}
