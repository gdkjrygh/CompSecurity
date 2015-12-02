// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.hardware;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.google.common.a.ik;
import com.google.common.base.Preconditions;
import java.util.Map;

// Referenced classes of package com.facebook.common.hardware:
//            r, s, t

public class q
{

    private final Context a;
    private final PowerManager b;
    private final Map c = ik.c();
    private final BroadcastReceiver d = new r(this);
    private final BroadcastReceiver e = new s(this);
    private Boolean f;

    public q(Context context, PowerManager powermanager)
    {
        a = (Context)Preconditions.checkNotNull(context);
        b = (PowerManager)Preconditions.checkNotNull(powermanager);
    }

    static Boolean a(q q1, Boolean boolean1)
    {
        q1.f = boolean1;
        return boolean1;
    }

    static Map a(q q1)
    {
        return q1.c;
    }

    private void a(Context context, String s1, BroadcastReceiver broadcastreceiver)
    {
        s1 = new IntentFilter(s1);
        s1.setPriority(999);
        context.registerReceiver(broadcastreceiver, s1);
    }

    public void a(t t)
    {
        this;
        JVM INSTR monitorenter ;
        if (c.isEmpty())
        {
            a(a, "android.intent.action.SCREEN_ON", d);
            a(a, "android.intent.action.SCREEN_OFF", e);
        }
        c.put(t, Boolean.TRUE);
        this;
        JVM INSTR monitorexit ;
        return;
        t;
        this;
        JVM INSTR monitorexit ;
        throw t;
    }

    public boolean a()
    {
        if (f != null)
        {
            return f.booleanValue();
        } else
        {
            return b();
        }
    }

    public void b(t t)
    {
        this;
        JVM INSTR monitorenter ;
        if (!c.isEmpty())
        {
            break MISSING_BLOCK_LABEL_17;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        c.remove(t);
        if (c.isEmpty())
        {
            a.unregisterReceiver(d);
            a.unregisterReceiver(e);
            f = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        t;
        this;
        JVM INSTR monitorexit ;
        throw t;
    }

    public boolean b()
    {
        return b.isScreenOn();
    }
}
