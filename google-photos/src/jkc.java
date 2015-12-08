// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.EOFException;
import java.util.Arrays;

public final class jkc
    implements jke
{

    private static final byte a[] = new byte[4096];
    private final jmr b;
    private final long c;
    private long d;
    private byte e[];
    private int f;
    private int g;

    public jkc(jmr jmr1, long l, long l1)
    {
        b = jmr1;
        d = l;
        c = l1;
        e = new byte[8192];
    }

    private void c(int i)
    {
        i = f + i;
        if (i > e.length)
        {
            e = Arrays.copyOf(e, Math.max(e.length << 1, i));
        }
    }

    private void d(int i)
    {
        g = g - i;
        f = 0;
        System.arraycopy(e, i, e, 0, g);
    }

    public final int a(byte abyte0[], int i, int j)
    {
        boolean flag = false;
        if (Thread.interrupted())
        {
            throw new InterruptedException();
        }
        int k = Math.min(g, j);
        System.arraycopy(e, 0, abyte0, i, k);
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
            d(k);
            i = j + k;
            d = d + (long)i;
            return i;
        }
    }

    public final void a()
    {
        f = 0;
    }

    public final void a(int i)
    {
        int k = Math.min(g, i);
        int l;
        for (int j = i - k; j > 0; j -= l)
        {
            if (Thread.interrupted())
            {
                throw new InterruptedException();
            }
            l = b.a(a, 0, Math.min(a.length, j));
            if (l == -1)
            {
                throw new EOFException();
            }
        }

        d(k);
        d = d + (long)i;
    }

    public final boolean a(byte abyte0[], int i, int j, boolean flag)
    {
        int l = Math.min(g, j);
        System.arraycopy(e, 0, abyte0, i, l);
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

        d(l);
        d = d + (long)j;
        return true;
    }

    public final long b()
    {
        return d;
    }

    public final void b(int i)
    {
        c(i);
        int l = i - Math.min(g - f, i);
        int j = g;
        for (int k = l; k > 0;)
        {
            if (Thread.interrupted())
            {
                throw new InterruptedException();
            }
            int i1 = b.a(e, j, k);
            if (i1 == -1)
            {
                throw new EOFException();
            }
            k -= i1;
            j += i1;
        }

        f = f + i;
        g = g + l;
    }

    public final void b(byte abyte0[], int i, int j)
    {
        a(abyte0, i, j, false);
    }

    public final long c()
    {
        return c;
    }

    public final void c(byte abyte0[], int i, int j)
    {
        c(j);
        int l = Math.min(g - f, j);
        System.arraycopy(e, f, abyte0, i, l);
        int j1 = j - l;
        int k = g;
        i += l;
        for (int i1 = j1; i1 > 0;)
        {
            if (Thread.interrupted())
            {
                throw new InterruptedException();
            }
            int k1 = b.a(e, k, i1);
            if (k1 == -1)
            {
                throw new EOFException();
            }
            System.arraycopy(e, k, abyte0, i, k1);
            i1 -= k1;
            k += k1;
            i += k1;
        }

        f = f + j;
        g = g + j1;
    }

}
