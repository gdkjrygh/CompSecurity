// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.b;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package b.a.a.a.a.b:
//            q, s

public final class p
{

    public static final ThreadFactory a(String s1)
    {
        return new q(s1, new AtomicLong(1L));
    }

    public static final void a(String s1, ExecutorService executorservice)
    {
        TimeUnit timeunit = TimeUnit.SECONDS;
        Runtime.getRuntime().addShutdownHook(new Thread(new s(s1, executorservice, timeunit), (new StringBuilder("Crashlytics Shutdown Hook for ")).append(s1).toString()));
    }
}
