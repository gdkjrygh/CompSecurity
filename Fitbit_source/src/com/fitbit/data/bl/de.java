// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import java.util.Date;
import java.util.UUID;

// Referenced classes of package com.fitbit.data.bl:
//            a, SyncService, dd, dg, 
//            an

public class de extends a
{

    static final String b = "com.fitbit.data.bl.SyncIntradayGraphTask.ACTION";
    public static final String c = "com.fitbit.data.bl.SyncIntradayGraphTask.BROADCAST_ACTION";
    private static final String d = "resourceType";
    private static final String e = "dateStart";
    private static final String f = "dateEnd";
    private static final String g = "force";

    public de()
    {
    }

    public static Intent a(Context context, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date, Date date1, boolean flag)
    {
        return a(context, timeseriesresourcetype, date, date1, flag, null);
    }

    public static Intent a(Context context, com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType timeseriesresourcetype, Date date, Date date1, boolean flag, UUID uuid)
    {
        context = new Intent(context, com/fitbit/data/bl/SyncService);
        context.setAction("com.fitbit.data.bl.SyncIntradayGraphTask.ACTION");
        context.putExtra("resourceType", timeseriesresourcetype.name());
        context.putExtra("dateStart", date);
        context.putExtra("dateEnd", date1);
        context.putExtra("force", flag);
        if (uuid != null)
        {
            context.putExtra("com.fitbit.util.service.DispatcherService.GUID", uuid);
        }
        return context;
    }

    public static final IntentFilter d()
    {
        return new IntentFilter("com.fitbit.data.bl.SyncIntradayGraphTask.BROADCAST_ACTION");
    }

    public void E_()
    {
        this;
        JVM INSTR monitorenter ;
        super.E_();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void a(SyncService syncservice, Intent intent)
        throws Exception
    {
        (new dd(dg.d(), intent.getBooleanExtra("force", false), (Date)intent.getSerializableExtra("dateStart"), (Date)intent.getSerializableExtra("dateEnd"), com.fitbit.data.domain.TimeSeriesObject.TimeSeriesResourceType.valueOf(intent.getStringExtra("resourceType")))).b(this);
        LocalBroadcastManager.getInstance(syncservice.getApplicationContext()).sendBroadcast(new Intent("com.fitbit.data.bl.SyncIntradayGraphTask.BROADCAST_ACTION"));
    }

    public boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = super.a();
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean b()
    {
        return an.a().j();
    }
}
