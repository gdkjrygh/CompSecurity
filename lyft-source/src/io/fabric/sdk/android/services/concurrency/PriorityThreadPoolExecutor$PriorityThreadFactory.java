// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.util.concurrent.ThreadFactory;

public final class a
    implements ThreadFactory
{

    private final int a;

    public Thread newThread(Runnable runnable)
    {
        runnable = new Thread(runnable);
        runnable.setPriority(a);
        runnable.setName("Queue");
        return runnable;
    }

    public a(int i)
    {
        a = i;
    }
}
