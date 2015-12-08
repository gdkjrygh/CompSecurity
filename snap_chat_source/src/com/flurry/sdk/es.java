// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.flurry.sdk:
//            dt, do, er

public class es extends BroadcastReceiver
{

    private static es e;
    boolean a;
    Boolean b;
    private final dt c = new dt();
    private boolean d;

    public es()
    {
        d = false;
    }

    public static es a()
    {
        com/flurry/sdk/es;
        JVM INSTR monitorenter ;
        es es1;
        if (e == null)
        {
            e = new es();
        }
        es1 = e;
        com/flurry/sdk/es;
        JVM INSTR monitorexit ;
        return es1;
        Exception exception;
        exception;
        throw exception;
    }

    private boolean a(Context context)
    {
        if (!d || context == null)
        {
            return true;
        }
        context = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        return context != null && context.isConnected();
    }

    private List f()
    {
        this;
        JVM INSTR monitorenter ;
        List list = c.a();
        this;
        JVM INSTR monitorexit ;
        return list;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(er er1)
    {
        this;
        JVM INSTR monitorenter ;
        c.a(er1);
        this;
        JVM INSTR monitorexit ;
        return;
        er1;
        throw er1;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        Context context = com.flurry.sdk.do.a().b();
        boolean flag;
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        a = a(context);
        if (d)
        {
            d();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean c()
    {
        if (b != null)
        {
            return b.booleanValue();
        } else
        {
            return a;
        }
    }

    void d()
    {
        Context context = com.flurry.sdk.do.a().b();
        a = a(context);
        context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = a(context);
        if (a != flag)
        {
            a = flag;
            for (context = f().iterator(); context.hasNext(); ((er)context.next()).a(a)) { }
        }
    }
}
