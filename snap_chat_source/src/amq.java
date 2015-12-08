// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class amq extends amT
{

    private final amb a;

    amq(alt alt1, amb amb1)
    {
        super(alt1, alu.t());
        a = amb1;
    }

    public final int a(long l)
    {
        int j = super.b.a(l);
        int i = j;
        if (j <= 0)
        {
            i = 1 - j;
        }
        return i;
    }

    public final long a(long l, int i)
    {
        return super.b.a(l, i);
    }

    public final long a(long l, long l1)
    {
        return super.b.a(l, l1);
    }

    public final int b(long l, long l1)
    {
        return super.b.b(l, l1);
    }

    public final long b(long l, int i)
    {
        amX.a(this, i, 1, super.b.h());
        int j = i;
        if (a.a(l) <= 0)
        {
            j = 1 - i;
        }
        return super.b(l, j);
    }

    public final long c(long l, long l1)
    {
        return super.b.c(l, l1);
    }

    public final long d(long l)
    {
        return super.b.d(l);
    }

    public final long e(long l)
    {
        return super.b.e(l);
    }

    public final long f(long l)
    {
        return super.b.f(l);
    }

    public final int g()
    {
        return 1;
    }

    public final int h()
    {
        return super.b.h();
    }
}
