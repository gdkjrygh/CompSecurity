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

public class cx extends a
{

    public static final String b = "com.fitbit.data.bl.SyncHeartRateMonthAndIntradayDataTask.ACTION";
    public static final String c = "com.fitbit.data.bl.SyncHeartRateMonthDataTask.BROADCAST_ACTION";
    private static final String d = "date";
    private static final String e = "date_range";

    public cx()
    {
    }

    public static Intent a(Context context, Date date, com.fitbit.serverinteraction.PublicAPI.DataRange datarange)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.SyncHeartRateMonthAndIntradayDataTask.ACTION");
        context.putExtra("date", date);
        context.putExtra("date_range", datarange);
        return context;
    }

    public static final IntentFilter c()
    {
        return new IntentFilter("com.fitbit.data.bl.SyncHeartRateMonthDataTask.BROADCAST_ACTION");
    }

    protected void a(SyncService syncservice, Intent intent)
        throws Exception
    {
        dg.d().a(null, (Date)intent.getSerializableExtra("date"), (com.fitbit.serverinteraction.PublicAPI.DataRange)intent.getSerializableExtra("date_range"));
        LocalBroadcastManager.getInstance(syncservice.getApplicationContext()).sendBroadcast(new Intent("com.fitbit.data.bl.SyncHeartRateMonthDataTask.BROADCAST_ACTION"));
        return;
        intent;
        LocalBroadcastManager.getInstance(syncservice.getApplicationContext()).sendBroadcast(new Intent("com.fitbit.data.bl.SyncHeartRateMonthDataTask.BROADCAST_ACTION"));
        throw intent;
    }
}
