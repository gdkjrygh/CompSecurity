// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseWebClient, BrowseAgentCallback, SimpleBrowseAgentCallback

private class this._cls0 extends this._cls0
{

    final BrowseAgent this$0;
    private final BrowseAgentCallback webClientCallback = new SimpleBrowseAgentCallback() {

        final BrowseAgent.FetchPostPlayTask this$1;

        public void onPostPlayVideosFetched(final List postPlayVideos, int i)
        {
            BrowseAgent.access$2200(this$0).post(i. new Runnable() {

                final _cls1 this$2;
                final List val$postPlayVideos;
                final int val$statusCode;

                public void run()
                {
                    getCallback().onPostPlayVideosFetched(postPlayVideos, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                postPlayVideos = list;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = BrowseAgent.FetchPostPlayTask.this;
                super();
            }
    };

    public void run()
    {
        BrowseAgent.access$000(BrowseAgent.this).fetchPostPlayVideos(getCategory(), webClientCallback);
    }

    public t>(String s, BrowseAgentCallback browseagentcallback)
    {
        this$0 = BrowseAgent.this;
        super(s, 0, 0, browseagentcallback);
    }
}
