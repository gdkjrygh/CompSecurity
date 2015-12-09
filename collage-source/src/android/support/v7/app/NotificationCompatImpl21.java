// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.app.NotificationBuilderWithBuilderAccessor;

class NotificationCompatImpl21
{

    NotificationCompatImpl21()
    {
    }

    public static void addMediaStyle(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, int ai[], Object obj)
    {
        notificationbuilderwithbuilderaccessor = new android.app.Notification.MediaStyle(notificationbuilderwithbuilderaccessor.getBuilder());
        if (ai != null)
        {
            notificationbuilderwithbuilderaccessor.setShowActionsInCompactView(ai);
        }
        if (obj != null)
        {
            notificationbuilderwithbuilderaccessor.setMediaSession((android.media.session.MediaSession.Token)obj);
        }
    }
}
