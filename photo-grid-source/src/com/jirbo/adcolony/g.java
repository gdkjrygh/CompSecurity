// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Locale;

// Referenced classes of package com.jirbo.adcolony:
//            AdColony, a, aj

class g
{

    static String a;
    static boolean b;

    g()
    {
    }

    static String a()
    {
        return android.provider.Settings.Secure.getString(AdColony.activity().getContentResolver(), "android_id");
    }

    static String b()
    {
        String s1 = ((TelephonyManager)AdColony.activity().getSystemService("phone")).getNetworkOperatorName();
        String s = s1;
        if (s1.length() == 0)
        {
            s = "unknown";
        }
        return s;
    }

    static int c()
    {
        Context context = com.jirbo.adcolony.a.b().getApplicationContext();
        com.jirbo.adcolony.a.b();
        return ((ActivityManager)context.getSystemService("activity")).getMemoryClass();
    }

    static long d()
    {
        Runtime runtime = Runtime.getRuntime();
        return (runtime.totalMemory() - runtime.freeMemory()) / 0x100000L;
    }

    static String e()
    {
        return aj.a(com.jirbo.adcolony.a.b());
    }

    static int f()
    {
        return com.jirbo.adcolony.a.b().getWindowManager().getDefaultDisplay().getWidth();
    }

    static int g()
    {
        return com.jirbo.adcolony.a.b().getWindowManager().getDefaultDisplay().getHeight();
    }

    static String h()
    {
        return "";
    }

    static boolean i()
    {
        if (a.X == null) goto _L2; else goto _L1
_L1:
        if (!a.X.equals("tablet")) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        DisplayMetrics displaymetrics = AdColony.activity().getResources().getDisplayMetrics();
        float f1 = (float)displaymetrics.widthPixels / displaymetrics.xdpi;
        float f2 = (float)displaymetrics.heightPixels / displaymetrics.ydpi;
        if (Math.sqrt(f2 * f2 + f1 * f1) < 6D)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    static String j()
    {
        return Locale.getDefault().getLanguage();
    }

    static String k()
    {
        String s;
        try
        {
            s = ((WifiManager)AdColony.activity().getSystemService("wifi")).getConnectionInfo().getMacAddress();
        }
        catch (RuntimeException runtimeexception)
        {
            return null;
        }
        return s;
    }

    static String l()
    {
        return Build.MANUFACTURER;
    }

    static String m()
    {
        return Build.MODEL;
    }

    static String n()
    {
        return "";
    }

    static String o()
    {
        return android.os.Build.VERSION.RELEASE;
    }
}
