// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bqo extends bxh
{

    private bqa a;

    transient bqo(bqa bqa1, bmb bmb, bxg abxg[])
    {
        a = bqa1;
        super(bmb, abxg);
    }

    public final void b()
    {
        boolean flag1 = false;
        c();
        if (bqa.j(a) && c.c.d && c.c.m && c.f() && c.c.z)
        {
            bqa.d(a, false);
            bqa.f(a);
        }
        brr brr1 = bqa.g(a);
        boolean flag = flag1;
        if (!c.c.z)
        {
            flag = flag1;
            if (!c.c.A)
            {
                flag = flag1;
                if (bqa.j(a))
                {
                    flag = true;
                }
            }
        }
        brr1.a("downloading", flag);
    }
}
