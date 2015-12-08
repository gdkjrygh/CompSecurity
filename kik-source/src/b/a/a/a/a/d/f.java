// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.d;

import android.content.Context;
import b.a.a.a.a.b.j;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package b.a.a.a.a.d:
//            m, d, h, g, 
//            i, j, n

public abstract class f
    implements m
{

    protected final Context a;
    protected final ScheduledExecutorService b;
    protected n c;

    public f(Context context, n n, d d1, ScheduledExecutorService scheduledexecutorservice)
    {
        a = context.getApplicationContext();
        b = scheduledexecutorservice;
        c = n;
        d1.a(this);
    }

    protected abstract n a();

    public final void a(Object obj)
    {
        obj = new h(this, obj);
        try
        {
            b.submit(((Runnable) (obj))).get();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            j.a(a, "Failed to run events task");
        }
    }

    public final void a(Object obj, boolean flag)
    {
        a(((Runnable) (new g(this, obj, flag))));
    }

    protected final void a(Runnable runnable)
    {
        try
        {
            b.submit(runnable);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Runnable runnable)
        {
            j.a(a, "Failed to submit events task");
        }
    }

    public final void b()
    {
        a(new i(this));
    }

    public final void c()
    {
        a(new b.a.a.a.a.d.j(this));
    }
}
