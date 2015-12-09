// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import com.netflix.mediaclient.Log;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            ManagerCallback, EpisodeDetails, KidsCharacterDetails, LoLoMo, 
//            MovieDetails, SearchResults, SeasonDetails, ShowDetails, 
//            VideoList

public class LoggingManagerCallback
    implements ManagerCallback
{

    protected final String tag;

    public LoggingManagerCallback(String s)
    {
        tag = s;
    }

    public void onCWVideosFetched(List list, int i)
    {
        String s = tag;
        int j;
        if (list == null)
        {
            j = -1;
        } else
        {
            j = list.size();
        }
        Log.v(s, String.format("onCWVideosFetched, num: %d, status: %d", new Object[] {
            Integer.valueOf(j), Integer.valueOf(i)
        }));
    }

    public void onConnectWithFacebookComplete(int i, String s)
    {
        Log.v(tag, String.format("onConnectWithFacebookComplete, status: %d, errorMsg: %s", new Object[] {
            Integer.valueOf(i), s
        }));
    }

    public void onEpisodeDetailsFetched(EpisodeDetails episodedetails, int i)
    {
        String s = tag;
        if (episodedetails == null)
        {
            episodedetails = "null";
        } else
        {
            episodedetails = episodedetails.getTitle();
        }
        Log.v(s, String.format("onEpisodeDetailsFetched, title: %s, status: %d", new Object[] {
            episodedetails, Integer.valueOf(i)
        }));
    }

    public void onEpisodesFetched(List list, int i)
    {
        String s = tag;
        int j;
        if (list == null)
        {
            j = -1;
        } else
        {
            j = list.size();
        }
        Log.v(s, String.format("onEpisodesFetched, num: %d, status: %d", new Object[] {
            Integer.valueOf(j), Integer.valueOf(i)
        }));
    }

    public void onGenreListsFetched(List list, int i)
    {
        String s = tag;
        int j;
        if (list == null)
        {
            j = -1;
        } else
        {
            j = list.size();
        }
        Log.v(s, String.format("onGenreListsFetched, num: %d, status: %d", new Object[] {
            Integer.valueOf(j), Integer.valueOf(i)
        }));
    }

    public void onGenreLoLoMoPrefetched(int i)
    {
        Log.v(tag, String.format("onGenreLoLoMoPrefetched, status: %d", new Object[] {
            Integer.valueOf(i)
        }));
    }

    public void onGenresFetched(List list, int i)
    {
        String s = tag;
        int j;
        if (list == null)
        {
            j = -1;
        } else
        {
            j = list.size();
        }
        Log.v(s, String.format("onGenresFetched, num: %d, status: %d", new Object[] {
            Integer.valueOf(j), Integer.valueOf(i)
        }));
    }

    public void onKidsCharacterDetailsFetched(KidsCharacterDetails kidscharacterdetails, Boolean boolean1, int i)
    {
        boolean1 = tag;
        if (kidscharacterdetails == null)
        {
            kidscharacterdetails = "null";
        } else
        {
            kidscharacterdetails = kidscharacterdetails.getTitle();
        }
        Log.v(boolean1, String.format("onKidsCharacterDetailsFetched, title: %s, status: %d", new Object[] {
            kidscharacterdetails, Integer.valueOf(i)
        }));
    }

    public void onLoLoMoPrefetched(int i)
    {
        Log.v(tag, String.format("onLoLoMoPrefetched, status: %d", new Object[] {
            Integer.valueOf(i)
        }));
    }

    public void onLoLoMoSummaryFetched(LoLoMo lolomo, int i)
    {
        Log.v(tag, String.format("onLoLoMoSummaryFetched, num: %d, status: %d", new Object[] {
            Integer.valueOf(lolomo.getNumLoMos()), Integer.valueOf(i)
        }));
    }

    public void onLoMosFetched(List list, int i)
    {
        String s = tag;
        int j;
        if (list == null)
        {
            j = -1;
        } else
        {
            j = list.size();
        }
        Log.v(s, String.format("onLoMosFetched, num: %d, status: %d", new Object[] {
            Integer.valueOf(j), Integer.valueOf(i)
        }));
    }

    public void onLoginComplete(int i, String s)
    {
        Log.v(tag, String.format("onLoginComplete, status: %d, errorMsg: %s", new Object[] {
            Integer.valueOf(i), s
        }));
    }

    public void onLogoutComplete(int i)
    {
        Log.v(tag, String.format("onLogoutComplete, status: %d", new Object[] {
            Integer.valueOf(i)
        }));
    }

    public void onMovieDetailsFetched(MovieDetails moviedetails, int i)
    {
        String s = tag;
        if (moviedetails == null)
        {
            moviedetails = "null";
        } else
        {
            moviedetails = moviedetails.getTitle();
        }
        Log.v(s, String.format("onMovieDetailsFetched, title: %s, status: %d", new Object[] {
            moviedetails, Integer.valueOf(i)
        }));
    }

    public void onPinVerified(boolean flag, int i)
    {
        Log.v(tag, String.format("onPinVerified, status: %d, isPinValid: %s", new Object[] {
            Integer.valueOf(i), Boolean.valueOf(flag)
        }));
    }

    public void onPostPlayVideosFetched(List list, int i)
    {
        String s = tag;
        int j;
        if (list == null)
        {
            j = -1;
        } else
        {
            j = list.size();
        }
        Log.v(s, String.format("onPostPlayVideosFetched, num: %d, status: %d", new Object[] {
            Integer.valueOf(j), Integer.valueOf(i)
        }));
    }

    public void onQueueAdd(int i)
    {
        Log.v(tag, String.format("onQueueAdd, status: %d", new Object[] {
            Integer.valueOf(i)
        }));
    }

    public void onQueueRemove(int i)
    {
        Log.v(tag, String.format("onQueueRemove, status: %d", new Object[] {
            Integer.valueOf(i)
        }));
    }

    public void onResourceFetched(String s, String s1, int i)
    {
        Log.v(tag, String.format("onResourceFetched, remoteUrl: %s, status: %d", new Object[] {
            s, Integer.valueOf(i)
        }));
    }

    public void onSearchResultsFetched(SearchResults searchresults, int i)
    {
        int k = -1;
        String s = tag;
        int j;
        if (searchresults == null)
        {
            j = -1;
        } else
        {
            j = searchresults.getNumResults();
        }
        if (searchresults != null)
        {
            k = searchresults.getNumSections();
        }
        Log.v(s, String.format("onSearchResultsFetched, total results: %d, number of sections: %d, status: %d", new Object[] {
            Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i)
        }));
    }

    public void onSeasonDetailsFetched(SeasonDetails seasondetails, int i)
    {
        String s = tag;
        if (seasondetails == null)
        {
            seasondetails = "null";
        } else
        {
            seasondetails = seasondetails.getTitle();
        }
        Log.v(s, String.format("onSeasonDetailsFetched, title: %s, status: %d", new Object[] {
            seasondetails, Integer.valueOf(i)
        }));
    }

    public void onSeasonsFetched(List list, int i)
    {
        String s = tag;
        int j;
        if (list == null)
        {
            j = -1;
        } else
        {
            j = list.size();
        }
        Log.v(s, String.format("onSeasonsFetched, num: %d, status: %d", new Object[] {
            Integer.valueOf(j), Integer.valueOf(i)
        }));
    }

    public void onShowDetailsFetched(ShowDetails showdetails, int i)
    {
        String s = tag;
        if (showdetails == null)
        {
            showdetails = "null";
        } else
        {
            showdetails = showdetails.getTitle();
        }
        Log.v(s, String.format("onShowDetailsFetched, title: %s, status: %d", new Object[] {
            showdetails, Integer.valueOf(i)
        }));
    }

    public void onSimilarVideosFetched(VideoList videolist, int i)
    {
        String s = tag;
        int j;
        if (videolist == null)
        {
            j = -1;
        } else
        {
            j = videolist.size();
        }
        Log.v(s, String.format("onSimilarVideosFetched, num videos: %d, status: %d", new Object[] {
            Integer.valueOf(j), Integer.valueOf(i)
        }));
    }

    public void onVideoHide(int i)
    {
        Log.v(tag, String.format("onVideoUnshared, status: %d", new Object[] {
            Integer.valueOf(i)
        }));
    }

    public void onVideoRatingSet(int i)
    {
        Log.v(tag, String.format("onVideoRatingSet, status: %d", new Object[] {
            Integer.valueOf(i)
        }));
    }

    public void onVideosFetched(List list, int i)
    {
        String s = tag;
        int j;
        if (list == null)
        {
            j = -1;
        } else
        {
            j = list.size();
        }
        Log.v(s, String.format("onVideosFetched, num: %d, status: %d", new Object[] {
            Integer.valueOf(j), Integer.valueOf(i)
        }));
    }
}
