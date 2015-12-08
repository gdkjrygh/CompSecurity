// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kik.android.chat.activity.IntroActivity;

public class AlarmReceiver extends BroadcastReceiver
{

    public AlarmReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        intent = new Intent(context, kik/android/chat/activity/IntroActivity);
        intent.addFlags(0x10000000);
        context.startActivity(intent);
    }
}
