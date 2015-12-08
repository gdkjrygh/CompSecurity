// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.push.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.worklight.common.Logger;

// Referenced classes of package com.worklight.wlclient.push.common:
//            GCMAPIClient, GCMRegistrationListener, GCMRetryWorker

class val.gcmSenderId extends BroadcastReceiver
{

    final GCMAPIClient this$0;
    final String val$gcmSenderId;
    final GCMRegistrationListener val$listener;

    public void onReceive(Context context, Intent intent)
    {
        GCMAPIClient.access$000().debug("Received an Retry event from GCM");
        if (!val$listener.getGcmRetryWorker().validateIntent(intent))
        {
            return;
        } else
        {
            GCMAPIClient.access$100(GCMAPIClient.this, val$gcmSenderId, val$listener);
            return;
        }
    }

    Listener()
    {
        this$0 = final_gcmapiclient;
        val$listener = gcmregistrationlistener;
        val$gcmSenderId = String.this;
        super();
    }
}
