// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.servicemgr.MovieDetails;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseAgentCallback, SimpleBrowseAgentCallback

class val.statusCode
    implements Runnable
{

    final val.statusCode this$2;
    final MovieDetails val$movieDetails;
    final int val$statusCode;

    public void run()
    {
        allback().onMovieDetailsFetched(val$movieDetails, val$statusCode);
    }

    is._cls1()
    {
        this$2 = final__pcls1;
        val$movieDetails = moviedetails;
        val$statusCode = I.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$FetchMovieDetailsTask$1

/* anonymous class */
    class BrowseAgent.FetchMovieDetailsTask._cls1 extends SimpleBrowseAgentCallback
    {

        final BrowseAgent.FetchMovieDetailsTask this$1;

        public void onMovieDetailsFetched(final MovieDetails movieDetails, int i)
        {
            updateCacheIfNecessary(movieDetails, i);
            BrowseAgent.access$1800(this$0).post(i. new BrowseAgent.FetchMovieDetailsTask._cls1._cls1());
        }

            
            {
                this$1 = BrowseAgent.FetchMovieDetailsTask.this;
                super();
            }
    }

}
