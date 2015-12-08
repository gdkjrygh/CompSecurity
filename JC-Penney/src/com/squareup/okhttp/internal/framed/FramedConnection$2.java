// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.internal.NamedRunnable;
import java.io.IOException;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            FramedConnection, FrameWriter

class val.unacknowledgedBytesRead extends NamedRunnable
{

    final FramedConnection this$0;
    final int val$streamId;
    final long val$unacknowledgedBytesRead;

    public void execute()
    {
        try
        {
            frameWriter.windowUpdate(val$streamId, val$unacknowledgedBytesRead);
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    transient (int i, long l)
    {
        this$0 = final_framedconnection;
        val$streamId = i;
        val$unacknowledgedBytesRead = l;
        super(final_s, _5B_Ljava.lang.Object_3B_.this);
    }
}
