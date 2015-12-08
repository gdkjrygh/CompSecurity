// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;

// Referenced classes of package org.apache.http.entity:
//            HttpEntityWrapper

public class BufferedHttpEntity extends HttpEntityWrapper
{

    private final byte buffer[];

    public BufferedHttpEntity(HttpEntity httpentity)
    {
        super(httpentity);
        if (!httpentity.isRepeatable() || httpentity.getContentLength() < 0L)
        {
            buffer = EntityUtils.toByteArray(httpentity);
            return;
        } else
        {
            buffer = null;
            return;
        }
    }

    public InputStream getContent()
    {
        if (buffer != null)
        {
            return new ByteArrayInputStream(buffer);
        } else
        {
            return wrappedEntity.getContent();
        }
    }

    public long getContentLength()
    {
        if (buffer != null)
        {
            return (long)buffer.length;
        } else
        {
            return wrappedEntity.getContentLength();
        }
    }

    public boolean isChunked()
    {
        return buffer == null && wrappedEntity.isChunked();
    }

    public boolean isRepeatable()
    {
        return true;
    }

    public boolean isStreaming()
    {
        return buffer == null && wrappedEntity.isStreaming();
    }

    public void writeTo(OutputStream outputstream)
    {
        if (outputstream == null)
        {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        if (buffer != null)
        {
            outputstream.write(buffer);
            return;
        } else
        {
            wrappedEntity.writeTo(outputstream);
            return;
        }
    }
}
