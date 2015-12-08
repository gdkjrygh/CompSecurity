// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// Referenced classes of package com.flurry.sdk:
//            el, fb

public final class fa
{

    private static String a = com/flurry/sdk/fa.getSimpleName();

    public fa()
    {
    }

    public static void a(File file, String s)
    {
        if (file == null)
        {
            el.a(4, a, "No persistent file specified.");
            return;
        }
        if (s == null)
        {
            el.a(4, a, (new StringBuilder("No data specified; deleting persistent file: ")).append(file.getAbsolutePath()).toString());
            file.delete();
            return;
        }
        el.a(4, a, (new StringBuilder("Writing persistent data: ")).append(file.getAbsolutePath()).toString());
        FileOutputStream fileoutputstream = new FileOutputStream(file);
        file = fileoutputstream;
        fileoutputstream.write(s.getBytes());
        fb.a(fileoutputstream);
        return;
        Throwable throwable;
        throwable;
        s = null;
_L4:
        file = s;
        el.a(6, a, "Error writing persistent file", throwable);
        fb.a(s);
        return;
        s;
        file = null;
_L2:
        fb.a(file);
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
            el.a(6, a, (new StringBuilder("Unable to create persistent dir: ")).append(file).toString());
            return false;
        } else
        {
            return true;
        }
    }

    public static String c(File file)
    {
        if (file != null && file.exists()) goto _L2; else goto _L1
_L1:
        el.a(4, a, "Persistent file doesn't exist.");
_L5:
        return null;
_L2:
        el.a(4, a, (new StringBuilder("Loading persistent data: ")).append(file.getAbsolutePath()).toString());
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
        el.a(6, a, "Error when loading persistent file", ((Throwable) (obj1)));
        fb.a(((java.io.Closeable) (obj)));
        file = null;
_L6:
        if (file != null)
        {
            return file.toString();
        }
          goto _L5
_L3:
        fb.a(((java.io.Closeable) (obj)));
        file = ((File) (obj1));
          goto _L6
        file;
        obj1 = null;
        obj = file;
_L8:
        fb.a(((java.io.Closeable) (obj1)));
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
