// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.javabridge.ui.ActivationTokens;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.configuration.esn.EsnProvider;
import com.netflix.mediaclient.ui.details.DetailsActivity;
import com.netflix.mediaclient.util.DeviceCategory;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.ThreadUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            INetflixService, AddToMyListWrapper, LoMo, IClientLogging, 
//            ErrorLogging, ManagerStatusListener, ManagerCallback, UserProfile, 
//            IMdx, NrdpComponent, IPlayer, IPushNotification, 
//            SignUpParams, Video, SimpleManagerCallback, MovieDetails, 
//            ShowDetails, INetflixServiceCallback, KidsCharacterDetails, SeasonDetails, 
//            EpisodeDetails, LoLoMo, SearchResults, VideoList

public final class ServiceManager
{
    private class AddToListCallbackWrapper extends SimpleManagerCallback
    {

        private final ManagerCallback cb;
        final ServiceManager this$0;
        private final String videoId;

        private void updateListeners(int i, boolean flag, boolean flag1)
        {
            AddToMyListWrapper addtomylistwrapper = addToMyListWrapper;
            if (addtomylistwrapper == null)
            {
                return;
            }
            if (i == 0)
            {
                addtomylistwrapper.updateState(videoId, flag);
                return;
            } else
            {
                addtomylistwrapper.updateToError(i, videoId, flag1);
                return;
            }
        }

        public void onMovieDetailsFetched(MovieDetails moviedetails, int i)
        {
            super.onMovieDetailsFetched(moviedetails, i);
            cb.onMovieDetailsFetched(moviedetails, i);
            boolean flag;
            if (moviedetails == null)
            {
                flag = false;
            } else
            {
                flag = moviedetails.isInQueue();
            }
            updateListeners(i, flag, false);
        }

        public void onQueueAdd(int i)
        {
            onQueueAdd(i);
            cb.onQueueAdd(i);
            updateListeners(i, true, true);
        }

        public void onQueueRemove(int i)
        {
            onQueueRemove(i);
            cb.onQueueRemove(i);
            updateListeners(i, false, true);
        }

        public void onShowDetailsFetched(ShowDetails showdetails, int i)
        {
            super.onShowDetailsFetched(showdetails, i);
            cb.onShowDetailsFetched(showdetails, i);
            boolean flag;
            if (showdetails == null)
            {
                flag = false;
            } else
            {
                flag = showdetails.isInQueue();
            }
            updateListeners(i, flag, false);
        }



        public AddToListCallbackWrapper(ManagerCallback managercallback, String s)
        {
            this$0 = ServiceManager.this;
            super();
            cb = managercallback;
            videoId = s;
            servicemanager = addToMyListWrapper;
            if (ServiceManager.this != null)
            {
                updateToLoading(s);
            }
        }
    }

    private static class CallbackMuxer
    {

        private final ArrayList muxedCallbacks;

        public ManagerCallback demuxCallback(int i)
        {
            this;
            JVM INSTR monitorenter ;
            Object obj = muxedCallbacks.iterator();
_L4:
            if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
            MuxedCallback muxedcallback = (MuxedCallback)((Iterator) (obj)).next();
            if (muxedcallback.getRequestId() != i) goto _L4; else goto _L3
_L3:
            muxedCallbacks.remove(muxedcallback);
            obj = muxedcallback.getDemuxedCallback();
_L6:
            this;
            JVM INSTR monitorexit ;
            return ((ManagerCallback) (obj));
_L2:
            obj = null;
            if (true) goto _L6; else goto _L5
_L5:
            Exception exception;
            exception;
            throw exception;
        }

        public int muxCallback(ManagerCallback managercallback)
        {
            this;
            JVM INSTR monitorenter ;
            int i;
            managercallback = new MuxedCallback(managercallback);
            muxedCallbacks.add(managercallback);
            i = managercallback.getRequestId();
            this;
            JVM INSTR monitorexit ;
            return i;
            managercallback;
            throw managercallback;
        }

        public void reset()
        {
            this;
            JVM INSTR monitorenter ;
            muxedCallbacks.clear();
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        private CallbackMuxer()
        {
            muxedCallbacks = new ArrayList();
        }

    }

    private static class CallbackMuxer.MuxedCallback
    {

        private static int sRequestIdCounter = 0;
        private final ManagerCallback callback;
        private final int requestId;

        public ManagerCallback getDemuxedCallback()
        {
            return callback;
        }

        public int getRequestId()
        {
            return requestId;
        }


        public CallbackMuxer.MuxedCallback(ManagerCallback managercallback)
        {
            sRequestIdCounter++;
            requestId = sRequestIdCounter;
            callback = managercallback;
        }
    }

