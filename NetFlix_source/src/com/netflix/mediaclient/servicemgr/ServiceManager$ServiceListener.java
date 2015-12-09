// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import com.netflix.mediaclient.Log;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            INetflixServiceCallback, ServiceManager, ManagerCallback, KidsCharacterDetails, 
//            MovieDetails, SeasonDetails, ManagerStatusListener, EpisodeDetails, 
//            LoLoMo, SearchResults, ShowDetails, VideoList

private class <init>
    implements INetflixServiceCallback
{

    final ServiceManager this$0;

    public int hashCode()
    {
        int j = super.hashCode();
        int i = j;
        if (j < 0)
        {
            i = -j;
        }
        return i;
    }

    public void onCWVideosFetched(int i, List list, int j)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onCWVideosFetched requestId=").append(i).append(" erroCode=").append(j).toString());
            Log.d("ServiceManager", (new StringBuilder()).append("onCWVideosFetched requestedVideos=").append(list).toString());
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onCWVideosFetched requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onCWVideosFetched(list, j);
            return;
        }
    }

    public void onConnectWithFacebookComplete(int i, int j, String s)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onConnectWithFacebookComplete requestId=").append(i).append(" statusCode=").append(j).toString());
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onConnectWithFacebookComplete requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onConnectWithFacebookComplete(j, s);
            return;
        }
    }

    public void onEpisodeDetailsFetched(int i, EpisodeDetails episodedetails, int j)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onEpisodeDetailsFetched requestId=").append(i).append(" erroCode=").append(j).toString());
            Log.d("ServiceManager", (new StringBuilder()).append("onEpisodeDetailsFetched requestedEdp=").append(episodedetails).toString());
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onEpisodeDetailsFetched requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onEpisodeDetailsFetched(episodedetails, j);
            return;
        }
    }

    public void onEpisodesFetched(int i, List list, int j)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onEpisodesFetched requestId=").append(i).append(" erroCode=").append(j).toString());
            Log.d("ServiceManager", (new StringBuilder()).append("onEpisodesFetched requestedEpisodes=").append(list).toString());
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onEpisodesFetched requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onEpisodesFetched(list, j);
            return;
        }
    }

    public void onGenreListsFetched(int i, List list, int j)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onGenreListsFetched requestId=").append(i).append(" erroCode=").append(j).toString());
            Log.d("ServiceManager", (new StringBuilder()).append("onGenreListsFetched requestedGenreLists=").append(list).toString());
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onGenreListsFetched requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onGenreListsFetched(list, j);
            return;
        }
    }

    public void onGenreLoLoMoPrefetched(int i, int j)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onGenreLoLoMoPrefetched requestId=").append(i).append(" statusCode=").append(j).toString());
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onGenreLoLoMoPrefetched requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onGenreLoLoMoPrefetched(j);
            return;
        }
    }

    public void onGenresFetched(int i, List list, int j)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onGenresFetched requestId=").append(i).append(" erroCode=").append(j).toString());
            Log.d("ServiceManager", (new StringBuilder()).append("onGenresFetched requestedGenres=").append(list).toString());
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onGenresFetched requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onGenresFetched(list, j);
            return;
        }
    }

    public void onKidsCharacterDetailsFetched(int i, KidsCharacterDetails kidscharacterdetails, Boolean boolean1, int j)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onKidsCharacterDetailsFetched requestId=").append(i).append(" erroCode=").append(j).toString());
            Log.d("ServiceManager", (new StringBuilder()).append("onKidsCharacterDetailsFetched kidsCharacterDetails=").append(kidscharacterdetails).toString());
            if (kidscharacterdetails != null)
            {
                Log.d("ServiceManager", (new StringBuilder()).append("onKidsCharacterDetailsFetched gallery size=").append(kidscharacterdetails.getGallery().size()).toString());
                Log.d("ServiceManager", (new StringBuilder()).append("onKidsCharacterDetailsFetched gallery track id=").append(kidscharacterdetails.getGalleryTrackId()).toString());
            }
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onKidsCharacterDetailsFetched requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onKidsCharacterDetailsFetched(kidscharacterdetails, boolean1, j);
            return;
        }
    }

    public void onLoLoMoPrefetched(int i, int j)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onLoLoMoPrefetched requestId=").append(i).append(" statusCode=").append(j).toString());
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onLoLoMoPrefetched requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onLoLoMoPrefetched(j);
            return;
        }
    }

    public void onLoLoMoSummaryFetched(int i, LoLoMo lolomo, int j)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onLoLoMoSummaryFetched requestId=").append(i).append(" erroCode=").append(j).toString());
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onLoLoMoSummaryFetched requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onLoLoMoSummaryFetched(lolomo, j);
            return;
        }
    }

    public void onLoMosFetched(int i, List list, int j)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onLoMosFetched requestId=").append(i).append(" statusCode=").append(j).toString());
        }
        if (Log.isLoggable("ServiceManager", 2))
        {
            Log.v("ServiceManager", (new StringBuilder()).append("onLoMosFetched requestedLoMos=").append(list).toString());
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onLoMosFetched requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onLoMosFetched(list, j);
            return;
        }
    }

    public void onLoginComplete(int i, int j, String s)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onLoginComplete requestId=").append(i).append(" statusCode=").append(j).toString());
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onLoginComplete requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onLoginComplete(j, s);
            return;
        }
    }

    public void onLogoutComplete(int i, int j)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onLogoutComplete requestId=").append(i).append(" statusCode=").append(j).toString());
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onLogoutComplete requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onLogoutComplete(j);
            return;
        }
    }

    public void onMovieDetailsFetched(int i, MovieDetails moviedetails, int j)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onMovieDetailsFetched requestId=").append(i).append(" erroCode=").append(j).toString());
            Log.d("ServiceManager", (new StringBuilder()).append("onMovieDetailsFetched requestedMdp=").append(moviedetails).toString());
            if (moviedetails != null)
            {
                Log.d("ServiceManager", (new StringBuilder()).append("onMovieDetailsFetched sims size=").append(moviedetails.getSimilars().size()).toString());
                Log.d("ServiceManager", (new StringBuilder()).append("onMovieDetailsFetched sims track id=").append(moviedetails.getSimilarsTrackId()).toString());
            }
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onMovieDetailsFetched requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onMovieDetailsFetched(moviedetails, j);
            return;
        }
    }

    public void onPinVerified(int i, boolean flag, int j)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onPinVerified requestId=").append(i).append(" statusCode=").append(j).toString());
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onPinVerified requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onPinVerified(flag, j);
            return;
        }
    }

    public void onPostPlayVideosFetched(int i, List list, int j)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onPostPlayVideosFetched requestId=").append(i).append(" erroCode=").append(j).toString());
            Log.d("ServiceManager", (new StringBuilder()).append("onPostPlayVideosFetched requestedVideos=").append(list).toString());
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onPostPlayVideoFetched requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onPostPlayVideosFetched(list, j);
            return;
        }
    }

    public void onQueueAdd(int i, int j)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onQueueAdd requestId=").append(i).append(" erroCode=").append(j).toString());
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onQueueAdd requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onQueueAdd(j);
            return;
        }
    }

    public void onQueueRemove(int i, int j)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onQueueRemove requestId=").append(i).append(" erroCode=").append(j).toString());
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onQueueRemove requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onQueueRemove(j);
            return;
        }
    }

    public void onResourceFetched(int i, String s, String s1, int j)
    {
        if (Log.isLoggable("ServiceManager", 2))
        {
            Log.v("ServiceManager", (new StringBuilder()).append("onResourceFetched requestId=").append(i).append(" requestedUrl=").append(s).append(" localUrl=").append(s1).append(" statusCode=").append(j).toString());
        }
        ManagerCallback managercallback = ServiceManager.access$500(ServiceManager.this).muxCallback(i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onResourceFetched requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onResourceFetched(s, s1, j);
            return;
        }
    }

    public void onSearchResultsFetched(int i, SearchResults searchresults, int j)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onSearchResultsFetched requestId=").append(i).append(" erroCode=").append(j).toString());
            Log.d("ServiceManager", (new StringBuilder()).append("onSearchResultsFetched results=").append(searchresults).toString());
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onSearchResultsFetched requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onSearchResultsFetched(searchresults, j);
            return;
        }
    }

    public void onSeasonDetailsFetched(int i, SeasonDetails seasondetails, int j)
    {
        Object obj;
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onSeasonDetailsFetched requestId=").append(i).append(" erroCode=").append(j).toString());
            StringBuilder stringbuilder = (new StringBuilder()).append("onSeasonDetailsFetched seasonDetailsId=");
            if (seasondetails == null)
            {
                obj = "n/a";
            } else
            {
                obj = seasondetails.getId();
            }
            Log.d("ServiceManager", stringbuilder.append(((String) (obj))).toString());
        }
        obj = ServiceManager.access$400(ServiceManager.this, i);
        if (obj == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onSeasonDetailsFetched requestId ").append(i).toString());
            return;
        } else
        {
            ((ManagerCallback) (obj)).onSeasonDetailsFetched(seasondetails, j);
            return;
        }
    }

    public void onSeasonsFetched(int i, List list, int j)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onSeasonsFetched requestId=").append(i).append(" erroCode=").append(j).toString());
            Log.d("ServiceManager", (new StringBuilder()).append("onSeasonsFetched requestedSeasons=").append(list).toString());
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onSeasonsFetched requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onSeasonsFetched(list, j);
            return;
        }
    }

    public void onServiceReady(int i, int j)
    {
        ManagerStatusListener managerstatuslistener;
label0:
        {
            if (Log.isLoggable("ServiceManager", 3))
            {
                Log.d("ServiceManager", (new StringBuilder()).append("onServiceReady clientId=").append(i).append(" statusCode=").append(j).toString());
            }
            ServiceManager.access$102(ServiceManager.this, i);
            managerstatuslistener = ServiceManager.access$200(ServiceManager.this);
            if (managerstatuslistener != null)
            {
                if (j < 0)
                {
                    break label0;
                }
                ServiceManager.access$302(ServiceManager.this, true);
                managerstatuslistener.onManagerReady(ServiceManager.this, j);
            }
            return;
        }
        managerstatuslistener.onManagerUnavailable(ServiceManager.this, j);
    }

    public void onShowDetailsFetched(int i, ShowDetails showdetails, int j)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onShowDetailsFetched requestId=").append(i).append(" erroCode=").append(j).toString());
            Log.d("ServiceManager", (new StringBuilder()).append("onShowDetailsFetched requestedSdp=").append(showdetails).toString());
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onShowDetailsFetched requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onShowDetailsFetched(showdetails, j);
            return;
        }
    }

    public void onSimilarVideosFetched(int i, VideoList videolist, int j)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onSimilarVideosFetched requestId=").append(i).append(" erroCode=").append(j).toString());
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onSimilarVideosFetched requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onSimilarVideosFetched(videolist, j);
            return;
        }
    }

    public void onVideoHide(int i, int j)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onVideoHide requestId=").append(i).append(" erroCode=").append(j).toString());
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onVideoHide requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onVideoHide(j);
            return;
        }
    }

    public void onVideoRatingSet(int i, int j)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onVideoRatingSet requestId=").append(i).append(" erroCode=").append(j).toString());
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onVideoRatingSet requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onVideoRatingSet(j);
            return;
        }
    }

    public void onVideosFetched(int i, List list, int j)
    {
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("onVideosFetched requestId=").append(i).append(" erroCode=").append(j).toString());
            Log.d("ServiceManager", (new StringBuilder()).append("onVideosFetched requestedVideos=").append(list).toString());
        }
        ManagerCallback managercallback = ServiceManager.access$400(ServiceManager.this, i);
        if (managercallback == null)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("No callback for onVideosFetched requestId ").append(i).toString());
            return;
        } else
        {
            managercallback.onVideosFetched(list, j);
            return;
        }
    }

    private ()
    {
        this$0 = ServiceManager.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
