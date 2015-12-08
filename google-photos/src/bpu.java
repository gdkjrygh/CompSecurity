// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bpu extends bto
{

    private bps a;

    bpu(bps bps1, bmb bmb, Class class1)
    {
        a = bps1;
        super(bmb, class1);
    }

    protected final void a(Object obj)
    {
        obj = (bpx)obj;
        c();
        ((bpx) (obj)).a(null);
    }

    protected final void b(Object obj)
    {
        obj = (bpx)obj;
        c();
        ((bpx) (obj)).a(a.b);
        bps.a(a, ((bpx) (obj)));
    }
}
