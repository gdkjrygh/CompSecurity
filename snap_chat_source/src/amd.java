// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class amd extends anc
{

    private final amb b;

    amd(amb amb1, alz alz)
    {
        super(alu.n(), alz);
        b = amb1;
    }

    public final int a(long l)
    {
        amb amb1 = b;
        return amb1.b(l, amb1.a(l));
    }

    public final int c(long l)
    {
        int i = b.a(l);
        return !b.c(i) ? 365 : 366;
    }

    protected final int c(long l, int i)
    {
        int j = 365;
        amb.L();
        if (i > 365 || i <= 0)
        {
            j = c(l);
        }
        return j;
    }

    public final alz e()
    {
        return ((alZ) (b)).g;
    }

    public final int g()
    {
        return 1;
    }

    public final int h()
    {
        return amb.L();
    }
}
