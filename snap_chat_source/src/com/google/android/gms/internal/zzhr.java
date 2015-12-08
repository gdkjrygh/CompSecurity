// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class zzhr
    implements Future
{

    private final Object zzzt;

    public zzhr(Object obj)
    {
        zzzt = obj;
    }

    public boolean cancel(boolean flag)
    {
        return false;
    }

    public Object get()
    {
        return zzzt;
    }

    public Object get(long l, TimeUnit timeunit)
    {
        return zzzt;
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
