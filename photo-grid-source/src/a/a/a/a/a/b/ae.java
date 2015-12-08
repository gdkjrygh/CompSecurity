// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.b;

import java.io.InputStream;
import java.io.RandomAccessFile;

// Referenced classes of package a.a.a.a.a.b:
//            ad, ab

final class ae extends InputStream
{

    final ab a;
    private int b;
    private int c;

    private ae(ab ab1, ad ad1)
    {
        a = ab1;
        super();
        b = ab.a(ab1, ad1.b + 4);
        c = ad1.c;
    }

    ae(ab ab1, ad ad1, byte byte0)
    {
        this(ab1, ad1);
    }

    public final int read()
    {
        if (c == 0)
        {
            return -1;
        } else
        {
            ab.a(a).seek(b);
            int i = ab.a(a).read();
            b = ab.a(a, b + 1);
            c = c - 1;
            return i;
        }
    }

    public final int read(byte abyte0[], int i, int j)
    {
        ab.a(abyte0, "buffer");
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
            ab.a(a, b, abyte0, i, k);
            b = ab.a(a, b + k);
            c = c - k;
            return k;
        } else
        {
            return -1;
        }
    }
}
