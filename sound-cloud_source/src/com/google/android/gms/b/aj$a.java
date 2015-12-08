// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.b:
//            aj, al

private final class <init> extends ThreadPoolExecutor
{

    final aj a;

    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj)
    {
        return new al(this, runnable, obj);
    }

    public tory(aj aj1)
    {
        a = aj1;
        super(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        setThreadFactory(new <init>((byte)0));
    }
}
