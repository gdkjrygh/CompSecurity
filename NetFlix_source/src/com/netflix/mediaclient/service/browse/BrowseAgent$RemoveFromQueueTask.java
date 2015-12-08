// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.service.logging.client.model.ActionOnUIError;
import com.netflix.mediaclient.util.LogUtils;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseWebClient, BrowseAgentCallback, SimpleBrowseAgentCallback

private class iqInCache extends iqInCache
{

    private final boolean iqInCache;
    final BrowseAgent this$0;
    private final BrowseAgentCallback webClientCallback = new SimpleBrowseAgentCallback() {

        final BrowseAgent.RemoveFromQueueTask this$1;

        public void onQueueRemove(int i)
        {
            if (i == 0)
            {
                if (iqInCache)
                {
                    BrowseAgent.access$3700(this$0);
                }
                LogUtils.reportRemoveFromQueueActionEnded(BrowseAgent.access$4200(this$0), com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.success, null);
            } else
            {
                com.netflix.mediaclient.util.LogUtils.LogReportErrorArgs logreporterrorargs = new com.netflix.mediaclient.util.LogUtils.LogReportErrorArgs(i, ActionOnUIError.displayedError, "", null);
                LogUtils.reportRemoveFromQueueActionEnded(BrowseAgent.access$4300(this$0), com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.failed, logreporterrorargs.getError());
            }
            BrowseAgent.access$4400(this$0).post(i. new Runnable() {

                final _cls1 this$2;
                final int val$statusCode;

                public void run()
                {
                    getCallback().onQueueRemove(statusCode);
                }

            
            {
                this$2 = final__pcls1;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = BrowseAgent.RemoveFromQueueTask.this;
                super();
            }
    };

    public void run()
    {
        BrowseAgent.access$000(BrowseAgent.this).removeFromQueue(getCategory(), getFromIndex(), getToIndex(), iqInCache, webClientCallback);
    }


    public (String s, BrowseAgentCallback browseagentcallback)
    {
        this$0 = BrowseAgent.this;
        super(s, BrowseAgent.access$3400(), BrowseAgent.access$3500(), browseagentcallback);
        iqInCache = areIqIdsInCache();
    }
}
