// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import okio.BufferedSource;

// Referenced classes of package com.squareup.okhttp:
//            MediaType

public abstract class ResponseBody
    implements Closeable
{

    public ResponseBody()
    {
    }

    private Charset charset()
    {
        MediaType mediatype = contentType();
        if (mediatype != null)
        {
            return mediatype.charset(Util.UTF_8);
        } else
        {
            return Util.UTF_8;
        }
    }

    public final InputStream byteStream()
        throws IOException
    {
        return source().inputStream();
    }

    public final byte[] bytes()
        throws IOException
    {
        BufferedSource bufferedsource;
        long l;
        l = contentLength();
        if (l > 0x7fffffffL)
        {
            throw new IOException((new StringBuilder()).append("Cannot buffer entire body for content length: ").append(l).toString());
        }
        bufferedsource = source();
        Object obj = bufferedsource.readByteArray();
        Util.closeQuietly(bufferedsource);
        if (l != -1L && l != (long)obj.length)
        {
            throw new IOException("Content-Length and stream length disagree");
        } else
        {
            return ((byte []) (obj));
        }
        obj;
        Util.closeQuietly(bufferedsource);
        throw obj;
    }

    public void close()
        throws IOException
    {
        source().close();
    }

    public abstract long contentLength()
        throws IOException;

    public abstract MediaType contentType();

    public abstract BufferedSource source()
        throws IOException;

    public final String string()
        throws IOException
    {
        return new String(bytes(), charset().name());
    }
}
