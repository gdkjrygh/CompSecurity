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

        final BrowseAgent.FetchCWVideosTask this$1;

        public void onCWVideosFetched(final List requestedVideos, int k)
        {
            updateCacheIfNecessary(requestedVideos, k);
            BrowseAgent.access$1400(this$0).post(k. new Runnable() {

                final _cls1 this$2;
                final List val$requestedVideos;
                final int val$statusCode;

                public void run()
                {
                    getCallback().onCWVideosFetched(requestedVideos, statusCode);
                    if (-64 == statusCode)
                    {
                        Log.e("nf_service_browseagent", "Map cache miss for CW - refresh");
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
                this$1 = BrowseAgent.FetchCWVideosTask.this;
                super();
            }
    };

    public void run()
    {
        List list = (List)getCachedValue();
        if (list == null)
        {
            BrowseAgent.access$1300(BrowseAgent.this).add(getCacheKey());
            BrowseAgent.access$000(BrowseAgent.this).fetchCWVideos(getFromIndex(), getToIndex(), webClientCallback);
            return;
        } else
        {
            webClientCallback.onCWVideosFetched(list, 0);
            return;
        }
    }

    public t>(int i, int j, BrowseAgentCallback browseagentcallback, boolean flag)
    {
        this$0 = BrowseAgent.this;
        super(BrowseAgent.this, "continueWatching", i, j, browseagentcallback, flag);
    }
}
