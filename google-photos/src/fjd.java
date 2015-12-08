// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class fjd
    implements ThreadFactory
{

    private final String a;
    private final AtomicInteger b = new AtomicInteger();

    public fjd(String s)
    {
        a = s;
    }

    public final Thread newThread(Runnable runnable)
    {
        String s = a;
        int i = b.getAndIncrement();
        return new fje(this, runnable, (new StringBuilder(String.valueOf(s).length() + 19)).append(s).append("-thread-").append(i).toString());
    }
}
