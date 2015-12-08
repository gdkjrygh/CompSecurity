// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kik.android.chat.KikApplication;
import kik.android.net.communicator.CommunicatorService;

public class StartupReceiver extends BroadcastReceiver
{

    public StartupReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        context.startService(new Intent(context, kik/android/net/communicator/CommunicatorService));
        KikApplication.h();
    }
}
