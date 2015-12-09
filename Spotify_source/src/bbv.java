// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.EOFException;

public final class bbv
    implements bby
{

    private static final byte a[] = new byte[4096];
    private final bdc b;
    private long c;
    private byte d[];
    private int e;

    public bbv(bdc bdc1, long l)
    {
        b = bdc1;
        c = l;
        d = new byte[8192];
    }

    private void b(int i)
    {
        e = e - i;
        System.arraycopy(d, i, d, 0, e);
    }

    public final int a(byte abyte0[], int i, int j)
    {
        boolean flag = false;
        if (Thread.interrupted())
        {
            throw new InterruptedException();
        }
        int k = Math.min(e, j);
        System.arraycopy(d, 0, abyte0, i, k);
        int l = j - k;
        j = ((flag) ? 1 : 0);
        if (l != 0)
        {
            j = b.a(abyte0, i + k, l);
        }
        if (j == -1)
        {
            return -1;
        } else
        {
            b(k);
            i = j + k;
            c = c + (long)i;
            return i;
        }
    }

    public final long a()
    {
        return c;
    }

    public final void a(int i)
    {
        int k = Math.min(e, i);
        int l;
        for (int j = i - k; j > 0; j -= l)
        {
            if (Thread.interrupted())
            {
                throw new InterruptedException();
            }
            l = b.a(a, 0, Math.min(4096, j));
            if (l == -1)
            {
                throw new EOFException();
            }
        }

        b(k);
        c = c + (long)i;
    }

    public final boolean a(byte abyte0[], int i, int j, boolean flag)
    {
        int l = Math.min(e, j);
        System.arraycopy(d, 0, abyte0, i, l);
        int k = i + l;
        int i1;
        for (i = j - l; i > 0; i -= i1)
        {
            if (Thread.interrupted())
            {
                throw new InterruptedException();
            }
            i1 = b.a(abyte0, k, i);
            if (i1 == -1)
            {
                if (flag && i == j)
                {
                    return false;
                } else
                {
                    throw new EOFException();
                }
            }
            k += i1;
        }

        b(l);
        c = c + (long)j;
        return true;
    }

    public final void b(byte abyte0[], int i, int j)
    {
        a(abyte0, i, j, false);
    }

}
