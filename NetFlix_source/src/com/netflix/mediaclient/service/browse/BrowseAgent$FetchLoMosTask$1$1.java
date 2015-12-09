// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseAgentCallback, SimpleBrowseAgentCallback

class val.statusCode
    implements Runnable
{

    final val.statusCode this$2;
    final List val$requestedLoMos;
    final int val$statusCode;

    public void run()
    {
        allback().onLoMosFetched(val$requestedLoMos, val$statusCode);
    }

    >()
    {
        this$2 = final_>;
        val$requestedLoMos = list;
        val$statusCode = I.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchLoMosTask$1

/* anonymous class */
    class BrowseAgent.FetchLoMosTask._cls1 extends SimpleBrowseAgentCallback
    {

        final BrowseAgent.FetchLoMosTask this$1;

        public void onLoMosFetched(final List requestedLoMos, int i)
        {
            updateCacheIfNecessary(requestedLoMos, i);
            BrowseAgent.access$300(this$0).post(i. new BrowseAgent.FetchLoMosTask._cls1._cls1());
        }

            
            {
                this$1 = BrowseAgent.FetchLoMosTask.this;
                super();
            }
    }

}
