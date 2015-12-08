// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.protocol.nflx;

import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.servicemgr.IMdx;
import com.netflix.mediaclient.servicemgr.MovieDetails;
import com.netflix.mediaclient.servicemgr.SimpleManagerCallback;

// Referenced classes of package com.netflix.mediaclient.protocol.nflx:
//            NflxHandler

class trackId extends SimpleManagerCallback
{

    private final NetflixActivity activity;
    final NflxHandler this$0;
    private final String trackId;
    final IMdx val$mdx;
    final String val$targetDialUuid;

    public void onEpisodeDetailsFetched(EpisodeDetails episodedetails, int i)
    {
        if (i == 0)
        {
            NflxHandler.access$100(NflxHandler.this, activity, val$mdx, episodedetails, val$targetDialUuid, NflxHandler.access$000(NflxHandler.this, trackId));
        }
        NflxHandler.access$200(NflxHandler.this, activity);
    }

    public void onMovieDetailsFetched(MovieDetails moviedetails, int i)
    {
        if (i == 0)
        {
            NflxHandler.access$100(NflxHandler.this, activity, val$mdx, moviedetails, val$targetDialUuid, NflxHandler.access$000(NflxHandler.this, trackId));
        }
        NflxHandler.access$200(NflxHandler.this, activity);
    }

    (IMdx imdx, String s1)
    {
        this$0 = final_nflxhandler;
        val$mdx = imdx;
        val$targetDialUuid = s1;
        super();
        activity = final_netflixactivity;
        trackId = String.this;
    }
}
