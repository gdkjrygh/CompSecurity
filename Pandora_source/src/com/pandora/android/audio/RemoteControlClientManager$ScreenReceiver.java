// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.pandora.android.audio:
//            RemoteControlClientManager

public class a extends BroadcastReceiver
{

    final RemoteControlClientManager a;

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.intent.action.SCREEN_ON"))
        {
            a.j();
        } else
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF"))
        {
            a.k();
            return;
        }
    }

    public I(RemoteControlClientManager remotecontrolclientmanager)
    {
        a = remotecontrolclientmanager;
        super();
    }
}
