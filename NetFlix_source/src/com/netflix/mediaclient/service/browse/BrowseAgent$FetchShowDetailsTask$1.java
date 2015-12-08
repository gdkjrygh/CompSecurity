// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.servicemgr.ShowDetails;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            SimpleBrowseAgentCallback, BrowseAgent, BrowseAgentCallback

class this._cls1 extends SimpleBrowseAgentCallback
{

    final _cls1.val.statusCode this$1;

    public void onShowDetailsFetched(final ShowDetails showDetails, final int statusCode)
    {
        if (statusCode == 0)
        {
            if (StringUtils.isEmpty(cess._mth2900(this._cls1.this)))
            {
                dateCacheIfNecessary(showDetails, statusCode);
            } else
            {
                BrowseAgent.access$3000(_fld0, showDetails);
            }
        }
        BrowseAgent.access$3100(_fld0).post(new Runnable() {

            final BrowseAgent.FetchShowDetailsTask._cls1 this$2;
            final ShowDetails val$showDetails;
            final int val$statusCode;

            public void run()
            {
                getCallback().onShowDetailsFetched(showDetails, statusCode);
            }

            
            {
                this$2 = BrowseAgent.FetchShowDetailsTask._cls1.this;
                showDetails = showdetails;
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
