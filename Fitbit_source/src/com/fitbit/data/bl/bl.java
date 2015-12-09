// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.fitbit.data.bl:
//            a, SyncService, dg

public class bl extends a
{

    static final String b = "com.fitbit.data.bl.SyncBluetoothSupportStatusTask.ACTION";
    private static final String c = "force";

    public bl()
    {
    }

    public static Intent a(Context context)
    {
        return a(context, false);
    }

    public static Intent a(Context context, boolean flag)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.SyncBluetoothSupportStatusTask.ACTION");
        context.putExtra("com.fitbit.util.service.DispatcherService.AFTER_LOGOUT_TASK_PERRMISSION", true);
        context.putExtra("force", flag);
        return context;
    }

    protected void a(SyncService syncservice, Intent intent)
        throws Exception
    {
        dg.d().z(intent.getBooleanExtra("force", false), this);
    }
}
