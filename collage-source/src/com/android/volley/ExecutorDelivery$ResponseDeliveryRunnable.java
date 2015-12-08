// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;


// Referenced classes of package com.android.volley:
//            ExecutorDelivery, k, m

private class d
    implements Runnable
{

    final ExecutorDelivery a;
    private final k b;
    private final m c;
    private final Runnable d;

    public void run()
    {
        if (b.j())
        {
            b.b("canceled-at-delivery");
        } else
        {
            if (c.a())
            {
                b.b(c.a);
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

    public (ExecutorDelivery executordelivery, k k1, m m1, Runnable runnable)
    {
        a = executordelivery;
        super();
        b = k1;
        c = m1;
        d = runnable;
    }
}
