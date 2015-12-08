// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.worklight.wlclient.push:
//            WakefulIntentService

public class WLBroadcastReceiver extends BroadcastReceiver
{

    private String serviceName;

    public WLBroadcastReceiver()
    {
        serviceName = "com.worklight.wlclient.push.GCMIntentService";
    }

    public void onReceive(Context context, Intent intent)
    {
        intent.setClassName(context, serviceName);
        WakefulIntentService.sendWakefulWork(context, intent);
    }

    protected void setServiceName(String s)
    {
        serviceName = s;
    }
}
