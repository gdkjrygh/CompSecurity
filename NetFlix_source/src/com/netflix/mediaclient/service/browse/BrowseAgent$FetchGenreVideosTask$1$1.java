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
    final List val$requestedVideos;
    final int val$statusCode;

    public void run()
    {
        allback().onVideosFetched(val$requestedVideos, val$statusCode);
    }

    is._cls1()
    {
        this$2 = final__pcls1;
        val$requestedVideos = list;
        val$statusCode = I.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchGenreVideosTask$1

/* anonymous class */
    class BrowseAgent.FetchGenreVideosTask._cls1 extends SimpleBrowseAgentCallback
    {

        final BrowseAgent.FetchGenreVideosTask this$1;

        public void onVideosFetched(final List requestedVideos, int i)
        {
            updateCacheIfNecessary(requestedVideos, i);
            BrowseAgent.access$500(this$0).post(i. new BrowseAgent.FetchGenreVideosTask._cls1._cls1());
        }

            
            {
                this$1 = BrowseAgent.FetchGenreVideosTask.this;
                super();
            }
    }

}
