// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

public final class ade
{

    ScheduledExecutorService a;
    ScheduledFuture b;
    Runnable c;

    public ade(ScheduledExecutorService scheduledexecutorservice, Runnable runnable)
    {
        a = scheduledexecutorservice;
        c = runnable;
    }
}
