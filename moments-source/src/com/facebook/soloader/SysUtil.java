// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.facebook.androidcompat.AndroidCompat;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.facebook.soloader:
//            FileLocker

public final class SysUtil
{

    private static byte a[] = null;

    public SysUtil()
    {
    }

    public static int a(String as[], String s)
    {
        for (int i = 0; i < as.length; i++)
        {
            if (as[i] != null && s.equals(as[i]))
            {
                return i;
            }
        }

        return -1;
    }

    public static FileLocker a(Context context)
    {
        return FileLocker.a(new File(context.getApplicationInfo().dataDir, "libs-dir-lock"));
    }

    public static void a()
    {
        a = null;
    }

    public static void a(File file)
    {
        if (!file.delete())
        {
            throw new IOException((new StringBuilder("could not delete file ")).append(file).toString());
        } else
        {
            return;
        }
    }

    private static void a(FileDescriptor filedescriptor, long l)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            LollipopSysdeps.fallocate(filedescriptor, l);
        }
    }

    public static void a(InputStream inputstream, File file, int i)
    {
        Object obj;
        FileOutputStream fileoutputstream;
        file.delete();
        fileoutputstream = new FileOutputStream(file);
        obj = null;
        if (a != null) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        abyte0 = new byte[16384];
        a = abyte0;
_L8:
        int j;
        j = i;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        a(fileoutputstream.getFD(), i);
        j = i;
_L6:
        if (j <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i = inputstream.read(abyte0, 0, Math.min(abyte0.length, j));
        if (i != -1) goto _L4; else goto _L3
_L3:
        try
        {
            throw new IOException((new StringBuilder("Reached EOF with ")).append(j).append(" bytes left to read").toString());
        }
        // Misplaced declaration of an exception variable
        catch (File file) { }
        finally
        {
            file = obj;
        }
        throw file;
        inputstream;
        if (file != null)
        {
            try
            {
                fileoutputstream.close();
            }
            catch (Throwable throwable)
            {
                AndroidCompat.a(file, throwable);
            }
        } else
        {
            fileoutputstream.close();
        }
        throw inputstream;
_L2:
        abyte0 = a;
        continue; /* Loop/switch isn't completed */
_L4:
        fileoutputstream.write(abyte0, 0, i);
        j -= i;
        if (true) goto _L6; else goto _L5
_L5:
        file.setExecutable(true);
        fileoutputstream.close();
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static void a(InputStream inputstream, File file, long l)
    {
        Object obj;
        FileOutputStream fileoutputstream;
        file.delete();
        fileoutputstream = new FileOutputStream(file);
        obj = null;
        if (a != null) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        abyte0 = new byte[16384];
        a = abyte0;
_L6:
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        a(fileoutputstream.getFD(), l);
_L5:
        int i = inputstream.read(abyte0, 0, abyte0.length);
        if (i < 0) goto _L4; else goto _L3
_L3:
        fileoutputstream.write(abyte0, 0, i);
          goto _L5
        file;
        throw file;
        inputstream;
_L7:
        if (file != null)
        {
            try
            {
                fileoutputstream.close();
            }
            catch (Throwable throwable)
            {
                AndroidCompat.a(file, throwable);
            }
        } else
        {
            fileoutputstream.close();
        }
        throw inputstream;
_L2:
        abyte0 = a;
          goto _L6
_L4:
        file.setExecutable(true);
        fileoutputstream.close();
        return;
        inputstream;
        file = obj;
          goto _L7
    }

    public static void a(InputStream inputstream, File file, long l, long l1)
    {
        Object obj;
        FileOutputStream fileoutputstream;
        file.delete();
        fileoutputstream = new FileOutputStream(file);
        obj = null;
        if (a != null) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        abyte0 = new byte[16384];
        a = abyte0;
_L6:
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        a(fileoutputstream.getFD(), l);
_L5:
        int i = inputstream.read(abyte0, 0, abyte0.length);
        if (i < 0) goto _L4; else goto _L3
_L3:
        fileoutputstream.write(abyte0, 0, i);
          goto _L5
        file;
        throw file;
        inputstream;
_L7:
        if (file != null)
        {
            try
            {
                fileoutputstream.close();
            }
            catch (Throwable throwable)
            {
                AndroidCompat.a(file, throwable);
            }
        } else
        {
            fileoutputstream.close();
        }
        throw inputstream;
_L2:
        abyte0 = a;
          goto _L6
_L4:
        fileoutputstream.getFD().sync();
        file.setExecutable(true);
        file.setLastModified(l1);
        fileoutputstream.getFD().sync();
        fileoutputstream.close();
        return;
        inputstream;
        file = obj;
          goto _L7
    }

    public static File b(Context context)
    {
        return new File(context.getApplicationInfo().dataDir, "app_libs");
    }

    public static void b(File file)
    {
        if (file.isDirectory())
        {
            File afile[] = file.listFiles();
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                b(afile[i]);
            }

        }
        if (!file.delete() && file.exists())
        {
            throw new IOException((new StringBuilder("could not delete: ")).append(file).toString());
        } else
        {
            return;
        }
    }

    public static String[] b()
    {
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            return (new String[] {
                Build.CPU_ABI, Build.CPU_ABI2
            });
        } else
        {
            return LollipopSysdeps.getSupportedAbis();
        }
    }

    public static File c(Context context)
    {
        context = b(context);
        if (!context.isDirectory() && !context.mkdirs())
        {
            throw new RuntimeException("could not create libs directory");
        } else
        {
            return context;
        }
    }


    private class LollipopSysdeps
    {

        public static void fallocate(FileDescriptor filedescriptor, long l)
        {
            try
            {
                Os.posix_fallocate(filedescriptor, 0L, l);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (FileDescriptor filedescriptor)
            {
                throw new IOException(filedescriptor.toString(), filedescriptor);
            }
        }

        public static String[] getSupportedAbis()
        {
            return Build.SUPPORTED_32_BIT_ABIS;
        }

        private LollipopSysdeps()
        {
        }
    }

}
