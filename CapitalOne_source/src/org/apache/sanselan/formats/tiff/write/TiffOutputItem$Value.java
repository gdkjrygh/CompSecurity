// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.sanselan.formats.tiff.write;

import org.apache.sanselan.ImageWriteException;
import org.apache.sanselan.common.BinaryOutputStream;

// Referenced classes of package org.apache.sanselan.formats.tiff.write:
//            TiffOutputItem

public class a extends TiffOutputItem
{

    private final byte a[];
    private final String b;

    public final void a(BinaryOutputStream binaryoutputstream)
    {
        binaryoutputstream.write(a);
    }

    public final void a(byte abyte0[])
    {
        if (a.length != abyte0.length)
        {
            throw new ImageWriteException((new StringBuilder("Updated data size mismatch: ")).append(a.length).append(" vs. ").append(abyte0.length).toString());
        } else
        {
            System.arraycopy(abyte0, 0, a, 0, abyte0.length);
            return;
        }
    }

    public final int c()
    {
        return a.length;
    }

    public A(String s, byte abyte0[])
    {
        b = s;
        a = abyte0;
    }
}
