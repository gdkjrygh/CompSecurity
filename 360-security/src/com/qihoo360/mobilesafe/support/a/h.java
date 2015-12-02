// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.SystemProperties;
import android.text.TextUtils;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.support.NativeManager;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class h
{

    private static final String a[] = {
        "360s", "su"
    };
    private static String b = null;

    public static String a()
    {
        return String.format("com.qihoo.socket%x", new Object[] {
            Long.valueOf(System.currentTimeMillis() & 65535L)
        });
    }

    public static String a(Context context)
    {
        if (b("360s") == null)
        {
            if (b("su") != null)
            {
                return "su";
            } else
            {
                return null;
            }
        } else
        {
            return "360s";
        }
    }

    public static String a(Context context, boolean flag)
    {
        String s;
        String s2;
        File file;
        int i;
        int j;
        if (flag)
        {
            s = "librootjniex.so";
        } else
        {
            s = "librootjni.so";
        }
        file = context.getFileStreamPath(s);
        s2 = file.getAbsolutePath();
        if (!file.exists()) goto _L2; else goto _L1
_L1:
        i = -1;
        j = NativeManager.access(s2, 1);
        i = j;
_L4:
        if (i == 0)
        {
            if (flag)
            {
                s = "librootjniex.so";
            } else
            {
                s = "librootjni.so";
            }
            if (a(context, file, s))
            {
                return s2;
            }
        }
_L2:
        file.delete();
        String s1;
        if (flag)
        {
            s1 = "librootjniex.so";
        } else
        {
            s1 = "librootjni.so";
        }
        a(context, s2, s1);
        return s2;
        Throwable throwable;
        throwable;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String a(String s)
    {
        if (s != null && s.startsWith("/"))
        {
            return s;
        }
        String s1 = b(s);
        if (s1 == null)
        {
            return null;
        } else
        {
            return Utils.pathAppend(s1, s);
        }
    }

    private static void a(Context context, String s, String s1)
    {
        Object obj;
        Object obj2;
        obj = null;
        obj2 = null;
        context = new ZipFile(context.getApplicationInfo().publicSourceDir);
        Enumeration enumeration = context.entries();
_L4:
        boolean flag = enumeration.hasMoreElements();
        if (flag) goto _L2; else goto _L1
_L1:
        obj = null;
_L6:
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
_L7:
        try
        {
            NativeManager.chmod(s, 493);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
_L2:
        obj2 = (ZipEntry)enumeration.nextElement();
        if (((ZipEntry) (obj2)).isDirectory() || !((ZipEntry) (obj2)).getName().endsWith(s1)) goto _L4; else goto _L3
_L3:
        s1 = new FileOutputStream(s);
        obj2 = context.getInputStream(((ZipEntry) (obj2)));
        Utils.CopyStream(((InputStream) (obj2)), s1);
        obj = s1;
        if (obj2 == null) goto _L6; else goto _L5
_L5:
        ((InputStream) (obj2)).close();
        obj = s1;
          goto _L6
        obj;
        obj = s1;
        s1 = context;
        context = ((Context) (obj));
_L10:
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
          goto _L7
        s;
        context = null;
        s1 = ((String) (obj));
_L9:
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1) { }
        }
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        throw s;
        s;
        s1 = ((String) (obj));
        continue; /* Loop/switch isn't completed */
        s;
        if (true) goto _L9; else goto _L8
_L8:
        context;
        context = null;
        s1 = ((String) (obj2));
          goto _L10
        s1;
        Object obj1 = null;
        s1 = context;
        context = obj1;
          goto _L10
    }

    private static boolean a(Context context, File file, String s)
    {
        Context context1;
        Object obj1;
        context1 = null;
        obj1 = null;
        ZipFile zipfile = new ZipFile(context.getApplicationInfo().publicSourceDir);
        Enumeration enumeration = zipfile.entries();
_L2:
        boolean flag = enumeration.hasMoreElements();
        if (!flag)
        {
            long l;
            long l1;
            boolean flag1;
            if (false)
            {
                try
                {
                    throw new NullPointerException();
                }
                // Misplaced declaration of an exception variable
                catch (Context context) { }
            }
            if (false)
            {
                try
                {
                    throw new NullPointerException();
                }
                // Misplaced declaration of an exception variable
                catch (Context context) { }
            }
            if (zipfile != null)
            {
                try
                {
                    zipfile.close();
                }
                // Misplaced declaration of an exception variable
                catch (Context context) { }
            }
            return false;
        }
        context = (ZipEntry)enumeration.nextElement();
        if (context.isDirectory() || !context.getName().endsWith(s)) goto _L2; else goto _L1
_L1:
        l1 = context.getSize();
        l = file.length();
        if (l1 == l) goto _L4; else goto _L3
_L3:
        s = null;
        context1 = null;
_L6:
        if (context1 != null)
        {
            try
            {
                context1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        if (zipfile != null)
        {
            try
            {
                zipfile.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        return false;
_L4:
        Exception exception;
        try
        {
            context = zipfile.getInputStream(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
            file = zipfile;
            s = obj1;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            context = null;
            s = context1;
            continue; /* Loop/switch isn't completed */
        }
        try
        {
_L7:
            file = new FileInputStream(file);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            Object obj = null;
            s = context;
            file = zipfile;
            context = obj;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            s = context1;
            continue; /* Loop/switch isn't completed */
        }
        flag1 = Utils.diffStream(context, file);
        s = file;
        context1 = context;
        if (!flag1) goto _L6; else goto _L5
_L5:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        if (zipfile != null)
        {
            try
            {
                zipfile.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        return true;
        context;
        context = null;
        file = null;
        s = obj1;
_L10:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        return false;
        file;
        context = null;
        zipfile = null;
        s = context1;
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
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        if (zipfile != null)
        {
            try
            {
                zipfile.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        throw file;
        exception;
        s = file;
        file = exception;
        if (true) goto _L8; else goto _L7
        s;
        s = context;
        context = file;
        file = zipfile;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public static byte[] a(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream;
        byte abyte0[];
        if (inputstream == null)
        {
            return null;
        }
        abyte0 = new byte[8192];
        bytearrayoutputstream = new ByteArrayOutputStream();
_L1:
        int i;
        try
        {
            i = inputstream.read(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            try
            {
                bytearrayoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                return null;
            }
            return null;
        }
        if (i > 0)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        inputstream = bytearrayoutputstream.toByteArray();
        bytearrayoutputstream.close();
        return inputstream;
        bytearrayoutputstream.write(abyte0, 0, i);
          goto _L1
    }

    public static byte[] a(String s, ArrayList arraylist)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bytearrayoutputstream.write(s.getBytes());
        bytearrayoutputstream.write(0);
        bytearrayoutputstream.write(arraylist.size());
        bytearrayoutputstream.write(0);
        s = arraylist.iterator();
_L3:
        if (s.hasNext()) goto _L2; else goto _L1
_L1:
        s = bytearrayoutputstream.toByteArray();
        bytearrayoutputstream.close();
        return s;
_L2:
        try
        {
            arraylist = (String)s.next();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                bytearrayoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            return null;
        }
        if (arraylist == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        bytearrayoutputstream.write(arraylist.getBytes());
        bytearrayoutputstream.write(0);
          goto _L3
    }

    public static byte[] a(String s, List list)
    {
        return a(s, list, null, 16);
    }

    public static byte[] a(String s, List list, List list1)
    {
        return a(s, list, list1, 32);
    }

    private static byte[] a(String s, List list, List list1, int i)
    {
        ByteArrayOutputStream bytearrayoutputstream;
        bytearrayoutputstream = new ByteArrayOutputStream(256);
        i = (byte)i;
        bytearrayoutputstream.write(i);
        bytearrayoutputstream.write(s.getBytes());
        bytearrayoutputstream.write(0);
        if (list == null) goto _L2; else goto _L1
_L1:
        bytearrayoutputstream.write((byte)(list.size() & 0xff));
        s = list.iterator();
_L7:
        if (s.hasNext()) goto _L4; else goto _L3
_L3:
        if (list1 == null)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        bytearrayoutputstream.write((byte)(list1.size() & 0xff));
        s = list1.iterator();
_L8:
        boolean flag = s.hasNext();
        if (flag) goto _L6; else goto _L5
_L5:
        s = bytearrayoutputstream.toByteArray();
        try
        {
            bytearrayoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            return s;
        }
        return s;
_L4:
        list = (String)s.next();
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        bytearrayoutputstream.write(list.getBytes());
        bytearrayoutputstream.write(0);
          goto _L7
_L2:
        bytearrayoutputstream.write(0);
          goto _L3
_L6:
        list = (String)s.next();
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        bytearrayoutputstream.write(list.getBytes());
        bytearrayoutputstream.write(0);
          goto _L8
        try
        {
            bytearrayoutputstream.write(0);
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
          goto _L5
    }

    public static String b()
    {
        String s = c();
        if ("armeabi-v7a".equalsIgnoreCase(s) || "armeabi".equalsIgnoreCase(s))
        {
            return "armeabi";
        }
        if ("x86".equalsIgnoreCase(s))
        {
            return "x86";
        } else
        {
            return "armeabi";
        }
    }

    public static String b(Context context)
    {
        Object obj;
        byte byte0;
        byte0 = -1;
        obj = context.getFilesDir();
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((File) (obj)).getParentFile();
        if (obj == null) goto _L2; else goto _L3
_L3:
        File file;
        obj = new StringBuilder(((File) (obj)).getAbsolutePath());
        ((StringBuilder) (obj)).append("/lib/");
        ((StringBuilder) (obj)).append("libsu.so");
        obj = ((StringBuilder) (obj)).toString();
        file = new File(((String) (obj)));
        if (!file.exists()) goto _L2; else goto _L4
_L4:
        int i;
        try
        {
            i = NativeManager.access(((String) (obj)), 1);
        }
        catch (Throwable throwable1)
        {
            i = -1;
        }
        if (i != 0 || !a(context, file, "libsu.so")) goto _L2; else goto _L5
_L5:
        return ((String) (obj));
_L2:
        File file1 = context.getFileStreamPath("libsu.so");
        String s = file1.getAbsolutePath();
        if (!file1.exists())
        {
            break; /* Loop/switch isn't completed */
        }
        int j;
        try
        {
            j = NativeManager.access(s, 1);
        }
        catch (Throwable throwable)
        {
            j = byte0;
        }
        if (j != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = s;
        if (a(context, file1, "libsu.so")) goto _L5; else goto _L6
_L6:
        file1.delete();
        a(context, s, "libsu.so");
        return s;
    }

    public static String b(String s)
    {
        if (s == null)
        {
            return s;
        }
        if ((new File("/system/bin/", s)).isFile())
        {
            return "/system/bin/";
        }
        if ((new File("/system/xbin/", s)).isFile())
        {
            return "/system/xbin/";
        }
        Object obj = System.getenv("PATH");
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            return null;
        }
        if (((String) (obj)).contains(":"))
        {
            obj = ((String) (obj)).split(":");
            int j = obj.length;
            int i = 0;
            do
            {
                if (i >= j)
                {
                    return null;
                }
                String s1 = obj[i];
                if ((new File(s1, s)).isFile())
                {
                    return s1;
                }
                i++;
            } while (true);
        }
        if ((new File(((String) (obj)), s)).isFile())
        {
            return ((String) (obj));
        } else
        {
            return null;
        }
    }

    public static byte[] b(String s, List list, List list1)
    {
        return a(s, list, list1, 64);
    }

    private static String c()
    {
        if (b != null)
        {
            return b;
        }
        String s1 = SystemProperties.get("ro.product.cpu.abi");
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = "armeabi-v7a";
        }
        b = s;
        return s;
    }

    public static String c(Context context)
    {
        return a(context, true);
    }

    public static boolean d(Context context)
    {
        return true;
    }

}
