// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service;

import android.app.Notification;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Process;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Pair;
import android.util.SparseArray;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.javabridge.ui.ActivationTokens;
import com.netflix.mediaclient.repository.SecurityRepository;
import com.netflix.mediaclient.service.browse.BrowseAgent;
import com.netflix.mediaclient.service.browse.BrowseAgentCallback;
import com.netflix.mediaclient.service.browse.BrowseAgentCallbackWrapper;
import com.netflix.mediaclient.service.configuration.ConfigurationAgent;
import com.netflix.mediaclient.service.configuration.SignUpConfiguration;
import com.netflix.mediaclient.service.configuration.esn.EsnProvider;
import com.netflix.mediaclient.service.logging.LoggingAgent;
import com.netflix.mediaclient.service.mdx.MdxAgent;
import com.netflix.mediaclient.service.player.PlayerAgent;
import com.netflix.mediaclient.service.pushnotification.PushNotificationAgent;
import com.netflix.mediaclient.service.resfetcher.LoggingResourceFetcherCallback;
import com.netflix.mediaclient.service.resfetcher.ResourceFetcher;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging;
import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.IMdx;
import com.netflix.mediaclient.servicemgr.INetflixService;
import com.netflix.mediaclient.servicemgr.INetflixServiceCallback;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.IPushNotification;
import com.netflix.mediaclient.servicemgr.KidsCharacterDetails;
import com.netflix.mediaclient.servicemgr.LoLoMo;
import com.netflix.mediaclient.servicemgr.LoMo;
import com.netflix.mediaclient.servicemgr.MovieDetails;
import com.netflix.mediaclient.servicemgr.NrdpComponent;
import com.netflix.mediaclient.servicemgr.Playable;
import com.netflix.mediaclient.servicemgr.SearchResults;
import com.netflix.mediaclient.servicemgr.SeasonDetails;
import com.netflix.mediaclient.servicemgr.ShowDetails;
import com.netflix.mediaclient.servicemgr.SignUpParams;
import com.netflix.mediaclient.servicemgr.UserProfile;
import com.netflix.mediaclient.servicemgr.Video;
import com.netflix.mediaclient.servicemgr.VideoList;
import com.netflix.mediaclient.ui.Asset;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.pin.PinVerifier;
import com.netflix.mediaclient.ui.player.PlayerActivity;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.DeviceCategory;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.ThreadUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service:
//            NrdController, ServiceAgent

