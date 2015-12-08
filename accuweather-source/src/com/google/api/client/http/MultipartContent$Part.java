// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;


// Referenced classes of package com.google.api.client.http:
//            MultipartContent, HttpContent, HttpEncoding, HttpHeaders

public static final class setContent
{

    HttpContent content;
    HttpEncoding encoding;
    HttpHeaders headers;

    public HttpContent getContent()
    {
        return content;
    }

    public HttpEncoding getEncoding()
    {
        return encoding;
    }

    public HttpHeaders getHeaders()
    {
        return headers;
    }

    public headers setContent(HttpContent httpcontent)
    {
        content = httpcontent;
        return this;
    }

    public content setEncoding(HttpEncoding httpencoding)
    {
        encoding = httpencoding;
        return this;
    }

    public encoding setHeaders(HttpHeaders httpheaders)
    {
        headers = httpheaders;
        return this;
    }

    public ()
    {
        this(null);
    }

    public <init>(HttpContent httpcontent)
    {
        this(null, httpcontent);
    }

    public <init>(HttpHeaders httpheaders, HttpContent httpcontent)
    {
        setHeaders(httpheaders);
        setContent(httpcontent);
    }
}
