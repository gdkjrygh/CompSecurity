// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.content.Context;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// Referenced classes of package com.qihoo.antivirus.update:
//            m

public class af
{

    public static long a()
    {
        Object obj1;
        long l1;
        l1 = -1L;
        obj1 = null;
        Object obj = new RandomAccessFile("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq", "r");
        long l = Long.valueOf(((RandomAccessFile) (obj)).readLine()).longValue() / 1000L;
        obj1 = obj;
        l1 = l;
        if (obj == null) goto _L2; else goto _L1
_L1:
        long l2;
        try
        {
            ((RandomAccessFile) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
_L16:
        l2 = l;
        if (l >= 0L) goto _L4; else goto _L3
_L3:
        obj1 = new RandomAccessFile("/proc/cpuinfo", "r");
_L6:
        obj = ((RandomAccessFile) (obj1)).readLine();
        if (obj != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        l1 = l;
_L8:
        l2 = l1;
        if (obj1 != null)
        {
            Exception exception;
            int i;
            try
            {
                ((RandomAccessFile) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return l1;
            }
            l2 = l1;
        }
_L4:
        return l2;
        obj;
        obj = null;
_L14:
        obj1 = obj;
        if (obj != null)
        {
            try
            {
                ((RandomAccessFile) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                l = -1L;
                continue; /* Loop/switch isn't completed */
            }
            l = -1L;
            continue; /* Loop/switch isn't completed */
        }
          goto _L2
        obj;
_L13:
        if (obj1 != null)
        {
            try
            {
                ((RandomAccessFile) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        throw obj;
        if (!((String) (obj)).startsWith("BogoMIPS")) goto _L6; else goto _L5
_L5:
        obj = ((String) (obj)).split(":");
        l1 = l;
        if (obj.length <= 1) goto _L8; else goto _L7
_L7:
        i = Math.round(Float.valueOf(obj[1].trim()).floatValue());
        l1 = i;
          goto _L8
        obj1;
_L12:
        l2 = l;
        if (obj == null) goto _L4; else goto _L9
_L9:
        try
        {
            ((RandomAccessFile) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return l;
        }
        return l;
        exception;
        obj1 = obj;
        obj = exception;
_L11:
        if (obj1 != null)
        {
            try
            {
                ((RandomAccessFile) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        throw obj;
        obj;
        if (true) goto _L11; else goto _L10
_L10:
        obj;
        obj = obj1;
          goto _L12
        Exception exception1;
        exception1;
        obj1 = obj;
        obj = exception1;
          goto _L13
        obj1;
          goto _L14
_L2:
        l = l1;
        obj = obj1;
        if (true) goto _L16; else goto _L15
_L15:
    }

    public static long a(String s, long l)
    {
        long l1 = l;
        try
        {
            if (!TextUtils.isEmpty(s))
            {
                l1 = Long.parseLong(s.trim());
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return l;
        }
        return l1;
    }

    public static Object a(Context context, String s)
    {
        return context.getApplicationContext().getSystemService(s);
    }

    public static String a(InputStream inputstream)
    {
        Object obj;
        MessageDigest messagedigest;
        messagedigest = MessageDigest.getInstance("MD5");
        obj = new BufferedInputStream(inputstream);
        inputstream = new byte[1024];
_L3:
        int i = ((BufferedInputStream) (obj)).read(inputstream);
        if (i != -1) goto _L2; else goto _L1
_L1:
        inputstream = messagedigest.digest();
        if (obj != null)
        {
            try
            {
                ((BufferedInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
_L8:
        if (inputstream == null)
        {
            return null;
        } else
        {
            return m.a(inputstream);
        }
_L2:
        messagedigest.update(inputstream, 0, i);
          goto _L3
        inputstream;
_L7:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        try
        {
            ((BufferedInputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream = null;
            break MISSING_BLOCK_LABEL_45;
        }
        inputstream = null;
        break MISSING_BLOCK_LABEL_45;
        inputstream;
        obj = null;
_L5:
        if (obj != null)
        {
            try
            {
                ((BufferedInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw inputstream;
        inputstream;
        if (true) goto _L5; else goto _L4
_L4:
        inputstream;
        obj = null;
        if (true) goto _L7; else goto _L6
_L6:
        inputstream = null;
          goto _L8
    }

    public static String a(String s)
    {
        s = b(s);
        if (s == null)
        {
            return null;
        } else
        {
            return m.a(s);
        }
    }

    public static void a(Context context, String s, long l)
    {
        String s1;
        Object obj1;
        s1 = null;
        obj1 = null;
        context = context.openFileOutput((new StringBuilder(String.valueOf(s))).append(".timestamp").toString(), 0);
        s = new DataOutputStream(context);
        s.writeBytes(String.valueOf(l));
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        s.close();
_L2:
        return;
        context;
        context = null;
        s = obj1;
_L5:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        if (context == null) goto _L2; else goto _L1
_L1:
        try
        {
            context.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        s;
        context = null;
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
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        throw s;
        context;
        return;
        s;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        s1 = s;
        s = exception;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        Object obj = null;
        s = context;
        context = obj;
          goto _L5
        IOException ioexception;
        ioexception;
        Context context1 = context;
        context = s;
        s = context1;
          goto _L5
    }

    public static void a(Cursor cursor)
    {
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        if (!cursor.isClosed())
        {
            cursor.close();
        }
        return;
        cursor;
    }

    public static void a(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        byte abyte0[] = new byte[4096];
        do
        {
            int i = inputstream.read(abyte0);
            if (i <= 0)
            {
                outputstream.flush();
                return;
            }
            outputstream.write(abyte0, 0, i);
        } while (true);
    }

    public static boolean a(Context context)
    {
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        boolean flag;
        try
        {
            context = ((ConnectivityManager)context.getSystemService("connectivity")).getNetworkInfo(1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        flag = context.isConnected();
        return flag;
        return false;
    }

    public static boolean a(File file, File file1)
    {
        Object obj;
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        flag = flag1;
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj = null;
        file = new FileInputStream(file);
        flag = a(((InputStream) (file)), file1);
        flag1 = flag;
        flag = flag1;
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return flag1;
            }
            flag = flag1;
        }
        return flag;
        file;
        file = null;
_L4:
        flag = flag1;
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return false;
            }
            return false;
        } else
        {
            break MISSING_BLOCK_LABEL_54;
        }
        file;
        file1 = obj;
_L2:
        if (file1 != null)
        {
            try
            {
                file1.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file1) { }
        }
        throw file;
        Exception exception;
        exception;
        file1 = file;
        file = exception;
        if (true) goto _L2; else goto _L1
_L1:
        file1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean a(InputStream inputstream, File file)
    {
        byte abyte0[] = null;
        if (file.getParentFile().exists()) goto _L2; else goto _L1
_L1:
        file.getParentFile().mkdirs();
_L8:
        FileOutputStream fileoutputstream = new FileOutputStream(file);
        abyte0 = new byte[4096];
_L9:
        int i = inputstream.read(abyte0);
        if (i >= 0) goto _L4; else goto _L3
_L3:
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = true;
        if (fileoutputstream == null) goto _L6; else goto _L5
_L5:
        fileoutputstream.flush();
        flag = flag1;
_L11:
        try
        {
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            flag = false;
        }
_L6:
        if (!flag)
        {
            file.delete();
        }
        return flag;
_L2:
        if (!file.exists()) goto _L8; else goto _L7
_L7:
        file.delete();
          goto _L8
        inputstream;
        inputstream = abyte0;
_L10:
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        try
        {
            inputstream.flush();
        }
        catch (Exception exception) { }
        inputstream.close();
        flag = false;
          goto _L6
_L4:
        fileoutputstream.write(abyte0, 0, i);
          goto _L9
        inputstream;
        inputstream = fileoutputstream;
          goto _L10
        inputstream;
        flag = false;
          goto _L6
        inputstream;
        fileoutputstream = null;
_L12:
        if (fileoutputstream != null)
        {
            try
            {
                fileoutputstream.flush();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
            try
            {
                fileoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        throw inputstream;
        inputstream;
        flag = false;
          goto _L11
        inputstream;
          goto _L12
        flag = false;
          goto _L6
    }

    public static byte[] a(File file)
    {
        byte abyte0[] = null;
        Object obj;
        obj = MessageDigest.getInstance("MD5");
        file = new BufferedInputStream(new FileInputStream(file));
        byte abyte1[] = new byte[1024];
_L3:
        int i = file.read(abyte1);
        if (i != -1) goto _L2; else goto _L1
_L1:
        file.close();
        obj = ((MessageDigest) (obj)).digest();
        abyte0 = ((byte []) (obj));
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return ((byte []) (obj));
            }
            abyte0 = ((byte []) (obj));
        }
_L8:
        return abyte0;
_L2:
        ((MessageDigest) (obj)).update(abyte1, 0, i);
          goto _L3
        obj;
_L7:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return null;
            }
            return null;
        } else
        {
            break MISSING_BLOCK_LABEL_64;
        }
        obj;
        file = null;
_L5:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        throw obj;
        obj;
        if (true) goto _L5; else goto _L4
_L4:
        file;
        file = null;
        if (true) goto _L7; else goto _L6
_L6:
          goto _L8
    }

    public static byte[] a(byte abyte0[])
    {
        byte abyte1[] = null;
        MessageDigest messagedigest;
        try
        {
            messagedigest = MessageDigest.getInstance("MD5");
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            nosuchalgorithmexception = null;
        }
        if (messagedigest != null)
        {
            messagedigest.update(abyte0);
            abyte1 = messagedigest.digest();
        }
        return abyte1;
    }

    public static long b(InputStream inputstream)
    {
        Object obj1 = null;
        Object obj = new DataInputStream(inputstream);
        long l = Long.parseLong(((DataInputStream) (obj)).readLine());
        Object obj2;
        if (obj != null)
        {
            try
            {
                ((DataInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                return l;
            }
        }
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        inputstream.close();
        return l;
        obj;
        obj = obj1;
_L4:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        ((DataInputStream) (obj)).close();
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
        }
        return 0L;
        obj2;
        obj = null;
_L2:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        ((DataInputStream) (obj)).close();
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
        }
        throw obj2;
        obj2;
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static InputStream b(Context context, String s)
    {
        Object obj1 = null;
        Object obj = obj1;
        if (c(context, s) >= d(context, s))
        {
            try
            {
                obj = context.openFileInput(s);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = obj1;
            }
        }
        obj1 = obj;
        if (obj == null)
        {
            try
            {
                obj1 = context.getAssets().open(s);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return ((InputStream) (obj));
            }
        }
        return ((InputStream) (obj1));
    }

    public static String b(byte abyte0[])
    {
        return m.a(a(abyte0));
    }

    public static boolean b(Context context)
    {
        return a(context) || c(context);
    }

    public static byte[] b(String s)
    {
        return a(new File(s));
    }

    public static long c(Context context, String s)
    {
        Object obj = null;
        try
        {
            context = context.openFileInput((new StringBuilder(String.valueOf(s))).append(".timestamp").toString());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = obj;
        }
        if (context != null)
        {
            return b(context);
        } else
        {
            return 0L;
        }
    }

    public static void c(String s)
    {
        s = new File(s);
        if (!s.exists()) goto _L2; else goto _L1
_L1:
        if (!s.isDirectory()) goto _L4; else goto _L3
_L3:
        File afile[] = s.listFiles();
        if (afile == null) goto _L4; else goto _L5
_L5:
        int i;
        int j;
        j = afile.length;
        i = 0;
_L8:
        if (i < j) goto _L6; else goto _L4
_L4:
        s.delete();
_L2:
        return;
_L6:
        File file = afile[i];
        if (file != null)
        {
            c(file.getAbsolutePath());
        }
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static boolean c(Context context)
    {
        return ((TelephonyManager)a(context, "phone")).getDataState() != 0;
    }

    public static long d(Context context, String s)
    {
        Object obj = null;
        try
        {
            context = context.getAssets().open((new StringBuilder(String.valueOf(s))).append(".timestamp").toString());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = obj;
        }
        if (context != null)
        {
            return b(context);
        } else
        {
            return 0L;
        }
    }

    public static long d(String s)
    {
        if (s == null)
        {
            return 0L;
        }
        int i;
        long l;
        try
        {
            s = new StatFs(s);
            l = s.getBlockSize();
            i = s.getAvailableBlocks();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return 0L;
        }
        return (long)i * l;
    }

    public static String d(Context context)
    {
        try
        {
            context = ((TelephonyManager)a(context, "phone")).getDeviceId();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static String e(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        Object obj;
        Method method;
        Object aobj[];
        Method method1;
        obj = context.getApplicationContext().getSystemService("storage");
        context = obj.getClass().getMethod("getVolumeList", null);
        method = obj.getClass().getMethod("getVolumeState", new Class[] {
            java/lang/String
        });
        aobj = (Object[])context.invoke(obj, null);
        method1 = aobj[0].getClass().getMethod("getPath", null);
        int i = 0;
_L5:
        int j = aobj.length;
        if (i < j) goto _L2; else goto _L1
_L1:
        context = null;
_L3:
        obj = context;
        if (context == null)
        {
            obj = context;
            if ("mounted".equals(Environment.getExternalStorageState()))
            {
                obj = Environment.getExternalStorageDirectory().getAbsolutePath();
            }
        }
        return ((String) (obj));
_L2:
        boolean flag;
        context = (String)method1.invoke(aobj[i], null);
        flag = "mounted".equals(method.invoke(obj, new Object[] {
            context
        }));
        if (!flag) goto _L4; else goto _L3
_L4:
        i++;
          goto _L5
        context;
        context = null;
          goto _L3
        context = null;
          goto _L3
    }
}
