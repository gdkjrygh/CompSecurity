// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http.apache;

import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StreamingContent;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.AbstractHttpEntity;

final class ContentEntity extends AbstractHttpEntity
{

    private final long contentLength;
    private final StreamingContent streamingContent;

    ContentEntity(long l, StreamingContent streamingcontent)
    {
        contentLength = l;
        streamingContent = (StreamingContent)Preconditions.checkNotNull(streamingcontent);
    }

    public InputStream getContent()
    {
        throw new UnsupportedOperationException();
    }

    public long getContentLength()
    {
        return contentLength;
    }

    public boolean isRepeatable()
    {
        return false;
    }

    public boolean isStreaming()
    {
        return true;
    }

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        if (contentLength != 0L)
        {
            streamingContent.writeTo(outputstream);
        }
    }
}
