// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.measurement.internal.ac;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.j;
import com.google.android.gms.measurement.internal.w;

// Referenced classes of package com.google.android.gms.measurement:
//            AppMeasurementService

public final class AppMeasurementReceiver extends BroadcastReceiver
{

    static final Object a = new Object();
    static android.os.PowerManager.WakeLock b;
    static Boolean c;

    public AppMeasurementReceiver()
    {
    }

    public static boolean a(Context context)
    {
        u.a(context);
        if (c != null)
        {
            return c.booleanValue();
        } else
        {
            boolean flag = h.a(context, com/google/android/gms/measurement/AppMeasurementReceiver);
            c = Boolean.valueOf(flag);
            return flag;
        }
    }

    public final void onReceive(Context context, Intent intent)
    {
        w w1;
        w1 = ac.a(context).e();
        intent = intent.getAction();
        Intent intent1;
        boolean flag;
        if (j.z())
        {
            w1.g.a("Device AppMeasurementReceiver got", intent);
        } else
        {
            w1.g.a("Local AppMeasurementReceiver got", intent);
        }
        if (!"com.google.android.gms.measurement.UPLOAD".equals(intent)) goto _L2; else goto _L1
_L1:
        flag = AppMeasurementService.a(context);
        intent1 = new Intent(context, com/google/android/gms/measurement/AppMeasurementService);
        intent1.setAction("com.google.android.gms.measurement.UPLOAD");
        intent = ((Intent) (a));
        intent;
        JVM INSTR monitorenter ;
        context.startService(intent1);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        intent;
        JVM INSTR monitorexit ;
_L2:
        return;
        context = (PowerManager)context.getSystemService("power");
        if (b == null)
        {
            context = context.newWakeLock(1, "AppMeasurement WakeLock");
            b = context;
            context.setReferenceCounted(false);
        }
        b.acquire(1000L);
_L3:
        intent;
        JVM INSTR monitorexit ;
        return;
        context;
        intent;
        JVM INSTR monitorexit ;
        throw context;
        context;
        w1.b.a("AppMeasurementService at risk of not starting. For more reliable app measurements, add the WAKE_LOCK permission to your manifest.");
          goto _L3
    }

}
