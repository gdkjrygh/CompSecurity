// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package org.a.a.a:
//            c

public final class a
{

    public static final File a[] = new File[0];

    public static byte[] a(File file)
    {
        Object obj = null;
        if (!file.exists()) goto _L2; else goto _L1
_L1:
        if (file.isDirectory())
        {
            throw new IOException("File '" + file + "' exists but is a directory");
        }
          goto _L3
        file;
_L5:
        c.a(((java.io.InputStream) (obj)));
        throw file;
_L2:
        throw new FileNotFoundException("File '" + file + "' does not exist");
_L3:
        if (!file.canRead())
        {
            throw new IOException("File '" + file + "' cannot be read");
        }
        file = new FileInputStream(file);
        obj = c.b(file);
        c.a(file);
        return ((byte []) (obj));
        Exception exception;
        exception;
        obj = file;
        file = exception;
        if (true) goto _L5; else goto _L4
_L4:
    }

}
