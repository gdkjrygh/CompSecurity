// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils.task;

import com.comscore.analytics.Core;
import com.comscore.utils.CSLog;

// Referenced classes of package com.comscore.utils.task:
//            TaskExecutor

class a
    implements Runnable
{

    Runnable a;
    final TaskExecutor b;

    public a(TaskExecutor taskexecutor, Runnable runnable)
    {
        b = taskexecutor;
        super();
        a = runnable;
    }

    public void run()
    {
        try
        {
            a.run();
            return;
        }
        catch (Exception exception)
        {
            CSLog.e(getClass(), "Unexpected error running asynchronous task: ");
            CSLog.printStackTrace(exception);
            b.a.setEnabled(false);
            return;
        }
    }
}
