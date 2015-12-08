// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.gcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.TaskStackBuilder;
import com.appboy.e.e;
import com.soundcloud.android.main.MainActivity;

public class AppboyBroadcastReceiver extends BroadcastReceiver
{

    private static final String APPLICATION_ID = "com.soundcloud.android";
    private static final String NOTIFICATION_OPENED = "com.soundcloud.android.intent.APPBOY_NOTIFICATION_OPENED";
    private static final String NOTIFICATION_RECEIVED = "com.soundcloud.android.intent.APPBOY_PUSH_RECEIVED";
    private static final String SOURCE_KEY = "source";
    private static final String TAG = "AppboyBroadcastReceiver";

    public AppboyBroadcastReceiver()
    {
    }

    private Bundle getPushExtrasBundle(Intent intent)
    {
        Bundle bundle1 = intent.getBundleExtra("extra");
        Bundle bundle = bundle1;
        if (bundle1 == null)
        {
            bundle = new Bundle();
        }
        bundle.putString("cid", intent.getStringExtra("cid"));
        bundle.putString("source", "Appboy");
        return bundle;
    }

    private Intent getStartActivityIntent(Context context, Bundle bundle)
    {
        context = new Intent(context, com/soundcloud/android/main/MainActivity);
        context.setFlags(0x34000000);
        if (bundle != null)
        {
            context.putExtras(bundle);
        }
        return context;
    }

    private Intent getUriIntent(Intent intent, Bundle bundle)
    {
        return (new Intent("android.intent.action.VIEW", Uri.parse(intent.getStringExtra("uri")))).putExtras(bundle);
    }

    private void handleNotificationOpened(Context context, Intent intent)
    {
        Bundle bundle = getPushExtrasBundle(intent);
        if (intent.getStringExtra("uri") != null)
        {
            startDeepLinkActivities(context, intent, bundle);
            return;
        } else
        {
            context.startActivity(getStartActivityIntent(context, bundle));
            return;
        }
    }

    private void handleNotificationReceived(Intent intent)
    {
        e.c(intent.getExtras());
    }

    private void startDeepLinkActivities(Context context, Intent intent, Bundle bundle)
    {
        TaskStackBuilder taskstackbuilder = TaskStackBuilder.create(context);
        taskstackbuilder.addNextIntent(getStartActivityIntent(context, bundle));
        taskstackbuilder.addNextIntent(getUriIntent(intent, bundle));
        taskstackbuilder.startActivities(bundle);
    }

    public void onReceive(Context context, Intent intent)
    {
        String s = intent.getAction();
        if ("com.soundcloud.android.intent.APPBOY_PUSH_RECEIVED".equals(s))
        {
            handleNotificationReceived(intent);
        } else
        if ("com.soundcloud.android.intent.APPBOY_NOTIFICATION_OPENED".equals(s))
        {
            handleNotificationOpened(context, intent);
            return;
        }
    }
}
