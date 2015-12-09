// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseWebClient, BrowseAgentCallback, SimpleBrowseAgentCallback

private class init> extends init>
{

    final BrowseAgent this$0;
    private final BrowseAgentCallback webClientCallback = new SimpleBrowseAgentCallback() {

        final BrowseAgent.FetchSeasonsTask this$1;

        public void onSeasonsFetched(List list, final int statusCode)
        {
            updateCacheIfNecessary(list, statusCode);
            BrowseAgent.access$1200(this$0).post(list. new Runnable() {

                final _cls1 this$2;
                final List val$requestedSeasons;
                final int val$statusCode;

                public void run()
                {
                    if (statusCode == 0 && requestedSeasons != null)
                    {
                        BrowseAgent.access$1100(this$0, requestedSeasons);
                    }
                    getCallback().onSeasonsFetched(requestedSeasons, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                statusCode = i;
                requestedSeasons = List.this;
                super();
            }
            });
        }

            
            {
                this$1 = BrowseAgent.FetchSeasonsTask.this;
                super();
            }
    };

    public void run()
    {
        List list = (List)getCachedValue();
        if (list == null)
        {
            BrowseAgent.access$000(BrowseAgent.this).fetchSeasons(getCategory(), getFromIndex(), getToIndex(), webClientCallback);
            return;
        } else
        {
            BrowseAgent.access$1100(BrowseAgent.this, list);
            webClientCallback.onSeasonsFetched(list, 0);
            return;
        }
    }

    public it>(String s, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        this$0 = BrowseAgent.this;
        super(BrowseAgent.this, s, i, j, browseagentcallback);
    }
}
