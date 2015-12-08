// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.notifications;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.wallet.filter.ActivityFilter;

public class DismissNotificationFilter extends ActivityFilter
{

    private final Activity activity;
    private final NotificationManager mNotificationManager;

    public DismissNotificationFilter(Activity activity1, NotificationManager notificationmanager)
    {
        activity = activity1;
        mNotificationManager = notificationmanager;
    }

    protected final Intent onCreate(Bundle bundle)
    {
        int i = activity.getIntent().getIntExtra("notificationId", 0);
        if (i > 0)
        {
            mNotificationManager.cancel(i);
        }
        return null;
    }
}
