// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.RequestLine;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthState;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.protocol.HttpContext;

public class OAuth2HttpRequestInterceptor
    implements HttpRequestInterceptor
{

    public OAuth2HttpRequestInterceptor()
    {
    }

    public void process(HttpRequest httprequest, HttpContext httpcontext)
        throws HttpException, IOException
    {
        if (httprequest == null)
        {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
        if (httpcontext == null)
        {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
        if (httprequest.getRequestLine().getMethod().equalsIgnoreCase("CONNECT"))
        {
            break MISSING_BLOCK_LABEL_95;
        }
        httpcontext = (AuthState)httpcontext.getAttribute("http.auth.target-scope");
        if (httpcontext == null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        httpcontext = httpcontext.getAuthScheme();
        if (httpcontext == null || httpcontext.isConnectionBased())
        {
            break MISSING_BLOCK_LABEL_95;
        }
        httprequest.setHeader(httpcontext.authenticate(null, httprequest));
        return;
        httprequest;
    }
}
