// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.pushnotification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.service.pushnotification:
//            PushNotificationAgent

class this._cls0 extends BroadcastReceiver
{

    final PushNotificationAgent this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (Log.isLoggable("nf_push", 2))
        {
            Log.v("nf_push", (new StringBuilder()).append("Received intent ").append(intent).toString());
        }
        context = intent.getAction();
        if ("com.netflix.mediaclient.intent.action.PUSH_ONLOGIN".equals(context))
        {
            Log.d("nf_push", "onLogin");
            PushNotificationAgent.access$200(PushNotificationAgent.this);
        } else
        {
            if ("com.netflix.mediaclient.intent.action.PUSH_ONLOGOUT".equals(context))
            {
                Log.d("nf_push", "onLogout");
                context = PushNotificationAgent.access$300(PushNotificationAgent.this, intent);
                PushNotificationAgent.access$400(PushNotificationAgent.this, context);
                return;
            }
            if ("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_OPTIN".equals(context))
            {
                Log.d("nf_push", "optIn");
                PushNotificationAgent.access$500(PushNotificationAgent.this);
                return;
            }
            if ("com.netflix.mediaclient.intent.action.PUSH_NOTIFICATION_OPTOUT".equals(context))
            {
                Log.d("nf_push", "optOut");
                PushNotificationAgent.access$600(PushNotificationAgent.this);
                return;
            }
            if (Log.isLoggable("nf_push", 3))
            {
                Log.d("nf_push", (new StringBuilder()).append("We do not support action ").append(context).toString());
                return;
            }
        }
    }

    ()
    {
        this$0 = PushNotificationAgent.this;
        super();
    }
}
