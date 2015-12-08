// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import java.util.ArrayDeque;
import java.util.Deque;

// Referenced classes of package com.squareup.okhttp:
//            Call

public final class Dispatcher
{

    private final Deque executedCalls = new ArrayDeque();
    private int maxRequests;
    private int maxRequestsPerHost;
    private final Deque readyCalls = new ArrayDeque();
    private final Deque runningCalls = new ArrayDeque();

    public Dispatcher()
    {
        maxRequests = 64;
        maxRequestsPerHost = 5;
    }

    void executed(Call call)
    {
        this;
        JVM INSTR monitorenter ;
        executedCalls.add(call);
        this;
        JVM INSTR monitorexit ;
        return;
        call;
        throw call;
    }

    void finished(Call call)
    {
        this;
        JVM INSTR monitorenter ;
        if (!executedCalls.remove(call))
        {
            throw new AssertionError("Call wasn't in-flight!");
        }
        break MISSING_BLOCK_LABEL_30;
        call;
        this;
        JVM INSTR monitorexit ;
        throw call;
        this;
        JVM INSTR monitorexit ;
    }
}
