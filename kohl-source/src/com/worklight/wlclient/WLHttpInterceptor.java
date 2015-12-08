// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import com.worklight.common.Logger;
import com.worklight.common.WLConfig;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.RequestLine;
import org.apache.http.protocol.HttpContext;
import org.json.JSONException;
import org.json.JSONObject;

final class WLHttpInterceptor
    implements HttpRequestInterceptor, HttpResponseInterceptor
{

    private Logger logger;
    private String trackingId;
    private String url;
    private WLConfig wlConfig;

    public WLHttpInterceptor(Logger logger1, WLConfig wlconfig)
    {
        logger = logger1;
        wlConfig = wlconfig;
    }

    private String loggerMessage(String s)
    {
        if (s.contains(wlConfig.getHost()))
        {
            return "InternalRequestSender";
        } else
        {
            return "ExternalRequestSender";
        }
    }

    public void process(HttpRequest httprequest, HttpContext httpcontext)
        throws HttpException, IOException
    {
        String s1 = httprequest.getLastHeader("Host").getValue();
        String s = httprequest.getRequestLine().getUri();
        httpcontext = s;
        if (s.contains("?"))
        {
            httpcontext = s.substring(0, s.indexOf("?"));
        }
        url = (new StringBuilder()).append(s1).append(httpcontext).toString();
        trackingId = UUID.randomUUID().toString();
        httprequest.addHeader("x-wl-analytics-tracking-id", trackingId);
        try
        {
            long l = (new Date()).getTime();
            httprequest = new JSONObject();
            httprequest.put("$path", url);
            httprequest.put("$category", "network");
            httprequest.put("$trackingid", trackingId);
            httprequest.put("$type", "request");
            httprequest.put("$time", l);
            logger.analytics((new StringBuilder()).append(loggerMessage(url)).append(" outbound").toString(), httprequest);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequest httprequest)
        {
            return;
        }
    }

    public void process(HttpResponse httpresponse, HttpContext httpcontext)
        throws HttpException, IOException
    {
        long l1;
        try
        {
            long l = (new Date()).getTime();
            httpcontext = new JSONObject();
            httpcontext.put("$path", url);
            httpcontext.put("$category", "network");
            httpcontext.put("$trackingid", trackingId);
            httpcontext.put("$type", "response");
            httpcontext.put("$time", l);
            httpresponse = httpresponse.getEntity();
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            return;
        }
        if (httpresponse != null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        l1 = 0L;
        if (l1 == -1L)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        httpcontext.put("$bytes", l1);
        logger.analytics((new StringBuilder()).append(loggerMessage(url)).append(" inbound").toString(), httpcontext);
        return;
        l1 = httpresponse.getContentLength();
        break MISSING_BLOCK_LABEL_80;
    }

    protected void setConfig(WLConfig wlconfig)
    {
        wlConfig = wlconfig;
    }

    protected void setLogger(Logger logger1)
    {
        logger = logger1;
    }
}
