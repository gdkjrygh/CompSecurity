// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.f;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;

// Referenced classes of package com.mobvista.sdk.m.a.f:
//            j

public final class b
{

    private static String a;
    private static String b;
    private static String c;
    private static float d = 1.0F;

    public static String a()
    {
        return Build.MODEL;
    }

    public static String a(Context context)
    {
        Object obj;
        String s1;
        try
        {
            s1 = ((TelephonyManager)context.getApplicationContext().getSystemService("phone")).getDeviceId();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("DeviceUtil", Log.getStackTraceString(context));
            return "";
        }
        obj = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        context = t(context);
        obj = context;
        if (context == null)
        {
            obj = "";
        }
        return ((String) (obj));
    }

    private static String a(Context context, File file)
    {
        context = UUID.randomUUID();
        a(file, context.toString());
        return context.toString();
    }

    private static String a(Context context, String s1)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo(s1, 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("DeviceUtil", Log.getStackTraceString(context));
            return "";
        }
        return context;
    }

    private static String a(File file)
    {
        file = new RandomAccessFile(file, "r");
        byte abyte0[] = new byte[(int)file.length()];
        file.readFully(abyte0);
        file.close();
        return new String(abyte0);
    }

    private static void a(File file, String s1)
    {
        if (!file.getParentFile().exists())
        {
            file.getParentFile().mkdirs();
        }
        file.createNewFile();
        file = new FileOutputStream(file);
        file.write(s1.getBytes());
        file.close();
    }

    public static void a(String s1)
    {
        b = s1;
    }

    public static String b()
    {
        return Build.BRAND;
    }

    public static String b(Context context)
    {
        try
        {
            context = ((TelephonyManager)context.getApplicationContext().getSystemService("phone")).getSubscriberId();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("DeviceUtil", Log.getStackTraceString(context));
            return "";
        }
        return context;
    }

    public static float c()
    {
        return d;
    }

    public static String c(Context context)
    {
        context = ((TelephonyManager)context.getApplicationContext().getSystemService("phone")).getSimOperator();
        if (com.mobvista.sdk.m.a.f.j.b(context) && context.length() > 3)
        {
            return context.substring(0, 3);
        } else
        {
            return "";
        }
    }

    public static String d()
    {
        com/mobvista/sdk/m/a/f/b;
        JVM INSTR monitorenter ;
        String s1 = c;
        com/mobvista/sdk/m/a/f/b;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public static String d(Context context)
    {
        context = ((TelephonyManager)context.getApplicationContext().getSystemService("phone")).getSimOperator();
        if (com.mobvista.sdk.m.a.f.j.b(context) && context.length() > 3)
        {
            return context.substring(3, context.length());
        } else
        {
            return "";
        }
    }

    public static String e()
    {
        return TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
    }

    public static String e(Context context)
    {
        try
        {
            context = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("DeviceUtil", Log.getStackTraceString(context));
            return "";
        }
        return context;
    }

    public static int f()
    {
        return android.os.Build.VERSION.SDK_INT;
    }

    public static String f(Context context)
    {
        return context.getResources().getConfiguration().locale.getLanguage();
    }

    public static String g()
    {
        if (b == null)
        {
            return "";
        } else
        {
            return b;
        }
    }

    public static String g(Context context)
    {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    public static String h(Context context)
    {
        try
        {
            context = ((WifiManager)context.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getMacAddress();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("DeviceUtil", Log.getStackTraceString(context));
            return "";
        }
        if (context == null)
        {
            return "";
        }
        context = context.replaceAll(":", "").toLowerCase(Locale.ENGLISH);
        return context;
    }

    public static int i(Context context)
    {
        int i1;
        try
        {
            i1 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("DeviceUtil", Log.getStackTraceString(context));
            return -1;
        }
        return i1;
    }

    public static String j(Context context)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("DeviceUtil", Log.getStackTraceString(context));
            return "";
        }
        return context;
    }

    public static int k(Context context)
    {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int l(Context context)
    {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static String m(Context context)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("DeviceUtil", Log.getStackTraceString(context));
            return "";
        }
        return context;
    }

    public static String n(Context context)
    {
        try
        {
            PackageManager packagemanager = context.getPackageManager();
            context = (String)packagemanager.getApplicationLabel(packagemanager.getApplicationInfo(m(context), 0));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("DeviceUtil", Log.getStackTraceString(context));
            return "";
        }
        return context;
    }

    public static String o(Context context)
    {
        com/mobvista/sdk/m/a/f/b;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            if (Looper.myLooper() != Looper.getMainLooper())
            {
                throw new IllegalArgumentException("\u5FC5\u987B\u5728\u4E3B\u7EBF\u7A0B\u521D\u59CB\u5316sdk\uFF01\uFF01\uFF01\uFF01");
            }
            break MISSING_BLOCK_LABEL_35;
        }
          goto _L1
        context;
        com/mobvista/sdk/m/a/f/b;
        JVM INSTR monitorexit ;
        throw context;
        Constructor constructor = android/webkit/WebSettings.getDeclaredConstructor(new Class[] {
            android/content/Context, android/webkit/WebView
        });
        constructor.setAccessible(true);
        c = ((WebSettings)constructor.newInstance(new Object[] {
            context, null
        })).getUserAgentString();
        constructor.setAccessible(false);
_L2:
        if (TextUtils.isEmpty(c))
        {
            c = "Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19";
        }
_L1:
        context = c;
        com/mobvista/sdk/m/a/f/b;
        JVM INSTR monitorexit ;
        return context;
        Throwable throwable;
        throwable;
        Log.e("DeviceUtil", Log.getStackTraceString(throwable));
        c = (new WebView(context)).getSettings().getUserAgentString();
          goto _L2
        context;
        Log.e("DeviceUtil", Log.getStackTraceString(context));
          goto _L2
    }

    public static void p(Context context)
    {
        d = context.getResources().getDisplayMetrics().density;
    }

    public static int q(Context context)
    {
        context = ((ConnectivityManager)context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (context == null)
        {
            return 9;
        }
        int i1 = context.getType();
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        boolean flag = context.getExtraInfo().toLowerCase().equals("cmnet");
        if (flag)
        {
            i1 = 3;
        } else
        {
            i1 = 2;
        }
_L4:
        return i1;
_L2:
        if (i1 != 1);
        i1 = 9;
        continue; /* Loop/switch isn't completed */
        context;
        Log.e("DeviceUtil", Log.getStackTraceString(context));
        i1 = 9;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String r(Context context)
    {
        return a(context, "com.google.android.gms");
    }

    public static String s(Context context)
    {
        return a(context, "com.android.vending");
    }

    private static String t(Context context)
    {
        File file;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        file = new File(Environment.getExternalStorageDirectory().toString(), "/.a/track_id.bin");
        if (file.exists())
        {
            break MISSING_BLOCK_LABEL_47;
        }
        a = a(context, file);
_L1:
        if (a == null)
        {
            return "";
        } else
        {
            return a;
        }
        try
        {
            a = a(file);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("DeviceUtil", Log.getStackTraceString(context));
        }
          goto _L1
    }

}
