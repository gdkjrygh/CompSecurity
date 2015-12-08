// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            at, bf, ca, bv, 
//            dx

public final class bw
{
    public static final class a
        implements bv
    {

        private String a;

        public final String a()
        {
            return "activity";
        }

        public final volatile Object b()
        {
            return a;
        }

        public a()
        {
            String s1 = null;
            super();
            a = null;
            bw.c();
            bw.b();
            if (bw.c().b)
            {
                s1 = ((android.app.ActivityManager.RunningTaskInfo)((ActivityManager)bw.b().getSystemService("activity")).getRunningTasks(1).get(0)).topActivity.flattenToShortString().replace("/", "");
            }
            a = s1;
        }
    }

    public static final class aa
        implements bv
    {

        private Float a;

        public final String a()
        {
            return "ydpi";
        }

        public final volatile Object b()
        {
            return a;
        }

        public aa()
        {
            a = null;
            bw.b();
            a = Float.valueOf(bw.b().getResources().getDisplayMetrics().ydpi);
        }
    }

    public static final class b
        implements bv
    {

        private Integer a;

        public final String a()
        {
            return "app_version_code";
        }

        public final volatile Object b()
        {
            return a;
        }

        public b()
        {
            a = null;
            bw.a();
            a = Integer.valueOf(bw.a().b);
        }
    }

    public static final class c
        implements bv
    {

        private String a;

        public final String a()
        {
            return "app_version";
        }

        public final volatile Object b()
        {
            return a;
        }

        public c()
        {
            a = null;
            bw.a();
            a = bw.a().a;
        }
    }

    public static final class d
        implements bv
    {

        public final String a()
        {
            return "arch";
        }

        public final Object b()
        {
            return System.getProperty("os.arch");
        }

        public d()
        {
        }
    }

    public static final class e
        implements bv
    {

        private Double a;

        public final String a()
        {
            return "battery_level";
        }

        public final volatile Object b()
        {
            return a;
        }

        public e()
        {
            a = null;
            bw.b();
            double d2 = 1.0D;
            Intent intent = bw.b().getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i1 = intent.getIntExtra("level", -1);
            double d3 = intent.getIntExtra("scale", -1);
            double d1 = d2;
            if (i1 >= 0)
            {
                d1 = d2;
                if (d3 > 0.0D)
                {
                    d1 = (double)i1 / d3;
                }
            }
            a = Double.valueOf(d1);
        }
    }

    public static final class f
        implements bv
    {

        public String a;

        public final String a()
        {
            return "carrier";
        }

        public final volatile Object b()
        {
            return a;
        }

        public f()
        {
            a = null;
            bw.b();
            String s1;
            try
            {
                s1 = ((TelephonyManager)bw.b().getSystemService("phone")).getNetworkOperatorName();
            }
            catch (Exception exception)
            {
                exception = Build.BRAND;
            }
            a = s1;
            (new StringBuilder("carrier == ")).append(a);
            dx.b();
        }
    }

