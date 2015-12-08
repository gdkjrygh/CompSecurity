// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.worklight.common.Logger;
import com.worklight.common.WLConfig;
import java.util.ArrayList;

// Referenced classes of package com.worklight.androidgap.plugin:
//            Push

class > extends BroadcastReceiver
{

    final Push this$0;

    public void onReceive(Context context, Intent intent)
    {
        boolean flag;
        Push.access$000(Push.this).debug("Push: Queuing message for dispatch to javascript");
        flag = intent.getBooleanExtra("notificationBar", false);
        context = Push.access$100(Push.this);
        context;
        JVM INSTR monitorenter ;
        intent = (com.worklight.wlclient.push.ntService.Message)intent.getParcelableExtra("message");
        if (WLConfig.getInstance().isHybridActivityInForeground() && WLConfig.getInstance().isInitComplete())
        {
            Push.access$000(Push.this).debug((new StringBuilder()).append("Push: App on foreground and init completed. Add message from intent to pending: ").append(intent).toString());
            Push.access$100(Push.this).add(intent);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        Push.access$200(Push.this);
        context;
        JVM INSTR monitorexit ;
        if (WLConfig.getInstance().isHybridActivityInForeground())
        {
            Push.access$300(Push.this);
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

    rvice.Message()
    {
        this$0 = Push.this;
        super();
    }
}
