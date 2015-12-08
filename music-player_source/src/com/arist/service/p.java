// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.service;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import com.arist.activity.MyApplication;
import com.arist.b.b;
import com.arist.c.a.a;

// Referenced classes of package com.arist.service:
//            MediaButtonReceiver

public final class p
{

    private RemoteControlClient a;
    private AudioManager b;
    private ComponentName c;

    public p(Context context)
    {
        b = (AudioManager)context.getSystemService("audio");
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        c = new ComponentName(context.getPackageName(), com/arist/service/MediaButtonReceiver.getName());
        intent.setComponent(c);
        a = new RemoteControlClient(PendingIntent.getBroadcast(context, 0, intent, 0x8000000));
        a.setTransportControlFlags(149);
    }

    public final void a()
    {
        b.registerMediaButtonEventReceiver(c);
    }

    public final void a(b b1)
    {
        if (b1 != null)
        {
            android.media.RemoteControlClient.MetadataEditor metadataeditor = a.editMetadata(true);
            metadataeditor.putString(7, b1.d());
            metadataeditor.putString(1, b1.h());
            metadataeditor.putString(2, b1.j());
            metadataeditor.putLong(9, b1.g());
            metadataeditor.putBitmap(100, com.arist.c.a.a.a(MyApplication.q, b1));
            metadataeditor.apply();
        }
    }

    public final void a(boolean flag)
    {
        RemoteControlClient remotecontrolclient = a;
        byte byte0;
        if (flag)
        {
            byte0 = 3;
        } else
        {
            byte0 = 2;
        }
        remotecontrolclient.setPlaybackState(byte0);
    }

    public final void b()
    {
        b.unregisterMediaButtonEventReceiver(c);
    }

    public final void c()
    {
        b.registerRemoteControlClient(a);
    }

    public final void d()
    {
        b.unregisterRemoteControlClient(a);
    }
}
