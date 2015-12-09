// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.service.logging.client.model.ActionOnUIError;
import com.netflix.mediaclient.util.LogUtils;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            SimpleBrowseAgentCallback, BrowseAgent, BrowseAgentCallback

class it> extends SimpleBrowseAgentCallback
{

    final _cls1.val.statusCode this$1;

    public void onQueueAdd(final int statusCode)
    {
        if (statusCode == 0)
        {
            if (cess._mth3600(this._cls1.this))
            {
                BrowseAgent.access$3700(_fld0);
            }
            LogUtils.reportAddToQueueActionEnded(BrowseAgent.access$3800(_fld0), com.netflix.mediaclient.servicemgr.on.success, null, null);
        } else
        {
            com.netflix.mediaclient.util.nOnUIError nonuierror = new com.netflix.mediaclient.util.init>(statusCode, ActionOnUIError.displayedError, "", null);
            LogUtils.reportAddToQueueActionEnded(BrowseAgent.access$3900(_fld0), com.netflix.mediaclient.servicemgr.on.failed, nonuierror.etError(), null);
        }
        BrowseAgent.access$4000(_fld0).post(new Runnable() {

            final BrowseAgent.AddToQueueTask._cls1 this$2;
            final int val$statusCode;

            public void run()
            {
                getCallback().onQueueAdd(statusCode);
            }

            
            {
                this$2 = BrowseAgent.AddToQueueTask._cls1.this;
                statusCode = i;
                super();
            }
        });
    }

    _cls1.val.statusCode()
    {
        this$1 = this._cls1.this;
        super();
    }
}
