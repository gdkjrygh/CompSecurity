// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Environment;
import android.util.Log;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

public class FileUtil
{

    public static final int MAX_FILE_SIZE_TO_GET_MD5 = 0xa00000;

    public FileUtil()
    {
    }

    private static long a(InputStream inputstream)
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

    private static String a()
    {
        if (Environment.getExternalStorageState().equals("mounted"))
        {
            return Environment.getExternalStorageDirectory().toString();
        } else
        {
            return null;
        }
    }

    public static void cleanDirectory(File file)
        throws IOException
    {
        if (!file.exists())
        {
            throw new IllegalArgumentException((new StringBuilder()).append(file).append(" does not exist").toString());
        }
        if (!file.isDirectory())
        {
            throw new IllegalArgumentException((new StringBuilder()).append(file).append(" is not a directory").toString());
        }
        File afile[] = file.listFiles();
        if (afile == null)
        {
            throw new IOException((new StringBuilder("Failed to list contents of ")).append(file).toString());
        }
        int j = afile.length;
        file = null;
        int i = 0;
        do
        {
            File file1;
            if (i >= j)
            {
                if (file != null)
                {
                    throw file;
                } else
                {
                    return;
                }
            }
            file1 = afile[i];
            try
            {
                forceDelete(file1);
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
            i++;
        } while (true);
    }

    public static boolean copyAssetToFile(Context context, String s, File file, boolean flag)
    {
        InputStream inputstream;
        Object obj;
        obj = null;
        inputstream = null;
        InputStream inputstream1 = context.getAssets().open(s);
        inputstream = inputstream1;
        try
        {
            file = new FileOutputStream(file);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
            s = inputstream;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            s = obj;
            continue; /* Loop/switch isn't completed */
        }
        copyStream(inputstream, file);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        setFileTimestamp(context, s, getAssetTimestamp(context, s));
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
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
        return true;
        context;
        context = null;
        s = inputstream;
_L4:
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
        return false;
        context;
        inputstream = null;
        s = obj;
_L2:
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        throw context;
        context;
        s = file;
        if (true) goto _L2; else goto _L1
_L1:
        break MISSING_BLOCK_LABEL_29;
        context;
        s = inputstream;
        context = file;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean copyFile(File file, File file1)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        flag = flag1;
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_60;
        }
        FileInputStream fileinputstream = new FileInputStream(file);
        file = fileinputstream;
        flag = copyToFile(fileinputstream, file1);
        Exception exception;
        flag1 = flag;
        flag = flag1;
        if (fileinputstream != null)
        {
            try
            {
                fileinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return flag1;
            }
            flag = flag1;
        }
        return flag;
        exception;
        file1 = null;
_L4:
        file = file1;
        exception.printStackTrace();
        flag = flag1;
        if (file1 != null)
        {
            try
            {
                file1.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return false;
            }
            return false;
        } else
        {
            break MISSING_BLOCK_LABEL_60;
        }
        file1;
        file = null;
_L2:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        throw file1;
        file1;
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        file1 = fileinputstream;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean copyFolder(String s, String s1)
    {
        File file1;
        String as[];
        String s2;
        FileInputStream fileinputstream;
        FileOutputStream fileoutputstream;
        byte abyte0[];
        int i;
        int j;
        int k;
        try
        {
            File file = new File(s1);
            if (!file.exists())
            {
                file.mkdirs();
            }
            as = (new File(s)).list();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        if (as == null) goto _L2; else goto _L1
_L1:
        j = as.length;
        i = 0;
          goto _L3
_L15:
        s2 = as[i];
        if (!s.endsWith(File.separator)) goto _L5; else goto _L4
_L4:
        file1 = new File((new StringBuilder(String.valueOf(s))).append(s2).toString());
_L11:
        if (!file1.isFile()) goto _L7; else goto _L6
_L6:
        fileinputstream = new FileInputStream(file1);
        fileoutputstream = new FileOutputStream((new StringBuilder(String.valueOf(s1))).append("/").append(file1.getName().toString()).toString());
        abyte0 = new byte[5120];
_L12:
        k = fileinputstream.read(abyte0);
        if (k != -1) goto _L9; else goto _L8
_L8:
        fileoutputstream.flush();
        fileoutputstream.close();
        fileinputstream.close();
_L7:
        if (file1.isDirectory())
        {
            copyFolder((new StringBuilder(String.valueOf(s))).append("/").append(s2).toString(), (new StringBuilder(String.valueOf(s1))).append("/").append(s2).toString());
        }
          goto _L10
_L5:
        file1 = new File((new StringBuilder(String.valueOf(s))).append(File.separator).append(s2).toString());
          goto _L11
_L9:
        fileoutputstream.write(abyte0, 0, k);
          goto _L12
_L3:
        if (i < j)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        return true;
_L10:
        i++;
        if (true) goto _L3; else goto _L13
_L13:
        if (true) goto _L15; else goto _L14
_L14:
    }

    public static void copyStream(InputStream inputstream, OutputStream outputstream)
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

    public static boolean copyToFile(InputStream inputstream, File file)
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

    public static long countDirSize(File file)
    {
        long l;
        long l1;
        l = 0L;
        l1 = l;
        if (file == null) goto _L2; else goto _L1
_L1:
        l1 = l;
        if (!file.isDirectory()) goto _L2; else goto _L3
_L3:
        file = file.listFiles();
        l1 = l;
        if (file == null) goto _L2; else goto _L4
_L4:
        int i;
        int j;
        j = file.length;
        i = 0;
_L8:
        if (i < j) goto _L6; else goto _L5
_L5:
        l1 = l;
_L2:
        return l1;
_L6:
        File file1 = file[i];
        long l2 = l;
        if (file1 != null)
        {
            if (file1.isDirectory())
            {
                l2 = l + countDirSize(file1);
            } else
            {
                l2 = l + file1.length();
            }
        }
        i++;
        l = l2;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static void deleteDir(String s)
    {
        File afile[];
label0:
        {
            s = new File(s);
            if (s.exists() && s.isDirectory())
            {
                afile = s.listFiles();
                if (afile != null)
                {
                    if (afile.length != 0)
                    {
                        break label0;
                    }
                    s.delete();
                }
            }
            return;
        }
        int j = afile.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                s.delete();
                return;
            }
            File file = afile[i];
            if (file != null)
            {
                if (file.isDirectory())
                {
                    deleteDir(file.getAbsolutePath());
                }
                file.delete();
            }
            i++;
        } while (true);
    }

    public static void deleteDirectory(File file)
        throws IOException
    {
        if (file.exists())
        {
            if (file.isDirectory())
            {
                cleanDirectory(file);
            }
            if (!file.delete())
            {
                throw new IOException((new StringBuilder("Unable to delete directory ")).append(file).append(".").toString());
            }
        }
    }

    public static void deleteFile(File file)
    {
        if (file == null || !file.exists()) goto _L2; else goto _L1
_L1:
        if (!file.isDirectory()) goto _L4; else goto _L3
_L3:
        File afile[] = file.listFiles();
        if (afile == null) goto _L4; else goto _L5
_L5:
        int i;
        int j;
        j = afile.length;
        i = 0;
_L8:
        if (i < j) goto _L6; else goto _L4
_L4:
        file.delete();
_L2:
        return;
_L6:
        deleteFile(afile[i]);
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static void deleteFile(String s)
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
            deleteFile(file.getAbsolutePath());
        }
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static void forceDelete(File file)
        throws IOException
    {
        if (file.isDirectory())
        {
            deleteDirectory(file);
        } else
        {
            boolean flag = file.exists();
            if (!file.delete())
            {
                if (!flag)
                {
                    throw new FileNotFoundException((new StringBuilder("File does not exist: ")).append(file).toString());
                } else
                {
                    throw new IOException((new StringBuilder("Unable to delete file: ")).append(file).toString());
                }
            }
        }
    }

    public static long getAssetTimestamp(Context context, String s)
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
            return a(context);
        } else
        {
            return 0L;
        }
    }

    public static File getExternalStorageFile(Context context, String s)
    {
        if (android.os.Build.VERSION.SDK_INT < 14) goto _L2; else goto _L1
_L1:
        int i;
        Method method;
        Object aobj[];
        Method method2;
        String s1;
        try
        {
            context = ((Context) (context.getApplicationContext().getSystemService("storage")));
            Method method1 = context.getClass().getMethod("getVolumeList", null);
            method = context.getClass().getMethod("getVolumeState", new Class[] {
                java/lang/String
            });
            aobj = (Object[])method1.invoke(context, null);
            method2 = aobj[0].getClass().getMethod("getPath", null);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
_L4:
        if (i >= aobj.length)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = (String)method2.invoke(aobj[i], null);
        if (!"mounted".equals(method.invoke(context, new Object[] {
    s1
})))
        {
            break MISSING_BLOCK_LABEL_142;
        }
        context = new File(s1, s);
        return context;
        i++;
        if (true) goto _L4; else goto _L3
_L2:
        if ("mounted".equals(Environment.getExternalStorageState()))
        {
            return new File(Environment.getExternalStorageDirectory(), s);
        }
_L3:
        return null;
    }

    public static long getFileTimestamp(Context context, String s)
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
            return a(context);
        } else
        {
            return 0L;
        }
    }

    public static ArrayList getInternalAndExternalStoragePath(Context context)
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        context = ((Context) (context.getSystemService("storage")));
        Object obj;
        String as[];
        int j;
        obj = Class.forName("android.os.storage.StorageManager");
        Method method = ((Class) (obj)).getMethod("getVolumePaths", new Class[0]);
        obj = ((Class) (obj)).getMethod("getVolumeState", new Class[] {
            java/lang/String
        });
        as = (String[])method.invoke(context, new Object[0]);
        j = as.length;
        int i = 0;
          goto _L1
