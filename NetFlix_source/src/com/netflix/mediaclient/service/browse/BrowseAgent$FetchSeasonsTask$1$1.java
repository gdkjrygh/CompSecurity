// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseAgentCallback, SimpleBrowseAgentCallback

class val.requestedSeasons
    implements Runnable
{

    final val.statusCode this$2;
    final List val$requestedSeasons;
    final int val$statusCode;

    public void run()
    {
        if (val$statusCode == 0 && val$requestedSeasons != null)
        {
            BrowseAgent.access$1100(_fld0, val$requestedSeasons);
        }
        allback().onSeasonsFetched(val$requestedSeasons, val$statusCode);
    }

    is._cls1()
    {
        this$2 = final__pcls1;
        val$statusCode = i;
        val$requestedSeasons = List.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchSeasonsTask$1

/* anonymous class */
    class BrowseAgent.FetchSeasonsTask._cls1 extends SimpleBrowseAgentCallback
    {

        final BrowseAgent.FetchSeasonsTask this$1;

        public void onSeasonsFetched(List list, final int statusCode)
        {
            updateCacheIfNecessary(list, statusCode);
            BrowseAgent.access$1200(this$0).post(list. new BrowseAgent.FetchSeasonsTask._cls1._cls1());
        }

            
            {
                this$1 = BrowseAgent.FetchSeasonsTask.this;
                super();
            }
    }

}
