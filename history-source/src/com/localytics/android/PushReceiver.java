// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.localytics.android:
//            LocalyticsSession

public class PushReceiver extends BroadcastReceiver
{

    public PushReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        context = new LocalyticsSession(context);
        if (intent.getAction().equals("com.google.android.c2dm.intent.REGISTRATION"))
        {
            context.handleRegistration(intent);
        } else
        if (intent.getAction().equals("com.google.android.c2dm.intent.RECEIVE"))
        {
            context.handleNotificationReceived(intent);
            return;
        }
    }
}
