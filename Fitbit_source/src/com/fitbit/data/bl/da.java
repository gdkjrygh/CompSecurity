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

public class da extends a
{

    public static final String b = "com.fitbit.data.bl.SyncHeartRateIntradayTimeSeriesAndSummaryTask.ACTION";
    public static final String c = "com.fitbit.data.bl.SyncHeartRateIntradayTimeSeriesAndSummaryTask.BROADCAST_ACTION";
    private static final String d = "date";

    public da()
    {
    }

    public static Intent a(Context context, Date date)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.SyncHeartRateIntradayTimeSeriesAndSummaryTask.ACTION");
        context.putExtra("date", date);
        return context;
    }

    public static final IntentFilter c()
    {
        return new IntentFilter("com.fitbit.data.bl.SyncHeartRateIntradayTimeSeriesAndSummaryTask.BROADCAST_ACTION");
    }

    protected void a(SyncService syncservice, Intent intent)
        throws Exception
    {
        dg.d().a(this, (Date)intent.getSerializableExtra("date"));
        LocalBroadcastManager.getInstance(syncservice.getApplicationContext()).sendBroadcast(new Intent("com.fitbit.data.bl.SyncHeartRateIntradayTimeSeriesAndSummaryTask.BROADCAST_ACTION"));
        return;
        intent;
        LocalBroadcastManager.getInstance(syncservice.getApplicationContext()).sendBroadcast(new Intent("com.fitbit.data.bl.SyncHeartRateIntradayTimeSeriesAndSummaryTask.BROADCAST_ACTION"));
        throw intent;
    }
}