    private class ServiceListener
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
            ManagerCallback managercallback = getManagerCallback(i);
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
            ManagerCallback managercallback = getManagerCallback(i);
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
            ManagerCallback managercallback = getManagerCallback(i);
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
            ManagerCallback managercallback = getManagerCallback(i);
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
            ManagerCallback managercallback = getManagerCallback(i);
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
            ManagerCallback managercallback = getManagerCallback(i);
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
            ManagerCallback managercallback = getManagerCallback(i);
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
            ManagerCallback managercallback = getManagerCallback(i);
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
            ManagerCallback managercallback = getManagerCallback(i);
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
            ManagerCallback managercallback = getManagerCallback(i);
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
            ManagerCallback managercallback = getManagerCallback(i);
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
            ManagerCallback managercallback = getManagerCallback(i);
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
            ManagerCallback managercallback = getManagerCallback(i);
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
            ManagerCallback managercallback = getManagerCallback(i);
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
            ManagerCallback managercallback = getManagerCallback(i);
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
            ManagerCallback managercallback = getManagerCallback(i);
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
            ManagerCallback managercallback = getManagerCallback(i);
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
            ManagerCallback managercallback = getManagerCallback(i);
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
            ManagerCallback managercallback = mCallbackMuxer.demuxCallback(i);
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
            ManagerCallback managercallback = getManagerCallback(i);
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
            obj = getManagerCallback(i);
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
            ManagerCallback managercallback = getManagerCallback(i);
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
                mClientId = i;
                managerstatuslistener = mCallback;
                if (managerstatuslistener != null)
                {
                    if (j < 0)
                    {
                        break label0;
                    }
                    mReady = true;
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
            ManagerCallback managercallback = getManagerCallback(i);
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
            ManagerCallback managercallback = getManagerCallback(i);
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
            ManagerCallback managercallback = getManagerCallback(i);
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
            ManagerCallback managercallback = getManagerCallback(i);
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
            ManagerCallback managercallback = getManagerCallback(i);
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

        private ServiceListener()
        {
            this$0 = ServiceManager.this;
            super();
        }

    }


    public static final String BROWSE_AGENT_CW_REFRESH = "com.netflix.mediaclient.intent.action.BA_CW_REFRESH";
    public static final String BROWSE_AGENT_EPISODE_REFRESH = "com.netflix.mediaclient.intent.action.BA_EPISODE_REFRESH";
    public static final String BROWSE_AGENT_IQ_REFRESH = "com.netflix.mediaclient.intent.action.BA_IQ_REFRESH";
    public static final String BROWSE_PARAM_CUR_EPISODE_NUMBER = "curEpisodeNumber";
    public static final String BROWSE_PARAM_CUR_SEASON_NUMBER = "curSeasonNumber";
    private static final String ERROR_PARAM_WITH_NULL = "Parameter cannot be null";
    public static final String LOCAL_PLAYER_PLAY_START = "com.netflix.mediaclient.intent.action.LOCAL_PLAYER_PLAY_START";
    public static final String LOCAL_PLAYER_PLAY_STOP = "com.netflix.mediaclient.intent.action.LOCAL_PLAYER_PLAY_STOP";
    private static final String TAG = "ServiceManager";
    private AddToMyListWrapper addToMyListWrapper;
    private final NetflixActivity mActivity;
    private ManagerStatusListener mCallback;
    private final CallbackMuxer mCallbackMuxer = new CallbackMuxer();
    private int mClientId;
    private final ServiceConnection mConnection = new ServiceConnection() {

        final ServiceManager this$0;

        public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            Log.d("ServiceManager", (new StringBuilder()).append("ServiceConnected with IBinder: ").append(ibinder).toString());
            componentname = (com.netflix.mediaclient.service.NetflixService.LocalBinder)ibinder;
            mService = componentname.getService();
            addToMyListWrapper = new AddToMyListWrapper(ServiceManager.this);
            mLocalService = componentname.getService();
            if (mServiceListener == null)
            {
                mServiceListener = new ServiceListener();
            }
            mService.registerCallback(mServiceListener);
        }

        public final void onServiceDisconnected(ComponentName componentname)
        {
            Log.d("ServiceManager", "onServiceDisconnected");
            if (mCallback != null)
            {
                mCallback.onManagerUnavailable(ServiceManager.this, -2);
                mCallback = null;
            }
            mLocalService = null;
            mService = null;
        }

            
            {
                this$0 = ServiceManager.this;
                super();
            }
    };
    private NetflixService mLocalService;
    private boolean mReady;
    private INetflixService mService;
    private ServiceListener mServiceListener;

    public ServiceManager(NetflixActivity netflixactivity, ManagerStatusListener managerstatuslistener)
    {
        mClientId = -1;
        if (managerstatuslistener == null)
        {
            throw new IllegalStateException("listener is null");
        }
        Log.d("ServiceManager", "ServiceManager created");
        mCallback = managerstatuslistener;
        mActivity = netflixactivity;
        mActivity.startService(new Intent(mActivity, com/netflix/mediaclient/service/NetflixService));
        if (!mActivity.bindService(getServiceIntent(), mConnection, 1))
        {
            Log.e("ServiceManager", "ServiceManager could not bind to NetflixService!");
        }
    }

