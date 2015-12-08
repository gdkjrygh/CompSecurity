// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.d;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import com.roidapp.baselib.c.n;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class a
{

    public static File a(Context context)
    {
        if (!n.b())
        {
            break MISSING_BLOCK_LABEL_101;
        }
        Object obj = android/content/Context.getMethod("getExternalCacheDir", new Class[0]);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        File file = (File)((Method) (obj)).invoke(context, null);
        obj = file;
        if (file != null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        obj = (new StringBuilder("/Android/data/")).append(context.getPackageName()).append("/cache/").toString();
        obj = new File((new StringBuilder()).append(Environment.getExternalStorageDirectory().getPath()).append(((String) (obj))).toString());
        return ((File) (obj));
        Exception exception;
        exception;
        exception.printStackTrace();
        context = (new StringBuilder("/Android/data/")).append(context.getPackageName()).append("/cache/").toString();
        return new File((new StringBuilder()).append(Environment.getExternalStorageDirectory().getPath()).append(context).toString());
    }

    public static File a(Context context, String s)
    {
label0:
        {
            if ("mounted".equals(Environment.getExternalStorageState()) || !e())
            {
                context = a(context).getPath();
                break label0;
            }
            try
            {
                context = context.getCacheDir().getPath();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                context = null;
            }
        }
        while (context != null) 
        {
            return new File(context, s);
        }
        return null;
    }

    public static String a()
    {
        return (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/roidapp/download").toString();
    }

    public static String a(File file, String s)
    {
        ByteArrayOutputStream bytearrayoutputstream;
        byte abyte0[];
        if (file == null)
        {
            return null;
        }
        abyte0 = new byte[4096];
        bytearrayoutputstream = new ByteArrayOutputStream(4096);
        FileInputStream fileinputstream = new FileInputStream(file);
_L2:
        Object obj = fileinputstream;
        int i = fileinputstream.read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        obj = fileinputstream;
        bytearrayoutputstream.write(abyte0, 0, i);
        obj = fileinputstream;
        if (bytearrayoutputstream.size() <= 0xfa000) goto _L2; else goto _L1
_L1:
        obj = fileinputstream;
        Log.e("IoUtils", (new StringBuilder("File too large, maybe not a string. ")).append(file.getAbsolutePath()).toString());
        try
        {
            fileinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file) { }
        try
        {
            bytearrayoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return null;
        }
        return null;
        obj = fileinputstream;
        file = bytearrayoutputstream.toString(s);
        try
        {
            fileinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            bytearrayoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return file;
        }
        return file;
        s;
        file = null;
_L6:
        obj = file;
        s.printStackTrace();
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        try
        {
            bytearrayoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return null;
        }
        return null;
        file;
        obj = null;
_L4:
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        try
        {
            bytearrayoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        throw file;
        file;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        file = fileinputstream;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static String a(InputStream inputstream, String s)
    {
        ByteArrayOutputStream bytearrayoutputstream;
        if (inputstream == null)
        {
            return null;
        }
        bytearrayoutputstream = new ByteArrayOutputStream();
        byte abyte0[] = new byte[4096];
_L2:
        int i = inputstream.read(abyte0);
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        bytearrayoutputstream.write(abyte0, 0, i);
        if (bytearrayoutputstream.size() <= 0xfa000) goto _L2; else goto _L1
_L1:
        Log.e("IoUtils", "Data too large, maybe not a string. ");
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
        }
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
        s = new String(bytearrayoutputstream.toByteArray(), s);
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
        }
        try
        {
            bytearrayoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return s;
        }
        return s;
        s;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream) { }
        }
        try
        {
            bytearrayoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream) { }
        throw s;
    }

    public static String a(String s)
    {
        try
        {
            s = new URI(s);
            s = (new StringBuilder()).append(s.getScheme()).append("://").append(s.getHost()).append(s.getPath()).toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return "";
        }
        return s;
    }

    public static String a(String s, String as[], String as1[])
    {
        if (s == null)
        {
            return null;
        }
        s = new StringBuilder(s);
        if (as != null && as1 != null)
        {
            s.append("?");
            int i = 0;
            for (int j = Math.min(as.length, as1.length); i < j; i++)
            {
                if (i != 0)
                {
                    s.append("&");
                }
                s.append(as[i]);
                s.append("=");
                s.append(as1[i]);
            }

        }
        return s.toString();
    }

    private static String a(byte abyte0[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        int j = abyte0.length;
        for (int i = 0; i < j; i++)
        {
            String s = Integer.toHexString(abyte0[i] & 0xff);
            if (s.length() == 1)
            {
                stringbuilder.append('0');
            }
            stringbuilder.append(s);
        }

        return stringbuilder.toString();
    }

    public static void a(AssetManager assetmanager, File file, String s)
    {
        AssetManager assetmanager1;
        File file1;
        Object obj;
        assetmanager1 = null;
        obj = null;
        file1 = null;
        assetmanager = assetmanager.open(s);
        assetmanager1 = assetmanager;
        s = obj;
        file.createNewFile();
        assetmanager1 = assetmanager;
        s = obj;
        if (!file.isFile()) goto _L2; else goto _L1
_L1:
        assetmanager1 = assetmanager;
        s = obj;
        if (file.canWrite()) goto _L3; else goto _L2
_L2:
        assetmanager1 = assetmanager;
        s = obj;
        int i;
        try
        {
            throw new IOException();
        }
        // Misplaced declaration of an exception variable
        catch (File file) { }
        finally
        {
            assetmanager = assetmanager1;
        }
_L8:
        assetmanager1 = assetmanager;
        s = file1;
        file.printStackTrace();
        if (assetmanager != null)
        {
            try
            {
                assetmanager.close();
            }
            // Misplaced declaration of an exception variable
            catch (AssetManager assetmanager)
            {
                assetmanager.printStackTrace();
                return;
            }
        }
        if (file1 == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        file1.close();
        return;
_L3:
        assetmanager1 = assetmanager;
        s = obj;
        file = new FileOutputStream(file);
        s = new byte[2048];
_L4:
        i = assetmanager.read(s);
label0:
        {
            if (i == -1)
            {
                break label0;
            }
            try
            {
                file.write(s, 0, i);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                file1 = file;
                file = s;
                continue; /* Loop/switch isn't completed */
            }
            finally
            {
                s = file;
                file = exception;
            }
        }
          goto _L4
        if (assetmanager == null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        assetmanager.close();
        file.close();
        return;
        assetmanager;
        assetmanager.printStackTrace();
        return;
        file;
        assetmanager = null;
        s = assetmanager1;
_L6:
        if (assetmanager != null)
        {
            try
            {
                assetmanager.close();
            }
            // Misplaced declaration of an exception variable
            catch (AssetManager assetmanager)
            {
                assetmanager.printStackTrace();
                return;
            }
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        s.close();
        throw file;
        if (true) goto _L6; else goto _L5
_L5:
        file;
        assetmanager = null;
        if (true) goto _L8; else goto _L7
_L7:
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
    }

    public static void a(File file)
    {
        if (file == null)
        {
            return;
        }
        if (file.isDirectory())
        {
            File afile[] = file.listFiles();
            if (afile != null && afile.length > 0)
            {
                int j = afile.length;
                for (int i = 0; i < j; i++)
                {
                    a(afile[i]);
                }

            }
            file.delete();
            return;
        } else
        {
            file.delete();
            return;
        }
    }

    public static boolean a(String s, File file, String s1)
    {
        if (file != null && s != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        FileOutputStream fileoutputstream = new FileOutputStream(file);
        file = fileoutputstream;
        fileoutputstream.write(s.getBytes(s1));
        try
        {
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        return true;
        s1;
        s = null;
_L6:
        file = s;
        s1.printStackTrace();
        if (s == null) goto _L1; else goto _L3
_L3:
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return false;
        s;
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
        throw s;
        s;
        if (true) goto _L5; else goto _L4
_L4:
        s1;
        s = fileoutputstream;
          goto _L6
    }

    public static boolean a(String s, boolean flag)
    {
        if (s != null)
        {
            if ((s = new File(s)).exists() && flag == s.isDirectory())
            {
                return true;
            }
        }
        return false;
    }

    public static long b(File file)
    {
        if (!file.exists())
        {
            file.mkdirs();
        }
        if (!n.c())
        {
            break MISSING_BLOCK_LABEL_57;
        }
        Method method;
        long l;
        try
        {
            method = java/io/File.getMethod("getUsableSpace", new Class[0]);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            file.printStackTrace();
            return 0L;
        }
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        l = ((Long)method.invoke(file, null)).longValue();
        return l;
        int i;
        long l1;
        try
        {
            file = new StatFs(file.getPath());
            l1 = file.getBlockSize();
            i = file.getAvailableBlocks();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            file.printStackTrace();
            return 0L;
        }
        return (long)i * l1;
    }

    public static String b()
    {
        return (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/roidapp").toString();
    }

    public static String b(String s)
    {
        String s1 = s.replaceAll(":", "_").replaceAll("//", "_").replaceAll("/", "_").replaceAll("=", "_").replaceAll(",", "_").replaceAll("&", "_").replaceAll("\\?", "_");
        s = s1;
        if (s1.length() > 200)
        {
            s = s1.substring(s1.length() - 200);
        }
        return s;
    }

    public static String c()
    {
        return (new StringBuilder()).append(b()).append("/.cache").toString();
    }

    public static String c(String s)
    {
        Object obj1 = null;
        Object obj = obj1;
        if (s != null)
        {
            obj = obj1;
            if (s.length() != 0)
            {
                try
                {
                    obj = MessageDigest.getInstance("MD5");
                    ((MessageDigest) (obj)).update(s.getBytes());
                    obj = a(((MessageDigest) (obj)).digest()).substring(8, 24);
                }
                catch (NoSuchAlgorithmException nosuchalgorithmexception)
                {
                    nosuchalgorithmexception.printStackTrace();
                    return b(s);
                }
            }
        }
        return ((String) (obj));
    }

    public static String d()
    {
        return (new StringBuilder()).append(b()).append("/music/").toString();
    }

    public static String d(String s)
    {
        Object obj;
        try
        {
            obj = MessageDigest.getInstance("MD5");
            ((MessageDigest) (obj)).update(s.getBytes());
            obj = a(((MessageDigest) (obj)).digest());
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            return String.valueOf(s.hashCode());
        }
        return ((String) (obj));
    }

    private static boolean e()
    {
        if (!n.c())
        {
            break MISSING_BLOCK_LABEL_43;
        }
        Method method = android/os/Environment.getMethod("isExternalStorageRemovable", new Class[0]);
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        boolean flag = ((Boolean)method.invoke(null, null)).booleanValue();
        return flag;
        Exception exception;
        exception;
        exception.printStackTrace();
        return true;
    }
}
