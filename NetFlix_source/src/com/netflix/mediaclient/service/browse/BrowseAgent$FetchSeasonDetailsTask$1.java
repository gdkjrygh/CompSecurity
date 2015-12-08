// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.servicemgr.SeasonDetails;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            SimpleBrowseAgentCallback, BrowseAgent, BrowseAgentCallback

class this._cls1 extends SimpleBrowseAgentCallback
{

    final _cls1.val.statusCode this$1;

    public void onSeasonDetailsFetched(final SeasonDetails seasonDetails, final int statusCode)
    {
        dateCacheIfNecessary(seasonDetails, statusCode);
        BrowseAgent.access$2800(_fld0).post(new Runnable() {

            final BrowseAgent.FetchSeasonDetailsTask._cls1 this$2;
            final SeasonDetails val$seasonDetails;
            final int val$statusCode;

            public void run()
            {
                getCallback().onSeasonDetailsFetched(seasonDetails, statusCode);
            }

            
            {
                this$2 = BrowseAgent.FetchSeasonDetailsTask._cls1.this;
                seasonDetails = seasondetails;
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
