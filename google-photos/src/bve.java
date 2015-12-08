// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bve
    implements Runnable
{

    private bvd a;

    bve(bvd bvd1)
    {
        a = bvd1;
        super();
    }

    public final void run()
    {
        if (bvd.h(a))
        {
            bvd.j(a).a(bvd.i(a));
            return;
        } else
        {
            bus bus1 = bvd.j(a);
            bvd.k(a);
            bus1.a();
            return;
        }
    }
}
