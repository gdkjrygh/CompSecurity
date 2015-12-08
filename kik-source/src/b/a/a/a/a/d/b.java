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
//            n, s, d, p

public abstract class b
    implements n
{

    protected final Context c;
    protected final d d;
    final ScheduledExecutorService e;
    final AtomicReference f = new AtomicReference();
    volatile int g;

    public b(Context context, ScheduledExecutorService scheduledexecutorservice, d d1)
    {
        g = -1;
        c = context;
        e = scheduledexecutorservice;
        d = d1;
    }

    private void a(long l, long l1)
    {
        s s1;
        Context context;
        boolean flag;
        if (f.get() == null)
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
        s1 = new s(c, this);
        context = c;
        (new StringBuilder("Scheduling time based file roll over every ")).append(l1).append(" seconds");
        j.e(context);
        f.set(e.scheduleAtFixedRate(s1, l, l1, TimeUnit.SECONDS));
        return;
        RejectedExecutionException rejectedexecutionexception;
        rejectedexecutionexception;
        j.a(c, "Failed to schedule time based file roll over");
        return;
    }

    protected final void a(int i)
    {
        g = i;
        a(0L, g);
    }

    public void a(Object obj)
    {
        Context context = c;
        obj.toString();
        j.e(context);
        boolean flag;
        try
        {
            d.a(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            j.a(c, "Failed to write event.");
        }
        if (g != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a(g, g);
        }
    }

    public final void b()
    {
        p p1 = a();
        if (p1 != null) goto _L2; else goto _L1
_L1:
        j.e(c);
_L6:
        return;
_L2:
        List list;
        int i;
        j.e(c);
        list = d.e();
        i = 0;
_L4:
        int l;
        int i1;
        l = i;
        i1 = i;
        if (list.size() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        l = i;
        Context context = c;
        l = i;
        String.format(Locale.US, "attempt to send batch of %d files", new Object[] {
            Integer.valueOf(list.size())
        });
        l = i;
        j.e(context);
        l = i;
        boolean flag = p1.a(list);
        int k;
        k = i;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        l = i;
        k = list.size();
        i = k + i;
        d.a(list);
        k = i;
        i1 = k;
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        l = k;
        list = d.e();
        i = k;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        i = l;
_L7:
        j.a(c, (new StringBuilder("Failed to send batch of analytics files to server: ")).append(exception.getMessage()).toString());
        i1 = i;
        if (i1 != 0) goto _L6; else goto _L5
_L5:
        d.g();
        return;
        exception;
          goto _L7
    }

    public final void c()
    {
        d.f();
    }

    public final void d()
    {
        if (f.get() != null)
        {
            j.e(c);
            ((ScheduledFuture)f.get()).cancel(false);
            f.set(null);
        }
    }

    public final boolean e()
    {
        boolean flag;
        try
        {
            flag = d.d();
        }
        catch (IOException ioexception)
        {
            j.a(c, "Failed to roll file over.");
            return false;
        }
        return flag;
    }
}
