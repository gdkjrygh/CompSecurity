// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.aviary.android.feather.common.a.a;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.OkUrlFactory;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.utils.URLEncodedUtils;

public class d
{

    static final OkUrlFactory a = new OkUrlFactory(new OkHttpClient());

    public d()
    {
    }

    public static int a(String s)
        throws Exception
    {
        int i;
        try
        {
            i = Integer.parseInt(a((new ProcessBuilder(new String[] {
                "/system/bin/cat", s
            })).start().getInputStream()));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new Exception(s);
        }
        return i;
    }

    public static ByteArrayInputStream a(String s, List list)
        throws IOException
    {
        String s1 = s;
        if (list != null)
        {
            s1 = (new StringBuilder()).append(s).append(URLEncodedUtils.format(list, "utf-8")).toString();
        }
        if (a.a)
        {
            Log.i("io-utils", (new StringBuilder()).append("download: ").append(s1).toString());
        }
        s = a.open(new URL(s1));
        int i = s.getResponseCode();
        if (i >= 300)
        {
            s = s.getResponseMessage();
            throw new IOException((new StringBuilder()).append(i).append(": ").append(s).toString());
        } else
        {
            s = s.getInputStream();
            list = IOUtils.toByteArray(s);
            a(((Closeable) (s)));
            return new ByteArrayInputStream(list);
        }
    }

    public static File a(File file, String s)
    {
        if (file.exists() && file.isDirectory())
        {
            File file1 = file.getAbsoluteFile();
            String as[] = s.split(File.separator);
            if (as.length > 1)
            {
                int i = 0;
                s = file1;
                do
                {
                    file = s;
                    if (i >= as.length)
                    {
                        break;
                    }
                    s = new File(s, as[i]);
                    Log.d("io-utils", (new StringBuilder()).append("file: ").append(s.getAbsolutePath()).toString());
                    i++;
                } while (true);
            } else
            {
                file = file1;
                if (as.length == 1)
                {
                    file = new File(file1, s);
                }
            }
            if (!file.exists())
            {
                break MISSING_BLOCK_LABEL_122;
            }
            while (file.isDirectory()) 
            {
                do
                {
                    return file;
                } while (file.mkdirs() || file.isDirectory());
                return null;
            }
        }
        return null;
    }

