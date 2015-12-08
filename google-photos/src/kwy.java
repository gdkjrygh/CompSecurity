// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class kwy
    implements ThreadFactory
{

    private final AtomicInteger a = new AtomicInteger(1);
    private String b;

    kwy(String s)
    {
        b = s;
        super();
    }

    public final Thread newThread(Runnable runnable)
    {
        return new Thread(runnable, (new StringBuilder("AdWorker(")).append(b).append(") #").append(a.getAndIncrement()).toString());
    }
}
