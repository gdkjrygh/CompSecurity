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
        allback().onQueueRemove(val$statusCode);
    }

    is._cls1()
    {
        this$2 = final__pcls1;
        val$statusCode = I.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$RemoveFromQueueTask$1

/* anonymous class */
    class BrowseAgent.RemoveFromQueueTask._cls1 extends SimpleBrowseAgentCallback
    {

        final BrowseAgent.RemoveFromQueueTask this$1;

        public void onQueueRemove(int i)
        {
            if (i == 0)
            {
                if (BrowseAgent.RemoveFromQueueTask.access$4100(BrowseAgent.RemoveFromQueueTask.this))
                {
                    BrowseAgent.access$3700(this$0);
                }
                LogUtils.reportRemoveFromQueueActionEnded(BrowseAgent.access$4200(this$0), com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.success, null);
            } else
            {
                com.netflix.mediaclient.util.LogUtils.LogReportErrorArgs logreporterrorargs = new com.netflix.mediaclient.util.LogUtils.LogReportErrorArgs(i, ActionOnUIError.displayedError, "", null);
                LogUtils.reportRemoveFromQueueActionEnded(BrowseAgent.access$4300(this$0), com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.failed, logreporterrorargs.getError());
            }
            BrowseAgent.access$4400(this$0).post(i. new BrowseAgent.RemoveFromQueueTask._cls1._cls1());
        }

            
            {
                this$1 = BrowseAgent.RemoveFromQueueTask.this;
                super();
            }
    }

}
