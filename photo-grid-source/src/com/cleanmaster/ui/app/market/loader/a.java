// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.loader;

import com.cleanmaster.ui.app.market.data.MarketResponse;
import java.net.URI;

// Referenced classes of package com.cleanmaster.ui.app.market.loader:
//            l

public class a extends l
{

    int a;
    private long h;

    public a(int i, int j, String s)
    {
        super(i, j, s);
        a = -1;
        h = 0L;
        a((new StringBuilder("BaseAppLoader/")).append(s).toString());
    }

    protected URI a(com.cleanmaster.ui.app.market.transport.CmMarketHttpClient.MarketRequestBuilder marketrequestbuilder)
    {
        if (a > 0)
        {
            marketrequestbuilder.g_pg(a);
        }
        return super.a(marketrequestbuilder);
    }

    protected void a()
    {
        super.a();
    }

    public boolean a(MarketResponse marketresponse)
    {
        return super.a(marketresponse);
    }

    protected long b()
    {
        if (0L != h)
        {
            return h;
        } else
        {
            return super.b();
        }
    }
}
