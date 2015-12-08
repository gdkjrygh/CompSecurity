// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

// Referenced classes of package com.squareup.okhttp:
//            Dispatcher

static class in extends in
{

    private final HttpURLConnection connection;
    private final InputStream in;

    public InputStream byteStream()
        throws IOException
    {
        return in;
    }

    public long contentLength()
    {
        return (long)connection.getContentLength();
    }

    public String contentType()
    {
        return connection.getHeaderField("Content-Type");
    }

    (HttpURLConnection httpurlconnection, InputStream inputstream)
    {
        connection = httpurlconnection;
        in = inputstream;
    }
}
