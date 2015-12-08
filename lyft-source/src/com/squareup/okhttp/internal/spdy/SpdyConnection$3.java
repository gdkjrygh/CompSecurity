// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.NamedRunnable;
import java.io.IOException;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            SpdyConnection, Ping

class val.ping extends NamedRunnable
{

    final SpdyConnection this$0;
    final int val$payload1;
    final int val$payload2;
    final Ping val$ping;
    final boolean val$reply;

    public void execute()
    {
        try
        {
            SpdyConnection.access$700(SpdyConnection.this, val$reply, val$payload1, val$payload2, val$ping);
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    transient (int j, Ping ping1)
    {
        this$0 = final_spdyconnection;
        val$reply = flag;
        val$payload1 = I.this;
        val$payload2 = j;
        val$ping = ping1;
        super(final_s, final_aobj);
    }
}
