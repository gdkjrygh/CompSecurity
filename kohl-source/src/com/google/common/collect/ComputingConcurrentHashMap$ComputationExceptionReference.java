// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ComputingConcurrentHashMap, AsynchronousComputationException

private static class t
    implements t
{

    final Throwable t;

    public void clear()
    {
    }

    public t copyFor(t t1)
    {
        return this;
    }

    public Object get()
    {
        return null;
    }

    public boolean isComputingReference()
    {
        return false;
    }

    public void notifyValueReclaimed()
    {
    }

    public Object waitForValue()
    {
        throw new AsynchronousComputationException(t);
    }

    (Throwable throwable)
    {
        t = throwable;
    }
}
