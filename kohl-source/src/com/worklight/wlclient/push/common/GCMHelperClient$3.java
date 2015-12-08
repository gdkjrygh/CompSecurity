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

class val.gcmSenderId extends BroadcastReceiver
{

    final GCMHelperClient this$0;
    final Context val$context;
    final String val$gcmSenderId;
    final GCMRegistrationListener val$listener;

    public void onReceive(Context context1, Intent intent)
    {
        GCMHelperClient.access$000(GCMHelperClient.this).debug("Received a retry event from GCM");
        if (!val$listener.getGcmRetryWorker().validateIntent(intent))
        {
            return;
        } else
        {
            register(val$context, val$gcmSenderId, val$listener);
            return;
        }
    }

    tener()
    {
        this$0 = final_gcmhelperclient;
        val$listener = gcmregistrationlistener;
        val$context = context1;
        val$gcmSenderId = String.this;
        super();
    }
}
