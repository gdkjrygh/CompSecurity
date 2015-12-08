// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            tj, vo, hx

final class hz
    implements Runnable
{

    final hx a;
    private final tj b;
    private final vo c;
    private final Runnable d;

    public hz(hx hx, tj tj1, vo vo1, Runnable runnable)
    {
        a = hx;
        super();
        b = tj1;
        c = vo1;
        d = runnable;
    }

    public final void run()
    {
        if (b.g())
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
}