_L10:
        String s1 = as[i];
        if ("mounted".equals((String)((Method) (obj)).invoke(context, new Object[] {
    s1
})))
        {
            arraylist.add(s1);
        }
        i++;
        continue; /* Loop/switch isn't completed */
        context;
        obj = new BufferedReader(new InputStreamReader(new FileInputStream(new File("/proc/mounts"))));
_L3:
        context = ((Context) (obj));
        String s = ((BufferedReader) (obj)).readLine();
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        context = ((Context) (obj));
        boolean flag;
        flag = arraylist.isEmpty();
        break MISSING_BLOCK_LABEL_173;
        context = ((Context) (obj));
        if (!s.contains("uid=1000")) goto _L3; else goto _L2
_L2:
        context = ((Context) (obj));
        if (!s.contains("gid=1015")) goto _L3; else goto _L4
_L4:
        context = ((Context) (obj));
        as1 = s.split(" ");
        context = ((Context) (obj));
        if (as1.length < 4) goto _L3; else goto _L5
_L5:
        context = ((Context) (obj));
        arraylist.add(as1[1]);
          goto _L3
        Exception exception;
        exception;
_L8:
        context = ((Context) (obj));
        Log.e("FileUtil", "", exception);
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        context = a();
        if (context != null)
        {
            arraylist.add(context);
        }
        return arraylist;
        obj;
        context = null;
