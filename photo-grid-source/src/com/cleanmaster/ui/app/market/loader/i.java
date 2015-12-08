// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.loader;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import com.cleanmaster.ui.app.market.c;
import com.cleanmaster.ui.app.market.data.MarketResponse;
import com.cleanmaster.ui.app.market.data.filter.a;
import com.cleanmaster.ui.app.market.storage.MarketStorage;
import com.cleanmaster.ui.app.market.transport.CmMarketHttpClient;
import com.cleanmaster.util.k;
import com.cleanmaster.util.s;
import com.picksinit.PicksMob;
import com.picksinit.b;
import java.net.URI;
import java.util.List;

// Referenced classes of package com.cleanmaster.ui.app.market.loader:
//            AsyncTaskEx, k, j

public abstract class i extends AsyncTaskEx
{

    private boolean a;
    protected com.cleanmaster.ui.app.market.transport.CmMarketHttpClient.MarketRequestBuilder b;
    protected String c;
    protected String d;
    private boolean f;
    private int g;
    private long h;

    public i(String s1)
    {
        d = "BaseMarketLoader";
        a = false;
        f = false;
        g = -1;
        b(s1);
    }

    static MarketResponse a(i i1, MarketResponse marketresponse)
    {
        return i1.f(marketresponse);
    }

    private MarketResponse f(MarketResponse marketresponse)
    {
        marketresponse.filter(com.cleanmaster.ui.app.market.data.filter.a.a().b());
        return marketresponse;
    }

    protected MarketResponse a(URI uri)
    {
        return CmMarketHttpClient.a().a(b.mPosId, uri);
    }

    protected transient MarketResponse a(Void avoid[])
    {
        h();
        if (f)
        {
            Process.setThreadPriority(10);
        }
        if (!i())
        {
            avoid = null;
        } else
        if (k())
        {
            c("  \u8BF7\u6C42\u7F51\u7EDC.........");
            a();
            MarketResponse marketresponse = a(a(b));
            avoid = marketresponse;
            if (marketresponse != null)
            {
                c("  \u4FDD\u5B58\u5230\u672C\u5730..........");
                avoid = marketresponse;
                if (a(marketresponse))
                {
                    com.cleanmaster.util.k.a().a(g(), marketresponse);
                    b(marketresponse);
                    a = false;
                    return marketresponse;
                }
            }
        } else
        {
            avoid = q();
            a = true;
            c("  \u4ECE\u7F13\u5B58\u4E2D\u52A0\u8F7D");
            return avoid;
        }
        return avoid;
    }

    protected volatile Object a(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected URI a(com.cleanmaster.ui.app.market.transport.CmMarketHttpClient.MarketRequestBuilder marketrequestbuilder)
    {
        return marketrequestbuilder.toURI();
    }

    protected void a()
    {
        l();
    }

    public void a(int i1)
    {
        g = i1;
    }

    protected void a(Object obj)
    {
        c((MarketResponse)obj);
    }

    protected void a(String s1)
    {
        d = s1;
    }

    public boolean a(MarketResponse marketresponse)
    {
        long l1 = MarketStorage.a().a(g(), marketresponse);
        return MarketStorage.a().a(g(), marketresponse.ads()) == marketresponse.ads().size() && l1 >= 0L;
    }

    protected long b()
    {
        if (g < 0)
        {
            g = com.cleanmaster.ui.app.market.c.a();
        }
        return (long)g;
    }

    protected void b(MarketResponse marketresponse)
    {
        n();
    }

    public void b(String s1)
    {
        c = s1;
    }

    protected final void c(MarketResponse marketresponse)
    {
        s.a(new com.cleanmaster.ui.app.market.loader.k(this, marketresponse));
    }

    protected void c(String s1)
    {
    }

    protected void d()
    {
    }

    public void d(MarketResponse marketresponse)
    {
    }

    public void e(MarketResponse marketresponse)
    {
    }

    protected String g()
    {
        return c;
    }

    protected com.cleanmaster.ui.app.market.transport.CmMarketHttpClient.MarketRequestBuilder h()
    {
        b = com.cleanmaster.ui.app.market.transport.CmMarketHttpClient.MarketRequestBuilder.CREATOR();
        b.posid(c);
        return b;
    }

    protected boolean i()
    {
        return true;
    }

    public boolean j()
    {
        return false;
    }

    protected boolean k()
    {
        return p() || j();
    }

    protected boolean l()
    {
        if (m() && MarketStorage.a().c(g()) > 0)
        {
            com.cleanmaster.util.k.a().b(g());
            (new Thread(new j(this))).start();
            return true;
        } else
        {
            return false;
        }
    }

    protected boolean m()
    {
        return true;
    }

    protected void n()
    {
        h = System.currentTimeMillis();
        PicksMob.getInstance().getContext().getSharedPreferences("market_config", 0).edit().putLong((new StringBuilder()).append(g()).append("_cache_time").toString(), h).commit();
    }

    protected long o()
    {
        if (h <= 0L)
        {
            h = PicksMob.getInstance().getContext().getSharedPreferences("market_config", 0).getLong((new StringBuilder()).append(g()).append("_cache_time").toString(), 0L);
        }
        return h;
    }

    protected boolean p()
    {
        long l2 = com.cleanmaster.ui.app.market.c.a(Long.valueOf(c));
        long l1 = l2;
        if (l2 == 0L)
        {
            long l3 = com.cleanmaster.ui.app.market.c.b(c);
            l1 = l3;
            if (l3 == 0L)
            {
                l1 = b();
            }
        }
        l1 = System.currentTimeMillis() - (l1 + o());
        c((new StringBuilder("  now=")).append(System.currentTimeMillis()).append(" last=").append(o()).append(" expire=").append(l1).toString());
        return l1 > 0L;
    }

    protected MarketResponse q()
    {
        MarketResponse marketresponse;
        if (p())
        {
            if (o() > 0L)
            {
                l();
            }
            marketresponse = null;
        } else
        {
            MarketResponse marketresponse2 = com.cleanmaster.util.k.a().a(g());
            marketresponse = marketresponse2;
            if (marketresponse2 == null)
            {
                MarketResponse marketresponse1 = new MarketResponse();
                List list = MarketStorage.a().a(g(), null, null, null);
                if (list.isEmpty())
                {
                    return null;
                } else
                {
                    marketresponse1.getHeader().a = 0;
                    marketresponse1.addAds(list);
                    marketresponse1.getHeader().c = list.size();
                    marketresponse1.getHeader().f = list.size();
                    com.cleanmaster.util.k.a().a(g(), marketresponse1);
                    return marketresponse1;
                }
            }
        }
        return marketresponse;
    }
}
