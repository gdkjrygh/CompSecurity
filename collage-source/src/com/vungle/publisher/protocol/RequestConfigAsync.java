// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol;

import com.vungle.publisher.bf;

// Referenced classes of package com.vungle.publisher.protocol:
//            ProtocolHttpGateway

public class RequestConfigAsync extends bf
{
    static class RequestConfigRunnable
        implements Runnable
    {

        ProtocolHttpGateway a;

        public void run()
        {
            a.a();
        }

        RequestConfigRunnable()
        {
        }
    }


    RequestConfigRunnable b;

    public RequestConfigAsync()
    {
    }

    protected final Runnable a()
    {
        return b;
    }

    protected final com.vungle.publisher.async.ScheduledPriorityExecutor.b b()
    {
        return com.vungle.publisher.async.ScheduledPriorityExecutor.b.j;
    }
}
