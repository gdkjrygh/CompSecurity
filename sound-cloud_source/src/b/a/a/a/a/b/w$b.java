// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.b;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

// Referenced classes of package b.a.a.a.a.b:
//            w

private final class <init> extends InputStream
{

    final w a;
    private int b;
    private int c;

    public final int read()
        throws IOException
    {
        if (c == 0)
        {
            return -1;
        } else
        {
            w.a(a).seek(b);
            int i = w.a(a).read();
            b = w.a(a, b + 1);
            c = c - 1;
            return i;
        }
    }

    public final int read(byte abyte0[], int i, int j)
        throws IOException
    {
        w.a(abyte0, "buffer");
        if ((i | j) < 0 || j > abyte0.length - i)
        {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (c > 0)
        {
            int k = j;
            if (j > c)
            {
                k = c;
            }
            w.a(a, b, abyte0, i, k);
            b = w.a(a, b + k);
            c = c - k;
            return k;
        } else
        {
            return -1;
        }
    }

    private ion(w w1, ion ion)
    {
        a = w1;
        super();
        b = w.a(w1, ion.b + 4);
        c = ion.c;
    }

    c(w w1, c c1, byte byte0)
    {
        this(w1, c1);
    }
}
