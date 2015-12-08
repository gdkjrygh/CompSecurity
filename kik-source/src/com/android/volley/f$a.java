// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;


// Referenced classes of package com.android.volley:
//            f, n, r

private final class d
    implements Runnable
{

    final f a;
    private final n b;
    private final r c;
    private final Runnable d;

    public final void run()
    {
        if (b.h())
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

    public (f f1, n n1, r r1, Runnable runnable)
    {
        a = f1;
        super();
        b = n1;
        c = r1;
        d = runnable;
    }
}
