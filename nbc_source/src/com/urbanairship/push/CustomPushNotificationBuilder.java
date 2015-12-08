// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;

import android.app.Notification;
import android.content.Context;
import android.net.Uri;
import android.widget.RemoteViews;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.util.NotificationIDGenerator;
import java.util.Map;

// Referenced classes of package com.urbanairship.push:
//            PushNotificationBuilder, PushManager, PushPreferences

public class CustomPushNotificationBuilder
    implements PushNotificationBuilder
{

    public int constantNotificationId;
    public int layout;
    public int layoutIconDrawableId;
    public int layoutIconId;
    public int layoutMessageId;
    public int layoutSubjectId;
    public Uri soundUri;
    public int statusBarIconDrawableId;

    public CustomPushNotificationBuilder()
    {
        layoutIconDrawableId = UAirship.getAppIcon();
        statusBarIconDrawableId = UAirship.getAppIcon();
        constantNotificationId = -1;
    }

    public Notification buildNotification(String s, Map map)
    {
        if (s == null || s.length() == 0)
        {
            s = null;
        } else
        {
            map = new Notification(statusBarIconDrawableId, s, System.currentTimeMillis());
            map.flags = 16;
            map.defaults = 0;
            Object obj = new RemoteViews(UAirship.shared().getApplicationContext().getPackageName(), layout);
            if (layoutIconId == 0 || layoutSubjectId == 0 || layoutMessageId == 0)
            {
                Logger.error((new StringBuilder()).append("The CustomPushNotificationBuilder object contains an invalid identifier (value of 0). layoutIconId: ").append(layoutIconId).append(" layoutSubjectId: ").append(layoutSubjectId).append(" layoutMessageId: ").append(layoutMessageId).toString());
                throw new IllegalArgumentException("Unable to build notification. NotificationBuilder missing required parameter.");
            }
            ((RemoteViews) (obj)).setTextViewText(layoutSubjectId, UAirship.getAppName());
            ((RemoteViews) (obj)).setTextViewText(layoutMessageId, s);
            ((RemoteViews) (obj)).setImageViewResource(layoutIconId, layoutIconDrawableId);
            map.contentView = ((RemoteViews) (obj));
            obj = PushManager.shared().getPreferences();
            s = map;
            if (!((PushPreferences) (obj)).isInQuietTime())
            {
                if (((PushPreferences) (obj)).isVibrateEnabled())
                {
                    map.defaults = ((Notification) (map)).defaults | 2;
                }
                s = map;
                if (((PushPreferences) (obj)).isSoundEnabled())
                {
                    if (soundUri != null)
                    {
                        map.sound = soundUri;
                        return map;
                    } else
                    {
                        map.defaults = ((Notification) (map)).defaults | 1;
                        return map;
                    }
                }
            }
        }
        return s;
    }

    public int getNextId(String s, Map map)
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
