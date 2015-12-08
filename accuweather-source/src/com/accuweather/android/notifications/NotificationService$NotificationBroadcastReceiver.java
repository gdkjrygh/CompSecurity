// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.accuweather.android.notifications:
//            NotificationService

public static class  extends BroadcastReceiver
{

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null && intent.getAction() != null)
        {
            intent = intent.getAction();
            if (intent.equals("accuwx.intent.action.REMOVE_NOTIFICATION"))
            {
                context.stopService(new Intent(context, com/accuweather/android/notifications/NotificationService));
            } else
            if (NotificationService.access$000(intent, context))
            {
                context.startService((new Intent(context, com/accuweather/android/notifications/NotificationService)).setAction(intent));
                return;
            }
        }
    }

    public ()
    {
    }
}
