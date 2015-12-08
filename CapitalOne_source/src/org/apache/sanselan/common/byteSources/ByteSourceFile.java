// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.common.byteSources;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import org.apache.sanselan.util.Debug;

// Referenced classes of package org.apache.sanselan.common.byteSources:
//            ByteSource

public class ByteSourceFile extends ByteSource
{

    private final File c;

    public final InputStream b()
    {
        return new BufferedInputStream(new FileInputStream(c));
    }

    public final byte[] b(int i, int j)
    {
        Object obj = new RandomAccessFile(c, "r");
        long l = i;
        byte abyte0[] = a(((RandomAccessFile) (obj)), l, j, "Could not read value from file");
        try
        {
            ((RandomAccessFile) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Debug.a(((Throwable) (obj)));
            return abyte0;
        }
        return abyte0;
        Exception exception;
        exception;
        obj = null;
_L2:
        try
        {
            ((RandomAccessFile) (obj)).close();
        }
        catch (Exception exception1)
        {
            Debug.a(exception1);
        }
        throw exception;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final long c()
    {
        return c.length();
    }
}
