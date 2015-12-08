// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;


// Referenced classes of package com.android.volley:
//            d, Request, i

private final class d
    implements Runnable
{

    final d a;
    private final Request b;
    private final i c;
    private final Runnable d;

    public final void run()
    {
        if (b.h)
        {
            b.b("canceled-at-delivery");
        } else
        {
            boolean flag;
            if (c.c == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
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

    public est(d d1, Request request, i j, Runnable runnable)
    {
        a = d1;
        super();
        b = request;
        c = j;
        d = runnable;
    }
}
