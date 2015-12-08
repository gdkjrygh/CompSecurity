// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseWebClient, BrowseAgentCallback, SimpleBrowseAgentCallback

private class <init> extends <init>
{

    final BrowseAgent this$0;
    private final BrowseAgentCallback webClientCallback = new SimpleBrowseAgentCallback() {

        final BrowseAgent.FetchGenresTask this$1;

        public void onGenresFetched(final List requestedGenres, int k)
        {
            updateCacheIfNecessary(requestedGenres, k);
            BrowseAgent.access$5100(this$0).post(k. new Runnable() {

                final _cls1 this$2;
                final List val$requestedGenres;
                final int val$statusCode;

                public void run()
                {
                    getCallback().onGenresFetched(requestedGenres, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                requestedGenres = list;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = BrowseAgent.FetchGenresTask.this;
                super();
            }
    };

    public void run()
    {
        List list = (List)getCachedValue();
        if (list == null)
        {
            BrowseAgent.access$000(BrowseAgent.this).fetchGenres(getCategory(), getFromIndex(), getToIndex(), webClientCallback);
            return;
        } else
        {
            webClientCallback.onGenresFetched(list, 0);
            return;
        }
    }

    public nit>(String s, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        this$0 = BrowseAgent.this;
        super(BrowseAgent.this, s, i, j, browseagentcallback);
    }
}
