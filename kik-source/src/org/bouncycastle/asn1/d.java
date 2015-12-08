// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1;

import java.io.EOFException;
import java.io.InputStream;
import org.bouncycastle.util.io.Streams;

// Referenced classes of package org.bouncycastle.asn1:
//            g

final class d extends g
{

    private static final byte b[] = new byte[0];
    private final int c;
    private int d;

    d(InputStream inputstream, int i)
    {
        super(inputstream, i);
        if (i < 0)
        {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        c = i;
        d = i;
        if (i == 0)
        {
            c();
        }
    }

    final int a()
    {
        return d;
    }

    final byte[] b()
    {
        if (d == 0)
        {
            return b;
        }
        byte abyte0[] = new byte[d];
        int i = d - Streams.a(a, abyte0);
        d = i;
        if (i != 0)
        {
            throw new EOFException((new StringBuilder("DEF length ")).append(c).append(" object truncated by ").append(d).toString());
        } else
        {
            c();
            return abyte0;
        }
    }

    public final int read()
    {
        int i;
        if (d == 0)
        {
            i = -1;
        } else
        {
            int j = a.read();
            if (j < 0)
            {
                throw new EOFException((new StringBuilder("DEF length ")).append(c).append(" object truncated by ").append(d).toString());
            }
            int k = d - 1;
            d = k;
            i = j;
            if (k == 0)
            {
                c();
                return j;
            }
        }
        return i;
    }

    public final int read(byte abyte0[], int i, int j)
    {
        if (d == 0)
        {
            i = -1;
        } else
        {
            j = Math.min(j, d);
            j = a.read(abyte0, i, j);
            if (j < 0)
            {
                throw new EOFException((new StringBuilder("DEF length ")).append(c).append(" object truncated by ").append(d).toString());
            }
            int k = d - j;
            d = k;
            i = j;
            if (k == 0)
            {
                c();
                return j;
            }
        }
        return i;
    }

}
