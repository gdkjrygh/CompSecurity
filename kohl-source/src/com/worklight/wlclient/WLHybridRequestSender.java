// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import com.worklight.common.Logger;
import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.worklight.wlclient:
//            HttpClientManager, WLHybridHttpListener

class WLHybridRequestSender
    implements Runnable
{

    private static Logger logger = Logger.getInstance("HttpPostRequestSender");
    HttpRequestBase httpRequest;
    WLHybridHttpListener listener;
    int requestTimeoutMs;

    protected WLHybridRequestSender(HttpRequestBase httprequestbase, int i, WLHybridHttpListener wlhybridhttplistener)
    {
        httpRequest = httprequestbase;
        requestTimeoutMs = i;
        listener = wlhybridhttplistener;
    }

    public void run()
    {
        logger.debug((new StringBuilder()).append("Sending request ").append(httpRequest.getURI()).toString());
        try
        {
            Object obj = HttpClientManager.getInstance().getHttpClient();
            org.apache.http.protocol.HttpContext httpcontext = HttpClientManager.getInstance().getHttpContext();
            HttpConnectionParams.setSoTimeout(((HttpClient) (obj)).getParams(), requestTimeoutMs);
            HttpConnectionParams.setConnectionTimeout(((HttpClient) (obj)).getParams(), requestTimeoutMs);
            ((HttpClient) (obj)).getParams().setParameter("http.useragent", HttpClientManager.getInstance().getWebViewUserAgent());
            obj = ((HttpClient) (obj)).execute(httpRequest, httpcontext);
            listener.onResponse(((org.apache.http.HttpResponse) (obj)));
            return;
        }
        catch (ClientProtocolException clientprotocolexception)
        {
            listener.onException(clientprotocolexception);
            return;
        }
        catch (IOException ioexception)
        {
            listener.onException(ioexception);
        }
    }

}
