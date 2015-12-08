// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.soundcloud.android.SoundCloudApplication;
import dagger.b;

// Referenced classes of package com.soundcloud.android.playback.widget:
//            PlayerWidgetController

public class PlayerWidgetReceiver extends BroadcastReceiver
{

    PlayerWidgetController controller;

    public PlayerWidgetReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if ("com.soundcloud.android.widgetLike".equals(intent.getAction()))
        {
            SoundCloudApplication.getObjectGraph().a(this);
            boolean flag = intent.getBooleanExtra("isLike", false);
            controller.handleToggleLikeAction(flag);
        }
    }
}
