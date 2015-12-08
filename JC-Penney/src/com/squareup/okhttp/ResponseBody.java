// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import c.f;
import c.j;
import com.squareup.okhttp.internal.Util;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

// Referenced classes of package com.squareup.okhttp:
//            MediaType

public abstract class ResponseBody
    implements Closeable
{

    private Reader reader;

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

    public static ResponseBody create(final MediaType contentType, final long contentLength, final j content)
    {
        if (content == null)
        {
            throw new NullPointerException("source == null");
        } else
        {
            return new _cls1();
        }
    }

    public static ResponseBody create(MediaType mediatype, String s)
    {
        Charset charset1 = Util.UTF_8;
        MediaType mediatype1 = mediatype;
        if (mediatype != null)
        {
            Charset charset2 = mediatype.charset();
            charset1 = charset2;
            mediatype1 = mediatype;
            if (charset2 == null)
            {
                charset1 = Util.UTF_8;
                mediatype1 = MediaType.parse((new StringBuilder()).append(mediatype).append("; charset=utf-8").toString());
            }
        }
        mediatype = (new f()).a(s, charset1);
        return create(mediatype1, mediatype.a(), ((j) (mediatype)));
    }

    public static ResponseBody create(MediaType mediatype, byte abyte0[])
    {
        f f1 = (new f()).b(abyte0);
        return create(mediatype, abyte0.length, ((j) (f1)));
    }

    public final InputStream byteStream()
    {
        return source().g();
    }

    public final byte[] bytes()
    {
        j j1;
        long l;
        l = contentLength();
        if (l > 0x7fffffffL)
        {
            throw new IOException((new StringBuilder()).append("Cannot buffer entire body for content length: ").append(l).toString());
        }
        j1 = source();
        Object obj = j1.s();
        Util.closeQuietly(j1);
        if (l != -1L && l != (long)obj.length)
        {
            throw new IOException("Content-Length and stream length disagree");
        } else
        {
            return ((byte []) (obj));
        }
        obj;
        Util.closeQuietly(j1);
        throw obj;
    }

    public final Reader charStream()
    {
        Reader reader1 = reader;
        if (reader1 != null)
        {
            return reader1;
        } else
        {
            InputStreamReader inputstreamreader = new InputStreamReader(byteStream(), charset());
            reader = inputstreamreader;
            return inputstreamreader;
        }
    }

    public void close()
    {
        source().close();
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract j source();

    public final String string()
    {
        return new String(bytes(), charset().name());
    }

    private class _cls1 extends ResponseBody
    {

        final j val$content;
        final long val$contentLength;
        final MediaType val$contentType;

        public long contentLength()
        {
            return contentLength;
        }

        public MediaType contentType()
        {
            return contentType;
        }

        public j source()
        {
            return content;
        }

        _cls1()
        {
            contentType = mediatype;
            contentLength = l;
            content = j1;
            super();
        }
    }

}
