// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.internal.NamedRunnable;
import java.io.IOException;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            FramedConnection, PushObserver, ErrorCode, FrameWriter

class val.requestHeaders extends NamedRunnable
{

    final FramedConnection this$0;
    final List val$requestHeaders;
    final int val$streamId;

    public void execute()
    {
        if (!FramedConnection.access$2500(FramedConnection.this).onRequest(val$streamId, val$requestHeaders))
        {
            break MISSING_BLOCK_LABEL_78;
        }
        frameWriter.rstStream(val$streamId, ErrorCode.CANCEL);
        synchronized (FramedConnection.this)
        {
            FramedConnection.access$2600(FramedConnection.this).remove(Integer.valueOf(val$streamId));
        }
        return;
        exception;
        framedconnection;
        JVM INSTR monitorexit ;
        try
        {
            throw exception;
        }
        catch (IOException ioexception) { }
    }

    transient (int i, List list)
    {
        this$0 = final_framedconnection;
        val$streamId = i;
        val$requestHeaders = list;
        super(final_s, _5B_Ljava.lang.Object_3B_.this);
    }
}
