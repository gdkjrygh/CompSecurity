// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.dto;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.facebook.ads.internal.util.g;

public class f
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
        com/facebook/ads/internal/dto/f;
        JVM INSTR monitorenter ;
        if (!p)
        {
            p = true;
            c(context);
        }
        d(context);
        com/facebook/ads/internal/dto/f;
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
        obj = com.facebook.ads.internal.util.g.a(context.getContentResolver());
        context = com.facebook.ads.internal.f.a(context, ((com.facebook.ads.internal.util.g.a) (obj)));
_L1:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        obj = ((com.facebook.ads.internal.util.g.a) (obj)).a;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        m = ((String) (obj));
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        obj = context.a();
        flag = context.b();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_144;
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
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        try
        {
            PackageInfo packageinfo = ((PackageManager) (obj)).getPackageInfo(context.getPackageName(), 0);
            d = packageinfo.packageName;
            f = packageinfo.versionName;
            g = packageinfo.versionCode;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception1) { }
        obj = ((PackageManager) (obj)).getApplicationLabel(((PackageManager) (obj)).getApplicationInfo(context.getPackageName(), 0));
        if (obj != null)
        {
            try
            {
                if (((CharSequence) (obj)).length() > 0)
                {
                    e = ((CharSequence) (obj)).toString();
                }
            }
            // Misplaced declaration of an exception variable
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception) { }
        }
        context = (TelephonyManager)context.getSystemService("phone");
        if (context != null)
        {
            context = context.getNetworkOperatorName();
            if (context != null && context.length() > 0)
            {
                h = context;
            }
        }
        context = Build.MANUFACTURER;
        if (context != null && context.length() > 0)
        {
            b = context;
        }
        context = Build.MODEL;
        if (context != null && context.length() > 0)
        {
            c = Build.MODEL;
        }
        return;
    }

    private static void d(Context context)
    {
        try
        {
            context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        if (context.isConnectedOrConnecting())
        {
            i = context.getType();
            j = context.getTypeName();
            k = context.getSubtype();
            l = context.getSubtypeName();
        }
    }

    static 
    {
        a = android.os.Build.VERSION.RELEASE;
    }
}
