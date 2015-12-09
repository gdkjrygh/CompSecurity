// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.servicemgr.ShowDetails;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseAgentCallback, SimpleBrowseAgentCallback

class val.statusCode
    implements Runnable
{

    final val.statusCode this$2;
    final ShowDetails val$showDetails;
    final int val$statusCode;

    public void run()
    {
        allback().onShowDetailsFetched(val$showDetails, val$statusCode);
    }

    is._cls1()
    {
        this$2 = final__pcls1;
        val$showDetails = showdetails;
        val$statusCode = I.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchShowDetailsTask$1

/* anonymous class */
    class BrowseAgent.FetchShowDetailsTask._cls1 extends SimpleBrowseAgentCallback
    {

        final BrowseAgent.FetchShowDetailsTask this$1;

        public void onShowDetailsFetched(final ShowDetails showDetails, int i)
        {
            if (i == 0)
            {
                if (StringUtils.isEmpty(BrowseAgent.FetchShowDetailsTask.access$2900(BrowseAgent.FetchShowDetailsTask.this)))
                {
                    updateCacheIfNecessary(showDetails, i);
                } else
                {
                    BrowseAgent.access$3000(this$0, showDetails);
                }
            }
            BrowseAgent.access$3100(this$0).post(i. new BrowseAgent.FetchShowDetailsTask._cls1._cls1());
        }

            
            {
                this$1 = BrowseAgent.FetchShowDetailsTask.this;
                super();
            }
    }

}
