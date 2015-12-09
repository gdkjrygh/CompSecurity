// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//            ImageHeaderParser

private static class a
{

    private final InputStream a;

    public int a()
        throws IOException
    {
        return a.read() << 8 & 0xff00 | a.read() & 0xff;
    }

    public int a(byte abyte0[])
        throws IOException
    {
        int i = abyte0.length;
        do
        {
            if (i <= 0)
            {
                break;
            }
            int j = a.read(abyte0, abyte0.length - i, i);
            if (j == -1)
            {
                break;
            }
            i -= j;
        } while (true);
        return abyte0.length - i;
    }

    public long a(long l)
        throws IOException
    {
        if (l < 0L)
        {
            return 0L;
        }
        long l1 = l;
        do
        {
label0:
            {
                if (l1 > 0L)
                {
                    long l2 = a.skip(l1);
                    if (l2 > 0L)
                    {
                        l1 -= l2;
                        continue;
                    }
                    if (a.read() != -1)
                    {
                        break label0;
                    }
                }
                return l - l1;
            }
            l1--;
        } while (true);
    }

    public short b()
        throws IOException
    {
        return (short)(a.read() & 0xff);
    }

    public int c()
        throws IOException
    {
        return a.read();
    }

    public A(InputStream inputstream)
    {
        a = inputstream;
    }
}