    private int addCallback(ManagerCallback managercallback)
    {
        if (managercallback != null)
        {
            return mCallbackMuxer.muxCallback(managercallback);
        } else
        {
            Log.e("ServiceManager", "Callback that is added is null!");
            return 0;
        }
    }

    private ManagerCallback getManagerCallback(int i)
    {
        return mCallbackMuxer.demuxCallback(i);
    }

    private Intent getServiceIntent()
    {
        return new Intent(mActivity, com/netflix/mediaclient/service/NetflixService);
    }

    private INetflixService validateService()
    {
        if (mService == null || mClientId < 0)
        {
            return null;
        } else
        {
            return mService;
        }
    }

    private ManagerCallback wrapForAddToList(ManagerCallback managercallback, String s)
    {
        return new AddToListCallbackWrapper(managercallback, s);
    }

    boolean addToQueue(String s, int i, ManagerCallback managercallback)
    {
        if (StringUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        int j = addCallback(wrapForAddToList(managercallback, s));
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("addToQueue requestId=").append(j).append(" id=").append(s).toString());
        }
        managercallback = validateService();
        if (managercallback != null)
        {
            managercallback.addToQueue(s, i, mClientId, j);
            return true;
        } else
        {
            Log.w("ServiceManager", "addToQueue:: service is not available");
            return false;
        }
    }

    public boolean cancelAllImageLoaderRequests()
    {
        ThreadUtils.assertOnMain();
        ImageLoader imageloader = getImageLoader();
        if (imageloader != null)
        {
            Log.d("ServiceManager", "Cancelling all pending image requests");
            imageloader.cancelAllRequests();
            return true;
        } else
        {
            Log.w("ServiceManager", "Failed to cancell all pending image requests. Image loader not available!");
            return false;
        }
    }

    public boolean connectWithFacebook(String s, ManagerCallback managercallback)
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            int i = addCallback(managercallback);
            inetflixservice.connectWithFacebook(s, mClientId, i);
            return true;
        } else
        {
            Log.w("ServiceManager", "connectWithFacebook:: service is not available");
            return false;
        }
    }

    public AddToListData.StateListener createAddToMyListWrapper(DetailsActivity detailsactivity, TextView textview)
    {
        return addToMyListWrapper.createAddToMyListWrapper(detailsactivity, textview);
    }

    public boolean dumpHomeLoLoMosAndVideos(String s, String s1)
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            inetflixservice.dumpHomeLoLoMosAndVideos(s, s1);
            return true;
        } else
        {
            Log.w("ServiceManager", "dumpHomeLoLoMosAndVideos:: service is not available");
            return false;
        }
    }

    public boolean dumpHomeLoLoMosAndVideosToLog()
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            inetflixservice.dumpHomeLoLoMosAndVideosToLog();
            return true;
        } else
        {
            Log.w("ServiceManager", "dumpHomeLoLoMosAndVideos:: service is not available");
            return false;
        }
    }

    public boolean dumpHomeLoMos()
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            inetflixservice.dumpHomeLoMos();
            return true;
        } else
        {
            Log.w("ServiceManager", " dumpHomeLoMos:: service is not available");
            return false;
        }
    }

    public boolean fetchCWVideos(int i, int j, ManagerCallback managercallback)
    {
        this;
        JVM INSTR monitorenter ;
        int k;
        k = addCallback(managercallback);
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("fetchCWLoMo requestId=").append(k).append(" fromVideo=").append(i).append(" toVideo=").append(j).toString());
        }
        managercallback = validateService();
        if (managercallback == null) goto _L2; else goto _L1
_L1:
        managercallback.fetchCWVideos(i, j, mClientId, k);
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Log.w("ServiceManager", "fetchCWVideos:: service is not available");
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        managercallback;
        throw managercallback;
    }

    public boolean fetchEpisodeDetails(String s, ManagerCallback managercallback)
    {
        this;
        JVM INSTR monitorenter ;
        if (StringUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        break MISSING_BLOCK_LABEL_24;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        int i;
        i = addCallback(managercallback);
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("fetchEpisodeDetails requestId=").append(i).append(" episodeId=").append(s).toString());
        }
        managercallback = validateService();
        if (managercallback == null) goto _L2; else goto _L1
_L1:
        managercallback.fetchEpisodeDetails(s, mClientId, i);
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Log.w("ServiceManager", "fetchEpisodeDetails:: service is not available");
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean fetchEpisodes(String s, int i, int j, ManagerCallback managercallback)
    {
        this;
        JVM INSTR monitorenter ;
        if (StringUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        break MISSING_BLOCK_LABEL_24;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        int k;
        k = addCallback(managercallback);
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("fetchEpisodes requestId=").append(k).append(" id=").append(s).append(" fromEpisode=").append(i).append(" toEpisode=").append(j).toString());
        }
        managercallback = validateService();
        if (managercallback == null) goto _L2; else goto _L1
