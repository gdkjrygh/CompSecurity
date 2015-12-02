// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base.c;

import com.facebook.common.executors.s;
import com.facebook.inject.d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.facebook.base.c:
//            a, b

class r extends d
{

    final a a;

    private r(a a1)
    {
        a = a1;
        super();
    }

    r(a a1, b b1)
    {
        this(a1);
    }

    public ExecutorService a()
    {
        LinkedBlockingQueue linkedblockingqueue = new LinkedBlockingQueue(10);
        return new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedblockingqueue, new s("FbBaseModule Thread #"));
    }

    public Object b()
    {
        return a();
    }
}
