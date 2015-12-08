// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.comscore.utils.TransmissionMode;
import java.util.HashSet;
import java.util.Timer;

public final class ajq extends BroadcastReceiver
{

    private Timer a;
    private final aif b;
    private boolean c;
    private boolean d;
    private long e;
    private HashSet f;

    public ajq(aif aif1)
    {
        a = null;
        c = false;
        d = false;
        e = -1L;
        f = null;
        b = aif1;
        f = new HashSet();
    }

    private void a(String s)
    {
        while (!b.N || !ajy.f(s) || f == null || f.contains(s)) 
        {
            return;
        }
        if (b.N)
        {
            b.c.a(3000L);
        }
        f.add(s);
    }

    private void a(boolean flag)
    {
        if (b.N)
        {
            if (d)
            {
                d();
                if (e < SystemClock.uptimeMillis() || e < 0L || !flag)
                {
                    e = SystemClock.uptimeMillis() + 30000L;
                }
                long l = e;
                long l1 = SystemClock.uptimeMillis();
                if (b.N)
                {
                    a = new Timer();
                    a.schedule(new akc(this), l - l1);
                }
                ajn.a(this, (new StringBuilder("startFlushCacheTimer(): Flushing in ")).append(e - SystemClock.uptimeMillis()).toString());
                return;
            }
            if (e < 0L)
            {
                e = SystemClock.uptimeMillis() + 30000L;
                return;
            }
        }
    }

    private void d()
    {
        if (a != null)
        {
            ajn.a(this, "cancelTimer()");
            a.cancel();
            a = null;
        }
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b.N;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        d = true;
        if (c && e > 0L)
        {
            a(true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        d = false;
        d();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected final void c()
    {
        this;
        JVM INSTR monitorenter ;
        ajn.a(this, "flushing");
        b.o();
        e = -1L;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void onReceive(Context context, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        if (intent.getExtras() == null) goto _L2; else goto _L1
_L1:
        if (!ajp.b(context)) goto _L4; else goto _L3
_L3:
        if (b.N)
        {
            ajn.a(this, "onConnectedWifi()");
            a(ajp.a(b.C));
            if (b.K != TransmissionMode.b && b.K != TransmissionMode.e && !c)
            {
                c = true;
                a(false);
            }
        }
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (!ajp.c(context)) goto _L6; else goto _L5
_L5:
        if (b.N)
        {
            ajn.a(this, "onConnectedMobile()");
            a("|||cs_3g|||");
            if ((b.K == TransmissionMode.a || b.K == TransmissionMode.d && ajp.f(context)) && !c)
            {
                c = true;
                a(false);
            }
        }
          goto _L2
        context;
        throw context;
_L6:
        if (!b.N) goto _L2; else goto _L7
_L7:
        ajn.a(this, "onDisconnected()");
        d();
        c = false;
        e = -1L;
          goto _L2
    }
}
