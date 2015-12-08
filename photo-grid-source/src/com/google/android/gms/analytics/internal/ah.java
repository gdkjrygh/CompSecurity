// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            ag, ae, e

final class ah
    implements Runnable
{

    final e a;
    final ag b;

    ah(ag ag1, e e)
    {
        b = ag1;
        a = e;
        super();
    }

    public final void run()
    {
        if (!b.a.b())
        {
            b.a.c("Connected to service after a timeout");
            ae.a(b.a, a);
        }
    }
}
