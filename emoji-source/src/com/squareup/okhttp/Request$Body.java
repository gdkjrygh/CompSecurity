// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

// Referenced classes of package com.squareup.okhttp:
//            Request, MediaType

public static abstract class <init>
{

    public static <init> create(MediaType mediatype, File file)
    {
        if (mediatype == null)
        {
            throw new NullPointerException("contentType == null");
        }
        if (file == null)
        {
            throw new NullPointerException("content == null");
        } else
        {
            return new Request.Body(mediatype, file) {

                final MediaType val$contentType;
                final File val$file;

                public long contentLength()
                {
                    return file.length();
                }

                public MediaType contentType()
                {
                    return contentType;
                }

                public void writeTo(OutputStream outputstream)
                    throws IOException
                {
                    Object obj1;
                    long l;
                    l = contentLength();
                    if (l == 0L)
                    {
                        return;
                    }
                    obj1 = null;
                    Object obj = new FileInputStream(file);
                    obj1 = new byte[(int)Math.min(8192L, l)];
_L3:
                    int i = ((InputStream) (obj)).read(((byte []) (obj1)));
                    if (i == -1) goto _L2; else goto _L1
_L1:
                    outputstream.write(((byte []) (obj1)), 0, i);
                      goto _L3
                    obj1;
                    outputstream = ((OutputStream) (obj));
                    obj = obj1;
_L5:
                    Util.closeQuietly(outputstream);
                    throw obj;
_L2:
                    Util.closeQuietly(((java.io.Closeable) (obj)));
                    return;
                    obj;
                    outputstream = ((OutputStream) (obj1));
                    if (true) goto _L5; else goto _L4
_L4:
                }

            
            {
                contentType = mediatype;
                file = file1;
                super();
            }
            };
        }
    }

    public static .closeQuietly create(MediaType mediatype, String s)
    {
        if (mediatype.charset() == null)
        {
            mediatype = MediaType.parse((new StringBuilder()).append(mediatype).append("; charset=utf-8").toString());
        }
        try
        {
            mediatype = create(mediatype, s.getBytes(mediatype.charset().name()));
        }
        // Misplaced declaration of an exception variable
        catch (MediaType mediatype)
        {
            throw new AssertionError();
        }
        return mediatype;
    }

    public static rset create(MediaType mediatype, byte abyte0[])
    {
        if (mediatype == null)
        {
            throw new NullPointerException("contentType == null");
        }
        if (abyte0 == null)
        {
            throw new NullPointerException("content == null");
        } else
        {
            return new Request.Body(mediatype, abyte0) {

                final byte val$content[];
                final MediaType val$contentType;

                public long contentLength()
                {
                    return (long)content.length;
                }

                public MediaType contentType()
                {
                    return contentType;
                }

                public void writeTo(OutputStream outputstream)
                    throws IOException
                {
                    outputstream.write(content);
                }

            
            {
                contentType = mediatype;
                content = abyte0;
                super();
            }
            };
        }
    }

    public long contentLength()
    {
        return -1L;
    }

    public abstract MediaType contentType();

    public abstract void writeTo(OutputStream outputstream)
        throws IOException;

    public <init>()
    {
    }
}
