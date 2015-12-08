// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            EpisodeListFrag

private class requestId extends LoggingManagerCallback
{

    private final long requestId;
    final EpisodeListFrag this$0;

    public void onSeasonsFetched(List list, int i)
    {
        super.onSeasonsFetched(list, i);
        if (requestId != EpisodeListFrag.access$800(EpisodeListFrag.this))
        {
            Log.v("EpisodeListFrag", "Stale request - ignoring");
            return;
        }
        EpisodeListFrag.access$1102(EpisodeListFrag.this, false);
        if (i != 0)
        {
            Log.w("EpisodeListFrag", "Invalid status code");
            EpisodeListFrag.access$900(EpisodeListFrag.this);
            return;
        }
        if (list == null)
        {
            Log.v("EpisodeListFrag", "No details in response");
            EpisodeListFrag.access$900(EpisodeListFrag.this);
            return;
        } else
        {
            EpisodeListFrag.access$1200(EpisodeListFrag.this, list);
            return;
        }
    }

    public (long l)
    {
        this$0 = EpisodeListFrag.this;
        super("EpisodeListFrag");
        requestId = l;
    }
}
