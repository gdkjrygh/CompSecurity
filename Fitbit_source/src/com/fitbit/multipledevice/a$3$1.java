// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.multipledevice;

import android.content.Intent;
import com.fitbit.e.a;
import com.fitbit.util.threading.FitbitHandlerThread;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.multipledevice:
//            a, MultipleDeviceMode

class a
    implements Runnable
{

    final pi.SyncTrigger.a a;

    public void run()
    {
        com.fitbit.multipledevice.a.a(a.a, com.fitbit.serverinteraction.irApi.SyncTrigger.a, false, false);
    }

    t>(t> t>)
    {
        a = t>;
        super();
    }

    // Unreferenced inner class com/fitbit/multipledevice/a$3

/* anonymous class */
    class a._cls3 extends c
    {

        final com.fitbit.multipledevice.a a;

        protected void a(Intent intent)
        {
            com.fitbit.multipledevice.a a1 = a;
            a1;
            JVM INSTR monitorenter ;
            String s = intent.getAction();
            if (com.fitbit.multipledevice.a.a(a) == com.fitbit.multipledevice.MultipleDeviceMode.a) goto _L2; else goto _L1
_L1:
            if (!"com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_FOREGROUND".equals(s)) goto _L4; else goto _L3
_L3:
            intent = com.fitbit.ApplicationForegroundController.LaunchType.b(intent);
            if (com.fitbit.multipledevice.a.a(a) != com.fitbit.multipledevice.MultipleDeviceMode.a && (com.fitbit.multipledevice.a.a(a) == MultipleDeviceMode.d || intent == com.fitbit.ApplicationForegroundController.LaunchType.b))
            {
                com.fitbit.e.a.a("MultipleDeviceController", "Application switched from background. Trying to start force sync with 1 sec offset...", new Object[0]);
                FitbitHandlerThread.a(new a._cls3._cls1(this), 1000L);
            }
            com.fitbit.multipledevice.a.b(a);
_L2:
            return;
_L4:
            if (!"com.fitbit.ApplicationForegroundController.APP_PROBABLY_SWITCHED_TO_FOREGROUND".equals(s)) goto _L6; else goto _L5
_L5:
            com.fitbit.multipledevice.a.c(a);
              goto _L2
            intent;
            a1;
            JVM INSTR monitorexit ;
            throw intent;
_L6:
            if (!"com.fitbit.data.bl.SyncPendingActivityLogsOperation.ACTIVITY_LOGS_SYNCED".equals(s)) goto _L2; else goto _L7
_L7:
            com.fitbit.e.a.a("MultipleDeviceController", "Activity logs changed", new Object[0]);
            com.fitbit.multipledevice.a.a(a, com.fitbit.serverinteraction.SynclairApi.SyncTrigger.a, false, false);
              goto _L2
        }

            
            {
                a = a1;
                super();
            }
    }

}
