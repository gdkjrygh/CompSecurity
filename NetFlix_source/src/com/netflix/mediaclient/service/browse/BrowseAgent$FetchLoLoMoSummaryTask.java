// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.servicemgr.LoLoMo;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseWebClient, BrowseAgentCallback, SimpleBrowseAgentCallback

private class this._cls0 extends this._cls0
{

    final BrowseAgent this$0;
    private final BrowseAgentCallback webClientCallback = new SimpleBrowseAgentCallback() {

        final BrowseAgent.FetchLoLoMoSummaryTask this$1;

        public void onLoLoMoSummaryFetched(final LoLoMo summary, int i)
        {
            updateCacheIfNecessary(summary, i);
            BrowseAgent.access$1700(this$0).post(i. new Runnable() {

                final _cls1 this$2;
                final int val$statusCode;
                final LoLoMo val$summary;

                public void run()
                {
                    getCallback().onLoLoMoSummaryFetched(summary, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                summary = lolomo;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = BrowseAgent.FetchLoLoMoSummaryTask.this;
                super();
            }
    };

    public void run()
    {
        LoLoMo lolomo = (LoLoMo)getCachedValue();
        if (lolomo == null)
        {
            BrowseAgent.access$000(BrowseAgent.this).fetchLoLoMoSummary(getCategory(), webClientCallback);
            return;
        } else
        {
            webClientCallback.onLoLoMoSummaryFetched(lolomo, 0);
            return;
        }
    }

    public _cls1.this._cls1(String s, BrowseAgentCallback browseagentcallback)
    {
        this$0 = BrowseAgent.this;
        super(BrowseAgent.this, s, 0, 0, browseagentcallback);
    }
}
