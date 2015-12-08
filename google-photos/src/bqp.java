// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bqp extends bxh
{

    private bqa a;

    transient bqp(bqa bqa1, bmb bmb, bxg abxg[])
    {
        a = bqa1;
        super(bmb, abxg);
    }

    public final void b()
    {
        c();
        bqa.a(a).a(bqa.k(a));
        bqv bqv1 = (bqv)bqa.h(a).b;
        boolean flag;
        if (c.b.a == bxf.d || c.b.a == bxf.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bqv1.c_(flag);
    }
}
