// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;

// Referenced classes of package com.fitbit.data.bl:
//            a, SyncService, dg, an

public class dl extends a
{

    static final String b = "com.fitbit.data.bl.SyncNotificationsTask.ACTION";
    public static final String c = "com.fitbit.data.bl.SyncNotificationsTask.BROADCAST_ACTION";

    public dl()
    {
    }

    public static Intent a(Context context, boolean flag)
    {
        return a(context, flag, false);
    }

    public static Intent a(Context context, boolean flag, boolean flag1)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.SyncNotificationsTask.ACTION");
        context.putExtra("force", flag);
        context.putExtra("markAsReaded", flag1);
        return context;
    }

    public static final IntentFilter d()
    {
        return new IntentFilter("com.fitbit.data.bl.SyncNotificationsTask.BROADCAST_ACTION");
    }

    protected void a(SyncService syncservice, Intent intent)
        throws Exception
    {
        dg.d().b(intent.getBooleanExtra("force", false), intent.getBooleanExtra("markAsReaded", false), this);
        LocalBroadcastManager.getInstance(syncservice.getApplicationContext()).sendBroadcast(new Intent("com.fitbit.data.bl.SyncNotificationsTask.BROADCAST_ACTION"));
    }

    public boolean b()
    {
        return an.a().j();
    }
}
