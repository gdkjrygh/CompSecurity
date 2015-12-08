// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.Log;

public class ScreenReceiver extends BroadcastReceiver
{

    private static boolean _wasScreenOn = true;

    public ScreenReceiver()
    {
    }

    public static boolean wasScreenOn()
    {
        return _wasScreenOn;
    }

    public void onReceive(Context context, Intent intent)
    {
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()))
        {
            Log.d("ScreenReceiver", "ScreenReceiver -> ACTION_SCREEN_OFF");
            _wasScreenOn = false;
        } else
        if ("android.intent.action.SCREEN_ON".equals(intent.getAction()))
        {
            Log.d("ScreenReceiver", "ScreenReceiver -> ACTION_SCREEN_ON");
            _wasScreenOn = true;
            return;
        }
    }

}
