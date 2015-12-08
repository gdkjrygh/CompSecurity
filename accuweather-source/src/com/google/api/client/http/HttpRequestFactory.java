// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import java.io.IOException;

// Referenced classes of package com.google.api.client.http:
//            HttpTransport, HttpRequestInitializer, HttpRequest, GenericUrl, 
//            HttpContent

public final class HttpRequestFactory
{

    private final HttpRequestInitializer initializer;
    private final HttpTransport transport;

    HttpRequestFactory(HttpTransport httptransport, HttpRequestInitializer httprequestinitializer)
    {
        transport = httptransport;
        initializer = httprequestinitializer;
    }

    public HttpRequest buildDeleteRequest(GenericUrl genericurl)
        throws IOException
    {
        return buildRequest("DELETE", genericurl, null);
    }

    public HttpRequest buildGetRequest(GenericUrl genericurl)
        throws IOException
    {
        return buildRequest("GET", genericurl, null);
    }

    public HttpRequest buildHeadRequest(GenericUrl genericurl)
        throws IOException
    {
        return buildRequest("HEAD", genericurl, null);
    }

    public HttpRequest buildPatchRequest(GenericUrl genericurl, HttpContent httpcontent)
        throws IOException
    {
        return buildRequest("PATCH", genericurl, httpcontent);
    }

    public HttpRequest buildPostRequest(GenericUrl genericurl, HttpContent httpcontent)
        throws IOException
    {
        return buildRequest("POST", genericurl, httpcontent);
    }

    public HttpRequest buildPutRequest(GenericUrl genericurl, HttpContent httpcontent)
        throws IOException
    {
        return buildRequest("PUT", genericurl, httpcontent);
    }

    public HttpRequest buildRequest(String s, GenericUrl genericurl, HttpContent httpcontent)
        throws IOException
    {
        HttpRequest httprequest = transport.buildRequest();
        if (initializer != null)
        {
            initializer.initialize(httprequest);
        }
        httprequest.setRequestMethod(s);
        if (genericurl != null)
        {
            httprequest.setUrl(genericurl);
        }
        if (httpcontent != null)
        {
            httprequest.setContent(httpcontent);
        }
        return httprequest;
    }

    public HttpRequestInitializer getInitializer()
    {
        return initializer;
    }

    public HttpTransport getTransport()
    {
        return transport;
    }
}
