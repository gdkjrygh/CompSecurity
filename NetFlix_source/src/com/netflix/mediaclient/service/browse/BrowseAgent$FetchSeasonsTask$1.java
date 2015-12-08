// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            SimpleBrowseAgentCallback, BrowseAgent, BrowseAgentCallback

class > extends SimpleBrowseAgentCallback
{

    final _cls1.val.statusCode this$1;

    public void onSeasonsFetched(final List requestedSeasons, final int statusCode)
    {
        dateCacheIfNecessary(requestedSeasons, statusCode);
        BrowseAgent.access$1200(_fld0).post(new Runnable() {

            final BrowseAgent.FetchSeasonsTask._cls1 this$2;
            final List val$requestedSeasons;
            final int val$statusCode;

            public void run()
            {
                if (statusCode == 0 && requestedSeasons != null)
                {
                    BrowseAgent.access$1100(this$0, requestedSeasons);
                }
                getCallback().onSeasonsFetched(requestedSeasons, statusCode);
            }

            
            {
                this$2 = BrowseAgent.FetchSeasonsTask._cls1.this;
                statusCode = i;
                requestedSeasons = list;
                super();
            }
        });
    }

    _cls1.val.requestedSeasons()
    {
        this$1 = this._cls1.this;
        super();
    }
}
