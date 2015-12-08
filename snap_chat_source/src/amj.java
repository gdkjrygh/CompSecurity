// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class amj extends amY
{

    private amb b;

    amj(amb amb1)
    {
        super(alu.s(), amb1.Q());
        b = amb1;
    }

    public final int a(long l)
    {
        return b.a(l);
    }

    public final long a(long l, int i)
    {
        if (i == 0)
        {
            return l;
        }
        int j = a(l);
        int k = j + i;
        if ((j ^ k) < 0 && (j ^ i) >= 0)
        {
            throw new ArithmeticException((new StringBuilder("The calculation caused an overflow: ")).append(j).append(" + ").append(i).toString());
        } else
        {
            return b(l, k);
        }
    }

    public final long a(long l, long l1)
    {
        return a(l, amX.a(l1));
    }

    public final long b(long l, int i)
    {
        amX.a(this, i, b.N(), b.O());
        return b.d(l, i);
    }

    public final boolean b(long l)
    {
        return b.c(a(l));
    }

    public final long c(long l, long l1)
    {
        if (l < l1)
        {
            return -b.a(l1, l);
        } else
        {
            return b.a(l, l1);
        }
    }

    public final long d(long l)
    {
        return b.b(a(l));
    }

    public final long e(long l)
    {
        int i = a(l);
        long l1 = l;
        if (l != b.b(i))
        {
            l1 = b.b(i + 1);
        }
        return l1;
    }

    public final alz e()
    {
        return null;
    }

    public final long f(long l)
    {
        return l - d(l);
    }

    public final alz f()
    {
        return ((alZ) (b)).c;
    }

    public final int g()
    {
        return b.N();
    }

    public final int h()
    {
        return b.O();
    }
}
