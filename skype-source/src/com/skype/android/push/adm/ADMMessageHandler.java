// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push.adm;

import android.content.Intent;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.skype.android.push.PushManager;
import com.skype.android.push.PushServiceType;

public class ADMMessageHandler extends ADMMessageHandlerBase
{

    private PushManager pushManager;

    public ADMMessageHandler()
    {
        super(com/skype/android/push/adm/ADMMessageHandler.getName());
    }

    public void onCreate()
    {
        super.onCreate();
        pushManager = PushManager.getInstance(getApplicationContext());
    }

    protected void onMessage(Intent intent)
    {
        if (intent == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        pushManager.onMessageReceived(PushServiceType.AMAZON_ADM, intent);
        return;
        intent;
        intent.printStackTrace();
        return;
    }

    protected void onRegistered(String s)
    {
        pushManager.onRegistered(PushServiceType.AMAZON_ADM);
    }

    protected void onRegistrationError(String s)
    {
        pushManager.onError(PushServiceType.AMAZON_ADM, s);
    }

    protected void onUnregistered(String s)
    {
        pushManager.onUnregistered(PushServiceType.AMAZON_ADM);
    }
}
