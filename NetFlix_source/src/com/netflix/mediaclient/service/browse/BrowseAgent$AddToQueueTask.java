// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.service.logging.client.model.ActionOnUIError;
import com.netflix.mediaclient.util.LogUtils;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseWebClient, BrowseAgentCallback, SimpleBrowseAgentCallback

private class  extends 
{

    private final boolean iqInCache;
    final BrowseAgent this$0;
    private final int trackId;
    private final BrowseAgentCallback webClientCallback = new SimpleBrowseAgentCallback() {

        final BrowseAgent.AddToQueueTask this$1;

        public void onQueueAdd(int j)
        {
            if (j == 0)
            {
                if (iqInCache)
                {
                    BrowseAgent.access$3700(this$0);
                }
                LogUtils.reportAddToQueueActionEnded(BrowseAgent.access$3800(this$0), com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.success, null, null);
            } else
            {
                com.netflix.mediaclient.util.LogUtils.LogReportErrorArgs logreporterrorargs = new com.netflix.mediaclient.util.LogUtils.LogReportErrorArgs(j, ActionOnUIError.displayedError, "", null);
                LogUtils.reportAddToQueueActionEnded(BrowseAgent.access$3900(this$0), com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.failed, logreporterrorargs.getError(), null);
            }
            BrowseAgent.access$4000(this$0).post(j. new Runnable() {

                final _cls1 this$2;
                final int val$statusCode;

                public void run()
                {
                    getCallback().onQueueAdd(statusCode);
                }

            
            {
                this$2 = final__pcls1;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = BrowseAgent.AddToQueueTask.this;
                super();
            }
    };

    public void run()
    {
        BrowseAgent.access$000(BrowseAgent.this).addToQueue(getCategory(), getFromIndex(), getToIndex(), trackId, iqInCache, webClientCallback);
    }


    public init>(String s, int i, BrowseAgentCallback browseagentcallback)
    {
        this$0 = BrowseAgent.this;
        super(s, BrowseAgent.access$3400(), BrowseAgent.access$3500(), browseagentcallback);
        trackId = i;
        iqInCache = areIqIdsInCache();
    }
}
