// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import com.worklight.common.Logger;
import com.worklight.wlclient.api.WLErrorCode;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLRequestOptions;
import com.worklight.wlclient.api.WLResponse;
import java.net.SocketTimeoutException;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.worklight.wlclient:
//            WLRequest, HttpClientManager, WLNativeAPIUtils, WLRequestListener

class WLRequestSender
    implements Runnable
{

    private static final Logger logger = Logger.getInstance("wl.request");
    WLRequest request;

    protected WLRequestSender(WLRequest wlrequest)
    {
        request = wlrequest;
    }

    private void setConnectionTimeout(HttpClient httpclient)
    {
        HttpConnectionParams.setSoTimeout(httpclient.getParams(), request.getOptions().getTimeout());
        HttpConnectionParams.setConnectionTimeout(httpclient.getParams(), request.getOptions().getTimeout());
    }

    public void run()
    {
        logger.debug((new StringBuilder()).append("Sending request ").append(request.getURI()).toString());
        Object obj;
        obj = HttpClientManager.getInstance().getHttpClient();
        WLNativeAPIUtils.setUserAgentHeader(((HttpClient) (obj)));
        setConnectionTimeout(((HttpClient) (obj)));
        obj = new WLResponse(((HttpClient) (obj)).execute(request.getURIRequest(), HttpClientManager.getInstance().getHttpContext()));
        ((WLResponse) (obj)).setOptions(request.getOptions());
        request.requestFinished(((WLResponse) (obj)));
        if (request.getOptions() != null && request.getOptions().getResponseListener() != null)
        {
            synchronized (request.getOptions().getResponseListener())
            {
                request.getOptions().getResponseListener().notifyAll();
            }
        }
        break MISSING_BLOCK_LABEL_510;
        exception;
        wlresponselistener;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj1;
        obj1;
_L8:
        request.getRequestListener().onFailure(new WLFailResponse(WLErrorCode.REQUEST_TIMEOUT, WLErrorCode.REQUEST_TIMEOUT.getDescription(), request.getOptions()));
        if (request.getOptions() != null && request.getOptions().getResponseListener() != null)
        {
            synchronized (request.getOptions().getResponseListener())
            {
                request.getOptions().getResponseListener().notifyAll();
            }
            return;
        }
        break MISSING_BLOCK_LABEL_510;
        exception1;
        wlresponselistener1;
        JVM INSTR monitorexit ;
        throw exception1;
        wlresponselistener1;
_L6:
        request.getRequestListener().onFailure(new WLFailResponse(WLErrorCode.UNRESPONSIVE_HOST, WLErrorCode.UNRESPONSIVE_HOST.getDescription(), request.getOptions()));
        if (request.getOptions() != null && request.getOptions().getResponseListener() != null)
        {
            synchronized (request.getOptions().getResponseListener())
            {
                request.getOptions().getResponseListener().notifyAll();
            }
            return;
        }
        break MISSING_BLOCK_LABEL_510;
        exception2;
        wlresponselistener2;
        JVM INSTR monitorexit ;
        throw exception2;
        obj2;
_L4:
        ((Exception) (obj2)).printStackTrace();
        request.getRequestListener().onFailure(new WLFailResponse(WLErrorCode.UNEXPECTED_ERROR, WLErrorCode.UNEXPECTED_ERROR.getDescription(), request.getOptions()));
        if (request.getOptions() != null && request.getOptions().getResponseListener() != null)
        {
            synchronized (request.getOptions().getResponseListener())
            {
                request.getOptions().getResponseListener().notifyAll();
            }
            return;
        }
        break MISSING_BLOCK_LABEL_510;
        exception3;
        obj2;
        JVM INSTR monitorexit ;
        throw exception3;
        obj2;
_L2:
        if (request.getOptions() != null && request.getOptions().getResponseListener() != null)
        {
            synchronized (request.getOptions().getResponseListener())
            {
                request.getOptions().getResponseListener().notifyAll();
            }
        }
        throw obj2;
        obj2;
        wlresponselistener3;
        JVM INSTR monitorexit ;
        throw obj2;
        obj2;
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
        if (true) goto _L6; else goto _L5
_L5:
        obj2;
        if (true) goto _L8; else goto _L7
_L7:
    }

}
