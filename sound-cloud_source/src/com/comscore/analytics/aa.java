// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;

import com.comscore.applications.KeepAlive;
import com.comscore.utils.ConnectivityChangeReceiver;
import com.comscore.utils.OfflineMeasurementsCache;
import com.comscore.utils.task.TaskExecutor;

// Referenced classes of package com.comscore.analytics:
//            Core

class aa
    implements Runnable
{

    final boolean a;
    final Core b;

    aa(Core core, boolean flag)
    {
        b = core;
        a = flag;
        super();
    }

    public void run()
    {
        if (a && !Core.b(b))
        {
            Core.a(b, true);
            b.setErrorHandlingEnabled(Core.c(b));
            b.reset();
            b.getConnectivityReceiver().start();
            b.getKeepAlive().start(3000);
        } else
        if (!a && Core.b(b))
        {
            Core.a(b, false);
            Core.b(b, b.ag);
            if (Thread.getDefaultUncaughtExceptionHandler() != b.ah)
            {
                Thread.setDefaultUncaughtExceptionHandler(b.ah);
            }
            b.getConnectivityReceiver().stop();
            b.getKeepAlive().stop();
            b.getOfflineCache().clear();
            b.f.removeAllEnqueuedTasks();
            return;
        }
    }
}
