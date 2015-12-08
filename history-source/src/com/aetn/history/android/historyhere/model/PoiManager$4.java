// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import com.aetn.history.android.historyhere.utils.Utils;
import com.android.volley.VolleyError;

// Referenced classes of package com.aetn.history.android.historyhere.model:
//            PoiManager

class this._cls0
    implements com.android.volley.rListener
{

    final PoiManager this$0;

    public void onErrorResponse(VolleyError volleyerror)
    {
        Utils.logger(PoiManager.access$200(PoiManager.this), (new StringBuilder()).append("loadFullPoiListFromDataDump: signedRequest: error: ").append(volleyerror).toString());
    }

    ()
    {
        this$0 = PoiManager.this;
        super();
    }
}
