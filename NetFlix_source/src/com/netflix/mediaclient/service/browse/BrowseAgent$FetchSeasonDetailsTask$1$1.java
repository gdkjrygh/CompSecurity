// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.servicemgr.SeasonDetails;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseAgentCallback, SimpleBrowseAgentCallback

class val.statusCode
    implements Runnable
{

    final val.statusCode this$2;
    final SeasonDetails val$seasonDetails;
    final int val$statusCode;

    public void run()
    {
        allback().onSeasonDetailsFetched(val$seasonDetails, val$statusCode);
    }

    is._cls1()
    {
        this$2 = final__pcls1;
        val$seasonDetails = seasondetails;
        val$statusCode = I.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchSeasonDetailsTask$1

/* anonymous class */
    class BrowseAgent.FetchSeasonDetailsTask._cls1 extends SimpleBrowseAgentCallback
    {

        final BrowseAgent.FetchSeasonDetailsTask this$1;

        public void onSeasonDetailsFetched(final SeasonDetails seasonDetails, int i)
        {
            updateCacheIfNecessary(seasonDetails, i);
            BrowseAgent.access$2800(this$0).post(i. new BrowseAgent.FetchSeasonDetailsTask._cls1._cls1());
        }

            
            {
                this$1 = BrowseAgent.FetchSeasonDetailsTask.this;
                super();
            }
    }

}
