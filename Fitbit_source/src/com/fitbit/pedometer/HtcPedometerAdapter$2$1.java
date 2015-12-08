// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer;

import com.fitbit.FitBitApplication;
import com.fitbit.e.a;
import com.htc.lib2.activeservice.HtcActiveManager;
import com.htc.lib2.activeservice.ServiceConnectionListener;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.pedometer:
//            HtcPedometerAdapter, e

class a
    implements Runnable
{

    final a a;

    public void run()
    {
        Object obj;
        boolean flag;
        boolean flag1;
        flag1 = false;
        com.fitbit.e.a.d("HtcPedometerAdapter", "Connected to HtcActiveManager.", new Object[0]);
        com.fitbit.pedometer.HtcPedometerAdapter.a(a.a, false);
        Iterator iterator;
        teServiceCommand teservicecommand;
        int i;
        try
        {
            com.fitbit.e.a.a("HtcPedometerAdapter", "Checking if HtcActiveManager is enabled...", new Object[0]);
            HtcPedometerAdapter.b(a.a, HtcPedometerAdapter.b(a.a).isEnabled());
            com.fitbit.e.a.a("HtcPedometerAdapter", "HtcActiveManager is enabled = %s", new Object[] {
                Boolean.valueOf(HtcPedometerAdapter.c(a.a))
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.fitbit.e.a.d("HtcPedometerAdapter", "Unable to check if HtcActiveManager is enabled", ((Throwable) (obj)), new Object[0]);
            HtcPedometerAdapter.b(a.a, false);
        }
        obj = HtcPedometerAdapter.d(a.a);
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        if (!HtcPedometerAdapter.e(a.a).contains(teServiceCommand.b) && !HtcPedometerAdapter.e(a.a).contains(com.fitbit.pedometer.teServiceCommand.a))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (HtcPedometerAdapter.c(a.a) || flag)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        HtcPedometerAdapter.c(a.a, true);
        com.fitbit.e.a.a("HtcPedometerAdapter", "Pending commands: %s", new Object[] {
            HtcPedometerAdapter.e(a.a)
        });
        iterator = HtcPedometerAdapter.e(a.a).iterator();
        flag = false;
_L11:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        teservicecommand = (teServiceCommand)iterator.next();
        i = com.fitbit.pedometer.teServiceCommand[teservicecommand.ordinal()];
        i;
        JVM INSTR tableswitch 1 6: default 288
    //                   1 325
    //                   2 339
    //                   3 353
    //                   4 367
    //                   5 430
    //                   6 421;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        if (false)
        {
        }
        continue; /* Loop/switch isn't completed */
_L4:
        HtcPedometerAdapter.d(a.a, true);
        continue; /* Loop/switch isn't completed */
_L5:
        HtcPedometerAdapter.d(a.a, false);
        continue; /* Loop/switch isn't completed */
_L6:
        HtcPedometerAdapter.c(a.a, true);
        continue; /* Loop/switch isn't completed */
_L7:
        HtcPedometerAdapter.c(a.a, false);
        continue; /* Loop/switch isn't completed */
_L2:
        HtcPedometerAdapter.e(a.a).clear();
        obj;
        JVM INSTR monitorexit ;
        if (flag)
        {
            a.a.a(flag1);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L8:
        flag1 = true;
_L9:
        flag = true;
        if (true) goto _L11; else goto _L10
_L10:
    }

    istener(istener istener)
    {
        a = istener;
        super();
    }

    // Unreferenced inner class com/fitbit/pedometer/HtcPedometerAdapter$2

/* anonymous class */
    class HtcPedometerAdapter._cls2
        implements ServiceConnectionListener
    {

        final HtcPedometerAdapter a;

        public void onConnected()
        {
            com.fitbit.pedometer.e.a(new HtcPedometerAdapter._cls2._cls1(this));
        }

        public void onDisconnected()
        {
            com.fitbit.e.a.a("HtcPedometerAdapter", "Disconnected from HtcActiveService.", new Object[0]);
            com.fitbit.pedometer.HtcPedometerAdapter.a(a, false);
            com.fitbit.pedometer.HtcPedometerAdapter.a(a, new HtcActiveManager(FitBitApplication.a()));
        }

            
            {
                a = htcpedometeradapter;
                super();
            }
    }

}
