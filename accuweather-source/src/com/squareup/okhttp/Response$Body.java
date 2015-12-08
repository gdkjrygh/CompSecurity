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

// Referenced classes of package com.squareup.okhttp:
//            Response

public static abstract class 
{

    public abstract InputStream byteStream()
        throws IOException;

    public byte[] bytes()
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

    public Reader charStream()
        throws IOException
    {
        return new InputStreamReader(byteStream(), "UTF-8");
    }

    public long contentLength()
    {
        return -1L;
    }

    public String contentType()
    {
        return null;
    }

    public String string()
        throws IOException
    {
        return new String(bytes(), "UTF-8");
    }

    public ()
    {
    }
}
