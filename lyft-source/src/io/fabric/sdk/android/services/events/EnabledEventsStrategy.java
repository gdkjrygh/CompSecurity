// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.events;

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

// Referenced classes of package io.fabric.sdk.android.services.events:
//            EventsStrategy, TimeBasedFileRollOverRunnable, EventsFilesManager, FilesSender

public abstract class EnabledEventsStrategy
    implements EventsStrategy
{

    protected final Context b;
    protected final ScheduledExecutorService c;
    protected final EventsFilesManager d;
    protected final AtomicReference e = new AtomicReference();
    protected volatile int f;

    public EnabledEventsStrategy(Context context, ScheduledExecutorService scheduledexecutorservice, EventsFilesManager eventsfilesmanager)
    {
        f = -1;
        b = context;
        c = scheduledexecutorservice;
        d = eventsfilesmanager;
    }

    protected void a(int i)
    {
        f = i;
        a(0, f);
    }

    protected void a(int i, int j)
    {
        try
        {
            TimeBasedFileRollOverRunnable timebasedfilerolloverrunnable = new TimeBasedFileRollOverRunnable(b, this);
            CommonUtils.a(b, (new StringBuilder()).append("Scheduling time based file roll over every ").append(j).append(" seconds").toString());
            e.set(c.scheduleAtFixedRate(timebasedfilerolloverrunnable, i, j, TimeUnit.SECONDS));
            return;
        }
        catch (RejectedExecutionException rejectedexecutionexception)
        {
            CommonUtils.a(b, "Failed to schedule time based file roll over", rejectedexecutionexception);
        }
    }

    public void a(Object obj)
    {
        CommonUtils.a(b, obj.toString());
        try
        {
            d.a(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            CommonUtils.a(b, "Failed to write event.", ((Throwable) (obj)));
        }
        f();
    }

    public void b()
    {
        g();
    }

    public void c()
    {
        d.f();
    }

    public void d()
    {
        if (e.get() != null)
        {
            CommonUtils.a(b, "Cancelling time-based rollover because no events are currently being generated.");
            ((ScheduledFuture)e.get()).cancel(false);
            e.set(null);
        }
    }

    public boolean e()
    {
        boolean flag;
        try
        {
            flag = d.d();
        }
        catch (IOException ioexception)
        {
            CommonUtils.a(b, "Failed to roll file over.", ioexception);
            return false;
        }
        return flag;
    }

    public void f()
    {
        boolean flag1 = true;
        boolean flag;
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

    void g()
    {
        FilesSender filessender;
        int i;
        i = 0;
        filessender = a();
        if (filessender != null) goto _L2; else goto _L1
_L1:
        CommonUtils.a(b, "skipping files send because we don't yet know the target endpoint");
_L6:
        return;
_L2:
        List list;
        CommonUtils.a(b, "Sending all files");
        list = d.e();
        CommonUtils.a(b, String.format(Locale.US, "attempt to send batch of %d files", new Object[] {
            Integer.valueOf(list.size())
        }));
        i = 0;
_L7:
        int j;
        int k;
        j = i;
        k = i;
        if (list.size() <= 0) goto _L4; else goto _L3
_L3:
        k = i;
        boolean flag = filessender.a(list);
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
        if (flag) goto _L5; else goto _L4
_L4:
        if (j == 0)
        {
            d.g();
            return;
        }
          goto _L6
_L5:
        k = j;
        list = d.e();
        i = j;
          goto _L7
        Exception exception;
        exception;
_L8:
        CommonUtils.a(b, (new StringBuilder()).append("Failed to send batch of analytics files to server: ").append(exception.getMessage()).toString(), exception);
        j = i;
          goto _L4
        exception;
        i = k;
          goto _L8
    }
}
