// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;


// Referenced classes of package com.squareup.okhttp:
//            Response, Headers, ResponseBody, Handshake, 
//            Protocol, Request

public class <init>
{

    private ResponseBody body;
    private Response cacheResponse;
    private int code;
    private Handshake handshake;
    private request headers;
    private String message;
    private Response networkResponse;
    private Response priorResponse;
    private Protocol protocol;
    private Request request;

    private void checkPriorResponse(Response response)
    {
        if (Response.access$1700(response) != null)
        {
            throw new IllegalArgumentException("priorResponse.body != null");
        } else
        {
            return;
        }
    }

    private void checkSupportResponse(String s, Response response)
    {
        if (Response.access$1700(response) != null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(".body != null").toString());
        }
        if (Response.access$1800(response) != null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(".networkResponse != null").toString());
        }
        if (Response.access$1900(response) != null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(".cacheResponse != null").toString());
        }
        if (Response.access$2000(response) != null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(".priorResponse != null").toString());
        } else
        {
            return;
        }
    }

    public nit> addHeader(String s, String s1)
    {
        headers.dd(s, s1);
        return this;
    }

    public dd body(ResponseBody responsebody)
    {
        body = responsebody;
        return this;
    }

    public Response build()
    {
        if (request == null)
        {
            throw new IllegalStateException("request == null");
        }
        if (protocol == null)
        {
            throw new IllegalStateException("protocol == null");
        }
        if (code < 0)
        {
            throw new IllegalStateException((new StringBuilder()).append("code < 0: ").append(code).toString());
        } else
        {
            return new Response(this, null);
        }
    }

    public code cacheResponse(Response response)
    {
        if (response != null)
        {
            checkSupportResponse("cacheResponse", response);
        }
        cacheResponse = response;
        return this;
    }

    public cacheResponse code(int i)
    {
        code = i;
        return this;
    }

    public code handshake(Handshake handshake1)
    {
        handshake = handshake1;
        return this;
    }

    public handshake header(String s, String s1)
    {
        headers.et(s, s1);
        return this;
    }

    public et headers(Headers headers1)
    {
        headers = headers1.newBuilder();
        return this;
    }

    public r message(String s)
    {
        message = s;
        return this;
    }

    public message networkResponse(Response response)
    {
        if (response != null)
        {
            checkSupportResponse("networkResponse", response);
        }
        networkResponse = response;
        return this;
    }

    public networkResponse priorResponse(Response response)
    {
        if (response != null)
        {
            checkPriorResponse(response);
        }
        priorResponse = response;
        return this;
    }

    public priorResponse protocol(Protocol protocol1)
    {
        protocol = protocol1;
        return this;
    }

    public protocol removeHeader(String s)
    {
        headers.emoveAll(s);
        return this;
    }

    public emoveAll request(Request request1)
    {
        request = request1;
        return this;
    }











    public ()
    {
        code = -1;
        headers = new init>();
    }

    private init>(Response response)
    {
        code = -1;
        request = Response.access$1100(response);
        protocol = Response.access$1200(response);
        code = Response.access$1300(response);
        message = Response.access$1400(response);
        handshake = Response.access$1500(response);
        headers = Response.access$1600(response).newBuilder();
        body = Response.access$1700(response);
        networkResponse = Response.access$1800(response);
        cacheResponse = Response.access$1900(response);
        priorResponse = Response.access$2000(response);
    }

    _cls000(Response response, _cls000 _pcls000)
    {
        this(response);
    }
}
