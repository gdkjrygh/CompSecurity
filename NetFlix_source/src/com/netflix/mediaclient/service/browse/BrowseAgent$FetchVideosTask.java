// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoMo;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseWebClient, BrowseAgentCallback, SimpleBrowseAgentCallback

private class lomo extends lomo
{

    private final LoMo lomo;
    final BrowseAgent this$0;
    private final BrowseAgentCallback webClientCallback = new SimpleBrowseAgentCallback() {

        final BrowseAgent.FetchVideosTask this$1;

        public void onVideosFetched(final List requestedVideos, int k)
        {
            updateCacheIfNecessary(requestedVideos, k);
            BrowseAgent.access$400(this$0).post(k. new Runnable() {

                final _cls1 this$2;
                final List val$requestedVideos;
                final int val$statusCode;

                public void run()
                {
                    getCallback().onVideosFetched(requestedVideos, statusCode);
                    if (-64 == statusCode)
                    {
                        Log.e("nf_service_browseagent", "Map cache miss on FetchVideos - refresh");
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
                this$1 = BrowseAgent.FetchVideosTask.this;
                super();
            }
    };

    public void run()
    {
        List list = (List)getCachedValue();
        if (list == null)
        {
            BrowseAgent.access$000(BrowseAgent.this).fetchVideos(lomo, getFromIndex(), getToIndex(), webClientCallback);
            return;
        } else
        {
            webClientCallback.onVideosFetched(list, 0);
            return;
        }
    }

    public nit>(LoMo lomo1, int i, int j, BrowseAgentCallback browseagentcallback, boolean flag)
    {
        this$0 = BrowseAgent.this;
        super(BrowseAgent.this, lomo1.getId(), i, j, browseagentcallback, flag);
        lomo = lomo1;
    }
}
