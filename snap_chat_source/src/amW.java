// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class amW extends amT
{

    final alz a;
    private final int c;
    private final int d;

    public amW(alt alt1, alu alu1)
    {
        super(alt1, alu1);
        alz alz = alt1.d();
        int i;
        int j;
        if (alz == null)
        {
            a = null;
        } else
        {
            a = new anf(alz, alu1.x());
        }
        i = alt1.g();
        if (i >= 0)
        {
            i /= 100;
        } else
        {
            i = (i + 1) / 100 - 1;
        }
        j = alt1.h();
        if (j >= 0)
        {
            j /= 100;
        } else
        {
            j = (j + 1) / 100 - 1;
        }
        c = i;
        d = j;
    }

    public final int a(long l)
    {
        int i = super.b.a(l);
        if (i >= 0)
        {
            return i / 100;
        } else
        {
            return (i + 1) / 100 - 1;
        }
    }

    public final long a(long l, int i)
    {
        return super.b.a(l, i * 100);
    }

    public final long a(long l, long l1)
    {
        return super.b.a(l, 100L * l1);
    }

    public final int b(long l, long l1)
    {
        return super.b.b(l, l1) / 100;
    }

    public final long b(long l, int i)
    {
        amX.a(this, i, c, d);
        int j = super.b.a(l);
        if (j >= 0)
        {
            j %= 100;
        } else
        {
            j = (j + 1) % 100 + 99;
        }
        return super.b.b(l, j + i * 100);
    }

    public final long c(long l, long l1)
    {
        return super.b.c(l, l1) / 100L;
    }

    public final long d(long l)
    {
        alt alt1 = super.b;
        return alt1.d(alt1.b(l, a(l) * 100));
    }

    public final alz d()
    {
        return a;
    }

    public final long f(long l)
    {
        return b(l, a(super.b.f(l)));
    }

    public final int g()
    {
        return c;
    }

    public final int h()
    {
        return d;
    }
}
