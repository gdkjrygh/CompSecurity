// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;


// Referenced classes of package com.google.inject.internal.util:
//            $MapMaker, $AsynchronousComputationException

private static class t
    implements t
{

    final Throwable t;

    public t copyFor(t t1)
    {
        return this;
    }

    public Object get()
    {
        return null;
    }

    public Object waitForValue()
    {
        throw new $AsynchronousComputationException(t);
    }

    (Throwable throwable)
    {
        t = throwable;
    }
}
