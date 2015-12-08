// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StreamingContent;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.api.client.http:
//            HttpEncoding

public final class HttpEncodingStreamingContent
    implements StreamingContent
{

    private final StreamingContent content;
    private final HttpEncoding encoding;

    public HttpEncodingStreamingContent(StreamingContent streamingcontent, HttpEncoding httpencoding)
    {
        content = (StreamingContent)Preconditions.checkNotNull(streamingcontent);
        encoding = (HttpEncoding)Preconditions.checkNotNull(httpencoding);
    }

    public StreamingContent getContent()
    {
        return content;
    }

    public HttpEncoding getEncoding()
    {
        return encoding;
    }

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        encoding.encode(content, outputstream);
    }
}
