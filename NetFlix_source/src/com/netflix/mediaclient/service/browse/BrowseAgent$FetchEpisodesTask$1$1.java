// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseAgentCallback, SimpleBrowseAgentCallback

class val.requestedEpisodes
    implements Runnable
{

    final val.statusCode this$2;
    final List val$requestedEpisodes;
    final int val$statusCode;

    public void run()
    {
        if (val$statusCode == 0 && val$requestedEpisodes != null)
        {
            BrowseAgent.access$900(_fld0, val$requestedEpisodes);
            BrowseAgent.access$800(_fld0, BrowseAgent.access$600(_fld0), BrowseAgent.access$700(_fld0), val$requestedEpisodes);
        }
        allback().onEpisodesFetched(val$requestedEpisodes, val$statusCode);
    }

    is._cls1()
    {
        this$2 = final__pcls1;
        val$statusCode = i;
        val$requestedEpisodes = List.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchEpisodesTask$1

/* anonymous class */
    class BrowseAgent.FetchEpisodesTask._cls1 extends SimpleBrowseAgentCallback
    {

        final BrowseAgent.FetchEpisodesTask this$1;

        public void onEpisodesFetched(List list, final int statusCode)
        {
            updateCacheIfNecessary(list, statusCode);
            BrowseAgent.access$1000(this$0).post(list. new BrowseAgent.FetchEpisodesTask._cls1._cls1());
        }

            
            {
                this$1 = BrowseAgent.FetchEpisodesTask.this;
                super();
            }
    }

}
