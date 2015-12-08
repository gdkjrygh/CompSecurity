// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.comscore.analytics.Core;
import com.comscore.applications.KeepAliveAlarmReceiver;
import java.util.HashSet;
import java.util.Timer;

// Referenced classes of package com.comscore.utils:
//            CSLog, TransmissionMode, c, Connectivity, 
//            Utils

public class ConnectivityChangeReceiver extends BroadcastReceiver
{

    protected boolean a;
    protected boolean b;
    protected long c;
    protected HashSet d;
    private Timer e;
    private final Core f;

    public ConnectivityChangeReceiver(Core core)
    {
        e = null;
        a = false;
        b = false;
        c = -1L;
        d = null;
        f = core;
        d = new HashSet();
    }

    protected void a()
    {
        CSLog.d(this, "onConnectedWifi()");
        a(b(f.getAppContext()));
        if (f.getOfflineTransmissionMode() != TransmissionMode.NEVER && f.getOfflineTransmissionMode() != TransmissionMode.DISABLED && !a)
        {
            a = true;
            a(false);
        }
    }

    protected void a(long l)
    {
        e = new Timer();
        e.schedule(new c(this), l);
    }

    protected void a(Context context)
    {
        CSLog.d(this, "onConnectedMobile()");
        a("|||cs_3g|||");
        if ((f.getOfflineTransmissionMode() == TransmissionMode.DEFAULT || f.getOfflineTransmissionMode() == TransmissionMode.PIGGYBACK && Connectivity.isDataConnected(context)) && !a)
        {
            a = true;
            a(false);
        }
    }

    protected void a(String s)
    {
        if (Utils.isNotEmpty(s) && d != null && !d.contains(s))
        {
            d();
            d.add(s);
        }
    }

    protected void a(boolean flag)
    {
        if (b)
        {
            c();
            if (c < SystemClock.uptimeMillis() || c < 0L || !flag)
            {
                c = SystemClock.uptimeMillis() + 30000L;
            }
            a(c - SystemClock.uptimeMillis());
            CSLog.d(this, (new StringBuilder()).append("startFlushCacheTimer(): Flushing in ").append(c - SystemClock.uptimeMillis()).toString());
        } else
        if (c < 0L)
        {
            c = SystemClock.uptimeMillis() + 30000L;
            return;
        }
    }

    protected String b(Context context)
    {
        return Connectivity.getCurrentSSID(context);
    }

    protected void b()
    {
        CSLog.d(this, "onDisconnected()");
        c();
        a = false;
        c = -1L;
    }

    protected void b(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        CSLog.d(this, "flushing");
        f.flush(flag);
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
        if (e != null)
        {
            CSLog.d(this, "cancelTimer()");
            e.cancel();
            e = null;
        }
    }

    protected void d()
    {
        f.getKeepAliveAlarmReceiver().reset(3000L);
    }

    public void onReceive(Context context, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        if (intent.getExtras() == null) goto _L2; else goto _L1
_L1:
        if (!Connectivity.isConnectedWiFi(context)) goto _L4; else goto _L3
_L3:
        a();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (!Connectivity.isConnectedMobile(context))
        {
            break MISSING_BLOCK_LABEL_43;
        }
        a(context);
          goto _L2
        context;
        throw context;
        b();
          goto _L2
    }

    public void start()
    {
        this;
        JVM INSTR monitorenter ;
        b = true;
        if (a && c > 0L)
        {
            a(true);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void stop()
    {
        this;
        JVM INSTR monitorenter ;
        b = false;
        c();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
