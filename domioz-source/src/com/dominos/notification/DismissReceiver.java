// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.dominos.wear.client.WearMessageClient;

public class DismissReceiver extends BroadcastReceiver
{

    WearMessageClient mWearMessageClient;

    public DismissReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null && intent.getAction().equals("com.dominos.intent.action.NOTIFICATION_DISMISSED"))
        {
            mWearMessageClient.checkIsWearPaired(new _cls1());
        }
    }

    private class _cls1
        implements com.dominos.wear.client.WearMessageClient.WearConnectionCallback
    {

        final DismissReceiver this$0;

        public void onConnectionFailed()
        {
        }

        public void onConnectionSuccess()
        {
            mWearMessageClient.sendToWear("/dominos-notification-dismissed", null);
        }

        _cls1()
        {
            this$0 = DismissReceiver.this;
            super();
        }
    }

}
