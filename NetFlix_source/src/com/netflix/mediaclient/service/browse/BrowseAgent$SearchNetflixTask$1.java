// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.servicemgr.SearchResults;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            SimpleBrowseAgentCallback, BrowseAgent, BrowseAgentCallback

class  extends SimpleBrowseAgentCallback
{

    final _cls1.val.statusCode this$1;

    public void onSearchResultsFetched(final SearchResults searchResults, final int statusCode)
    {
        dateCacheIfNecessary(searchResults, statusCode);
        BrowseAgent.access$5600(_fld0).post(new Runnable() {

            final BrowseAgent.SearchNetflixTask._cls1 this$2;
            final SearchResults val$searchResults;
            final int val$statusCode;

            public void run()
            {
                BrowseAgent.SearchNetflixTask.access$5500(this$1).onSearchResultsFetched(searchResults, statusCode);
            }

            
            {
                this$2 = BrowseAgent.SearchNetflixTask._cls1.this;
                searchResults = searchresults;
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
