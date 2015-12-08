// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.service.logging.client.model.ActionOnUIError;
import com.netflix.mediaclient.util.LogUtils;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            SimpleBrowseAgentCallback, BrowseAgent, BrowseAgentCallback

class this._cls1 extends SimpleBrowseAgentCallback
{

    final _cls1.val.statusCode this$1;

    public void onQueueRemove(final int statusCode)
    {
        if (statusCode == 0)
        {
            if (cess._mth4100(this._cls1.this))
            {
                BrowseAgent.access$3700(_fld0);
            }
            LogUtils.reportRemoveFromQueueActionEnded(BrowseAgent.access$4200(_fld0), com.netflix.mediaclient.servicemgr.ccess, null);
        } else
        {
            com.netflix.mediaclient.util.Error error = new com.netflix.mediaclient.util.(statusCode, ActionOnUIError.displayedError, "", null);
            LogUtils.reportRemoveFromQueueActionEnded(BrowseAgent.access$4300(_fld0), com.netflix.mediaclient.servicemgr.iled, error.or());
        }
        BrowseAgent.access$4400(_fld0).post(new Runnable() {

            final BrowseAgent.RemoveFromQueueTask._cls1 this$2;
            final int val$statusCode;

            public void run()
            {
                getCallback().onQueueRemove(statusCode);
            }

            
            {
                this$2 = BrowseAgent.RemoveFromQueueTask._cls1.this;
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
