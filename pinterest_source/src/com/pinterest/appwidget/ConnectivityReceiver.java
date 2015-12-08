// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.appwidget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import com.pinterest.base.Application;
import com.pinterest.kit.log.PLog;

// Referenced classes of package com.pinterest.appwidget:
//            PWidgetHelper, PWidgetService

public class ConnectivityReceiver extends BroadcastReceiver
{

    public ConnectivityReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        intent = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        PLog.info((new StringBuilder("ConnectivityReceiver.onReceive : ")).append(intent).toString(), new Object[0]);
        context = PWidgetHelper.getWidgetIds(context);
        if (intent != null && context.length > 0 && PWidgetService.getPinCount() == 0)
        {
            PWidgetHelper.notifyWidgetStateChange(Application.context());
        }
    }
}
