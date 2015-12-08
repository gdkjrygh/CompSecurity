// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.loader;

import android.content.Context;
import android.content.SharedPreferences;
import com.cleanmaster.ui.app.market.data.MarketResponse;
import com.picksinit.PicksMob;
import com.picksinit.b;
import java.net.URI;

// Referenced classes of package com.cleanmaster.ui.app.market.loader:
//            i

public class l extends i
{

    protected int f;
    protected int g;

    public l(int j, int i1, String s)
    {
        super(s);
        f = 0;
        g = 10;
        f = j;
        g = i1;
    }

    protected URI a(com.cleanmaster.ui.app.market.transport.CmMarketHttpClient.MarketRequestBuilder marketrequestbuilder)
    {
        marketrequestbuilder.pg(f);
        if (f == 0)
        {
            marketrequestbuilder.offset(0);
        } else
        {
            marketrequestbuilder.offset(r());
        }
        marketrequestbuilder.adn(g);
        return super.a(marketrequestbuilder);
    }

    protected final void b(int j)
    {
        PicksMob.getInstance().getContext().getSharedPreferences("market_config", 0).edit().putInt((new StringBuilder()).append(g()).append("_pageloader_offset").toString(), j).commit();
    }

    protected void b(MarketResponse marketresponse)
    {
        if (f == 0)
        {
            n();
        }
    }

    protected void d()
    {
        c((new StringBuilder("\u5F00\u59CB\u52A0\u8F7D  start=")).append(f).append(" mCount=").append(g).append(" mOffset=").append(r()).toString());
    }

    public void e(MarketResponse marketresponse)
    {
        b(marketresponse.offset());
    }

    protected boolean k()
    {
        return p() || f != 0;
    }

    protected boolean m()
    {
        return f == 0;
    }

    protected final int r()
    {
        return PicksMob.getInstance().getContext().getSharedPreferences("market_config", 0).getInt((new StringBuilder()).append(g()).append("_pageloader_offset").toString(), 0);
    }
}
