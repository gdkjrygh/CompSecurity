// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import com.worklight.common.Logger;
import com.worklight.wlclient.api.WLAuthorizationException;
import com.worklight.wlclient.api.WLErrorCode;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLHttpResponseListener;
import com.worklight.wlclient.api.WLResponse;
import com.worklight.wlclient.api.WLResponseListener;
import java.io.InputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;

// Referenced classes of package com.worklight.wlclient:
//            HttpClientManager, WLNativeAPIUtils, WLAuthorizationManagerInternal, AsynchronousRequestSender

public class WLResourceRequestSender
    implements Runnable
{
    private static class ObtainAuthorizationHeaderListener
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

        public ObtainAuthorizationHeaderListener(HttpUriRequest httpurirequest, WLHttpResponseListener wlhttpresponselistener, int i)
        {
            request = httpurirequest;
            listener = wlhttpresponselistener;
            attempt = i;
        }
    }


    private static final int MAX_RETRY_COUNT = 3;
    private static final Logger logger = Logger.getInstance("wl.resource_request");
    private int attempt;
    private WLHttpResponseListener listener;
    private HttpUriRequest request;

    protected WLResourceRequestSender(HttpUriRequest httpurirequest, WLHttpResponseListener wlhttpresponselistener, int i)
    {
        request = httpurirequest;
        listener = wlhttpresponselistener;
        attempt = i;
    }

    private boolean responseSucceded(HttpResponse httpresponse)
    {
        int i = httpresponse.getStatusLine().getStatusCode();
        return i >= 200 && i <= 299;
    }

    public void run()
    {
        Object obj;
        Object obj1;
        logger.debug((new StringBuilder()).append("Sending request ").append(request.getURI()).toString());
        obj1 = null;
        obj = obj1;
        org.apache.http.impl.client.DefaultHttpClient defaulthttpclient = HttpClientManager.getInstance().getHttpClient();
        obj = obj1;
        WLNativeAPIUtils.setUserAgentHeader(defaulthttpclient);
        obj = obj1;
        WLAuthorizationManagerInternal.getInstance().addCachedAuthorizationHeader(request);
        obj = obj1;
        org.apache.http.protocol.HttpContext httpcontext = HttpClientManager.getInstance().getHttpContext();
        obj = obj1;
        obj1 = defaulthttpclient.execute(request, httpcontext);
        obj = obj1;
        if (responseSucceded(((HttpResponse) (obj1))))
        {
            obj = obj1;
            String s;
            try
            {
                listener.onSuccess(((HttpResponse) (obj1)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            break MISSING_BLOCK_LABEL_188;
        }
        obj = obj1;
        if (!WLAuthorizationManagerInternal.getInstance().isAuthorizationRequired(((HttpResponse) (obj1))))
        {
            break MISSING_BLOCK_LABEL_285;
        }
        obj = obj1;
        if (attempt >= 3)
        {
            break MISSING_BLOCK_LABEL_218;
        }
        obj = obj1;
        s = WLAuthorizationManagerInternal.getInstance().getAuthorizationScope(((HttpResponse) (obj1)));
        obj = obj1;
        ((HttpResponse) (obj1)).getEntity().getContent().close();
        obj = obj1;
        WLAuthorizationManagerInternal.getInstance().obtainAuthorizationHeader(s, new ObtainAuthorizationHeaderListener(request, listener, attempt));
        return;
        WLFailResponse wlfailresponse;
        if (obj != null)
        {
            try
            {
                ((HttpResponse) (obj)).getEntity().getContent().close();
            }
            catch (Exception exception) { }
        }
        listener.onFailure(null, ((Exception) (obj1)));
        return;
        obj = obj1;
        wlfailresponse = new WLFailResponse(WLErrorCode.AUTHORIZATION_FAILURE, (new StringBuilder()).append("Cannot retrieve a valid authorization header for ").append(request.getURI()).append(". Check resource and authorization server configuration.").toString(), null);
        obj = obj1;
        listener.onFailure(null, new WLAuthorizationException(wlfailresponse));
        return;
        obj = obj1;
        listener.onFailure(((HttpResponse) (obj1)), null);
        return;
    }

}
