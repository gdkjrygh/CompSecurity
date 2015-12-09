// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
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

// Referenced classes of package android.support.multidex:
//            c

final class b
{

    private static Method a;

    b()
    {
    }

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
        throws IOException
    {
        File file1;
        long l;
        Log.i("MultiDex", (new StringBuilder()).append("MultiDexExtractor.load(").append(applicationinfo.sourceDir).append(", ").append(flag).append(")").toString());
        file1 = new File(applicationinfo.sourceDir);
        l = c(file1);
        if (flag || a(context, file1, l)) goto _L2; else goto _L1
_L1:
        try
        {
            applicationinfo = a(context, file1, file);
        }
        // Misplaced declaration of an exception variable
        catch (ApplicationInfo applicationinfo)
        {
            Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", applicationinfo);
            applicationinfo = a(file1, file);
            a(context, b(file1), l, applicationinfo.size() + 1);
            context = applicationinfo;
            continue; /* Loop/switch isn't completed */
        }
        context = applicationinfo;
_L4:
        Log.i("MultiDex", (new StringBuilder()).append("load found ").append(context.size()).append(" secondary dex files").toString());
        return context;
_L2:
        Log.i("MultiDex", "Detected that extraction must be performed.");
        applicationinfo = a(file1, file);
        a(context, b(file1), l, applicationinfo.size() + 1);
        context = applicationinfo;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static List a(Context context, File file, File file1)
        throws IOException
    {
        Log.i("MultiDex", "loading existing secondary dex files");
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
                    Log.i("MultiDex", (new StringBuilder()).append("Invalid zip file: ").append(file2).toString());
                    throw new IOException("Invalid ZIP file.");
                }
            } else
            {
                throw new IOException((new StringBuilder()).append("Missing extracted secondary dex file '").append(file2.getPath()).append("'").toString());
            }
        }

        return context;
    }

    private static List a(File file, File file1)
        throws IOException
    {
        ArrayList arraylist;
        String s1;
        ZipFile zipfile;
        s1 = (new StringBuilder()).append(file.getName()).append(".classes").toString();
        a(file1, s1);
        arraylist = new ArrayList();
        zipfile = new ZipFile(file);
        file = zipfile.getEntry((new StringBuilder()).append("classes").append(2).append(".dex").toString());
        int j = 2;
_L4:
        if (file == null)
        {
            break; /* Loop/switch isn't completed */
        }
        File file2;
        file2 = new File(file1, (new StringBuilder()).append(s1).append(j).append(".zip").toString());
        arraylist.add(file2);
        Log.i("MultiDex", (new StringBuilder()).append("Extraction is needed for file ").append(file2).toString());
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
        stringbuilder = (new StringBuilder()).append("Extraction ");
        String s;
        if (flag)
        {
            s = "success";
        } else
        {
            s = "failed";
        }
        Log.i("MultiDex", stringbuilder.append(s).append(" - length ").append(file2.getAbsolutePath()).append(": ").append(file2.length()).toString());
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        file2.delete();
        if (file2.exists())
        {
            Log.w("MultiDex", (new StringBuilder()).append("Failed to delete corrupted secondary dex '").append(file2.getPath()).append("'").toString());
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_373;
        }
        throw new IOException((new StringBuilder()).append("Could not create zip file ").append(file2.getAbsolutePath()).append(" for secondary dex (").append(j).append(")").toString());
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
        file = zipfile.getEntry((new StringBuilder()).append("classes").append(j).append(".dex").toString());
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
        a(((android.content.SharedPreferences.Editor) (context)));
    }

    private static void a(android.content.SharedPreferences.Editor editor)
    {
        if (a != null)
        {
            try
            {
                a.invoke(editor, new Object[0]);
                return;
            }
            catch (InvocationTargetException invocationtargetexception) { }
            catch (IllegalAccessException illegalaccessexception) { }
        }
        editor.commit();
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
        throws IOException
    {
        d(file.getParentFile());
        d(file);
        s = file.listFiles(new FileFilter(s) {

            final String a;

            public boolean accept(File file1)
            {
                return !file1.getName().startsWith(a);
            }

            
            {
                a = s;
                super();
            }
        });
        if (s == null)
        {
            Log.w("MultiDex", (new StringBuilder()).append("Failed to list secondary dex dir content (").append(file.getPath()).append(").").toString());
        } else
        {
            int j = s.length;
            int i = 0;
            while (i < j) 
            {
                file = s[i];
                Log.i("MultiDex", (new StringBuilder()).append("Trying to delete old file ").append(file.getPath()).append(" of size ").append(file.length()).toString());
                if (!file.delete())
                {
                    Log.w("MultiDex", (new StringBuilder()).append("Failed to delete old file ").append(file.getPath()).toString());
                } else
                {
                    Log.i("MultiDex", (new StringBuilder()).append("Deleted old file ").append(file.getPath()).toString());
                }
                i++;
            }
        }
    }

    private static void a(ZipFile zipfile, ZipEntry zipentry, File file, String s)
        throws IOException, FileNotFoundException
    {
        zipfile = zipfile.getInputStream(zipentry);
        s = File.createTempFile(s, ".zip", file.getParentFile());
        Log.i("MultiDex", (new StringBuilder()).append("Extracting ").append(s.getPath()).toString());
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
            break MISSING_BLOCK_LABEL_136;
        }
        zipoutputstream.write(zipentry, 0, i);
        i = zipfile.read(zipentry);
          goto _L1
        zipoutputstream.closeEntry();
        zipoutputstream.close();
        Log.i("MultiDex", (new StringBuilder()).append("Renaming to ").append(file.getPath()).toString());
        if (!s.renameTo(file))
        {
            throw new IOException((new StringBuilder()).append("Failed to rename \"").append(s.getAbsolutePath()).append("\" to \"").append(file.getAbsolutePath()).append("\"").toString());
        }
        break MISSING_BLOCK_LABEL_253;
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

    private static boolean a(Context context, File file, long l)
    {
        context = a(context);
        return context.getLong("timestamp", -1L) != b(file) || context.getLong("crc", -1L) != l;
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
                Log.w("MultiDex", (new StringBuilder()).append("Failed to close zip file: ").append(file.getAbsolutePath()).toString());
            }
            catch (ZipException zipexception)
            {
                Log.w("MultiDex", (new StringBuilder()).append("File ").append(file.getAbsolutePath()).append(" is not a valid zip file.").toString(), zipexception);
            }
            catch (IOException ioexception1)
            {
                Log.w("MultiDex", (new StringBuilder()).append("Got an IOException trying to open zip file: ").append(file.getAbsolutePath()).toString(), ioexception1);
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

    private static long c(File file)
        throws IOException
    {
        long l1 = android.support.multidex.c.a(file);
        long l = l1;
        if (l1 == -1L)
        {
            l = l1 - 1L;
        }
        return l;
    }

    private static void d(File file)
        throws IOException
    {
        file.mkdir();
        if (!file.isDirectory())
        {
            File file1 = file.getParentFile();
            if (file1 == null)
            {
                Log.e("MultiDex", (new StringBuilder()).append("Failed to create dir ").append(file.getPath()).append(". Parent file is null.").toString());
            } else
            {
                Log.e("MultiDex", (new StringBuilder()).append("Failed to create dir ").append(file.getPath()).append(". parent file is a dir ").append(file1.isDirectory()).append(", a file ").append(file1.isFile()).append(", exists ").append(file1.exists()).append(", readable ").append(file1.canRead()).append(", writable ").append(file1.canWrite()).toString());
            }
            throw new IOException((new StringBuilder()).append("Failed to create cache directory ").append(file.getPath()).toString());
        } else
        {
            return;
        }
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
