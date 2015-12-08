// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

// Referenced classes of package com.android.volley:
//            ExecutorDelivery

class val.handler
    implements Executor
{

    final ExecutorDelivery this$0;
    final Handler val$handler;

    public void execute(Runnable runnable)
    {
        val$handler.post(runnable);
    }

    ()
    {
        this$0 = final_executordelivery;
        val$handler = Handler.this;
        super();
    }
}
