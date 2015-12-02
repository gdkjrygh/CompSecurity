// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

// Referenced classes of package com.facebook.common.executors:
//            ac

class ad extends ac
    implements RunnableFuture
{

    public ad(Runnable runnable, Object obj)
    {
        super(runnable, obj);
    }

    public ad(Callable callable)
    {
        super(callable);
    }
}
