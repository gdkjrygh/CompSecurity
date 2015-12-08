// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

// Referenced classes of package com.crashlytics.android.internal:
//            br, bp

final class bs extends InputStream
{

    private int a;
    private int b;
    private bp c;

    private bs(bp bp1, br br1)
    {
        c = bp1;
        super();
        a = bp.a(bp1, br1.b + 4);
        b = br1.c;
    }

    bs(bp bp1, br br1, byte byte0)
    {
        this(bp1, br1);
    }

    public final int read()
        throws IOException
    {
        if (b == 0)
        {
            return -1;
        } else
        {
            bp.a(c).seek(a);
            int i = bp.a(c).read();
            a = bp.a(c, a + 1);
            b = b - 1;
            return i;
        }
    }

    public final int read(byte abyte0[], int i, int j)
        throws IOException
    {
        bp.a(abyte0, "buffer");
        if ((i | j) < 0 || j > abyte0.length - i)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (b > 0)
        {
            int k = j;
            if (j > b)
            {
                k = b;
            }
            bp.a(c, a, abyte0, i, k);
            a = bp.a(c, a + k);
            b = b - k;
            return k;
        } else
        {
            return -1;
        }
    }
}
