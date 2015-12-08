// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fitbit.data.bl.ag;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.fitbit.galileo.service:
//            GalileoSyncService

class a extends BroadcastReceiver
{

    final GalileoSyncService a;

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if ("com.fitbit.util.service.DispatcherService.SERVICE_FINISHED_TASK".equals(context))
        {
            context = (UUID)intent.getSerializableExtra("com.fitbit.util.service.DispatcherService.GUID");
            a.a(context);
        } else
        if ("com.fitbit.FitbitMobile.BluetoothSupportStatusController.ACTION_SUPPORT_STATUS_CHANGED".equals(context))
        {
            ag.b().execute(a);
            return;
        }
    }

    (GalileoSyncService galileosyncservice)
    {
        a = galileosyncservice;
        super();
    }
}
