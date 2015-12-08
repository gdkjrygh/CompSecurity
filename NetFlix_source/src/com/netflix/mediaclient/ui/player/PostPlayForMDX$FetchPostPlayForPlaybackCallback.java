// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PostPlayForMDX

private class this._cls0 extends LoggingManagerCallback
{

    final PostPlayForMDX this$0;

    public void onEpisodeDetailsFetched(EpisodeDetails episodedetails, int i)
    {
        super.onEpisodeDetailsFetched(episodedetails, i);
        if (i == 0 && episodedetails != null)
        {
            PostPlayForMDX.access$002(PostPlayForMDX.this, episodedetails);
            updateViews(episodedetails);
            PostPlayForMDX.access$100(PostPlayForMDX.this);
            transitionToPostPlay();
        }
    }

    public ()
    {
        this$0 = PostPlayForMDX.this;
        super("nf_postplay");
    }
}
