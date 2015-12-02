// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.facebook.analytics.e.i;
import com.facebook.c.k;
import com.facebook.common.hardware.n;
import com.facebook.common.hardware.o;
import com.facebook.common.time.a;
import com.facebook.debug.log.b;
import com.google.common.a.ev;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.ManagedClientConnection;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.conn.tsccm.AbstractConnPool;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.facebook.http.b:
//            i, j, n

public class g extends ThreadSafeClientConnManager
{

    private static final Class a = com/facebook/http/b/g;
    private final Context b;
    private final a c;
    private final com.facebook.common.executors.a d;
    private final PowerManager e;
    private final n f;
    private final ScheduledExecutorService g;
    private final Runnable h = new com.facebook.http.b.i(this, null);
    private final o i;
    private final k j = new k(ev.a("android.intent.action.SCREEN_OFF", new j(this, null)));
    private final Object k = new Object();
    private com.facebook.http.b.n l;
    private long m;

    public g(Context context, HttpParams httpparams, SchemeRegistry schemeregistry, a a1, com.facebook.common.executors.a a2, PowerManager powermanager, n n1, 
            ScheduledExecutorService scheduledexecutorservice, i i1)
    {
        super(httpparams, schemeregistry);
        b = context;
        c = a1;
        d = a2;
        e = powermanager;
        f = n1;
        g = scheduledexecutorservice;
        i = f.a(1, a.getSimpleName());
        context = new IntentFilter();
        for (httpparams = j.b().iterator(); httpparams.hasNext(); context.addAction((String)httpparams.next())) { }
        b.registerReceiver(j, context);
        if (l != null)
        {
            l.a(i1);
        }
    }

    void a()
    {
        com.facebook.debug.log.b.b(a, "onScreenOff()");
        b();
    }

    void b()
    {
        com.facebook.debug.log.b.b(a, "maybeScheduleIdleConnectionsClosure()");
        if (e.isScreenOn())
        {
            com.facebook.debug.log.b.b(a, "Not scheduling idle connection closure because screen is on.");
            return;
        }
        Object obj = k;
        obj;
        JVM INSTR monitorenter ;
        if (c.a() - m <= 100L)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        com.facebook.debug.log.b.b(a, "Scheduling idle connection closure.");
        i.a();
        m = c.a();
        g.schedule(h, 1500L, TimeUnit.MILLISECONDS);
_L1:
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        com.facebook.debug.log.b.b(a, "Not scheduling idle connection closure due to threshold.");
          goto _L1
    }

    void c()
    {
        com.facebook.debug.log.b.b(a, "onDeferredCloseIdleConnections()");
        d.b();
        Object obj = k;
        obj;
        JVM INSTR monitorenter ;
        if (!e.isScreenOn())
        {
            closeIdleConnections(1300L, TimeUnit.MILLISECONDS);
        }
        i.b();
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        i.b();
        throw exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final ClientConnectionOperator createConnectionOperator(SchemeRegistry schemeregistry)
    {
        l = new com.facebook.http.b.n(schemeregistry, null);
        return l;
    }

    protected final AbstractConnPool createConnectionPool(HttpParams httpparams)
    {
        return super.createConnectionPool(httpparams);
    }

    public void releaseConnection(ManagedClientConnection managedclientconnection, long l1, TimeUnit timeunit)
    {
        long l2;
        com.facebook.debug.log.b.b(a, "releaseConnection()");
        l2 = l1;
        if (l1 <= 0L)
        {
            l2 = 0x1d4c0L;
            timeunit = TimeUnit.MILLISECONDS;
        }
        super.releaseConnection(managedclientconnection, l2, timeunit);
        b();
        closeExpiredConnections();
        return;
        managedclientconnection;
        b();
        throw managedclientconnection;
    }

}
