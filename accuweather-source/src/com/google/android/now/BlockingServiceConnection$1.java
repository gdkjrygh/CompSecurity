// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.now;

import android.content.Context;
import android.util.Log;

// Referenced classes of package com.google.android.now:
//            BlockingServiceConnection

class val.context
    implements Runnable
{

    final BlockingServiceConnection this$0;
    final Context val$context;

    public void run()
    {
        if (BlockingServiceConnection.access$000(BlockingServiceConnection.this))
        {
            val$context.unbindService(BlockingServiceConnection.this);
            return;
        } else
        {
            Log.w("BlockingServiceConnection", "Service disconnected before unbinding");
            return;
        }
    }

    ()
    {
        this$0 = final_blockingserviceconnection;
        val$context = Context.this;
        super();
    }
}
