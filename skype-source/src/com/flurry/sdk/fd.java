// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// Referenced classes of package com.flurry.sdk:
//            do, eo, fe

public final class fd
{

    private static String a = com/flurry/sdk/fd.getSimpleName();

    public fd()
    {
    }

    public static File a(boolean flag)
    {
        File file;
        Context context;
label0:
        {
            Object obj = null;
            context = com.flurry.sdk.do.a().b();
            file = obj;
            if (!flag)
            {
                break label0;
            }
            file = obj;
            if (!"mounted".equals(Environment.getExternalStorageState()))
            {
                break label0;
            }
            if (android.os.Build.VERSION.SDK_INT < 19)
            {
                file = obj;
                if (context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)
                {
                    break label0;
                }
            }
            file = context.getExternalFilesDir(null);
        }
        File file1 = file;
        if (file == null)
        {
            file1 = context.getFilesDir();
        }
        return file1;
    }

    public static void a(File file, String s)
    {
        if (file == null)
        {
            eo.a(4, a, "No persistent file specified.");
            return;
        }
        if (s == null)
        {
            eo.a(4, a, (new StringBuilder("No data specified; deleting persistent file: ")).append(file.getAbsolutePath()).toString());
            file.delete();
            return;
        }
        eo.a(4, a, (new StringBuilder("Writing persistent data: ")).append(file.getAbsolutePath()).toString());
        FileOutputStream fileoutputstream = new FileOutputStream(file);
        file = fileoutputstream;
        fileoutputstream.write(s.getBytes());
        fe.a(fileoutputstream);
        return;
        Throwable throwable;
        throwable;
        s = null;
_L4:
        file = s;
        eo.a(6, a, "Error writing persistent file", throwable);
        fe.a(s);
        return;
        s;
        file = null;
_L2:
        fe.a(file);
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
        throwable;
        s = fileoutputstream;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean a(File file)
    {
        while (file == null || file.getAbsoluteFile() == null) 
        {
            return false;
        }
        file = file.getParentFile();
        if (file == null)
        {
            return true;
        }
        if (!file.mkdirs() && !file.isDirectory())
        {
            eo.a(6, a, (new StringBuilder("Unable to create persistent dir: ")).append(file).toString());
            return false;
        } else
        {
            return true;
        }
    }

    public static File b(boolean flag)
    {
        File file;
        Context context;
label0:
        {
            context = com.flurry.sdk.do.a().b();
            Object obj = null;
            file = obj;
            if (!flag)
            {
                break label0;
            }
            file = obj;
            if (!"mounted".equals(Environment.getExternalStorageState()))
            {
                break label0;
            }
            if (android.os.Build.VERSION.SDK_INT < 19)
            {
                file = obj;
                if (context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)
                {
                    break label0;
                }
            }
            file = context.getExternalCacheDir();
        }
        File file1 = file;
        if (file == null)
        {
            file1 = context.getCacheDir();
        }
        return file1;
    }

    public static boolean b(File file)
    {
        if (file != null && file.isDirectory())
        {
            String as[] = file.list();
            for (int i = 0; i < as.length; i++)
            {
                if (!b(new File(file, as[i])))
                {
                    return false;
                }
            }

        }
        return file.delete();
    }

    public static String c(File file)
    {
        if (file != null && file.exists()) goto _L2; else goto _L1
_L1:
        eo.a(4, a, "Persistent file doesn't exist.");
_L5:
        return null;
_L2:
        eo.a(4, a, (new StringBuilder("Loading persistent data: ")).append(file.getAbsolutePath()).toString());
        Object obj = new FileInputStream(file);
        file = ((File) (obj));
        Object obj1 = new StringBuilder();
        file = ((File) (obj));
        byte abyte0[] = new byte[1024];
_L4:
        file = ((File) (obj));
        int i = ((FileInputStream) (obj)).read(abyte0);
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        file = ((File) (obj));
        ((StringBuilder) (obj1)).append(new String(abyte0, 0, i));
        if (true) goto _L4; else goto _L3
        obj1;
_L9:
        file = ((File) (obj));
        eo.a(6, a, "Error when loading persistent file", ((Throwable) (obj1)));
        fe.a(((java.io.Closeable) (obj)));
        file = null;
_L6:
        if (file != null)
        {
            return file.toString();
        }
          goto _L5
_L3:
        fe.a(((java.io.Closeable) (obj)));
        file = ((File) (obj1));
          goto _L6
        file;
        obj1 = null;
        obj = file;
_L8:
        fe.a(((java.io.Closeable) (obj1)));
        throw obj;
        obj;
        obj1 = file;
        if (true) goto _L8; else goto _L7
_L7:
        obj1;
        obj = null;
          goto _L9
    }

}
