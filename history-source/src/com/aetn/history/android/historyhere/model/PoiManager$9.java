// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import com.aetn.history.android.historyhere.utils.Utils;
import com.google.gson.Gson;

// Referenced classes of package com.aetn.history.android.historyhere.model:
//            PoiManager, PoiResponse

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
        Utils.logger(PoiManager.access$200(PoiManager.this), (new StringBuilder()).append("getTourPOIDetailFromService: the response was: ").append(s).toString());
        if (s.indexOf("OK") < 0)
        {
            PoiManager.access$1200(PoiManager.this);
            return;
        } else
        {
            s = ((PoiResponse)(new Gson()).fromJson(s, com/aetn/history/android/historyhere/model/PoiResponse)).results;
            PoiManager.access$1302(PoiManager.this, s);
            PoiManager.access$1400(PoiManager.this);
            return;
        }
    }

    ()
    {
        this$0 = PoiManager.this;
        super();
    }
}
