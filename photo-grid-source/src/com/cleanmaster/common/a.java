// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.common;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.picksinit.PicksMob;
import com.picksinit.b;
import java.io.File;
import java.util.List;
import java.util.Locale;

public final class a
{

    private static int a = 0;
    private static boolean b = true;
    private static long c = 0L;
    private static Locale d = null;
    private static boolean e = false;
    private static boolean f = false;

    public static int a(Context context, String s)
    {
        if (context == null || s == null || s.length() <= 0)
        {
            return -1;
        }
        context = context.getPackageManager();
        int k;
        try
        {
            k = context.getPackageInfo(s, 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return -1;
        }
        return k;
    }

    public static String a()
    {
        String s;
        try
        {
            s = android.provider.Settings.System.getString(PicksMob.getInstance().getContext().getContentResolver(), "android_id");
        }
        catch (Exception exception)
        {
            return "";
        }
        return s;
    }

    public static boolean a(Context context)
    {
        if (b(context, "com.android.vending"))
        {
            if ((context = c(context, "com.google.android.gsf")) != null && (((PackageInfo) (context)).applicationInfo.flags & 1) == 1)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context, Intent intent)
    {
        try
        {
            if (!(context instanceof Activity))
            {
                intent.addFlags(0x10000000);
            }
            context.startActivity(intent);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }

    public static boolean a(ApplicationInfo applicationinfo)
    {
        return (applicationinfo.flags & 1) == 0 && (applicationinfo.flags & 0x80) == 0;
    }

    public static boolean a(String s, Context context)
    {
        if (s == null || s.length() == 0)
        {
            return false;
        }
        boolean flag;
        try
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setClassName("com.android.vending", "com.android.vending.AssetBrowserActivity");
            intent.setFlags(0x10000000);
            intent.setData(Uri.parse(s));
            flag = a(context, intent);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return false;
        }
        return flag;
    }

    public static String b()
    {
        return PicksMob.getInstance().getChannelId();
    }

    public static void b(String s, Context context)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (a(context))
        {
            flag = flag1;
            if (!TextUtils.isEmpty(s))
            {
                flag = a(s, context);
            }
        }
        if (!flag && !TextUtils.isEmpty(s))
        {
            s = new Intent("android.intent.action.VIEW", Uri.parse(s));
            s.setFlags(0x10000000);
            a(context, s);
        }
    }

    public static final boolean b(Context context)
    {
        Context context1;
        Context context2;
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        context2 = obj;
        context1 = obj1;
        if ((new File((new StringBuilder("/data/data/")).append(context.getPackageName()).append("/databases/webviewCache.db").toString())).exists())
        {
            return false;
        }
        context2 = obj;
        context1 = obj1;
        context = context.openOrCreateDatabase("webviewCache.db", 0, null);
        if (context == null) goto _L2; else goto _L1
_L1:
        context2 = context;
        context1 = context;
        context.close();
        return false;
        context;
        context1 = context2;
        context.printStackTrace();
        if (context2 != null)
        {
            context2.close();
        }
_L4:
        return true;
_L2:
        if (context != null)
        {
            context.close();
        }
        if (true) goto _L4; else goto _L3
_L3:
        context;
        if (context1 != null)
        {
            context1.close();
        }
        throw context;
    }

    public static boolean b(Context context, String s)
    {
        if (context == null || s == null)
        {
            return false;
        }
        List list = com.cleanmaster.func.cache.a.a().c();
        if (list != null && list.size() > 0)
        {
            return list.contains(s);
        }
        try
        {
            context.getPackageManager().getPackageInfo(s, 256);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }

    public static PackageInfo c(Context context, String s)
    {
        if (context == null || s == null)
        {
            return null;
        }
        try
        {
            context = context.getPackageManager().getPackageInfo(s, 256);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static String c()
    {
        return PicksMob.getInstance().getContext().getPackageName();
    }

    public static boolean c(Context context)
    {
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getAllNetworkInfo();
        int l = context.length;
        for (int k = 0; k < l; k++)
        {
            NetworkInfo networkinfo = context[k];
            if (networkinfo.getTypeName().equalsIgnoreCase("WIFI"))
            {
                if (networkinfo.isConnected())
                {
                    return true;
                }
                continue;
            }
            if (networkinfo.getTypeName().equalsIgnoreCase("MOBILE") && networkinfo.isConnected())
            {
                return true;
            }
        }

        return false;
    }

    public static String d(Context context)
    {
        context = context.getResources().getDisplayMetrics();
        return String.format(Locale.US, "%d*%d", new Object[] {
            Integer.valueOf(((DisplayMetrics) (context)).heightPixels), Integer.valueOf(((DisplayMetrics) (context)).widthPixels)
        });
    }

    public static void d(Context context, String s)
    {
        s = com.cleanmaster.func.process.b.a(s);
        if (s != null)
        {
            if (!(context instanceof Activity))
            {
                s.addFlags(0x10000000);
            }
            a(context, s);
        }
    }

    public static float e(Context context)
    {
        return context.getResources().getDisplayMetrics().density;
    }

    public static String f(Context context)
    {
        if (context == null)
        {
            return null;
        }
        context = ((TelephonyManager)context.getSystemService("phone")).getSimOperator();
        if (context != null && context.length() >= 3)
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append(context, 0, 3);
            return stringbuilder.toString();
        } else
        {
            return null;
        }
    }

    public static String g(Context context)
    {
        if (context == null)
        {
            return null;
        }
        context = ((TelephonyManager)context.getSystemService("phone")).getSimOperator();
        if (context != null && context.length() >= 5)
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append(context, 3, 5);
            return stringbuilder.toString();
        } else
        {
            return "";
        }
    }

    public static String h(Context context)
    {
        if (context == null)
        {
            return null;
        }
        try
        {
            context = ((TelephonyManager)context.getSystemService("phone")).getDeviceId();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return "";
        }
        return context;
    }

    public static String i(Context context)
    {
        Object obj = null;
        if (context == null) goto _L2; else goto _L1
_L1:
        context = context.getResources();
        if (context == null) goto _L2; else goto _L3
_L3:
        Configuration configuration = context.getConfiguration();
        context = ((Context) (obj));
        if (configuration != null)
        {
            context = configuration.locale;
        }
        obj = context;
        if (context == null)
        {
            obj = Locale.getDefault();
        }
_L5:
        return ((Locale) (obj)).getLanguage();
_L2:
        obj = Locale.getDefault();
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static String j(Context context)
    {
        Object obj = null;
        if (context == null) goto _L2; else goto _L1
_L1:
        context = context.getResources();
        if (context == null) goto _L2; else goto _L3
_L3:
        Configuration configuration = context.getConfiguration();
        context = ((Context) (obj));
        if (configuration != null)
        {
            context = configuration.locale;
        }
        obj = context;
        if (context == null)
        {
            obj = Locale.getDefault();
        }
_L5:
        return ((Locale) (obj)).getCountry();
_L2:
        obj = Locale.getDefault();
        if (true) goto _L5; else goto _L4
_L4:
    }

}
