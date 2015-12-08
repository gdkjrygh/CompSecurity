// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.lang.ref.WeakReference;
import java.util.concurrent.FutureTask;

public class ka extends FutureTask
{

    private final WeakReference a = new WeakReference(null);
    private final WeakReference b;

    public ka(Runnable runnable, Object obj)
    {
        super(runnable, obj);
        b = new WeakReference(runnable);
    }

    public Runnable a()
    {
        return (Runnable)b.get();
    }
}
