// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.appboy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.TaskStackBuilder;
import com.appboy.push.AppboyNotificationUtils;
import me.lyft.android.logging.L;
import me.lyft.android.ui.MainActivity;

public class AppboyBroadcastReceiver extends BroadcastReceiver
{

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
        return bundle;
    }

    private Intent getStartMainActivityIntent(Context context, Bundle bundle)
    {
        context = new Intent(context, me/lyft/android/ui/MainActivity);
        context.setFlags(0x34000000);
        if (bundle != null)
        {
            context.putExtras(bundle);
        }
        return context;
    }

    public void onReceive(Context context, Intent intent)
    {
        String s1 = context.getPackageName();
        String s = (new StringBuilder()).append(s1).append(".intent.APPBOY_PUSH_RECEIVED").toString();
        s1 = (new StringBuilder()).append(s1).append(".intent.APPBOY_NOTIFICATION_OPENED").toString();
        String s2 = intent.getAction();
        L.d((new StringBuilder()).append("AppboyBroadcastReceiver received an intent with action: ").append(s2).toString(), new Object[0]);
        if (s.equals(s2))
        {
            L.d("AppboyBroadcastReceiver Received push notification.", new Object[0]);
            if (AppboyNotificationUtils.isUninstallTrackingPush(intent.getExtras()))
            {
                L.d("AppboyBroadcastReceiver got uninstall tracking push", new Object[0]);
            }
            return;
        }
        if (s1.equals(s2))
        {
            Bundle bundle = getPushExtrasBundle(intent);
            if (intent.getStringExtra("uri") != null)
            {
                intent = (new Intent("android.intent.action.VIEW", Uri.parse(intent.getStringExtra("uri")))).putExtras(bundle);
                TaskStackBuilder taskstackbuilder = TaskStackBuilder.create(context);
                taskstackbuilder.addNextIntent(getStartMainActivityIntent(context, bundle));
                taskstackbuilder.addNextIntent(intent);
                taskstackbuilder.startActivities(bundle);
                return;
            } else
            {
                context.startActivity(getStartMainActivityIntent(context, bundle));
                return;
            }
        } else
        {
            L.d((new StringBuilder()).append("AppboyBroadcastReceiver : ").append(String.format("Ignoring intent with unsupported action %s", new Object[] {
                s2
            })).toString(), new Object[0]);
            return;
        }
    }
}
