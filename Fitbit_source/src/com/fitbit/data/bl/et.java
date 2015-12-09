// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.fitbit.util.z;

// Referenced classes of package com.fitbit.data.bl:
//            a, SyncService, dg, an

public class et extends a
{

    static final String b = "com.fitbit.data.bl.SyncSleepLogsTask.ACTION";
    public static final String c = "com.fitbit.data.bl.SyncSleepLogsTask.BROADCAST_ACTION";
    private static final String d = "force";
    private static final String e = "offset";
    private static final String f = "count";

    public et()
    {
    }

    public static Intent a(Context context, boolean flag, int i, int j)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.SyncSleepLogsTask.ACTION");
        context.putExtra("force", flag);
        context.putExtra("offset", i);
        context.putExtra("count", j);
        return context;
    }

    public static final IntentFilter d()
    {
        return new IntentFilter("com.fitbit.data.bl.SyncSleepLogsTask.BROADCAST_ACTION");
    }

    protected void a(SyncService syncservice, Intent intent)
        throws Exception
    {
        boolean flag = intent.getBooleanExtra("force", false);
        int i = intent.getIntExtra("offset", 0);
        int j = intent.getIntExtra("count", 10);
        dg.d().b(flag, this, i, j);
        z.a(new Intent("com.fitbit.data.bl.SyncSleepLogsTask.BROADCAST_ACTION"));
        return;
        syncservice;
        z.a(new Intent("com.fitbit.data.bl.SyncSleepLogsTask.BROADCAST_ACTION"));
        throw syncservice;
    }

    public boolean b()
    {
        return an.a().j();
    }
}
