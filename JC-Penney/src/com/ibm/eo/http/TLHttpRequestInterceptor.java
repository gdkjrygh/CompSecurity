// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.http;

import com.ibm.eo.EOCore;
import com.ibm.eo.util.HTTPUtil;
import com.ibm.eo.util.LogInternal;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.RequestLine;
import org.apache.http.protocol.HttpContext;

public class TLHttpRequestInterceptor
    implements HttpRequestInterceptor
{

    private final Boolean hasUICData;
    private final String sessionId;
    private String url;

    public TLHttpRequestInterceptor()
    {
        sessionId = null;
        hasUICData = Boolean.valueOf(false);
    }

    public TLHttpRequestInterceptor(String s, Boolean boolean1)
    {
        sessionId = s;
        hasUICData = boolean1;
    }

    public final String getUrl()
    {
        return url;
    }

    public final void process(HttpRequest httprequest, HttpContext httpcontext)
    {
        try
        {
            url = httprequest.getRequestLine().getUri();
            if (!httprequest.containsHeader("X-TEALEAF_HASUICDATA"))
            {
                httprequest.addHeader("X-TEALEAF_HASUICDATA", hasUICData.toString());
            }
            if (!httprequest.containsHeader("X-Tealeaf"))
            {
                httprequest.addHeader("X-Tealeaf", (new StringBuilder()).append("device (Android) Lib/").append(EOCore.getLibraryVersion()).toString());
            }
            if (!httprequest.containsHeader("X-Tealeaf-Property"))
            {
                httprequest.addHeader("X-Tealeaf-Property", EOCore.getHttpXTealeafProperty());
            }
            LogInternal.log("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
            LogInternal.log("Header from request:");
            LogInternal.log(HTTPUtil.getHeaders(httprequest.getAllHeaders()));
            LogInternal.log("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequest httprequest)
        {
            LogInternal.logException(httprequest);
        }
    }

    public final void setUrl(String s)
    {
        url = s;
    }
}
