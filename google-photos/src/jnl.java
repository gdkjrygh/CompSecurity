// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jnl
{

    public byte a[];
    public int b;
    public int c;

    public jnl()
    {
    }

    public jnl(int l)
    {
        a = new byte[l];
        c = a.length;
    }

    public jnl(byte abyte0[])
    {
        a = abyte0;
        c = abyte0.length;
    }

    public jnl(byte abyte0[], int l)
    {
        a = abyte0;
        c = l;
    }

    public final void a()
    {
        b = 0;
        c = 0;
    }

    public final void a(int l)
    {
        boolean flag;
        if (l >= 0 && l <= a.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag);
        c = l;
    }

    public final void a(jnk jnk1, int l)
    {
        a(jnk1.a, 0, l);
        jnk1.a(0);
    }

    public final void a(byte abyte0[], int l)
    {
        a = abyte0;
        c = l;
        b = 0;
    }

    public final void a(byte abyte0[], int l, int i1)
    {
        System.arraycopy(a, b, abyte0, l, i1);
        b = b + i1;
    }

    public final int b()
    {
        return c - b;
    }

    public final void b(int l)
    {
        boolean flag;
        if (l >= 0 && l <= c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag);
        b = l;
    }

    public final int c()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.length;
        }
    }

    public final void c(int l)
    {
        b(b + l);
    }

    public final int d()
    {
        byte abyte0[] = a;
        int l = b;
        b = l + 1;
        return abyte0[l] & 0xff;
    }

    public final int e()
    {
        byte abyte0[] = a;
        int l = b;
        b = l + 1;
        l = abyte0[l];
        abyte0 = a;
        int i1 = b;
        b = i1 + 1;
        return (l & 0xff) << 8 | abyte0[i1] & 0xff;
    }

    public final int f()
    {
        byte abyte0[] = a;
        int l = b;
        b = l + 1;
        l = abyte0[l];
        abyte0 = a;
        int i1 = b;
        b = i1 + 1;
        i1 = abyte0[i1];
        abyte0 = a;
        int j1 = b;
        b = j1 + 1;
        return (l & 0xff) << 16 | (i1 & 0xff) << 8 | abyte0[j1] & 0xff;
    }

    public final long g()
    {
        byte abyte0[] = a;
        int l = b;
        b = l + 1;
        long l1 = abyte0[l];
        abyte0 = a;
        l = b;
        b = l + 1;
        long l2 = abyte0[l];
        abyte0 = a;
        l = b;
        b = l + 1;
        long l3 = abyte0[l];
        abyte0 = a;
        l = b;
        b = l + 1;
        return (l1 & 255L) << 24 | (l2 & 255L) << 16 | (l3 & 255L) << 8 | (long)abyte0[l] & 255L;
    }

    public final int h()
    {
        byte abyte0[] = a;
        int l = b;
        b = l + 1;
        l = abyte0[l];
        abyte0 = a;
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
        return (l & 0xff) << 24 | (i1 & 0xff) << 16 | (j1 & 0xff) << 8 | abyte0[k1] & 0xff;
    }

    public final long i()
    {
        byte abyte0[] = a;
        int l = b;
        b = l + 1;
        long l1 = abyte0[l];
        abyte0 = a;
        l = b;
        b = l + 1;
        long l2 = abyte0[l];
        abyte0 = a;
        l = b;
        b = l + 1;
        long l3 = abyte0[l];
        abyte0 = a;
        l = b;
        b = l + 1;
        long l4 = abyte0[l];
        abyte0 = a;
        l = b;
        b = l + 1;
        long l5 = abyte0[l];
        abyte0 = a;
        l = b;
        b = l + 1;
        long l6 = abyte0[l];
        abyte0 = a;
        l = b;
        b = l + 1;
        long l7 = abyte0[l];
        abyte0 = a;
        l = b;
        b = l + 1;
        return (l1 & 255L) << 56 | (l2 & 255L) << 48 | (l3 & 255L) << 40 | (l4 & 255L) << 32 | (l5 & 255L) << 24 | (l6 & 255L) << 16 | (l7 & 255L) << 8 | (long)abyte0[l] & 255L;
    }

    public final int j()
    {
        int l = h();
        if (l < 0)
        {
            throw new IllegalStateException((new StringBuilder(29)).append("Top bit not zero: ").append(l).toString());
        } else
        {
            return l;
        }
    }

    public final long k()
    {
        long l = i();
        if (l < 0L)
        {
            throw new IllegalStateException((new StringBuilder(38)).append("Top bit not zero: ").append(l).toString());
        } else
        {
            return l;
        }
    }
}
