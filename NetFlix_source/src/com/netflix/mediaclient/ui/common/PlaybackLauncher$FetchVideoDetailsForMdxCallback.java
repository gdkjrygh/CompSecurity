// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.widget.Toast;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.MovieDetails;
import com.netflix.mediaclient.servicemgr.ShowDetails;
import com.netflix.mediaclient.servicemgr.VideoDetails;

// Referenced classes of package com.netflix.mediaclient.ui.common:
//            PlaybackLauncher, PlayContext

private static class playContext extends LoggingManagerCallback
{

    private final NetflixActivity activity;
    private final PlayContext playContext;

    private void handleResponse(VideoDetails videodetails, int i)
    {
        if (activity.destroyed())
        {
            return;
        }
        if (i != 0 || videodetails == null)
        {
            Log.w("nf_play", "Error loading video details for MDX launch - hiding mini player");
            Toast.makeText(activity, 0x7f0c00fe, 1).show();
            activity.hideMdxMiniPlayer();
            return;
        } else
        {
            PlaybackLauncher.startPlaybackAfterPIN(activity, videodetails, playContext);
            return;
        }
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

    public (NetflixActivity netflixactivity, PlayContext playcontext)
    {
        super("nf_play");
        activity = netflixactivity;
        playContext = playcontext;
    }
}
