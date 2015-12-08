// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            n

private final class <init> extends InputStream
{

    final n a;
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
            n.a(a).seek(b);
            int i = n.a(a).read();
            b = n.a(a, b + 1);
            c = c - 1;
            return i;
        }
    }

    public final int read(byte abyte0[], int i, int j)
        throws IOException
    {
        n.a(abyte0, "buffer");
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
            n.a(a, b, abyte0, i, k);
            b = n.a(a, b + k);
            c = c - k;
            return k;
        } else
        {
            return -1;
        }
    }

    private (n n1,  )
    {
        a = n1;
        super();
        b = n.a(n1, .b + 4);
        c = .c;
    }

    c(n n1, c c1, byte byte0)
    {
        this(n1, c1);
    }
}
