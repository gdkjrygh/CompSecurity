// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ComputingConcurrentHashMap

private static class value
    implements value
{

    final Object value;

    public void clear()
    {
    }

    public value copyFor(value value1)
    {
        return this;
    }

    public Object get()
    {
        return value;
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
        return get();
    }

    (Object obj)
    {
        value = obj;
    }
}
