// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import java.io.InputStream;

final class q
{

    private final InputStream a;

    public q(InputStream inputstream)
    {
        a = inputstream;
    }

    public final int a()
    {
        return a.read() << 8 & 0xff00 | a.read() & 0xff;
    }

    public final int a(byte abyte0[])
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

    public final long a(long l)
    {
        if (l < 0L)
        {
            return 0L;
        }
        long l1 = l;
        do
        {
            if (l1 <= 0L)
            {
                break;
            }
            long l2 = a.skip(l1);
            if (l2 > 0L)
            {
                l1 -= l2;
                continue;
            }
            if (a.read() == -1)
            {
                break;
            }
            l1--;
        } while (true);
        return l - l1;
    }

    public final short b()
    {
        return (short)(a.read() & 0xff);
    }

    public final int c()
    {
        return a.read();
    }
}
