// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.servicemgr.SearchResults;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseAgentCallback, SimpleBrowseAgentCallback

class val.statusCode
    implements Runnable
{

    final val.statusCode this$2;
    final SearchResults val$searchResults;
    final int val$statusCode;

    public void run()
    {
        ss._mth5500(_fld1).onSearchResultsFetched(val$searchResults, val$statusCode);
    }

    is._cls1()
    {
        this$2 = final__pcls1;
        val$searchResults = searchresults;
        val$statusCode = I.this;
        super();
    }

    // Unreferenced inner class com/netflix/mediaclient/service/browse/BrowseAgent$SearchNetflixTask$1

/* anonymous class */
    class BrowseAgent.SearchNetflixTask._cls1 extends SimpleBrowseAgentCallback
    {

        final BrowseAgent.SearchNetflixTask this$1;

        public void onSearchResultsFetched(final SearchResults searchResults, int i)
        {
            updateCacheIfNecessary(searchResults, i);
            BrowseAgent.access$5600(this$0).post(i. new BrowseAgent.SearchNetflixTask._cls1._cls1());
        }

            
            {
                this$1 = BrowseAgent.SearchNetflixTask.this;
                super();
            }
    }

}
