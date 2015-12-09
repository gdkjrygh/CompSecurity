// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.internal.NamedRunnable;
import java.io.IOException;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            FramedConnection, Ping

class val.ping extends NamedRunnable
{

    final FramedConnection this$0;
    final int val$payload1;
    final int val$payload2;
    final Ping val$ping;
    final boolean val$reply;

    public void execute()
    {
        try
        {
            FramedConnection.access$700(FramedConnection.this, val$reply, val$payload1, val$payload2, val$ping);
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    transient (int j, Ping ping1)
    {
        this$0 = final_framedconnection;
        val$reply = flag;
        val$payload1 = I.this;
        val$payload2 = j;
        val$ping = ping1;
        super(final_s, final_aobj);
    }
}
