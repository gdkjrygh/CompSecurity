// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hrb
    implements Runnable
{

    private hqv a;

    hrb(hqv hqv1)
    {
        a = hqv1;
        super();
    }

    public final void run()
    {
        if (hqv.j(a) == null)
        {
            return;
        }
        hqv hqv1 = a;
        int i;
        if (hqv.j(a).h.d() == 0.0F)
        {
            i = 0;
        } else
        {
            i = hqv.a(a, hqv.j(a).i);
        }
        hqv.a(hqv1, i, 0);
        hqv.a(a, null);
    }
}
