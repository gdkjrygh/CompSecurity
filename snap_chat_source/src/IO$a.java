// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

static final class mPriority
    implements ThreadFactory
{

    private static final AtomicInteger sGlobalCount = new AtomicInteger(0);
    private final AtomicInteger mCount = new AtomicInteger(0);
    private final String mName;
    private final int mPriority;

    public final Thread newThread(Runnable runnable)
    {
        int i = mCount.incrementAndGet();
        int j = sGlobalCount.incrementAndGet();
        Timber.b("ScExecutors", "Creating new thread in %s pool, local count:%d, global count:%d", new Object[] {
            mName, Integer.valueOf(i), Integer.valueOf(j)
        });
        return new Thread(new PK(runnable, mPriority), String.format("%s-Pool-%d", new Object[] {
            mName, Integer.valueOf(i)
        }));
    }


    public >(String s, int i)
    {
        mName = s;
        mPriority = i;
    }
}
