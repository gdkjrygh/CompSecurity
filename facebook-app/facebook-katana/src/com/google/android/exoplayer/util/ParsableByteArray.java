// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.util;


// Referenced classes of package com.google.android.exoplayer.util:
//            Assertions, ParsableBitArray

public final class ParsableByteArray
{

    public byte a[];
    private int b;
    private int c;

    public ParsableByteArray()
    {
    }

    public ParsableByteArray(int i1)
    {
        a = new byte[i1];
        c = a.length;
    }

    public ParsableByteArray(byte abyte0[])
    {
        a = abyte0;
        c = abyte0.length;
    }

    public ParsableByteArray(byte abyte0[], int i1)
    {
        a = abyte0;
        c = i1;
    }

    public final void a()
    {
        b = 0;
        c = 0;
    }

    public final void a(int i1)
    {
        boolean flag;
        if (i1 >= 0 && i1 <= a.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.a(flag);
        c = i1;
    }

    public final void a(ParsableBitArray parsablebitarray, int i1)
    {
        a(parsablebitarray.a, 0, i1);
        parsablebitarray.a(0);
    }

    public final void a(byte abyte0[], int i1)
    {
        a = abyte0;
        c = i1;
        b = 0;
    }

    public final void a(byte abyte0[], int i1, int j1)
    {
        System.arraycopy(a, b, abyte0, i1, j1);
        b = b + j1;
    }

    public final int b()
    {
        return c - b;
    }

    public final void b(int i1)
    {
        boolean flag;
        if (i1 >= 0 && i1 <= c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.a(flag);
        b = i1;
    }

    public final int c()
    {
        return c;
    }

    public final void c(int i1)
    {
        b(b + i1);
    }

    public final int d()
    {
        return b;
    }

    public final int e()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.length;
        }
    }

    public final int f()
    {
        byte abyte0[] = a;
        int i1 = b;
        b = i1 + 1;
        return abyte0[i1] & 0xff;
    }

    public final int g()
    {
        byte abyte0[] = a;
        int i1 = b;
        b = i1 + 1;
        i1 = abyte0[i1];
        abyte0 = a;
        int j1 = b;
        b = j1 + 1;
        return (i1 & 0xff) << 8 | abyte0[j1] & 0xff;
    }

    public final int h()
    {
        byte abyte0[] = a;
        int i1 = b;
        b = i1 + 1;
        i1 = abyte0[i1];
        abyte0 = a;
        int j1 = b;
        b = j1 + 1;
        j1 = abyte0[j1];
        abyte0 = a;
        int k1 = b;
        b = k1 + 1;
        return (i1 & 0xff) << 16 | (j1 & 0xff) << 8 | abyte0[k1] & 0xff;
    }

    public final long i()
    {
        byte abyte0[] = a;
        int i1 = b;
        b = i1 + 1;
        long l1 = abyte0[i1];
        abyte0 = a;
        i1 = b;
        b = i1 + 1;
        long l2 = abyte0[i1];
        abyte0 = a;
        i1 = b;
        b = i1 + 1;
        long l3 = abyte0[i1];
        abyte0 = a;
        i1 = b;
        b = i1 + 1;
        return (l1 & 255L) << 24 | (l2 & 255L) << 16 | (l3 & 255L) << 8 | (long)abyte0[i1] & 255L;
    }

    public final int j()
    {
        byte abyte0[] = a;
        int i1 = b;
        b = i1 + 1;
        i1 = abyte0[i1];
        abyte0 = a;
        int j1 = b;
        b = j1 + 1;
        j1 = abyte0[j1];
        abyte0 = a;
        int k1 = b;
        b = k1 + 1;
        k1 = abyte0[k1];
        abyte0 = a;
        int l1 = b;
        b = l1 + 1;
        return (i1 & 0xff) << 24 | (j1 & 0xff) << 16 | (k1 & 0xff) << 8 | abyte0[l1] & 0xff;
    }

    public final long k()
    {
        byte abyte0[] = a;
        int i1 = b;
        b = i1 + 1;
        long l1 = abyte0[i1];
        abyte0 = a;
        i1 = b;
        b = i1 + 1;
        long l2 = abyte0[i1];
        abyte0 = a;
        i1 = b;
        b = i1 + 1;
        long l3 = abyte0[i1];
        abyte0 = a;
        i1 = b;
        b = i1 + 1;
        long l4 = abyte0[i1];
        abyte0 = a;
        i1 = b;
        b = i1 + 1;
        long l5 = abyte0[i1];
        abyte0 = a;
        i1 = b;
        b = i1 + 1;
        long l6 = abyte0[i1];
        abyte0 = a;
        i1 = b;
        b = i1 + 1;
        long l7 = abyte0[i1];
        abyte0 = a;
        i1 = b;
        b = i1 + 1;
        return (l1 & 255L) << 56 | (l2 & 255L) << 48 | (l3 & 255L) << 40 | (l4 & 255L) << 32 | (l5 & 255L) << 24 | (l6 & 255L) << 16 | (l7 & 255L) << 8 | (long)abyte0[i1] & 255L;
    }

    public final int l()
    {
        byte abyte0[] = a;
        int i1 = b;
        b = i1 + 1;
        i1 = abyte0[i1];
        abyte0 = a;
        int j1 = b;
        b = j1 + 1;
        j1 = abyte0[j1];
        b = b + 2;
        return (i1 & 0xff) << 8 | j1 & 0xff;
    }

    public final int m()
    {
        int i1 = j();
        if (i1 < 0)
        {
            throw new IllegalStateException((new StringBuilder("Top bit not zero: ")).append(i1).toString());
        } else
        {
            return i1;
        }
    }

    public final long n()
    {
        long l1 = k();
        if (l1 < 0L)
        {
            throw new IllegalStateException((new StringBuilder("Top bit not zero: ")).append(l1).toString());
        } else
        {
            return l1;
        }
    }
}
