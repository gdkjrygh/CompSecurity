// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bql extends bxh
{

    private bqa a;

    transient bql(bqa bqa1, bmb bmb, bxg abxg[])
    {
        a = bqa1;
        super(bmb, abxg);
    }

    public final void b()
    {
        boolean flag = true;
        c();
        bww bww1 = c;
        bww1.c.i = false;
        bww1.a(0L);
        if (c.c.d)
        {
            if (c.c.e != null && bqa.c(a) != c.c.e.h)
            {
                bqa.c(a, true);
                bqa.b(a, c.c.e.h);
            }
            brr brr1;
            if (c.c.e != null && !b.g())
            {
                if (bqa.d(a) != null)
                {
                    bqa.d(a).cancel(true);
                }
                bqa.a(a, new bqx(a));
                bqa.e(a).a(bqa.d(a), new cqf[] {
                    c.c.e
                });
            } else
            {
                bqa.f(a);
            }
        }
        brr1 = bqa.g(a);
        if (c.c.d)
        {
            flag = false;
        }
        brr1.a("storyboard", flag);
    }
}
