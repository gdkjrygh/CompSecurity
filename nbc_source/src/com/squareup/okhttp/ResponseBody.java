// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okio.Buffer;
import okio.BufferedSource;

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

    public static ResponseBody create(MediaType mediatype, long l, BufferedSource bufferedsource)
    {
        if (bufferedsource == null)
        {
            throw new NullPointerException("source == null");
        } else
        {
            return new ResponseBody(mediatype, l, bufferedsource) {

                final BufferedSource val$content;
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

                public BufferedSource source()
                {
                    return content;
                }

            
            {
                contentType = mediatype;
                contentLength = l;
                content = bufferedsource;
                super();
            }
            };
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
        mediatype = (new Buffer()).writeString(s, charset1);
        return create(mediatype1, mediatype.size(), ((BufferedSource) (mediatype)));
    }

    public static ResponseBody create(MediaType mediatype, byte abyte0[])
    {
        Buffer buffer = (new Buffer()).write(abyte0);
        return create(mediatype, abyte0.length, ((BufferedSource) (buffer)));
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

    public final Reader charStream()
        throws IOException
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
