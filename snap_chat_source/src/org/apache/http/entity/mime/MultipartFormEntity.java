// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity.mime;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

// Referenced classes of package org.apache.http.entity.mime:
//            AbstractMultipartForm

class MultipartFormEntity
    implements HttpEntity
{

    private final long contentLength;
    private final Header contentType;
    private final AbstractMultipartForm multipart;

    MultipartFormEntity(AbstractMultipartForm abstractmultipartform, String s, long l)
    {
        multipart = abstractmultipartform;
        contentType = new BasicHeader("Content-Type", s);
        contentLength = l;
    }

    public void consumeContent()
    {
        if (isStreaming())
        {
            throw new UnsupportedOperationException("Streaming entity does not implement #consumeContent()");
        } else
        {
            return;
        }
    }

    public InputStream getContent()
    {
        throw new UnsupportedOperationException("Multipart form entity does not implement #getContent()");
    }

    public Header getContentEncoding()
    {
        return null;
    }

    public long getContentLength()
    {
        return contentLength;
    }

    public Header getContentType()
    {
        return contentType;
    }

    public boolean isChunked()
    {
        return !isRepeatable();
    }

    public boolean isRepeatable()
    {
        return contentLength != -1L;
    }

    public boolean isStreaming()
    {
        return !isRepeatable();
    }

    public void writeTo(OutputStream outputstream)
    {
        multipart.writeTo(outputstream);
    }
}
