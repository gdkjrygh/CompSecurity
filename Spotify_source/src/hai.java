// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

public abstract class hai
    implements hap
{

    public final Context a;
    public final hak b;
    public volatile int c;
    private ScheduledExecutorService d;
    private AtomicReference e;

    public hai(Context context, ScheduledExecutorService scheduledexecutorservice, hak hak1)
    {
        c = -1;
        a = context;
        d = scheduledexecutorservice;
        b = hak1;
        e = new AtomicReference();
    }

    public final void a(long l, long l1)
    {
        hau hau1;
        boolean flag;
        if (e.get() == null)
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
        hau1 = new hau(a, this);
        CommonUtils.a(a, (new StringBuilder("Scheduling time based file roll over every ")).append(l1).append(" seconds").toString());
        e.set(d.scheduleAtFixedRate(hau1, l, l1, TimeUnit.SECONDS));
        return;
        RejectedExecutionException rejectedexecutionexception;
        rejectedexecutionexception;
        CommonUtils.b(a, "Failed to schedule time based file roll over");
        return;
    }

    public final void b()
    {
        har har1 = a();
        if (har1 != null) goto _L2; else goto _L1
_L1:
        CommonUtils.a(a, "skipping files send because we don't yet know the target endpoint");
_L6:
        return;
_L2:
        List list;
        int i;
        CommonUtils.a(a, "Sending all files");
        list = b.e();
        i = 0;
_L4:
        int k;
        int l;
        k = i;
        l = i;
        if (list.size() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        k = i;
        CommonUtils.a(a, String.format(Locale.US, "attempt to send batch of %d files", new Object[] {
            Integer.valueOf(list.size())
        }));
        k = i;
        boolean flag = har1.a(list);
        int j;
        j = i;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        k = i;
        j = list.size();
        i = j + i;
        b.e.a(list);
        j = i;
        l = j;
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        k = j;
        list = b.e();
        i = j;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        i = k;
_L7:
        CommonUtils.b(a, (new StringBuilder("Failed to send batch of analytics files to server: ")).append(exception.getMessage()).toString());
        l = i;
        if (l != 0) goto _L6; else goto _L5
_L5:
        b.f();
        return;
        exception;
          goto _L7
    }

    public final void c()
    {
        hak hak1 = b;
        hak1.e.a(hak1.e.d());
        hak1.e.e();
    }

    public final void d()
    {
        if (e.get() != null)
        {
            CommonUtils.a(a, "Cancelling time-based rollover because no events are currently being generated.");
            ((ScheduledFuture)e.get()).cancel(false);
            e.set(null);
        }
    }

    public final boolean e()
    {
        boolean flag;
        try
        {
            flag = b.d();
        }
        catch (IOException ioexception)
        {
            CommonUtils.b(a, "Failed to roll file over.");
            return false;
        }
        return flag;
    }
}
