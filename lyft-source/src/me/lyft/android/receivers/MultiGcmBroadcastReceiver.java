// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appboy.AppboyGcmReceiver;
import com.appboy.push.AppboyNotificationUtils;
import com.google.android.gms.gcm.GcmReceiver;
import me.lyft.android.analytics.UiAnalytics;
import me.lyft.android.analytics.definitions.Category;
import me.lyft.android.analytics.definitions.UiElement;

public class MultiGcmBroadcastReceiver extends BroadcastReceiver
{

    public MultiGcmBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        (new AppboyGcmReceiver()).onReceive(context, intent);
        (new GcmReceiver()).onReceive(context, intent);
        if (AppboyNotificationUtils.isAppboyPushMessage(intent))
        {
            context = intent.getStringExtra("cid");
            UiAnalytics.trackShown(UiElement.APPBOY_PUSH_NOTIFICATION, Category.APPBOY, context);
        }
    }
}
