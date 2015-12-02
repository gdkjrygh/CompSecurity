// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import com.facebook.common.executors.s;
import com.facebook.inject.d;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

// Referenced classes of package com.facebook.base.c:
//            a, b

class aw extends d
{

    final a a;

    private aw(a a1)
    {
        a = a1;
        super();
    }

    aw(a a1, b b1)
    {
        this(a1);
    }

    public ScheduledExecutorService a()
    {
        return new ScheduledThreadPoolExecutor(3, new s("FbBaseModule Scheduled Thread #"));
    }

    public Object b()
    {
        return a();
    }
}
