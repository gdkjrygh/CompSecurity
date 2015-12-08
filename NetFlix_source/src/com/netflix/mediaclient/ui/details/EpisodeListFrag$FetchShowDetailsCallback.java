// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.ShowDetails;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            EpisodeListFrag

private class requestId extends LoggingManagerCallback
{

    private final long requestId;
    final EpisodeListFrag this$0;

    public void onShowDetailsFetched(ShowDetails showdetails, int i)
    {
        super.onShowDetailsFetched(showdetails, i);
        if (requestId != EpisodeListFrag.access$800(EpisodeListFrag.this))
        {
            Log.v("EpisodeListFrag", "Ignoring stale callback");
            return;
        }
        if (i != 0)
        {
            Log.w("EpisodeListFrag", "Invalid status code");
            EpisodeListFrag.access$900(EpisodeListFrag.this);
            return;
        }
        if (showdetails == null)
        {
            Log.v("EpisodeListFrag", "No details in response");
            EpisodeListFrag.access$900(EpisodeListFrag.this);
            return;
        } else
        {
            EpisodeListFrag.access$1000(EpisodeListFrag.this, showdetails);
            return;
        }
    }

    public Q(long l)
    {
        this$0 = EpisodeListFrag.this;
        super("EpisodeListFrag");
        requestId = l;
    }
}