_L1:
        managercallback.fetchEpisodes(s, i, j, mClientId, k);
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Log.w("ServiceManager", "fetchEpisodes:: service is not available");
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean fetchGenreLists(ManagerCallback managercallback)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        i = addCallback(managercallback);
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("fetchGenreLists requestId=").append(i).toString());
        }
        managercallback = validateService();
        if (managercallback == null) goto _L2; else goto _L1
_L1:
        managercallback.fetchGenreLists(mClientId, i);
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Log.w("ServiceManager", "fetchGenreLists:: service is not available");
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        managercallback;
        throw managercallback;
    }

    public boolean fetchGenreVideos(LoMo lomo, int i, int j, ManagerCallback managercallback)
    {
        this;
        JVM INSTR monitorenter ;
        if (StringUtils.isEmpty(lomo.getId()))
        {
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        break MISSING_BLOCK_LABEL_29;
        lomo;
        this;
        JVM INSTR monitorexit ;
        throw lomo;
        int k;
        k = addCallback(managercallback);
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("fetchGenreVideos requestId=").append(k).append(" genreLoMoId=").append(lomo.getId()).append(" fromVideo=").append(i).append(" toVideo=").append(j).toString());
        }
        managercallback = validateService();
        if (managercallback == null) goto _L2; else goto _L1
_L1:
        managercallback.fetchGenreVideos(lomo, i, j, mClientId, k);
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Log.w("ServiceManager", "fetchGenreVideos:: service is not available");
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean fetchGenres(String s, int i, int j, ManagerCallback managercallback)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        INetflixService inetflixservice = validateService();
        if (inetflixservice != null) goto _L2; else goto _L1
_L1:
        Log.w("ServiceManager", "fetchGenres:: service is not available");
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        String s1 = android.util.Log.getStackTraceString(new Exception("Parameter cannot be null"));
        Log.w("ServiceManager", String.format("fetchGenres:: stack:%s", new Object[] {
            s1
        }));
        if (StringUtils.isEmpty(s))
        {
            inetflixservice.getClientLogging().getErrorLogging().logHandledException(s1);
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_99;
        s;
        throw s;
        int k = addCallback(managercallback);
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("fetchGenres requestId=").append(k).append(" id=").append(s).toString());
        }
        inetflixservice.fetchGenres(s, i, j, mClientId, k);
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean fetchIQVideos(int i, int j, ManagerCallback managercallback)
    {
        this;
        JVM INSTR monitorenter ;
        int k;
        k = addCallback(managercallback);
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("fetchIQLoMo requestId=").append(k).append(" fromVideo=").append(i).append(" toVideo=").append(j).toString());
        }
        managercallback = validateService();
        if (managercallback == null) goto _L2; else goto _L1
_L1:
        managercallback.fetchIQVideos(i, j, mClientId, k);
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Log.w("ServiceManager", "fetchIQVideos:: service is not available");
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        managercallback;
        throw managercallback;
    }

    public boolean fetchKidsCharacterDetails(String s, ManagerCallback managercallback)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (StringUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        break MISSING_BLOCK_LABEL_27;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        int i;
        i = addCallback(managercallback);
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", String.format("fetchKidsCharacterDetails requestId=%d,  characterId=%s", new Object[] {
                Integer.valueOf(i), s
            }));
        }
        if (validateService() == null) goto _L2; else goto _L1
_L1:
        mService.fetchKidsCharacterDetails(s, mClientId, i);
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Log.w("ServiceManager", "fetchKidsCharacterDetails:: service is not available");
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean fetchLoLoMoSummary(String s, ManagerCallback managercallback)
    {
        this;
        JVM INSTR monitorenter ;
        if (StringUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        break MISSING_BLOCK_LABEL_24;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        int i;
        i = addCallback(managercallback);
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("fetchLoLoMoSummary requestId=").append(i).append(" category=").append(s).toString());
        }
        managercallback = validateService();
        if (managercallback == null) goto _L2; else goto _L1
_L1:
        managercallback.fetchLoLoMoSummary(s, mClientId, i);
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Log.w("ServiceManager", "fetchLoLoMoSummary:: service is not available");
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean fetchLoMos(String s, int i, int j, ManagerCallback managercallback)
    {
        this;
        JVM INSTR monitorenter ;
        if (StringUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        break MISSING_BLOCK_LABEL_24;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        int k;
        k = addCallback(managercallback);
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("fetchLoLoMo requestId=").append(k).append(" category=").append(s).append(" fromLoMo=").append(i).append(" toLoMo=").append(j).toString());
        }
        managercallback = mService;
        if (managercallback == null) goto _L2; else goto _L1
