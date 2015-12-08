// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push.notifications;

import android.app.Notification;
import android.content.Context;
import android.net.Uri;
import android.widget.RemoteViews;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.push.PushMessage;
import com.urbanairship.util.NotificationIDGenerator;

// Referenced classes of package com.urbanairship.push.notifications:
//            NotificationFactory

public class CustomLayoutNotificationFactory extends NotificationFactory
{

    public int constantNotificationId;
    public int layout;
    public int layoutIconDrawableId;
    public int layoutIconId;
    public int layoutMessageId;
    public int layoutSubjectId;
    public Uri soundUri;
    public int statusBarIconDrawableId;

    public CustomLayoutNotificationFactory(Context context)
    {
        super(context);
        layoutIconDrawableId = UAirship.getAppIcon();
        statusBarIconDrawableId = UAirship.getAppIcon();
        constantNotificationId = -1;
    }

    public Notification createNotification(PushMessage pushmessage, int i)
    {
        Object obj = pushmessage.getAlert();
        if (obj == null || ((String) (obj)).length() == 0)
        {
            return null;
        }
        RemoteViews remoteviews = new RemoteViews(getContext().getPackageName(), layout);
        if (layoutIconId == 0 || layoutSubjectId == 0 || layoutMessageId == 0)
        {
            Logger.error((new StringBuilder()).append("The CustomLayoutNotificationFactory object contains an invalid identifier (value of 0). layoutIconId: ").append(layoutIconId).append(" layoutSubjectId: ").append(layoutSubjectId).append(" layoutMessageId: ").append(layoutMessageId).toString());
            throw new IllegalArgumentException("Unable to build notification. CustomLayoutNotificationFactory missing required parameter.");
        }
        remoteviews.setTextViewText(layoutSubjectId, UAirship.getAppName());
        remoteviews.setTextViewText(layoutMessageId, ((CharSequence) (obj)));
        remoteviews.setImageViewResource(layoutIconId, layoutIconDrawableId);
        obj = (new android.support.v4.app.NotificationCompat.Builder(getContext())).setContent(remoteviews).setAutoCancel(true).setSmallIcon(statusBarIconDrawableId);
        if (soundUri != null)
        {
            ((android.support.v4.app.NotificationCompat.Builder) (obj)).setSound(soundUri);
        }
        Notification notification = ((android.support.v4.app.NotificationCompat.Builder) (obj)).build();
        notification.contentView = remoteviews;
        ((android.support.v4.app.NotificationCompat.Builder) (obj)).extend(createNotificationActionsExtender(pushmessage, i));
        return notification;
    }

    public int getNextId(PushMessage pushmessage)
    {
        if (constantNotificationId > 0)
        {
            return constantNotificationId;
        } else
        {
            return NotificationIDGenerator.nextID();
        }
    }
}
