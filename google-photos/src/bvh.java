// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bvh
    implements Runnable
{

    private bvd a;

    bvh(bvd bvd1)
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
            bvd.j(a).b();
            return;
        }
    }
}
