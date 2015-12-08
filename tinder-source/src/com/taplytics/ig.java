// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

// Referenced classes of package com.taplytics:
//            hw

final class ig
    implements HttpEntity
{

    private final hw a;
    private final Header b;
    private final long c;

    ig(hw hw1, String s, long l)
    {
        a = hw1;
        b = new BasicHeader("Content-Type", s);
        c = l;
    }

    public final void consumeContent()
        throws IOException, UnsupportedOperationException
    {
        if (isStreaming())
        {
            throw new UnsupportedOperationException("Streaming entity does not implement #consumeContent()");
        } else
        {
            return;
        }
    }

    public final InputStream getContent()
        throws IOException
    {
        throw new UnsupportedOperationException("Multipart form entity does not implement #getContent()");
    }

    public final Header getContentEncoding()
    {
        return null;
    }

    public final long getContentLength()
    {
        return c;
    }

    public final Header getContentType()
    {
        return b;
    }

    public final boolean isChunked()
    {
        return !isRepeatable();
    }

    public final boolean isRepeatable()
    {
        return c != -1L;
    }

    public final boolean isStreaming()
    {
        return !isRepeatable();
    }

    public final void writeTo(OutputStream outputstream)
        throws IOException
    {
        a.a(outputstream);
    }
}
