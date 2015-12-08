// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model;

import android.content.Context;
import com.netflix.mediaclient.service.webclient.model.leafs.TrackableListSummary;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.netflix.mediaclient.service.webclient.model:
//            SearchPerson, SearchSuggestion, SearchVideo

public class SearchResults
    implements com.netflix.mediaclient.servicemgr.SearchResults
{
    public static class Builder
    {

        private static final int MAX_RESULTS = 10;
        private final SearchResults results = new SearchResults();

        public void addPerson(SearchPerson searchperson)
        {
            if (results.people == null)
            {
                results.people = new ArrayList(10);
                results.sectionsList.add(results.people);
            }
            results.people.add(searchperson);
        }

        public void addSuggestion(SearchSuggestion searchsuggestion)
        {
            if (results.suggestions == null)
            {
                results.suggestions = new ArrayList(10);
                results.sectionsList.add(results.suggestions);
            }
            results.suggestions.add(searchsuggestion);
        }

        public void addVideo(SearchVideo searchvideo)
        {
            if (results.videos == null)
            {
                results.videos = new ArrayList(10);
                results.sectionsList.add(results.videos);
            }
            results.videos.add(searchvideo);
        }

        public SearchResults getResults()
        {
            return results;
        }

        public void setSummary(TrackableListSummary trackablelistsummary)
        {
            results.summary = trackablelistsummary;
        }

        public Builder()
        {
        }
    }


    private List people;
    private final List sectionsList;
    private List suggestions;
    private TrackableListSummary summary;
    private List videos;

    private SearchResults()
    {
        sectionsList = new ArrayList(3);
    }


    private boolean hasPeople()
    {
        return people != null && people.size() > 0;
    }

    private boolean hasSuggestions()
    {
        return suggestions != null && suggestions.size() > 0;
    }

    private boolean hasVideos()
    {
        return videos != null && videos.size() > 0;
    }

    public int getListPos()
    {
        return 0;
    }

    public int getNumResults()
    {
        int i = 0;
        for (Iterator iterator = sectionsList.iterator(); iterator.hasNext();)
        {
            i += ((List)iterator.next()).size();
        }

        return i;
    }

    public int getNumResultsForSection(int i)
    {
        return ((List)sectionsList.get(i)).size();
    }

    public int getNumSections()
    {
        return sectionsList.size();
    }

    public String getRequestId()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return summary.getRequestId();
        }
    }

    public Object getResult(int i)
    {
        for (Iterator iterator = sectionsList.iterator(); iterator.hasNext();)
        {
            List list = (List)iterator.next();
            if (i < list.size())
            {
                return list.get(i);
            }
            i -= list.size();
        }

        return null;
    }

    public CharSequence getSectionTitle(Context context, int i)
    {
        Object obj = sectionsList.get(i);
        if (obj == videos)
        {
            return context.getString(0x7f0c01a1).toUpperCase(Locale.US);
        }
        if (obj == people)
        {
            return context.getString(0x7f0c01a2).toUpperCase(Locale.US);
        }
        if (obj == suggestions)
        {
            return context.getString(0x7f0c01a3).toUpperCase(Locale.US);
        } else
        {
            throw new IllegalStateException("Unknown section type");
        }
    }

    public int getTrackId()
    {
        if (summary == null)
        {
            return -1;
        } else
        {
            return summary.getTrackId();
        }
    }

    public boolean hasResults()
    {
        return hasVideos() || hasPeople() || hasSuggestions();
    }



/*
    static List access$102(SearchResults searchresults, List list)
    {
        searchresults.videos = list;
        return list;
    }

*/




/*
    static List access$302(SearchResults searchresults, List list)
    {
        searchresults.people = list;
        return list;
    }

*/



/*
    static List access$402(SearchResults searchresults, List list)
    {
        searchresults.suggestions = list;
        return list;
    }

*/


/*
    static TrackableListSummary access$502(SearchResults searchresults, TrackableListSummary trackablelistsummary)
    {
        searchresults.summary = trackablelistsummary;
        return trackablelistsummary;
    }

*/
}
