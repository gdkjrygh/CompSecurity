// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere;

import com.android.volley.AuthFailureError;
import com.android.volley.toolbox.StringRequest;
import java.util.Map;

// Referenced classes of package com.aetn.history.android.historyhere:
//            HistoryHereApplication

class this._cls0 extends StringRequest
{

    final HistoryHereApplication this$0;

    public Map getHeaders()
        throws AuthFailureError
    {
        return createBasicAuthHeader("historyhereiosuser", ":}O/Wa}%");
    }

    (int i, String s, com.android.volley.HereApplication hereapplication, com.android.volley.HereApplication hereapplication1)
    {
        this$0 = HistoryHereApplication.this;
        super(i, s, hereapplication, hereapplication1);
    }
}
