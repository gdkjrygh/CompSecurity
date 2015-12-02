// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;


// Referenced classes of package com.android.volley:
//            f, Request, k

private class d
    implements Runnable
{

    final f a;
    private final Request b;
    private final k c;
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

    public est(f f1, Request request, k k1, Runnable runnable)
    {
        a = f1;
        super();
        b = request;
        c = k1;
        d = runnable;
    }
}
