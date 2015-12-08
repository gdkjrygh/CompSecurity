// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.RawHeaders;

// Referenced classes of package com.squareup.okhttp:
//            Response, Request

public static class code
{

    private redirectedBy body;
    private final int code;
    private final RawHeaders headers = new RawHeaders();
    private Response redirectedBy;
    private final Request request;

    public code addHeader(String s, String s1)
    {
        headers.add(s, s1);
        return this;
    }

    public Headers.add body(Headers.add add)
    {
        body = add;
        return this;
    }

    public Response build()
    {
        if (request == null)
        {
            throw new IllegalStateException("Response has no request.");
        }
        if (code == -1)
        {
            throw new IllegalStateException("Response has no code.");
        } else
        {
            return new Response(this, null);
        }
    }

    public > header(String s, String s1)
    {
        headers.set(s, s1);
        return this;
    }

    public Headers.set redirectedBy(Response response)
    {
        redirectedBy = response;
        return this;
    }






    public Headers(Request request1, int i)
    {
        if (request1 == null)
        {
            throw new IllegalArgumentException("request == null");
        }
        if (i <= 0)
        {
            throw new IllegalArgumentException("code <= 0");
        } else
        {
            request = request1;
            code = i;
            return;
        }
    }
}
