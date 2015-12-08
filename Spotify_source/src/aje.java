// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.comscore.applications.EventType;
import java.util.Calendar;
import java.util.HashMap;

public final class aje extends BroadcastReceiver
{

    public long a;
    private String b;
    private long c;
    private long d;
    private aif e;
    private boolean f;
    private boolean g;

    public aje(aif aif1)
    {
        c = -1L;
        f = false;
        g = false;
        a = 0x5265c00L;
        d = a;
        e = aif1;
        b = (new StringBuilder()).append(getClass().getName()).append(".").append(aif1.m()).toString();
        IntentFilter intentfilter = new IntentFilter(b);
        aif1.C.registerReceiver(this, intentfilter);
    }

    private static long a(ajx ajx1)
    {
        long l1 = 0L;
        ajx1 = ajx1.b("lastTransmission");
        long l = l1;
        if (ajx1 != null)
        {
            l = l1;
            if (ajx1.length() > 0)
            {
                try
                {
                    l = Long.parseLong(ajx1);
                }
                // Misplaced declaration of an exception variable
                catch (ajx ajx1)
                {
                    return 0L;
                }
            }
        }
        return l;
    }

    private void a(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e.N;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(c);
        ((AlarmManager)context.getSystemService("alarm")).setRepeating(0, calendar.getTimeInMillis(), a, c());
        g = true;
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }

    private void a(boolean flag)
    {
        if (e.N && e.F)
        {
            aju aju1 = e.a;
            long l = a(e.b);
            l = System.currentTimeMillis() - l;
            Log.d("KeepAlive", (new StringBuilder("processKeepAlive(")).append(flag).append(") timeSinceLastTransmission=").append(l).append(" currentTimeout=").append(d).toString());
            if (l > d - 1000L)
            {
                Log.d("KeepAlive", "Sending Keep-alive");
                if (!flag)
                {
                    e.a(EventType.f, new HashMap(), true);
                } else
                {
                    aju1.a(EventType.f, null);
                }
                e.b.a("lastTransmission", String.valueOf(System.currentTimeMillis()));
                return;
            }
        }
    }

    private PendingIntent c()
    {
        return PendingIntent.getBroadcast(e.C, 0, new Intent(b), 0x10000000);
    }

    public final void a()
    {
        Log.d("KeepAlive", "stop");
        f = false;
        b();
        a(true);
    }

    public final void a(int i)
    {
        if (e.N)
        {
            b();
            f = true;
            Log.d("KeepAlive", (new StringBuilder("start(")).append(i).append(")").toString());
            if (e.F)
            {
                Context context = e.C;
                if (context != null)
                {
                    long l = System.currentTimeMillis();
                    if (c < l)
                    {
                        c = l + (long)i;
                    }
                    a(context);
                    return;
                }
            }
        }
    }

    public final void a(long l)
    {
        if (e.N)
        {
            b();
            Log.d("KeepAlive", (new StringBuilder("reset:")).append(l).toString());
            c = System.currentTimeMillis() + l;
            d = l;
            if (f)
            {
                a(0);
                return;
            }
        }
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        Context context;
        Log.d("KeepAlive", "cancel()");
        context = e.C;
        if (context != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ((AlarmManager)context.getSystemService("alarm")).cancel(c());
        g = false;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void onReceive(Context context, Intent intent)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e.N;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (g)
        {
            Log.d("KeepAlive", "onReceive()");
            a(false);
        }
        if (true) goto _L1; else goto _L3
_L3:
        context;
        throw context;
    }
}
