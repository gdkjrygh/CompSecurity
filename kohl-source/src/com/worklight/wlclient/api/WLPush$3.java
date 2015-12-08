// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.worklight.common.Logger;
import com.worklight.wlclient.push.GCMIntentService;
import java.util.ArrayList;

// Referenced classes of package com.worklight.wlclient.api:
//            WLPush

class nit> extends BroadcastReceiver
{

    final WLPush this$0;

    public void onReceive(Context context, Intent intent)
    {
        boolean flag;
        WLPush.access$200().debug("Successfully received message for dispatching");
        flag = intent.getBooleanExtra("notificationBar", false);
        context = WLPush.access$300(WLPush.this);
        context;
        JVM INSTR monitorenter ;
        intent = (com.worklight.wlclient.push.Service.Message)intent.getParcelableExtra("message");
        if (!GCMIntentService.isAppForeground() || flag)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        WLPush.access$200().debug((new StringBuilder()).append("Push: App on foreground. Add message from intent to pending: ").append(intent).toString());
        WLPush.access$300(WLPush.this).add(intent);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        WLPush.access$400(WLPush.this);
        context;
        JVM INSTR monitorexit ;
        if (GCMIntentService.isAppForeground())
        {
            WLPush.access$500(WLPush.this);
        }
        if (!flag)
        {
            setResultCode(-1);
        }
        return;
        intent;
        context;
        JVM INSTR monitorexit ;
        throw intent;
    }

    tService()
    {
        this$0 = WLPush.this;
        super();
    }
}