public final class NetflixService extends Service
    implements INetflixService
{
    private class BrowseAgentClientCallback
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
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
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
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
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
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
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
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
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
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
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
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
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
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
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
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
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
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
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
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
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
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
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
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
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
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
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
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
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
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
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
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
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
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
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
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
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
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
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
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
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
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
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
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
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

        BrowseAgentClientCallback(int i, int j)
        {
            this$0 = NetflixService.this;
            super();
            clientId = i;
            requestId = j;
        }
    }

    private static class ClientCallbacks extends SparseArray
    {

        public int put(INetflixServiceCallback inetflixservicecallback)
        {
            ThreadUtils.assertOnMain();
            int i = inetflixservicecallback.hashCode();
            super.put(i, inetflixservicecallback);
            return i;
        }

        public INetflixServiceCallback remove(INetflixServiceCallback inetflixservicecallback)
        {
            ThreadUtils.assertOnMain();
            int i = inetflixservicecallback.hashCode();
            inetflixservicecallback = (INetflixServiceCallback)get(i);
            super.remove(i);
            return inetflixservicecallback;
        }

        private ClientCallbacks()
        {
        }

    }

    private static interface InitCallback
    {

        public abstract void onInitComplete();
    }

    public class LocalBinder extends Binder
    {

        final NetflixService this$0;

        public NetflixService getService()
        {
            return NetflixService.this;
        }

        public LocalBinder()
        {
            this$0 = NetflixService.this;
            super();
        }
    }

    private class NotifyServiceReadyInitCallback
        implements InitCallback
    {

        private final int clientId;
        final NetflixService this$0;

        public void onInitComplete()
        {
            notifyServiceReady(clientId, mInitStatusCode);
        }

        public NotifyServiceReadyInitCallback(int i)
        {
            this$0 = NetflixService.this;
            super();
            clientId = i;
        }
    }

    private class ResourceFetcherClientCallback extends LoggingResourceFetcherCallback
    {

        private final int clientId;
        private final int requestId;
        final NetflixService this$0;

        public void onResourceFetched(String s, String s1, int i)
        {
            super.onResourceFetched(s, s1, i);
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
            if (inetflixservicecallback == null)
            {
                Log.w("NetflixService", "No client callback found for onResourceFetched");
                return;
            } else
            {
                inetflixservicecallback.onResourceFetched(requestId, s, s1, i);
                return;
            }
        }

        ResourceFetcherClientCallback(int i, int j)
        {
            this$0 = NetflixService.this;
            super();
            clientId = i;
            requestId = j;
        }
    }

    private final class StartCommandInitCallback
        implements InitCallback
    {

        private final int flags;
        private final Intent intent;
        private final int startId;
        final NetflixService this$0;

        public void onInitComplete()
        {
            doStartCommand(intent, flags, startId);
        }

        public StartCommandInitCallback(Intent intent1, int i, int j)
        {
            this$0 = NetflixService.this;
            super();
            intent = intent1;
            flags = i;
            startId = j;
        }
    }

    private class UserAgentClientCallback
        implements com.netflix.mediaclient.service.user.UserAgent.UserAgentCallback
    {

        private final int clientId;
        private final int requestId;
        final NetflixService this$0;

        public void onConnectWithFacebook(int i, String s)
        {
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
            if (inetflixservicecallback == null)
            {
                Log.w("NetflixService", "No client callback found for onConnectWithFacebook");
                return;
            } else
            {
                Log.d("NetflixService", "Notified onConnectWithFacebook");
                inetflixservicecallback.onConnectWithFacebookComplete(requestId, i, s);
                return;
            }
        }

        public void onLoginComplete(int i, String s)
        {
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
            if (inetflixservicecallback == null)
            {
                Log.w("NetflixService", "No client callback found for onLoginComplete");
                return;
            } else
            {
                Log.d("NetflixService", "Notified onLoginComplete");
                inetflixservicecallback.onLoginComplete(requestId, i, s);
                return;
            }
        }

        public void onLogoutComplete(int i)
        {
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
            if (inetflixservicecallback == null)
            {
                Log.w("NetflixService", "No client callback found for onLogoutComplete");
                return;
            } else
            {
                Log.d("NetflixService", "Notified onLogoutComplete");
                inetflixservicecallback.onLogoutComplete(requestId, i);
                return;
            }
        }

        public void onPinVerified(boolean flag, int i)
        {
            INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(clientId);
            if (inetflixservicecallback == null)
            {
                Log.w("NetflixService", "No client callback found for onPinVerified");
                return;
            } else
            {
                Log.d("NetflixService", "Notified onPinVerified");
                inetflixservicecallback.onPinVerified(requestId, flag, i);
                return;
            }
        }

        UserAgentClientCallback(int i, int j)
        {
            this$0 = NetflixService.this;
            super();
            clientId = i;
            requestId = j;
        }
    }


    public static final String ACTION_EXPAND_MDX_MINI_PLAYER_INTENT = "com.netflix.mediaclient.service.ACTION_EXPAND_MDX_MINI_PLAYER";
    private static final String ACTION_SHOW_MDX_PLAYER_INTENT = "com.netflix.mediaclient.service.ACTION_SHOW_MDX_PLAYER";
    private static final long SERVICE_INIT_TIMEOUT_MS = 0x15f90L;
    private static final long SERVICE_KILL_DELAY_MS = 0x1b77400L;
    private static final String TAG = "NetflixService";
    private static boolean fetchErrorsEnabled = false;
    private final ServiceAgent.AgentContext agentContext = new ServiceAgent.AgentContext() {

        final NetflixService this$0;

        public NetflixApplication getApplication()
        {
            return (NetflixApplication)NetflixService.this.getApplication();
        }

        public ServiceAgent.BrowseAgentInterface getBrowseAgent()
        {
            return mBrowseAgent;
        }

        public ServiceAgent.ConfigurationAgentInterface getConfigurationAgent()
        {
            return mConfigurationAgent;
        }

        public NrdController getNrdController()
        {
            return mNrdController;
        }

        public ResourceFetcher getResourceFetcher()
        {
            return mResourceFetcher;
        }

        public NetflixService getService()
        {
            return NetflixService.this;
        }

        public ServiceAgent.UserAgentInterface getUserAgent()
        {
            return mUserAgent;
        }

            
            {
                this$0 = NetflixService.this;
                super();
            }
    };
    private Handler handler;
    private final Runnable initTimeoutRunnable = new Runnable() {

        final NetflixService this$0;

        public void run()
        {
            initTimeout();
        }

            
            {
                this$0 = NetflixService.this;
                super();
            }
    };
    private final IBinder mBinder = new LocalBinder();
    private BrowseAgent mBrowseAgent;
    private final ClientCallbacks mClientCallbacks = new ClientCallbacks();
    private LoggingAgent mClientLoggingAgent;
    private ConfigurationAgent mConfigurationAgent;
    private final ArrayList mInitCallbacks = new ArrayList();
    private volatile boolean mInitComplete;
    private int mInitStatusCode;
    private MdxAgent mMdxAgent;
    private boolean mMdxEnabled;
    private final BroadcastReceiver mMdxReceiver = new BroadcastReceiver() {

        final NetflixService this$0;

        private Asset getMdxAgentVideoAsset()
        {
            com.netflix.mediaclient.servicemgr.VideoDetails videodetails = mMdxAgent.getVideoDetail();
            if (videodetails != null && StringUtils.isNotEmpty(videodetails.getId()))
            {
                return Asset.create(videodetails, PlayContext.EMPTY_CONTEXT, PlayerActivity.PIN_VERIFIED.booleanValue());
            } else
            {
                return null;
            }
        }

        public void onReceive(Context context, Intent intent)
        {
            boolean flag = false;
            boolean flag2 = false;
            boolean flag1 = false;
            context = intent.getAction();
            if ("com.netflix.mediaclient.intent.action.MDXUPDATE_PLAYBACKEND".equals(context))
            {
                flag2 = com.netflix.mediaclient.service.mdx.MdxAgent.Utils.isInPostPlay(intent);
                context = NetflixService.this;
                if (!flag2)
                {
                    flag = true;
                }
                context.stopForeground(flag);
                if (Log.isLoggable("NetflixService", 3))
                {
                    Log.d("NetflixService", "mdx exit, stop service in 28800000ms");
                }
                handler.postDelayed(stopServiceRunnable, 0x1b77400L);
                context = getMdxAgentVideoAsset();
                flag = flag1;
                if (context != null)
                {
                    flag = context.isPinProtected();
                }
                PinVerifier.getInstance().registerPlayEvent(flag);
                Log.d("NetflixService", "Refreshing CW for MDXUPDATE_PLAYBACKEND...");
                mBrowseAgent.refreshCW();
            } else
            {
                if (!"com.netflix.mediaclient.intent.action.MDXUPDATE_PLAYBACKSTART".equals(context))
                {
                    continue;
                }
                if (mMdxAgent != null && mMdxAgent.hasActiveSession())
                {
                    Log.i("NetflixService", "start mdx notification");
                    handler.removeCallbacks(stopServiceRunnable);
                    context = mMdxAgent.getMdxNotification(false);
                    startForeground(((Integer)((Pair) (context)).first).intValue(), (Notification)((Pair) (context)).second);
                    context = getMdxAgentVideoAsset();
                    if (context != null)
                    {
                        Log.d("NetflixService", "refreshing episodes data on play start");
                        mBrowseAgent.refreshEpisodesData(context);
                        return;
                    }
                } else
                {
                    Log.e("NetflixService", "false MDXUPDATE_PLAYBACKSTART");
                    return;
                }
            }
            do
            {
                return;
            } while (!"com.netflix.mediaclient.intent.action.MDXUPDATE_STATE".equals(context));
            int i = intent.getIntExtra("time", -1);
            Log.v("NetflixService", (new StringBuilder()).append("on MDX state update - received updated mdx position: ").append(i).toString());
            context = getMdxAgentVideoAsset();
            flag = flag2;
            if (context != null)
            {
                context.setPlaybackBookmark(i);
                Log.v("NetflixService", "updating cached video position");
                mBrowseAgent.updateCachedVideoPosition(context);
                flag = context.isPinProtected();
            }
            PinVerifier.getInstance().registerPlayEvent(flag);
        }

            
            {
                this$0 = NetflixService.this;
                super();
            }
    };
    private final BroadcastReceiver mMdxShowPlayerIntent = new BroadcastReceiver() {

        final NetflixService this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (intent == null || !"com.netflix.mediaclient.service.ACTION_SHOW_MDX_PLAYER".equals(intent.getAction()))
            {
                Log.v("NetflixService", "Invalid intent: ");
                AndroidUtils.logIntent("NetflixService", intent);
                return;
            } else
            {
                Log.v("NetflixService", "Sending show app intent");
                startActivity(NetflixApplication.createShowApplicationIntent(NetflixService.this).addFlags(0x10000000));
                handler.postDelayed(new Runnable() {

                    final _cls7 this$1;

                    public void run()
                    {
                        Log.v("NetflixService", "Sending show mini player intent");
                        sendBroadcast(new Intent("com.netflix.mediaclient.service.ACTION_EXPAND_MDX_MINI_PLAYER"));
                    }

            
            {
                this$1 = _cls7.this;
                super();
            }
                }, 400L);
                return;
            }
        }

            
            {
                this$0 = NetflixService.this;
                super();
            }
    };
    private final BroadcastReceiver mNetworkChangeReceiver = new BroadcastReceiver() {

        final NetflixService this$0;

        public void onReceive(Context context, Intent intent)
        {
            mNrdController.setNetworkInterfaces();
            mPlayerAgent.handleConnectivityChange(intent);
            mClientLoggingAgent.handleConnectivityChange(intent);
        }

            
            {
                this$0 = NetflixService.this;
                super();
            }
    };
    private NrdController mNrdController;
    private PlayerAgent mPlayerAgent;
    private PushNotificationAgent mPushAgent;
    private ResourceFetcher mResourceFetcher;
    private UserAgent mUserAgent;
    private final Runnable stopServiceRunnable = new Runnable() {

        final NetflixService this$0;

        public void run()
        {
            Log.i("NetflixService", "Stopping service via runnable");
            stopSelf();
        }

            
            {
                this$0 = NetflixService.this;
                super();
            }
    };

    public NetflixService()
    {
        mInitComplete = false;
        mInitStatusCode = -1;
        mMdxEnabled = false;
    }

    public static boolean areFetchErrorsEnabled()
    {
        return false;
    }

    public static Intent createShowMdxPlayerBroadcastIntent()
    {
        return new Intent("com.netflix.mediaclient.service.ACTION_SHOW_MDX_PLAYER");
    }

    private void doStartCommand(Intent intent, int i, int j)
    {
        if (Log.isLoggable("NetflixService", 4))
        {
            Log.i("NetflixService", (new StringBuilder()).append("Received start command intent ").append(intent).toString());
        }
        if (!StringUtils.isEmpty(intent.getAction()))
        {
            handler.removeCallbacks(stopServiceRunnable);
            if (intent.hasCategory("com.netflix.mediaclient.intent.category.MDX") && mMdxEnabled)
            {
                Log.d("NetflixService", "MDX command intent ");
                mMdxAgent.handleCommand(intent);
            }
            if (intent.hasCategory("com.netflix.mediaclient.intent.category.PUSH") && mPushAgent.isSupported())
            {
                Log.d("NetflixService", "Push notification command intent ");
                mPushAgent.handleCommand(intent);
            }
            if (intent.hasCategory("com.netflix.mediaclient.intent.category.LOGGING"))
            {
                Log.d("NetflixService", "Client logging command intent ");
                mClientLoggingAgent.handleCommand(intent);
                return;
            }
        }
    }

    private void enableMdxAgentAndInit(ServiceAgent.AgentContext agentcontext, ServiceAgent.InitCallback initcallback)
    {
        boolean flag;
        if (AndroidUtils.getAndroidVersion() > 8 && !mConfigurationAgent.isDisableMdx())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mMdxEnabled = flag;
        if (mMdxEnabled)
        {
            mMdxAgent = new MdxAgent();
            registerMdxReceiver();
            mMdxAgent.init(agentcontext, initcallback);
        }
    }

    private void init()
    {
        ServiceAgent.InitCallback initcallback = new ServiceAgent.InitCallback() {

            private final ArrayList agentsToInitBatch1 = new _cls1();
            private final ArrayList agentsToInitBatch2 = new _cls2();
            final NetflixService this$0;

            public void onInitComplete(ServiceAgent serviceagent, int i)
            {
                ThreadUtils.assertOnMain();
                if (i >= 0) goto _L2; else goto _L1
_L1:
                Log.e("NetflixService", (new StringBuilder()).append("NetflixService init failed with ServiceAgent ").append(serviceagent.getClass().getSimpleName()).append(" statusCode=").append(i).toString());
                mInitStatusCode = i;
                initCompleted();
                stopSelf();
_L4:
                return;
_L2:
                Log.i("NetflixService", (new StringBuilder()).append("NetflixService successfully inited ServiceAgent ").append(serviceagent.getClass().getSimpleName()).toString());
                if (serviceagent != mConfigurationAgent)
                {
                    break; /* Loop/switch isn't completed */
                }
                serviceagent = agentsToInitBatch1.iterator();
                while (serviceagent.hasNext()) 
                {
                    ((ServiceAgent)serviceagent.next()).init(agentContext, this);
                }
                if (true) goto _L4; else goto _L3
_L3:
                if (!agentsToInitBatch1.contains(serviceagent))
                {
                    break; /* Loop/switch isn't completed */
                }
                agentsToInitBatch1.remove(serviceagent);
                if (agentsToInitBatch1.isEmpty())
                {
                    Log.d("NetflixService", "NetflixService successfully inited batch1 of ServiceAgents");
                    for (serviceagent = agentsToInitBatch2.iterator(); serviceagent.hasNext(); ((ServiceAgent)serviceagent.next()).init(agentContext, this)) { }
                    enableMdxAgentAndInit(agentContext, this);
                    return;
                }
                if (true) goto _L4; else goto _L5
_L5:
                agentsToInitBatch2.remove(serviceagent);
                if (agentsToInitBatch2.isEmpty())
                {
                    Log.i("NetflixService", "NetflixService successfully inited all ServiceAgents ");
                    mInitStatusCode = i;
                    ServiceAgent serviceagent1;
                    if (mInitStatusCode == 0)
                    {
                        if (mConfigurationAgent.isAppVersionObsolete())
                        {
                            mInitStatusCode = -5;
                            Log.w("NetflixService", "Current app is obsolete. It should not run!");
                        } else
                        if (!mConfigurationAgent.isAppVersionRecommended())
                        {
                            Log.w("NetflixService", "Current app is not recommended. User should be warned!");
                            mInitStatusCode = 1;
                        }
                    }
                    initCompleted();
                }
                serviceagent = agentsToInitBatch2.iterator();
                while (serviceagent.hasNext()) 
                {
                    serviceagent1 = (ServiceAgent)serviceagent.next();
                    if (!serviceagent1.isReady())
                    {
                        Log.d("NetflixService", (new StringBuilder()).append("NetflixService still waiting for init of ServiceAgent ").append(serviceagent1.getClass().getSimpleName()).toString());
                    }
                }
                if (true) goto _L4; else goto _L6
_L6:
            }

            
            {
                this$0 = NetflixService.this;
                super();
            }
        };
        if (!ConnectivityUtils.isConnectedOrConnecting(this))
        {
            mInitStatusCode = -11;
            initCompleted();
            stopSelf();
            return;
        } else
        {
            Log.i("NetflixService", "NetflixService initing...");
            mConfigurationAgent.init(agentContext, initcallback);
            Log.i("NetflixService", (new StringBuilder()).append("Service has ").append(0x15f90L / 1000L).append(" seconds to init or else we fail...").toString());
            handler.postDelayed(initTimeoutRunnable, 0x15f90L);
            return;
        }
    }

    private void initCompleted()
    {
        ThreadUtils.assertOnMain();
        handler.removeCallbacks(initTimeoutRunnable);
        postApplicationStartedEvent();
        Log.d("NetflixService", "Invoking InitCallbacks...");
        for (Iterator iterator = mInitCallbacks.iterator(); iterator.hasNext(); ((InitCallback)iterator.next()).onInitComplete()) { }
        mInitCallbacks.clear();
        mInitComplete = true;
        if (isServiceReady(mInitStatusCode))
        {
            registerReceiver(mNetworkChangeReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            registerReceiver(mMdxShowPlayerIntent, new IntentFilter("com.netflix.mediaclient.service.ACTION_SHOW_MDX_PLAYER"));
            mNrdController.setNetworkInterfaces();
            Log.d("NetflixService", "Send local intent that Netflix service is ready");
            Intent intent = new Intent("com.netflix.mediaclient.intent.action.NETFLIX_SERVICE_INIT_COMPLETE");
            intent.putExtra("status_code", mInitStatusCode);
            intent.addCategory("com.netflix.mediaclient.intent.category.NETFLIX_SERVICE");
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        }
        Log.i("NetflixService", (new StringBuilder()).append("StopService runnable posted - service will die in ").append(60).append(" seconds unless bound to or started...").toString());
        handler.postDelayed(stopServiceRunnable, 60000);
    }

    private void initTimeout()
    {
        Log.i("NetflixService", "Service init has timed out");
        mInitStatusCode = -9;
        initCompleted();
        stopSelf();
    }

    public static boolean isServiceReady(int i)
    {
        return i >= 0;
    }

    private void notifyServiceReady(int i, int j)
    {
        Log.d("NetflixService", (new StringBuilder()).append("Notifying client ").append(i).append(" that service is ready, status code: ").append(j).toString());
        INetflixServiceCallback inetflixservicecallback = (INetflixServiceCallback)mClientCallbacks.get(i);
        if (inetflixservicecallback != null)
        {
            inetflixservicecallback.onServiceReady(i, j);
        }
    }

    private void postApplicationStartedEvent()
    {
        if (mClientLoggingAgent == null)
        {
            Log.e("NetflixService", "Unable to post application started event. Logging agent is null!");
            return;
        }
        if (mClientLoggingAgent.getApplicationPerformanceMetricsLogging() == null)
        {
            Log.e("NetflixService", "Unable to post application started event. APM manager is null!");
            return;
        } else
        {
            mClientLoggingAgent.getApplicationPerformanceMetricsLogging().startApplicationSession(true);
            mClientLoggingAgent.getApplicationPerformanceMetricsLogging().startUserSession(com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.Trigger.appStart);
            return;
        }
    }

    private void registerMdxReceiver()
    {
        IntentFilter intentfilter = new IntentFilter("com.netflix.mediaclient.intent.action.MDXUPDATE_PLAYBACKEND");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.MDXUPDATE_PLAYBACKSTART");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.MDXUPDATE_STATE");
        intentfilter.addCategory("com.netflix.mediaclient.intent.category.MDX");
        registerReceiver(mMdxReceiver, intentfilter);
    }

    private void safeUnregisterReceiver(BroadcastReceiver broadcastreceiver, String s)
    {
        if (broadcastreceiver == null)
        {
            Log.d("NetflixService", "Unable to unregister, receiver is null");
            return;
        }
        try
        {
            if (Log.isLoggable("NetflixService", 3))
            {
                Log.d("NetflixService", (new StringBuilder()).append("Unregister ").append(s).toString());
            }
            unregisterReceiver(broadcastreceiver);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (BroadcastReceiver broadcastreceiver)
        {
            Log.e("NetflixService", (new StringBuilder()).append("Unregister ").append(s).append(" failed.").toString(), broadcastreceiver);
        }
    }

    public static boolean toggleFetchErrorsEnabled()
    {
        boolean flag;
        if (!fetchErrorsEnabled)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fetchErrorsEnabled = flag;
        return fetchErrorsEnabled;
    }

    private BrowseAgentCallback wrapCallback(BrowseAgentCallback browseagentcallback)
    {
        return new BrowseAgentCallbackWrapper(browseagentcallback);
    }

    public void addToQueue(String s, int i, int j, int k)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(j, k);
        mBrowseAgent.addToQueue(s, i, wrapCallback(browseagentclientcallback));
    }

    public void connectWithFacebook(String s, int i, int j)
    {
        UserAgentClientCallback useragentclientcallback = new UserAgentClientCallback(i, j);
        mUserAgent.connectWithFacebook(s, useragentclientcallback);
    }

    public void dumpHomeLoLoMosAndVideos(String s, String s1)
    {
        mBrowseAgent.dumpHomeLoLoMosAndVideos(s, s1);
    }

    public void dumpHomeLoLoMosAndVideosToLog()
    {
        mBrowseAgent.dumpHomeLoLoMosAndVideosToLog();
    }

    public void dumpHomeLoMos()
    {
        mBrowseAgent.dumpHomeLoMos();
    }

    public void fetchCWVideos(int i, int j, int k, int l)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(k, l);
        mBrowseAgent.fetchCWVideos(i, j, wrapCallback(browseagentclientcallback));
    }

    public void fetchEpisodeDetails(String s, int i, int j)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(i, j);
        mBrowseAgent.fetchEpisodeDetails(s, wrapCallback(browseagentclientcallback));
    }

    public void fetchEpisodes(String s, int i, int j, int k, int l)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(k, l);
        mBrowseAgent.fetchEpisodes(s, i, j, wrapCallback(browseagentclientcallback));
    }

    public void fetchGenreLists(int i, int j)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(i, j);
        mBrowseAgent.fetchGenreList(wrapCallback(browseagentclientcallback));
    }

    public void fetchGenreVideos(LoMo lomo, int i, int j, int k, int l)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(k, l);
        mBrowseAgent.fetchGenreVideos(lomo, i, j, wrapCallback(browseagentclientcallback));
    }

    public void fetchGenres(String s, int i, int j, int k, int l)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(k, l);
        mBrowseAgent.fetchGenres(s, i, j, wrapCallback(browseagentclientcallback));
    }

    public void fetchIQVideos(int i, int j, int k, int l)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(k, l);
        mBrowseAgent.fetchIQVideos(i, j, wrapCallback(browseagentclientcallback));
    }

    public void fetchKidsCharacterDetails(String s, int i, int j)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(i, j);
        mBrowseAgent.fetchKidsCharacterDetails(s, wrapCallback(browseagentclientcallback));
    }

    public void fetchLoLoMoSummary(String s, int i, int j)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(i, j);
        mBrowseAgent.fetchLoLoMoSummary(s, wrapCallback(browseagentclientcallback));
    }

    public void fetchLoMos(String s, int i, int j, int k, int l)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(k, l);
        mBrowseAgent.fetchLoMos(s, i, j, wrapCallback(browseagentclientcallback));
    }

    public void fetchMovieDetails(String s, int i, int j)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(i, j);
        mBrowseAgent.fetchMovieDetails(s, wrapCallback(browseagentclientcallback));
    }

    public void fetchPostPlayVideos(String s, int i, int j)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(i, j);
        mBrowseAgent.fetchPostPlayVideos(s, wrapCallback(browseagentclientcallback));
    }

    public void fetchResource(String s, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType assettype, int i, int j)
    {
        ResourceFetcherClientCallback resourcefetcherclientcallback = new ResourceFetcherClientCallback(i, j);
        mResourceFetcher.fetchResource(s, assettype, resourcefetcherclientcallback);
    }

    public void fetchSeasonDetails(String s, int i, int j)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(i, j);
        mBrowseAgent.fetchSeasonDetails(s, wrapCallback(browseagentclientcallback));
    }

    public void fetchSeasons(String s, int i, int j, int k, int l)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(k, l);
        mBrowseAgent.fetchSeasons(s, i, j, wrapCallback(browseagentclientcallback));
    }

    public void fetchShowDetails(String s, String s1, int i, int j)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(i, j);
        mBrowseAgent.fetchShowDetails(s, s1, wrapCallback(browseagentclientcallback));
    }

    public void fetchSimilarVideosForPerson(String s, int i, int j, int k)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(j, k);
        mBrowseAgent.fetchSimilarVideosForPerson(s, i, wrapCallback(browseagentclientcallback));
    }

    public void fetchSimilarVideosForQuerySuggestion(String s, int i, int j, int k)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(j, k);
        mBrowseAgent.fetchSimilarVideosForQuerySuggestion(s, i, wrapCallback(browseagentclientcallback));
    }

    public void fetchVideos(LoMo lomo, int i, int j, int k, int l)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(k, l);
        mBrowseAgent.fetchVideos(lomo, i, j, wrapCallback(browseagentclientcallback));
    }

    public void flushCaches()
    {
        mBrowseAgent.flushCaches();
    }

    public List getAllProfiles()
    {
        return mUserAgent.getAllProfiles();
    }

    public IClientLogging getClientLogging()
    {
        return mClientLoggingAgent;
    }

    public ServiceAgent.ConfigurationAgentInterface getConfiguration()
    {
        return mConfigurationAgent;
    }

    public String getCurrentAppLocale()
    {
        return mUserAgent.getCurrentAppLocale();
    }

    public UserProfile getCurrentProfile()
    {
        return mUserAgent.getCurrentProfile();
    }

    public String getCurrentProfileEmail()
    {
        return mUserAgent.getCurrentProfileEmail();
    }

    public String getCurrentProfileFirstName()
    {
        return mUserAgent.getCurrentProfileFirstName();
    }

    public String getCurrentProfileLastName()
    {
        return mUserAgent.getCurrentProfileLastName();
    }

    public String getCurrentProfileUserId()
    {
        return mUserAgent.getCurrentProfileUserId();
    }

    public DeviceCategory getDeviceCategory()
    {
        return mConfigurationAgent.getDeviceCategory();
    }

    public EsnProvider getESN()
    {
        return mConfigurationAgent.getEsnProvider();
    }

    public ImageLoader getImageLoader()
    {
        return mResourceFetcher.getImageLoader();
    }

    public IMdx getMdx()
    {
        return mMdxAgent;
    }

    public IPlayer getNflxPlayer()
    {
        return mPlayerAgent;
    }

    public String getNrdpComponentVersion(NrdpComponent nrdpcomponent)
    {
        if (nrdpcomponent == NrdpComponent.NrdLib)
        {
            return SecurityRepository.getNrdLibVersion();
        }
        if (nrdpcomponent == NrdpComponent.NrdApp)
        {
            return SecurityRepository.getNrdAppVersion();
        }
        if (nrdpcomponent == NrdpComponent.MdxLib)
        {
            return SecurityRepository.getMdxLibVersion();
        } else
        {
            return null;
        }
    }

    public IPushNotification getPushNotification()
    {
        return mPushAgent;
    }

    public SignUpParams getSignUpParams()
    {
        return new SignUpParams() {

            final NetflixService this$0;

            public String getSignUpBootloader()
            {
                return mConfigurationAgent.getSignUpConfiguration().getSignUpBootloader();
            }

            public long getSignUpTimeout()
            {
                return mConfigurationAgent.getSignUpConfiguration().getSignUpTimeout();
            }

            public boolean isSignUpEnabled()
            {
                return mConfigurationAgent.getSignUpConfiguration().isSignEnabled();
            }

            
            {
                this$0 = NetflixService.this;
                super();
            }
        };
    }

    public String getSoftwareVersion()
    {
        return mConfigurationAgent.getSoftwareVersion();
    }

    public String getUserId()
    {
        return mUserAgent.getUserId();
    }

    public void hideVideo(String s, int i, int j)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(i, j);
        mBrowseAgent.hideVideo(s, wrapCallback(browseagentclientcallback));
    }

    public boolean isCurrentProfileFacebookConnected()
    {
        return mUserAgent.isCurrentProfileFacebookConnected();
    }

    public boolean isCurrentProfileIQEnabled()
    {
        return mUserAgent.isCurrentProfileIQEnabled();
    }

    public boolean isDeviceHd()
    {
        return mConfigurationAgent.isDeviceHd();
    }

    public boolean isProfileSwitchingDisabled()
    {
        return mUserAgent.isProfileSwitchingDisabled();
    }

    public boolean isTablet()
    {
        return mConfigurationAgent.isTablet();
    }

    public boolean isUserLoggedIn()
    {
        return mUserAgent.isUserLoggedIn();
    }

    public void logBillboardActivity(Video video, com.netflix.mediaclient.service.browse.BrowseAgent.BillboardActivityType billboardactivitytype)
    {
        mBrowseAgent.logBillboardActivity(video, billboardactivitytype);
    }

    public void loginUser(String s, String s1, int i, int j)
    {
        UserAgentClientCallback useragentclientcallback = new UserAgentClientCallback(i, j);
        mUserAgent.loginUser(s, s1, useragentclientcallback);
    }

    public void loginUserByTokens(ActivationTokens activationtokens, int i, int j)
    {
        UserAgentClientCallback useragentclientcallback = new UserAgentClientCallback(i, j);
        mUserAgent.tokenActivate(activationtokens, useragentclientcallback);
    }

    public void logoutUser(int i, int j)
    {
        UserAgentClientCallback useragentclientcallback = new UserAgentClientCallback(i, j);
        mUserAgent.logoutUser(useragentclientcallback);
    }

    public IBinder onBind(Intent intent)
    {
        Log.d("NetflixService", "NetflixService is onBind");
        handler.removeCallbacks(stopServiceRunnable);
        return mBinder;
    }

    public void onCreate()
    {
        Log.i("NetflixService", "NetflixService.onCreate.");
        super.onCreate();
        handler = new Handler();
        mClientLoggingAgent = new LoggingAgent();
        mConfigurationAgent = new ConfigurationAgent();
        mNrdController = new NrdController();
        mUserAgent = new UserAgent();
        mBrowseAgent = new BrowseAgent();
        mResourceFetcher = new ResourceFetcher();
        mPlayerAgent = new PlayerAgent();
        mPushAgent = new PushNotificationAgent();
        init();
    }

    public void onDestroy()
    {
        super.onDestroy();
        Log.i("NetflixService", "NetflixService.onDestroy.");
        Log.d("NetflixService", "Send local intent that Netflix service is destroyed");
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.NETFLIX_SERVICE_DESTROYED");
        intent.addCategory("com.netflix.mediaclient.intent.category.NETFLIX_SERVICE");
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
        if (mMdxEnabled)
        {
            safeUnregisterReceiver(mMdxReceiver, "MDX receiver");
        }
        safeUnregisterReceiver(mNetworkChangeReceiver, "network receiver");
        safeUnregisterReceiver(mMdxShowPlayerIntent, "mdx show player receiver");
        mClientCallbacks.clear();
        if (mMdxEnabled)
        {
            mMdxAgent.destroy();
        }
        mBrowseAgent.destroy();
        mPlayerAgent.destroy();
        mUserAgent.destroy();
        mNrdController.destroy();
        mConfigurationAgent.destroy();
        mResourceFetcher.destroy();
        mClientLoggingAgent.destroy();
        int i = Process.myPid();
        Log.d("NetflixService", (new StringBuilder()).append("Destroying app proces ").append(i).append("...").toString());
        Process.killProcess(i);
        Log.d("NetflixService", (new StringBuilder()).append("Destroying app proces ").append(i).append(" done.").toString());
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (intent != null)
        {
            if (mInitComplete)
            {
                doStartCommand(intent, i, j);
            } else
            {
                mInitCallbacks.add(new StartCommandInitCallback(intent, i, j));
            }
        }
        return 2;
    }

    public boolean onUnbind(Intent intent)
    {
        Log.d("NetflixService", "NetflixService is onUnbind");
        int i = mClientCallbacks.size();
        if (i > 0)
        {
            Log.i("NetflixService", (new StringBuilder()).append("We still have ").append(i).append(" callbacks - not stopping service").toString());
            return true;
        }
        if (mMdxEnabled && mMdxAgent.hasActiveSession())
        {
            Log.i("NetflixService", "has active mdx session");
            return true;
        } else
        {
            Log.i("NetflixService", "No callbacks left - stopping service after delay of: 28800 seconds");
            handler.postDelayed(stopServiceRunnable, 0x1b77400L);
            return true;
        }
    }

    public void prefetchGenreLoLoMo(String s, int i, int j, int k, int l, boolean flag, int i1, 
            int j1)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(i1, j1);
        mBrowseAgent.prefetchGenreLoLoMo(s, i, j, k, l, flag, wrapCallback(browseagentclientcallback));
    }

    public void prefetchLoLoMo(int i, int j, int k, int l, int i1, int j1, boolean flag, 
            boolean flag1, int k1, int l1)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(k1, l1);
        mBrowseAgent.prefetchLoLoMo(i, j, k, l, i1, j1, flag, flag1, wrapCallback(browseagentclientcallback));
    }

    public void refreshProfileSwitchingStatus()
    {
        mUserAgent.refreshProfileSwitchingStatus();
    }

    public void registerCallback(INetflixServiceCallback inetflixservicecallback)
    {
        ThreadUtils.assertOnMain();
        handler.removeCallbacks(stopServiceRunnable);
        if (inetflixservicecallback == null)
        {
            throw new IllegalStateException(" registerCallback - cb is null");
        }
        int i = mClientCallbacks.put(inetflixservicecallback);
        Log.i("NetflixService", (new StringBuilder()).append("registerCallback, client: ").append(inetflixservicecallback.hashCode()).toString());
        if (mInitComplete)
        {
            notifyServiceReady(i, mInitStatusCode);
            return;
        } else
        {
            mInitCallbacks.add(new NotifyServiceReadyInitCallback(i));
            return;
        }
    }

    public void removeFromQueue(String s, int i, int j)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(i, j);
        mBrowseAgent.removeFromQueue(s, wrapCallback(browseagentclientcallback));
    }

    public void searchNetflix(String s, int i, int j)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(i, j);
        mBrowseAgent.searchNetflix(s, wrapCallback(browseagentclientcallback));
    }

    public void selectProfile(String s)
    {
        mUserAgent.selectProfile(s);
    }

    public void setCurrentAppLocale(String s)
    {
        mUserAgent.setCurrentAppLocale(s);
    }

    public void setVideoRating(String s, int i, int j, int k, int l)
    {
        BrowseAgentClientCallback browseagentclientcallback = new BrowseAgentClientCallback(k, l);
        mBrowseAgent.setVideoRating(s, i, j, wrapCallback(browseagentclientcallback));
    }

    public void unregisterCallback(INetflixServiceCallback inetflixservicecallback)
    {
        if (inetflixservicecallback == null)
        {
            return;
        }
        inetflixservicecallback = mClientCallbacks.remove(inetflixservicecallback);
        if (inetflixservicecallback == null)
        {
            Log.w("NetflixService", "Client callback was either not-registered/removed");
            return;
        } else
        {
            Log.i("NetflixService", (new StringBuilder()).append("unregisterCallback, client: ").append(inetflixservicecallback.hashCode()).toString());
            return;
        }
    }

    public void verifyPin(String s, int i, int j)
    {
        UserAgentClientCallback useragentclientcallback = new UserAgentClientCallback(i, j);
        mUserAgent.verifyPin(s, useragentclientcallback);
    }






















/*
    static int access$902(NetflixService netflixservice, int i)
    {
        netflixservice.mInitStatusCode = i;
        return i;
    }

*/

    // Unreferenced inner class com/netflix/mediaclient/service/NetflixService$1$1

/* anonymous class */
    class _cls1 extends ArrayList
    {

        final _cls1 this$1;

            
            {
                this$1 = _cls1.this;
                super();
                add(mNrdController);
                add(mResourceFetcher);
                add(mClientLoggingAgent);
            }
    }


    // Unreferenced inner class com/netflix/mediaclient/service/NetflixService$1$2

/* anonymous class */
    class _cls2 extends ArrayList
    {

        final _cls1 this$1;

            
            {
                this$1 = _cls1.this;
                super();
                add(mBrowseAgent);
                add(mUserAgent);
                add(mPlayerAgent);
                add(mPushAgent);
            }
    }

}
