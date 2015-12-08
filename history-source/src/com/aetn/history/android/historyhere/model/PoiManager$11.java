// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import com.aetn.history.android.historyhere.utils.Utils;
import com.google.gson.Gson;
import java.util.ArrayList;

// Referenced classes of package com.aetn.history.android.historyhere.model:
//            PoiManager, PoiDetailResponse, POIDetail

class this._cls0
    implements com.android.volley.ner
{

    final PoiManager this$0;

    public volatile void onResponse(Object obj)
    {
        onResponse((String)obj);
    }

    public void onResponse(String s)
    {
        Utils.logger(PoiManager.access$200(PoiManager.this), (new StringBuilder()).append("setPOIDetailFromService: the response was: ").append(s).toString());
        if (s.indexOf("OK") < 0)
        {
            PoiManager.access$1500(PoiManager.this);
            return;
        } else
        {
            s = (PoiDetailResponse)(new Gson()).fromJson(s, com/aetn/history/android/historyhere/model/PoiDetailResponse);
            Utils.logger(PoiManager.access$200(PoiManager.this), (new StringBuilder()).append("setPOIDetailFromService: mPoiDetailResponse.results.size():").append(((PoiDetailResponse) (s)).results.size()).toString());
            setCurrentPOIDetail((POIDetail)((PoiDetailResponse) (s)).results.get(0));
            PoiManager.access$1600(PoiManager.this);
            return;
        }
    }

    nse()
    {
        this$0 = PoiManager.this;
        super();
    }
}
