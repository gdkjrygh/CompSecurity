// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.servicemgr.LoLoMo;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            SimpleBrowseAgentCallback, BrowseAgent, BrowseAgentCallback

class this._cls1 extends SimpleBrowseAgentCallback
{

    final _cls1.val.statusCode this$1;

    public void onLoLoMoSummaryFetched(final LoLoMo summary, final int statusCode)
    {
        dateCacheIfNecessary(summary, statusCode);
        BrowseAgent.access$1700(_fld0).post(new Runnable() {

            final BrowseAgent.FetchLoLoMoSummaryTask._cls1 this$2;
            final int val$statusCode;
            final LoLoMo val$summary;

            public void run()
            {
                getCallback().onLoLoMoSummaryFetched(summary, statusCode);
            }

            
            {
                this$2 = BrowseAgent.FetchLoLoMoSummaryTask._cls1.this;
                summary = lolomo;
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