_L1:
        managercallback.fetchLoMos(s, i, j, mClientId, k);
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Log.w("ServiceManager", "fetchLoMos:: service is not available");
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean fetchMovieDetails(String s, ManagerCallback managercallback)
    {
        this;
        JVM INSTR monitorenter ;
        if (StringUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        break MISSING_BLOCK_LABEL_24;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        int i;
        i = addCallback(wrapForAddToList(managercallback, s));
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("fetchMovieDetails requestId=").append(i).append(" movieId=").append(s).toString());
        }
        if (validateService() == null) goto _L2; else goto _L1
_L1:
        mService.fetchMovieDetails(s, mClientId, i);
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Log.w("ServiceManager", "fetchMovieDetails:: service is not available");
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean fetchPostPlayVideos(String s, ManagerCallback managercallback)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        i = addCallback(managercallback);
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("fetchPostPlayVideos requestId=").append(i).append(" currentPlayableId=").append(s).toString());
        }
        managercallback = validateService();
        if (managercallback == null) goto _L2; else goto _L1
_L1:
        managercallback.fetchPostPlayVideos(s, mClientId, i);
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Log.w("ServiceManager", "fetchPostPlayVideos:: service is not available");
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public boolean fetchResource(String s, IClientLogging.AssetType assettype, ManagerCallback managercallback)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        if (s != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        int i;
        i = addCallback(managercallback);
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("fetchResource requestId=").append(i).append(" resourceUrl=").append(s).toString());
        }
        managercallback = validateService();
        if (managercallback == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        managercallback.fetchResource(s, assettype, mClientId, i);
        flag = true;
        continue; /* Loop/switch isn't completed */
        Log.w("ServiceManager", "fetchResource:: service is not available");
        if (true) goto _L1; else goto _L3
_L3:
        s;
        throw s;
    }

    public boolean fetchSeasonDetails(String s, ManagerCallback managercallback)
    {
        this;
        JVM INSTR monitorenter ;
        if (StringUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        break MISSING_BLOCK_LABEL_24;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        int i;
        i = addCallback(managercallback);
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("fetchSeasonDetails requestId=").append(i).append(" seasonId=").append(s).toString());
        }
        managercallback = validateService();
        if (managercallback == null) goto _L2; else goto _L1
_L1:
        managercallback.fetchSeasonDetails(s, mClientId, i);
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Log.w("ServiceManager", "fetchSeasonDetails:: service is not available");
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean fetchSeasons(String s, int i, int j, ManagerCallback managercallback)
    {
        this;
        JVM INSTR monitorenter ;
        if (StringUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        break MISSING_BLOCK_LABEL_24;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        int k;
        k = addCallback(managercallback);
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("fetchSeasons requestId=").append(k).append(" id=").append(s).append(" fromSeason=").append(i).append(" toSeason=").append(j).toString());
        }
        managercallback = validateService();
        if (managercallback == null) goto _L2; else goto _L1
_L1:
        managercallback.fetchSeasons(s, i, j, mClientId, k);
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Log.w("ServiceManager", "fetchSeasons:: service is not available");
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean fetchShowDetails(String s, String s1, ManagerCallback managercallback)
    {
        this;
        JVM INSTR monitorenter ;
        if (StringUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        break MISSING_BLOCK_LABEL_24;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        int i;
        i = addCallback(wrapForAddToList(managercallback, s));
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("fetchShowDetails requestId=").append(i).append(" id=").append(s).toString());
        }
        managercallback = validateService();
        if (managercallback == null) goto _L2; else goto _L1
