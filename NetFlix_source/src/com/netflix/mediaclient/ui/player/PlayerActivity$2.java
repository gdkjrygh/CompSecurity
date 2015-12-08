// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.os.SystemClock;
import android.view.View;
import com.netflix.mediaclient.servicemgr.IPlayer;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerActivity, PlayerWorkflowState

class this._cls0
    implements android.view.ner
{

    final PlayerActivity this$0;

    public void onClick(View view)
    {
        PlayerActivity.access$100(PlayerActivity.this).setLastActionTime(SystemClock.elapsedRealtime());
        PlayerActivity.access$100(PlayerActivity.this).userInteraction();
        if (PlayerActivity.access$200(PlayerActivity.this).isPlaying())
        {
            PlayerActivity.access$300(PlayerActivity.this, true);
            return;
        } else
        {
            doUnpause();
            return;
        }
    }

    te()
    {
        this$0 = PlayerActivity.this;
        super();
    }
}
