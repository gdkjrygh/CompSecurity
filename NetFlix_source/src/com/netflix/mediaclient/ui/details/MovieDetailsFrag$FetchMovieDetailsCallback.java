// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.MovieDetails;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            MovieDetailsFrag

private class requestId extends LoggingManagerCallback
{

    private final long requestId;
    final MovieDetailsFrag this$0;

    public void onMovieDetailsFetched(MovieDetails moviedetails, int i)
    {
        super.onMovieDetailsFetched(moviedetails, i);
        if (requestId != MovieDetailsFrag.access$000(MovieDetailsFrag.this) || MovieDetailsFrag.access$100(MovieDetailsFrag.this))
        {
            Log.v("MovieDetailsFrag", "Ignoring stale callback");
            return;
        }
        MovieDetailsFrag.access$202(MovieDetailsFrag.this, false);
        if (i != 0)
        {
            Log.w("MovieDetailsFrag", "Invalid status code");
            showErrorView();
            return;
        }
        if (moviedetails == null)
        {
            Log.v("MovieDetailsFrag", "No details in response");
            showErrorView();
            return;
        } else
        {
            showDetailsView(moviedetails);
            return;
        }
    }

    public (long l)
    {
        this$0 = MovieDetailsFrag.this;
        super("MovieDetailsFrag");
        requestId = l;
    }
}
