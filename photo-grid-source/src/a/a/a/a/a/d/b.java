// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.d;

import a.a.a.a.a.b.l;
import android.content.Context;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package a.a.a.a.a.d:
//            j, o, d, l

public abstract class b
    implements j
{

    protected final Context g;
    protected final d h;
    final ScheduledExecutorService i;
    final AtomicReference j = new AtomicReference();
    volatile int k;

    public b(Context context, ScheduledExecutorService scheduledexecutorservice, d d1)
    {
        k = -1;
        g = context;
        i = scheduledexecutorservice;
        h = d1;
    }

    private void a(long l1, long l2)
    {
        o o1;
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
        o1 = new o(g, this);
        context = g;
        (new StringBuilder("Scheduling time based file roll over every ")).append(l2).append(" seconds");
        l.e(context);
        j.set(i.scheduleAtFixedRate(o1, l1, l2, TimeUnit.SECONDS));
        return;
        RejectedExecutionException rejectedexecutionexception;
        rejectedexecutionexception;
        l.a(g, "Failed to schedule time based file roll over");
        return;
    }

    protected final void a(int i1)
    {
        k = i1;
        a(0L, k);
    }

    public final void a(Object obj)
    {
        Context context = g;
        obj.toString();
        l.e(context);
        boolean flag;
        try
        {
            h.a(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            l.a(g, "Failed to write event.");
        }
        if (k != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a(k, k);
        }
    }

    public final void b()
    {
        a.a.a.a.a.d.l l1 = a();
        if (l1 != null) goto _L2; else goto _L1
_L1:
        l.e(g);
_L6:
        return;
_L2:
        List list;
        int i1;
        l.e(g);
        list = h.e();
        i1 = 0;
_L4:
        int k1;
        int i2;
        k1 = i1;
        i2 = i1;
        if (list.size() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        k1 = i1;
        Context context = g;
        k1 = i1;
        String.format(Locale.US, "attempt to send batch of %d files", new Object[] {
            Integer.valueOf(list.size())
        });
        k1 = i1;
        l.e(context);
        k1 = i1;
        boolean flag = l1.a(list);
        int j1;
        j1 = i1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        k1 = i1;
        j1 = list.size();
        i1 = j1 + i1;
        h.a(list);
        j1 = i1;
        i2 = j1;
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        k1 = j1;
        list = h.e();
        i1 = j1;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        i1 = k1;
_L7:
        l.a(g, (new StringBuilder("Failed to send batch of analytics files to server: ")).append(exception.getMessage()).toString());
        i2 = i1;
        if (i2 != 0) goto _L6; else goto _L5
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
            l.e(g);
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
            l.a(g, "Failed to roll file over.");
            return false;
        }
        return flag;
    }
}
