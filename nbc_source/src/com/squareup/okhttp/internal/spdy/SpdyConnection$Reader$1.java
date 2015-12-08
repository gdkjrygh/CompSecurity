// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.NamedRunnable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            SpdyConnection, IncomingStreamHandler, ErrorCode, SpdyStream

class val.newStream extends NamedRunnable
{

    final  this$1;
    final SpdyStream val$newStream;

    public void execute()
    {
        try
        {
            SpdyConnection.access$1800(_fld0).receive(val$newStream);
            return;
        }
        catch (IOException ioexception)
        {
            Internal.logger.log(Level.INFO, (new StringBuilder()).append("StreamHandler failure for ").append(SpdyConnection.access$900(_fld0)).toString(), ioexception);
        }
        try
        {
            val$newStream.close(ErrorCode.PROTOCOL_ERROR);
            return;
        }
        catch (IOException ioexception1)
        {
            return;
        }
    }

    transient (Object aobj[], SpdyStream spdystream)
    {
        this$1 = final_;
        val$newStream = spdystream;
        super(String.this, aobj);
    }
}
