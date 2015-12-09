// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import c.i;
import c.k;
import com.squareup.okhttp.internal.Util;
import java.io.File;

// Referenced classes of package com.squareup.okhttp:
//            MediaType

public abstract class RequestBody
{

    public RequestBody()
    {
    }

    public static RequestBody create(final MediaType contentType, final k content)
    {
        return new _cls1();
    }

    public static RequestBody create(final MediaType contentType, final File file)
    {
        if (file == null)
        {
            throw new NullPointerException("content == null");
        } else
        {
            return new _cls3();
        }
    }

    public static RequestBody create(MediaType mediatype, String s)
    {
        java.nio.charset.Charset charset = Util.UTF_8;
        MediaType mediatype1 = mediatype;
        if (mediatype != null)
        {
            java.nio.charset.Charset charset1 = mediatype.charset();
            charset = charset1;
            mediatype1 = mediatype;
            if (charset1 == null)
            {
                charset = Util.UTF_8;
                mediatype1 = MediaType.parse((new StringBuilder()).append(mediatype).append("; charset=utf-8").toString());
            }
        }
        return create(mediatype1, s.getBytes(charset));
    }

    public static RequestBody create(MediaType mediatype, byte abyte0[])
    {
        return create(mediatype, abyte0, 0, abyte0.length);
    }

    public static RequestBody create(final MediaType contentType, final byte content[], final int offset, final int byteCount)
    {
        if (content == null)
        {
            throw new NullPointerException("content == null");
        } else
        {
            Util.checkOffsetAndCount(content.length, offset, byteCount);
            return new _cls2();
        }
    }

    public long contentLength()
    {
        return -1L;
    }

    public abstract MediaType contentType();

    public abstract void writeTo(i i);

    private class _cls1 extends RequestBody
    {

        final k val$content;
        final MediaType val$contentType;

        public long contentLength()
        {
            return (long)content.f();
        }

        public MediaType contentType()
        {
            return contentType;
        }

        public void writeTo(i j)
        {
            j.b(content);
        }

        _cls1()
        {
            contentType = mediatype;
            content = k1;
            super();
        }
    }


    private class _cls3 extends RequestBody
    {

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

        public void writeTo(i j)
        {
            c.ad ad = null;
            c.ad ad1 = r.a(file);
            ad = ad1;
            j.a(ad1);
            Util.closeQuietly(ad1);
            return;
            j;
            Util.closeQuietly(ad);
            throw j;
        }

        _cls3()
        {
            contentType = mediatype;
            file = file1;
            super();
        }
    }


    private class _cls2 extends RequestBody
    {

        final int val$byteCount;
        final byte val$content[];
        final MediaType val$contentType;
        final int val$offset;

        public long contentLength()
        {
            return (long)byteCount;
        }

        public MediaType contentType()
        {
            return contentType;
        }

        public void writeTo(i j)
        {
            j.c(content, offset, byteCount);
        }

        _cls2()
        {
            contentType = mediatype;
            byteCount = j;
            content = abyte0;
            offset = k;
            super();
        }
    }

}
