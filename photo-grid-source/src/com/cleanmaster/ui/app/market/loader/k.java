// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.loader;

import com.cleanmaster.ui.app.market.data.MarketResponse;

// Referenced classes of package com.cleanmaster.ui.app.market.loader:
//            i

final class k
    implements Runnable
{

    final MarketResponse a;
    final i b;

    k(i j, MarketResponse marketresponse)
    {
        b = j;
        a = marketresponse;
        super();
    }

    public final void run()
    {
        if (a == null)
        {
            b.d(a);
            return;
        }
        if (a.success())
        {
            b.e(i.a(b, a));
        } else
        {
            b.d(a);
        }
        b.c("\n\n");
    }
}
