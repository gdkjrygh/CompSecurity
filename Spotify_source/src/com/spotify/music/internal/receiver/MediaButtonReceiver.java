// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.internal.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import dvv;

public class MediaButtonReceiver extends BroadcastReceiver
{

    public MediaButtonReceiver()
    {
    }

    public static void a(Context context, Intent intent)
    {
        Intent intent1 = dvv.a(context, "com.spotify.mobile.android.service.action.media_button");
        intent1.putExtra("android.intent.extra.KEY_EVENT", (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT"));
        context.startService(intent1);
    }

    public void onReceive(Context context, Intent intent)
    {
        a(context, intent);
    }
}