_L1:
        managercallback.fetchShowDetails(s, s1, mClientId, i);
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Log.w("ServiceManager", "fetchShowDetails:: service is not available");
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean fetchSimilarVideosForPerson(String s, int i, ManagerCallback managercallback)
    {
        this;
        JVM INSTR monitorenter ;
        int j;
        j = addCallback(managercallback);
        managercallback = validateService();
        if (managercallback == null) goto _L2; else goto _L1
_L1:
        managercallback.fetchSimilarVideosForPerson(s, i, mClientId, j);
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Log.w("ServiceManager", "searchNetflix:: service is not available");
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public boolean fetchSimilarVideosForQuerySuggestion(String s, int i, ManagerCallback managercallback)
    {
        this;
        JVM INSTR monitorenter ;
        int j;
        j = addCallback(managercallback);
        managercallback = validateService();
        if (managercallback == null) goto _L2; else goto _L1
_L1:
        managercallback.fetchSimilarVideosForQuerySuggestion(s, i, mClientId, j);
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Log.w("ServiceManager", "searchNetflix:: service is not available");
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public boolean fetchVideos(LoMo lomo, int i, int j, ManagerCallback managercallback)
    {
        this;
        JVM INSTR monitorenter ;
        if (lomo == null)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        if (!StringUtils.isEmpty(lomo.getId()))
        {
            break MISSING_BLOCK_LABEL_33;
        }
        throw new IllegalArgumentException("Parameter cannot be null");
        lomo;
        this;
        JVM INSTR monitorexit ;
        throw lomo;
        int k;
        k = addCallback(managercallback);
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("fetchVideos requestId=").append(k).append(" loMoId=").append(lomo.getId()).append(" fromVideo=").append(i).append(" toVideo=").append(j).toString());
        }
        managercallback = validateService();
        if (managercallback == null) goto _L2; else goto _L1
_L1:
        managercallback.fetchVideos(lomo, i, j, mClientId, k);
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Log.w("ServiceManager", "fetchVideos:: service is not available");
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean flushCaches()
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            inetflixservice.flushCaches();
            return true;
        } else
        {
            Log.w("ServiceManager", "flushCaches:: service is not available");
            return false;
        }
    }

    public NetflixActivity getActivity()
    {
        return mActivity;
    }

    public List getAllProfiles()
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            return inetflixservice.getAllProfiles();
        } else
        {
            Log.w("ServiceManager", "getAllProfiles:: service is not available");
            return null;
        }
    }

    public IClientLogging getClientLogging()
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            return inetflixservice.getClientLogging();
        } else
        {
            Log.w("ServiceManager", "getClientLogging:: service is not available");
            return null;
        }
    }

    public com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface getConfiguration()
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            return inetflixservice.getConfiguration();
        } else
        {
            Log.w("ServiceManager", "getConfiguration: service is not available");
            return null;
        }
    }

    public String getCurrentAppLocale()
    {
        INetflixService inetflixservice = validateService();
        if (inetflixservice != null)
        {
            return inetflixservice.getCurrentAppLocale();
        } else
        {
            Log.w("ServiceManager", "getCurrentAppLocale:: service is not available");
            return null;
        }
    }

    public UserProfile getCurrentProfile()
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            return inetflixservice.getCurrentProfile();
        } else
        {
            Log.w("ServiceManager", "getCurrentProfile:: service is not available");
            return null;
        }
    }

    public DeviceCategory getDeviceCategory()
    {
        if (mService != null)
        {
            return mService.getDeviceCategory();
        } else
        {
            Log.w("ServiceManager", "getDeviceCategory:: service is not available");
            return null;
        }
    }

    public EsnProvider getESNProvider()
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            return inetflixservice.getESN();
        } else
        {
            Log.w("ServiceManager", "getESNProvider:: service is not available");
            return null;
        }
    }

    public ImageLoader getImageLoader()
    {
        NetflixService netflixservice = mLocalService;
        if (netflixservice == null)
        {
            Log.w("ServiceManager", "getImageLoader:: Netflix service is not available, return null.");
            return null;
        } else
        {
            return netflixservice.getImageLoader();
        }
    }

    public IMdx getMdx()
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            return inetflixservice.getMdx();
        } else
        {
            Log.w("ServiceManager", "getMdx:: service is not available");
            return null;
        }
    }

    public String getNrdpComponentVersion(NrdpComponent nrdpcomponent)
    {
        if (mService != null)
        {
            return mService.getNrdpComponentVersion(nrdpcomponent);
        } else
        {
            Log.w("ServiceManager", "getNrdpComponentVersion:: service is not available");
            return null;
        }
    }

    public IPlayer getPlayer()
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            return inetflixservice.getNflxPlayer();
        } else
        {
            Log.w("ServiceManager", "getPlayer:: service is not available");
            return null;
        }
    }

    public IPushNotification getPushNotification()
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            return inetflixservice.getPushNotification();
        } else
        {
            Log.w("ServiceManager", "getPushNotification:: service is not available");
            return null;
        }
    }

    public SignUpParams getSignUpParams()
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            return inetflixservice.getSignUpParams();
        } else
        {
            Log.w("ServiceManager", "getSignUpParams:: service is not available");
            return null;
        }
    }

    public String getSoftwareVersion()
    {
        if (mService != null)
        {
            return mService.getSoftwareVersion();
        } else
        {
            Log.w("ServiceManager", "getSoftwareVersion:: service is not available");
            return null;
        }
    }

    public boolean hideVideo(String s, ManagerCallback managercallback)
    {
        if (StringUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        int i = addCallback(managercallback);
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("hideVideo requestId=").append(i).append(" id=").append(s).toString());
        }
        managercallback = validateService();
        if (managercallback != null)
        {
            managercallback.hideVideo(s, mClientId, i);
            return true;
        } else
        {
            Log.w("ServiceManager", "hideVideo:: service is not available");
            return false;
        }
    }

    public boolean isCurrentProfileFacebookConnected()
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            return inetflixservice.isCurrentProfileFacebookConnected();
        } else
        {
            Log.w("ServiceManager", "isCurrentProfileFacebookConnected:: service is not available");
            return false;
        }
    }

    public boolean isCurrentProfileIQEnabled()
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            return inetflixservice.isCurrentProfileIQEnabled();
        } else
        {
            Log.w("ServiceManager", "isCurrentProfileIQEnabled:: service is not available");
            return false;
        }
    }

    public boolean isDeviceHd()
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            return inetflixservice.isDeviceHd();
        } else
        {
            Log.w("ServiceManager", "isDeviceHd:: service is not available");
            return false;
        }
    }

    public boolean isProfileSwitchingDisabled()
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            return inetflixservice.isProfileSwitchingDisabled();
        } else
        {
            Log.w("ServiceManager", "isProfileSwitchingDisabled:: service is not available");
            return false;
        }
    }

    public boolean isReady()
    {
        return mReady;
    }

    public boolean isTablet()
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            return inetflixservice.isTablet();
        } else
        {
            Log.w("ServiceManager", "isTablet:: service is not available");
            return false;
        }
    }

    public boolean isUserLoggedIn()
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            return inetflixservice.isUserLoggedIn();
        } else
        {
            Log.w("ServiceManager", "isUserLoggedIn:: service is not available");
            return false;
        }
    }

    public void logBillboardActivity(Video video, com.netflix.mediaclient.service.browse.BrowseAgent.BillboardActivityType billboardactivitytype)
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            inetflixservice.logBillboardActivity(video, billboardactivitytype);
            return;
        } else
        {
            Log.w("ServiceManager", "selectProfile:: service is not available");
            return;
        }
    }

    public boolean loginUser(String s, String s1, ManagerCallback managercallback)
    {
        int i = addCallback(managercallback);
        managercallback = mService;
        if (managercallback != null)
        {
            managercallback.loginUser(s, s1, mClientId, i);
            return true;
        } else
        {
            Log.w("ServiceManager", "loginUser:: service is not available");
            return false;
        }
    }

    public boolean loginUserByTokens(ActivationTokens activationtokens, ManagerCallback managercallback)
    {
        int i = addCallback(managercallback);
        managercallback = mService;
        if (managercallback != null)
        {
            managercallback.loginUserByTokens(activationtokens, mClientId, i);
            return true;
        } else
        {
            Log.w("ServiceManager", "loginUserByTokens:: service is not available");
            return false;
        }
    }

    public boolean logoutUser(ManagerCallback managercallback)
    {
        int i = addCallback(managercallback);
        managercallback = mService;
        if (managercallback != null)
        {
            managercallback.logoutUser(mClientId, i);
            return true;
        } else
        {
            Log.w("ServiceManager", "logoutUser:: service is not available");
            return false;
        }
    }

    public boolean prefetchGenreLoLoMo(String s, int i, int j, int k, int l, boolean flag, ManagerCallback managercallback)
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        i1 = addCallback(managercallback);
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder("prefetchGenreLoLoMo requestId=")).append(i1).append(" genreId=").append(s).append(" fromLoMo=").append(i).append(" toLoMo=").append(j).append(" fromVideo=").append(k).append(" toVideo=").append(l).append("includeBoxshots=").append(flag).toString());
        }
        managercallback = validateService();
        if (managercallback == null) goto _L2; else goto _L1
