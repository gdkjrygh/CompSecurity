// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class ljf
    implements ThreadFactory
{

    private static final AtomicInteger a = new AtomicInteger();

    ljf()
    {
    }

    public final Thread newThread(Runnable runnable)
    {
        return new ljg(runnable, (new StringBuilder("measurement-")).append(a.incrementAndGet()).toString());
    }

}
