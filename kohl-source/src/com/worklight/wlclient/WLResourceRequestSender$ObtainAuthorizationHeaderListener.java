// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import com.worklight.wlclient.api.WLAuthorizationException;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLHttpResponseListener;
import com.worklight.wlclient.api.WLResponse;
import com.worklight.wlclient.api.WLResponseListener;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.worklight.wlclient:
//            WLResourceRequestSender, AsynchronousRequestSender

private static class attempt
    implements WLResponseListener
{

    private int attempt;
    private WLHttpResponseListener listener;
    private HttpUriRequest request;

    public void onFailure(WLFailResponse wlfailresponse)
    {
        listener.onFailure(null, new WLAuthorizationException(wlfailresponse));
    }

    public void onSuccess(WLResponse wlresponse)
    {
        AsynchronousRequestSender.getInstance().sendWLResourceRequestAsync(request, listener, attempt + 1);
    }

    public (HttpUriRequest httpurirequest, WLHttpResponseListener wlhttpresponselistener, int i)
    {
        request = httpurirequest;
        listener = wlhttpresponselistener;
        attempt = i;
    }
}
