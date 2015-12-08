// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer.service;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.FitBitApplication;

// Referenced classes of package com.fitbit.pedometer.service:
//            c

public class PedometerServicesStateListener
{
    public static final class PedometerServicesState extends Enum
    {

        public static final PedometerServicesState a;
        public static final PedometerServicesState b;
        public static final PedometerServicesState c;
        private static final PedometerServicesState d[];

        public static PedometerServicesState valueOf(String s)
        {
            return (PedometerServicesState)Enum.valueOf(com/fitbit/pedometer/service/PedometerServicesStateListener$PedometerServicesState, s);
        }

        public static PedometerServicesState[] values()
        {
            return (PedometerServicesState[])d.clone();
        }

        static 
        {
            a = new PedometerServicesState("IDLE", 0);
            b = new PedometerServicesState("SYNCING_WITH_SERVER", 1);
            c = new PedometerServicesState("LIVE_DATA_STREAMING", 2);
            d = (new PedometerServicesState[] {
                a, b, c
            });
        }

        private PedometerServicesState(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String a = "com.fitbit.pedometer.service.PEDOMETER_SERVICES_STATE_CHANGED";
    protected Context b;
    private PedometerServicesState c;
    private boolean d;
    private boolean e;

    public PedometerServicesStateListener()
    {
    }

    public static PedometerServicesStateListener a()
    {
        return a(FitBitApplication.a().getApplicationContext());
    }

    public static PedometerServicesStateListener a(Context context)
    {
        return com.fitbit.pedometer.service.c.b(context);
    }

    private void a(PedometerServicesState pedometerservicesstate)
    {
        this;
        JVM INSTR monitorenter ;
        PedometerServicesState pedometerservicesstate1 = c;
        if (pedometerservicesstate1 != pedometerservicesstate) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        c = pedometerservicesstate;
        e();
        if (true) goto _L1; else goto _L3
_L3:
        pedometerservicesstate;
        throw pedometerservicesstate;
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        if (!d) goto _L2; else goto _L1
_L1:
        a(PedometerServicesState.b);
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!e)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        a(PedometerServicesState.c);
          goto _L3
        Exception exception;
        exception;
        throw exception;
        a(PedometerServicesState.a);
          goto _L3
    }

    private void e()
    {
        LocalBroadcastManager.getInstance(b).sendBroadcast(new Intent("com.fitbit.pedometer.service.PEDOMETER_SERVICES_STATE_CHANGED"));
    }

    void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = d;
        if (flag != flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        d = flag;
        d();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    void b(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = e;
        if (flag != flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        e = flag;
        d();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public PedometerServicesState c()
    {
        this;
        JVM INSTR monitorenter ;
        PedometerServicesState pedometerservicesstate = c;
        this;
        JVM INSTR monitorexit ;
        return pedometerservicesstate;
        Exception exception;
        exception;
        throw exception;
    }
}
