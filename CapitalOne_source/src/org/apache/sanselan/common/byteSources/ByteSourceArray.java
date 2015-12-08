// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.common.byteSources;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package org.apache.sanselan.common.byteSources:
//            ByteSource

public class ByteSourceArray extends ByteSource
{

    private final byte c[];

    public ByteSourceArray(byte abyte0[])
    {
        c = abyte0;
    }

    public final InputStream b()
    {
        return new ByteArrayInputStream(c);
    }

    public final byte[] b(int i, int j)
    {
        if (i + j > c.length)
        {
            throw new IOException((new StringBuilder("Could not read block (block start: ")).append(i).append(", block length: ").append(j).append(", data length: ").append(c.length).append(").").toString());
        } else
        {
            byte abyte0[] = new byte[j];
            System.arraycopy(c, i, abyte0, 0, j);
            return abyte0;
        }
    }

    public final long c()
    {
        return (long)c.length;
    }
}
