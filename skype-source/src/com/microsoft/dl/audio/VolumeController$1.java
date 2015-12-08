// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.util.Log;

// Referenced classes of package com.microsoft.dl.audio:
//            VolumeController

class a extends BroadcastReceiver
{

    final VolumeController a;

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = false;
        if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        int k;
        i = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1);
        j = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
        k = intent.getIntExtra("android.media.EXTRA_PREV_VOLUME_STREAM_VALUE", 0);
        if (i == -1) goto _L4; else goto _L3
_L3:
        if (Log.isLoggable("DLAudioJava", 4))
        {
            Log.i("DLAudioJava", (new StringBuilder("BroadcastReceiver:onReceive streamType=")).append(i).append(", newVolLevel=").append(j).append(", oldVolLevel=").append(k).append(", maxVolume=").append(VolumeController.a(a).getStreamMaxVolume(i)).toString());
        }
_L6:
        if (j != k)
        {
            if (j == 0)
            {
                flag = true;
            }
            VolumeController.a(a, flag);
        }
_L2:
        return;
_L4:
        if (Log.isLoggable("DLAudioJava", 6))
        {
            Log.e("DLAudioJava", "BroadcastReceiver:onReceive: failed to get stream type.");
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    (VolumeController volumecontroller)
    {
        a = volumecontroller;
        super();
    }
}
