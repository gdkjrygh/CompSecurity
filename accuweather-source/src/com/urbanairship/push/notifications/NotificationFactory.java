// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push.notifications;

import android.app.Notification;
import android.content.Context;
import com.urbanairship.UAirship;
import com.urbanairship.push.PushManager;
import com.urbanairship.push.PushMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.urbanairship.push.notifications:
//            NotificationActionButtonGroup

public abstract class NotificationFactory
{

    private Context context;

    public NotificationFactory(Context context1)
    {
        context = context1.getApplicationContext();
    }

    public abstract Notification createNotification(PushMessage pushmessage, int i);

    protected final android.support.v4.app.NotificationCompat.Extender createNotificationActionsExtender(PushMessage pushmessage, int i)
    {
        NotificationActionButtonGroup notificationactionbuttongroup = UAirship.shared().getPushManager().getNotificationActionGroup(pushmessage.getInteractiveNotificationType());
        final ArrayList androidActions = new ArrayList();
        if (notificationactionbuttongroup != null)
        {
            androidActions.addAll(notificationactionbuttongroup.createAndroidActions(getContext(), pushmessage, i, pushmessage.getInteractiveActionsPayload()));
        }
        return new android.support.v4.app.NotificationCompat.Extender() {

            final NotificationFactory this$0;
            final List val$androidActions;

            public android.support.v4.app.NotificationCompat.Builder extend(android.support.v4.app.NotificationCompat.Builder builder)
            {
                for (Iterator iterator = androidActions.iterator(); iterator.hasNext(); builder.addAction((android.support.v4.app.NotificationCompat.Action)iterator.next())) { }
                return builder;
            }

            
            {
                this$0 = NotificationFactory.this;
                androidActions = list;
                super();
            }
        };
    }

    public Context getContext()
    {
        return context;
    }

    public abstract int getNextId(PushMessage pushmessage);
}
