// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.h;

import com.kik.g.e;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package kik.a.h:
//            l

public class k
{

    protected long a;
    private ScheduledExecutorService b;
    private ScheduledFuture c;
    private com.kik.g.k d;

    public k(long l1)
    {
        b = Executors.newScheduledThreadPool(1);
        a = l1;
        d = new com.kik.g.k(this);
    }

    static ScheduledFuture a(k k1)
    {
        k1.c = null;
        return null;
    }

    static com.kik.g.k b(k k1)
    {
        return k1.d;
    }

    public boolean a()
    {
        c = b.schedule(new l(this), b(), TimeUnit.MILLISECONDS);
        return c != null;
    }

    protected long b()
    {
        return a;
    }

    public void c()
    {
        if (c != null)
        {
            c.cancel(true);
            c = null;
        }
    }

    public final boolean d()
    {
        return c != null;
    }

    public final e e()
    {
        return d.a();
    }
}
