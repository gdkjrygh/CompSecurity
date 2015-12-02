// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.b;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.qihoo360.mobilesafe.b:
//            s

public class o
{
    class a
        implements FileFilter
    {

        public boolean accept(File file)
        {
            return Pattern.matches("cpu[0-9]", file.getName());
        }

        a()
        {
        }
    }


    private static String a = null;
    private static int b = 16;

    public static String a()
    {
        FileInputStream fileinputstream = new FileInputStream("/proc/self/cmdline");
        Object obj = fileinputstream;
        byte abyte0[] = new byte[32];
        int i1 = 0;
_L2:
        obj = fileinputstream;
        int j1 = fileinputstream.read();
        if (j1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = fileinputstream;
        if (i1 >= abyte0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        abyte0[i1] = (byte)j1;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        obj = fileinputstream;
        Object obj1 = new String(abyte0, 0, i1, "UTF-8");
        Exception exception3;
        if (fileinputstream != null)
        {
            try
            {
                fileinputstream.close();
            }
            catch (Exception exception)
            {
                return ((String) (obj1));
            }
        }
        return ((String) (obj1));
        if (fileinputstream != null)
        {
            try
            {
                fileinputstream.close();
            }
            catch (Exception exception1) { }
        }
        return null;
        obj1;
        fileinputstream = null;
_L6:
        obj = fileinputstream;
        Log.e("SysUtil", "", ((Throwable) (obj1)));
        if (fileinputstream != null)
        {
            try
            {
                fileinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        break MISSING_BLOCK_LABEL_90;
        exception3;
        obj = null;
_L4:
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            catch (Exception exception2) { }
        }
        throw exception3;
        exception3;
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static void a(Context context, File file, boolean flag)
    {
        String s1;
        TelephonyManager telephonymanager;
        telephonymanager = (TelephonyManager)s.c(context, "phone");
        s1 = telephonymanager.getDeviceId();
        if (!c(context, s1)) goto _L2; else goto _L1
_L1:
        String s2 = f();
        s1 = s2;
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        s1 = s2.toLowerCase();
        if (!c(context, s1))
        {
            break MISSING_BLOCK_LABEL_232;
        }
        s1 = e();
        if (!c(context, s1)) goto _L4; else goto _L3
_L3:
        s1 = k(context);
        if (!c(context, s1)) goto _L6; else goto _L5
_L5:
        s1 = telephonymanager.getSubscriberId();
        if (!c(context, s1)) goto _L8; else goto _L7
_L7:
        s1 = j(context);
        if (!c(context, s1)) goto _L10; else goto _L9
_L9:
        s1 = (new StringBuilder()).append("U").append(d()).toString();
_L2:
        a = s1;
        a(context, a, file, flag);
        return;
_L10:
        try
        {
            s1 = (new StringBuilder()).append("M").append(s1).toString();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
          goto _L2
_L8:
        s1 = (new StringBuilder()).append("I").append(s1).toString();
          goto _L2
_L6:
        s1 = (new StringBuilder()).append("A").append(s1).toString();
          goto _L2
_L4:
        s1 = (new StringBuilder()).append("S").append(s1).toString();
          goto _L2
        s1 = (new StringBuilder()).append("C").append(s1).toString();
          goto _L2
    }

    private static void a(Context context, String s1, File file, boolean flag)
    {
        if (!TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s2 = null;
        file = new FileOutputStream(file, false);
        s2 = s1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        s2 = s.b(s1, context.getPackageName());
        file.write(s2.getBytes());
        if (file != null)
        {
            try
            {
                file.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        context;
        file = null;
_L7:
        if (file == null) goto _L1; else goto _L4
_L4:
        try
        {
            file.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        context;
        file = s2;
_L6:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        throw context;
        context;
        if (true) goto _L6; else goto _L5
_L5:
        context;
          goto _L7
    }

    public static boolean a(Context context)
    {
        context = (ConnectivityManager)s.c(context, "connectivity");
        try
        {
            context = context.getNetworkInfo(1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
        }
        if (context != null)
        {
            return context.isConnected();
        } else
        {
            return false;
        }
    }

    public static boolean a(Context context, String s1)
    {
        PackageManager packagemanager = context.getPackageManager();
        if (packagemanager != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        context = null;
        s1 = packagemanager.getPackageInfo(s1, 0);
        context = s1;
_L4:
        if (context != null)
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        s1;
          goto _L4
    }

    public static int b()
    {
        int i1 = 0;
        int j1 = (new File("/sys/devices/system/cpu/")).listFiles(new a()).length;
        i1 = j1;
_L6:
        Object obj1;
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        obj1 = null;
        Object obj = new BufferedReader(new InputStreamReader(new FileInputStream(new File("/sys/devices/system/cpu/present"))));
        obj1 = ((BufferedReader) (obj)).readLine().split("\\-");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        j1 = Integer.parseInt(obj1[obj1.length - 1]);
        i1 = j1 + 1;
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
_L1:
        if (i1 != 0)
        {
            return i1;
        } else
        {
            return 1;
        }
        obj;
        obj = null;
_L4:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
          goto _L1
        obj;
_L3:
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        throw obj;
        Exception exception2;
        exception2;
        obj1 = obj;
        obj = exception2;
        if (true) goto _L3; else goto _L2
_L2:
        Exception exception1;
        exception1;
          goto _L4
        Exception exception;
        exception;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static String b(Context context)
    {
        com/qihoo360/mobilesafe/b/o;
        JVM INSTR monitorenter ;
        if (a != null) goto _L2; else goto _L1
_L1:
        File file = new File(context.getFilesDir(), "DEV");
        if (!file.exists()) goto _L4; else goto _L3
_L3:
        a = b(context, file, true);
        if (TextUtils.isEmpty(a))
        {
            a(context, file, true);
        }
_L2:
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        context = "";
_L6:
        com/qihoo360/mobilesafe/b/o;
        JVM INSTR monitorexit ;
        return context;
_L4:
        File file1;
        file1 = new File(context.getFilesDir(), "DEVICE_ID");
        if (file1.exists())
        {
            break MISSING_BLOCK_LABEL_104;
        }
        a(context, file, true);
          goto _L2
        context;
        throw context;
        a = b(context, file1, false);
        if (!TextUtils.isEmpty(a))
        {
            break MISSING_BLOCK_LABEL_136;
        }
        a(context, file, true);
_L5:
        file1.delete();
          goto _L2
        a(context, a, file, true);
          goto _L5
        context = a;
          goto _L6
    }

    private static String b(Context context, File file, boolean flag)
    {
        Context context1 = null;
        file = new RandomAccessFile(file, "r");
        byte abyte0[];
        abyte0 = new byte[(int)file.length()];
        file.readFully(abyte0);
        if (!flag) goto _L2; else goto _L1
_L1:
        context = s.a(new String(abyte0), context.getPackageName());
_L3:
        context1 = context;
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return context;
            }
            context1 = context;
        }
_L5:
        return context1;
_L2:
        context = new String(abyte0);
          goto _L3
        context;
        file = null;
_L8:
        if (file == null) goto _L5; else goto _L4
_L4:
        try
        {
            file.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return null;
        context;
        file = null;
_L7:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        throw context;
        context;
        if (true) goto _L7; else goto _L6
_L6:
        context;
          goto _L8
    }

    public static void b(Context context, String s1)
    {
        s1 = new Intent("android.intent.action.DELETE", Uri.parse((new StringBuilder()).append("package:").append(s1).toString()));
        try
        {
            context.startActivity(s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public static boolean c()
    {
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        boolean flag;
        Class class1 = Class.forName("android.os.Environment");
        flag = ((Boolean)class1.getMethod("isExternalStorageEmulated", new Class[0]).invoke(class1.getClass(), new Object[0])).booleanValue();
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_51;
        Exception exception;
        exception;
        return false;
    }

    public static boolean c(Context context)
    {
        Object obj;
        int i1;
        if (android.os.Build.VERSION.SDK_INT >= 10)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        obj = context.getContentResolver();
        Uri uri = Uri.parse("content://com.sec.android.app.twlauncher.settings/favorites?notify=true");
        int j1;
        int k1;
        int l1;
        int i2;
        try
        {
            obj = ((ContentResolver) (obj)).query(uri, new String[] {
                "screen", "spanX", "spanY"
            }, null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
            obj = null;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        i1 = l(context);
        j1 = ((Cursor) (obj)).getColumnIndexOrThrow("spanX");
        k1 = ((Cursor) (obj)).getColumnIndexOrThrow("spanY");
        i1 *= b;
        if (!((Cursor) (obj)).moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = ((Cursor) (obj)).getInt(j1);
        i2 = ((Cursor) (obj)).getInt(k1);
        i1 -= l1 * i2;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_88;
_L1:
        s.a(((Cursor) (obj)));
_L3:
        return i1 > 0;
        context;
        s.a(((Cursor) (obj)));
        i1 = 0;
          goto _L3
        context;
        s.a(((Cursor) (obj)));
        throw context;
        return true;
    }

    private static boolean c(Context context, String s1)
    {
        if (!TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        BufferedReader bufferedreader = null;
        context = s.b(context, "invalid-imei.idx");
        if (context == null) goto _L4; else goto _L3
_L3:
        bufferedreader = new BufferedReader(new InputStreamReader(context));
_L6:
        String s2 = bufferedreader.readLine();
        if (s2 == null) goto _L4; else goto _L5
_L5:
        boolean flag = Pattern.compile(s2).matcher(s1).matches();
        if (flag)
        {
            if (context != null)
            {
                try
                {
                    context.close();
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return true;
                }
                return true;
            }
            continue; /* Loop/switch isn't completed */
        }
          goto _L6
        Exception exception;
        exception;
        exception.printStackTrace();
          goto _L6
        s1;
_L10:
        s1.printStackTrace();
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        return false;
_L4:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        if (true)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        s1;
        context = null;
_L8:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        throw s1;
        s1;
        continue; /* Loop/switch isn't completed */
        s1;
        if (true) goto _L8; else goto _L7
_L7:
        s1;
        context = bufferedreader;
        if (true) goto _L10; else goto _L9
_L9:
        if (true) goto _L1; else goto _L11
_L11:
    }

    private static String d()
    {
        String s1 = UUID.randomUUID().toString();
        String s2 = s1.replaceAll("-", "").replace(":", "").toLowerCase();
        return s2;
        Exception exception;
        exception;
        s1 = null;
_L2:
        exception.printStackTrace();
        return s1;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean d(Context context)
    {
        boolean flag1 = false;
        int i1;
        boolean flag;
        try
        {
            context = AccountManager.get(context).getAccountsByType("com.google");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        flag = flag1;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        i1 = context.length;
        flag = flag1;
        if (i1 > 0)
        {
            flag = true;
        }
        return flag;
    }

    private static String e()
    {
        String s1 = null;
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            s1 = Build.SERIAL;
        }
        return s1;
    }

    public static boolean e(Context context)
    {
        boolean flag1 = false;
        int i1;
        boolean flag;
        try
        {
            context = AccountManager.get(context).getAccountsByType("com.facebook.auth.login");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        flag = flag1;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        i1 = context.length;
        flag = flag1;
        if (i1 > 0)
        {
            flag = true;
        }
        return flag;
    }

    private static String f()
    {
        String s2;
        Object obj;
        obj = null;
        s2 = null;
        LineNumberReader linenumberreader = new LineNumberReader(new InputStreamReader(Runtime.getRuntime().exec("cat /proc/cpuinfo").getInputStream()));
        int i1 = 1;
_L2:
        String s1;
        s1 = s2;
        if (i1 >= 100)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        String s3 = linenumberreader.readLine();
        s1 = s2;
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        int j1;
        int k1;
        s1 = s3.toLowerCase();
        j1 = s1.indexOf("serial");
        k1 = s1.indexOf(":");
        if (j1 <= -1 || k1 <= 0)
        {
            break MISSING_BLOCK_LABEL_109;
        }
        s1 = s1.substring(k1 + 1);
        s2 = s1.trim();
        s1 = s2;
        return s1;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        IOException ioexception;
        ioexception;
        s1 = obj;
_L4:
        ioexception.printStackTrace();
        return s1;
        ioexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int[] f(Context context)
    {
        new DisplayMetrics();
        context = context.getResources().getDisplayMetrics();
        return (new int[] {
            ((DisplayMetrics) (context)).widthPixels, ((DisplayMetrics) (context)).heightPixels
        });
    }

    public static boolean g(Context context)
    {
        return android.os.Build.VERSION.SDK_INT > 10 && a(context, "com.facebook.katana") && e(context);
    }

    public static boolean h(Context context)
    {
        boolean flag = false;
        if (!TextUtils.isEmpty(i(context)))
        {
            flag = true;
        }
        return flag;
    }

    public static String i(Context context)
    {
        String s1 = "";
        Account aaccount[];
        try
        {
            aaccount = AccountManager.get(context).getAccountsByType("com.google");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return "";
        }
        context = s1;
        if (aaccount == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        context = s1;
        if (aaccount.length > 0)
        {
            context = aaccount[0].name;
        }
        return context;
    }

    private static String j(Context context)
    {
        context = ((WifiManager)s.c(context, "wifi")).getConnectionInfo();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        context = context.getMacAddress();
        Object obj;
        obj = context;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        obj = context.replaceAll("-", "").replaceAll(":", "").toLowerCase();
        return ((String) (obj));
        Exception exception;
        exception;
        context = null;
_L2:
        exception.printStackTrace();
        return context;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
        return null;
    }

    private static String k(Context context)
    {
        Object obj = null;
        Context context1 = null;
        if (android.os.Build.VERSION.SDK_INT < 8)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        context1 = obj;
        try
        {
            context = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return context1;
        }
        context1 = context;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        context1 = context;
        context = context.toLowerCase();
        context1 = context;
        return context1;
    }

    private static int l(Context context)
    {
        context = context.getContentResolver().query(Uri.parse("content://com.sec.android.app.twlauncher.settings/favorites?notify=true"), new String[] {
            "MAX(screen)"
        }, null, null, null);
        Exception exception1;
        if (context != null)
        {
            int i1;
            try
            {
                context.moveToNext();
                i1 = context.getInt(0);
            }
            catch (Exception exception)
            {
                s.a(context);
                return -1;
            }
            finally
            {
                s.a(context);
            }
            s.a(context);
            return i1 + 1;
        } else
        {
            return -1;
        }
        throw exception1;
    }

}
