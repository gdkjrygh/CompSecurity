// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.servicemgr.MovieDetails;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            SimpleBrowseAgentCallback, BrowseAgent, BrowseAgentCallback

class this._cls1 extends SimpleBrowseAgentCallback
{

    final _cls1.val.statusCode this$1;

    public void onMovieDetailsFetched(final MovieDetails movieDetails, final int statusCode)
    {
        dateCacheIfNecessary(movieDetails, statusCode);
        BrowseAgent.access$1800(_fld0).post(new Runnable() {

            final BrowseAgent.FetchMovieDetailsTask._cls1 this$2;
            final MovieDetails val$movieDetails;
            final int val$statusCode;

            public void run()
            {
                getCallback().onMovieDetailsFetched(movieDetails, statusCode);
            }

            
            {
                this$2 = BrowseAgent.FetchMovieDetailsTask._cls1.this;
                movieDetails = moviedetails;
                statusCode = i;
                super();
            }
        });
    }

    _cls1.val.statusCode()
    {
        this$1 = this._cls1.this;
        super();
    }
}
