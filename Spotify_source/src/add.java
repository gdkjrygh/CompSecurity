// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

public final class add
{

    ScheduledExecutorService a;
    ScheduledFuture b;
    Runnable c;
    long d;
    long e;
    boolean f;

    public add(Runnable runnable, long l, long l1)
    {
        a = Executors.newSingleThreadScheduledExecutor();
        c = runnable;
        d = l;
        e = l1;
        f = true;
    }
}
