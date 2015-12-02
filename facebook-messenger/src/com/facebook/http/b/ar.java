// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import java.net.URI;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.RequestLine;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

public class ar
{

    public ar()
    {
    }

    public URI a(HttpRequest httprequest, HttpContext httpcontext)
    {
        if (httprequest instanceof HttpUriRequest)
        {
            return ((HttpUriRequest)httprequest).getURI();
        }
        if (httprequest != null)
        {
            return URI.create(httprequest.getRequestLine().getUri());
        }
        httprequest = (HttpUriRequest)httpcontext.getAttribute("http.request");
        if (httprequest != null)
        {
            return httprequest.getURI();
        } else
        {
            throw new IllegalArgumentException("no HttpReqeust is provided");
        }
    }

    public URI b(HttpRequest httprequest, HttpContext httpcontext)
    {
        httprequest = a(httprequest, httpcontext);
        if (httprequest.isAbsolute())
        {
            return httprequest;
        }
        httpcontext = (HttpHost)httpcontext.getAttribute("http.target_host");
        if (httpcontext == null)
        {
            return httprequest;
        } else
        {
            return URI.create(httpcontext.toURI()).resolve(httprequest);
        }
    }
}
