// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.support.v4.app.z;

public class NotificationCompatImpl21
{

    public NotificationCompatImpl21()
    {
    }

    public static void addMediaStyle(z z1, int ai[], Object obj)
    {
        z1 = new android.app.Notification.MediaStyle(z1.a());
        if (ai != null)
        {
            z1.setShowActionsInCompactView(ai);
        }
        if (obj != null)
        {
            z1.setMediaSession((android.media.session.MediaSession.Token)obj);
        }
    }
}
