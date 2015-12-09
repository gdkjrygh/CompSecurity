// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.dextricks;

import com.facebook.xzdecoder.XzInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

// Referenced classes of package com.facebook.common.dextricks:
//            DexLibLoader

abstract class <init>
    implements Closeable
{

    public abstract InputStream a(String s);

    public void a(String s, File file)
    {
        Object obj1;
        FileOutputStream fileoutputstream;
        obj1 = null;
        fileoutputstream = null;
        Object obj = a(s);
        XzInputStream xzinputstream;
        if (!s.endsWith(".xz"))
        {
            break MISSING_BLOCK_LABEL_34;
        }
        xzinputstream = new XzInputStream(((InputStream) (obj)));
        obj = xzinputstream;
        obj1 = fileoutputstream;
        fileoutputstream = new FileOutputStream(file);
        if (!s.endsWith(".dex") || !file.getName().endsWith(".dex.jar")) goto _L2; else goto _L1
_L1:
        obj1 = new BufferedOutputStream(fileoutputstream);
        s = new ZipOutputStream(((OutputStream) (obj1)));
        obj1 = s;
        s.putNextEntry(new ZipEntry("classes.dex"));
_L7:
        obj1 = s;
        file = new byte[8192];
_L4:
        obj1 = s;
        int i = ((InputStream) (obj)).read(file, 0, 8192);
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = s;
        s.write(file, 0, i);
        if (true) goto _L4; else goto _L3
        s;
        file = ((File) (obj));
_L5:
        DexLibLoader.a(file);
        DexLibLoader.a(((Closeable) (obj1)));
        throw s;
_L3:
        obj1 = s;
        s.flush();
        obj1 = s;
        s.close();
        DexLibLoader.a(((Closeable) (obj)));
        DexLibLoader.a(s);
        return;
        s;
        file = null;
        continue; /* Loop/switch isn't completed */
        s;
        file = ((File) (obj));
        continue; /* Loop/switch isn't completed */
        s;
        obj1 = fileoutputstream;
        file = ((File) (obj));
        continue; /* Loop/switch isn't completed */
        s;
        file = ((File) (obj));
        if (true) goto _L5; else goto _L2
_L2:
        s = fileoutputstream;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean a()
    {
        return true;
    }

    public boolean b()
    {
        return true;
    }

    public void close()
    {
    }

    private ()
    {
    }

    (byte byte0)
    {
        this();
    }
}
