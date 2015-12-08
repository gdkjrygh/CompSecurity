// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere;

import android.util.Log;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;

// Referenced classes of package com.aetn.history.android.historyhere:
//            HistoryHereApplication

class this._cls0
    implements com.android.volley.HereApplication._cls3
{

    final HistoryHereApplication this$0;

    public void onErrorResponse(VolleyError volleyerror)
    {
        if (volleyerror.networkResponse != null)
        {
            Log.d(HistoryHereApplication.access$100(), (new StringBuilder()).append("Error Response code: ").append(volleyerror.networkResponse.statusCode).toString());
        }
    }

    ()
    {
        this$0 = HistoryHereApplication.this;
        super();
    }
}
