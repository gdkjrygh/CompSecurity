// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.NamedRunnable;
import java.io.IOException;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            SpdyConnection, IncomingStreamHandler, SpdyStream

class val.synStream extends NamedRunnable
{

    final val.synStream this$1;
    final SpdyStream val$synStream;

    public void execute()
    {
        try
        {
            SpdyConnection.access$1600(_fld0).receive(val$synStream);
            return;
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
    }

    transient (Object aobj[], SpdyStream spdystream)
    {
        this$1 = final_;
        val$synStream = spdystream;
        super(String.this, aobj);
    }
}
