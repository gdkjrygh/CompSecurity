// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

// Referenced classes of package com.squareup.okhttp:
//            Response, MediaType

public static abstract class 
{

    private Reader reader;

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

    public abstract InputStream byteStream()
        throws IOException;

    public final byte[] bytes()
        throws IOException
    {
        long l = contentLength();
        if (l > 0x7fffffffL)
        {
            throw new IOException((new StringBuilder()).append("Cannot buffer entire body for content length: ").append(l).toString());
        }
        byte abyte0[];
        if (l != -1L)
        {
            abyte0 = new byte[(int)l];
            InputStream inputstream = byteStream();
            Util.readFully(inputstream, abyte0);
            if (inputstream.read() != -1)
            {
                throw new IOException("Content-Length and stream length disagree");
            }
        } else
        {
            abyte0 = new ByteArrayOutputStream();
            Util.copy(byteStream(), abyte0);
            abyte0 = abyte0.toByteArray();
        }
        return abyte0;
    }

    public final Reader charStream()
        throws IOException
    {
        if (reader == null)
        {
            reader = new InputStreamReader(byteStream(), charset());
        }
        return reader;
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract boolean ready()
        throws IOException;

    public final String string()
        throws IOException
    {
        return new String(bytes(), charset().name());
    }

    public ()
    {
    }
}
