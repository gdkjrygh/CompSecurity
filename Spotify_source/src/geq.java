// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class geq
{

    public ScheduledExecutorService a;
    Handler b;
    public Map c;

    public geq()
    {
        a = Executors.newSingleThreadScheduledExecutor();
        b = new Handler();
        c = new HashMap();
    }

    public final void a(Runnable runnable)
    {
        Object obj = new ger(this, runnable);
        obj = a.scheduleAtFixedRate(((Runnable) (obj)), 200L, 200L, TimeUnit.MILLISECONDS);
        c.put(runnable, obj);
    }

    public final void b(Runnable runnable)
    {
        ScheduledFuture scheduledfuture = (ScheduledFuture)c.get(runnable);
        if (scheduledfuture == null)
        {
            return;
        } else
        {
            c.remove(runnable);
            scheduledfuture.cancel(false);
            return;
        }
    }
}
