// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.uploader.client;

import java.io.InputStream;

// Referenced classes of package com.google.uploader.client:
//            HttpHeaders

public final class HttpResponse
{

    private final InputStream responseBody;
    private final int responseCode;
    private final HttpHeaders responseHeaders;

    public HttpResponse(int i, HttpHeaders httpheaders, InputStream inputstream)
    {
        responseCode = i;
        responseHeaders = httpheaders;
        responseBody = inputstream;
    }

    public final InputStream getResponseBody()
    {
        return responseBody;
    }

    public final int getResponseCode()
    {
        return responseCode;
    }

    public final HttpHeaders getResponseHeaders()
    {
        return responseHeaders;
    }

    public final String toDebugString()
    {
        String s = String.valueOf("HttpResponse:\n   ");
        int i = responseCode;
        String s1 = String.valueOf(responseHeaders.toString());
        return (new StringBuilder(String.valueOf(s).length() + 13 + String.valueOf(s1).length())).append(s).append(i).append("  ").append(s1).toString();
    }
}
