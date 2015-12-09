// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseWebClient, BrowseAgentCallback, SimpleBrowseAgentCallback

private class trackId extends trackId
{

    private final int newRating;
    final BrowseAgent this$0;
    private final int trackId;
    private final BrowseAgentCallback webClientCallback = new SimpleBrowseAgentCallback() {

        final BrowseAgent.SetVideoRatingTask this$1;

        public void onVideoRatingSet(int k)
        {
            BrowseAgent.access$3300(this$0).post(k. new Runnable() {

                final _cls1 this$2;
                final int val$statusCode;

                public void run()
                {
                    getCallback().onVideoRatingSet(statusCode);
                }

            
            {
                this$2 = final__pcls1;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = BrowseAgent.SetVideoRatingTask.this;
                super();
            }
    };

    public void run()
    {
        BrowseAgent.access$000(BrowseAgent.this).setVideoRating(getCategory(), newRating, trackId, webClientCallback);
    }

    public >(String s, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        this$0 = BrowseAgent.this;
        super(BrowseAgent.this, s, 0, 0, browseagentcallback);
        newRating = i;
        trackId = j;
    }
}
