// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.d.a;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.google.common.d.a:
//            z, u, aa, y

public final class w
{

    private w()
    {
    }

    public static u a()
    {
        return new z(null);
    }

    public static u a(ExecutorService executorservice)
    {
        if (executorservice instanceof u)
        {
            return (u)executorservice;
        }
        if (executorservice instanceof ScheduledExecutorService)
        {
            return new aa((ScheduledExecutorService)executorservice);
        } else
        {
            return new y(executorservice);
        }
    }
}
