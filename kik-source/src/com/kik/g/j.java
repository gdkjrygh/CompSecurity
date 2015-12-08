// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.g;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.kik.g:
//            c, i

public final class j
{

    private static final Executor a = Executors.newSingleThreadExecutor();
    private static final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();

    public static c a(i i)
    {
        return new c(b, i);
    }

}
