// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.arist.activity.MusicPlayActivity;
import com.arist.b.b;

public abstract class o
{

    protected NotificationManager a;
    protected Context b;

    protected o(Context context)
    {
        a = (NotificationManager)context.getSystemService("notification");
        b = context;
    }

    public abstract Notification a(b b1, boolean flag);

    protected final PendingIntent a()
    {
        Intent intent = new Intent(b, com/arist/activity/MusicPlayActivity);
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            intent.setFlags(0x4200020);
        } else
        {
            intent.setFlags(0x4200000);
        }
        return PendingIntent.getActivity(b, 0, intent, 0);
    }

    protected final PendingIntent a(String s)
    {
        s = new Intent(s);
        if (android.os.Build.VERSION.SDK_INT >= 12)
        {
            s.setFlags(32);
        }
        return PendingIntent.getBroadcast(b, 98, s, 0x8000000);
    }

    public final void b()
    {
        a.cancel(0x759bc71);
    }
}
