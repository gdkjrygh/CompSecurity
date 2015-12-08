// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

public class HttpEntityWrapper
    implements HttpEntity
{

    protected HttpEntity wrappedEntity;

    public HttpEntityWrapper(HttpEntity httpentity)
    {
        if (httpentity == null)
        {
            throw new IllegalArgumentException("wrapped entity must not be null");
        } else
        {
            wrappedEntity = httpentity;
            return;
        }
    }

    public void consumeContent()
    {
        wrappedEntity.consumeContent();
    }

    public InputStream getContent()
    {
        return wrappedEntity.getContent();
    }

    public Header getContentEncoding()
    {
        return wrappedEntity.getContentEncoding();
    }

    public long getContentLength()
    {
        return wrappedEntity.getContentLength();
    }

    public Header getContentType()
    {
        return wrappedEntity.getContentType();
    }

    public boolean isChunked()
    {
        return wrappedEntity.isChunked();
    }

    public boolean isRepeatable()
    {
        return wrappedEntity.isRepeatable();
    }

    public boolean isStreaming()
    {
        return wrappedEntity.isStreaming();
    }

    public void writeTo(OutputStream outputstream)
    {
        wrappedEntity.writeTo(outputstream);
    }
}
