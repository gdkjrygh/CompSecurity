// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.internal.Internal;
import com.squareup.okhttp.internal.NamedRunnable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            FramedConnection, IncomingStreamHandler, ErrorCode, FramedStream

class val.newStream extends NamedRunnable
{

    final val.newStream this$1;
    final FramedStream val$newStream;

    public void execute()
    {
        try
        {
            FramedConnection.access$1800(_fld0).receive(val$newStream);
            return;
        }
        catch (IOException ioexception)
        {
            Internal.logger.log(Level.INFO, (new StringBuilder()).append("StreamHandler failure for ").append(FramedConnection.access$900(_fld0)).toString(), ioexception);
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

    transient (Object aobj[], FramedStream framedstream)
    {
        this$1 = final_;
        val$newStream = framedstream;
        super(String.this, aobj);
    }
}
