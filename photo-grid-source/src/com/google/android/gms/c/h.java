// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.c;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.c:
//            j, i, f

final class h extends ThreadPoolExecutor
{

    final f a;

    public h(f f)
    {
        a = f;
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        setThreadFactory(new j((byte)0));
    }

    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj)
    {
        return new i(this, runnable, obj);
    }
}
