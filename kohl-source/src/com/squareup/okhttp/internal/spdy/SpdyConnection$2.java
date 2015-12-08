// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.NamedRunnable;
import java.io.IOException;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            SpdyConnection

class val.deltaWindowSize extends NamedRunnable
{

    final SpdyConnection this$0;
    final int val$deltaWindowSize;
    final int val$streamId;

    public void execute()
    {
        try
        {
            writeWindowUpdate(val$streamId, val$deltaWindowSize);
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    transient (int i, int j)
    {
        this$0 = final_spdyconnection;
        val$streamId = i;
        val$deltaWindowSize = j;
        super(final_s, _5B_Ljava.lang.Object_3B_.this);
    }
}
