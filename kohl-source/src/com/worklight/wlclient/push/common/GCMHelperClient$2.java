// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.push.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.worklight.common.Logger;

// Referenced classes of package com.worklight.wlclient.push.common:
//            GCMHelperClient, GCMRegistrationListener, GCMRetryWorker

class tener extends BroadcastReceiver
{

    final GCMHelperClient this$0;
    final GCMRegistrationListener val$listener;

    public void onReceive(Context context, Intent intent)
    {
        GCMHelperClient.access$000(GCMHelperClient.this).debug("Received an Error event from GCM");
        intent = intent.getStringExtra("errorId");
        if (!val$listener.getGcmRetryWorker().isErrorRetriable(intent))
        {
            val$listener.sendErrorMsg(intent, true);
            context.unregisterReceiver(GCMHelperClient.access$100(GCMHelperClient.this));
            context.unregisterReceiver(GCMHelperClient.access$200(GCMHelperClient.this));
            context.unregisterReceiver(GCMHelperClient.access$300(GCMHelperClient.this));
            return;
        } else
        {
            val$listener.getGcmRetryWorker().scheduleRetry();
            context.unregisterReceiver(GCMHelperClient.access$100(GCMHelperClient.this));
            context.unregisterReceiver(GCMHelperClient.access$200(GCMHelperClient.this));
            return;
        }
    }

    tener()
    {
        this$0 = final_gcmhelperclient;
        val$listener = GCMRegistrationListener.this;
        super();
    }
}
