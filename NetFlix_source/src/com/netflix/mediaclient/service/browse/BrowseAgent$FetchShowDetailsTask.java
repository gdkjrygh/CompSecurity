// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.servicemgr.ShowDetails;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseWebClient, BrowseAgentCallback, SimpleBrowseAgentCallback

private class mCurrentEpisodeId extends mCurrentEpisodeId
{

    private final String mCurrentEpisodeId;
    final BrowseAgent this$0;
    private final BrowseAgentCallback webClientCallback = new SimpleBrowseAgentCallback() {

        final BrowseAgent.FetchShowDetailsTask this$1;

        public void onShowDetailsFetched(final ShowDetails showDetails, int i)
        {
            if (i == 0)
            {
                if (StringUtils.isEmpty(mCurrentEpisodeId))
                {
                    updateCacheIfNecessary(showDetails, i);
                } else
                {
                    BrowseAgent.access$3000(this$0, showDetails);
                }
            }
            BrowseAgent.access$3100(this$0).post(i. new Runnable() {

                final _cls1 this$2;
                final ShowDetails val$showDetails;
                final int val$statusCode;

                public void run()
                {
                    getCallback().onShowDetailsFetched(showDetails, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                showDetails = showdetails;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = BrowseAgent.FetchShowDetailsTask.this;
                super();
            }
    };

    public void run()
    {
        ShowDetails showdetails = (ShowDetails)getCachedValue();
        if (showdetails == null || StringUtils.isNotEmpty(mCurrentEpisodeId))
        {
            BrowseAgent.access$000(BrowseAgent.this).fetchShowDetails(getCategory(), mCurrentEpisodeId, webClientCallback);
            return;
        } else
        {
            webClientCallback.onShowDetailsFetched(showdetails, 0);
            return;
        }
    }


    public _cls1.this._cls1(String s, String s1, BrowseAgentCallback browseagentcallback)
    {
        this$0 = BrowseAgent.this;
        super(BrowseAgent.this, s, 0, 0, browseagentcallback);
        mCurrentEpisodeId = s1;
    }
}
