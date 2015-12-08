// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher;

import com.vungle.publisher.async.ScheduledPriorityExecutor;

public abstract class bf
{

    public ScheduledPriorityExecutor a;

    public bf()
    {
    }

    public abstract Runnable a();

    public final void a(long l)
    {
        a.a(a(), b(), l);
    }

    public com.vungle.publisher.async.ScheduledPriorityExecutor.b b()
    {
        return com.vungle.publisher.async.ScheduledPriorityExecutor.b.p;
    }
}
