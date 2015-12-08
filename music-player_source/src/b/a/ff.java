// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package b.a:
//            fg, fj

public class ff
{

    protected static final String a = b/a/ff.getName();

    public ff()
    {
    }

    private static int a(Object obj, String s)
    {
        int i1;
        try
        {
            s = android/util/DisplayMetrics.getDeclaredField(s);
            s.setAccessible(true);
            i1 = s.getInt(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
            return -1;
        }
        return i1;
    }

    public static String a()
    {
        String s;
        String s2;
        Object obj;
        obj = null;
        s2 = null;
        s = obj;
        FileReader filereader = new FileReader("/proc/cpuinfo");
        String s1;
        s1 = s2;
        s = obj;
        BufferedReader bufferedreader = new BufferedReader(filereader, 1024);
        s1 = s2;
        s = obj;
        s2 = bufferedreader.readLine();
        s1 = s2;
        s = s2;
        bufferedreader.close();
        s1 = s2;
        s = s2;
        filereader.close();
        s = s2;
_L1:
        FileNotFoundException filenotfoundexception;
        IOException ioexception;
        if (s != null)
        {
            return s.substring(s.indexOf(':') + 1).trim();
        } else
        {
            return "";
        }
        ioexception;
        s = s1;
        fg.b(a, "Could not read from file /proc/cpuinfo", ioexception);
        s = s1;
          goto _L1
        filenotfoundexception;
        fg.b(a, "Could not open file /proc/cpuinfo", filenotfoundexception);
          goto _L1
    }

    public static String a(Context context)
    {
        int i1;
        try
        {
            i1 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return "";
        }
        return String.valueOf(i1);
    }

    public static boolean a(Context context, String s)
    {
        return context.getPackageManager().checkPermission(s, context.getPackageName()) == 0;
    }

    public static String b(Context context)
    {
        try
        {
            context = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return "";
        }
        return context;
    }

    public static String c(Context context)
    {
        TelephonyManager telephonymanager;
        telephonymanager = (TelephonyManager)context.getSystemService("phone");
        if (telephonymanager == null)
        {
            fg.d(a, "No IMEI.");
        }
        if (!a(context, "android.permission.READ_PHONE_STATE")) goto _L2; else goto _L1
_L1:
        String s1 = telephonymanager.getDeviceId();
_L4:
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            fg.d(a, "No IMEI.");
            s1 = k(context);
            s = s1;
            if (TextUtils.isEmpty(s1))
            {
                fg.d(a, "Failed to take mac as IMEI. Try to use Secure.ANDROID_ID instead.");
                s = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
                fg.a(a, (new StringBuilder("getDeviceId: Secure.ANDROID_ID: ")).append(s).toString());
            }
        }
        return s;
        Exception exception;
        exception;
        fg.c(a, "No IMEI.", exception);
_L2:
        s1 = "";
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String d(Context context)
    {
        return fj.b(c(context));
    }

    public static String[] e(Context context)
    {
        String as[];
        as = new String[2];
        as[0] = "";
        as[1] = "";
        if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0)
        {
            as[0] = "";
            return as;
        }
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context == null)
        {
            as[0] = "";
            return as;
        }
        if (context.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.CONNECTED)
        {
            as[0] = "Wi-Fi";
            return as;
        }
        context = context.getNetworkInfo(0);
        if (context.getState() != android.net.NetworkInfo.State.CONNECTED)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        as[0] = "2G/3G";
        as[1] = context.getSubtypeName();
        return as;
        context;
        context.printStackTrace();
        return as;
    }

    public static boolean f(Context context)
    {
        return "Wi-Fi".equals(e(context)[0]);
    }

    public static boolean g(Context context)
    {
        boolean flag;
        try
        {
            context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return true;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        flag = context.isConnectedOrConnecting();
        return flag;
        return false;
    }

    public static int h(Context context)
    {
        context = Calendar.getInstance(r(context));
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        int i1 = context.getTimeZone().getRawOffset() / 0x36ee80;
        return i1;
        context;
        fg.a(a, "error in getTimeZone", context);
        return 8;
    }

    public static String[] i(Context context)
    {
        String as[] = new String[2];
        try
        {
            context = r(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            fg.b(a, "error in getLocaleInfo", context);
            return as;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        as[0] = context.getCountry();
        as[1] = context.getLanguage();
        if (TextUtils.isEmpty(as[0]))
        {
            as[0] = "Unknown";
        }
        if (TextUtils.isEmpty(as[1]))
        {
            as[1] = "Unknown";
        }
        return as;
    }

    public static String j(Context context)
    {
        context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        context = ((ApplicationInfo) (context)).metaData.getString("UMENG_APPKEY");
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        return context.trim();
        fg.b(a, "Could not read UMENG_APPKEY meta-data from AndroidManifest.xml.");
_L2:
        return null;
        context;
        fg.b(a, "Could not read UMENG_APPKEY meta-data from AndroidManifest.xml.", context);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String k(Context context)
    {
        try
        {
            WifiManager wifimanager = (WifiManager)context.getSystemService("wifi");
            if (a(context, "android.permission.ACCESS_WIFI_STATE"))
            {
                return wifimanager.getConnectionInfo().getMacAddress();
            }
            fg.d(a, "Could not get mac address.[no permission android.permission.ACCESS_WIFI_STATE");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            fg.d(a, (new StringBuilder("Could not get mac address.")).append(context.toString()).toString());
        }
        return "";
    }

    public static int[] l(Context context)
    {
        DisplayMetrics displaymetrics;
        displaymetrics = new DisplayMetrics();
        ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
        if ((context.getApplicationInfo().flags & 0x2000) != 0) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        j1 = a(displaymetrics, "noncompatWidthPixels");
        i1 = a(displaymetrics, "noncompatHeightPixels");
          goto _L3
_L5:
        int k1;
        try
        {
            i1 = displaymetrics.widthPixels;
            j1 = displaymetrics.heightPixels;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            fg.b(a, "read resolution fail", context);
            return null;
        }
        k1 = i1;
        i1 = j1;
_L4:
        context = new int[2];
        if (k1 > i1)
        {
            context[0] = i1;
            context[1] = k1;
            return context;
        } else
        {
            context[0] = k1;
            context[1] = i1;
            return context;
        }
_L6:
        k1 = j1;
        if (true) goto _L4; else goto _L2
_L2:
        i1 = 0;
        j1 = -1;
_L3:
        if (j1 != -1 && i1 != -1) goto _L6; else goto _L5
    }

    public static String m(Context context)
    {
        try
        {
            context = ((TelephonyManager)context.getSystemService("phone")).getNetworkOperatorName();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            fg.a(a, "read carrier fail", context);
            return "Unknown";
        }
        return context;
    }

    public static String n(Context context)
    {
        context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        if (((ApplicationInfo) (context)).metaData == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        context = ((Context) (((ApplicationInfo) (context)).metaData.get("UMENG_CHANNEL")));
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        context = context.toString();
        if (context != null)
        {
            return context;
        }
        fg.a(a, "Could not read UMENG_CHANNEL meta-data from AndroidManifest.xml.");
        return "Unknown";
        context;
        fg.a(a, "Could not read UMENG_CHANNEL meta-data from AndroidManifest.xml.");
        context.printStackTrace();
        return "Unknown";
    }

    public static String o(Context context)
    {
        return context.getPackageName();
    }

    public static String p(Context context)
    {
        return context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
    }

    public static boolean q(Context context)
    {
        boolean flag = false;
        int i1;
        try
        {
            i1 = context.getApplicationInfo().flags;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        if ((i1 & 2) != 0)
        {
            flag = true;
        }
        return flag;
    }

    private static Locale r(Context context)
    {
        Object obj = null;
        try
        {
            Configuration configuration = new Configuration();
            configuration.setToDefaults();
            android.provider.Settings.System.getConfiguration(context.getContentResolver(), configuration);
            context = configuration.locale;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            fg.b(a, "fail to read user config locale");
            context = ((Context) (obj));
        }
        obj = context;
        if (context == null)
        {
            obj = Locale.getDefault();
        }
        return ((Locale) (obj));
    }

}
