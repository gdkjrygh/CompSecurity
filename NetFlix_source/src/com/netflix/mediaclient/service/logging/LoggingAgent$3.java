// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            LoggingAgent, IntegratedClientLoggingManager

class this._cls0 extends BroadcastReceiver
{

    final LoggingAgent this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (Log.isLoggable("nf_log", 2))
        {
            Log.v("nf_log", (new StringBuilder()).append("Received intent ").append(intent).toString());
        }
        LoggingAgent.access$000(LoggingAgent.this).handleIntent(intent);
    }

    tLoggingManager()
    {
        this$0 = LoggingAgent.this;
        super();
    }
}
