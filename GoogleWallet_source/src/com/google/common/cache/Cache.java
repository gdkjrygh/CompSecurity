// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

public interface Cache
{

    public abstract ConcurrentMap asMap();

    public abstract Object get(Object obj, Callable callable)
        throws ExecutionException;

    public abstract Object getIfPresent(Object obj);

    public abstract void invalidate(Object obj);

    public abstract void invalidateAll();

    public abstract void put(Object obj, Object obj1);
}
