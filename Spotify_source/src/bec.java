// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bec
{

    public byte a[];
    public int b;
    public int c;

    public bec()
    {
    }

    public bec(int j)
    {
        a = new byte[j];
        c = a.length;
    }

    public bec(byte abyte0[])
    {
        a = abyte0;
        c = abyte0.length;
    }

    public final void a()
    {
        b = 0;
        c = 0;
    }

    public final void a(int j)
    {
        boolean flag;
        if (j >= 0 && j <= c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.a(flag);
        b = j;
    }

    public final void a(byte abyte0[], int j)
    {
        a = abyte0;
        c = j;
        b = 0;
    }

    public final void a(byte abyte0[], int j, int k)
    {
        System.arraycopy(a, b, abyte0, j, k);
        b = b + k;
    }

    public final int b()
    {
        return c - b;
    }

    public final void b(int j)
    {
        a(b + j);
    }

    public final int c()
    {
        byte abyte0[] = a;
        int j = b;
        b = j + 1;
        return abyte0[j] & 0xff;
    }

    public final int d()
    {
        byte abyte0[] = a;
        int j = b;
        b = j + 1;
        j = abyte0[j];
        abyte0 = a;
        int k = b;
        b = k + 1;
        return (j & 0xff) << 8 | abyte0[k] & 0xff;
    }

    public final long e()
    {
        byte abyte0[] = a;
        int j = b;
        b = j + 1;
        long l = abyte0[j];
        abyte0 = a;
        j = b;
        b = j + 1;
        long l1 = abyte0[j];
        abyte0 = a;
        j = b;
        b = j + 1;
        long l2 = abyte0[j];
        abyte0 = a;
        j = b;
        b = j + 1;
        return (l & 255L) << 24 | (l1 & 255L) << 16 | (l2 & 255L) << 8 | (long)abyte0[j] & 255L;
    }

    public final int f()
    {
        byte abyte0[] = a;
        int j = b;
        b = j + 1;
        j = abyte0[j];
        abyte0 = a;
        int k = b;
        b = k + 1;
        k = abyte0[k];
        abyte0 = a;
        int l = b;
        b = l + 1;
        l = abyte0[l];
        abyte0 = a;
        int i1 = b;
        b = i1 + 1;
        return (j & 0xff) << 24 | (k & 0xff) << 16 | (l & 0xff) << 8 | abyte0[i1] & 0xff;
    }

    public final long g()
    {
        byte abyte0[] = a;
        int j = b;
        b = j + 1;
        long l = abyte0[j];
        abyte0 = a;
        j = b;
        b = j + 1;
        long l1 = abyte0[j];
        abyte0 = a;
        j = b;
        b = j + 1;
        long l2 = abyte0[j];
        abyte0 = a;
        j = b;
        b = j + 1;
        long l3 = abyte0[j];
        abyte0 = a;
        j = b;
        b = j + 1;
        long l4 = abyte0[j];
        abyte0 = a;
        j = b;
        b = j + 1;
        long l5 = abyte0[j];
        abyte0 = a;
        j = b;
        b = j + 1;
        long l6 = abyte0[j];
        abyte0 = a;
        j = b;
        b = j + 1;
        return (l & 255L) << 56 | (l1 & 255L) << 48 | (l2 & 255L) << 40 | (l3 & 255L) << 32 | (l4 & 255L) << 24 | (l5 & 255L) << 16 | (l6 & 255L) << 8 | (long)abyte0[j] & 255L;
    }

    public final int h()
    {
        int j = f();
        if (j < 0)
        {
            throw new IllegalStateException((new StringBuilder("Top bit not zero: ")).append(j).toString());
        } else
        {
            return j;
        }
    }

    public final long i()
    {
        long l = g();
        if (l < 0L)
        {
            throw new IllegalStateException((new StringBuilder("Top bit not zero: ")).append(l).toString());
        } else
        {
            return l;
        }
    }
}
