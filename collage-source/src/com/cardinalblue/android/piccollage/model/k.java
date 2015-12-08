// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaScannerConnection;
import android.os.Environment;
import android.text.TextUtils;
import com.cardinalblue.android.b.g;
import com.cardinalblue.android.piccollage.controller.f;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

public final class k
{
    public static class a extends Exception
    {

        public Throwable a;

        public a(String s)
        {
            this(new Throwable(s));
        }

        public a(Throwable throwable)
        {
            super(throwable.getMessage());
            a = throwable;
        }
    }


    public static File a;
    private static String b;
    private static File c;
    private static File d;

    public k()
    {
    }

    public static Bitmap a(Context context, InputStream inputstream, String s)
        throws a
    {
        Object obj;
        Exception exception;
        obj = null;
        exception = null;
        if (!s.equals("image/png")) goto _L2; else goto _L1
_L1:
        context = a(context, "png");
_L6:
        byte abyte0[];
        abyte0 = new byte[0x10000];
        s = new FileOutputStream(context);
_L5:
        int i = inputstream.read(abyte0);
        if (i == -1) goto _L4; else goto _L3
_L3:
        s.write(abyte0, 0, i);
          goto _L5
        obj;
_L8:
        throw new a(((Throwable) (obj)));
        exception;
        obj = s;
        s = exception;
_L7:
        com.cardinalblue.android.b.k.a(inputstream);
        com.cardinalblue.android.b.k.a(((java.io.Closeable) (obj)));
        if (context != null)
        {
            context.delete();
        }
        throw s;
_L2:
label0:
        {
            if (!s.equals("image/gif"))
            {
                break label0;
            }
            context = a(context, "gif");
        }
          goto _L6
        context = a(context, "jpg");
          goto _L6
_L4:
        obj = d(context);
        com.cardinalblue.android.b.k.a(inputstream);
        com.cardinalblue.android.b.k.a(s);
        if (context != null)
        {
            context.delete();
        }
        return ((Bitmap) (obj));
        s;
        context = null;
          goto _L7
        s;
          goto _L7
        exception;
        obj = s;
        s = exception;
          goto _L7
        obj;
        context = null;
        s = exception;
          goto _L8
        obj;
        s = exception;
          goto _L8
    }

    public static Bitmap a(File file)
        throws a
    {
        return a(file, f.e);
    }

