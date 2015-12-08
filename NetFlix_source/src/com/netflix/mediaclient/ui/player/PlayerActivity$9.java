// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerActivity, PlayerWorkflowState, PlayScreen

class this._cls0
    implements com.netflix.mediaclient.android.widget.ew.TapListener
{

    final PlayerActivity this$0;

    public void onTap(MotionEvent motionevent)
    {
        Log.d("PlayerActivity", "PA tap");
        if (PlayerActivity.access$100(PlayerActivity.this).seekToInProgress || PlayerActivity.access$100(PlayerActivity.this).audioSeekToInProgress)
        {
            Log.d("PlayerActivity", "Seekto in progress, ignore");
            return;
        }
        if (PlayerActivity.access$700(PlayerActivity.this).inInterruptedOrPendingInterrupted())
        {
            Log.d("PlayerActivity", "In interrupted state, ignore");
            return;
        }
        boolean flag;
        if (motionevent != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        PlayerActivity.access$100(PlayerActivity.this).setLastActionTime(SystemClock.elapsedRealtime());
        if (!PlayerActivity.access$700(PlayerActivity.this).inPostPlayOrPendingPostplay())
        {
            PlayerActivity.access$100(PlayerActivity.this).userInteraction();
        }
        PlayerActivity.access$2400(PlayerActivity.this, flag);
    }

    te()
    {
        this$0 = PlayerActivity.this;
        super();
    }
}
