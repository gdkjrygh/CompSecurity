// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InputStream;

public final class avw
    implements avv
{

    private final InputStream a;

    public avw(InputStream inputstream)
    {
        a = inputstream;
    }

    public final int a()
    {
        return a.read() << 8 & 0xff00 | a.read() & 0xff;
    }

    public final int a(byte abyte0[], int i)
    {
        int j = i;
        do
        {
            if (j <= 0)
            {
                break;
            }
            int k = a.read(abyte0, i - j, j);
            if (k == -1)
            {
                break;
            }
            j -= k;
        } while (true);
        return i - j;
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