_L1:
        managercallback.prefetchGenreLoLoMo(s, i, j, k, l, flag, mClientId, i1);
        flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Log.w("ServiceManager", "prefetchGenreLoLoMo:: service is not available");
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public boolean prefetchLoLoMo(int i, int j, int k, int l, int i1, int j1, boolean flag, 
            boolean flag1, ManagerCallback managercallback)
    {
        int k1 = addCallback(managercallback);
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder("prefetchLoLoMo requestId=")).append(k1).append(" fromLoMo=").append(i).append(" toLoMo=").append(j).append(" fromVideo=").append(k).append(" toVideo=").append(l).append(" fromCWVideo=").append(i1).append(" toCWVideo=").append(j1).append(" includeExtraCharacters=").append(flag).append("includeBoxshots=").append(flag1).toString());
        }
        managercallback = validateService();
        if (managercallback != null)
        {
            managercallback.prefetchLoLoMo(i, j, k, l, i1, j1, flag, flag1, mClientId, k1);
            return true;
        } else
        {
            Log.w("ServiceManager", "prefetchLoLoMo:: service is not available");
            return false;
        }
    }

    public void refreshProfileSwitchingStatus()
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            inetflixservice.refreshProfileSwitchingStatus();
            return;
        } else
        {
            Log.w("ServiceManager", "refreshProfileSwitchingStatus:: service is not available");
            return;
        }
    }

    public void registerAddToMyListListener(String s, AddToListData.StateListener statelistener)
    {
        AddToMyListWrapper addtomylistwrapper = addToMyListWrapper;
        if (addtomylistwrapper != null)
        {
            addtomylistwrapper.register(s, statelistener);
        }
    }

    public void release()
    {
        this;
        JVM INSTR monitorenter ;
        if (mService != null)
        {
            if (mServiceListener != null)
            {
                Log.d("ServiceManager", "ServiceManager unregisterCallback");
                mService.unregisterCallback(mServiceListener);
            }
            Log.d("ServiceManager", "ServiceManager unbindService");
            mActivity.unbindService(mConnection);
            if (mCallbackMuxer != null)
            {
                mCallbackMuxer.reset();
            }
            mReady = false;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    boolean removeFromQueue(String s, ManagerCallback managercallback)
    {
        if (StringUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        int i = addCallback(wrapForAddToList(managercallback, s));
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("removeFromQueue requestId=").append(i).append(" id=").append(s).toString());
        }
        managercallback = validateService();
        if (managercallback != null)
        {
            managercallback.removeFromQueue(s, mClientId, i);
            return true;
        } else
        {
            Log.w("ServiceManager", "removeFromQueue:: service is not available");
            return false;
        }
    }

    public boolean searchNetflix(String s, ManagerCallback managercallback)
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        i = addCallback(managercallback);
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("searchNetflix requestId=").append(i).toString());
        }
        managercallback = validateService();
        if (managercallback == null) goto _L2; else goto _L1
