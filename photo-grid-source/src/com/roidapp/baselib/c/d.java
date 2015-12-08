// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.c;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class d
    implements ThreadFactory
{

    private final AtomicInteger a = new AtomicInteger(1);

    d()
    {
    }

    public final Thread newThread(Runnable runnable)
    {
        return new Thread(runnable, (new StringBuilder("AsyncTask #")).append(a.getAndIncrement()).toString());
    }
}
