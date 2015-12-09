// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.os.Handler;
import android.view.View;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PostPlay, PlayerActivity, PlayerWorkflowState, PlayScreen, 
//            PlayerUiState

class this._cls0
    implements Runnable
{

    final PostPlay this$0;

    public void run()
    {
        if (mContext.getState().noUserInteraction())
        {
            if (mContext.getScreen().getState() != PlayerUiState.Loading)
            {
                if (mInterrupter != null)
                {
                    Log.d("nf_postplay", "This is 3rd consecutive auto play with no user interaction, after 2 minutes start interrupter mode");
                    mContext.doPause();
                    mInterrupter.setVisibility(0);
                    mContext.getScreen().moveToState(PlayerUiState.Interrupter);
                    mContext.getHandler().postDelayed(PostPlay.access$000(PostPlay.this), mInterrputerTimeoutOffset);
                    return;
                } else
                {
                    Log.w("nf_postplay", "Interrupter UI NOT found, this should not happen!");
                    return;
                }
            } else
            {
                Log.d("nf_postplay", "This is 3rd consecutive auto play with no user interaction, but after 2 minutes we are still loading, postpone for 2 more minutes");
                mContext.getHandler().postDelayed(this, 0x1d4c0L);
                return;
            }
        } else
        {
            Log.d("nf_postplay", "Interrupter process, there was user interaction in meantime. Do nothing");
            return;
        }
    }

    te()
    {
        this$0 = PostPlay.this;
        super();
    }
}
