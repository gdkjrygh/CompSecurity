// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseWebClient, BrowseAgentCallback, SimpleBrowseAgentCallback

private class  extends 
{

    final BrowseAgent this$0;
    private final BrowseAgentCallback webClientCallback = new SimpleBrowseAgentCallback() {

        final BrowseAgent.FetchLoMosTask this$1;

        public void onLoMosFetched(final List requestedLoMos, int k)
        {
            updateCacheIfNecessary(requestedLoMos, k);
            BrowseAgent.access$300(this$0).post(k. new Runnable() {

                final _cls1 this$2;
                final List val$requestedLoMos;
                final int val$statusCode;

                public void run()
                {
                    getCallback().onLoMosFetched(requestedLoMos, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                requestedLoMos = list;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = BrowseAgent.FetchLoMosTask.this;
                super();
            }
    };

    public void run()
    {
        List list = (List)getCachedValue();
        if (list == null)
        {
            BrowseAgent.access$000(BrowseAgent.this).fetchLoMos(getCategory(), getFromIndex(), getToIndex(), webClientCallback);
            return;
        } else
        {
            webClientCallback.onLoMosFetched(list, 0);
            return;
        }
    }

    public init>(String s, int i, int j, BrowseAgentCallback browseagentcallback, boolean flag)
    {
        this$0 = BrowseAgent.this;
        super(BrowseAgent.this, s, i, j, browseagentcallback, flag);
    }
}
