// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.optintrial;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import bb;
import ctz;
import gcg;
import gms;

public class TrialAlarmBroadcastReceiver extends BroadcastReceiver
{

    public TrialAlarmBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        intent = ((Context)ctz.a(context)).getResources();
        PendingIntent pendingintent = PendingIntent.getActivity(context, 1337, gms.a(context).a.addFlags(0x10000000), 0x10000000);
        bb bb1 = new bb(context);
        bb1.a(context.getString(0x7f080378)).b(context.getResources().getQuantityString(0x7f090012, 24, new Object[] {
            Integer.valueOf(24)
        })).a(pendingintent).a(0x7f020203).c(context.getString(0x7f080377)).a(System.currentTimeMillis()).d().a(gcg.b(context, 0x7f0f00f8), intent.getInteger(0x7f0e001d), intent.getInteger(0x7f0e001c));
        ((NotificationManager)context.getSystemService("notification")).notify(0, bb1.g());
    }
}
