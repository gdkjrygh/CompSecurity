// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.Log;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            SimpleBrowseAgentCallback, BrowseAgent, BrowseAgentCallback

class  extends SimpleBrowseAgentCallback
{

    final ast this$1;

    public void onCWVideosFetched(final List requestedVideos, final int statusCode)
    {
        dateCacheIfNecessary(requestedVideos, statusCode);
        BrowseAgent.access$1400(_fld0).post(new Runnable() {

            final BrowseAgent.FetchCWVideosTask._cls1 this$2;
            final List val$requestedVideos;
            final int val$statusCode;

            public void run()
            {
                getCallback().onCWVideosFetched(requestedVideos, statusCode);
                if (-64 == statusCode)
                {
                    Log.e("nf_service_browseagent", "Map cache miss for CW - refresh");
                    sendHomeRefreshBrodcast();
                }
            }

            
            {
                this$2 = BrowseAgent.FetchCWVideosTask._cls1.this;
                requestedVideos = list;
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
