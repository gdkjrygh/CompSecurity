// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            SimpleBrowseAgentCallback, BrowseAgent, BrowseAgentCallback

class it> extends SimpleBrowseAgentCallback
{

    final _cls1.val.statusCode this$1;

    public void onLoMosFetched(final List requestedLoMos, final int statusCode)
    {
        dateCacheIfNecessary(requestedLoMos, statusCode);
        BrowseAgent.access$300(_fld0).post(new Runnable() {

            final BrowseAgent.FetchLoMosTask._cls1 this$2;
            final List val$requestedLoMos;
            final int val$statusCode;

            public void run()
            {
                getCallback().onLoMosFetched(requestedLoMos, statusCode);
            }

            
            {
                this$2 = BrowseAgent.FetchLoMosTask._cls1.this;
                requestedLoMos = list;
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
