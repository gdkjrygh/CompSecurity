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

class val.inFinished extends NamedRunnable
{

    final FramedConnection this$0;
    final boolean val$inFinished;
    final List val$requestHeaders;
    final int val$streamId;

    public void execute()
    {
        boolean flag;
        flag = FramedConnection.access$2500(FramedConnection.this).onHeaders(val$streamId, val$requestHeaders, val$inFinished);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        frameWriter.rstStream(val$streamId, ErrorCode.CANCEL);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        if (!val$inFinished)
        {
            break MISSING_BLOCK_LABEL_95;
        }
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

    transient (List list, boolean flag)
    {
        this$0 = final_framedconnection;
        val$streamId = I.this;
        val$requestHeaders = list;
        val$inFinished = flag;
        super(final_s, final_aobj);
    }
}
