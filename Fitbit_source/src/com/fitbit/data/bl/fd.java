// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import java.util.Date;

// Referenced classes of package com.fitbit.data.bl:
//            a, SyncService, dg

public class fd extends a
{

    public static final String b = "com.fitbit.data.bl.SyncTimeSeriesTask.ACTION";
    public static final String c = "com.fitbit.data.bl.SyncTimeSeriesTask.BROADCAST_ACTION";
    private static final String d = "SyncTimeSeriesTask.FORCED";
    private static final String e = "SyncTimeSeriesTask.TYPE";
    private static final String f = "SyncTimeSeriesTask.START_DATE";
    private static final String g = "SyncTimeSeriesTask.END_DATE";

    public fd()
    {
    }

    public static Intent a(Context context, boolean flag, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date, Date date1)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.SyncTimeSeriesTask.ACTION");
        context.putExtra("SyncTimeSeriesTask.FORCED", flag);
        context.putExtra("SyncTimeSeriesTask.TYPE", timeseriesresourcetype);
        context.putExtra("SyncTimeSeriesTask.START_DATE", date);
        context.putExtra("SyncTimeSeriesTask.END_DATE", date1);
        return context;
    }

    public static final IntentFilter d()
    {
        return new IntentFilter("com.fitbit.data.bl.SyncTimeSeriesTask.BROADCAST_ACTION");
    }

    protected void a(SyncService syncservice, Intent intent)
        throws Exception
    {
        com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype = (com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType)intent.getSerializableExtra("SyncTimeSeriesTask.TYPE");
        dg.d().a(intent.getBooleanExtra("SyncTimeSeriesTask.FORCED", false), timeseriesresourcetype, (Date)intent.getSerializableExtra("SyncTimeSeriesTask.START_DATE"), (Date)intent.getSerializableExtra("SyncTimeSeriesTask.END_DATE"), null);
        LocalBroadcastManager.getInstance(syncservice.getApplicationContext()).sendBroadcast(new Intent("com.fitbit.data.bl.SyncTimeSeriesTask.BROADCAST_ACTION"));
        return;
        intent;
        LocalBroadcastManager.getInstance(syncservice.getApplicationContext()).sendBroadcast(new Intent("com.fitbit.data.bl.SyncTimeSeriesTask.BROADCAST_ACTION"));
        throw intent;
    }
}
