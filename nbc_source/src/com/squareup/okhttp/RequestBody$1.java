// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.io.IOException;
import okio.BufferedSink;
import okio.ByteString;

// Referenced classes of package com.squareup.okhttp:
//            RequestBody, MediaType

static final class nit> extends RequestBody
{

    final ByteString val$content;
    final MediaType val$contentType;

    public long contentLength()
        throws IOException
    {
        return (long)val$content.size();
    }

    public MediaType contentType()
    {
        return val$contentType;
    }

    public void writeTo(BufferedSink bufferedsink)
        throws IOException
    {
        bufferedsink.write(val$content);
    }

    (MediaType mediatype, ByteString bytestring)
    {
        val$contentType = mediatype;
        val$content = bytestring;
        super();
    }
}