_L7:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        throw obj;
        if (!flag)
        {
            String as1[];
            if (obj != null)
            {
                try
                {
                    ((BufferedReader) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Context context) { }
            }
            return arraylist;
        }
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
        }
        break MISSING_BLOCK_LABEL_265;
        obj;
        if (true) goto _L7; else goto _L6
_L6:
        exception;
        obj = null;
        if (true) goto _L8; else goto _L1
_L1:
        if (i < j) goto _L10; else goto _L9
_L9:
        return arraylist;
    }

    public static byte[] readFileByte(File file)
    {
        Object obj = new FileInputStream(file);
        Object obj4;
        Object obj1;
        Object obj2;
        Object obj3;
        try
        {
            obj1 = ((FileInputStream) (obj)).getChannel();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj4)
        {
            obj1 = null;
            file = null;
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj4)
        {
            obj1 = null;
            file = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj3 = null;
            continue;
        }
        obj3 = obj1;
        obj2 = obj;
        try
        {
            file = new byte[(int)((FileChannel) (obj1)).size()];
        }
        // Misplaced declaration of an exception variable
        catch (Object obj4)
        {
            file = null;
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj4)
        {
            file = null;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj = obj2;
        }
        obj3 = obj1;
        obj2 = obj;
        ((FileChannel) (obj1)).read(ByteBuffer.wrap(file));
        if (obj1 != null)
        {
            try
            {
                ((FileChannel) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        obj1 = file;
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return file;
            }
            obj1 = file;
        }
        return ((byte []) (obj1));
        obj4;
        obj1 = null;
        obj = null;
        file = null;
_L4:
        obj3 = obj1;
        obj2 = obj;
        ((FileNotFoundException) (obj4)).printStackTrace();
        if (obj1 != null)
        {
            try
            {
                ((FileChannel) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        obj1 = file;
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return file;
            }
            return file;
        } else
        {
            break MISSING_BLOCK_LABEL_61;
        }
        obj4;
        obj1 = null;
        obj = null;
        file = null;
_L2:
        obj3 = obj1;
        obj2 = obj;
        ((Exception) (obj4)).printStackTrace();
        if (obj1 != null)
        {
            try
            {
                ((FileChannel) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
        }
        obj1 = file;
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return file;
            }
            return file;
        } else
        {
            break MISSING_BLOCK_LABEL_61;
        }
        file;
        obj3 = null;
        obj = null;
        do
        {
            if (obj3 != null)
            {
                try
                {
                    ((FileChannel) (obj3)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1) { }
            }
            if (obj != null)
            {
                try
                {
                    ((FileInputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj) { }
            }
            throw file;
        } while (true);
        obj4;
        if (true) goto _L2; else goto _L1
        obj4;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean safeRenameTo(File file, File file1)
    {
label0:
        {
            if (!file1.getParentFile().exists())
            {
                file1.getParentFile().mkdirs();
            }
            boolean flag1 = file.renameTo(file1);
            boolean flag = flag1;
            if (!flag1)
            {
                boolean flag2 = copyFile(file, file1);
                flag = flag2;
                if (flag2)
                {
                    if (!file.isDirectory())
                    {
                        break label0;
                    }
                    try
                    {
                        deleteDir(file.getAbsolutePath());
                    }
                    // Misplaced declaration of an exception variable
                    catch (File file)
                    {
                        return flag2;
                    }
                    flag = flag2;
                }
            }
            return flag;
        }
        file.delete();
        return flag2;
    }

    public static void setFileTimestamp(Context context, String s, long l)
    {
        String s1;
        Object obj1;
        s1 = null;
        obj1 = null;
        context = context.openFileOutput((new StringBuilder(String.valueOf(s))).append(".timestamp").toString(), 0);
        s = new DataOutputStream(context);
        s.writeBytes(String.valueOf(l));
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        context.close();
_L2:
        return;
        context;
        context = null;
        s = obj1;
_L5:
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return;
            }
        }
        if (s == null) goto _L2; else goto _L1
_L1:
        s.close();
        return;
        s;
        context = null;
_L4:
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        s1.close();
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

    public static boolean writeByteFile(byte abyte0[], File file)
    {
        boolean flag = false;
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        return flag;
_L2:
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        file = new FileOutputStream(file);
        obj = file;
        file.write(abyte0);
        flag = true;
        if (file != null)
        {
            try
            {
                file.flush();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[]) { }
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                return true;
            }
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        abyte0;
        file = null;
_L9:
        obj = file;
        abyte0.printStackTrace();
        if (file != null)
        {
            try
            {
                file.flush();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[]) { }
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                return false;
            }
            return false;
        }
        continue; /* Loop/switch isn't completed */
        file;
        abyte0 = obj1;
_L7:
        obj = abyte0;
        file.printStackTrace();
        if (abyte0 != null)
        {
            try
            {
                abyte0.flush();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
            try
            {
                abyte0.close();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                return false;
            }
            return false;
        }
        continue; /* Loop/switch isn't completed */
        abyte0;
_L5:
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).flush();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        throw abyte0;
        abyte0;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        abyte0 = file;
        file = exception;
        if (true) goto _L7; else goto _L6
_L6:
        abyte0;
        if (true) goto _L9; else goto _L8
_L8:
    }
}
