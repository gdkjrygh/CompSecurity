// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.view.KeyEvent;

public class RemoteControlReceiver extends BroadcastReceiver
{

    private static final int DOUBLE_CLICK_DELAY = 400;
    private static long lastClicked = -400L;

    public RemoteControlReceiver()
    {
    }

    private Intent createIntentForAction(String s)
    {
        return (new Intent(s)).putExtra("play_event_source", "lockscreen");
    }

    private void sendPlaybackAction(Context context, String s)
    {
        context.sendBroadcast(createIntentForAction(s));
    }

    public void onReceive(Context context, Intent intent)
    {
        if (!"android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        intent = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (intent == null || intent.getAction() != 1) goto _L2; else goto _L3
_L3:
        intent.getKeyCode();
        JVM INSTR lookupswitch 6: default 96
    //                   79: 97
    //                   85: 97
    //                   87: 166
    //                   88: 158
    //                   126: 150
    //                   127: 142;
           goto _L2 _L4 _L4 _L5 _L6 _L7 _L8
_L2:
        return;
_L4:
        long l = SystemClock.uptimeMillis();
        if (l - lastClicked < 400L)
        {
            sendPlaybackAction(context, "com.soundcloud.android.playback.external.next");
            sendPlaybackAction(context, "com.soundcloud.android.playback.external.play");
        } else
        {
            sendPlaybackAction(context, "com.soundcloud.android.playback.external.toggleplayback");
        }
        lastClicked = l;
        return;
_L8:
        sendPlaybackAction(context, "com.soundcloud.android.playback.external.pause");
        return;
_L7:
        sendPlaybackAction(context, "com.soundcloud.android.playback.external.play");
        return;
_L6:
        sendPlaybackAction(context, "com.soundcloud.android.playback.external.previous");
        return;
_L5:
        sendPlaybackAction(context, "com.soundcloud.android.playback.external.next");
        return;
    }

    public void resetLastClicked()
    {
        lastClicked = -400L;
    }

}
