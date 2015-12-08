// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.util.Log;
import java.util.Map;

// Referenced classes of package org.chromium.content.browser:
//            ChildProcessLauncher, BindingManager, ChildProcessConnection

static final class val.connection
    implements ConnectionCallback
{

    final long val$clientContext;
    final ChildProcessConnection val$connection;

    public void onConnected(int i)
    {
        Log.d("ChildProcessLauncher", (new StringBuilder()).append("on connect callback, pid=").append(i).append(" context=").append(val$clientContext).toString());
        if (i != 0)
        {
            ChildProcessLauncher.access$100().addNewConnection(i, val$connection);
            ChildProcessLauncher.access$200().put(Integer.valueOf(i), val$connection);
        }
        if (val$clientContext != 0L)
        {
            ChildProcessLauncher.access$300(val$clientContext, i);
        }
    }

    ConnectionCallback(long l, ChildProcessConnection childprocessconnection)
    {
        val$clientContext = l;
        val$connection = childprocessconnection;
        super();
    }
}
