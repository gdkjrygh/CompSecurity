// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.io.IOException;
import okio.BufferedSink;

// Referenced classes of package com.squareup.okhttp:
//            RequestBody, MediaType

static final class nit> extends RequestBody
{

    final int val$byteCount;
    final byte val$content[];
    final MediaType val$contentType;
    final int val$offset;

    public long contentLength()
    {
        return (long)val$byteCount;
    }

    public MediaType contentType()
    {
        return val$contentType;
    }

    public void writeTo(BufferedSink bufferedsink)
        throws IOException
    {
        bufferedsink.write(val$content, val$offset, val$byteCount);
    }

    (MediaType mediatype, int i, byte abyte0[], int j)
    {
        val$contentType = mediatype;
        val$byteCount = i;
        val$content = abyte0;
        val$offset = j;
        super();
    }
}
