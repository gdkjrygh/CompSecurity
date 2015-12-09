// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer.service;

import android.content.Context;
import com.fitbit.ApplicationForegroundController;
import com.fitbit.data.bl.am;
import com.fitbit.data.bl.dg;
import com.fitbit.e.a;
import com.fitbit.pedometer.l;
import com.fitbit.savedstate.s;
import com.fitbit.util.ar;
import java.util.List;

// Referenced classes of package com.fitbit.pedometer.service:
//            c, PedometerServicesStateListener

public class PedometerServerSyncHelper
{
    public static final class SoftTrackerSyncError extends Enum
    {

        public static final SoftTrackerSyncError a;
        public static final SoftTrackerSyncError b;
        public static final SoftTrackerSyncError c;
        public static final SoftTrackerSyncError d;
        public static final SoftTrackerSyncError e;
        private static final SoftTrackerSyncError f[];

        public static SoftTrackerSyncError valueOf(String s1)
        {
            return (SoftTrackerSyncError)Enum.valueOf(com/fitbit/pedometer/service/PedometerServerSyncHelper$SoftTrackerSyncError, s1);
        }

        public static SoftTrackerSyncError[] values()
        {
            return (SoftTrackerSyncError[])f.clone();
        }

        static 
        {
            a = new SoftTrackerSyncError("NO_NETWORK", 0);
            b = new SoftTrackerSyncError("NO_DATA", 1);
            c = new SoftTrackerSyncError("BACKOFF", 2);
            d = new SoftTrackerSyncError("KEY_EXPIRED", 3);
            e = new SoftTrackerSyncError("SERVER_COMMUNICATION_ERROR", 4);
            f = (new SoftTrackerSyncError[] {
                a, b, c, d, e
            });
        }

        private SoftTrackerSyncError(String s1, int i)
        {
            super(s1, i);
        }
    }


    private static final String a = "PedometerServerSync";

    public PedometerServerSyncHelper()
    {
    }

    public static SoftTrackerSyncError a(Context context, boolean flag)
    {
        Object obj;
        c c1;
        boolean flag1;
        obj = null;
        flag1 = true;
        c1 = c.b(context);
        c1.a(true);
        (new a.a()).a(false);
        if (ar.c(context))
        {
            break MISSING_BLOCK_LABEL_56;
        }
        com.fitbit.e.a.d("PedometerServerSync", "SyncSoftTrackerData not performed: There is no internet connection at current moment.", new Object[0]);
        context = com.fitbit.pedometer.service.SoftTrackerSyncError.a;
        c1.a(false);
        return context;
        context = am.a().c();
        if (ApplicationForegroundController.a().b() || !context.isEmpty())
        {
            break MISSING_BLOCK_LABEL_103;
        }
        com.fitbit.e.a.d("PedometerServerSync", "SyncSoftTrackerData not performed: application is in background and there is no tracker data to sync.", new Object[0]);
        context = SoftTrackerSyncError.b;
        c1.a(false);
        return context;
        if (!s.e())
        {
            break MISSING_BLOCK_LABEL_131;
        }
        com.fitbit.e.a.d("PedometerServerSync", "SyncSoftTrackerData not performed: SoftTracker sync is backed off", new Object[0]);
        context = SoftTrackerSyncError.c;
        c1.a(false);
        return context;
        com.fitbit.e.a.a("PedometerServerSync", "Start SoftTracker sync", new Object[0]);
        if (!l.a())
        {
            break MISSING_BLOCK_LABEL_170;
        }
        com.fitbit.e.a.a("PedometerServerSync", "Tracker key expired.", new Object[0]);
        context = SoftTrackerSyncError.d;
        c1.a(false);
        return context;
        context = dg.d();
        context.a(null, flag);
        flag = flag1;
_L6:
        com.fitbit.e.a.d("PedometerServerSync", (new StringBuilder()).append("Finish softTracker sync with result: ").append(flag).toString(), new Object[0]);
        if (!flag) goto _L2; else goto _L1
_L1:
        context = obj;
_L4:
        c1.a(false);
        return context;
        context;
        com.fitbit.e.a.e("PedometerServerSync", "Unable to sync Pedometer data", context, new Object[0]);
        flag = false;
        continue; /* Loop/switch isn't completed */
_L2:
        context = SoftTrackerSyncError.e;
        if (true) goto _L4; else goto _L3
_L3:
        context;
        c1.a(false);
        throw context;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
