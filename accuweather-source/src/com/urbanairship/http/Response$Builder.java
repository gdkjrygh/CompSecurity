// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.http;

import java.util.Map;

// Referenced classes of package com.urbanairship.http:
//            Response

public static class status
{

    private long lastModified;
    private String responseBody;
    private Map responseHeaders;
    private String responseMessage;
    private int status;

    public Response create()
    {
        Response response = new Response(null);
        Response.access$102(response, status);
        Response.access$202(response, responseBody);
        Response.access$302(response, responseHeaders);
        Response.access$402(response, responseMessage);
        Response.access$502(response, lastModified);
        return response;
    }

    public lastModified setLastModified(long l)
    {
        lastModified = l;
        return this;
    }

    public lastModified setResponseBody(String s)
    {
        responseBody = s;
        return this;
    }

    public responseBody setResponseHeaders(Map map)
    {
        responseHeaders = map;
        return this;
    }

    public responseHeaders setResponseMessage(String s)
    {
        responseMessage = s;
        return this;
    }

    public (int i)
    {
        lastModified = 0L;
        status = i;
    }
}
