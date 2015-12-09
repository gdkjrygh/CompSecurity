// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements Runnable
{

    private bmk a;
    private bnj b;

    public final void run()
    {
        if (!b.a.b())
        {
            b.a.c("Connected to service after a timeout");
            bni bni1 = b.a;
            bmk bmk = a;
            bnf.i();
            bni1.b = bmk;
            bni1.c();
            ((bnc) (bni1)).f.c().e();
        }
    }

    (bnj bnj1, bmk bmk)
    {
        b = bnj1;
        a = bmk;
        super();
    }
}
