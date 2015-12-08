// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ak, bq, de, aj

final class br
    implements db.b
{
    static interface a
    {

        public abstract bq a(de de);
    }

    static interface b
    {

        public abstract ScheduledExecutorService a();
    }


    private final String a;
    private final Context b;
    private final ScheduledExecutorService c;
    private final a d;
    private ScheduledFuture e;
    private boolean f;
    private de g;
    private String h;
    private aj i;

    public br(Context context, String s, de de)
    {
        this(context, s, de, (byte)0);
    }

    private br(Context context, String s, de de, byte byte0)
    {
        g = de;
        b = context;
        a = s;
        c = (new b() {

            final br a;

            public final ScheduledExecutorService a()
            {
                return Executors.newSingleThreadScheduledExecutor();
            }

            
            {
                a = br.this;
                super();
            }
        }).a();
        d = new a() {

            final br a;

            public final bq a(de de1)
            {
                return new bq(br.a(a), br.b(a), de1);
            }

            
            {
                a = br.this;
                super();
            }
        };
    }

    static Context a(br br1)
    {
        return br1.b;
    }

    static String b(br br1)
    {
        return br1.a;
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (f)
        {
            throw new IllegalStateException("called method after closed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        b();
        if (e != null)
        {
            e.cancel(false);
        }
        c.shutdown();
        f = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        (new StringBuilder("loadAfterDelay: containerId=")).append(a).append(" delay=0");
        ak.b();
        b();
        if (i == null)
        {
            throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
        }
        break MISSING_BLOCK_LABEL_53;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        if (e != null)
        {
            e.cancel(false);
        }
        ScheduledExecutorService scheduledexecutorservice = c;
        bq bq1 = d.a(g);
        bq1.a(i);
        bq1.a(h);
        bq1.b(s);
        e = scheduledexecutorservice.schedule(bq1, 0L, TimeUnit.MILLISECONDS);
        this;
        JVM INSTR monitorexit ;
    }

    public final void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        b();
        h = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }
}
