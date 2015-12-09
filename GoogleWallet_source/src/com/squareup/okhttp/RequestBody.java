// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.io.IOException;
import okio.BufferedSink;

// Referenced classes of package com.squareup.okhttp:
//            MediaType

public abstract class RequestBody
{

    public RequestBody()
    {
    }

    public static RequestBody create(MediaType mediatype, byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new NullPointerException("content == null");
        } else
        {
            return new RequestBody(mediatype, abyte0) {

                final byte val$content[];
                final MediaType val$contentType;

                public final long contentLength()
                {
                    return (long)content.length;
                }

                public final void writeTo(BufferedSink bufferedsink)
                    throws IOException
                {
                    bufferedsink.write(content);
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
        throws IOException
    {
        return -1L;
    }

    public abstract void writeTo(BufferedSink bufferedsink)
        throws IOException;
}
