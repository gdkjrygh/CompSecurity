// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            SimpleBrowseAgentCallback, BrowseAgent, BrowseAgentCallback

class  extends SimpleBrowseAgentCallback
{

    final _cls1.val.statusCode this$1;

    public void onPostPlayVideosFetched(final List postPlayVideos, final int statusCode)
    {
        BrowseAgent.access$2200(_fld0).post(new Runnable() {

            final BrowseAgent.FetchPostPlayTask._cls1 this$2;
            final List val$postPlayVideos;
            final int val$statusCode;

            public void run()
            {
                getCallback().onPostPlayVideosFetched(postPlayVideos, statusCode);
            }

            
            {
                this$2 = BrowseAgent.FetchPostPlayTask._cls1.this;
                postPlayVideos = list;
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
