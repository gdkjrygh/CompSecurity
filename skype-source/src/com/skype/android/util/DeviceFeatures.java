// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

public class DeviceFeatures
{

    static final Method a;
    private static final Logger b;

    public DeviceFeatures()
    {
    }

    private static Object a(String s)
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        s = ((String) (a.invoke(null, new Object[] {
            s
        })));
        return s;
        s;
_L2:
        return "unknown";
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean a()
    {
        return !"tablet".equals(a("ro.build.characteristics")) || !Build.MANUFACTURER.equalsIgnoreCase("Amazon");
    }

    public static boolean a(Context context)
    {
        return context.getResources().getConfiguration().keyboard == 2 || d() && (Build.MODEL.equals("Classic") || Build.MODEL.equals("Q10") || Build.MODEL.equals("Q5") || Build.MODEL.equals("Passport"));
    }

    public static boolean b()
    {
        return "market".startsWith("amazon_gen6") || "market".startsWith("amazon_gen7");
    }

    public static boolean b(Context context)
    {
        context = context.getPackageManager();
        try
        {
            context.getPackageInfo("com.android.vending", 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }

    public static boolean c()
    {
        return Build.MANUFACTURER.equalsIgnoreCase("Amazon");
    }

    public static boolean d()
    {
        return Build.PRODUCT.equalsIgnoreCase("BlackBerry");
    }

    public static boolean e()
    {
        return Build.MANUFACTURER.equalsIgnoreCase("Nokia");
    }

    public static boolean f()
    {
        return !Build.MODEL.equalsIgnoreCase("Lenovo A606");
    }

    static 
    {
        Method method;
        b = Logger.getLogger("DeviceFeatures");
        method = null;
        Method method1 = android/os/Build.getDeclaredMethod("getString", new Class[] {
            java/lang/String
        });
        method = method1;
        method1.setAccessible(true);
        method = method1;
_L2:
        a = method;
        return;
        NoSuchMethodException nosuchmethodexception;
        nosuchmethodexception;
        b.warning("build_getString NoSuchMethod getString");
        if (true) goto _L2; else goto _L1
_L1:
    }
}
