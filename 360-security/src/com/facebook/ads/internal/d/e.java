// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.facebook.ads.internal.c.a;
import com.facebook.ads.internal.f;
import com.facebook.ads.internal.util.h;

public class e
{

    public static final String a;
    public static String b = "";
    public static String c = "";
    public static String d = "";
    public static String e = "";
    public static String f = "";
    public static int g = 0;
    public static String h = "";
    public static int i = 0;
    public static String j = "";
    public static int k = 0;
    public static String l = "";
    public static String m = "";
    public static String n = "";
    public static boolean o = false;
    private static boolean p = false;

    public static void a(Context context)
    {
        com/facebook/ads/internal/d/e;
        JVM INSTR monitorenter ;
        if (!p)
        {
            p = true;
            c(context);
        }
        d(context);
        com/facebook/ads/internal/d/e;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static void b(Context context)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        if (!p)
        {
            return;
        }
        SharedPreferences sharedpreferences;
        boolean flag;
        try
        {
            System.currentTimeMillis();
            sharedpreferences = context.getSharedPreferences("SDKIDFA", 0);
            if (sharedpreferences.contains("attributionId"))
            {
                m = sharedpreferences.getString("attributionId", "");
            }
            if (sharedpreferences.contains("advertisingId"))
            {
                n = sharedpreferences.getString("advertisingId", "");
                o = sharedpreferences.getBoolean("limitAdTracking", o);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return;
        }
        obj = com.facebook.ads.internal.util.h.a(context.getContentResolver());
        context = com.facebook.ads.internal.f.a(context, ((com.facebook.ads.internal.util.h.a) (obj)));
_L1:
        System.currentTimeMillis();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        obj = ((com.facebook.ads.internal.util.h.a) (obj)).a;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        m = ((String) (obj));
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        obj = context.a();
        flag = context.b();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        n = ((String) (obj));
        o = Boolean.valueOf(flag).booleanValue();
        context = sharedpreferences.edit();
        context.putString("attributionId", m);
        context.putString("advertisingId", n);
        context.putBoolean("limitAdTracking", o);
        context.apply();
        return;
        context;
        obj = null;
_L2:
        context.printStackTrace();
        context = obj1;
          goto _L1
        context;
          goto _L2
    }

    private static void c(Context context)
    {
        Object obj = context.getPackageManager();
        try
        {
            PackageInfo packageinfo = ((PackageManager) (obj)).getPackageInfo(context.getPackageName(), 0);
            d = packageinfo.packageName;
            f = packageinfo.versionName;
            g = packageinfo.versionCode;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception1)
        {
            com.facebook.ads.internal.c.a.a((new StringBuilder()).append("Failed to retrieve BUNDLE, APPVERS, APPBUILD").append(namenotfoundexception1.getMessage()).toString());
        }
        obj = ((PackageManager) (obj)).getApplicationLabel(((PackageManager) (obj)).getApplicationInfo(context.getPackageName(), 0));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        if (((CharSequence) (obj)).length() <= 0)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        e = ((CharSequence) (obj)).toString();
_L1:
        context = (TelephonyManager)context.getSystemService("phone");
        if (context != null)
        {
            context = context.getNetworkOperatorName();
            android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
            if (context != null && context.length() > 0)
            {
                h = context;
            } else
            {
                com.facebook.ads.internal.c.a.a("Failed to retrieve CARRIER");
            }
        }
        context = Build.MANUFACTURER;
        if (context != null && context.length() > 0)
        {
            b = context;
        } else
        {
            com.facebook.ads.internal.c.a.a("Failed to retrieve MAKE");
        }
        context = Build.MODEL;
        if (context != null && context.length() > 0)
        {
            c = Build.MODEL;
            return;
        } else
        {
            com.facebook.ads.internal.c.a.a("Failed to retrieve MODEL");
            return;
        }
        try
        {
            com.facebook.ads.internal.c.a.a("Failed to retrieve APPNAME");
        }
        // Misplaced declaration of an exception variable
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            com.facebook.ads.internal.c.a.a((new StringBuilder()).append("Failed to retrieve APPNAME ").append(namenotfoundexception.getMessage()).toString());
        }
          goto _L1
    }

    private static void d(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        if (context.isConnectedOrConnecting())
        {
            i = context.getType();
            j = context.getTypeName();
            k = context.getSubtype();
            l = context.getSubtypeName();
            return;
        }
        try
        {
            com.facebook.ads.internal.c.a.a("No network connection is currently active");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            com.facebook.ads.internal.c.a.a("Missing permission ACCESS_NETWORK_STATE");
        }
        return;
    }

    static 
    {
        a = android.os.Build.VERSION.RELEASE;
    }
}
