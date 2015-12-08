// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.IOException;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            IncomingStreamHandler, ErrorCode, SpdyStream

static final class 
    implements IncomingStreamHandler
{

    public void receive(SpdyStream spdystream)
        throws IOException
    {
        spdystream.close(ErrorCode.REFUSED_STREAM);
    }

    ()
    {
    }
}
