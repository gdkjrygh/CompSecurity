// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InputStream;
import java.io.RandomAccessFile;

final class gzi extends InputStream
{

    private int a;
    private int b;
    private gzg c;

    private gzi(gzg gzg1, gzh gzh1)
    {
        c = gzg1;
        super();
        a = gzg.a(gzg1, gzh1.b + 4);
        b = gzh1.c;
    }

    gzi(gzg gzg1, gzh gzh1, byte byte0)
    {
        this(gzg1, gzh1);
    }

    public final int read()
    {
        if (b == 0)
        {
            return -1;
        } else
        {
            gzg.a(c).seek(a);
            int i = gzg.a(c).read();
            a = gzg.a(c, a + 1);
            b = b - 1;
            return i;
        }
    }

    public final int read(byte abyte0[], int i, int j)
    {
        gzg.a(abyte0, "buffer");
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
            gzg.a(c, a, abyte0, i, k);
            a = gzg.a(c, a + k);
            b = b - k;
            return k;
        } else
        {
            return -1;
        }
    }
}
