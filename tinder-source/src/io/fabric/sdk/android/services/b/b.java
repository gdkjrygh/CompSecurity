// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.b;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package io.fabric.sdk.android.services.b:
//            h, m, d, j

public abstract class b
    implements h
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
        m m1;
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
            break MISSING_BLOCK_LABEL_83;
        }
        m1 = new m(g, this);
        CommonUtils.a(g, (new StringBuilder("Scheduling time based file roll over every ")).append(l1).append(" seconds").toString());
        j.set(i.scheduleAtFixedRate(m1, l, l1, TimeUnit.SECONDS));
        return;
        RejectedExecutionException rejectedexecutionexception;
        rejectedexecutionexception;
        CommonUtils.b(g, "Failed to schedule time based file roll over");
        return;
    }

    public final void b()
    {
        j j1 = a();
        if (j1 != null) goto _L2; else goto _L1
_L1:
        CommonUtils.a(g, "skipping files send because we don't yet know the target endpoint");
_L6:
        return;
_L2:
        List list;
        int l;
        CommonUtils.a(g, "Sending all files");
        list = h.e();
        l = 0;
_L4:
        int k1;
        int l1;
        k1 = l;
        l1 = l;
        if (list.size() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        k1 = l;
        CommonUtils.a(g, String.format(Locale.US, "attempt to send batch of %d files", new Object[] {
            Integer.valueOf(list.size())
        }));
        k1 = l;
        boolean flag = j1.a(list);
        int i1;
        i1 = l;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        k1 = l;
        i1 = list.size();
        l = i1 + l;
        h.a(list);
        i1 = l;
        l1 = i1;
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        k1 = i1;
        list = h.e();
        l = i1;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        l = k1;
_L7:
        CommonUtils.b(g, (new StringBuilder("Failed to send batch of analytics files to server: ")).append(exception.getMessage()).toString());
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
            CommonUtils.a(g, "Cancelling time-based rollover because no events are currently being generated.");
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
            CommonUtils.b(g, "Failed to roll file over.");
            return false;
        }
        return flag;
    }
}
