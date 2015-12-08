// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.k;


// Referenced classes of package p.k:
//            e, l, n

private class d
    implements Runnable
{

    final e a;
    private final l b;
    private final n c;
    private final Runnable d;

    public void run()
    {
        if (b.h())
        {
            b.b("canceled-at-delivery");
        } else
        {
            if (c.a())
            {
                b.a(c.a);
            } else
            {
                b.b(c.c);
            }
            if (c.d)
            {
                b.a("intermediate-response");
            } else
            {
                b.b("done");
            }
            if (d != null)
            {
                d.run();
                return;
            }
        }
    }

    public g.Runnable(e e1, l l1, n n1, Runnable runnable)
    {
        a = e1;
        super();
        b = l1;
        c = n1;
        d = runnable;
    }
}
