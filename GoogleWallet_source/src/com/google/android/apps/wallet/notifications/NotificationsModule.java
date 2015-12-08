// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.notifications;

import android.app.Application;
import com.google.android.gms.gcm.GoogleCloudMessaging;

public class NotificationsModule
{

    public NotificationsModule()
    {
    }

    static GoogleCloudMessaging getGoogleCloudMessaging(Application application)
    {
        return GoogleCloudMessaging.getInstance(application);
    }

    static android.support.v4.app.NotificationCompat.Builder provideNotificationBuilder(Application application)
    {
        return new android.support.v4.app.NotificationCompat.Builder(application);
    }
}
