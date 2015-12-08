// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class amc extends anc
{

    private final amb b;

    amc(amb amb1, alz alz)
    {
        super(alu.m(), alz);
        b = amb1;
    }

    public final int a(long l)
    {
        amb amb1 = b;
        int i = amb1.a(l);
        return amb1.a(l, i, amb1.a(l, i));
    }

    public final int c(long l)
    {
        return b.f(l);
    }

    protected final int c(long l, int i)
    {
        return b.c(l, i);
    }

    public final alz e()
    {
        return ((alZ) (b)).f;
    }

    public final int g()
    {
        return 1;
    }

    public final int h()
    {
        return amb.M();
    }
}
