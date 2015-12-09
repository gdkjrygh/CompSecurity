// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.d;

import android.content.Context;
import b.a.a.a.a.b.l;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package b.a.a.a.a.d:
//            n, d, i, h, 
//            j, k, o

public abstract class g
    implements n
{

    protected final Context a;
    protected final ScheduledExecutorService b;
    protected o c;

    public g(Context context, o o, d d1, ScheduledExecutorService scheduledexecutorservice)
    {
        a = context.getApplicationContext();
        b = scheduledexecutorservice;
        c = o;
        d1.a(this);
    }

    protected abstract o a();

    public final void a(Object obj)
    {
        obj = new i(this, obj);
        try
        {
            b.submit(((Runnable) (obj))).get();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            l.b(a, "Failed to run events task");
        }
    }

    public final void a(Object obj, boolean flag)
    {
        a(((Runnable) (new h(this, obj, flag))));
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
            l.b(a, "Failed to submit events task");
        }
    }

    public final void b()
    {
        a(new j(this));
    }

    public final void c()
    {
        a(new k(this));
    }
}
