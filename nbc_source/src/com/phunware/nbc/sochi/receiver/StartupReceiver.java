// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.phunware.nbc.sochi.services.FavoriteReminderService;

public class StartupReceiver extends BroadcastReceiver
{

    public StartupReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        context.startService(new Intent("com.phunware.nbc.sochi.action.SCHEDULE_FAVORITES", null, context, com/phunware/nbc/sochi/services/FavoriteReminderService));
    }
}
