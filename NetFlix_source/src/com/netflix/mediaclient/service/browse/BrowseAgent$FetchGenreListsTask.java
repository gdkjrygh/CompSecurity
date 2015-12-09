// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseWebClient, BrowseAgentCallback, SimpleBrowseAgentCallback

private class t> extends t>
{

    final BrowseAgent this$0;
    private final BrowseAgentCallback webClientCallback = new SimpleBrowseAgentCallback() {

        final BrowseAgent.FetchGenreListsTask this$1;

        public void onGenreListsFetched(final List requestedGenreLists, int i)
        {
            updateCacheIfNecessary(requestedGenreLists, i);
            BrowseAgent.access$3200(this$0).post(i. new Runnable() {

                final _cls1 this$2;
                final List val$requestedGenreLists;
                final int val$statusCode;

                public void run()
                {
                    getCallback().onGenreListsFetched(requestedGenreLists, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                requestedGenreLists = list;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = BrowseAgent.FetchGenreListsTask.this;
                super();
            }
    };

    public void run()
    {
        List list = (List)getCachedValue();
        if (list == null)
        {
            BrowseAgent.access$000(BrowseAgent.this).fetchGenreLists(webClientCallback);
            return;
        } else
        {
            webClientCallback.onGenreListsFetched(list, 0);
            return;
        }
    }

    public (BrowseAgentCallback browseagentcallback)
    {
        this$0 = BrowseAgent.this;
        super(BrowseAgent.this, "genreList", 0, 0, browseagentcallback, false);
    }
}
