// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.b;


// Referenced classes of package com.android.b:
//            q, v, g

class i
    implements Runnable
{

    final g a;
    private final q b;
    private final v c;
    private final Runnable d;

    public i(g g, q q1, v v1, Runnable runnable)
    {
        a = g;
        super();
        b = q1;
        c = v1;
        d = runnable;
    }

    public void run()
    {
        if (b.g())
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
}
