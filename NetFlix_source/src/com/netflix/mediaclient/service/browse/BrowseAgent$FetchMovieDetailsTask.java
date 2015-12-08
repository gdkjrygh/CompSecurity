// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.servicemgr.MovieDetails;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseWebClient, BrowseAgentCallback, SimpleBrowseAgentCallback

private class  extends 
{

    final BrowseAgent this$0;
    private final BrowseAgentCallback webClientCallback = new SimpleBrowseAgentCallback() {

        final BrowseAgent.FetchMovieDetailsTask this$1;

        public void onMovieDetailsFetched(final MovieDetails movieDetails, int i)
        {
            updateCacheIfNecessary(movieDetails, i);
            BrowseAgent.access$1800(this$0).post(i. new Runnable() {

                final _cls1 this$2;
                final MovieDetails val$movieDetails;
                final int val$statusCode;

                public void run()
                {
                    getCallback().onMovieDetailsFetched(movieDetails, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                movieDetails = moviedetails;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = BrowseAgent.FetchMovieDetailsTask.this;
                super();
            }
    };

    public void run()
    {
        MovieDetails moviedetails = (MovieDetails)getCachedValue();
        if (moviedetails == null)
        {
            BrowseAgent.access$000(BrowseAgent.this).fetchMovieDetails(getCategory(), webClientCallback);
            return;
        } else
        {
            webClientCallback.onMovieDetailsFetched(moviedetails, 0);
            return;
        }
    }

    public _cls1.this._cls1(String s, BrowseAgentCallback browseagentcallback)
    {
        this$0 = BrowseAgent.this;
        super(BrowseAgent.this, s, 0, 0, browseagentcallback);
    }
}
