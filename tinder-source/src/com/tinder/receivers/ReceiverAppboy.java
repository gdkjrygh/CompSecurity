// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.an;
import android.util.Log;
import com.appboy.Constants;
import com.appboy.push.AppboyNotificationUtils;
import com.tinder.activities.ActivityLogin;
import com.tinder.managers.ManagerApp;
import com.tinder.utils.v;

public class ReceiverAppboy extends BroadcastReceiver
{

    private static final String a;

    public ReceiverAppboy()
    {
    }

    private static Intent a(Context context, Bundle bundle)
    {
        context = new Intent(context, com/tinder/activities/ActivityLogin);
        context.setFlags(0x34000000);
        if (bundle != null)
        {
            context.putExtras(bundle);
        }
        return context;
    }

    public void onReceive(Context context, Intent intent)
    {
        String s;
        Object obj1;
        String s1;
        obj1 = context.getPackageName();
        s = (new StringBuilder()).append(((String) (obj1))).append(".intent.APPBOY_PUSH_RECEIVED").toString();
        s1 = (new StringBuilder()).append(((String) (obj1))).append(".intent.APPBOY_NOTIFICATION_OPENED").toString();
        obj1 = intent.getAction();
        String.format("Received intent with action %s", new Object[] {
            obj1
        });
        if (!s.equals(obj1)) goto _L2; else goto _L1
_L1:
        if (!AppboyNotificationUtils.isUninstallTrackingPush(intent.getExtras()));
_L4:
        return;
_L2:
        if (!s1.equals(obj1))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!intent.getBooleanExtra("appboy_is_custom_action", false))
        {
            obj1 = intent.getBundleExtra("extra");
            Object obj = obj1;
            if (obj1 == null)
            {
                obj = new Bundle();
            }
            ((Bundle) (obj)).putString("cid", intent.getStringExtra("cid"));
            ((Bundle) (obj)).putString("source", "Appboy");
            if (intent.getStringExtra("uri") != null)
            {
                intent = (new Intent("android.intent.action.VIEW", Uri.parse(intent.getStringExtra("uri")))).putExtras(((Bundle) (obj)));
                obj1 = an.a(context);
                ((an) (obj1)).a(a(context, ((Bundle) (obj))));
                ((an) (obj1)).a(intent);
                ((an) (obj1)).a(((Bundle) (obj)));
                return;
            } else
            {
                context.startActivity(a(context, ((Bundle) (obj))));
                return;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        context = a;
        intent = String.format("Ignoring intent with unsupported action %s", new Object[] {
            obj1
        });
        if (ManagerApp.a)
        {
            Log.w(context, v.a(v.a(), intent));
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/tinder/receivers/ReceiverAppboy.getName()
        });
    }
}
