// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.pushnotification;

import android.content.Context;
import com.netflix.mediaclient.util.PreferenceUtils;

// Referenced classes of package com.netflix.mediaclient.service.pushnotification:
//            PushNotificationAgent

class val.context
    implements Runnable
{

    final PushNotificationAgent this$0;
    final Context val$context;

    public void run()
    {
        PreferenceUtils.putIntPref(val$context, "nf_notification_id_counter", PushNotificationAgent.access$100());
    }

    ()
    {
        this$0 = final_pushnotificationagent;
        val$context = Context.this;
        super();
    }
}
