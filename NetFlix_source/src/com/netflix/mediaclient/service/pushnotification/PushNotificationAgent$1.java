// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.pushnotification;

import java.util.Map;

// Referenced classes of package com.netflix.mediaclient.service.pushnotification:
//            PushNotificationAgent, NotificationUserSettings

class val.settings
    implements Runnable
{

    final PushNotificationAgent this$0;
    final Map val$settings;

    public void run()
    {
        NotificationUserSettings.saveSettings(PushNotificationAgent.access$000(PushNotificationAgent.this), val$settings);
    }

    ()
    {
        this$0 = final_pushnotificationagent;
        val$settings = Map.this;
        super();
    }
}
