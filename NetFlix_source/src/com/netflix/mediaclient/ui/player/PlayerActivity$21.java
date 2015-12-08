// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.ui.Asset;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerActivity

class this._cls0
    implements com.netflix.mediaclient.ui.details.sodeRowListener
{

    final PlayerActivity this$0;

    public void onEpisodeSelectedForPlayback(EpisodeDetails episodedetails, PlayContext playcontext)
    {
        if (destroyed())
        {
            return;
        }
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("Start playback from episode selector ").append(episodedetails).toString());
        }
        if (PlayerActivity.access$400(PlayerActivity.this) != null && PlayerActivity.access$400(PlayerActivity.this).getPlayableId() != null && PlayerActivity.access$400(PlayerActivity.this).getPlayableId().equals(episodedetails.getPlayableId()))
        {
            Log.d("PlayerActivity", "Request to play same episode, do nothing");
            startScreenUpdateTask();
            if (isDialogFragmentVisible())
            {
                removeDialogFrag();
            }
            doUnpause();
            return;
        } else
        {
            cleanupAndExit();
            PlaybackLauncher.startPlaybackAfterPIN(PlayerActivity.this, episodedetails, playcontext);
            return;
        }
    }

    isodeRowListener()
    {
        this$0 = PlayerActivity.this;
        super();
    }
}
