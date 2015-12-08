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
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.worklight.wlclient:
//            HttpClientManager, WLAuthorizationManagerInternal

public class CacheableInvokeRequestSender
    implements Runnable
{

    HttpRequestBase httpRequest;
    WLRequestOptions requestOptions;

    protected CacheableInvokeRequestSender(HttpRequestBase httprequestbase, WLRequestOptions wlrequestoptions)
    {
        httpRequest = httprequestbase;
        requestOptions = wlrequestoptions;
    }

    public void run()
    {
        WLResponseListener wlresponselistener;
        Object obj;
        obj = HttpClientManager.getInstance().getHttpCacheableInvokeClient();
        int i = requestOptions.getTimeout();
        if (i > 0)
        {
            HttpConnectionParams.setSoTimeout(((DefaultHttpClient) (obj)).getParams(), i);
            HttpConnectionParams.setConnectionTimeout(((DefaultHttpClient) (obj)).getParams(), i);
        }
        WLAuthorizationManagerInternal.getInstance().addClientIdHeaderToRequest(httpRequest);
        wlresponselistener = requestOptions.getResponseListener();
        org.apache.http.HttpResponse httpresponse = ((DefaultHttpClient) (obj)).execute(httpRequest);
        ((DefaultHttpClient) (obj)).getCookieStore().clear();
        obj = new WLResponse(httpresponse);
        ((WLResponse) (obj)).setOptions(requestOptions);
        wlresponselistener.onSuccess(((WLResponse) (obj)));
        return;
        Object obj1;
        obj1;
_L6:
        wlresponselistener.onFailure(new WLFailResponse(WLErrorCode.REQUEST_TIMEOUT, WLErrorCode.REQUEST_TIMEOUT.getDescription(), requestOptions));
        return;
        obj1;
_L4:
        wlresponselistener.onFailure(new WLFailResponse(WLErrorCode.UNRESPONSIVE_HOST, WLErrorCode.UNRESPONSIVE_HOST.getDescription(), requestOptions));
        return;
        obj1;
_L2:
        wlresponselistener.onFailure(new WLFailResponse(WLErrorCode.UNEXPECTED_ERROR, WLErrorCode.UNEXPECTED_ERROR.getDescription(), requestOptions));
        return;
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
