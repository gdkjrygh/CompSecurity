// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;

// Referenced classes of package com.flurry.sdk:
//            do, el

public class eb
{

    private static final String a = com/flurry/sdk/eb.getSimpleName();
    private static String b;
    private static String c;

    public eb()
    {
    }

    public static String a()
    {
        com/flurry/sdk/eb;
        JVM INSTR monitorenter ;
        if (TextUtils.isEmpty(b)) goto _L2; else goto _L1
_L1:
        String s = b;
_L4:
        com/flurry/sdk/eb;
        JVM INSTR monitorexit ;
        return s;
_L2:
        if (!TextUtils.isEmpty(c))
        {
            s = c;
            continue; /* Loop/switch isn't completed */
        }
        s = b();
        c = s;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(String s)
    {
        b = s;
    }

    private static String b()
    {
        Object obj;
        obj = com.flurry.sdk.do.a().b();
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
        el.a(6, a, "", throwable);
        return "Unknown";
    }

}
