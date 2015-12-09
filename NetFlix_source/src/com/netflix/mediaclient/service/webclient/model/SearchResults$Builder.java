// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model;

import com.netflix.mediaclient.service.webclient.model.leafs.TrackableListSummary;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.webclient.model:
//            SearchResults, SearchPerson, SearchSuggestion, SearchVideo

public static class mary
{

    private static final int MAX_RESULTS = 10;
    private final SearchResults results = new SearchResults(null);

    public void addPerson(SearchPerson searchperson)
    {
        if (SearchResults.access$300(results) == null)
        {
            SearchResults.access$302(results, new ArrayList(10));
            SearchResults.access$200(results).add(SearchResults.access$300(results));
        }
        SearchResults.access$300(results).add(searchperson);
    }

    public void addSuggestion(SearchSuggestion searchsuggestion)
    {
        if (SearchResults.access$400(results) == null)
        {
            SearchResults.access$402(results, new ArrayList(10));
            SearchResults.access$200(results).add(SearchResults.access$400(results));
        }
        SearchResults.access$400(results).add(searchsuggestion);
    }

    public void addVideo(SearchVideo searchvideo)
    {
        if (SearchResults.access$100(results) == null)
        {
            SearchResults.access$102(results, new ArrayList(10));
            SearchResults.access$200(results).add(SearchResults.access$100(results));
        }
        SearchResults.access$100(results).add(searchvideo);
    }

    public SearchResults getResults()
    {
        return results;
    }

    public void setSummary(TrackableListSummary trackablelistsummary)
    {
        SearchResults.access$502(results, trackablelistsummary);
    }

    public mary()
    {
    }
}
