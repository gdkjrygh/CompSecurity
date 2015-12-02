// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.d.a;

import com.google.common.a.dy;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class g extends dy
    implements Future
{

    protected g()
    {
    }

    protected abstract Future b();

    protected Object c()
    {
        return b();
    }

    public boolean cancel(boolean flag)
    {
        return b().cancel(flag);
    }

    public Object get()
    {
        return b().get();
    }

    public Object get(long l, TimeUnit timeunit)
    {
        return b().get(l, timeunit);
    }

    public boolean isCancelled()
    {
        return b().isCancelled();
    }

    public boolean isDone()
    {
        return b().isDone();
    }
}
