// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bot
    implements cet
{

    private boj a;

    bot(boj boj1)
    {
        a = boj1;
        super();
    }

    public final void a()
    {
        bnm bnm1 = boj.d(a);
        if (bnm1.c.b.a == bxf.h)
        {
            bnm1.c.a(bxd.b);
            bnm1.b = true;
            bnm1.b();
            return;
        } else
        {
            bnm1.c.a(bxf.b);
            bnm1.b = true;
            bnm1.d();
            return;
        }
    }

    public final boolean b()
    {
        bxf bxf1 = a.c.b.a;
        boolean flag;
        if (bxf1 == bxf.h || bxf1 == bxf.g || bxf1 == bxf.i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return !flag;
    }
}
