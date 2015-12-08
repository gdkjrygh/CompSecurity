// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            CustomConcurrentHashMap

private static class referent
    implements referent
{

    final Object referent;

    public void clear()
    {
    }

    public referent copyFor(referent referent1)
    {
        return this;
    }

    public Object get()
    {
        return referent;
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
        referent = obj;
    }
}
