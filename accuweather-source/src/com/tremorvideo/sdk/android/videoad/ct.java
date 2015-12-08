// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import com.tremorvideo.sdk.android.b.a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.Checksum;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            gc, cj, cs, gb, 
//            dr, dq, Settings, dw, 
//            fw, cu, cv, fz, 
//            fy, cw, dp

public class ct
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/tremorvideo/sdk/android/videoad/ct$a, s1);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("Always", 0);
            b = new a("Debug", 1);
            c = new a("JSON", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    private static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b d[];

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(com/tremorvideo/sdk/android/videoad/ct$b, s1);
        }

        public static b[] values()
        {
            return (b[])d.clone();
        }

        static 
        {
            a = new b("CustomEventNoParams", 0);
            b = new b("CustomEventParams", 1);
            c = new b("CustomEventScene", 2);
            d = (new b[] {
                a, b, c
            });
        }

        private b(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private static long a = 0L;
    private static String b[] = new String[0];
    private static dw c;
    private static Context d;
    private static Settings e;
    private static String f = "0";
    private static float g;
    private static float h;
    private static boolean i;
    private static boolean j = false;
    private static boolean k = false;
    private static boolean l;
    private static long m = 0L;
    private static String n;
    private static String o = null;
    private static gc p = new gc();
    private static long q[] = new long[b.values().length];
    private static cs r;
    private static gb s;
    private static fy t = null;

    public static void A()
    {
        if (n != null)
        {
            long l1 = B();
            long l2 = m;
            com.tremorvideo.sdk.android.videoad.cj.a(n, l1 - l2);
            n = null;
        }
        r.b();
        s.a();
    }

    public static long B()
    {
        return System.nanoTime() / 0xf4240L - a;
    }

    public static int C()
    {
        return Integer.parseInt(android.os.Build.VERSION.SDK);
    }

    public static int D()
    {
        return Math.round(15F * J());
    }

    public static int E()
    {
        return Math.round(25F * J());
    }

    public static int F()
    {
        return Math.round(15F * J());
    }

    public static int G()
    {
        return Math.round(12F * J());
    }

    public static int H()
    {
        return Math.round(20F * J());
    }

    public static float I()
    {
        if (g == 0.0F)
        {
            g = K();
        }
        return g;
    }

    public static float J()
    {
        if (h == 0.0F)
        {
            h = L();
        }
        return h;
    }

    private static float K()
    {
        Display display = ((WindowManager)d.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        display.getMetrics(displaymetrics);
        int i1 = Math.round((float)displaymetrics.widthPixels * displaymetrics.density);
        if (i1 <= 240)
        {
            return 0.6F;
        }
        if (i1 <= 300)
        {
            return 0.65F;
        }
        return i1 > 480 ? 1.0F : 0.75F;
    }

    private static float L()
    {
        Display display = ((WindowManager)d.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        display.getMetrics(displaymetrics);
        int i1 = Math.round((float)displaymetrics.widthPixels * displaymetrics.density);
        if (i1 <= 240)
        {
            return 0.75F;
        }
        return i1 > 480 ? 1.0F : 0.85F;
    }

    private static boolean M()
    {
        if (!l) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        boolean flag;
        Object obj = Environment.getExternalStorageState();
        if (!((String) (obj)).equals("mounted") && !((String) (obj)).equals("mounted_ro"))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = Environment.getExternalStorageDirectory();
        flag = (new File((new StringBuilder()).append(((File) (obj)).getAbsolutePath()).append(File.separatorChar).append("d89f24dc727d476db670624a16933ebd.debug").toString())).exists();
        if (flag) goto _L1; else goto _L3
_L3:
        return false;
        Exception exception;
        exception;
        a(exception);
        if (true) goto _L3; else goto _L4
_L4:
    }

    public static dp a(Context context)
    {
        if (Integer.parseInt(android.os.Build.VERSION.SDK) >= 7)
        {
            return new dr(context);
        } else
        {
            return new dq(context);
        }
    }

    public static String a(File file)
    {
        try
        {
            BufferedReader bufferedreader = new BufferedReader(new FileReader(file));
            file = new char[(int)file.length()];
            bufferedreader.read(file);
            file = String.valueOf(file);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            a(((Throwable) (file)));
            return "";
        }
        return file;
    }

    public static String a(InputStream inputstream)
    {
        StringBuilder stringbuilder;
        byte abyte0[];
        stringbuilder = new StringBuilder();
        abyte0 = new byte[1024];
_L1:
        int i1 = inputstream.read(abyte0);
label0:
        {
            if (i1 <= 0)
            {
                break label0;
            }
            try
            {
                stringbuilder.append(new String(abyte0, 0, i1));
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                a(((Throwable) (inputstream)));
                return "";
            }
        }
          goto _L1
        inputstream = stringbuilder.toString();
        return inputstream;
    }

    public static String a(Calendar calendar)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(calendar.get(1));
        stringbuilder.append("-");
        stringbuilder.append(calendar.get(2) + 1);
        stringbuilder.append("-");
        stringbuilder.append(calendar.get(7));
        stringbuilder.append(" ");
        stringbuilder.append(calendar.get(11));
        stringbuilder.append(":");
        stringbuilder.append(calendar.get(12));
        stringbuilder.append(":");
        stringbuilder.append(calendar.get(13));
        return stringbuilder.toString();
    }

    public static void a()
    {
        Runtime runtime = Runtime.getRuntime();
        long l1 = (runtime.freeMemory() + (runtime.maxMemory() - runtime.totalMemory())) / 1024L / 1024L;
        d((new StringBuilder()).append("Free Memory: ").append(l1).append("MB").toString());
    }

    public static void a(Activity activity, String s1)
    {
        long l1 = B();
        int i1 = com.tremorvideo.sdk.android.videoad.b.a.ordinal();
        if (l1 - q[i1] >= 2000L)
        {
            d("Sending Custom Event...");
            q[i1] = l1;
            com.tremorvideo.sdk.android.videoad.cj.a(activity, s1, new HashMap());
        }
    }

    public static void a(Activity activity, String s1, Map map)
    {
        long l1 = B();
        int i1 = b.b.ordinal();
        if (l1 - q[i1] >= 2000L)
        {
            d("Sending Custom Event with Parameters...");
            q[i1] = l1;
            com.tremorvideo.sdk.android.videoad.cj.a(activity, s1, map);
        }
    }

    public static void a(Context context, String as[])
    {
        a = System.nanoTime() / 0xf4240L;
        d = context;
        e = new Settings();
        g = 0.0F;
        h = 0.0F;
        r = new cs(context);
        s = new gb(context);
        b = (String[])as.clone();
        c = new dw(context, c());
        l = M();
        for (int i1 = 0; i1 < q.length; i1++)
        {
            q[i1] = 0L;
        }

        com.tremorvideo.sdk.android.videoad.fw.a(context);
    }

    public static void a(Window window)
    {
        if (Integer.parseInt(android.os.Build.VERSION.SDK) >= 11)
        {
            (new cu(window)).a();
        }
    }

    public static void a(Settings settings)
    {
        com/tremorvideo/sdk/android/videoad/ct;
        JVM INSTR monitorenter ;
        e = new Settings(settings);
        com/tremorvideo/sdk/android/videoad/ct;
        JVM INSTR monitorexit ;
        return;
        settings;
        throw settings;
    }

    public static void a(a a1, String s1)
    {
        a(a1, s1, ((Throwable) (null)));
    }

    public static void a(a a1, String s1, Throwable throwable)
    {
        boolean flag = false;
        if (l)
        {
            if (s1 != null)
            {
                a1 = s1.split("\n");
                int k1 = a1.length;
                for (int i1 = 0; i1 < k1; i1++)
                {
                    Log.v("tremor", a1[i1]);
                }

            }
            if (throwable != null)
            {
                a1 = throwable.getMessage();
                if (a1 != null)
                {
                    a1 = a1.split("\n");
                    int l1 = a1.length;
                    for (int j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
                    {
                        Log.v("tremor", a1[j1]);
                    }

                } else
                {
                    Log.v("tremor", throwable.toString());
                }
                a(throwable.getStackTrace());
                return;
            }
        }
    }

    public static void a(String s1, Throwable throwable)
    {
        a(com.tremorvideo.sdk.android.videoad.a.a, s1, throwable);
    }

    public static void a(Throwable throwable)
    {
        a(com.tremorvideo.sdk.android.videoad.a.a, ((String) (null)), throwable);
    }

    public static void a(Checksum checksum, File file)
    {
        checksum.reset();
        byte abyte0[];
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_61;
        }
        abyte0 = new byte[1024];
        file = new FileInputStream(file);
_L1:
        int i1 = file.read(abyte0);
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        checksum.update(abyte0, 0, i1);
          goto _L1
        file;
        a(((Throwable) (file)));
        checksum.reset();
    }

    public static void a(StackTraceElement astacktraceelement[])
    {
        int j1 = astacktraceelement.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            StackTraceElement stacktraceelement = astacktraceelement[i1];
            d((new StringBuilder()).append("  ").append(stacktraceelement.toString()).toString());
        }

    }

    public static boolean a(Activity activity)
    {
        if (Integer.parseInt(android.os.Build.VERSION.SDK) >= 11)
        {
            return (new cv(activity)).a();
        } else
        {
            return false;
        }
    }

    public static boolean a(ea.b b1)
    {
        for (fz fz1 = c.e(); fz1 == null || !fz1.a(b1);)
        {
            return true;
        }

        return false;
    }

    public static boolean a(String s1)
    {
        return d.checkCallingOrSelfPermission(s1) == 0;
    }

    public static boolean a(Checksum checksum, File file, long l1)
    {
        if (l1 == 0L)
        {
            d("No CRC to check.");
        } else
        {
            d("Calculating CRC...");
            a(checksum, file);
            long l2 = checksum.getValue();
            if (l2 == l1)
            {
                d((new StringBuilder()).append("CRC is good: ").append(l2).toString());
            } else
            {
                d((new StringBuilder()).append("CRC is invalid. Expected: ").append(l1).append(". Got: ").append(l2).toString());
                return false;
            }
        }
        return true;
    }

    public static void b()
    {
        a(a.b, "Core - Destroy");
        a = 0L;
        e = new Settings();
        d = null;
        if (t != null)
        {
            t.a();
            t = null;
        }
        c.a();
        c = null;
        for (int i1 = 0; i1 < q.length; i1++)
        {
            q[i1] = 0L;
        }

    }

    public static void b(Activity activity, String s1)
    {
        long l1 = B();
        int i1 = b.c.ordinal();
        if (l1 - q[i1] >= 2000L)
        {
            d("Sending State Change...");
            q[i1] = l1;
            com.tremorvideo.sdk.android.videoad.cj.a(activity, s1);
        }
    }

    public static void b(String s1)
    {
        com/tremorvideo/sdk/android/videoad/ct;
        JVM INSTR monitorenter ;
        f = s1;
        com/tremorvideo/sdk/android/videoad/ct;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    public static boolean b(Activity activity)
    {
        if (Integer.parseInt(android.os.Build.VERSION.SDK) >= 12)
        {
            return (new cw()).a();
        } else
        {
            return true;
        }
    }

    public static String c()
    {
        String s1;
        if (i)
        {
            s1 = "http://android-sdk34.transpera.com/tap/ad/Ad";
        } else
        if (j)
        {
            s1 = "__TESTING_URL__";
            if (!"__TESTING_URL__".toLowerCase().contains(".txt"))
            {
                return (new StringBuilder()).append("__TESTING_URL__").append("/tap/ad/Ad").toString();
            }
        } else
        {
            return "http://android-sdk34.transpera.com/tap/ad/Ad";
        }
        return s1;
    }

    public static GregorianCalendar c(String s1)
    {
        s1 = s1.split(" ")[0].split("-");
        return new GregorianCalendar(Integer.parseInt(s1[0]), Integer.parseInt(s1[1]), Integer.parseInt(s1[2]));
    }

    public static void d(String s1)
    {
        a(com.tremorvideo.sdk.android.videoad.a.a, s1, ((Throwable) (null)));
    }

    public static boolean d()
    {
        return l;
    }

    public static String e()
    {
        if (i)
        {
            return "http://l0.scanscout.com/ssframework/tap/avail/Avail";
        }
        if (j)
        {
            return "__TESTING_URL__/tap/avail/Avail";
        } else
        {
            return "http://l0.scanscout.com/ssframework/tap/avail/Avail";
        }
    }

    public static cs f()
    {
        return r;
    }

    public static gb g()
    {
        return s;
    }

    public static String h()
    {
        if (i)
        {
            return "http://l0.scanscout.com/ssframework/tap/ad/Session";
        }
        if (j)
        {
            return "__TESTING_URL__/tap/ad/Session";
        } else
        {
            return "http://l0.scanscout.com/ssframework/tap/ad/Session";
        }
    }

    public static String i()
    {
        String s1;
        try
        {
            s1 = d.getPackageName();
            s1 = d.getPackageManager().getPackageInfo(s1, 0).versionName;
        }
        catch (Exception exception)
        {
            return "unknown";
        }
        return s1;
    }

    public static gc j()
    {
        return p;
    }

    public static int k()
    {
        Display display = ((WindowManager)d.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        display.getMetrics(displaymetrics);
        return displaymetrics.widthPixels;
    }

    public static int l()
    {
        Display display = ((WindowManager)d.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        display.getMetrics(displaymetrics);
        return displaymetrics.heightPixels;
    }

    public static String m()
    {
        Object obj;
        obj = d.getPackageName();
        obj = d.getPackageManager().getPackageInfo(((String) (obj)), 0).applicationInfo;
        Iterator iterator = ((ActivityManager)d.getSystemService("activity")).getRunningAppProcesses().iterator();
        PackageManager packagemanager = d.getPackageManager();
        android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_109;
            }
            runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)iterator.next();
        } while (runningappprocessinfo.processName.compareTo(((ApplicationInfo) (obj)).processName) != 0);
        obj = packagemanager.getApplicationLabel(packagemanager.getApplicationInfo(runningappprocessinfo.processName, 128)).toString();
        return ((String) (obj));
        Exception exception;
        exception;
        a(exception);
        return "unknown";
    }

    public static String n()
    {
        return b[0];
    }

    public static String o()
    {
        if (o == null)
        {
            String s1 = ((TelephonyManager)d.getSystemService("phone")).getDeviceId();
            if (s1 == null)
            {
                o = "";
            } else
            {
                if (d())
                {
                    o = s1;
                    return s1;
                }
                o = com.tremorvideo.sdk.android.b.a.b(s1, "b0610de7bd1ab11704fdd2ae1035af94");
            }
        }
        return o;
    }

    public static int p()
    {
        return Integer.parseInt(android.os.Build.VERSION.SDK);
    }

    public static boolean q()
    {
        TelephonyManager telephonymanager = (TelephonyManager)d.getSystemService("phone");
        if (telephonymanager.getPhoneType() == 0)
        {
            return false;
        }
        return telephonymanager.getLine1Number() != null;
    }

    public static String[] r()
    {
        com/tremorvideo/sdk/android/videoad/ct;
        JVM INSTR monitorenter ;
        String as[] = b;
        com/tremorvideo/sdk/android/videoad/ct;
        JVM INSTR monitorexit ;
        return as;
        Exception exception;
        exception;
        throw exception;
    }

    public static Settings s()
    {
        com/tremorvideo/sdk/android/videoad/ct;
        JVM INSTR monitorenter ;
        Settings settings = e;
        com/tremorvideo/sdk/android/videoad/ct;
        JVM INSTR monitorexit ;
        return settings;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean t()
    {
        return k;
    }

    public static Context u()
    {
        return d;
    }

    public static String v()
    {
        String s1 = Build.BRAND;
        String s2 = Build.MODEL;
        return (new StringBuilder()).append("TransperaSDK v").append(w()).append(" : ").append(s1).append(" : ").append(s2).append(" : Android OS : ").append(android.os.Build.VERSION.RELEASE).toString();
    }

    public static String w()
    {
        String s1 = "3.4.0.461";
        if (!"3.4.0.461".contains("."))
        {
            s1 = "3.4.0.debug";
        }
        return s1;
    }

    public static String x()
    {
        com/tremorvideo/sdk/android/videoad/ct;
        JVM INSTR monitorenter ;
        String s1 = f;
        com/tremorvideo/sdk/android/videoad/ct;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        throw exception;
    }

    public static dw y()
    {
        return c;
    }

    public static void z()
    {
        n = a(new GregorianCalendar());
        m = B();
    }

    static 
    {
        boolean flag = true;
        i = true;
        if (i)
        {
            flag = false;
        }
        l = flag;
    }
}
