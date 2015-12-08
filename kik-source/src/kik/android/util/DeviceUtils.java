// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.kik.m.e;
import com.kik.sdkutils.y;
import java.nio.ByteOrder;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.android.util:
//            bx, cq, ar, bg, 
//            ah, ai

public class DeviceUtils
{

    private static int a = 4096;
    private static final b b = org.c.c.a("DeviceUtils");
    private static Context c;
    private static bg d;
    private static final int e[] = {
        120, 160, 240, 320, 480
    };
    private static int f;
    private static AudioManager g;

    public static String a(Context context, int i, String s)
    {
        boolean flag1 = true;
        int j;
        int k;
        boolean flag;
        try
        {
            k = android.provider.Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        }
        catch (android.provider.Settings.SettingNotFoundException settingnotfoundexception)
        {
            k = 0;
        }
        context = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (context != null)
        {
            j = context.getIntExtra("plugged", -1);
            float f1;
            int l;
            if (j == 1 || j == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j = context.getIntExtra("scale", -1);
            j = (int)(((float)context.getIntExtra("level", -1) / (float)j) * 255F);
            if (j < 0 || j > 255)
            {
                j = -1;
            }
        } else
        {
            j = 0;
            flag = false;
        }
        if (!y.a(9)) goto _L2; else goto _L1
_L1:
        f1 = k;
        k = context.getIntExtra("voltage", -1);
        l = context.getIntExtra("temperature", -1);
        if (ByteOrder.nativeOrder() != ByteOrder.BIG_ENDIAN)
        {
            flag1 = false;
        }
        context = collectDrainInterpolation(s, i, f1, k, l, j, flag, flag1);
        if (context.length > a) goto _L2; else goto _L3
_L3:
        context = com.kik.m.e.b(context);
_L5:
        s = context;
        if (context == null)
        {
            s = "";
        }
        return s;
        context;
        bx.a(context);
_L2:
        context = "";
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static final String a(String s)
    {
        return String.format("Kik/%s (Android %s) %s", new Object[] {
            b(c), android.os.Build.VERSION.RELEASE, s
        });
    }

    public static Hashtable a(Context context, ar ar1)
    {
        Hashtable hashtable = new Hashtable();
        hashtable.put("device-type", "android");
        Object obj;
        long l;
        try
        {
            if (!kik.android.util.cq.c(Build.BRAND))
            {
                hashtable.put("brand", Build.BRAND);
            }
            if (!kik.android.util.cq.c(Build.MODEL))
            {
                hashtable.put("model", Build.MODEL);
            }
            if (!kik.android.util.cq.c(android.os.Build.VERSION.SDK))
            {
                hashtable.put("android-sdk", android.os.Build.VERSION.SDK);
            }
            obj = Locale.getDefault();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return hashtable;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        hashtable.put("lang", ((Locale) (obj)).toString());
        try
        {
            obj = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (!kik.android.util.cq.c(((String) (obj))))
            {
                hashtable.put("android-id", obj);
            }
        }
        catch (Throwable throwable) { }
        obj = (TelephonyManager)context.getSystemService("phone");
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        obj = ((TelephonyManager) (obj)).getNetworkOperator();
        if (!kik.android.util.cq.c(((String) (obj))))
        {
            hashtable.put("operator", obj);
        }
        hashtable.put("prefix", "CAN");
        context = b(context);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        hashtable.put("version", context);
        ar1 = ar1.c();
        context = ar1.getString("kik.install_referrer", null);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        hashtable.put("install-referrer", context);
        l = ar1.getLong("kik.install_date", -1L);
        if (l != -1L)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        context = "unknown";
_L1:
        hashtable.put("install-date", context);
        hashtable.put("registrations-since-install", String.valueOf(ar1.getInt("kik.registration_count", 0)));
        hashtable.put("logins-since-install", String.valueOf(ar1.getInt("kik.install_count", 0)));
        return hashtable;
        context = Long.toString(l);
          goto _L1
    }

    public static void a(Context context)
    {
        c = context;
        d = new bg(c);
        if (y.a(9))
        {
            a("helloneon", context);
        }
        a("gnustl_shared", context);
        a("kikcode_encode", context);
        a("kikcode_scan", context);
        g = (AudioManager)c.getSystemService("audio");
    }

    public static boolean a()
    {
        return y.a(9);
    }

    public static boolean a(Context context, String s)
    {
        if (s != null && context != null)
        {
            if (context.getPackageManager().queryIntentActivities(s = new Intent("android.intent.action.VIEW", Uri.parse(s)), 0).size() > 0)
            {
                return true;
            }
        }
        return false;
    }

    private static boolean a(String s, Context context)
    {
        System.loadLibrary(s);
_L2:
        return true;
        UnsatisfiedLinkError unsatisfiedlinkerror;
        unsatisfiedlinkerror;
        bx.a(unsatisfiedlinkerror);
        try
        {
            String s1 = (new StringBuilder()).append(context.getApplicationInfo().dataDir).append("/lib").toString();
            if (y.a(9))
            {
                s1 = context.getApplicationInfo().nativeLibraryDir;
            }
            s = (new StringBuilder("/lib")).append(s).append(".so").toString();
            System.load((new StringBuilder()).append(s1).append(s).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            bx.a(new LinkageError("Failed backup Link"));
            return false;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static int b()
    {
        if (f <= 0)
        {
            int j = c.getResources().getDisplayMetrics().densityDpi;
            for (int i = 0; i < e.length; i++)
            {
                if (j == e[i])
                {
                    f = j;
                    return j;
                }
                f = 240;
            }

        }
        return f;
    }

    public static String b(Context context)
    {
        PackageManager packagemanager;
        try
        {
            packagemanager = context.getPackageManager();
            context = context.getPackageName();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        if (packagemanager == null) goto _L2; else goto _L1
_L1:
        context = packagemanager.getPackageInfo(context, 0);
_L4:
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        context = ((PackageInfo) (context)).versionName;
        return context;
        return "0.0.0";
_L2:
        context = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int c(Context context)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return 0;
        }
        return i;
    }

    public static boolean c()
    {
        return (c.getApplicationInfo().flags & 2) != 0;
    }

    private static native byte[] collectDrainInterpolation(String s, int i, float f1, int j, int k, int l, boolean flag, boolean flag1);

    public static boolean d()
    {
        if (d == null)
        {
            return false;
        } else
        {
            return d.g();
        }
    }

    public static boolean d(Context context)
    {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static int e()
    {
        return g.requestAudioFocus(new ah(), 3, 1);
    }

    public static boolean e(Context context)
    {
        boolean flag = false;
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (context.getPackageManager().queryIntentActivities(intent, 0).size() > 0)
        {
            flag = true;
        }
        return flag;
    }

    public static int f()
    {
        return g.abandonAudioFocus(new ai());
    }

    public static void g()
    {
        g.setStreamMute(3, true);
    }

    public static void h()
    {
        g.setStreamMute(3, false);
    }

}
