// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgentCallback;
import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.servicemgr.INetflixServiceCallback;
import com.netflix.mediaclient.servicemgr.KidsCharacterDetails;
import com.netflix.mediaclient.servicemgr.LoLoMo;
import com.netflix.mediaclient.servicemgr.MovieDetails;
import com.netflix.mediaclient.servicemgr.SearchResults;
import com.netflix.mediaclient.servicemgr.SeasonDetails;
import com.netflix.mediaclient.servicemgr.ShowDetails;
import com.netflix.mediaclient.servicemgr.VideoList;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service:
//            NetflixService

private class requestId
    implements BrowseAgentCallback
{

    private final int clientId;
    private final int requestId;
    final NetflixService this$0;

    public void onCWListRefresh(int i)
    {
        throw new IllegalStateException("not implemented");
    }

    public void onCWVideosFetched(List list, int i)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onCWVideosFetched");
            return;
        } else
        {
            inetflixservicecallback.onCWVideosFetched(requestId, list, i);
            return;
        }
    }

    public void onEpisodeDetailsFetched(EpisodeDetails episodedetails, int i)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onEpisodeDetailsFetched");
            return;
        } else
        {
            inetflixservicecallback.onEpisodeDetailsFetched(requestId, episodedetails, i);
            return;
        }
    }

    public void onEpisodesFetched(List list, int i)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onEpisodesFetched");
            return;
        } else
        {
            inetflixservicecallback.onEpisodesFetched(requestId, list, i);
            return;
        }
    }

    public void onGenreListsFetched(List list, int i)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onGenreListsFetched");
            return;
        } else
        {
            inetflixservicecallback.onGenreListsFetched(requestId, list, i);
            return;
        }
    }

    public void onGenreLoLoMoPrefetched(int i)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for client onGenreLoLoMoPrefetched");
            return;
        } else
        {
            inetflixservicecallback.onGenreLoLoMoPrefetched(requestId, i);
            return;
        }
    }

    public void onGenresFetched(List list, int i)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onGenresFetched");
            return;
        } else
        {
            inetflixservicecallback.onGenresFetched(requestId, list, i);
            return;
        }
    }

    public void onIQListRefresh(int i)
    {
        throw new IllegalStateException("not implemented");
    }

    public void onKidsCharacterDetailsFetched(KidsCharacterDetails kidscharacterdetails, Boolean boolean1, int i)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onKidsCharacterDetailsFetched");
            return;
        } else
        {
            inetflixservicecallback.onKidsCharacterDetailsFetched(requestId, kidscharacterdetails, boolean1, i);
            return;
        }
    }

    public void onLoLoMoPrefetched(int i)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for client onLoLoMoPrefetched");
            return;
        } else
        {
            inetflixservicecallback.onLoLoMoPrefetched(requestId, i);
            return;
        }
    }

    public void onLoLoMoSummaryFetched(LoLoMo lolomo, int i)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onLoLoMoSummaryFetched");
            return;
        } else
        {
            inetflixservicecallback.onLoLoMoSummaryFetched(requestId, lolomo, i);
            return;
        }
    }

    public void onLoMosFetched(List list, int i)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onLoMosFetched");
            return;
        } else
        {
            inetflixservicecallback.onLoMosFetched(requestId, list, i);
            return;
        }
    }

    public void onMovieDetailsFetched(MovieDetails moviedetails, int i)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onMovieDetailsFetched");
            return;
        } else
        {
            inetflixservicecallback.onMovieDetailsFetched(requestId, moviedetails, i);
            return;
        }
    }

    public void onPostPlayVideosFetched(List list, int i)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onPostPlayVideosFetched");
            return;
        } else
        {
            inetflixservicecallback.onPostPlayVideosFetched(requestId, list, i);
            return;
        }
    }

    public void onQueueAdd(int i)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onQueueAdd");
            return;
        } else
        {
            inetflixservicecallback.onQueueAdd(requestId, i);
            return;
        }
    }

    public void onQueueRemove(int i)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onQueueRemove");
            return;
        } else
        {
            inetflixservicecallback.onQueueRemove(requestId, i);
            return;
        }
    }

    public void onSearchResultsFetched(SearchResults searchresults, int i)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onSearchResultsFetched");
            return;
        } else
        {
            inetflixservicecallback.onSearchResultsFetched(requestId, searchresults, i);
            return;
        }
    }

    public void onSeasonDetailsFetched(SeasonDetails seasondetails, int i)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onSeasonDetailsFetched");
            return;
        } else
        {
            inetflixservicecallback.onSeasonDetailsFetched(requestId, seasondetails, i);
            return;
        }
    }

    public void onSeasonsFetched(List list, int i)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onSeasonsFetched");
            return;
        } else
        {
            inetflixservicecallback.onSeasonsFetched(requestId, list, i);
            return;
        }
    }

    public void onShowDetailsFetched(ShowDetails showdetails, int i)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onShowDetailsFetched");
            return;
        } else
        {
            inetflixservicecallback.onShowDetailsFetched(requestId, showdetails, i);
            return;
        }
    }

    public void onSimilarVideosFetched(VideoList videolist, int i)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onSimilarVideosFetched");
            return;
        } else
        {
            inetflixservicecallback.onSimilarVideosFetched(requestId, videolist, i);
            return;
        }
    }

    public void onVideoHide(int i)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onVideoHide");
            return;
        } else
        {
            inetflixservicecallback.onVideoHide(requestId, i);
            return;
        }
    }

    public void onVideoRatingSet(int i)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onVideoRatingSet");
            return;
        } else
        {
            inetflixservicecallback.onVideoRatingSet(requestId, i);
            return;
        }
    }

    public void onVideosFetched(List list, int i)
    {
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)NetflixService.access$1400(NetflixService.this)._mth0(clientId);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "No client callback found for onVideosFetched");
            return;
        } else
        {
            inetflixservicecallback.onVideosFetched(requestId, list, i);
            return;
        }
    }

    (int i, int j)
    {
        this$0 = NetflixService.this;
        super();
        clientId = i;
        requestId = j;
    }
}
