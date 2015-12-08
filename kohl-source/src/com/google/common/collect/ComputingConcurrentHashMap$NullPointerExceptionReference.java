// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            ComputingConcurrentHashMap

private static class message
    implements message
{

    final String message;

    public void clear()
    {
    }

    public message copyFor(message message1)
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
        throw new NullPointerException(message);
    }

    (String s)
    {
        message = s;
    }
}
