// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push.nna;

import android.content.Context;
import android.content.Intent;
import com.nokia.push.PushBaseIntentService;
import com.skype.android.push.PushConfiguration;
import com.skype.android.push.PushManager;
import com.skype.android.push.PushServiceType;

public class NokiaPushService extends PushBaseIntentService
{

    private PushManager pushManager;

    public NokiaPushService()
    {
    }

    protected String[] getSenderIds(Context context)
    {
        return (new String[] {
            pushManager.getConfiguration().getSenderToken(PushServiceType.NOKIA_NNA)
        });
    }

    public void onCreate()
    {
        super.onCreate();
        pushManager = PushManager.getInstance(getApplicationContext());
    }

    protected void onError(Context context, String s)
    {
        pushManager.onError(PushServiceType.NOKIA_NNA, s);
    }

    protected void onMessage(Context context, Intent intent)
    {
        pushManager.onMessageReceived(PushServiceType.NOKIA_NNA, intent);
    }

    protected boolean onRecoverableError(Context context, String s)
    {
        return false;
    }

    protected void onRegistered(Context context, String s)
    {
        pushManager.onRegistered(PushServiceType.NOKIA_NNA);
    }

    protected void onUnregistered(Context context, String s)
    {
        pushManager.onUnregistered(PushServiceType.NOKIA_NNA);
    }
}