    public static String a(Context context, Uri uri)
    {
        if (uri != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        String s;
        s = uri.getScheme();
        if (s == null)
        {
            return uri.getPath();
        }
        if ("file".equals(s))
        {
            return uri.getPath();
        }
        if (!"content".equals(s)) goto _L1; else goto _L3
_L3:
        int i;
        try
        {
            uri = context.getContentResolver().query(uri, new String[] {
                "_data"
            }, null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        if (uri == null) goto _L1; else goto _L4
_L4:
        if (!uri.moveToFirst()) goto _L6; else goto _L5
_L5:
        i = uri.getColumnIndex("_data");
        if (i <= -1) goto _L6; else goto _L7
_L7:
        context = uri.getString(i);
_L9:
        uri.close();
        return context;
_L6:
        context = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static final String a(InputStream inputstream)
        throws IOException
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (inputstream = new Scanner(inputstream); inputstream.hasNextLine(); stringbuilder.append(inputstream.nextLine())) { }
        return stringbuilder.toString();
    }

    public static void a(Cursor cursor)
    {
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        cursor.close();
        return;
        cursor;
    }

    public static void a(ParcelFileDescriptor parcelfiledescriptor)
    {
        if (parcelfiledescriptor == null)
        {
            return;
        }
        try
        {
            parcelfiledescriptor.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ParcelFileDescriptor parcelfiledescriptor)
        {
            return;
        }
    }

    public static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            return;
        }
        try
        {
            closeable.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Closeable closeable)
        {
            return;
        }
    }

    public static void a(File file)
        throws IOException
    {
        if (a.a)
        {
            Log.i("io-utils", (new StringBuilder()).append("deleteDirectory: ").append(file.getAbsolutePath()).toString());
        }
        if (file.exists())
        {
            if (!b(file))
            {
                c(file);
            }
            if (!file.delete())
            {
                throw new IOException((new StringBuilder()).append("Unable to delete directory ").append(file).append(".").toString());
            }
        }
    }

    public static void a(InputStream inputstream, File file)
        throws IOException
    {
        if (file == null)
        {
            throw new IOException("destination folder is null");
        }
        if (inputstream == null)
        {
            throw new IOException("Input is null");
        }
        if (a.a)
        {
            Log.i("io-utils", (new StringBuilder()).append("unzip to ").append(file.getAbsolutePath()).toString());
        }
        boolean flag = false;
        inputstream = new ZipInputStream(inputstream);
        do
        {
            ZipEntry zipentry = inputstream.getNextEntry();
            if (zipentry == null)
            {
                break;
            }
            a(zipentry, ((ZipInputStream) (inputstream)), file);
            flag = true;
            inputstream.closeEntry();
        } while (true);
        a(((Closeable) (inputstream)));
        if (!flag)
        {
            throw new IOException("invalid zip file");
        } else
        {
            return;
        }
    }

    public static void a(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        byte abyte0[] = new byte[4096];
        do
        {
            int i = inputstream.read(abyte0);
            if (i != -1)
            {
                outputstream.write(abyte0, 0, i);
            } else
            {
                return;
            }
        } while (true);
    }

    private static void a(ZipEntry zipentry, ZipInputStream zipinputstream, File file)
        throws IOException
    {
        if (a.a)
        {
            Log.i("io-utils", (new StringBuilder()).append("unzipEntry: ").append(zipentry.getName()).toString());
        }
        if (zipentry.isDirectory())
        {
            a(file, zipentry.getName());
            return;
        }
        zipentry = new File(file, zipentry.getName());
        if (!zipentry.getParentFile().exists())
        {
            f(zipentry.getParentFile());
        }
        zipentry = new BufferedOutputStream(new FileOutputStream(zipentry));
        a(((InputStream) (zipinputstream)), ((OutputStream) (zipentry)));
        zipentry.flush();
        a(((Closeable) (zipentry)));
    }

    public static void a(ZipFile zipfile)
    {
        if (zipfile == null)
        {
            return;
        }
        try
        {
            zipfile.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ZipFile zipfile)
        {
            return;
        }
    }

    public static boolean b(File file)
        throws IOException
    {
        if (file == null)
        {
            throw new NullPointerException("File must not be null");
        }
        if (file.getParent() != null)
        {
            file = new File(file.getParentFile().getCanonicalFile(), file.getName());
        }
        return !file.getCanonicalFile().equals(file.getAbsoluteFile());
    }

    public static void c(File file)
        throws IOException
    {
        if (a.a)
        {
            Log.i("io-utils", (new StringBuilder()).append("cleanDirectory: ").append(file.getAbsolutePath()).toString());
        }
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
            throw new IOException((new StringBuilder()).append("Failed to list contents of ").append(file).toString());
        }
        int j = afile.length;
        file = null;
        int i = 0;
        while (i < j) 
        {
            File file1 = afile[i];
            try
            {
                d(file1);
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
            i++;
        }
        if (file != null)
        {
            throw file;
        } else
        {
            return;
        }
    }

    public static void d(File file)
        throws IOException
    {
        if (a.a)
        {
            Log.i("io-utils", (new StringBuilder()).append("forceDelete: ").append(file.getAbsolutePath()).toString());
        }
        if (file.isDirectory())
        {
            a(file);
        } else
        {
            boolean flag = file.exists();
            if (!file.delete())
            {
                if (!flag)
                {
                    throw new FileNotFoundException((new StringBuilder()).append("File does not exist: ").append(file).toString());
                } else
                {
                    throw new IOException((new StringBuilder()).append("Unable to delete file: ").append(file).toString());
                }
            }
        }
    }

    public static boolean e(File file)
    {
        if (file == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            if (file.isDirectory())
            {
                c(file);
            }
        }
        catch (Exception exception) { }
        try
        {
            flag = file.delete();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return false;
        }
        return flag;
    }

    private static boolean f(File file)
    {
        if (file.exists())
        {
            return true;
        } else
        {
            return file.mkdirs();
        }
    }

}
