// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.media.AudioManager;
import android.widget.SeekBar;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerActivity, PlayerWorkflowState

class this._cls0
    implements android.widget.ChangeListener
{

    final PlayerActivity this$0;

    public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
label0:
        {
            if (flag && PlayerActivity.access$100(PlayerActivity.this).draggingAudioInProgress && PlayerActivity.access$700(PlayerActivity.this) != null)
            {
                seekbar = (AudioManager)getSystemService("audio");
                if (seekbar == null)
                {
                    break label0;
                }
                seekbar.setStreamVolume(3, i, 0);
            }
            return;
        }
        Log.e("PlayerActivity", "Audio manager is not available, can not change volume");
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
        PlayerActivity.access$100(PlayerActivity.this).draggingAudioInProgress = true;
        Log.d("PlayerActivity", "Start volume change, get awake clock");
        PlayerActivity.access$1000(PlayerActivity.this);
        stopScreenUpdateTask();
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
        Log.d("PlayerActivity", "volume::onStopTrackingTouch called");
        PlayerActivity.access$100(PlayerActivity.this).draggingAudioInProgress = false;
        PlayerActivity.access$100(PlayerActivity.this).audioSeekToInProgress = false;
        startScreenUpdateTask();
    }

    te()
    {
        this$0 = PlayerActivity.this;
        super();
    }
}
