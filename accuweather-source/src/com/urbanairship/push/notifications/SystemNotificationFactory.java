// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push.notifications;

import android.app.Notification;
import android.content.Context;
import com.urbanairship.push.PushMessage;
import com.urbanairship.util.UAStringUtil;

// Referenced classes of package com.urbanairship.push.notifications:
//            DefaultNotificationFactory

public class SystemNotificationFactory extends DefaultNotificationFactory
{

    public SystemNotificationFactory(Context context)
    {
        super(context);
    }

    public Notification createNotification(PushMessage pushmessage, int i)
    {
        if (UAStringUtil.isEmpty(pushmessage.getAlert()))
        {
            return null;
        } else
        {
            return createNotificationBuilder(pushmessage, i).build();
        }
    }
}
