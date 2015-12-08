// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.skypetelemetry.hardware;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import com.microsoft.applications.skypetelemetry.h;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.microsoft.applications.skypetelemetry.hardware:
//            AbstractHardwareInformation

public class DeviceInformation extends AbstractHardwareInformation
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a f[];
        private final int e;

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/microsoft/applications/skypetelemetry/hardware/DeviceInformation$a, s1);
        }

        public static a[] values()
        {
            return (a[])f.clone();
        }

        public final int a()
        {
            return e;
        }

        static 
        {
            a = new a("ARCH_UNKNOWN", 0, 0);
            b = new a("ARCH_X86", 1, 1);
            c = new a("ARCH_X64", 2, 2);
            d = new a("ARCH_ARM", 3, 3);
            f = (new a[] {
                a, b, c, d
            });
        }

        private a(String s1, int i1, int j1)
        {
            super(s1, i1);
            e = j1;
        }
    }


    private static final DeviceInformation b;
    private static final String c = com/microsoft/applications/skypetelemetry/hardware/DeviceInformation.getSimpleName();
    private static String d;
    private static String e;
    private static String f;
    private static String g;
    private static String h;
    private static long i = 0L;
    private static boolean j = false;
    private static boolean k = false;
    private static boolean l = false;
    private static boolean m = false;
    private static double n = 0.0D;
    private static double o = 0.0D;
    private static int p = 0;
    private static int q = 0;
    private static int r = 0;
    private static int s = 0;
    private static int t = 0;

    public DeviceInformation()
    {
    }

    private static long a(File file)
    {
        file = new StatFs(file.getAbsolutePath());
        long l1;
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            l1 = file.getBlockSize();
        } else
        {
            l1 = file.getBlockSizeLong();
        }
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            return l1 * (long)file.getBlockCount();
        } else
        {
            return l1 * file.getBlockCountLong();
        }
    }

    private static Map a(String s1)
    {
        HashMap hashmap = new HashMap();
        if (!(new File(s1)).exists()) goto _L2; else goto _L1
_L1:
        Object obj = new BufferedReader(new FileReader(new File(s1)));
_L4:
        s1 = ((String) (obj));
        String s2 = ((BufferedReader) (obj)).readLine();
        if (s2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = ((String) (obj));
        String as[] = s2.split(":");
        s1 = ((String) (obj));
        String s3 = as[0].replaceAll("\t", "").trim();
        s2 = "";
        s1 = ((String) (obj));
        if (as.length <= 1)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        s1 = ((String) (obj));
        s2 = as[1].trim();
        s1 = ((String) (obj));
        hashmap.put(s3, s2);
        if (true) goto _L4; else goto _L3
        IOException ioexception;
        ioexception;
_L8:
        s1 = ((String) (obj));
        Log.e(c, (new StringBuilder("Error reading device process information: ")).append(ioexception.getMessage()).toString());
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return hashmap;
            }
        }
_L2:
        return hashmap;
_L3:
        try
        {
            ((BufferedReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return hashmap;
        }
        return hashmap;
        obj;
        s1 = null;
_L6:
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        throw obj;
        obj;
        if (true) goto _L6; else goto _L5
_L5:
        ioexception;
        obj = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected static void a()
    {
        com/microsoft/applications/skypetelemetry/hardware/DeviceInformation;
        JVM INSTR monitorenter ;
        long l1 = 0L;
        String s1 = Environment.getExternalStorageState();
        if ("mounted".equals(s1) || "mounted_ro".equals(s1))
        {
            l1 = a(Environment.getExternalStorageDirectory());
        }
        long l2 = a(Environment.getRootDirectory());
        b.a("StorageSize", Long.valueOf((l1 + l2) / 0x100000L));
        com/microsoft/applications/skypetelemetry/hardware/DeviceInformation;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(Context context)
    {
        com/microsoft/applications/skypetelemetry/hardware/DeviceInformation;
        JVM INSTR monitorenter ;
        f = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        Object obj = context.getPackageManager();
        m = ((PackageManager) (obj)).hasSystemFeature("android.hardware.camera");
        l = ((PackageManager) (obj)).hasSystemFeature("android.hardware.camera.front");
        k = ((PackageManager) (obj)).hasSystemFeature("android.hardware.touchscreen");
        j = false;
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        context.getSize(new Point());
        obj = new DisplayMetrics();
        context.getMetrics(((DisplayMetrics) (obj)));
        n = ((DisplayMetrics) (obj)).ydpi;
        o = ((DisplayMetrics) (obj)).xdpi;
        p = (int)((float)((DisplayMetrics) (obj)).heightPixels / ((DisplayMetrics) (obj)).ydpi);
        q = (int)((float)((DisplayMetrics) (obj)).widthPixels / ((DisplayMetrics) (obj)).xdpi);
        r = ((DisplayMetrics) (obj)).heightPixels;
        s = ((DisplayMetrics) (obj)).widthPixels;
        com/microsoft/applications/skypetelemetry/hardware/DeviceInformation;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    protected static void a(Intent intent)
    {
        boolean flag = false;
        com/microsoft/applications/skypetelemetry/hardware/DeviceInformation;
        JVM INSTR monitorenter ;
        int i1;
        int j1;
        j1 = intent.getIntExtra("plugged", -1);
        break MISSING_BLOCK_LABEL_15;
_L7:
        deviceinformation = b;
        if (j1 == 0) goto _L2; else goto _L1
_L1:
        intent = Integer.valueOf(h.c.a());
_L3:
        deviceinformation.a("PowerSource", intent);
        com/microsoft/applications/skypetelemetry/hardware/DeviceInformation;
        JVM INSTR monitorexit ;
        return;
_L5:
        j1 = 0;
        break; /* Loop/switch isn't completed */
_L2:
        i1 = h.b.a();
        intent = Integer.valueOf(i1);
          goto _L3
        intent;
        throw intent;
        DeviceInformation deviceinformation;
        if (j1 == 2)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (j1 != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = 1;
        break; /* Loop/switch isn't completed */
        if (true) goto _L5; else goto _L4
_L4:
        if (j1 == 0)
        {
            j1 = ((flag) ? 1 : 0);
            if (i1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        j1 = 1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static long b(String s1)
    {
        long l1;
        try
        {
            l1 = (long)Integer.parseInt(s1.split(" ")[0]) / 1024L;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Log.e(c, (new StringBuilder("Error reading memory information: ")).append(s1.getMessage()).toString());
            return 0L;
        }
        return l1;
    }

    private static native void initNative();

    static 
    {
        b = new DeviceInformation();
        initNative();
        b.a("PowerSource", Integer.valueOf(h.a.a()));
        a();
        g = Build.MANUFACTURER;
        h = Build.MODEL;
        d = Build.HARDWARE;
        String s1;
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            s1 = Build.CPU_ABI;
        } else
        if (Build.SUPPORTED_ABIS.length > 0)
        {
            s1 = Build.SUPPORTED_ABIS[0];
        } else
        {
            s1 = "Unknown";
        }
        e = s1;
        if (s1.matches("(?i)arm"))
        {
            a.d.a();
        } else
        if (e.matches("[xX]86"))
        {
            a.b.a();
        } else
        if (e.matches("[xX]64"))
        {
            a.c.a();
        } else
        {
            t = a.a.a();
        }
        i = b((String)a("/proc/meminfo").get("MemTotal"));
    }
}
