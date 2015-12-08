// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.ResponseHeaders;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.squareup.okhttp:
//            Dispatcher, MediaType

static class in extends in
{

    private final InputStream in;
    private final ResponseHeaders responseHeaders;

    public InputStream byteStream()
        throws IOException
    {
        return in;
    }

    public long contentLength()
    {
        return responseHeaders.getContentLength();
    }

    public MediaType contentType()
    {
        String s = responseHeaders.getContentType();
        if (s != null)
        {
            return MediaType.parse(s);
        } else
        {
            return null;
        }
    }

    public boolean ready()
        throws IOException
    {
        return true;
    }

    s(ResponseHeaders responseheaders, InputStream inputstream)
    {
        responseHeaders = responseheaders;
        in = inputstream;
    }
}
