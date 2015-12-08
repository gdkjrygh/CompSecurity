// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import com.netflix.mediaclient.Log;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            SimpleBrowseAgentCallback, BrowseAgent

class entCallback extends SimpleBrowseAgentCallback
{

    final BrowseAgent this$0;

    public void onEpisodesFetched(List list, int i)
    {
        if (Log.isLoggable("nf_service_browseagent", 3))
        {
            Log.d("nf_bookmark", String.format("populate cache - onEpisodesFetched statusCode %d", new Object[] {
                Integer.valueOf(i)
            }));
        }
    }

    entCallback()
    {
        this$0 = BrowseAgent.this;
        super();
    }
}
