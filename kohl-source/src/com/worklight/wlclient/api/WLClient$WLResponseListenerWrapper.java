// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import java.net.SocketTimeoutException;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

// Referenced classes of package com.worklight.wlclient.api:
//            WLHttpResponseListener, WLClient, WLFailResponse, WLResponseListener, 
//            WLAuthorizationException, WLErrorCode, WLResponse

static class listener
    implements WLHttpResponseListener
{

    private WLResponseListener listener;

    public void onFailure(HttpResponse httpresponse, Exception exception)
    {
        if (httpresponse != null)
        {
            listener.onFailure(new WLFailResponse(httpresponse));
            return;
        }
        if (exception instanceof WLAuthorizationException)
        {
            listener.onFailure(((WLAuthorizationException)exception).getWLFailResponse());
            return;
        }
        if (exception instanceof SocketTimeoutException)
        {
            listener.onFailure(new WLFailResponse(WLErrorCode.REQUEST_TIMEOUT, WLErrorCode.REQUEST_TIMEOUT.getDescription(), null));
            return;
        }
        if (exception instanceof ConnectTimeoutException)
        {
            listener.onFailure(new WLFailResponse(WLErrorCode.UNRESPONSIVE_HOST, WLErrorCode.UNRESPONSIVE_HOST.getDescription(), null));
            return;
        } else
        {
            listener.onFailure(new WLFailResponse(WLErrorCode.UNEXPECTED_ERROR, WLErrorCode.UNEXPECTED_ERROR.getDescription(), null));
            return;
        }
    }

    public void onSuccess(HttpResponse httpresponse)
    {
        listener.onSuccess(new WLResponse(httpresponse));
    }

    public (WLResponseListener wlresponselistener)
    {
        listener = wlresponselistener;
    }
}
