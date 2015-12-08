// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            SimpleBrowseAgentCallback, BrowseAgent, BrowseAgentCallback

class this._cls1 extends SimpleBrowseAgentCallback
{

    final _cls1.val.statusCode this$1;

    public void onGenreListsFetched(final List requestedGenreLists, final int statusCode)
    {
        dateCacheIfNecessary(requestedGenreLists, statusCode);
        BrowseAgent.access$3200(_fld0).post(new Runnable() {

            final BrowseAgent.FetchGenreListsTask._cls1 this$2;
            final List val$requestedGenreLists;
            final int val$statusCode;

            public void run()
            {
                getCallback().onGenreListsFetched(requestedGenreLists, statusCode);
            }

            
            {
                this$2 = BrowseAgent.FetchGenreListsTask._cls1.this;
                requestedGenreLists = list;
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