_L1:
        managercallback.searchNetflix(s, mClientId, i);
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Log.w("ServiceManager", "searchNetflix:: service is not available");
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public void selectProfile(String s)
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            inetflixservice.selectProfile(s);
            return;
        } else
        {
            Log.w("ServiceManager", "selectProfile:: service is not available");
            return;
        }
    }

    public boolean setCurrentAppLocale(String s)
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            inetflixservice.setCurrentAppLocale(s);
            return true;
        } else
        {
            Log.w("ServiceManager", "setCurrentAppLocale:: service is not available");
            return false;
        }
    }

    public boolean setVideoRating(String s, int i, int j, ManagerCallback managercallback)
    {
        this;
        JVM INSTR monitorenter ;
        if (StringUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Parameter cannot be null");
        }
        break MISSING_BLOCK_LABEL_24;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
        int k;
        k = addCallback(managercallback);
        if (Log.isLoggable("ServiceManager", 3))
        {
            Log.d("ServiceManager", (new StringBuilder()).append("setVideoRating requestId=").append(k).append(" id=").append(s).toString());
        }
        if (validateService() == null) goto _L2; else goto _L1
_L1:
        mService.setVideoRating(s, i, j, mClientId, k);
        boolean flag = true;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Log.w("ServiceManager", "setVideoRating:: service is not available");
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void unregisterAddToMyListListener(String s, AddToListData.StateListener statelistener)
    {
        AddToMyListWrapper addtomylistwrapper = addToMyListWrapper;
        if (addtomylistwrapper != null)
        {
            addtomylistwrapper.unregister(s, statelistener);
        }
    }

    public boolean verifyPin(String s, ManagerCallback managercallback)
    {
        INetflixService inetflixservice = mService;
        if (inetflixservice != null)
        {
            int i = addCallback(managercallback);
            inetflixservice.verifyPin(s, mClientId, i);
            return true;
        } else
        {
            Log.w("ServiceManager", "verifyPin:: service is not available");
            return false;
        }
    }


/*
    static int access$102(ServiceManager servicemanager, int i)
    {
        servicemanager.mClientId = i;
        return i;
    }

*/



/*
    static ManagerStatusListener access$202(ServiceManager servicemanager, ManagerStatusListener managerstatuslistener)
    {
        servicemanager.mCallback = managerstatuslistener;
        return managerstatuslistener;
    }

*/


/*
    static boolean access$302(ServiceManager servicemanager, boolean flag)
    {
        servicemanager.mReady = flag;
        return flag;
    }

*/





/*
    static INetflixService access$602(ServiceManager servicemanager, INetflixService inetflixservice)
    {
        servicemanager.mService = inetflixservice;
        return inetflixservice;
    }

*/



/*
    static AddToMyListWrapper access$702(ServiceManager servicemanager, AddToMyListWrapper addtomylistwrapper)
    {
        servicemanager.addToMyListWrapper = addtomylistwrapper;
        return addtomylistwrapper;
    }

*/


/*
    static NetflixService access$802(ServiceManager servicemanager, NetflixService netflixservice)
    {
        servicemanager.mLocalService = netflixservice;
        return netflixservice;
    }

*/



/*
    static ServiceListener access$902(ServiceManager servicemanager, ServiceListener servicelistener)
    {
        servicemanager.mServiceListener = servicelistener;
        return servicelistener;
    }

*/
}
