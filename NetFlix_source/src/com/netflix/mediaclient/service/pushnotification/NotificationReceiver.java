// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.pushnotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.StringUtils;

public final class NotificationReceiver extends BroadcastReceiver
{

    private static final String TAG = "nf_push";

    public NotificationReceiver()
    {
    }

    private Intent createIntent(Context context, Intent intent, String s)
    {
        s = new Intent(s);
        s.setClass(context, com/netflix/mediaclient/service/NetflixService);
        s.addCategory("com.netflix.mediaclient.intent.category.PUSH");
        context = intent.getStringExtra("guid");
        if (StringUtils.isEmpty(context))
        {
            Log.e("nf_push", "Received notification WITHOUT Event GUID! Do nothing!");
            return null;
        }
        s.putExtra("guid", context);
        String s1 = intent.getStringExtra("messageGuid");
        if (StringUtils.isEmpty(context))
        {
            Log.e("nf_push", "Received notification WITHOUT GUID! Do nothing!");
            return null;
        }
        s.putExtra("messageGuid", s1);
        context = intent.getStringExtra("originator");
        if (StringUtils.isEmpty(context))
        {
            Log.w("nf_push", "Received notification WITHOUT oorigin!");
            return s;
        } else
        {
            s.putExtra("originator", context);
            return s;
        }
    }

    private void handleBrowserRedirectNotification(Context context, Intent intent)
    {
        Log.d("nf_push", "received notification browser redirect");
        Intent intent1 = createIntent(context, intent, "com.netflix.mediaclient.intent.action.NOTIFICATION_BROWSER_REDIRECT");
        if (intent1 != null)
        {
            intent = intent.getStringExtra("target_url");
            if (intent != null)
            {
                intent1.putExtra("target_url", intent);
            }
            context.startService(intent1);
        }
    }

    private void handleCanceledNotification(Context context, Intent intent)
    {
        Log.d("nf_push", "received notification canceled");
        intent = createIntent(context, intent, "com.netflix.mediaclient.intent.action.NOTIFICATION_CANCELED");
        if (intent != null)
        {
            context.startService(intent);
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        if (Log.isLoggable("nf_push", 3))
        {
            AndroidUtils.logIntent("nf_push", intent);
            Log.d("nf_push", (new StringBuilder()).append("Received an action: ").append(intent.getAction()).toString());
        }
        if ("com.netflix.mediaclient.intent.action.NOTIFICATION_CANCELED".equals(intent.getAction()))
        {
            handleCanceledNotification(context, intent);
            return;
        }
        if ("com.netflix.mediaclient.intent.action.NOTIFICATION_BROWSER_REDIRECT".equals(intent.getAction()))
        {
            handleBrowserRedirectNotification(context, intent);
            return;
        } else
        {
            Log.d("nf_push", "Not supported!");
            return;
        }
    }
}
