// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import com.fitbit.e.a;
import com.fitbit.savedstate.f;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.serverinteraction.restrictions.RestrictionsController;
import com.fitbit.util.service.b;

// Referenced classes of package com.fitbit.data.bl:
//            SyncService, ar, an

public class n extends b
{

    static final String a = "com.fitbit.data.bl.DatabaseMaintananceTask.ACTION";
    private static final String b = "DatabaseMaintananceTask";
    private static final String c = "com.fitbit.data.bl.DatabaseMaintananceTask.EXTRA_FORCED";
    private static boolean d = false;

    public n()
    {
    }

    public static Intent a(Context context, boolean flag)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.DatabaseMaintananceTask.ACTION");
        context.putExtra("com.fitbit.data.bl.DatabaseMaintananceTask.EXTRA_FORCED", flag);
        return context;
    }

    protected void a(SyncService syncservice, Intent intent, ResultReceiver resultreceiver)
        throws Exception
    {
        boolean flag;
        boolean flag2;
        flag = false;
        flag2 = intent.getBooleanExtra("com.fitbit.data.bl.DatabaseMaintananceTask.EXTRA_FORCED", false);
        syncservice = ServerGateway.a();
        if (flag2) goto _L2; else goto _L1
_L1:
        boolean flag1;
        long l;
        long l1;
        long l2;
        try
        {
            syncservice.b().b();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            com.fitbit.e.a.a("DatabaseMaintananceTask", intent.toString(), new Object[0]);
        }
        if (!syncservice.f() || !syncservice.d())
        {
            break MISSING_BLOCK_LABEL_199;
        }
        com/fitbit/data/bl/n;
        JVM INSTR monitorenter ;
        if (d) goto _L4; else goto _L3
_L3:
        d = true;
        flag1 = true;
_L7:
        com/fitbit/data/bl/n;
        JVM INSTR monitorexit ;
_L5:
        for (; !flag1; flag1 = false)
        {
            break MISSING_BLOCK_LABEL_135;
        }

        l = System.currentTimeMillis();
        l1 = f.h();
        l2 = f.i();
        if (!flag2 && l - l1 <= l2)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        com.fitbit.data.bl.ar.a().a(f.j());
        com.fitbit.data.bl.ar.a().b();
        flag = true;
        com/fitbit/data/bl/n;
        JVM INSTR monitorenter ;
        d = false;
        com/fitbit/data/bl/n;
        JVM INSTR monitorexit ;
        if (flag)
        {
            f.a(l);
        }
        return;
        syncservice;
        com/fitbit/data/bl/n;
        JVM INSTR monitorexit ;
        throw syncservice;
_L2:
        flag1 = syncservice.f();
          goto _L5
        syncservice;
        com/fitbit/data/bl/n;
        JVM INSTR monitorexit ;
        throw syncservice;
        syncservice;
        com/fitbit/data/bl/n;
        JVM INSTR monitorenter ;
        d = false;
        com/fitbit/data/bl/n;
        JVM INSTR monitorexit ;
        throw syncservice;
        syncservice;
        com/fitbit/data/bl/n;
        JVM INSTR monitorexit ;
        throw syncservice;
_L4:
        flag1 = false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean b()
    {
        return com.fitbit.data.bl.an.a().j();
    }

}
