// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.analytics;

import com.comscore.utils.task.TaskExecutor;

// Referenced classes of package com.comscore.analytics:
//            Core

public class a
    implements Runnable
{

    final Core a;

    public void run()
    {
        while (!Core.b(a) || a.Y == null) 
        {
            return;
        }
        a.f.removeEnqueuedTask(a.Y);
        a.Y = null;
        a.n();
    }

    public (Core core)
    {
        a = core;
        super();
    }
}
