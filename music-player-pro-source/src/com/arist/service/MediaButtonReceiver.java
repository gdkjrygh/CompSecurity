// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;

public class MediaButtonReceiver extends BroadcastReceiver
{

    public MediaButtonReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = true;
        abortBroadcast();
        if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction()))
        {
            if ((intent = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null)
            {
                if (intent.getAction() != 1)
                {
                    flag = false;
                }
                if (flag)
                {
                    long l = intent.getEventTime();
                    long l1 = intent.getDownTime();
                    intent = new Intent();
                    intent.putExtra("event_time", l - l1);
                    intent.setAction("com.MediaPlayer.action.MEDIA_BUTTON_PRESSED");
                    context.sendBroadcast(intent);
                    return;
                }
            }
        }
    }
}
