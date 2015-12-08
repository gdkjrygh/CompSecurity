// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import com.worklight.wlclient.api.WLErrorCode;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLRequestOptions;
import com.worklight.wlclient.api.WLResponse;
import com.worklight.wlclient.api.WLResponseListener;
import java.net.SocketTimeoutException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.worklight.wlclient:
//            HttpClientManager, WLAuthorizationManagerInternal

class CustomRequestSender
    implements Runnable
{

    HttpRequestBase httpRequest;
    WLResponseListener listener;
    int requestTimeoutInMilliseconds;

    protected CustomRequestSender(HttpRequestBase httprequestbase, int i, WLResponseListener wlresponselistener)
    {
        httpRequest = httprequestbase;
        requestTimeoutInMilliseconds = i;
        listener = wlresponselistener;
    }

    public void run()
    {
        Object obj = HttpClientManager.getInstance().getHttpClient();
        if (requestTimeoutInMilliseconds > 0)
        {
            HttpConnectionParams.setSoTimeout(((HttpClient) (obj)).getParams(), requestTimeoutInMilliseconds);
            HttpConnectionParams.setConnectionTimeout(((HttpClient) (obj)).getParams(), requestTimeoutInMilliseconds);
        }
        WLAuthorizationManagerInternal.getInstance().addClientIdHeaderToRequest(httpRequest);
        try
        {
            obj = new WLResponse(((HttpClient) (obj)).execute(httpRequest, HttpClientManager.getInstance().getHttpContext()));
        }
        catch (SocketTimeoutException sockettimeoutexception)
        {
            listener.onFailure(new WLFailResponse(WLErrorCode.REQUEST_TIMEOUT, WLErrorCode.REQUEST_TIMEOUT.getDescription(), new WLRequestOptions()));
            return;
        }
        catch (ConnectTimeoutException connecttimeoutexception)
        {
            listener.onFailure(new WLFailResponse(WLErrorCode.UNRESPONSIVE_HOST, WLErrorCode.UNRESPONSIVE_HOST.getDescription(), new WLRequestOptions()));
            return;
        }
        catch (Exception exception)
        {
            listener.onFailure(new WLFailResponse(WLErrorCode.UNEXPECTED_ERROR, WLErrorCode.UNEXPECTED_ERROR.getDescription(), new WLRequestOptions()));
            return;
        }
        listener.onSuccess(((WLResponse) (obj)));
    }
}
