// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.common;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class CancelNotification extends BroadcastReceiver
{

    public CancelNotification()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        int i = intent.getIntExtra("notificationId", 0);
        ((NotificationManager)context.getSystemService("notification")).cancel(i);
    }
}
