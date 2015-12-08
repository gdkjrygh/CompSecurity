// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.data;

import android.text.TextUtils;
import com.cleanmaster.ui.app.market.Ad;
import com.cleanmaster.ui.app.market.a;
import com.cleanmaster.ui.app.market.d;
import com.picksinit.PicksMob;
import com.picksinit.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.cleanmaster.ui.app.market.data:
//            a

public class MarketResponse
{

    private List ads;
    private com.cleanmaster.ui.app.market.data.a mHeader;

    public MarketResponse()
    {
        mHeader = new com.cleanmaster.ui.app.market.data.a();
        ads = new ArrayList();
    }

    public static MarketResponse fromJson(String s, String s1)
    {
        JSONObject jsonobject;
        jsonobject = null;
        if (TextUtils.isEmpty(s1))
        {
            return null;
        }
        MarketResponse marketresponse = new MarketResponse();
        s1 = new JSONObject(s1);
        marketresponse.setHeader((com.cleanmaster.ui.app.market.data.a)(new com.cleanmaster.ui.app.market.data.a()).a(s1));
        s1 = s1.optJSONArray("ads");
        if (s1 == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L8:
        if (i >= s1.length()) goto _L2; else goto _L3
_L3:
        jsonobject = s1.optJSONObject(i);
        if (jsonobject == null) goto _L5; else goto _L4
_L4:
        marketresponse.addAd(newAd(s).fromJSONObject(jsonobject));
          goto _L5
_L2:
        if (com.cleanmaster.ui.app.market.transport.CmMarketHttpClient.MarketRequestBuilder.isAppRequest(s))
        {
            d.a(marketresponse.ads());
        }
        return marketresponse;
        s1;
        s = jsonobject;
_L6:
        s1.printStackTrace();
        return s;
        s1;
        s = marketresponse;
        if (true) goto _L6; else goto _L5
_L5:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static MarketResponse fromJson2(String s)
    {
        JSONObject jsonobject;
        jsonobject = null;
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        Object obj = new MarketResponse();
        s = new JSONObject(s);
        ((MarketResponse) (obj)).setHeader((com.cleanmaster.ui.app.market.data.a)(new com.cleanmaster.ui.app.market.data.a()).a(s));
        s = s.getJSONArray("ads");
        if (s == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L3:
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject = s.getJSONObject(i);
        ((MarketResponse) (obj)).addAd((new Ad()).fromJSONObject(jsonobject));
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        return ((MarketResponse) (obj));
        obj;
        s = jsonobject;
_L5:
        ((JSONException) (obj)).printStackTrace();
        return s;
        JSONException jsonexception;
        jsonexception;
        s = ((String) (obj));
        obj = jsonexception;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static Ad newAd(String s)
    {
        if ("15001".equals(s))
        {
            return new a();
        } else
        {
            return new Ad();
        }
    }

    public void addAd(Ad ad)
    {
        if (ad == null)
        {
            return;
        } else
        {
            ads.add(ad);
            return;
        }
    }

    public void addAds(List list)
    {
        if (list != null)
        {
            ads.addAll(list);
        }
    }

    public int adn()
    {
        return mHeader.b;
    }

    public List ads()
    {
        return ads;
    }

    public int code()
    {
        return mHeader.a;
    }

    public List extAds()
    {
        return ads;
    }

    public void filter(com.cleanmaster.ui.app.market.data.filter.a a1)
    {
        Object obj = new ArrayList();
        Iterator iterator = ads.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Ad ad1 = (Ad)iterator.next();
            if (!ad1.match(a1))
            {
                ((List) (obj)).add(ad1);
            }
        } while (true);
        for (a1 = ((List) (obj)).iterator(); a1.hasNext(); ads.remove(obj))
        {
            obj = (Ad)a1.next();
        }

        a1 = ads.iterator();
        do
        {
            if (!a1.hasNext())
            {
                break;
            }
            Ad ad = (Ad)a1.next();
            if (!ad.isDeepLink() && com.cleanmaster.common.a.b(PicksMob.getInstance().getContext(), ad.getPkg()))
            {
                a1.remove();
            }
        } while (true);
    }

    public com.cleanmaster.ui.app.market.data.a getHeader()
    {
        return mHeader;
    }

    public int getShowRating()
    {
        return mHeader.d;
    }

    public int getShowType()
    {
        return mHeader.e;
    }

    public int offset()
    {
        return mHeader.c;
    }

    public void setHeader(com.cleanmaster.ui.app.market.data.a a1)
    {
        com.cleanmaster.ui.app.market.data.a a2 = a1;
        if (a1 == null)
        {
            a2 = new com.cleanmaster.ui.app.market.data.a();
        }
        mHeader = a2;
    }

    public boolean success()
    {
        return mHeader.a == 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(String.format("(MarketResponse %s", new Object[] {
            mHeader
        }));
        stringbuilder.append(":ads\n");
        if (ads != null)
        {
            for (Iterator iterator = ads.iterator(); iterator.hasNext(); stringbuilder.append(((com.cleanmaster.ui.app.market.b)iterator.next()).toString())) { }
        }
        stringbuilder.append(")");
        return stringbuilder.toString();
    }
}
