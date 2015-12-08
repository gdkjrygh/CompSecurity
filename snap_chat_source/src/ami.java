// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ami extends amY
{

    private final amb b;

    ami(amb amb1)
    {
        super(alu.p(), amb1.Q());
        b = amb1;
    }

    public final int a(long l)
    {
        return b.b(l);
    }

    public final long a(long l, int i)
    {
        if (i == 0)
        {
            return l;
        } else
        {
            return b(l, a(l) + i);
        }
    }

    public final long a(long l, long l1)
    {
        return a(l, amX.a(l1));
    }

    public final long b(long l, int i)
    {
        amX.a(this, Math.abs(i), b.N(), b.O());
        int j = a(l);
        if (j == i)
        {
            return l;
        }
        int i1 = amb.d(l);
        j = b.a(j);
        int k = b.a(i);
        if (k < j)
        {
            j = k;
        }
        k = b.c(l);
        long l1;
        if (k <= j)
        {
            j = k;
        }
        l1 = b.d(l, i);
        k = a(l1);
        if (k >= i) goto _L2; else goto _L1
_L1:
        l = l1 + 0x240c8400L;
_L4:
        l1 = j - b.c(l);
        return ((alZ) (b)).s.b(l1 * 0x240c8400L + l, i1);
_L2:
        l = l1;
        if (k > i)
        {
            l = l1 - 0x240c8400L;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean b(long l)
    {
        return b.a(b.b(l)) > 52;
    }

    public final long c(long l, long l1)
    {
        if (l < l1)
        {
            return (long)(-b(l1, l));
        }
        int i = a(l);
        int j = a(l1);
        long l2 = d(l);
        l1 -= d(l1);
        if (l1 >= 0x7528ad000L && b.a(i) <= 52)
        {
            l1 -= 0x240c8400L;
        }
        j = i - j;
        i = j;
        if (l - l2 < l1)
        {
            i = j - 1;
        }
        return (long)i;
    }

    public final long d(long l)
    {
        long l1 = ((alZ) (b)).v.d(l);
        int i = b.c(l1);
        l = l1;
        if (i > 1)
        {
            l = l1 - (long)(i - 1) * 0x240c8400L;
        }
        return l;
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
        return ((alZ) (b)).d;
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
