// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.servicemgr.VideoList;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseWebClient, BrowseAgentCallback, SimpleBrowseAgentCallback

private class this._cls0 extends this._cls0
{

    final BrowseAgent this$0;
    private final BrowseAgentCallback webClientCallback = new SimpleBrowseAgentCallback() {

        final BrowseAgent.FetchSimilarVideosForQuerySuggestionTask this$1;

        public void onSimilarVideosFetched(final VideoList videoList, int j)
        {
            updateCacheIfNecessary(videoList, j);
            BrowseAgent.access$5300(this$0).post(j. new Runnable() {

                final _cls1 this$2;
                final int val$statusCode;
                final VideoList val$videoList;

                public void run()
                {
                    getCallback().onSimilarVideosFetched(videoList, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                videoList = videolist;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = BrowseAgent.FetchSimilarVideosForQuerySuggestionTask.this;
                super();
            }
    };

    public void run()
    {
        VideoList videolist = (VideoList)getCachedValue();
        if (videolist == null)
        {
            BrowseAgent.access$000(BrowseAgent.this).fetchSimilarVideosForQuerySuggestion(getCategory(), getToIndex(), webClientCallback);
            return;
        } else
        {
            webClientCallback.onSimilarVideosFetched(videolist, 0);
            return;
        }
    }

    public _cls1.this._cls1(String s, int i, BrowseAgentCallback browseagentcallback)
    {
        this$0 = BrowseAgent.this;
        super(BrowseAgent.this, s, 0, i, browseagentcallback);
    }
}
