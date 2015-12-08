// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.d;

import android.content.Context;
import b.a.a.a.a.b.j;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package b.a.a.a.a.d:
//            i, n, d, k

public abstract class b
    implements i
{

    public final Context g;
    public final d h;
    final ScheduledExecutorService i;
    final AtomicReference j = new AtomicReference();
    public volatile int k;

    public b(Context context, ScheduledExecutorService scheduledexecutorservice, d d1)
    {
        k = -1;
        g = context;
        i = scheduledexecutorservice;
        h = d1;
    }

    public final void a(long l, long l1)
    {
        n n1;
        Context context;
        boolean flag;
        if (j.get() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        n1 = new n(g, this);
        context = g;
        (new StringBuilder("Scheduling time based file roll over every ")).append(l1).append(" seconds");
        b.a.a.a.a.b.j.e(context);
        j.set(i.scheduleAtFixedRate(n1, l, l1, TimeUnit.SECONDS));
        return;
        RejectedExecutionException rejectedexecutionexception;
        rejectedexecutionexception;
        b.a.a.a.a.b.j.f(g);
        return;
    }

    public final void b()
    {
        k k1 = a();
        if (k1 != null) goto _L2; else goto _L1
_L1:
        b.a.a.a.a.b.j.e(g);
_L6:
        return;
_L2:
        List list;
        int l;
        b.a.a.a.a.b.j.e(g);
        list = h.e();
        l = 0;
_L4:
        int j1;
        int l1;
        j1 = l;
        l1 = l;
        if (list.size() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = l;
        Context context1 = g;
        j1 = l;
        String.format(Locale.US, "attempt to send batch of %d files", new Object[] {
            Integer.valueOf(list.size())
        });
        j1 = l;
        b.a.a.a.a.b.j.e(context1);
        j1 = l;
        boolean flag = k1.a(list);
        int i1;
        i1 = l;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        j1 = l;
        i1 = list.size();
        l = i1 + l;
        h.a(list);
        i1 = l;
        l1 = i1;
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        j1 = i1;
        list = h.e();
        l = i1;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        l = j1;
_L7:
        Context context = g;
        (new StringBuilder("Failed to send batch of analytics files to server: ")).append(exception.getMessage());
        b.a.a.a.a.b.j.f(context);
        l1 = l;
        if (l1 != 0) goto _L6; else goto _L5
_L5:
        h.g();
        return;
        exception;
          goto _L7
    }

    public final void c()
    {
        h.f();
    }

    public final void d()
    {
        if (j.get() != null)
        {
            b.a.a.a.a.b.j.e(g);
            ((ScheduledFuture)j.get()).cancel(false);
            j.set(null);
        }
    }

    public final boolean e()
    {
        boolean flag;
        try
        {
            flag = h.d();
        }
        catch (IOException ioexception)
        {
            b.a.a.a.a.b.j.f(g);
            return false;
        }
        return flag;
    }
}
