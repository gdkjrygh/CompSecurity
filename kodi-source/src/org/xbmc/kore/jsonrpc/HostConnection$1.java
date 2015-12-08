// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc;

import android.os.Handler;
import android.os.Process;

// Referenced classes of package org.xbmc.kore.jsonrpc:
//            HostConnection, ApiCallback, ApiMethod

class val.handler
    implements Runnable
{

    final HostConnection this$0;
    final ApiCallback val$callback;
    final Handler val$handler;
    final ApiMethod val$method;

    public void run()
    {
        Process.setThreadPriority(10);
        if (HostConnection.access$000(HostConnection.this) == 1)
        {
            HostConnection.access$100(HostConnection.this, val$method, val$callback, val$handler);
            return;
        } else
        {
            HostConnection.access$200(HostConnection.this, val$method, val$callback, val$handler);
            return;
        }
    }

    ()
    {
        this$0 = final_hostconnection;
        val$method = apimethod;
        val$callback = apicallback;
        val$handler = Handler.this;
        super();
    }
}
