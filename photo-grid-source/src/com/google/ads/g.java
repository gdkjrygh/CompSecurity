// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class g
    implements Future
{

    private final Object a;

    public g(Object obj)
    {
        a = obj;
    }

    public boolean cancel(boolean flag)
    {
        return false;
    }

    public Object get()
    {
        return a;
    }

    public Object get(long l, TimeUnit timeunit)
    {
        return a;
    }

    public boolean isCancelled()
    {
        return false;
    }

    public boolean isDone()
    {
        return true;
    }
}
