// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.Log;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseWebClient, BrowseAgentCallback, SimpleBrowseAgentCallback

private class nit> extends nit>
{

    final BrowseAgent this$0;
    private final BrowseAgentCallback webClientCallback = new SimpleBrowseAgentCallback() {

        final BrowseAgent.FetchIQVideosTask this$1;

        public void onVideosFetched(final List requestedVideos, int k)
        {
            updateCacheIfNecessary(requestedVideos, k);
            BrowseAgent.access$1600(this$0).post(k. new Runnable() {

                final _cls1 this$2;
                final List val$requestedVideos;
                final int val$statusCode;

                public void run()
                {
                    getCallback().onVideosFetched(requestedVideos, statusCode);
                    if (-64 == statusCode)
                    {
                        Log.d("nf_service_browseagent", "Map cache miss for IQ - refresh");
                        sendHomeRefreshBrodcast();
                    }
                }

            
            {
                this$2 = final__pcls1;
                requestedVideos = list;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = BrowseAgent.FetchIQVideosTask.this;
                super();
            }
    };

    public void run()
    {
        List list = (List)getCachedValue();
        if (list == null)
        {
            BrowseAgent.access$1500(BrowseAgent.this).add(getCacheKey());
            BrowseAgent.access$000(BrowseAgent.this).fetchIQVideos(getFromIndex(), getToIndex(), webClientCallback);
            return;
        } else
        {
            webClientCallback.onVideosFetched(list, 0);
            return;
        }
    }

    public t>(int i, int j, BrowseAgentCallback browseagentcallback, boolean flag)
    {
        this$0 = BrowseAgent.this;
        super(BrowseAgent.this, "queue", i, j, browseagentcallback, flag);
    }
}
