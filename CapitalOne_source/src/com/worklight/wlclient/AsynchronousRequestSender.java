// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import android.os.Build;
import com.worklight.common.WLUtils;
import com.worklight.utils.Base64;
import com.worklight.utils.SecurityUtils;
import com.worklight.wlclient.api.WLAuthListener;
import com.worklight.wlclient.api.WLErrorCode;
import com.worklight.wlclient.api.WLFailResponse;
import com.worklight.wlclient.api.WLRequestOptions;
import com.worklight.wlclient.api.WLResponse;
import java.net.SocketTimeoutException;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.worklight.wlclient:
//            WLCookieManager, WLRequest, WL403ResponseException, WLRequestListener

public class AsynchronousRequestSender
    implements Runnable
{

    private HttpClient httpClient;
    private WLRequest request;

    protected AsynchronousRequestSender(WLRequest wlrequest)
    {
        httpClient = null;
        request = wlrequest;
        httpClient = new DefaultHttpClient();
    }

    private void addInstanceAuthHeader()
    {
        if (!WLUtils.isStringEmpty(WLCookieManager.getInstanceAuthId()))
        {
            if (request.getPostRequest().getHeaders("WL-Instance-Id") != null)
            {
                request.getPostRequest().removeHeaders("WL-Instance-Id");
            }
            request.getPostRequest().addHeader("WL-Instance-Id", WLCookieManager.getInstanceAuthId());
        }
    }

    private void onResponseReceived(HttpResponse httpresponse)
        throws WL403ResponseException
    {
        if (httpresponse == null)
        {
            request.getRequestListener().onFailure(new WLFailResponse(WLErrorCode.UNEXPECTED_ERROR, WLErrorCode.UNEXPECTED_ERROR.getDescription(), request.getOptions()));
            return;
        }
        WLCookieManager.handleResponseHeaders(httpresponse.getAllHeaders(), request.getPostRequest().getURI());
        if (httpresponse.getStatusLine().getStatusCode() < 200 || httpresponse.getStatusLine().getStatusCode() > 300)
        {
            Header header = httpresponse.getFirstHeader("WL-Challenge-Data");
            Header header1 = httpresponse.getFirstHeader("WL-Instance-Id");
            if (httpresponse.getStatusLine().getStatusCode() == 403)
            {
                httpresponse = new WL403ResponseException();
                if (header != null && !WLUtils.isStringEmpty(header.getValue()))
                {
                    httpresponse.setChallengeData(header.getValue());
                }
                if (header1 != null && !WLUtils.isStringEmpty(header1.getValue()))
                {
                    httpresponse.setInstanceAuthData(header1.getValue());
                }
                throw httpresponse;
            } else
            {
                httpresponse = new WLFailResponse(httpresponse);
                httpresponse.setOptions(request.getOptions());
                request.getRequestListener().onFailure((WLFailResponse)httpresponse);
                WLUtils.debug((new StringBuilder("Response received with bad status ")).append(httpresponse.getStatus()).append(" ").append(httpresponse).toString());
                return;
            }
        }
        httpresponse = new WLResponse(httpresponse);
        httpresponse.setOptions(request.getOptions());
        if (request.getAuthListener() != null && request.getAuthListener().isLoginFormResponse(httpresponse))
        {
            request.getAuthListener().handleLoginResponse(httpresponse);
        } else
        {
            request.getRequestListener().onSuccess(httpresponse);
        }
        WLUtils.debug((new StringBuilder("Response recived with OK status ")).append(httpresponse.getStatus()).append(" ").append(httpresponse).toString());
    }

    private void setConnectionTimeout(HttpClient httpclient)
    {
        HttpConnectionParams.setSoTimeout(httpclient.getParams(), request.getOptions().getTimeout());
        HttpConnectionParams.setConnectionTimeout(httpclient.getParams(), request.getOptions().getTimeout());
    }

    private void setUserAgentHeader(HttpClient httpclient)
    {
        String s = (String)httpclient.getParams().getParameter("http.useragent");
        httpclient.getParams().setParameter("http.useragent", (new StringBuilder(String.valueOf(s))).append(" WLNativeAPI(").append(Build.DEVICE).append("; ").append(Build.DISPLAY).append("; ").append(Build.MODEL).append("; SDK ").append(android.os.Build.VERSION.SDK).append("; Android ").append(android.os.Build.VERSION.RELEASE).append(")").toString());
    }

    public void run()
    {
        WLUtils.debug((new StringBuilder("Sending request ")).append(request.getPostRequest().getURI()).toString());
        Object obj;
        Object obj1;
        HttpResponse httpresponse;
        Object obj2;
        try
        {
            setUserAgentHeader(httpClient);
            setConnectionTimeout(httpClient);
            WLCookieManager.addCookies(request);
            addInstanceAuthHeader();
            obj = httpClient.execute(request.getPostRequest(), request.getHttpContext());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            request.getRequestListener().onFailure(new WLFailResponse(WLErrorCode.UNEXPECTED_ERROR, WLErrorCode.UNEXPECTED_ERROR.getDescription(), request.getOptions()));
            return;
        }
        onResponseReceived(((HttpResponse) (obj)));
        return;
        obj1;
        String s1 = ((WL403ResponseException) (obj1)).getChallengeData();
        obj1 = ((WL403ResponseException) (obj1)).getInstanceAuthData();
        if (!WLUtils.isStringEmpty(s1))
        {
            int i = s1.indexOf("+");
            String s = s1.substring(0, i);
            String as[] = s1.substring(i + 1).split("-");
            as = Base64.encode(SecurityUtils.kpg(request.getContext(), as), "UTF-8").replaceAll("\n", "");
            s = SecurityUtils.hashData((new StringBuilder(String.valueOf(s.trim()))).append(as).toString(), "SHA-1");
            request.getPostRequest().addHeader("WL-Challenge-Response-Data", s);
        }
        if (!WLUtils.isStringEmpty(((String) (obj1))))
        {
            WLCookieManager.setInstanceAuthId(((String) (obj1)));
        }
        addInstanceAuthHeader();
        httpresponse = httpClient.execute(request.getPostRequest(), request.getHttpContext());
        obj1 = httpresponse;
        if (httpresponse.getStatusLine().getStatusCode() != 403)
        {
            break MISSING_BLOCK_LABEL_340;
        }
        obj2 = httpresponse.getFirstHeader("WL-Instance-Id");
        obj1 = httpresponse;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_340;
        }
        obj1 = httpresponse;
        if (WLUtils.isStringEmpty(((Header) (obj2)).getValue()))
        {
            break MISSING_BLOCK_LABEL_340;
        }
        obj2 = ((Header) (obj2)).getValue();
        obj1 = httpresponse;
        if (!WLUtils.isStringEmpty(((String) (obj2))))
        {
            WLCookieManager.setInstanceAuthId(((String) (obj2)));
            addInstanceAuthHeader();
            obj1 = httpClient.execute(request.getPostRequest(), request.getHttpContext());
        }
        onResponseReceived(((HttpResponse) (obj1)));
        return;
        obj1;
        request.getRequestListener().onFailure(new WLFailResponse(WLErrorCode.REQUEST_TIMEOUT, WLErrorCode.REQUEST_TIMEOUT.getDescription(), request.getOptions()));
        return;
        obj1;
        request.getRequestListener().onFailure(new WLFailResponse(WLErrorCode.UNRESPONSIVE_HOST, WLErrorCode.UNRESPONSIVE_HOST.getDescription(), request.getOptions()));
        return;
        obj1;
        request.getRequestListener().onFailure(new WLFailResponse(WLErrorCode.UNEXPECTED_ERROR, WLErrorCode.UNEXPECTED_ERROR.getDescription(), request.getOptions()));
        return;
    }
}
