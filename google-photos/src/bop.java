// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bop
    implements bqt
{

    private boj a;

    bop(boj boj1)
    {
        a = boj1;
        super();
    }

    public final void a()
    {
        boj.c(a).f();
    }

    public final void b()
    {
        boj.d(a).b();
    }

    public final void c()
    {
        if (boj.e(a) != null)
        {
            bne bne1 = boj.e(a);
            bne1.e = true;
            if (bne1.c.x() == bxd.c)
            {
                bne1.a.b();
            } else
            if (bne1.c.b.a == bxf.d)
            {
                bne1.b();
                return;
            }
        }
    }
}
