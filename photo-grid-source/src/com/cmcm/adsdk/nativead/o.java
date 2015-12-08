// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.nativead;

import com.cmcm.adsdk.b.c.b;

// Referenced classes of package com.cmcm.adsdk.nativead:
//            g, n

final class o
    implements g
{

    final n a;

    o(n n1)
    {
        a = n1;
        super();
    }

    public final void a()
    {
        b.a("CMPicksNativeAd", "picks trySendImpression");
        if (n.d(a))
        {
            a.l();
            n.c(a);
            com.cmcm.adsdk.nativead.n.b(a);
        }
    }
}