    public static Bitmap a(File file, android.graphics.Bitmap.Config config)
        throws a
    {
        if (file.getParentFile() == null)
        {
            throw new a("null parentFile");
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inPreferredConfig = config;
        options.inDither = true;
        try
        {
            config = BitmapFactory.decodeFile(file.toString(), options);
        }
        // Misplaced declaration of an exception variable
        catch (android.graphics.Bitmap.Config config)
        {
            System.gc();
            try
            {
                file = BitmapFactory.decodeFile(file.toString(), options);
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                throw new a(file);
            }
            return file;
        }
        return config;
    }

    private static android.graphics.BitmapFactory.Options a(int i)
    {
        boolean flag = true;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inPreferredConfig = f.e;
        options.inSampleSize = i;
        if (i <= 1)
        {
            flag = false;
        }
        options.inDither = flag;
        return options;
    }

    public static File a(long l, String s)
    {
        return new File(d, (new StringBuilder()).append(e(String.valueOf(l))).append(".").append(s).toString());
    }

    public static File a(Context context, String s)
    {
        context = context.getExternalCacheDir();
        if (context == null)
        {
            com.cardinalblue.android.piccollage.a.f.a(new IOException("can't found the external cache dir"));
        }
        return new File(context, (new StringBuilder()).append(UUID.randomUUID().toString()).append(".").append(s).toString());
    }

    public static File a(Bitmap bitmap)
        throws IOException, a
    {
        return a(a(com.cardinalblue.android.b.k.a(), "jpg"), bitmap);
    }

    public static File a(Bitmap bitmap, String s)
        throws a
    {
        return a(a(s), bitmap);
    }

    public static File a(File file, Context context)
    {
        if (file == null)
        {
            return null;
        }
        File file1 = g.a(file);
        try
        {
            com.cardinalblue.android.b.k.a(file, file1);
            MediaScannerConnection.scanFile(context, new String[] {
                file1.toString()
            }, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            file1.delete();
            return null;
        }
        return file1;
    }

    private static File a(File file, Bitmap bitmap)
        throws a
    {
        com/cardinalblue/android/piccollage/model/k;
        JVM INSTR monitorenter ;
        if (bitmap != null)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        file.delete();
        throw new a("bitmap should not be null");
        file;
        com/cardinalblue/android/piccollage/model/k;
        JVM INSTR monitorexit ;
        throw file;
        if (!file.toString().toLowerCase(Locale.getDefault()).endsWith("png")) goto _L2; else goto _L1
_L1:
        android.graphics.Bitmap.CompressFormat compressformat = android.graphics.Bitmap.CompressFormat.PNG;
_L4:
        FileOutputStream fileoutputstream = new FileOutputStream(file);
        Object obj = fileoutputstream;
        bitmap.compress(compressformat, 90, fileoutputstream);
        com.cardinalblue.android.b.k.a(fileoutputstream);
        com/cardinalblue/android/piccollage/model/k;
        JVM INSTR monitorexit ;
        return file;
_L2:
        compressformat = android.graphics.Bitmap.CompressFormat.JPEG;
        if (true) goto _L4; else goto _L3
_L3:
        IOException ioexception;
        ioexception;
        bitmap = null;
_L8:
        obj = bitmap;
        file.delete();
        obj = bitmap;
        throw new a(ioexception);
        file;
_L6:
        com.cardinalblue.android.b.k.a(((java.io.Closeable) (obj)));
        throw file;
        file;
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
        ioexception;
        bitmap = fileoutputstream;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static File a(String s)
    {
        return new File(d, (new StringBuilder()).append(UUID.randomUUID().toString()).append(".").append(s).toString());
    }

    public static File a(String s, String s1)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd HH_mm_ss", Locale.getDefault());
        return new File(c, (new StringBuilder()).append(s).append(" ").append(simpledateformat.format(new Date())).append(".").append(s1).toString());
    }

    public static boolean a()
    {
        return "mounted".equals(Environment.getExternalStorageState()) && a != null && a.exists() && d != null && d.exists() && c != null && c.exists();
    }

    public static boolean a(Context context)
    {
        File file;
        File file1;
        if (!"mounted".equals(Environment.getExternalStorageState()))
        {
            return false;
        }
        try
        {
            PackageManager packagemanager = context.getPackageManager();
            b = (String)packagemanager.getApplicationLabel(packagemanager.getApplicationInfo(context.getPackageName(), 0));
            c = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), b);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        file = context.getExternalFilesDir(null);
        file1 = context.getExternalFilesDir("resources/");
        if (file != null && file.exists() && file.isDirectory())
        {
            File afile[] = file.listFiles();
            int j = afile.length;
            int i = 0;
            do
            {
                if (i >= j)
                {
                    break;
                }
                File file3 = afile[i];
                String s = file3.getName();
                if (!"resources".equals(s) && !file3.renameTo(new File(file1, s)))
                {
                    com.cardinalblue.android.piccollage.a.f.a(new IOException((new StringBuilder()).append("Migration Error: Cannot move ").append(s).append(" to resources/").toString()));
                }
                i++;
            } while (true);
        }
        file1 = context.getExternalFilesDir(f.d);
        File file2 = context.getExternalFilesDir(f.c);
        d = new File(file1, "Database");
        a = new File(file2, "Bundles");
        file1 = new File(file2, "Bundles/Backgrounds/");
        context = context.getExternalCacheDir();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_284;
        }
        (new File(context, ".nomedia")).createNewFile();
        context = new File(file, ".nomedia");
        d.mkdirs();
        a.mkdirs();
        c.mkdirs();
        file1.mkdirs();
        if (!d.isDirectory() || !a.isDirectory() || !c.isDirectory() || !context.exists() && !context.createNewFile())
        {
            try
            {
                c = null;
                a = null;
                d = null;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                c = null;
                a = null;
                d = null;
                com.cardinalblue.android.piccollage.a.f.a(context);
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                c = null;
                a = null;
                d = null;
                com.cardinalblue.android.piccollage.a.f.a(context);
                return false;
            }
            return false;
        } else
        {
            return true;
        }
    }

