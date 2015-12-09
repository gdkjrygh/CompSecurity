// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseWebClient, BrowseAgentCallback, SimpleBrowseAgentCallback

private class nit> extends nit>
{

    final BrowseAgent this$0;
    private final BrowseAgentCallback webClientCallback = new SimpleBrowseAgentCallback() {

        final BrowseAgent.FetchEpisodesTask this$1;

        public void onEpisodesFetched(List list, final int statusCode)
        {
            updateCacheIfNecessary(list, statusCode);
            BrowseAgent.access$1000(this$0).post(list. new Runnable() {

                final _cls1 this$2;
                final List val$requestedEpisodes;
                final int val$statusCode;

                public void run()
                {
                    if (statusCode == 0 && requestedEpisodes != null)
                    {
                        BrowseAgent.access$900(this$0, requestedEpisodes);
                        BrowseAgent.access$800(this$0, BrowseAgent.access$600(this$0), BrowseAgent.access$700(this$0), requestedEpisodes);
                    }
                    getCallback().onEpisodesFetched(requestedEpisodes, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                statusCode = i;
                requestedEpisodes = List.this;
                super();
            }
            });
        }

            
            {
                this$1 = BrowseAgent.FetchEpisodesTask.this;
                super();
            }
    };

    public void run()
    {
        List list = (List)getCachedValue();
        if (list == null)
        {
            BrowseAgent.access$000(BrowseAgent.this).fetchEpisodes(getCategory(), getFromIndex(), getToIndex(), webClientCallback);
            return;
        } else
        {
            BrowseAgent.access$800(BrowseAgent.this, BrowseAgent.access$600(BrowseAgent.this), BrowseAgent.access$700(BrowseAgent.this), list);
            webClientCallback.onEpisodesFetched(list, 0);
            return;
        }
    }

    public t>(String s, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        this$0 = BrowseAgent.this;
        super(BrowseAgent.this, s, i, j, browseagentcallback);
    }
}
