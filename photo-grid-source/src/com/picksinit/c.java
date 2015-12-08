// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.picksinit;

import com.cleanmaster.ui.app.market.transport.CmMarketHttpClient;

// Referenced classes of package com.picksinit:
//            b

final class c
    implements Runnable
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public final void run()
    {
        CmMarketHttpClient.a().a(a.getMid());
    }
}
