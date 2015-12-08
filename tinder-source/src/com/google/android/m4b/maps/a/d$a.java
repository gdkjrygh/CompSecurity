// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.a;


// Referenced classes of package com.google.android.m4b.maps.a:
//            d, k, m

final class c
    implements Runnable
{

    private final k a;
    private final m b;
    private final Runnable c;
    private d d;

    public final void run()
    {
        if (!a.h) goto _L2; else goto _L1
_L1:
        a.b("canceled-at-delivery");
_L5:
        return;
_L2:
        if (!b.a()) goto _L4; else goto _L3
_L3:
        a.a(b.a);
_L6:
        k k1;
        r r;
        if (b.d)
        {
            a.a("intermediate-response");
        } else
        {
            a.b("done");
        }
        if (c != null)
        {
            c.run();
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
        k1 = a;
        r = b.c;
        if (k1.d != null)
        {
            k1.d.a(r);
        }
          goto _L6
    }

    public (d d1, k k1, m m1, Runnable runnable)
    {
        d = d1;
        super();
        a = k1;
        b = m1;
        c = runnable;
    }
}
