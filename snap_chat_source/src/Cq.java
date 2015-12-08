// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import com.snapchat.android.Timber;
import com.snapchat.android.util.debug.ReleaseManager;

public final class Cq
{

    public long a;
    public long b;
    public final int c;
    public final Object d = new Object();
    private final int e;
    private final int f;
    private long g;

    public Cq(int i, int j, int k)
    {
        a = -1L;
        b = 0L;
        g = 0L;
        c = i;
        e = j;
        f = k;
    }

    public final void a()
    {
        if (b <= (long)f)
        {
            return;
        }
        if (g == 0L)
        {
            g = b;
        } else
        {
            g = (g - (g >> e)) + (b >> e);
        }
        if (ReleaseManager.f())
        {
            Timber.c("BandwidthSampler", "Bandwidth %d bps", new Object[] {
                Long.valueOf(8000L * g >> c)
            });
        }
        b = 0L;
    }

    public final long b()
    {
        if (SystemClock.elapsedRealtime() >> c > a)
        {
            synchronized (d)
            {
                a();
            }
        }
        return 8000L * g >> c;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
