// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            z, v, s, n, 
//            e

final class B
    implements Runnable
{

    final e a;
    final z.a b;

    B(z.a a1, e e)
    {
        b = a1;
        a = e;
        super();
    }

    public final void run()
    {
        if (!b.a.b())
        {
            b.a.c("Connected to service after a timeout");
            z z1 = b.a;
            e e = a;
            v.g();
            z1.b = e;
            z1.c();
            ((s) (z1)).i.c().d();
        }
    }
}
