// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.services.impl;

import android.app.IntentService;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.events.impl.PushCallbackEvent;
import com.digby.mm.android.library.receivers.impl.DigbyGCMBroadcastReceiver;
import com.digby.mm.android.library.utils.Logger;
import com.google.android.gms.gcm.GoogleCloudMessaging;

public class GCMIntentService extends IntentService
{

    private static final String DEFAULT_DEVICE_TOKEN = "73696d756c61746f72";
    public static final int NOTIFICATION_ID = 1;
    public static final String TAG = "GCMIntentService";
    private NotificationManager mNotificationManager;

    public GCMIntentService()
    {
        super("GCMIntentService");
    }

    private void sendNotification(Intent intent, String s)
    {
        long l;
        try
        {
            s = intent.getStringExtra("callbackData");
            intent = intent.getStringExtra("notification");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            Logger.Error("GCMIntentService_onMessage", intent);
            return;
        }
        l = -1L;
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        l = Long.parseLong(intent);
        intent = new PushCallbackEvent(this, l, s);
        DigbyController.getInstance(this).sendEvent(intent, null);
        return;
    }

    protected void onHandleIntent(Intent intent)
    {
        Bundle bundle;
        String s;
        bundle = intent.getExtras();
        s = GoogleCloudMessaging.getInstance(this).getMessageType(intent);
        break MISSING_BLOCK_LABEL_14;
        if (!bundle.isEmpty() && !"send_error".equals(s) && !"deleted_messages".equals(s) && "gcm".equals(s))
        {
            sendNotification(intent, bundle.toString());
            Log.i("GCMIntentService", (new StringBuilder()).append("Received: ").append(bundle.toString()).toString());
        }
        DigbyGCMBroadcastReceiver.completeWakefulIntent(intent);
        return;
    }
}
