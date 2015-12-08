// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

public final class lgm
{

    final ScheduledExecutorService a;
    ScheduledFuture b;
    String c;

    public lgm()
    {
        this(Executors.newSingleThreadScheduledExecutor());
    }

    public lgm(String s)
    {
        this(Executors.newSingleThreadScheduledExecutor());
        c = s;
    }

    private lgm(ScheduledExecutorService scheduledexecutorservice)
    {
        b = null;
        c = null;
        a = scheduledexecutorservice;
    }
}
