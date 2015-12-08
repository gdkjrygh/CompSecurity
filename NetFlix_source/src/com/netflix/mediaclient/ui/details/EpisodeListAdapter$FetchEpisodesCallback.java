// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            EpisodeListAdapter

private class numItems extends LoggingManagerCallback
{

    private final int numItems;
    private final long requestId;
    final EpisodeListAdapter this$0;

    public void onEpisodesFetched(List list, int i)
    {
        super.onEpisodesFetched(list, i);
        if (EpisodeListAdapter.access$100(EpisodeListAdapter.this).destroyed())
        {
            return;
        }
        if (requestId != EpisodeListAdapter.access$200(EpisodeListAdapter.this))
        {
            Log.v("EpisodeListAdapter", "Ignoring stale request");
            return;
        }
        EpisodeListAdapter.access$302(EpisodeListAdapter.this, true);
        EpisodeListAdapter.access$402(EpisodeListAdapter.this, false);
        onLoaded(i);
        if (i != 0)
        {
            Log.w("EpisodeListAdapter", "Invalid status code");
            EpisodeListAdapter.access$302(EpisodeListAdapter.this, false);
            EpisodeListAdapter.access$500(EpisodeListAdapter.this);
            return;
        }
        if (list == null || list.size() == 0)
        {
            Log.v("EpisodeListAdapter", "No details in response");
            EpisodeListAdapter.access$302(EpisodeListAdapter.this, false);
            notifyDataSetChanged();
            return;
        }
        if (Log.isLoggable("EpisodeListAdapter", 2))
        {
            Log.v("EpisodeListAdapter", (new StringBuilder()).append("Got ").append(list.size()).append(" items, expected ").append(numItems).toString());
        }
        if (list.size() < numItems)
        {
            EpisodeListAdapter.access$302(EpisodeListAdapter.this, false);
        }
        EpisodeListAdapter.access$600(EpisodeListAdapter.this, list);
    }

    public Q(long l, int i)
    {
        this$0 = EpisodeListAdapter.this;
        super("EpisodeListAdapter");
        requestId = l;
        numItems = i;
    }
}
