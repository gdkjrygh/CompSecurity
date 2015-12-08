// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lrr
    implements Runnable
{

    private lrp a;
    private long b;
    private String c;
    private lrq d;

    lrr(lrq lrq1, lrp lrp, long l, String s)
    {
        d = lrq1;
        a = lrp;
        b = l;
        c = s;
        super();
    }

    public final void run()
    {
        if (lrq.a(d) == null)
        {
            lqm lqm1 = lqm.a();
            lqm1.a(lrq.b(d), a);
            lrq.a(d, lqm1.b());
        }
        lrq.a(d).a(b, c);
    }
}
