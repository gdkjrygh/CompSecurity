// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

final class e
{

    private static Method a;

    private static SharedPreferences a(Context context)
    {
        int i;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        return context.getSharedPreferences("multidex.version", i);
    }

    static List a(Context context, ApplicationInfo applicationinfo, File file, boolean flag)
    {
        File file1;
        long l;
        (new StringBuilder("MultiDexExtractor.load(")).append(applicationinfo.sourceDir).append(", ").append(flag).append(")");
        file1 = new File(applicationinfo.sourceDir);
        applicationinfo = new File(applicationinfo.sourceDir);
        long l1 = b.a(applicationinfo);
        l = l1;
        if (l1 == -1L)
        {
            l = l1 - 1L;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        SharedPreferences sharedpreferences = a(context);
        boolean flag1;
        if (sharedpreferences.getLong("timestamp", -1L) != b(applicationinfo) || sharedpreferences.getLong("crc", -1L) != l)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1) goto _L2; else goto _L3
_L3:
        applicationinfo = a(context, file1, file);
        context = applicationinfo;
_L5:
        (new StringBuilder("load found ")).append(context.size()).append(" secondary dex files");
        return context;
        applicationinfo;
        Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", applicationinfo);
_L2:
        applicationinfo = a(file1, file);
        a(context, b(file1), l, applicationinfo.size() + 1);
        context = applicationinfo;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static List a(Context context, File file, File file1)
    {
        file = (new StringBuilder()).append(file.getName()).append(".classes").toString();
        int j = a(context).getInt("dex.number", 1);
        context = new ArrayList(j);
        for (int i = 2; i <= j; i++)
        {
            File file2 = new File(file1, (new StringBuilder()).append(file).append(i).append(".zip").toString());
            if (file2.isFile())
            {
                context.add(file2);
                if (!a(file2))
                {
                    (new StringBuilder("Invalid zip file: ")).append(file2);
                    throw new IOException("Invalid ZIP file.");
                }
            } else
            {
                throw new IOException((new StringBuilder("Missing extracted secondary dex file '")).append(file2.getPath()).append("'").toString());
            }
        }

        return context;
    }

    private static List a(File file, File file1)
    {
        ArrayList arraylist;
        String s1;
        ZipFile zipfile;
        s1 = (new StringBuilder()).append(file.getName()).append(".classes").toString();
        a(file1, s1);
        arraylist = new ArrayList();
        zipfile = new ZipFile(file);
        file = zipfile.getEntry((new StringBuilder("classes")).append(2).append(".dex").toString());
        int j = 2;
_L4:
        if (file == null)
        {
            break; /* Loop/switch isn't completed */
        }
        File file2;
        file2 = new File(file1, (new StringBuilder()).append(s1).append(j).append(".zip").toString());
        arraylist.add(file2);
        (new StringBuilder("Extraction is needed for file ")).append(file2);
        int i;
        boolean flag;
        flag = false;
        i = 0;
_L2:
        if (i >= 3 || flag)
        {
            break; /* Loop/switch isn't completed */
        }
        i++;
        StringBuilder stringbuilder;
        a(zipfile, ((ZipEntry) (file)), file2, s1);
        flag = a(file2);
        stringbuilder = new StringBuilder("Extraction ");
        String s;
        if (flag)
        {
            s = "success";
        } else
        {
            s = "failed";
        }
        stringbuilder.append(s).append(" - length ").append(file2.getAbsolutePath()).append(": ").append(file2.length());
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        file2.delete();
        if (file2.exists())
        {
            Log.w("MultiDex", (new StringBuilder("Failed to delete corrupted secondary dex '")).append(file2.getPath()).append("'").toString());
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        throw new IOException((new StringBuilder("Could not create zip file ")).append(file2.getAbsolutePath()).append(" for secondary dex (").append(j).append(")").toString());
        file;
        try
        {
            zipfile.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file1)
        {
            Log.w("MultiDex", "Failed to close resource", file1);
        }
        throw file;
        j++;
        file = zipfile.getEntry((new StringBuilder("classes")).append(j).append(".dex").toString());
        if (true) goto _L4; else goto _L3
_L3:
        try
        {
            zipfile.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            Log.w("MultiDex", "Failed to close resource", file);
            return arraylist;
        }
        return arraylist;
    }

    private static void a(Context context, long l, long l1, int i)
    {
        context = a(context).edit();
        context.putLong("timestamp", l);
        context.putLong("crc", l1);
        context.putInt("dex.number", i);
        if (a != null)
        {
            try
            {
                a.invoke(context, new Object[0]);
                return;
            }
            catch (InvocationTargetException invocationtargetexception) { }
            catch (IllegalAccessException illegalaccessexception) { }
        }
        context.commit();
    }

    private static void a(Closeable closeable)
    {
        try
        {
            closeable.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Closeable closeable)
        {
            Log.w("MultiDex", "Failed to close resource", closeable);
        }
    }

    private static void a(File file, String s)
    {
        file.mkdir();
        if (!file.isDirectory())
        {
            throw new IOException((new StringBuilder("Failed to create dex directory ")).append(file.getPath()).toString());
        }
        s = file.listFiles(new f(s));
        if (s == null)
        {
            Log.w("MultiDex", (new StringBuilder("Failed to list secondary dex dir content (")).append(file.getPath()).append(").").toString());
        } else
        {
            int j = s.length;
            int i = 0;
            while (i < j) 
            {
                file = s[i];
                Log.w("MultiDex", (new StringBuilder("Trying to delete old file ")).append(file.getPath()).append(" of size ").append(file.length()).toString());
                if (!file.delete())
                {
                    Log.w("MultiDex", (new StringBuilder("Failed to delete old file ")).append(file.getPath()).toString());
                } else
                {
                    Log.w("MultiDex", (new StringBuilder("Deleted old file ")).append(file.getPath()).toString());
                }
                i++;
            }
        }
    }

    private static void a(ZipFile zipfile, ZipEntry zipentry, File file, String s)
    {
        zipfile = zipfile.getInputStream(zipentry);
        s = File.createTempFile(s, ".zip", file.getParentFile());
        (new StringBuilder("Extracting ")).append(s.getPath());
        ZipOutputStream zipoutputstream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(s)));
        int i;
        ZipEntry zipentry1 = new ZipEntry("classes.dex");
        zipentry1.setTime(zipentry.getTime());
        zipoutputstream.putNextEntry(zipentry1);
        zipentry = new byte[16384];
        i = zipfile.read(zipentry);
_L1:
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        zipoutputstream.write(zipentry, 0, i);
        i = zipfile.read(zipentry);
          goto _L1
        zipoutputstream.closeEntry();
        zipoutputstream.close();
        (new StringBuilder("Renaming to ")).append(file.getPath());
        if (!s.renameTo(file))
        {
            throw new IOException((new StringBuilder("Failed to rename \"")).append(s.getAbsolutePath()).append("\" to \"").append(file.getAbsolutePath()).append("\"").toString());
        }
        break MISSING_BLOCK_LABEL_228;
        zipentry;
        a(((Closeable) (zipfile)));
        s.delete();
        throw zipentry;
        zipentry;
        zipoutputstream.close();
        throw zipentry;
        a(((Closeable) (zipfile)));
        s.delete();
        return;
    }

    static boolean a(File file)
    {
        ZipFile zipfile = new ZipFile(file);
        try
        {
            zipfile.close();
        }
        catch (IOException ioexception)
        {
            try
            {
                Log.w("MultiDex", (new StringBuilder("Failed to close zip file: ")).append(file.getAbsolutePath()).toString());
            }
            catch (ZipException zipexception)
            {
                Log.w("MultiDex", (new StringBuilder("File ")).append(file.getAbsolutePath()).append(" is not a valid zip file.").toString(), zipexception);
            }
            catch (IOException ioexception1)
            {
                Log.w("MultiDex", (new StringBuilder("Got an IOException trying to open zip file: ")).append(file.getAbsolutePath()).toString(), ioexception1);
            }
            return false;
        }
        return true;
    }

    private static long b(File file)
    {
        long l1 = file.lastModified();
        long l = l1;
        if (l1 == -1L)
        {
            l = l1 - 1L;
        }
        return l;
    }

    static 
    {
        try
        {
            a = android/content/SharedPreferences$Editor.getMethod("apply", new Class[0]);
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            a = null;
        }
    }
}
