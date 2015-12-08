// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.NamedRunnable;
import java.io.IOException;
import java.util.Set;
import okio.Buffer;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            SpdyConnection, PushObserver, ErrorCode, FrameWriter

class val.inFinished extends NamedRunnable
{

    final SpdyConnection this$0;
    final Buffer val$buffer;
    final int val$byteCount;
    final boolean val$inFinished;
    final int val$streamId;

    public void execute()
    {
        boolean flag = SpdyConnection.access$2500(SpdyConnection.this).onData(val$streamId, val$buffer, val$byteCount, val$inFinished);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        frameWriter.rstStream(val$streamId, ErrorCode.CANCEL);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        if (!val$inFinished)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        synchronized (SpdyConnection.this)
        {
            SpdyConnection.access$2600(SpdyConnection.this).remove(Integer.valueOf(val$streamId));
        }
        return;
        exception;
        spdyconnection;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (IOException ioexception) { }
    }

    transient (int j, boolean flag)
    {
        this$0 = final_spdyconnection;
        val$streamId = i;
        val$buffer = Buffer.this;
        val$byteCount = j;
        val$inFinished = flag;
        super(final_s, final_aobj);
    }
}
