// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal:
//            dn

private static final class <init>
    implements ThreadFactory
{

    private final ThreadFactory a;
    private AtomicInteger b;

    public final Thread newThread(Runnable runnable)
    {
        runnable = a.newThread(runnable);
        runnable.setName((new StringBuilder("GAC_Executor[")).append(b.getAndIncrement()).append("]").toString());
        return runnable;
    }

    private eger()
    {
        a = Executors.defaultThreadFactory();
        b = new AtomicInteger(0);
    }

    eger(byte byte0)
    {
        this();
    }
}
