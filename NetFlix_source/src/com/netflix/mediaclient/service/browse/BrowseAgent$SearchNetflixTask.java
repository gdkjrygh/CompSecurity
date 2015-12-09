// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse;

import android.os.Handler;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.ProfileType;
import com.netflix.mediaclient.servicemgr.SearchResults;
import com.netflix.mediaclient.servicemgr.UserProfile;

// Referenced classes of package com.netflix.mediaclient.service.browse:
//            BrowseAgent, BrowseWebClient, BrowseAgentCallback, SimpleBrowseAgentCallback

private class callback extends callback
{

    private final BrowseAgentCallback callback;
    private final String query;
    final BrowseAgent this$0;
    private final BrowseAgentCallback webClientCallback = new SimpleBrowseAgentCallback() {

        final BrowseAgent.SearchNetflixTask this$1;

        public void onSearchResultsFetched(final SearchResults searchResults, int i)
        {
            updateCacheIfNecessary(searchResults, i);
            BrowseAgent.access$5600(this$0).post(i. new Runnable() {

                final _cls1 this$2;
                final SearchResults val$searchResults;
                final int val$statusCode;

                public void run()
                {
                    callback.onSearchResultsFetched(searchResults, statusCode);
                }

            
            {
                this$2 = final__pcls1;
                searchResults = searchresults;
                statusCode = I.this;
                super();
            }
            });
        }

            
            {
                this$1 = BrowseAgent.SearchNetflixTask.this;
                super();
            }
    };

    private String sanitizeQuery(String s)
    {
        String s1 = s.replaceAll("\\s+", " ");
        if (Log.isLoggable("nf_service_browseagent", 2))
        {
            Log.v("nf_service_browseagent", (new StringBuilder()).append("Sanitized query from: \"").append(s).append("\" to \"").append(s1).append("\"").toString());
        }
        return s1;
    }

    public void run()
    {
        Object obj = (SearchResults)getCachedValue();
        if (obj == null)
        {
            obj = ProfileType.STANDARD;
            UserProfile userprofile = BrowseAgent.access$5400(BrowseAgent.this).getCurrentProfile();
            if (userprofile != null)
            {
                obj = userprofile.getProfileType();
            }
            BrowseAgent.access$000(BrowseAgent.this).searchNetflix(query, ((ProfileType) (obj)), webClientCallback);
            return;
        } else
        {
            webClientCallback.onSearchResultsFetched(((SearchResults) (obj)), 0);
            return;
        }
    }


    public t>(String s, BrowseAgentCallback browseagentcallback)
    {
        this$0 = BrowseAgent.this;
        super(BrowseAgent.this, s, 0, 0, browseagentcallback);
        query = sanitizeQuery(s);
        callback = browseagentcallback;
    }
}
