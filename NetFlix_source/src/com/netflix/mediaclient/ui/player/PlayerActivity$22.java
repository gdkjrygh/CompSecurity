// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.os.SystemClock;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.ui.details.EpisodeListFrag;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerActivity, PlayerWorkflowState

class this._cls0
    implements com.netflix.mediaclient.android.fragment.DialogCanceledListener
{

    final PlayerActivity this$0;

    public void onDialogCanceled(NetflixDialogFrag netflixdialogfrag)
    {
        if ((netflixdialogfrag instanceof EpisodeListFrag) && !destroyed())
        {
            PlayerActivity.access$100(PlayerActivity.this).setLastActionTime(SystemClock.elapsedRealtime());
            PlayerActivity.access$100(PlayerActivity.this).userInteraction();
            Log.d("PlayerActivity", "Episode selector was dismissed");
            if (PlayerActivity.access$200(PlayerActivity.this).isPlaying())
            {
                PlayerActivity.access$300(PlayerActivity.this, true);
            } else
            {
                doUnpause();
            }
            startScreenUpdateTask();
        }
    }

    ogFrag()
    {
        this$0 = PlayerActivity.this;
        super();
    }
}
