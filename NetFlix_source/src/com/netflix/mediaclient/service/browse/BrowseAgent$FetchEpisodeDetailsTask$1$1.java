// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.servicemgr.EpisodeDetails;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseAgentCallback, SimpleBrowseAgentCallback

class val.episodeDetails
    implements Runnable
{

    final val.statusCode this$2;
    final EpisodeDetails val$episodeDetails;
    final int val$statusCode;

    public void run()
    {
        if (val$statusCode == 0 && val$episodeDetails != null)
        {
            updateEpisodeWithLatestShowInformation(BrowseAgent.access$600(_fld0), BrowseAgent.access$700(_fld0), val$episodeDetails);
        }
        allback().onEpisodeDetailsFetched(val$episodeDetails, val$statusCode);
    }

    is._cls1()
    {
        this$2 = final__pcls1;
        val$statusCode = i;
        val$episodeDetails = EpisodeDetails.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchEpisodeDetailsTask$1

/* anonymous class */
    class BrowseAgent.FetchEpisodeDetailsTask._cls1 extends SimpleBrowseAgentCallback
    {

        final BrowseAgent.FetchEpisodeDetailsTask this$1;

        public void onEpisodeDetailsFetched(EpisodeDetails episodedetails, final int statusCode)
        {
            updateCacheIfNecessary(episodedetails, statusCode);
            BrowseAgent.access$2500(this$0).post(episodedetails. new BrowseAgent.FetchEpisodeDetailsTask._cls1._cls1());
        }

            
            {
                this$1 = BrowseAgent.FetchEpisodeDetailsTask.this;
                super();
            }
    }

}
