// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.loader;

import com.cleanmaster.ui.app.market.storage.MarketStorage;

// Referenced classes of package com.cleanmaster.ui.app.market.loader:
//            i

final class j
    implements Runnable
{

    final i a;

    j(i k)
    {
        a = k;
        super();
    }

    public final void run()
    {
        try
        {
            MarketStorage.a().b(a.g());
            MarketStorage.a().a(a.g());
            return;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }
    }
}
