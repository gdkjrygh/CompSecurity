// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bqm extends bxh
{

    private bqa a;

    transient bqm(bqa bqa1, bmb bmb, bxg abxg[])
    {
        a = bqa1;
        super(bmb, abxg);
    }

    public final void b()
    {
        c();
        bqv bqv1 = (bqv)bqa.h(a).b;
        if (c.d())
        {
            if (bqv1 != null)
            {
                bqa.g(a).a("buffering", bqa.i(a));
                bqv1.b(bqa.i(a));
                bqv1.a(false, 0);
            }
        } else
        if (bqv1 != null)
        {
            bqa.g(a).a("buffering", false);
            bqv1.b(false);
            return;
        }
    }
}
