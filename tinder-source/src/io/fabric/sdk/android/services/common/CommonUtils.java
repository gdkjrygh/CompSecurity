// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class CommonUtils
{
    static final class Architecture extends Enum
    {

        public static final Architecture a;
        public static final Architecture b;
        public static final Architecture c;
        public static final Architecture d;
        public static final Architecture e;
        public static final Architecture f;
        public static final Architecture g;
        public static final Architecture h;
        public static final Architecture i;
        public static final Architecture j;
        private static final Map k;
        private static final Architecture l[];

        static Architecture a()
        {
            Object obj = Build.CPU_ABI;
            if (TextUtils.isEmpty(((CharSequence) (obj))))
            {
                io.fabric.sdk.android.c.a().a("Fabric", "Architecture#getValue()::Build.CPU_ABI returned null or empty");
                obj = h;
            } else
            {
                obj = ((String) (obj)).toLowerCase(Locale.US);
                Architecture architecture = (Architecture)k.get(obj);
                obj = architecture;
                if (architecture == null)
                {
                    return h;
                }
            }
            return ((Architecture) (obj));
        }

        public static Architecture valueOf(String s)
        {
            return (Architecture)Enum.valueOf(io/fabric/sdk/android/services/common/CommonUtils$Architecture, s);
        }

        public static Architecture[] values()
        {
            return (Architecture[])l.clone();
        }

        static 
        {
            a = new Architecture("X86_32", 0);
            b = new Architecture("X86_64", 1);
            c = new Architecture("ARM_UNKNOWN", 2);
            d = new Architecture("PPC", 3);
            e = new Architecture("PPC64", 4);
            f = new Architecture("ARMV6", 5);
            g = new Architecture("ARMV7", 6);
            h = new Architecture("UNKNOWN", 7);
            i = new Architecture("ARMV7S", 8);
            j = new Architecture("ARM64", 9);
            l = (new Architecture[] {
                a, b, c, d, e, f, g, h, i, j
            });
            HashMap hashmap = new HashMap(4);
            k = hashmap;
            hashmap.put("armeabi-v7a", g);
            k.put("armeabi", f);
            k.put("x86", a);
        }

        private Architecture(String s, int i1)
        {
            super(s, i1);
        }
    }


    public static final Comparator a = new Comparator() {

        public final int compare(Object obj, Object obj1)
        {
            obj = (File)obj;
            obj1 = (File)obj1;
            return (int)(((File) (obj)).lastModified() - ((File) (obj1)).lastModified());
        }

    };
    private static Boolean b = null;
    private static final char c[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    private static long d = -1L;
    private static Boolean e = null;

    public static int a()
    {
        return Architecture.a().ordinal();
    }

    public static int a(Context context, String s, String s1)
    {
        Resources resources = context.getResources();
        int i1 = context.getApplicationContext().getApplicationInfo().icon;
        if (i1 > 0)
        {
            context = context.getResources().getResourcePackageName(i1);
        } else
        {
            context = context.getPackageName();
        }
        return resources.getIdentifier(s, s1, context);
    }

    public static int a(Context context, boolean flag)
    {
        float f1 = c(context);
        if (!flag)
        {
            return 1;
        }
        if (flag && (double)f1 >= 99D)
        {
            return 3;
        }
        return !flag || (double)f1 >= 99D ? 0 : 2;
    }

    private static long a(String s, String s1, int i1)
    {
        return Long.parseLong(s.split(s1)[0].trim()) * (long)i1;
    }

    public static android.app.ActivityManager.RunningAppProcessInfo a(String s, Context context)
    {
label0:
        {
            context = ((ActivityManager)context.getSystemService("activity")).getRunningAppProcesses();
            if (context == null)
            {
                break label0;
            }
            context = context.iterator();
            android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo;
            do
            {
                if (!context.hasNext())
                {
                    break label0;
                }
                runningappprocessinfo = (android.app.ActivityManager.RunningAppProcessInfo)context.next();
            } while (!runningappprocessinfo.processName.equals(s));
            return runningappprocessinfo;
        }
        return null;
    }

    public static SharedPreferences a(Context context)
    {
        return context.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    public static String a(int i1)
    {
        if (i1 < 0)
        {
            throw new IllegalArgumentException("value must be zero or greater");
        } else
        {
            return String.format(Locale.US, "%1$10s", new Object[] {
                Integer.valueOf(i1)
            }).replace(' ', '0');
        }
    }

    private static String a(File file, String s)
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_95;
        }
        BufferedReader bufferedreader = new BufferedReader(new FileReader(file), 1024);
_L2:
        obj = bufferedreader;
        String s1 = bufferedreader.readLine();
        obj = obj1;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        obj = bufferedreader;
        String as[] = Pattern.compile("\\s*:\\s*").split(s1, 2);
        obj = bufferedreader;
        if (as.length <= 1) goto _L2; else goto _L1
_L1:
        obj = bufferedreader;
        if (!as[0].equals(s)) goto _L2; else goto _L3
_L3:
        obj = as[1];
        a(((Closeable) (bufferedreader)), "Failed to close system file reader.");
        return ((String) (obj));
        Exception exception;
        exception;
        s = null;
_L7:
        obj = s;
        io.fabric.sdk.android.c.a().c("Fabric", (new StringBuilder("Error parsing ")).append(file).toString(), exception);
        a(((Closeable) (s)), "Failed to close system file reader.");
        return null;
        file;
        obj = null;
_L5:
        a(((Closeable) (obj)), "Failed to close system file reader.");
        throw file;
        file;
        if (true) goto _L5; else goto _L4
_L4:
        exception;
        s = bufferedreader;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static String a(InputStream inputstream)
        throws IOException
    {
        inputstream = (new Scanner(inputstream)).useDelimiter("\\A");
        if (inputstream.hasNext())
        {
            return inputstream.next();
        } else
        {
            return "";
        }
    }

    public static String a(String s)
    {
        return a(s.getBytes(), "SHA-1");
    }

    public static String a(byte abyte0[])
    {
        char ac[] = new char[abyte0.length * 2];
        for (int i1 = 0; i1 < abyte0.length; i1++)
        {
            int j1 = abyte0[i1] & 0xff;
            ac[i1 * 2] = c[j1 >>> 4];
            ac[i1 * 2 + 1] = c[j1 & 0xf];
        }

        return new String(ac);
    }

    private static String a(byte abyte0[], String s)
    {
        MessageDigest messagedigest;
        try
        {
            messagedigest = MessageDigest.getInstance(s);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            io.fabric.sdk.android.c.a().c("Fabric", (new StringBuilder("Could not create hashing algorithm: ")).append(s).append(", returning empty string.").toString(), abyte0);
            return "";
        }
        messagedigest.update(abyte0);
        return a(messagedigest.digest());
    }

    public static transient String a(String as[])
    {
        Object obj = new ArrayList();
        for (int i1 = 0; i1 <= 0; i1++)
        {
            String s = as[0];
            if (s != null)
            {
                ((List) (obj)).add(s.replace("-", "").toLowerCase(Locale.US));
            }
        }

        Collections.sort(((List) (obj)));
        as = new StringBuilder();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); as.append((String)((Iterator) (obj)).next())) { }
        as = as.toString();
        if (as.length() > 0)
        {
            return a(((String) (as)));
        } else
        {
            return null;
        }
    }

    public static void a(Context context, String s)
    {
        if (m(context))
        {
            io.fabric.sdk.android.c.a().a("Fabric", s);
        }
    }

    public static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
        throw closeable;
        closeable;
    }

    public static void a(Closeable closeable, String s)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
        io.fabric.sdk.android.c.a().c("Fabric", s, closeable);
        return;
    }

    public static void a(Flushable flushable, String s)
    {
        if (flushable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        flushable.flush();
        return;
        flushable;
        io.fabric.sdk.android.c.a().c("Fabric", s, flushable);
        return;
    }

    public static void a(InputStream inputstream, OutputStream outputstream, byte abyte0[])
        throws IOException
    {
        do
        {
            int i1 = inputstream.read(abyte0);
            if (i1 != -1)
            {
                outputstream.write(abyte0, 0, i1);
            } else
            {
                return;
            }
        } while (true);
    }

    public static boolean a(Context context, String s, boolean flag)
    {
        boolean flag1 = flag;
        if (context != null)
        {
            Resources resources = context.getResources();
            flag1 = flag;
            if (resources != null)
            {
                int i1 = a(context, s, "bool");
                if (i1 > 0)
                {
                    flag1 = resources.getBoolean(i1);
                } else
                {
                    int j1 = a(context, s, "string");
                    flag1 = flag;
                    if (j1 > 0)
                    {
                        return Boolean.parseBoolean(context.getString(j1));
                    }
                }
            }
        }
        return flag1;
    }

    public static long b()
    {
        io/fabric/sdk/android/services/common/CommonUtils;
        JVM INSTR monitorenter ;
        if (d != -1L) goto _L2; else goto _L1
_L1:
        String s;
        s = a(new File("/proc/meminfo"), "MemTotal");
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_188;
        }
        s = s.toUpperCase(Locale.US);
        if (!s.endsWith("KB")) goto _L4; else goto _L3
_L3:
        long l1 = a(s, "KB", 1024);
_L5:
        d = l1;
_L2:
        l1 = d;
        io/fabric/sdk/android/services/common/CommonUtils;
        JVM INSTR monitorexit ;
        return l1;
_L4:
label0:
        {
            if (!s.endsWith("MB"))
            {
                break label0;
            }
            l1 = a(s, "MB", 0x100000);
        }
          goto _L5
label1:
        {
            if (!s.endsWith("GB"))
            {
                break label1;
            }
            l1 = a(s, "GB", 0x40000000);
        }
          goto _L5
        io.fabric.sdk.android.c.a().a("Fabric", (new StringBuilder("Unexpected meminfo format while computing RAM: ")).append(s).toString());
        l1 = 0L;
          goto _L5
        NumberFormatException numberformatexception;
        numberformatexception;
        io.fabric.sdk.android.c.a().c("Fabric", (new StringBuilder("Unexpected meminfo format while computing RAM: ")).append(s).toString(), numberformatexception);
        l1 = 0L;
          goto _L5
        Exception exception;
        exception;
        throw exception;
    }

    public static long b(Context context)
    {
        android.app.ActivityManager.MemoryInfo memoryinfo = new android.app.ActivityManager.MemoryInfo();
        ((ActivityManager)context.getSystemService("activity")).getMemoryInfo(memoryinfo);
        return memoryinfo.availMem;
    }

    public static long b(String s)
    {
        s = new StatFs(s);
        long l1 = s.getBlockSize();
        return (long)s.getBlockCount() * l1 - (long)s.getAvailableBlocks() * l1;
    }

    private static String b(InputStream inputstream)
    {
        MessageDigest messagedigest;
        byte abyte0[];
        messagedigest = MessageDigest.getInstance("SHA-1");
        abyte0 = new byte[1024];
_L1:
        int i1 = inputstream.read(abyte0);
label0:
        {
            if (i1 == -1)
            {
                break label0;
            }
            try
            {
                messagedigest.update(abyte0, 0, i1);
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                io.fabric.sdk.android.c.a().c("Fabric", "Could not calculate hash for app icon.", inputstream);
                return "";
            }
        }
          goto _L1
        inputstream = a(messagedigest.digest());
        return inputstream;
    }

    public static void b(Context context, String s)
    {
        if (m(context))
        {
            io.fabric.sdk.android.c.a().e("Fabric", s);
        }
    }

    public static float c(Context context)
    {
        context = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i1 = context.getIntExtra("level", -1);
        int j1 = context.getIntExtra("scale", -1);
        return (float)i1 / (float)j1;
    }

    public static String c()
    {
        return "D";
    }

    public static Cipher c(String s)
        throws InvalidKeyException
    {
        if (s.length() < 32)
        {
            throw new InvalidKeyException("Key must be at least 32 bytes.");
        }
        s = new SecretKeySpec(s.getBytes(), 0, 32, "AES/ECB/PKCS7Padding");
        Cipher cipher;
        try
        {
            cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            io.fabric.sdk.android.c.a().c("Fabric", "Could not create Cipher for AES/ECB/PKCS7Padding - should never happen.", s);
            throw new RuntimeException(s);
        }
        cipher.init(1, s);
        return cipher;
    }

    public static void c(Context context, String s)
    {
        if (m(context))
        {
            io.fabric.sdk.android.c.a().a(4, "Fabric", s);
        }
    }

    public static String d(Context context, String s)
    {
        int i1 = a(context, s, "string");
        if (i1 > 0)
        {
            return context.getString(i1);
        } else
        {
            return "";
        }
    }

    public static boolean d(Context context)
    {
        if (e(context))
        {
            return false;
        }
        return ((SensorManager)context.getSystemService("sensor")).getDefaultSensor(8) != null;
    }

    public static boolean d(String s)
    {
        return s == null || s.length() == 0;
    }

    public static boolean e(Context context)
    {
        context = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        return "sdk".equals(Build.PRODUCT) || "google_sdk".equals(Build.PRODUCT) || context == null;
    }

    public static boolean f(Context context)
    {
        boolean flag;
        flag = e(context);
        context = Build.TAGS;
        break MISSING_BLOCK_LABEL_9;
        if ((flag || context == null || !context.contains("test-keys")) && !(new File("/system/app/Superuser.apk")).exists())
        {
            context = new File("/system/xbin/su");
            if (flag || !context.exists())
            {
                return false;
            }
        }
        return true;
    }

    public static int g(Context context)
    {
label0:
        {
            int k1 = 0;
            int i1;
            int j1;
            if (e(context))
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            i1 = j1;
            if (f(context))
            {
                i1 = j1 | 2;
            }
            if (!Debug.isDebuggerConnected())
            {
                j1 = k1;
                if (!Debug.waitingForDebugger())
                {
                    break label0;
                }
            }
            j1 = 1;
        }
        k1 = i1;
        if (j1 != 0)
        {
            k1 = i1 | 4;
        }
        return k1;
    }

    public static boolean h(Context context)
    {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static String i(Context context)
    {
        Object obj1 = null;
        context = context.getResources().openRawResource(j(context));
        Object obj = context;
        String s = b(context);
        obj = context;
        boolean flag = d(s);
        if (flag)
        {
            obj = obj1;
        } else
        {
            obj = s;
        }
        a(context, "Failed to close icon input stream.");
        return ((String) (obj));
        Exception exception;
        exception;
        context = null;
_L4:
        obj = context;
        io.fabric.sdk.android.c.a().c("Fabric", "Could not calculate hash for app icon.", exception);
        a(context, "Failed to close icon input stream.");
        return null;
        context;
        obj = null;
_L2:
        a(((Closeable) (obj)), "Failed to close icon input stream.");
        throw context;
        context;
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int j(Context context)
    {
        return context.getApplicationContext().getApplicationInfo().icon;
    }

    public static String k(Context context)
    {
        String s = null;
        int j1 = a(context, "io.fabric.android.build_id", "string");
        int i1 = j1;
        if (j1 == 0)
        {
            i1 = a(context, "com.crashlytics.android.build_id", "string");
        }
        if (i1 != 0)
        {
            s = context.getResources().getString(i1);
            io.fabric.sdk.android.c.a().a("Fabric", (new StringBuilder("Build ID is: ")).append(s).toString());
        }
        return s;
    }

    public static boolean l(Context context)
    {
        boolean flag;
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
            return context != null && context.isConnectedOrConnecting();
        } else
        {
            return true;
        }
    }

    private static boolean m(Context context)
    {
        if (b == null)
        {
            b = Boolean.valueOf(a(context, "com.crashlytics.Trace", false));
        }
        return b.booleanValue();
    }

}
