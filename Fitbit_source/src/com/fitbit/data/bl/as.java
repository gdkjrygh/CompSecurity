// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import com.fitbit.util.service.b;
import java.util.Date;

// Referenced classes of package com.fitbit.data.bl:
//            SyncService, dg, an

public class as extends b
{

    static final String a = "com.fitbit.data.bl.SaveFoodPlan.ACTION";

    public as()
    {
    }

    public static Intent a(Context context)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.SaveFoodPlan.ACTION");
        return context;
    }

    protected void a(SyncService syncservice, Intent intent, ResultReceiver resultreceiver)
        throws Exception
    {
        dg.d().b(this);
        dg.d().b(true, this);
        dg.d().a(new Date(), true, this, new SyncDataForDayOperation.DailyDataType[] {
            SyncDataForDayOperation.DailyDataType.c
        });
        dg.d().a(new Date(), true, this);
    }

    public boolean b()
    {
        return an.a().j();
    }
}
