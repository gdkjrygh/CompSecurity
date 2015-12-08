// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.b;

import a.a.a.a.f;
import a.a.a.a.s;
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
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package a.a.a.a.a.b:
//            m, n

public final class l
{

    public static final Comparator a = new m();
    private static Boolean b = null;
    private static final char c[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'a', 'b', 'c', 'd', 'e', 'f'
    };
    private static long d = -1L;
    private static Boolean e = null;

    public static int a()
    {
        return a.a.a.a.a.b.n.a().ordinal();
    }

    public static int a(Context context, String s1, String s2)
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
        return resources.getIdentifier(s1, s2, context);
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

    private static long a(String s1, String s2, int i1)
    {
        return Long.parseLong(s1.split(s2)[0].trim()) * (long)i1;
    }

    public static android.app.ActivityManager.RunningAppProcessInfo a(String s1, Context context)
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
            } while (!runningappprocessinfo.processName.equals(s1));
            return runningappprocessinfo;
        }
        return null;
    }

    public static SharedPreferences a(Context context)
    {
        return context.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    private static String a(File file, String s1)
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
        String s2 = bufferedreader.readLine();
        obj = obj1;
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        obj = bufferedreader;
        String as[] = Pattern.compile("\\s*:\\s*").split(s2, 2);
        obj = bufferedreader;
        if (as.length <= 1) goto _L2; else goto _L1
_L1:
        obj = bufferedreader;
        if (!as[0].equals(s1)) goto _L2; else goto _L3
_L3:
        obj = as[1];
        a(((Closeable) (bufferedreader)), "Failed to close system file reader.");
        return ((String) (obj));
        Exception exception;
        exception;
        s1 = null;
_L7:
        obj = s1;
        a.a.a.a.f.d().b("Fabric", (new StringBuilder("Error parsing ")).append(file).toString(), exception);
        a(((Closeable) (s1)), "Failed to close system file reader.");
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
        s1 = bufferedreader;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static String a(InputStream inputstream)
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

    public static String a(String s1)
    {
        return a(s1.getBytes(), "SHA-1");
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

    private static String a(byte abyte0[], String s1)
    {
        MessageDigest messagedigest;
        try
        {
            messagedigest = MessageDigest.getInstance(s1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            a.a.a.a.f.d().b("Fabric", (new StringBuilder("Could not create hashing algorithm: ")).append(s1).append(", returning empty string.").toString(), abyte0);
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
            String s1 = as[0];
            if (s1 != null)
            {
                ((List) (obj)).add(s1.replace("-", "").toLowerCase(Locale.US));
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

    public static void a(Context context, String s1)
    {
        if (n(context))
        {
            a.a.a.a.f.d().c("Fabric", s1);
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

    public static void a(Closeable closeable, String s1)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
        a.a.a.a.f.d().b("Fabric", s1, closeable);
        return;
    }

    public static void a(Flushable flushable, String s1)
    {
        if (flushable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        flushable.flush();
        return;
        flushable;
        a.a.a.a.f.d().b("Fabric", s1, flushable);
        return;
    }

    public static void a(InputStream inputstream, OutputStream outputstream, byte abyte0[])
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

    public static boolean a(Context context, String s1, boolean flag)
    {
        boolean flag1 = flag;
        if (context != null)
        {
            Resources resources = context.getResources();
            flag1 = flag;
            if (resources != null)
            {
                int i1 = a(context, s1, "bool");
                if (i1 > 0)
                {
                    flag1 = resources.getBoolean(i1);
                } else
                {
                    int j1 = a(context, s1, "string");
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
        a/a/a/a/a/b/l;
        JVM INSTR monitorenter ;
        if (d != -1L) goto _L2; else goto _L1
_L1:
        String s1;
        s1 = a(new File("/proc/meminfo"), "MemTotal");
        if (TextUtils.isEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_165;
        }
        s1 = s1.toUpperCase(Locale.US);
        if (!s1.endsWith("KB")) goto _L4; else goto _L3
_L3:
        long l1 = a(s1, "KB", 1024);
_L5:
        d = l1;
_L2:
        l1 = d;
        a/a/a/a/a/b/l;
        JVM INSTR monitorexit ;
        return l1;
_L4:
label0:
        {
            if (!s1.endsWith("MB"))
            {
                break label0;
            }
            l1 = a(s1, "MB", 0x100000);
        }
          goto _L5
label1:
        {
            if (!s1.endsWith("GB"))
            {
                break label1;
            }
            l1 = a(s1, "GB", 0x40000000);
        }
          goto _L5
        a.a.a.a.f.d();
        l1 = 0L;
          goto _L5
        NumberFormatException numberformatexception;
        numberformatexception;
        a.a.a.a.f.d().b("Fabric", (new StringBuilder("Unexpected meminfo format while computing RAM: ")).append(s1).toString(), numberformatexception);
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

    public static long b(String s1)
    {
        s1 = new StatFs(s1);
        long l1 = s1.getBlockSize();
        return (long)s1.getBlockCount() * l1 - (long)s1.getAvailableBlocks() * l1;
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
                a.a.a.a.f.d().b("Fabric", "Could not calculate hash for app icon.", inputstream);
                return "";
            }
        }
          goto _L1
        inputstream = a(messagedigest.digest());
        return inputstream;
    }

    public static void b(Context context, String s1)
    {
        if (n(context))
        {
            a.a.a.a.f.d().d("Fabric", s1);
        }
    }

    public static float c(Context context)
    {
        context = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i1 = context.getIntExtra("level", -1);
        int j1 = context.getIntExtra("scale", -1);
        return (float)i1 / (float)j1;
    }

    public static String c(Context context, String s1)
    {
        int i1 = a(context, s1, "string");
        if (i1 > 0)
        {
            return context.getString(i1);
        } else
        {
            return "";
        }
    }

    public static Cipher c(String s1)
    {
        if (s1.length() < 32)
        {
            throw new InvalidKeyException("Key must be at least 32 bytes.");
        }
        s1 = new SecretKeySpec(s1.getBytes(), 0, 32, "AES/ECB/PKCS7Padding");
        Cipher cipher;
        try
        {
            cipher = Cipher.getInstance("AES/ECB/PKCS7Padding");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            a.a.a.a.f.d().b("Fabric", "Could not create Cipher for AES/ECB/PKCS7Padding - should never happen.", s1);
            throw new RuntimeException(s1);
        }
        cipher.init(1, s1);
        return cipher;
    }

    public static boolean d(Context context)
    {
        if (f(context))
        {
            return false;
        }
        return ((SensorManager)context.getSystemService("sensor")).getDefaultSensor(8) != null;
    }

    public static boolean d(String s1)
    {
        return s1 == null || s1.length() == 0;
    }

    public static void e(Context context)
    {
        if (n(context))
        {
            a.a.a.a.f.d();
        }
    }

    public static boolean f(Context context)
    {
        context = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        return "sdk".equals(Build.PRODUCT) || "google_sdk".equals(Build.PRODUCT) || context == null;
    }

    public static boolean g(Context context)
    {
        boolean flag;
        flag = f(context);
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

    public static int h(Context context)
    {
label0:
        {
            int k1 = 0;
            int i1;
            int j1;
            if (f(context))
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            i1 = j1;
            if (g(context))
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

    public static boolean i(Context context)
    {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static String j(Context context)
    {
        Object obj1 = null;
        context = context.getResources().openRawResource(k(context));
        Object obj = context;
        String s1 = b(context);
        obj = context;
        boolean flag = d(s1);
        if (flag)
        {
            obj = obj1;
        } else
        {
            obj = s1;
        }
        a(context, "Failed to close icon input stream.");
        return ((String) (obj));
        Exception exception;
        exception;
        context = null;
_L4:
        obj = context;
        a.a.a.a.f.d().b("Fabric", "Could not calculate hash for app icon.", exception);
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

    public static int k(Context context)
    {
        return context.getApplicationContext().getApplicationInfo().icon;
    }

    public static String l(Context context)
    {
        String s1 = null;
        int j1 = a(context, "io.fabric.android.build_id", "string");
        int i1 = j1;
        if (j1 == 0)
        {
            i1 = a(context, "com.crashlytics.android.build_id", "string");
        }
        if (i1 != 0)
        {
            s1 = context.getResources().getString(i1);
            a.a.a.a.f.d();
        }
        return s1;
    }

    public static boolean m(Context context)
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

    private static boolean n(Context context)
    {
        if (b == null)
        {
            b = Boolean.valueOf(a(context, "com.crashlytics.Trace", false));
        }
        return b.booleanValue();
    }

}
