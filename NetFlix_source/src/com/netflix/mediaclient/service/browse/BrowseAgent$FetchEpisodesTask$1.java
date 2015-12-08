// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            SimpleBrowseAgentCallback, BrowseAgent, BrowseAgentCallback

class  extends SimpleBrowseAgentCallback
{

    final _cls1.val.statusCode this$1;

    public void onEpisodesFetched(final List requestedEpisodes, final int statusCode)
    {
        dateCacheIfNecessary(requestedEpisodes, statusCode);
        BrowseAgent.access$1000(_fld0).post(new Runnable() {

            final BrowseAgent.FetchEpisodesTask._cls1 this$2;
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
                this$2 = BrowseAgent.FetchEpisodesTask._cls1.this;
                statusCode = i;
                requestedEpisodes = list;
                super();
            }
        });
    }

    _cls1.val.requestedEpisodes()
    {
        this$1 = this._cls1.this;
        super();
    }
}
