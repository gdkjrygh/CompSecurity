// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class arw extends ThreadPoolExecutor
{

    public arw(int i, int j, long l, TimeUnit timeunit, BlockingQueue blockingqueue, String s)
    {
        super(i, j, 0L, timeunit, blockingqueue, new fjd(s));
    }

    public arw(int i, String s)
    {
        this(1, 1, 0L, TimeUnit.MILLISECONDS, ((BlockingQueue) (new LinkedBlockingQueue())), s);
    }

    private arw(int i, ThreadFactory threadfactory)
    {
        super(i, i, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), threadfactory);
    }

    public arw(String s)
    {
        this(1, s);
    }

    public arw(String s, int i)
    {
        this(i, ((ThreadFactory) (new arx(s))));
    }
}