    private static android.graphics.BitmapFactory.Options b()
    {
        android.graphics.BitmapFactory.Options options = a(1);
        options.inPreferredConfig = f.e;
        options.inJustDecodeBounds = true;
        return options;
    }

    public static File b(File file, Context context)
        throws IOException
    {
        if (file == null)
        {
            return null;
        }
        context = g.a(context, file);
        try
        {
            com.cardinalblue.android.b.k.a(file, context);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            context.delete();
            return null;
        }
        return context;
    }

    public static File b(String s)
        throws IOException
    {
        return a(com.cardinalblue.android.b.k.a(), s);
    }

    public static boolean b(File file)
    {
        if (file != null && file.getParentFile() != null && file.getParentFile().equals(d))
        {
            return file.delete();
        }
        return file == null;
    }

    public static String c(File file)
    {
        if (file == null)
        {
            return "";
        } else
        {
            return c(file.toString());
        }
    }

    public static String c(String s)
    {
        String s1;
        if (TextUtils.isEmpty(s) || d == null)
        {
            s1 = "";
        } else
        {
            s1 = s;
            if (!s.startsWith("private_root_path"))
            {
                if (s.startsWith(d.toString()))
                {
                    return s.replaceFirst(d.toString(), "private_root_path");
                }
                s1 = s;
                if (s.contains("Database"))
                {
                    String as[] = s.split("Database");
                    s1 = s;
                    if (as.length > 1)
                    {
                        s1 = s;
                        if (!TextUtils.isEmpty(as[0]))
                        {
                            return s.replaceFirst((new StringBuilder()).append(as[0]).append("Database").toString(), "private_root_path");
                        }
                    }
                }
            }
        }
        return s1;
    }

    private static Bitmap d(File file)
        throws a
    {
        Object obj;
        try
        {
            obj = b();
            BitmapFactory.decodeFile(file.toString(), ((android.graphics.BitmapFactory.Options) (obj)));
            obj = a((int)Math.floor(Math.max(((android.graphics.BitmapFactory.Options) (obj)).outHeight, ((android.graphics.BitmapFactory.Options) (obj)).outWidth) / 400));
            obj = BitmapFactory.decodeFile(file.toString(), ((android.graphics.BitmapFactory.Options) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw new a(file);
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        throw new a((new StringBuilder()).append("Unable to load ").append(file.toString()).toString());
        return ((Bitmap) (obj));
    }

    public static String d(String s)
    {
        String s1;
        if (!a() || TextUtils.isEmpty(s))
        {
            s1 = "";
        } else
        {
            s1 = s;
            if (s.startsWith("private_root_path"))
            {
                return s.replaceFirst("private_root_path", d.toString());
            }
        }
        return s1;
    }

    private static final String e(String s)
    {
        byte abyte0[];
        StringBuffer stringbuffer;
        int i;
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            messagedigest.update(s.getBytes());
            abyte0 = messagedigest.digest();
            stringbuffer = new StringBuffer();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.cardinalblue.android.piccollage.a.f.a(s);
            return UUID.randomUUID().toString();
        }
        i = 0;
        if (i >= abyte0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        for (s = Integer.toHexString(abyte0[i] & 0xff); s.length() < 2; s = (new StringBuilder()).append("0").append(s).toString()) { }
        stringbuffer.append(s);
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_30;
_L1:
        s = stringbuffer.toString();
        return s;
    }
}
