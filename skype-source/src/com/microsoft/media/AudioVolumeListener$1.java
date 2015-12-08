// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.util.Log;

// Referenced classes of package com.microsoft.media:
//            AudioVolumeListener

class this._cls0 extends BroadcastReceiver
{

    final AudioVolumeListener this$0;

    public void onReceive(Context context, Intent intent)
    {
        if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()))
        {
            int i = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1);
            int j = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
            int k = intent.getIntExtra("android.media.EXTRA_PREV_VOLUME_STREAM_VALUE", 0);
            if (i != -1)
            {
                Log.i("AudioVolumeListener", (new StringBuilder("BroadcastReceiver:onReceive streamType=")).append(i).append(", newVolLevel=").append(j).append(", oldVolLevel=").append(k).append(", maxVolume=").append(AudioVolumeListener.access$000(AudioVolumeListener.this).getStreamMaxVolume(i)).toString());
            } else
            {
                Log.e("AudioVolumeListener", "BroadcastReceiver:onReceive: failed to get stream type.");
            }
            if (j != k)
            {
                onVolumeChange();
            }
        }
    }

    ()
    {
        this$0 = AudioVolumeListener.this;
        super();
    }
}
