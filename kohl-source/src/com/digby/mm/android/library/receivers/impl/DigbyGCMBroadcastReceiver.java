// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.receivers.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import com.digby.mm.android.library.services.impl.GCMIntentService;

public class DigbyGCMBroadcastReceiver extends WakefulBroadcastReceiver
{

    public DigbyGCMBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        startWakefulService(context, intent.setComponent(new ComponentName(context.getPackageName(), com/digby/mm/android/library/services/impl/GCMIntentService.getName())));
        setResultCode(-1);
    }
}
