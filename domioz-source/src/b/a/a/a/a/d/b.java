// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.d;

import android.content.Context;
import b.a.a.a.a.b.l;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package b.a.a.a.a.d:
//            o, t, d, q

public abstract class b
    implements o
{

    protected final Context b;
    protected final ScheduledExecutorService c;
    protected final d d;
    protected final AtomicReference e = new AtomicReference();
    protected volatile int f;

    public b(Context context, ScheduledExecutorService scheduledexecutorservice, d d1)
    {
        f = -1;
        b = context;
        c = scheduledexecutorservice;
        d = d1;
    }

    private void a(int i, int j)
    {
        try
        {
            t t1 = new t(b, this);
            l.a(b, (new StringBuilder("Scheduling time based file roll over every ")).append(j).append(" seconds").toString());
            e.set(c.scheduleAtFixedRate(t1, i, j, TimeUnit.SECONDS));
            return;
        }
        catch (RejectedExecutionException rejectedexecutionexception)
        {
            l.b(b, "Failed to schedule time based file roll over");
        }
    }

    protected final void a(int i)
    {
        f = i;
        a(0, f);
    }

    public final void a(Object obj)
    {
        boolean flag1 = true;
        l.a(b, obj.toString());
        boolean flag;
        try
        {
            d.a(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            l.b(b, "Failed to write event.");
        }
        if (f != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (e.get() != null)
        {
            flag1 = false;
        }
        if (flag && flag1)
        {
            a(f, f);
        }
    }

    public final void b()
    {
        q q1;
        int i;
        i = 0;
        q1 = a();
        if (q1 != null) goto _L2; else goto _L1
_L1:
        l.a(b, "skipping files send because we don't yet know the target endpoint");
_L6:
        return;
_L2:
        List list;
        l.a(b, "Sending all files");
        list = d.e();
        l.a(b, String.format(Locale.US, "attempt to send batch of %d files", new Object[] {
            Integer.valueOf(list.size())
        }));
        i = 0;
_L4:
        int k;
        int i1;
        i1 = i;
        k = i;
        if (list.size() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        k = i;
        boolean flag = q1.a(list);
        int j;
        j = i;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        k = i;
        j = list.size();
        j += i;
        i = j;
        d.a(list);
        i1 = j;
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        k = j;
        list = d.e();
        i = j;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
_L7:
        l.b(b, (new StringBuilder("Failed to send batch of analytics files to server: ")).append(exception.getMessage()).toString());
        i1 = i;
        if (i1 != 0) goto _L6; else goto _L5
_L5:
        d.g();
        return;
        exception;
        i = k;
          goto _L7
    }

    public final void c()
    {
        d.f();
    }

    public final void d()
    {
        if (e.get() != null)
        {
            l.a(b, "Cancelling time-based rollover because no events are currently being generated.");
            ((ScheduledFuture)e.get()).cancel(false);
            e.set(null);
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
            l.b(b, "Failed to roll file over.");
            return false;
        }
        return flag;
    }
}
