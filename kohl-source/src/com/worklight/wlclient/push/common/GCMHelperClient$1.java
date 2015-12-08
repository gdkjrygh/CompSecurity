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
        intent = intent.getStringExtra("registrationId");
        GCMHelperClient.access$000(GCMHelperClient.this).debug((new StringBuilder()).append("Successfully registered.Returned deviceToken: ").append(intent).toString());
        val$listener.sendToken(intent);
        val$listener.getGcmRetryWorker().resetBackOff();
        context.unregisterReceiver(GCMHelperClient.access$100(GCMHelperClient.this));
        context.unregisterReceiver(GCMHelperClient.access$200(GCMHelperClient.this));
        context.unregisterReceiver(GCMHelperClient.access$300(GCMHelperClient.this));
    }

    tener()
    {
        this$0 = final_gcmhelperclient;
        val$listener = GCMRegistrationListener.this;
        super();
    }
}
