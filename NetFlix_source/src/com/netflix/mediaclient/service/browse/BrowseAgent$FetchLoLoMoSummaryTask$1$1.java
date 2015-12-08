// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.servicemgr.LoLoMo;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseAgentCallback, SimpleBrowseAgentCallback

class val.statusCode
    implements Runnable
{

    final val.statusCode this$2;
    final int val$statusCode;
    final LoLoMo val$summary;

    public void run()
    {
        allback().onLoLoMoSummaryFetched(val$summary, val$statusCode);
    }

    is._cls1()
    {
        this$2 = final__pcls1;
        val$summary = lolomo;
        val$statusCode = I.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchLoLoMoSummaryTask$1

/* anonymous class */
    class BrowseAgent.FetchLoLoMoSummaryTask._cls1 extends SimpleBrowseAgentCallback
    {

        final BrowseAgent.FetchLoLoMoSummaryTask this$1;

        public void onLoLoMoSummaryFetched(final LoLoMo summary, int i)
        {
            updateCacheIfNecessary(summary, i);
            BrowseAgent.access$1700(this$0).post(i. new BrowseAgent.FetchLoLoMoSummaryTask._cls1._cls1());
        }

            
            {
                this$1 = BrowseAgent.FetchLoLoMoSummaryTask.this;
                super();
            }
    }

}
