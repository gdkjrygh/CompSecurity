// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import com.google.api.client.util.StreamingContent;
import java.io.IOException;

// Referenced classes of package com.google.api.client.http:
//            LowLevelHttpResponse

public abstract class LowLevelHttpRequest
{

    private String contentEncoding;
    private long contentLength;
    private String contentType;
    private StreamingContent streamingContent;

    public LowLevelHttpRequest()
    {
        contentLength = -1L;
    }

    public abstract void addHeader(String s, String s1)
        throws IOException;

    public abstract LowLevelHttpResponse execute()
        throws IOException;

    public final String getContentEncoding()
    {
        return contentEncoding;
    }

    public final long getContentLength()
    {
        return contentLength;
    }

    public final String getContentType()
    {
        return contentType;
    }

    public final StreamingContent getStreamingContent()
    {
        return streamingContent;
    }

    public final void setContentEncoding(String s)
        throws IOException
    {
        contentEncoding = s;
    }

    public final void setContentLength(long l)
        throws IOException
    {
        contentLength = l;
    }

    public final void setContentType(String s)
        throws IOException
    {
        contentType = s;
    }

    public final void setStreamingContent(StreamingContent streamingcontent)
        throws IOException
    {
        streamingContent = streamingcontent;
    }

    public void setTimeout(int i, int j)
        throws IOException
    {
    }
}
