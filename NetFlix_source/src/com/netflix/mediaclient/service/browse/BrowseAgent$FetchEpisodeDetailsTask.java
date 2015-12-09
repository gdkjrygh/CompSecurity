// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.cache.SoftCache;
import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import java.lang.ref.WeakReference;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseAgentCallback, BrowseWebClient, SimpleBrowseAgentCallback

private class this._cls0 extends this._cls0
{

    final BrowseAgent this$0;
    private final BrowseAgentCallback webClientCallback = new SimpleBrowseAgentCallback() {

        final BrowseAgent.FetchEpisodeDetailsTask this$1;

        public void onEpisodeDetailsFetched(EpisodeDetails episodedetails, final int statusCode)
        {
            updateCacheIfNecessary(episodedetails, statusCode);
            BrowseAgent.access$2500(this$0).post(episodedetails. new Runnable() {

                final _cls1 this$2;
                final EpisodeDetails val$episodeDetails;
                final int val$statusCode;

                public void run()
                {
                    if (statusCode == 0 && episodeDetails != null)
                    {
                        updateEpisodeWithLatestShowInformation(BrowseAgent.access$600(this$0), BrowseAgent.access$700(this$0), episodeDetails);
                    }
                    getCallback().onEpisodeDetailsFetched(episodeDetails, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                statusCode = i;
                episodeDetails = EpisodeDetails.this;
                super();
            }
            });
        }

            
            {
                this$1 = BrowseAgent.FetchEpisodeDetailsTask.this;
                super();
            }
    };

    public void run()
    {
        Object obj = (EpisodeDetails)getCachedValue();
        if (obj == null)
        {
            obj = BrowseAgent.access$2300(getCategory());
            if (Log.isLoggable("nf_service_browseagent", 3))
            {
                Log.d("nf_bookmark", (new StringBuilder()).append("looking for episode with key: ").append(((String) (obj))).toString());
            }
            obj = (WeakReference)BrowseAgent.access$2400(BrowseAgent.this).get(((String) (obj)));
            if (obj != null && ((WeakReference) (obj)).get() != null)
            {
                obj = (EpisodeDetails)((WeakReference) (obj)).get();
                updateEpisodeWithLatestShowInformation(BrowseAgent.access$600(BrowseAgent.this), BrowseAgent.access$700(BrowseAgent.this), ((EpisodeDetails) (obj)));
                webClientCallback.onEpisodeDetailsFetched(((EpisodeDetails) (obj)), 0);
                return;
            } else
            {
                BrowseAgent.access$000(BrowseAgent.this).fetchEpisodeDetails(getCategory(), webClientCallback);
                return;
            }
        } else
        {
            updateEpisodeWithLatestShowInformation(BrowseAgent.access$600(BrowseAgent.this), BrowseAgent.access$700(BrowseAgent.this), ((EpisodeDetails) (obj)));
            webClientCallback.onEpisodeDetailsFetched(((EpisodeDetails) (obj)), 0);
            return;
        }
    }

    public _cls1.this._cls1(String s, BrowseAgentCallback browseagentcallback)
    {
        this$0 = BrowseAgent.this;
        super(BrowseAgent.this, s, 0, 0, browseagentcallback);
    }
}
