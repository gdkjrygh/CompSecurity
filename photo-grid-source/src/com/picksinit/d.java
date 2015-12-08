// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.picksinit;

import android.util.Log;
import com.cleanmaster.ui.app.market.Ad;
import com.cleanmaster.ui.app.market.data.MarketResponse;
import com.cleanmaster.ui.app.market.loader.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.picksinit:
//            ICallBack, ErrorInfo, b, PicksMob

final class d extends a
{

    final ICallBack h;
    final int i;
    final int j;
    final int k;
    final b l;

    d(b b1, int i1, int j1, String s, ICallBack icallback, int k1, int l1, 
            int i2)
    {
        l = b1;
        h = icallback;
        i = k1;
        j = l1;
        k = i2;
        super(i1, j1, s);
    }

    protected final void d()
    {
        super.d();
        if (h != null)
        {
            h.onPreExecute();
        }
    }

    public final void d(MarketResponse marketresponse)
    {
label0:
        {
            if (h != null)
            {
                if (marketresponse != null)
                {
                    break label0;
                }
                h.onLoadError(new ErrorInfo(400, "ad is no filled", i));
            }
            return;
        }
        h.onLoadError(new ErrorInfo(401, "ad data is null, but request status is right", i));
    }

    public final void e(MarketResponse marketresponse)
    {
        super.e(marketresponse);
        if (marketresponse != null) goto _L2; else goto _L1
_L1:
        h.onLoadError(new ErrorInfo(400, "ad is no filled", i));
_L4:
        return;
_L2:
        ArrayList arraylist;
        arraylist = new ArrayList();
        if (marketresponse.ads() == null || marketresponse.ads().size() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        arraylist.addAll(marketresponse.ads());
        b.access$000(l, arraylist);
        if (PicksMob.getInstance().isDebug())
        {
            if (arraylist.size() <= 0)
            {
                Log.e("picks sdk", "ad size is zero");
            }
            for (marketresponse = arraylist.iterator(); marketresponse.hasNext(); Log.e("picks sdk", ((Ad)marketresponse.next()).toJson().toString())) { }
        }
        if (h == null) goto _L4; else goto _L3
_L3:
        if (arraylist.size() > 0)
        {
            h.onLoadSuccess(arraylist);
            return;
        } else
        {
            h.onLoadError(new ErrorInfo(401, "ad data is filtered, please use setConfig to warn", i));
            return;
        }
        if (h == null) goto _L4; else goto _L5
_L5:
        h.onLoadError(new ErrorInfo(401, "ad data is zero, but request status is right", i));
        return;
    }

    protected final com.cleanmaster.ui.app.market.transport.CmMarketHttpClient.MarketRequestBuilder h()
    {
        com.cleanmaster.ui.app.market.transport.CmMarketHttpClient.MarketRequestBuilder marketrequestbuilder = super.h();
        if (j > 0 && k > 0)
        {
            marketrequestbuilder.w(j).h(k);
        }
        return marketrequestbuilder;
    }
}
