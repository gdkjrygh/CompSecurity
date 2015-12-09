// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.details;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.MovieDetails;

// Referenced classes of package com.netflix.mediaclient.ui.kids.details:
//            KidsMovieDetailsFrag

private class requestId extends LoggingManagerCallback
{

    private final long requestId;
    final KidsMovieDetailsFrag this$0;

    public void onMovieDetailsFetched(MovieDetails moviedetails, int i)
    {
        super.onMovieDetailsFetched(moviedetails, i);
        if (requestId != KidsMovieDetailsFrag.access$200(KidsMovieDetailsFrag.this))
        {
            Log.v("KidsMovieDetailsFrag", "Ignoring stale callback");
            return;
        }
        if (i != 0)
        {
            Log.w("KidsMovieDetailsFrag", "Invalid status code");
            KidsMovieDetailsFrag.access$300(KidsMovieDetailsFrag.this);
            return;
        }
        if (moviedetails == null)
        {
            Log.v("KidsMovieDetailsFrag", "No details in response");
            KidsMovieDetailsFrag.access$300(KidsMovieDetailsFrag.this);
            return;
        } else
        {
            KidsMovieDetailsFrag.access$400(KidsMovieDetailsFrag.this, moviedetails);
            return;
        }
    }

    public (long l)
    {
        this$0 = KidsMovieDetailsFrag.this;
        super("KidsMovieDetailsFrag");
        requestId = l;
    }
}
