// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.widget.Toast;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.MovieDetails;
import com.netflix.mediaclient.servicemgr.ShowDetails;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import com.netflix.mediaclient.ui.Asset;
import com.netflix.mediaclient.ui.common.PlayContext;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerActivity, PlayScreen, PostPlay, TopPanel

private class playContext extends LoggingManagerCallback
{

    private final PlayContext playContext;
    final PlayerActivity this$0;

    private void handleResponse(VideoDetails videodetails, int i)
    {
        boolean flag = false;
        PlayerActivity.access$2302(PlayerActivity.this, false);
        PlayerActivity playeractivity = PlayerActivity.this;
        if (playeractivity.destroyed())
        {
            return;
        }
        if (i != 0 || videodetails == null)
        {
            Log.w("PlayerActivity", "Error loading video details for video playback");
            Toast.makeText(playeractivity, 0x7f0c00fe, 1).show();
            return;
        }
        playeractivity = PlayerActivity.this;
        PlayContext playcontext = playContext;
        if (!PlayerActivity.PIN_VERIFIED.booleanValue())
        {
            flag = true;
        }
        PlayerActivity.access$402(playeractivity, Asset.create(videodetails, playcontext, flag));
        PlayerActivity.access$2302(PlayerActivity.this, true);
        PlayerActivity.access$3000(PlayerActivity.this);
        Log.d("PlayerActivity", "Bilboard playback");
        PlayerActivity.access$700(PlayerActivity.this).getPostPlay().init(PlayerActivity.access$400(PlayerActivity.this).getPlayableId());
        Log.d("PlayerActivity", "Bilboard playback, check episode visibility");
        PlayerActivity.access$700(PlayerActivity.this).getTopPanel().setEpisodeSelectorVisibility(PlayerActivity.access$400(PlayerActivity.this).isEpisode());
    }

    public void onMovieDetailsFetched(MovieDetails moviedetails, int i)
    {
        super.onMovieDetailsFetched(moviedetails, i);
        handleResponse(moviedetails, i);
    }

    public void onShowDetailsFetched(ShowDetails showdetails, int i)
    {
        super.onShowDetailsFetched(showdetails, i);
        handleResponse(showdetails, i);
    }

    public (PlayContext playcontext)
    {
        this$0 = PlayerActivity.this;
        super("PlayerActivity");
        playContext = playcontext;
    }
}