    static class g
        implements bv
    {

        private JSONObject a;

        public String a()
        {
            return null;
        }

        public final Object b()
        {
            return c();
        }

        public JSONObject c()
        {
            return a;
        }

        public g(int i1)
        {
            NetworkInfo networkinfo;
            a = null;
            bw.b();
            bw.c();
            if (!bw.c().c)
            {
                break MISSING_BLOCK_LABEL_160;
            }
            a = new JSONObject();
            networkinfo = ((ConnectivityManager)bw.b().getSystemService("connectivity")).getNetworkInfo(i1);
            if (networkinfo == null)
            {
                break MISSING_BLOCK_LABEL_145;
            }
            a.put("available", networkinfo.isAvailable());
            a.put("connected", networkinfo.isConnected());
            if (!networkinfo.isConnected())
            {
                a.put("connecting", networkinfo.isConnectedOrConnecting());
            }
            a.put("failover", networkinfo.isFailover());
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 == 0)
            {
                break MISSING_BLOCK_LABEL_160;
            }
            try
            {
                a.put("roaming", networkinfo.isRoaming());
                return;
            }
            catch (JSONException jsonexception)
            {
                a = null;
            }
            break MISSING_BLOCK_LABEL_157;
            a = null;
            return;
            dx.c();
        }
    }

    public static final class h
        implements bv
    {

        private Float a;

        public final String a()
        {
            return "dpi";
        }

        public final volatile Object b()
        {
            return a;
        }

        public h()
        {
            a = null;
            bw.b();
            a = Float.valueOf(bw.b().getResources().getDisplayMetrics().density);
        }
    }

    public static final class i
        implements bv
    {

        private String a;

        public final String a()
        {
            return "disk_space_free";
        }

        public final volatile Object b()
        {
            return a;
        }

        public i()
        {
            a = null;
            try
            {
                BigInteger.valueOf(-1L);
                StatFs statfs = new StatFs(Environment.getDataDirectory().getPath());
                a = BigInteger.valueOf(statfs.getAvailableBlocks()).multiply(BigInteger.valueOf(statfs.getBlockSize())).toString();
                return;
            }
            catch (ThreadDeath threaddeath)
            {
                throw threaddeath;
            }
            catch (Throwable throwable)
            {
                a = null;
            }
        }
    }

    public static final class j
        implements bv
    {

        private String a;

        public final String a()
        {
            return "disk_space_total";
        }

        public final volatile Object b()
        {
            return a;
        }

        public j()
        {
            a = null;
            try
            {
                BigInteger.valueOf(-1L);
                StatFs statfs = new StatFs(Environment.getDataDirectory().getPath());
                a = BigInteger.valueOf(statfs.getBlockCount()).multiply(BigInteger.valueOf(statfs.getBlockSize())).toString();
                return;
            }
            catch (ThreadDeath threaddeath)
            {
                throw threaddeath;
            }
            catch (Throwable throwable)
            {
                a = null;
            }
        }
    }

    public static final class k
        implements bv
    {

        public String a;

        public final String a()
        {
            return "locale";
        }

        public final volatile Object b()
        {
            return a;
        }

        public k()
        {
            a = null;
            bw.b();
            a = bw.b().getResources().getConfiguration().locale.getLanguage();
            if (a == null || a.length() == 0)
            {
                a = "en";
            }
        }
    }

    public static final class l
        implements bv
    {

        private JSONArray a;

        public final String a()
        {
            return "logcat";
        }

        public final volatile Object b()
        {
            return a;
        }

        public l()
        {
            a = null;
            bw.c();
            bw.d();
            if (bw.c().a)
            {
                a = bw.d().a();
            }
        }
    }

    public static final class m
        implements bv
    {

        private Long a;

        public final String a()
        {
            return "memory_total";
        }

        public final volatile Object b()
        {
            return a;
        }

        public m()
        {
            a = null;
            a = Long.valueOf(Runtime.getRuntime().maxMemory());
        }
    }

    public static final class n
        implements bv
    {

        private Integer a;

        public final String a()
        {
            return "memory_usage";
        }

        public final volatile Object b()
        {
            return a;
        }

        public n()
        {
            a = null;
            android.os.Debug.MemoryInfo memoryinfo = new android.os.Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryinfo);
            int i1 = memoryinfo.dalvikPss;
            int j1 = memoryinfo.nativePss;
            a = Integer.valueOf((memoryinfo.otherPss + (i1 + j1)) * 1024);
        }
    }

    public static final class o
        implements bv
    {

        public Integer a;

        public final String a()
        {
            return "mobile_country_code";
        }

        public final volatile Object b()
        {
            return a;
        }

        public o()
        {
            a = Integer.valueOf(0);
            bw.b();
            String s1;
            try
            {
                s1 = ((TelephonyManager)bw.b().getSystemService("phone")).getNetworkOperator();
            }
            catch (Exception exception)
            {
                return;
            }
            if (s1 == null)
            {
                break MISSING_BLOCK_LABEL_51;
            }
            a = Integer.valueOf(Integer.parseInt(s1.substring(0, 3)));
            (new StringBuilder("mobileCountryCode == ")).append(a);
            dx.b();
            return;
        }
    }

    public static final class p
        implements bv
    {

        public Integer a;

        public final String a()
        {
            return "mobile_network_code";
        }

        public final volatile Object b()
        {
            return a;
        }

        public p()
        {
            a = Integer.valueOf(0);
            bw.b();
            String s1;
            try
            {
                s1 = ((TelephonyManager)bw.b().getSystemService("phone")).getNetworkOperator();
            }
            catch (Exception exception)
            {
                return;
            }
            if (s1 == null)
            {
                break MISSING_BLOCK_LABEL_50;
            }
            a = Integer.valueOf(Integer.parseInt(s1.substring(3)));
            (new StringBuilder("mobileNetworkCode == ")).append(a);
            dx.b();
            return;
        }
    }

    public static final class q extends g
    {

        public final String a()
        {
            return "mobile_network";
        }

        public final volatile JSONObject c()
        {
            return super.c();
        }

        public q()
        {
            super(0);
        }
    }

    public static final class r
        implements bv
    {

        public final String a()
        {
            return "model";
        }

        public final volatile Object b()
        {
            return Build.MODEL;
        }

        public r()
        {
        }
    }

    public static final class s
        implements bv
    {

        public final String a()
        {
            return "name";
        }

        public final Object b()
        {
            return new String();
        }

        public s()
        {
        }
    }

    public static final class t
        implements bv
    {

        private Integer a;

        public final String a()
        {
            return "orientation";
        }

        public final volatile Object b()
        {
            return a;
        }

        public t()
        {
            a = null;
            bw.b();
            int j1 = bw.b().getResources().getConfiguration().orientation;
            int i1 = j1;
            if (j1 == 0)
            {
                Display display = ((WindowManager)bw.b().getSystemService("window")).getDefaultDisplay();
                if (display.getWidth() == display.getHeight())
                {
                    i1 = 3;
                } else
                if (display.getWidth() > display.getHeight())
                {
                    i1 = 2;
                } else
                {
                    i1 = 1;
                }
            }
            a = Integer.valueOf(i1);
        }
    }

    public static final class u
        implements bv
    {

        private String a;

        public final String a()
        {
            return "sd_space_free";
        }

        public final volatile Object b()
        {
            return a;
        }

        public u()
        {
            a = null;
            try
            {
                BigInteger.valueOf(-1L);
                StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                a = BigInteger.valueOf(statfs.getAvailableBlocks()).multiply(BigInteger.valueOf(statfs.getBlockSize())).toString();
                return;
            }
            catch (ThreadDeath threaddeath)
            {
                throw threaddeath;
            }
            catch (Throwable throwable)
            {
                a = null;
            }
        }
    }

    public static final class v
        implements bv
    {

        private String a;

        public final String a()
        {
            return "sd_space_total";
        }

        public final volatile Object b()
        {
            return a;
        }

        public v()
        {
            a = null;
            try
            {
                BigInteger.valueOf(-1L);
                StatFs statfs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                a = BigInteger.valueOf(statfs.getBlockCount()).multiply(BigInteger.valueOf(statfs.getBlockSize())).toString();
                return;
            }
            catch (ThreadDeath threaddeath)
            {
                throw threaddeath;
            }
            catch (Throwable throwable)
            {
                a = null;
            }
        }
    }

    public static final class w
        implements bv
    {

        public final String a()
        {
            return "system";
        }

        public final volatile Object b()
        {
            return "android";
        }

        public w()
        {
        }
    }

    public static final class x
        implements bv
    {

        public final String a()
        {
            return "system_version";
        }

        public final volatile Object b()
        {
            return android.os.Build.VERSION.RELEASE;
        }

        public x()
        {
        }
    }

    public static final class y extends g
    {

        public final String a()
        {
            return "wifi";
        }

        public final volatile JSONObject c()
        {
            return super.c();
        }

        public y()
        {
            super(1);
        }
    }

    public static final class z
        implements bv
    {

        private Float a;

        public final String a()
        {
            return "xdpi";
        }

        public final volatile Object b()
        {
            return a;
        }

        public z()
        {
            a = null;
            bw.b();
            a = Float.valueOf(bw.b().getResources().getDisplayMetrics().xdpi);
        }
    }


    private static at a = null;
    private static Context b = null;
    private static bf c = null;
    private static ca d = null;

    static at a()
    {
        return a;
    }

    public static void a(Context context)
    {
        b = context;
    }

    public static void a(at at)
    {
        a = at;
    }

    public static void a(bf bf)
    {
        c = bf;
    }

    public static void a(ca ca)
    {
        d = ca;
    }

    static Context b()
    {
        return b;
    }

    static bf c()
    {
        return c;
    }

    static ca d()
    {
        return d;
    }

}
