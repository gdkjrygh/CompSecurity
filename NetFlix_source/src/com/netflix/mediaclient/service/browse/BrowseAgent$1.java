// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.SeasonDetails;
import com.netflix.mediaclient.servicemgr.ShowDetails;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            SimpleBrowseAgentCallback, BrowseAgent

class entCallback extends SimpleBrowseAgentCallback
{

    final BrowseAgent this$0;
    final ShowDetails val$showDetails;

    public void onSeasonsFetched(List list, int i)
    {
        if (i == 0)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                SeasonDetails seasondetails = (SeasonDetails)list.next();
                if (seasondetails.getSeasonNumber() == val$showDetails.getCurrentSeasonNumber())
                {
                    com.netflix.mediaclient.service.webclient.model.SeasonDetails seasondetails1 = (com.netflix.mediaclient.service.webclient.model.SeasonDetails)seasondetails;
                    if (seasondetails1.detail != null)
                    {
                        if (Log.isLoggable("nf_service_browseagent", 3))
                        {
                            Log.d("nf_service_browseagent", String.format("currentepisode being overwitten from %d to %d", new Object[] {
                                Integer.valueOf(seasondetails.getCurrentEpisodeNumber()), Integer.valueOf(val$showDetails.getCurrentEpisodeNumber())
                            }));
                        }
                        seasondetails1.detail.currentEpisodeNumber = val$showDetails.getCurrentEpisodeNumber();
                    }
                }
            } while (true);
        }
    }

    hes.Season.Detail()
    {
        this$0 = final_browseagent;
        val$showDetails = ShowDetails.this;
        super();
    }
}
