// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import java.util.HashSet;
import p.aq.b;
import p.as.e;
import p.aw.a;

// Referenced classes of package com.comscore.utils:
//            r, c, o, e, 
//            p

public class ConnectivityChangeReceiver extends BroadcastReceiver
{

    protected boolean a;
    protected boolean b;
    protected long c;
    protected HashSet d;
    private Runnable e;
    private final b f;

    public ConnectivityChangeReceiver(b b1)
    {
        e = null;
        a = false;
        b = false;
        c = -1L;
        d = null;
        f = b1;
        d = new HashSet();
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = f.aq();
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        b = true;
        if (a && c > 0L)
        {
            a(true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected void a(long l)
    {
        if (!f.aq())
        {
            return;
        } else
        {
            e = new r(this);
            f.s().a(e, l);
            return;
        }
    }

    protected void a(Context context)
    {
        if (f.aq())
        {
            com.comscore.utils.c.a(this, "onConnectedMobile()");
            a("|||cs_3g|||");
            if ((f.ae() == com.comscore.utils.o.a || f.ae() == o.d && com.comscore.utils.e.f(context)) && !a)
            {
                a = true;
                a(false);
                return;
            }
        }
    }

    protected void a(String s)
    {
        while (!f.aq() || !p.f(s) || d == null || d.contains(s)) 
        {
            return;
        }
        if (d.size() != 0)
        {
            f();
        }
        d.add(s);
    }

    protected void a(boolean flag)
    {
        if (f.aq())
        {
            if (b)
            {
                e();
                if (c < SystemClock.uptimeMillis() || c < 0L || !flag)
                {
                    c = SystemClock.uptimeMillis() + 30000L;
                }
                a(c - SystemClock.uptimeMillis());
                com.comscore.utils.c.a(this, (new StringBuilder()).append("scheduleFlushTask(): Flushing in ").append(c - SystemClock.uptimeMillis()).toString());
                return;
            }
            if (c < 0L)
            {
                c = SystemClock.uptimeMillis() + 30000L;
                return;
            }
        }
    }

    protected String b(Context context)
    {
        return com.comscore.utils.e.a(context);
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        b = false;
        e();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void b(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        com.comscore.utils.c.a(this, "flushing");
        f.r(flag);
        c = -1L;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void c()
    {
        if (f.aq())
        {
            com.comscore.utils.c.a(this, "onConnectedWifi()");
            a(b(f.P()));
            if (f.ae() != com.comscore.utils.o.b && f.ae() != com.comscore.utils.o.e && !a)
            {
                a = true;
                a(false);
                return;
            }
        }
    }

    protected void d()
    {
        if (!f.aq())
        {
            return;
        } else
        {
            com.comscore.utils.c.a(this, "onDisconnected()");
            e();
            a = false;
            c = -1L;
            return;
        }
    }

    protected void e()
    {
        if (e != null)
        {
            com.comscore.utils.c.a(this, "cancelFlushTask()");
            f.s().b(e);
            e = null;
        }
    }

    protected void f()
    {
        if (!f.aq())
        {
            return;
        } else
        {
            f.u().a(3000L);
            return;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        if (intent.getExtras() == null) goto _L2; else goto _L1
_L1:
        if (!com.comscore.utils.e.b(context)) goto _L4; else goto _L3
_L3:
        c();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (!com.comscore.utils.e.c(context))
        {
            break MISSING_BLOCK_LABEL_43;
        }
        a(context);
          goto _L2
        context;
        throw context;
        d();
          goto _L2
    }
}
