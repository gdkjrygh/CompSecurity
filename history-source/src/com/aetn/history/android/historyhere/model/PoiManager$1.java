// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import android.content.Context;
import android.content.Intent;
import com.aetn.history.android.historyhere.utils.Utils;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.aetn.history.android.historyhere.model:
//            PoiManager, PoiResponse, POIDetail

class this._cls0
    implements com.android.volley.ener
{

    final PoiManager this$0;

    public volatile void onResponse(Object obj)
    {
        onResponse((String)obj);
    }

    public void onResponse(String s)
    {
        s = (PoiResponse)(new Gson()).fromJson(s, com/aetn/history/android/historyhere/model/PoiResponse);
        if (getCurrentPOIList() == null)
        {
            PoiManager.access$002(PoiManager.this, new ArrayList());
        }
        PoiManager.access$102(PoiManager.this, new ArrayList());
        if (((PoiResponse) (s)).results == null)
        {
            Utils.logger(PoiManager.access$200(PoiManager.this), (new StringBuilder()).append("getPoiList(): no results:").append(PoiManager.access$000(PoiManager.this).size()).toString());
            s = new Intent("poi_data_refreshed");
            PoiManager.access$300().sendBroadcast(s);
            return;
        }
        Utils.logger(PoiManager.access$200(PoiManager.this), (new StringBuilder()).append("getPoiList(): mCurrentPoiList()").append(PoiManager.access$000(PoiManager.this).size()).toString());
        s = ((PoiResponse) (s)).results.iterator();
        do
        {
            if (!s.hasNext())
            {
                break;
            }
            POIDetail poidetail = (POIDetail)s.next();
            if (!PoiManager.access$000(PoiManager.this).contains(poidetail))
            {
                PoiManager.access$000(PoiManager.this).add(poidetail);
                PoiManager.access$100(PoiManager.this).add(poidetail);
            }
        } while (true);
        PoiManager.access$400(PoiManager.this);
    }

    ()
    {
        this$0 = PoiManager.this;
        super();
    }
}
