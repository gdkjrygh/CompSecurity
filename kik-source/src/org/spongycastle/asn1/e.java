// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.asn1;

import java.io.EOFException;
import java.io.InputStream;
import org.spongycastle.util.io.Streams;

// Referenced classes of package org.spongycastle.asn1:
//            i

final class e extends i
{

    private static final byte b[] = new byte[0];
    private final int c;
    private int d;

    e(InputStream inputstream, int j)
    {
        super(inputstream, j);
        if (j < 0)
        {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        c = j;
        d = j;
        if (j == 0)
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
        int j = d - Streams.a(a, abyte0);
        d = j;
        if (j != 0)
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
        int j;
        if (d == 0)
        {
            j = -1;
        } else
        {
            int k = a.read();
            if (k < 0)
            {
                throw new EOFException((new StringBuilder("DEF length ")).append(c).append(" object truncated by ").append(d).toString());
            }
            int l = d - 1;
            d = l;
            j = k;
            if (l == 0)
            {
                c();
                return k;
            }
        }
        return j;
    }

    public final int read(byte abyte0[], int j, int k)
    {
        if (d == 0)
        {
            j = -1;
        } else
        {
            k = Math.min(k, d);
            k = a.read(abyte0, j, k);
            if (k < 0)
            {
                throw new EOFException((new StringBuilder("DEF length ")).append(c).append(" object truncated by ").append(d).toString());
            }
            int l = d - k;
            d = l;
            j = k;
            if (l == 0)
            {
                c();
                return k;
            }
        }
        return j;
    }

}
