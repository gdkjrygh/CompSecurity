// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            cz, ia, iw

private final class d
    implements Runnable
{

    final cz a;
    private final ia b;
    private final iw c;
    private final Runnable d;

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

    public (cz cz1, ia ia1, iw iw1, Runnable runnable)
    {
        a = cz1;
        super();
        b = ia1;
        c = iw1;
        d = runnable;
    }
}
