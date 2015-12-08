// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.tagmanager.ak;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.internal:
//            kn, kc, km

public final class ko
{

    private final ScheduledExecutorService a;
    private ScheduledFuture b;
    private String c;
    private boolean d;

    public ko()
    {
        this(Executors.newSingleThreadScheduledExecutor());
    }

    public ko(String s)
    {
        this(Executors.newSingleThreadScheduledExecutor());
        c = s;
    }

    private ko(ScheduledExecutorService scheduledexecutorservice)
    {
        b = null;
        c = null;
        a = scheduledexecutorservice;
        d = false;
    }

    public final void a(Context context, kc kc, km km)
    {
        this;
        JVM INSTR monitorenter ;
        ak.b();
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        context = new kn(context, kc, km, c);
_L1:
        b = a.schedule(context, 0L, TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
        return;
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
        context = new kn(context, kc, km);
          goto _L1
    }
}
