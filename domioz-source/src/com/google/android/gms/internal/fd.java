// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class fd
    implements Future
{

    private final Object a = null;

    public fd()
    {
    }

    public final boolean cancel(boolean flag)
    {
        return false;
    }

    public final Object get()
    {
        return a;
    }

    public final Object get(long l, TimeUnit timeunit)
    {
        return a;
    }

    public final boolean isCancelled()
    {
        return false;
    }

    public final boolean isDone()
    {
        return true;
    }
}
