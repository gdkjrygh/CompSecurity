// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.external;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.soundcloud.android.SoundCloudApplication;
import dagger.b;

// Referenced classes of package com.soundcloud.android.playback.external:
//            PlaybackActionController

public class PlaybackActionReceiver extends BroadcastReceiver
{

    PlaybackActionController controller;

    public PlaybackActionReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        SoundCloudApplication.getObjectGraph().a(this);
        context = intent.getStringExtra("play_event_source");
        controller.handleAction(intent.getAction(), context);
    }
}
