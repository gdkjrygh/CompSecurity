// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.Log;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseAgentCallback, SimpleBrowseAgentCallback

class val.statusCode
    implements Runnable
{

    final ast this$2;
    final List val$requestedVideos;
    final int val$statusCode;

    public void run()
    {
        allback().onVideosFetched(val$requestedVideos, val$statusCode);
        if (-64 == val$statusCode)
        {
            Log.e("nf_service_browseagent", "Map cache miss on FetchVideos - refresh");
            sendHomeRefreshBrodcast();
        }
    }

    ()
    {
        this$2 = final_;
        val$requestedVideos = list;
        val$statusCode = I.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchVideosTask$1

/* anonymous class */
    class BrowseAgent.FetchVideosTask._cls1 extends SimpleBrowseAgentCallback
    {

        final BrowseAgent.FetchVideosTask this$1;

        public void onVideosFetched(final List requestedVideos, int i)
        {
            updateCacheIfNecessary(requestedVideos, i);
            BrowseAgent.access$400(this$0).post(i. new BrowseAgent.FetchVideosTask._cls1._cls1());
        }

            
            {
                this$1 = BrowseAgent.FetchVideosTask.this;
                super();
            }
    }

}
