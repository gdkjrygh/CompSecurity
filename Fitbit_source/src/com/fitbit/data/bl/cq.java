// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.util.bg;
import com.fitbit.util.w;
import java.util.Date;
import java.util.UUID;

// Referenced classes of package com.fitbit.data.bl:
//            a, SyncService, SyncDataForDayOperation, dg, 
//            an

public class cq extends a
{

    static final String b = "com.fitbit.data.bl.SyncForDayTask.ACTION";
    public static final String c = "com.fitbit.data.bl.SyncForDayTask.BROADCAST_ACTION";
    public static final int d = 0;
    public static final String e = "EXTRA_SOMETHING_SYNCED";

    public cq()
    {
    }

    public static transient Intent a(Context context, Date date, boolean flag, ResultReceiver resultreceiver, UUID uuid, SyncDataForDayOperation.DailyDataType adailydatatype[])
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.SyncForDayTask.ACTION");
        context.putExtra("date", date);
        context.putExtra("force", flag);
        if (uuid != null)
        {
            context.putExtra("com.fitbit.util.service.DispatcherService.GUID", uuid);
        }
        context.putExtra("dataType", w.b(adailydatatype));
        if (resultreceiver != null)
        {
            context.putExtra("onFinish", resultreceiver);
        }
        return context;
    }

    public static transient Intent a(Context context, Date date, boolean flag, ResultReceiver resultreceiver, SyncDataForDayOperation.DailyDataType adailydatatype[])
    {
        return a(context, date, flag, resultreceiver, null, adailydatatype);
    }

    public static transient Intent a(Context context, Date date, boolean flag, SyncDataForDayOperation.DailyDataType adailydatatype[])
    {
        return a(context, date, flag, null, adailydatatype);
    }

    public static transient Intent a(Context context, Date date, SyncDataForDayOperation.DailyDataType adailydatatype[])
    {
        return a(context, date, false, adailydatatype);
    }

    public static transient void a(Date date, SyncDataForDayOperation.DailyDataType adailydatatype[])
    {
        SyncDataForDayOperation.b(date, adailydatatype);
    }

    public static transient Intent[] b(Context context, Date date, boolean flag, SyncDataForDayOperation.DailyDataType adailydatatype[])
    {
        Intent aintent[] = new Intent[adailydatatype.length];
        int k = adailydatatype.length;
        int j = 0;
        for (int i = 0; j < k; i++)
        {
            aintent[i] = a(context, date, flag, new SyncDataForDayOperation.DailyDataType[] {
                adailydatatype[j]
            });
            j++;
        }

        return aintent;
    }

    public static final IntentFilter c()
    {
        return new IntentFilter("com.fitbit.data.bl.SyncForDayTask.BROADCAST_ACTION");
    }

    protected void a(SyncService syncservice, Intent intent)
        throws Exception
    {
        int j = 0;
        bg bg1;
        Date date;
        String as[];
        SyncDataForDayOperation.DailyDataType adailydatatype[];
        int k;
        boolean flag;
        date = (Date)intent.getSerializableExtra("date");
        flag = intent.getBooleanExtra("force", false);
        dg.d().a(true, flag, this);
        bg1 = new bg();
        bg1.a();
        as = intent.getStringArrayExtra("dataType");
        adailydatatype = new SyncDataForDayOperation.DailyDataType[as.length];
        k = as.length;
        int i = 0;
_L2:
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        adailydatatype[i] = SyncDataForDayOperation.DailyDataType.valueOf(as[j]);
        j++;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        flag = dg.d().a(date, flag, this, adailydatatype);
        intent = (ResultReceiver)intent.getSerializableExtra("onFinish");
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        Bundle bundle = new Bundle(1);
        bundle.putBoolean("EXTRA_SOMETHING_SYNCED", flag);
        intent.send(0, bundle);
        bg1.a("SyncForDayTask");
        LocalBroadcastManager.getInstance(syncservice.getApplicationContext()).sendBroadcast(new Intent("com.fitbit.data.bl.SyncForDayTask.BROADCAST_ACTION"));
        return;
        intent;
        LocalBroadcastManager.getInstance(syncservice.getApplicationContext()).sendBroadcast(new Intent("com.fitbit.data.bl.SyncForDayTask.BROADCAST_ACTION"));
        throw intent;
    }

    public boolean b()
    {
        return an.a().j();
    }
}
