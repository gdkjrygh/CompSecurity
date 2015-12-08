// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;


// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            SpdyStream, ErrorCode

public interface IncomingStreamHandler
{

    public static final IncomingStreamHandler REFUSE_INCOMING_STREAMS = new IncomingStreamHandler() {

        public void receive(SpdyStream spdystream)
        {
            spdystream.close(ErrorCode.REFUSED_STREAM);
        }

    };

    public abstract void receive(SpdyStream spdystream);

}
