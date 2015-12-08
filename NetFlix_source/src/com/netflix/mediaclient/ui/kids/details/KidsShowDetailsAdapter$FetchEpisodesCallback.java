// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.details;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.kids.details:
//            KidsShowDetailsAdapter

private class to extends LoggingManagerCallback
{

    private int from;
    private final long requestId;
    final KidsShowDetailsAdapter this$0;
    private int to;

    public void onEpisodesFetched(List list, int i)
    {
        List list1;
label0:
        {
            super.onEpisodesFetched(list, i);
            if (KidsShowDetailsAdapter.access$000(KidsShowDetailsAdapter.this).destroyed())
            {
                return;
            }
            if (requestId != KidsShowDetailsAdapter.access$100(KidsShowDetailsAdapter.this))
            {
                Log.v("KidsShowDetailsAdapter", "Ignoring stale request");
                return;
            }
            KidsShowDetailsAdapter.access$202(KidsShowDetailsAdapter.this, false);
            if (i == 0 && list != null)
            {
                list1 = list;
                if (list.size() != 0)
                {
                    break label0;
                }
            }
            Log.w("KidsShowDetailsAdapter", "Error occurred");
            list = new ArrayList();
            i = 0;
            do
            {
                list1 = list;
                if (i >= (to - from) + 1)
                {
                    break;
                }
                list.add(KidsShowDetailsAdapter.access$300(KidsShowDetailsAdapter.this));
                i++;
            } while (true);
        }
        if (Log.isLoggable("KidsShowDetailsAdapter", 2))
        {
            Log.v("KidsShowDetailsAdapter", (new StringBuilder()).append("Received episodes: ").append(list1.size()).append(", from: ").append(from).append(", to: ").append(to).toString());
            EpisodeDetails episodedetails;
            for (list = list1.iterator(); list.hasNext(); Log.v("KidsShowDetailsAdapter", String.format("  S%02d:E%02d - %s", new Object[] {
    Integer.valueOf(episodedetails.getSeasonNumber()), Integer.valueOf(episodedetails.getEpisodeNumber()), episodedetails.getTitle()
})))
            {
                episodedetails = (EpisodeDetails)list.next();
            }

        }
        for (i = 0; i < list1.size(); i++)
        {
            KidsShowDetailsAdapter.access$400(KidsShowDetailsAdapter.this).set(from + i, list1.get(i));
        }

        notifyDataSetChanged();
    }

    public (long l, int i, int j)
    {
        this$0 = KidsShowDetailsAdapter.this;
        super("KidsShowDetailsAdapter");
        requestId = l;
        from = i;
        to = j;
    }
}
