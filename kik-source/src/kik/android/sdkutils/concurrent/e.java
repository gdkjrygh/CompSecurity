// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.sdkutils.concurrent;

import com.kik.g.p;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package kik.android.sdkutils.concurrent:
//            f

public abstract class e
    implements Callable
{

    protected p a;
    protected Object b;
    protected boolean c;
    private ScheduledExecutorService d;
    private ScheduledFuture e;

    public e(Object obj)
    {
        b = obj;
        c = false;
        d = Executors.newSingleThreadScheduledExecutor();
    }

    public abstract p a();

    public final void a(Object obj)
    {
        b = obj;
    }

    public final p b()
    {
        p p1 = new p();
        c();
        e = d.schedule(new f(this, p1), 500L, TimeUnit.MILLISECONDS);
        return p1;
    }

    public final void c()
    {
        if (e != null)
        {
            e.cancel(true);
        }
        if (a != null)
        {
            c = true;
            a.e();
        }
    }

    public Object call()
    {
        return a();
    }
}
