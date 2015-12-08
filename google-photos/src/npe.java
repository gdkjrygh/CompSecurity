// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

public final class npe
{

    final npd a;
    volatile boolean b;
    public volatile long c;
    final AtomicLong d;
    final Runnable e;
    private final Executor f;

    private npe(Executor executor, npd npd, long l)
    {
        b = false;
        d = new AtomicLong(0L);
        e = new npf(this);
        f = executor;
        a = npd;
        c = l;
    }

    npe(npd npd)
    {
        this(a(), npd, 0L);
    }

    npe(npd npd, long l)
    {
        this(a(), npd, l);
    }

    private static Executor a()
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return AsyncTask.THREAD_POOL_EXECUTOR;
        } else
        {
            return null;
        }
    }

    final void a(long l)
    {
label0:
        {
            d.getAndAdd(l);
            if (d.get() == c || !b)
            {
                b = true;
                if (f == null)
                {
                    break label0;
                }
                f.execute(e);
            }
            return;
        }
        (new npg(this)).execute(new Void[0]);
    }
}
