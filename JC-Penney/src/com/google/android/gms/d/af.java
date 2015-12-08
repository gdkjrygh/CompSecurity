// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.d:
//            ah, ag, ad

class af extends ThreadPoolExecutor
{

    final ad a;

    public af(ad ad)
    {
        a = ad;
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        setThreadFactory(new ah(null));
    }

    protected RunnableFuture newTaskFor(Runnable runnable, Object obj)
    {
        return new ag(this, runnable, obj);
    }
}
