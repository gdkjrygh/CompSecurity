// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.service.logging.client.model.ActionOnUIError;
import com.netflix.mediaclient.util.LogUtils;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseAgentCallback, SimpleBrowseAgentCallback

class val.statusCode
    implements Runnable
{

    final val.statusCode this$2;
    final int val$statusCode;

    public void run()
    {
        allback().onQueueAdd(val$statusCode);
    }

    >()
    {
        this$2 = final_>;
        val$statusCode = I.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$AddToQueueTask$1

/* anonymous class */
    class BrowseAgent.AddToQueueTask._cls1 extends SimpleBrowseAgentCallback
    {

        final BrowseAgent.AddToQueueTask this$1;

        public void onQueueAdd(int i)
        {
            if (i == 0)
            {
                if (BrowseAgent.AddToQueueTask.access$3600(BrowseAgent.AddToQueueTask.this))
                {
                    BrowseAgent.access$3700(this$0);
                }
                LogUtils.reportAddToQueueActionEnded(BrowseAgent.access$3800(this$0), com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.success, null, null);
            } else
            {
                com.netflix.mediaclient.util.LogUtils.LogReportErrorArgs logreporterrorargs = new com.netflix.mediaclient.util.LogUtils.LogReportErrorArgs(i, ActionOnUIError.displayedError, "", null);
                LogUtils.reportAddToQueueActionEnded(BrowseAgent.access$3900(this$0), com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.failed, logreporterrorargs.getError(), null);
            }
            BrowseAgent.access$4000(this$0).post(i. new BrowseAgent.AddToQueueTask._cls1._cls1());
        }

            
            {
                this$1 = BrowseAgent.AddToQueueTask.this;
                super();
            }
    }

}
