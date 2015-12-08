// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.crashlytics.android.internal:
//            t, x, ba, j, 
//            c, ck, m, g, 
//            aj, u, bu

final class i
    implements t
{

    private final ScheduledExecutorService a;
    private final j b;
    private final bu c;
    private ScheduledFuture d;
    private int e;
    private m f;

    public i(ScheduledExecutorService scheduledexecutorservice, j j1, bu bu)
    {
        e = -1;
        a = scheduledexecutorservice;
        b = j1;
        c = bu;
    }

    private void a(int k, int l)
    {
        try
        {
            x x1 = new x(b, this);
            ba.c((new StringBuilder("Scheduling time based file roll over every ")).append(l).append(" seconds").toString());
            d = a.scheduleAtFixedRate(x1, k, l, TimeUnit.SECONDS);
            return;
        }
        catch (RejectedExecutionException rejectedexecutionexception)
        {
            ba.d("Crashlytics failed to schedule time based analytics file roll over");
        }
    }

    public final void a()
    {
        if (f != null) goto _L2; else goto _L1
_L1:
        ba.c("skipping analytics files send because we don't yet know the target endpoint");
_L6:
        return;
_L2:
        Object obj;
        int k;
        ba.c("Sending all analytics files");
        obj = b.b();
        k = 0;
_L4:
        int i1;
        int j1;
        i1 = k;
        j1 = k;
        if (((List) (obj)).size() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = k;
        boolean flag = f.a(ck.a(com.crashlytics.android.internal.c.a().w(), false), ((List) (obj)));
        int l;
        l = k;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        i1 = k;
        l = ((List) (obj)).size();
        k = l + k;
        b.a(((List) (obj)));
        l = k;
        i1 = l;
        Locale locale = Locale.US;
        i1 = l;
        k = ((List) (obj)).size();
        if (flag)
        {
            obj = "succeeded";
        } else
        {
            obj = "did not succeed";
        }
        i1 = l;
        ba.c(String.format(locale, "attempt to send batch of %d analytics files %s", new Object[] {
            Integer.valueOf(k), obj
        }));
        j1 = l;
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = l;
        obj = b.b();
        k = l;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        k = i1;
_L7:
        ba.d((new StringBuilder("Crashlytics failed to send batch of analytics files to server: ")).append(exception.getMessage()).toString());
        j1 = k;
        if (j1 != 0) goto _L6; else goto _L5
_L5:
        b.d();
        return;
        exception;
          goto _L7
    }

    public final void a(aj aj1, String s)
    {
        f = new g(s, aj1.a, c);
        b.a(aj1);
        e = aj1.b;
        a(0, e);
    }

    public final void a(u u1)
    {
        boolean flag1 = true;
        ba.c(u1.toString());
        boolean flag;
        try
        {
            b.a(u1);
        }
        // Misplaced declaration of an exception variable
        catch (u u1)
        {
            ba.d("Crashlytics failed to write session event.");
        }
        if (e != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (d != null)
        {
            flag1 = false;
        }
        if (flag && flag1)
        {
            a(e, e);
        }
    }

    public final void b()
    {
        b.c();
    }

    public final void c()
    {
        if (d != null)
        {
            ba.c("Cancelling time-based rollover because no events are currently being generated.");
            d.cancel(false);
            d = null;
        }
    }

    public final void d()
    {
        try
        {
            b.a();
            return;
        }
        catch (IOException ioexception)
        {
            ba.d("Crashlytics failed to roll analytics file over.");
        }
    }
}
