// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;

import android.os.Handler;
import android.os.Looper;
import com.mopub.common.logging.MoPubLog;
import com.mopub.volley.Request;
import com.mopub.volley.VolleyError;

// Referenced classes of package com.mopub.network:
//            RequestManager, h, g

public class ScribeRequestManager extends RequestManager
    implements ScribeRequest.Listener
{

    public ScribeRequestManager(Looper looper)
    {
        super(looper);
    }

    final Request a()
    {
        return ((ScribeRequest.ScribeRequestFactory)b).createRequest(this);
    }

    public void onErrorResponse(VolleyError volleyerror)
    {
        d.post(new h(this, volleyerror));
    }

    public void onResponse()
    {
        MoPubLog.d("Successfully scribed events");
        d.post(new g(this));
    }
}
