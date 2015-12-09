// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PowerManager;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Pair;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.event.UIEvent;
import com.netflix.mediaclient.event.nrdp.mdx.InitErrorEvent;
import com.netflix.mediaclient.event.nrdp.mdx.InitEvent;
import com.netflix.mediaclient.event.nrdp.mdx.StateEvent;
import com.netflix.mediaclient.event.nrdp.mdx.discovery.DeviceFoundEvent;
import com.netflix.mediaclient.event.nrdp.mdx.discovery.DeviceLostEvent;
import com.netflix.mediaclient.event.nrdp.mdx.discovery.RemoteDeviceReadyEvent;
import com.netflix.mediaclient.javabridge.ui.EventListener;
import com.netflix.mediaclient.javabridge.ui.Nrdp;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.MdxController;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.RemoteDevice;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.TransactionId;
import com.netflix.mediaclient.media.BifManager;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.NrdController;
import com.netflix.mediaclient.service.ServiceAgent;
import com.netflix.mediaclient.service.browse.SimpleBrowseAgentCallback;
import com.netflix.mediaclient.service.configuration.esn.EsnProvider;
import com.netflix.mediaclient.service.mdx.cast.CastManager;
import com.netflix.mediaclient.service.mdx.notification.MdxNotificationManager;
import com.netflix.mediaclient.service.user.UserAgentBroadcastIntents;
import com.netflix.mediaclient.servicemgr.CustomerEventLogging;
import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.IMdx;
import com.netflix.mediaclient.servicemgr.IMdxSharedState;
import com.netflix.mediaclient.servicemgr.MdxPostplayState;
import com.netflix.mediaclient.servicemgr.MovieDetails;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.ServiceManagerUtils;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import com.netflix.mediaclient.servicemgr.VideoType;
import com.netflix.mediaclient.ui.Asset;
import com.netflix.mediaclient.util.StringUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            TargetSelector, TargetManager, ClientNotifier, RemoteControlClientManager, 
//            CommandHandler, SwitchTarget, MdxImageLoader, MdxSessionWatchDog, 
//            MdxSharedState

public class MdxAgent extends ServiceAgent
    implements IMdx, com.netflix.mediaclient.javabridge.ui.mdxcontroller.MdxController.PropertyUpdateListener, com.netflix.mediaclient.service.mdx.notification.MdxNotificationManager.MdxNotificationIntentRetriever, TargetSelector.TargetSelectorInterface, SwitchTarget.SwitchTargetInterface, MdxImageLoader.MdxImageLoaderInterface, MdxSessionWatchDog.SessionWatchDogInterface
{
    class DiscoveryEventListener
        implements EventListener
    {

        final MdxAgent this$0;

        public void received(UIEvent uievent)
        {
            if (!(uievent instanceof DeviceFoundEvent)) goto _L2; else goto _L1
_L1:
            Object obj = (DeviceFoundEvent)uievent;
            uievent = ((DeviceFoundEvent) (obj)).getRemoteDevice().uuid;
            String s = ((DeviceFoundEvent) (obj)).getRemoteDevice().dialUuid;
            if (isSameDevice(uievent, mCurrentTargetUuid) || isSameDevice(s, mCurrentTargetUuid))
            {
                RemoteDevice remotedevice = getDeviceFromUuid(mCurrentTargetUuid);
                if (remotedevice != null)
                {
                    mTargetManager.targetFound(remotedevice);
                }
            }
            if (mNotifier != null)
            {
                mNotifier.targetList();
            }
            obj = ((DeviceFoundEvent) (obj)).getRemoteDevice().serviceType;
            getService().getClientLogging().getCustomerEventLogging().logMdxTarget("found", uievent, s, ((String) (obj)));
_L4:
            return;
_L2:
            if (!(uievent instanceof DeviceLostEvent))
            {
                continue; /* Loop/switch isn't completed */
            }
            uievent = ((DeviceLostEvent)uievent).getDevices();
            int j = uievent.length;
            for (int i = 0; i < j; i++)
            {
                String s1 = uievent[i];
                if (isSameDevice(s1, mCurrentTargetUuid) || mTargetManager.isTargetHaveContext(s1))
                {
                    if (mNotifier != null)
                    {
                        mNotifier.error(mCurrentTargetUuid, 200, "device lost");
                    }
                    sessionGone();
                }
                getService().getClientLogging().getCustomerEventLogging().logMdxTarget("lost", s1, null, null);
            }

            if (mNotifier != null)
            {
                mNotifier.targetList();
                return;
            }
            continue; /* Loop/switch isn't completed */
            if (!(uievent instanceof RemoteDeviceReadyEvent)) goto _L4; else goto _L3
_L3:
            uievent = (RemoteDeviceReadyEvent)uievent;
            if (isSameDevice(uievent.getUuid(), mCurrentTargetUuid))
            {
                if (uievent.getLaunchStatus() == 1)
                {
                    Log.d("nf_mdx_agent", "MdxAgent: RemoteDeviceReadyEvent, app's launched");
                    mTargetManager.targetLaunched(mCurrentTargetUuid, true);
                    return;
                } else
                {
                    Log.d("nf_mdx_agent", "MdxAgent: RemoteDeviceReadyEvent, app's launch failed");
                    mTargetManager.targetLaunched(mCurrentTargetUuid, false);
                    return;
                }
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        DiscoveryEventListener()
        {
            this$0 = MdxAgent.this;
            super();
        }
    }

    class StateEventListener
        implements EventListener
    {

        final MdxAgent this$0;

        public void received(UIEvent uievent)
        {
            if (!(uievent instanceof InitEvent)) goto _L2; else goto _L1
_L1:
            mReady.set(true);
            mTargetMap.clear();
            mNotifier.ready();
            if (mCastManager != null)
            {
                mCastManager.start();
            }
_L4:
            return;
_L2:
            if (!(uievent instanceof InitErrorEvent))
            {
                continue; /* Loop/switch isn't completed */
            }
            mReady.set(false);
            if (mNotifier != null)
            {
                mNotifier.error(mCurrentTargetUuid, 103, ((InitErrorEvent)uievent).getErrorDesc());
                return;
            }
            continue; /* Loop/switch isn't completed */
            if (!(uievent instanceof StateEvent)) goto _L4; else goto _L3
_L3:
            if (!((StateEvent)uievent).isReady())
            {
                break; /* Loop/switch isn't completed */
            }
            mReady.set(true);
            mTargetMap.clear();
            if (mNotifier != null)
            {
                mNotifier.ready();
            }
            if (mCastManager != null)
            {
                mCastManager.start();
                return;
            }
            if (true) goto _L4; else goto _L5
_L5:
            mReady.set(false);
            mTargetMap.clear();
            if (mNotifier != null)
            {
                mNotifier.notready();
            }
            sessionGone();
            if (mCastManager != null)
            {
                mCastManager.stop();
                return;
            }
            if (true) goto _L4; else goto _L6
_L6:
        }

        StateEventListener()
        {
            this$0 = MdxAgent.this;
            super();
        }
    }

    public static class Utils
    {

        public static Intent createIntent(Activity activity, String s, String s1)
        {
            s = new Intent(s);
            s.setClass(activity, com/netflix/mediaclient/service/NetflixService);
            s.addCategory("com.netflix.mediaclient.intent.category.MDX");
            s.putExtra("uuid", s1);
            return s;
        }

        public static boolean isInPostPlay(Intent intent)
        {
            if (intent.hasExtra("postplayState"))
            {
                if (!StringUtils.isEmpty(intent = intent.getExtras().getString("postplayState")) && ((intent = new MdxPostplayState(intent)).isInCountdown() || intent.isInPrompt()))
                {
                    return true;
                }
            }
            return false;
        }

        private static boolean isSameAsCurrentlyPlaying(String s, String s1, com.netflix.mediaclient.util.WebApiUtils.VideoIds videoids)
        {
            if (StringUtils.isEmpty(s1) && StringUtils.isNotEmpty(s) && videoids.catalogId == Integer.valueOf(s).intValue())
            {
                Log.v("nf_mdx_agent", "same movie");
                return true;
            }
            if (StringUtils.isNotEmpty(s1) && videoids.episodeId == Integer.valueOf(s1).intValue())
            {
                Log.v("nf_mdx_agent", "same show");
                return true;
            } else
            {
                return false;
            }
        }

        public static boolean playVideo(NetflixActivity netflixactivity, Asset asset, boolean flag)
        {
            if (asset.isEpisode())
            {
                Log.d("nf_mdx_agent", "Playing episode");
                return playVideo(netflixactivity, asset.getParentId(), asset.getPlayableId(), asset.getTrackId(), asset.getPlaybackBookmark(), flag);
            } else
            {
                Log.d("nf_mdx_agent", "Playing movie");
                return playVideo(netflixactivity, asset.getPlayableId(), null, asset.getTrackId(), asset.getPlaybackBookmark(), flag);
            }
        }

        private static boolean playVideo(NetflixActivity netflixactivity, String s, String s1, int i, int j, boolean flag)
        {
            if (Log.isLoggable("nf_mdx_agent", 2))
            {
                Log.v("nf_mdx_agent", (new StringBuilder()).append("Starting playback movieId ").append(s).append(", epId ").append(s1).append(", trackId ").append(i).append(", bookmark ").append(j).toString());
            }
            Object obj = netflixactivity.getServiceManager();
            if (!ServiceManagerUtils.isMdxAgentAvailable(((ServiceManager) (obj))))
            {
                Log.w("nf_mdx_agent", "MDX agent not available - can't play video");
            } else
            {
                com.netflix.mediaclient.util.WebApiUtils.VideoIds videoids = ((ServiceManager) (obj)).getMdx().getVideoIds();
                if (flag || videoids == null || !isSameAsCurrentlyPlaying(s, s1, videoids))
                {
                    obj = ((ServiceManager) (obj)).getMdx().getCurrentTarget();
                    Intent intent = createIntent(netflixactivity, "com.netflix.mediaclient.intent.action.MDX_PLAY_VIDEOIDS", ((String) (obj)));
                    if (s != null)
                    {
                        intent.putExtra("catalogId", Integer.parseInt(s));
                    }
                    if (s1 != null)
                    {
                        intent.putExtra("episodeId", Integer.parseInt(s1));
                    }
                    intent.putExtra("trackId", i);
                    intent.putExtra("time", j);
                    netflixactivity.startService(intent);
                    Log.v("nf_mdx_agent", "play done");
                    netflixactivity.startService(createIntent(netflixactivity, "com.netflix.mediaclient.intent.action.MDX_GETCAPABILITY", ((String) (obj))));
                    return true;
                }
            }
            return false;
        }

        public Utils()
        {
        }
    }


    private static final int DEFAULT_INTEGER = -1;
    public static final String EVENT485_TRANSFERFROM_LOCAL = "local_playback_transfer";
    public static final String EVENT526_TYPE_FAIL = "association_failed";
    public static final String EVENT526_TYPE_FOUND = "found";
    public static final String EVENT526_TYPE_LOST = "lost";
    public static final String EVENT537_TYPE_CANCEL_PLAYBACK = "cancel playback";
    public static final String EVENT537_TYPE_LOCAL_PLAYBACK = "local playback";
    public static final String EVENT537_TYPE_TARGET_PLAYBACK = "target playback";
    private static final String TAG = "nf_mdx_agent";
    private BifManager mBifManager;
    private Bitmap mBoxartBitmap;
    private CastManager mCastManager;
    private CommandHandler mCommandHandler;
    private String mCurrentTargetUuid;
    private boolean mDisableWebSocket;
    private final EventListener mDiscoveryEventListener = new DiscoveryEventListener();
    private boolean mEnableCast;
    private final Handler mMdxAgentWorkerHandler;
    private HandlerThread mMdxAgentWorkerThread;
    private MdxImageLoader mMdxBoxartLoader;
    private MdxController mMdxController;
    private MdxNotificationManager mMdxNotificationManager;
    private MdxSessionWatchDog mMdxSessionWatchDog;
    private ClientNotifier mNotifier;
    private android.os.PowerManager.WakeLock mPartialWakeLock;
    private final AtomicBoolean mReady = new AtomicBoolean(false);
    private RemoteControlClientManager mRemoteControlClientManager;
    private final BroadcastReceiver mStartStopErrorReceiver = new BroadcastReceiver() {

        final MdxAgent this$0;

        private void doMDXPlayBackEnd(Intent intent)
        {
            if (!Utils.isInPostPlay(intent))
            {
                Log.d("nf_mdx_agent", "MdxAgent: receive MDXUPDATE_PLAYBACKEND");
                mMdxSessionWatchDog.stop();
                clearVideoDetails();
                stopAllNotifications();
                releaseWiFi();
                if (mTargetSelector != null)
                {
                    mTargetSelector.targetBecomeInactive(mCurrentTargetUuid);
                }
                if (mSwitchTarget != null)
                {
                    mSwitchTarget.targetPlaybackStopped(mCurrentTargetUuid);
                }
            }
        }

        private void doMDXPlaybackStart()
        {
            Log.d("nf_mdx_agent", "MdxAgent: receive MDXUPDATE_PLAYBACKSTART");
            mMdxSessionWatchDog.start();
            lockWiFi();
            if (mRemoteControlClientManager != null)
            {
                mRemoteControlClientManager.start(false, null, mCurrentTargetUuid);
                if (mBoxartBitmap != null)
                {
                    mRemoteControlClientManager.setState(false, false, false);
                    mRemoteControlClientManager.setBoxart(mBoxartBitmap);
                    mMdxNotificationManager.setPauseStateNotify(false, false, false);
                }
                updateMdxRemoteClient(false, true);
            }
            if (mMdxNotificationManager != null)
            {
                mMdxNotificationManager.setBoxartNotify(mBoxartBitmap);
            }
            if (mTargetSelector != null)
            {
                mTargetSelector.targetBecomeActive(mCurrentTargetUuid);
            }
        }

        private void doMDXPostPlay(Intent intent)
        {
            String s = intent.getExtras().getString("postplayState");
            if (!StringUtils.isEmpty(s))
            {
                MdxPostplayState mdxpostplaystate = new MdxPostplayState(s);
                if (mdxpostplaystate.isInCountdown())
                {
                    doMDXPostPlayCountdownStart(intent, s);
                } else
                if (mdxpostplaystate.isInPrompt())
                {
                    doMDXPostPlaySeriesEnd(intent);
                    return;
                }
            }
        }

        private void doMDXPostPlayCountdownStart(Intent intent, String s)
        {
            if (mRemoteControlClientManager != null)
            {
                mRemoteControlClientManager.start(true, mVideoDetails, mCurrentTargetUuid);
                updateMdxRemoteClient(true, true);
            }
            updateMdxNotificationController(s);
            if (mRemoteControlClientManager != null)
            {
                mRemoteControlClientManager.setState(false, false, true);
                if (mMdxNotificationManager == null)
                {
                    mMdxNotificationManager = new MdxNotificationManager(getContext(), true, MdxAgent.this);
                }
                mMdxNotificationManager.setUpNextStateNotify(false, false, true);
            }
        }

        private void doMDXPostPlaySeriesEnd(Intent intent)
        {
            intent = intent.getExtras().getString("postplayState");
            if (!StringUtils.isEmpty(intent) && (new MdxPostplayState(intent)).isInPrompt() && mRemoteControlClientManager != null)
            {
                stopAllNotifications();
            }
        }

        private void dpMDXSimplePlaybackState(Intent intent)
        {
            boolean flag = intent.getBooleanExtra("paused", false);
            boolean flag1 = intent.getBooleanExtra("transitioning", false);
            boolean flag2 = Utils.isInPostPlay(intent);
            if (Log.isLoggable("nf_mdx_agent", 3))
            {
                Log.d("nf_mdx_agent", (new StringBuilder()).append("MdxAgent: simplePlaybackState : paused ").append(flag).append(", transitioning ").append(flag1).toString());
            }
            if (mRemoteControlClientManager != null)
            {
                mRemoteControlClientManager.setState(flag, flag1, flag2);
                if (mMdxNotificationManager != null)
                {
                    mMdxNotificationManager.setPauseStateNotify(flag, flag1, flag2);
                }
            }
        }

        private void stopAllNotifications()
        {
            if (mRemoteControlClientManager != null)
            {
                mRemoteControlClientManager.stop();
            }
            if (mMdxNotificationManager != null)
            {
                mMdxNotificationManager.cancelNotification();
                mMdxNotificationManager = null;
                mBoxartBitmap = null;
            }
        }

        private void updateMdxNotificationController(String s)
        {
            s = new MdxPostplayState(s);
            if (s.isInCountdown())
            {
                s = s.getPostplayTitle();
                if (s.length > 0 && s[0].isEpisode() && s[0].getId() > 0)
                {
                    mVideoIds = new com.netflix.mediaclient.util.WebApiUtils.VideoIds();
                    mVideoIds.episode = true;
                    mVideoIds.episodeId = s[0].getId();
                    fetchVideoDetail(false, true);
                }
            }
        }

        public void onReceive(Context context, Intent intent)
        {
            if (intent.hasCategory("com.netflix.mediaclient.intent.category.MDX"))
            {
                if (intent.getAction().equals("com.netflix.mediaclient.intent.action.MDXUPDATE_PLAYBACKEND"))
                {
                    doMDXPlayBackEnd(intent);
                } else
                {
                    if (intent.getAction().equals("com.netflix.mediaclient.intent.action.MDXUPDATE_PLAYBACKSTART"))
                    {
                        doMDXPlaybackStart();
                        return;
                    }
                    if ("com.netflix.mediaclient.intent.action.MDXUPDATE_POSTPLAY".equals(intent.getAction()))
                    {
                        doMDXPostPlay(intent);
                        return;
                    }
                    if (intent.getAction().equals("com.netflix.mediaclient.intent.action.MDXUPDATE_SIMPLE_PLAYBACKSTATE"))
                    {
                        dpMDXSimplePlaybackState(intent);
                        return;
                    }
                    if (intent.getAction().equals("com.netflix.mediaclient.intent.action.MDXUPDATE_ERROR"))
                    {
                        int i = intent.getIntExtra("errorCode", 0);
                        if (mNotifier != null)
                        {
                            context = mNotifier.getSharedState(mCurrentTargetUuid);
                            if (context != null)
                            {
                                boolean flag = false;
                                if (com.netflix.mediaclient.servicemgr.IMdxSharedState.MdxPlaybackState.Loading == context.getMdxPlaybackState() || com.netflix.mediaclient.servicemgr.IMdxSharedState.MdxPlaybackState.Transitioning == context.getMdxPlaybackState())
                                {
                                    flag = true;
                                }
                                if (i >= 100 && i < 200 && flag)
                                {
                                    Log.d("nf_mdx_agent", "MdxAgent: received error, clear video detail");
                                    clearVideoDetails();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }

            
            {
                this$0 = MdxAgent.this;
                super();
            }
    };
    private int mStartTime;
    private final EventListener mStateEventListener = new StateEventListener();
    private SwitchTarget mSwitchTarget;
    private String mTaregtUuid;
    private String mTargetDialUuid;
    private String mTargetFriendlyName;
    private TargetManager mTargetManager;
    private final ArrayList mTargetMap = new ArrayList();
    private TargetSelector mTargetSelector;
    private int mTrackId;
    private final BroadcastReceiver mUserAgentReceiver = new BroadcastReceiver() {

        final MdxAgent this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (intent == null)
            {
                Log.v("nf_mdx_agent", "Null intent");
            } else
            {
                context = intent.getAction();
                if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_ACTIVE".equals(context))
                {
                    Log.d("nf_mdx_agent", "useprofile is active");
                    notifyIsUserLogin(true);
                    return;
                }
                if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_DEACTIVE".equals(context))
                {
                    Log.d("nf_mdx_agent", "useprofile is not active");
                    notifyIsUserLogin(false);
                    return;
                }
                if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_ACTIVE".equals(context))
                {
                    Log.d("nf_mdx_agent", "user account is activated");
                    return;
                }
                if ("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_DEACTIVE".equals(context))
                {
                    Log.d("nf_mdx_agent", "user account is deactivated");
                    return;
                }
            }
        }

            
            {
                this$0 = MdxAgent.this;
                super();
            }
    };
    private boolean mUserIsLogin;
    private VideoDetails mVideoDetails;
    private com.netflix.mediaclient.util.WebApiUtils.VideoIds mVideoIds;
    private android.net.wifi.WifiManager.WifiLock mWifiLock;

    public MdxAgent()
    {
        mUserIsLogin = false;
        mVideoIds = new com.netflix.mediaclient.util.WebApiUtils.VideoIds();
        mDisableWebSocket = false;
        mEnableCast = false;
        Log.d("nf_mdx_agent", "MdxAgent: start");
        mCurrentTargetUuid = new String();
        mMdxAgentWorkerThread = new HandlerThread("MdxAgentWorker");
        mMdxAgentWorkerThread.start();
        mMdxAgentWorkerHandler = new Handler(mMdxAgentWorkerThread.getLooper());
    }

    private void addDiscoveryEventListener()
    {
        mMdxController.addEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_discovery_devicefound.getName(), mDiscoveryEventListener);
        mMdxController.addEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_discovery_devicelost.getName(), mDiscoveryEventListener);
        mMdxController.addEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_discovery_remoteDeviceReady.getName(), mDiscoveryEventListener);
    }

    private void addPairingEventListener(EventListener eventlistener)
    {
        mMdxController.addEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_pair_pairingresponse.getName(), eventlistener);
        mMdxController.addEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_pair_regpairresponse.getName(), eventlistener);
        mMdxController.addEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_pair_pairingdeleted.getName(), eventlistener);
    }

    private void addSessionEventListener(EventListener eventlistener)
    {
        mMdxController.addEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_session_startSessionResponse.getName(), eventlistener);
        mMdxController.addEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_session_messagedelivered.getName(), eventlistener);
        mMdxController.addEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_session_message.getName(), eventlistener);
        mMdxController.addEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_session_messagingerror.getName(), eventlistener);
        mMdxController.addEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_session_sessionended.getName(), eventlistener);
    }

    private void addStateEventListener()
    {
        mMdxController.addEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_init.getName(), mStateEventListener);
        mMdxController.addEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_initerror.getName(), mStateEventListener);
        mMdxController.addEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_mdxstate.getName(), mStateEventListener);
    }

    private void clearVideoDetails()
    {
        mVideoIds = new com.netflix.mediaclient.util.WebApiUtils.VideoIds();
        mVideoDetails = null;
    }

    private void createBifManager(String s)
    {
        if (mBifManager != null)
        {
            mBifManager.release();
        }
        mBifManager = new BifManager(getContext(), s);
    }

    private PendingIntent createNotificationButtonIntent(Intent intent)
    {
        intent.setClass(getContext(), com/netflix/mediaclient/service/NetflixService).addCategory("com.netflix.mediaclient.intent.category.MDX").putExtra("uuid", mCurrentTargetUuid);
        return PendingIntent.getService(getContext(), 0, intent, 0x8000000);
    }

    private void fetchVideoDetail(final boolean triggeredByCommand, final boolean isPostPlay)
    {
        if (mVideoIds.episode)
        {
            SimpleBrowseAgentCallback simplebrowseagentcallback = new SimpleBrowseAgentCallback() {

                final MdxAgent this$0;
                final boolean val$isPostPlay;
                final boolean val$triggeredByCommand;

                public void onEpisodeDetailsFetched(EpisodeDetails episodedetails, int i)
                {
                    if (i == 0)
                    {
                        mVideoDetails = episodedetails;
                        Object obj = episodedetails.getHighResolutionPortraitBoxArtUrl();
                        if (mMdxBoxartLoader != null)
                        {
                            mMdxBoxartLoader.fetchImage(((String) (obj)));
                        }
                        obj = episodedetails.getBifUrl();
                        if (StringUtils.isNotEmpty(((String) (obj))))
                        {
                            createBifManager(((String) (obj)));
                        }
                        mNotifier.movieMetaDataAvailable(mCurrentTargetUuid);
                        if (triggeredByCommand)
                        {
                            episodedetails = new com.netflix.mediaclient.util.WebApiUtils.VideoIds(episodedetails.isPlayableEpisode(), episodedetails.getEpisodeIdUrl(), episodedetails.getCatalogIdUrl(), Integer.parseInt(episodedetails.getId()), Integer.parseInt(episodedetails.getShowId()));
                            mVideoIds = episodedetails;
                            mTargetManager.playerPlay(mCurrentTargetUuid, mVideoIds.catalogIdUrl, mTrackId, mVideoIds.episodeIdUrl, mStartTime);
                            logPlaystart(false);
                        }
                        updateMdxRemoteClient(isPostPlay, false);
                        episodedetails = getContext().getString(0x7f0c0181, new Object[] {
                            Integer.valueOf(mVideoDetails.getSeasonNumber()), Integer.valueOf(mVideoDetails.getEpisodeNumber()), mVideoDetails.getTitle()
                        });
                        obj = getContext().getResources();
                        if (isPostPlay)
                        {
                            i = 0x7f0c0179;
                        } else
                        {
                            i = 0x7f0c0178;
                        }
                        obj = ((Resources) (obj)).getString(i);
                        updateMdxNotification(true, mVideoDetails.getParentTitle(), episodedetails, ((String) (obj)));
                    }
                }

            
            {
                this$0 = MdxAgent.this;
                triggeredByCommand = flag;
                isPostPlay = flag1;
                super();
            }
            };
            getBrowseAgent().fetchEpisodeDetails(String.valueOf(mVideoIds.episodeId), simplebrowseagentcallback);
            return;
        } else
        {
            SimpleBrowseAgentCallback simplebrowseagentcallback1 = new SimpleBrowseAgentCallback() {

                final MdxAgent this$0;
                final boolean val$triggeredByCommand;

                public void onMovieDetailsFetched(MovieDetails moviedetails, int i)
                {
                    if (i == 0)
                    {
                        mVideoDetails = moviedetails;
                        String s = moviedetails.getHighResolutionPortraitBoxArtUrl();
                        if (mMdxBoxartLoader != null)
                        {
                            mMdxBoxartLoader.fetchImage(s);
                        }
                        s = moviedetails.getBifUrl();
                        if (StringUtils.isNotEmpty(s))
                        {
                            createBifManager(s);
                        }
                        mNotifier.movieMetaDataAvailable(mCurrentTargetUuid);
                        if (triggeredByCommand)
                        {
                            moviedetails = new com.netflix.mediaclient.util.WebApiUtils.VideoIds(moviedetails.isPlayableEpisode(), null, moviedetails.getCatalogIdUrl(), 0, Integer.parseInt(moviedetails.getId()));
                            mVideoIds = moviedetails;
                            mTargetManager.playerPlay(mCurrentTargetUuid, mVideoIds.catalogIdUrl, mTrackId, mVideoIds.episodeIdUrl, mStartTime);
                            logPlaystart(false);
                        }
                        moviedetails = getContext().getResources();
                        if (false)
                        {
                            i = 0x7f0c0179;
                        } else
                        {
                            i = 0x7f0c0178;
                        }
                        moviedetails = moviedetails.getString(i);
                        updateMdxNotification(false, mVideoDetails.getTitle(), null, moviedetails);
                    }
                }

            
            {
                this$0 = MdxAgent.this;
                triggeredByCommand = flag;
                super();
            }
            };
            getBrowseAgent().fetchMovieDetails(String.valueOf(mVideoIds.catalogId), simplebrowseagentcallback1);
            return;
        }
    }

    private String getCurrentEpisodeTitle()
    {
        if (mVideoDetails == null)
        {
            return null;
        } else
        {
            return getContext().getString(0x7f0c0181, new Object[] {
                Integer.valueOf(mVideoDetails.getSeasonNumber()), Integer.valueOf(mVideoDetails.getEpisodeNumber()), mVideoDetails.getTitle()
            });
        }
    }

    private RemoteDevice getDeviceFromUuid(String s)
    {
label0:
        {
            synchronized (mTargetMap)
            {
                if (!mTargetMap.isEmpty())
                {
                    break label0;
                }
            }
            return null;
        }
        Iterator iterator = mTargetMap.iterator();
_L2:
        RemoteDevice remotedevice;
        String s1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_112;
        }
        remotedevice = (RemoteDevice)iterator.next();
        s1 = remotedevice.uuid;
        String s2 = remotedevice.dialUuid;
        if (!StringUtils.isNotEmpty(s2) || !s2.equals(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        return remotedevice;
        s;
        arraylist;
        JVM INSTR monitorexit ;
        throw s;
        if (!StringUtils.isNotEmpty(s1) || !s1.equals(s)) goto _L2; else goto _L1
_L1:
        arraylist;
        JVM INSTR monitorexit ;
        return remotedevice;
        arraylist;
        JVM INSTR monitorexit ;
        return null;
    }

    private String getNextEpisodeTitle()
    {
        if (mVideoDetails == null)
        {
            return null;
        } else
        {
            EpisodeDetails episodedetails = (EpisodeDetails)mVideoDetails;
            return getContext().getString(0x7f0c0181, new Object[] {
                Integer.valueOf(episodedetails.getSeasonNumber()), Integer.valueOf(episodedetails.getEpisodeNumber() + 1), episodedetails.getNextEpisodeTitle()
            });
        }
    }

    private void handleAccountConfig()
    {
        mDisableWebSocket = getConfigurationAgent().isDisableWebsocket();
        mEnableCast = getConfigurationAgent().isEnableCast();
        if (mEnableCast)
        {
            mCastManager = new CastManager(getContext(), getMainHandler(), mMdxAgentWorkerHandler, getConfigurationAgent().getEsnProvider().getEsn());
            mCastManager.setCastWhiteList(getConfigurationAgent().getCastWhiteList());
            if (StringUtils.isNotEmpty(mCurrentTargetUuid))
            {
                mCastManager.setTargetId(mCurrentTargetUuid);
            }
            return;
        } else
        {
            mCastManager = null;
            return;
        }
    }

    private boolean isSameDevice(String s, String s1)
    {
        boolean flag = true;
        if (!StringUtils.isEmpty(s) && !StringUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        if (s.equals(s1)) goto _L4; else goto _L3
_L3:
label0:
        {
            synchronized (mTargetMap)
            {
                if (!mTargetMap.isEmpty())
                {
                    break label0;
                }
            }
            return false;
        }
        Iterator iterator = mTargetMap.iterator();
        String s2;
        Object obj;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_142;
            }
            obj = (RemoteDevice)iterator.next();
            s2 = ((RemoteDevice) (obj)).uuid;
            obj = ((RemoteDevice) (obj)).dialUuid;
        } while ((!s.equals(obj) || !s1.equals(s2)) && (!s.equals(s2) || !s1.equals(obj)));
        arraylist;
        JVM INSTR monitorexit ;
        return true;
        s;
        arraylist;
        JVM INSTR monitorexit ;
        throw s;
        arraylist;
        JVM INSTR monitorexit ;
        return false;
    }

    private void lockWiFi()
    {
        releaseWiFi();
        Object obj = (WifiManager)getContext().getSystemService("wifi");
        if (obj != null)
        {
            Log.d("nf_mdx_agent", "WiFi lock acquiring...");
            mWifiLock = ((WifiManager) (obj)).createWifiLock(3, "nf_mdx_agent");
            mWifiLock.acquire();
            Log.d("nf_mdx_agent", "WiFi lock acquired.");
        }
        obj = (PowerManager)getContext().getSystemService("power");
        if (obj != null && mPartialWakeLock == null)
        {
            mPartialWakeLock = ((PowerManager) (obj)).newWakeLock(1, "nf_mdx_agent");
        }
        if (mPartialWakeLock != null && !mPartialWakeLock.isHeld())
        {
            mPartialWakeLock.acquire();
        }
    }

    private void reconcileSelectedTargetInfo()
    {
        if (!StringUtils.isEmpty(mCurrentTargetUuid)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        Object obj1;
        boolean flag;
        boolean flag1;
        flag1 = false;
        obj1 = getDeviceFromUuid(mCurrentTargetUuid);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_364;
        }
        if (getDeviceFromUuid(mTaregtUuid) == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = getDeviceFromUuid(mTaregtUuid);
        mCurrentTargetUuid = mTaregtUuid;
        flag = true;
_L4:
        obj1 = ((RemoteDevice) (obj)).uuid;
        String s = ((RemoteDevice) (obj)).dialUuid;
        obj = ((RemoteDevice) (obj)).friendlyName;
        flag1 = flag;
        if (StringUtils.isNotEmpty(((String) (obj1))))
        {
            flag1 = flag;
            if (!((String) (obj1)).equals(mTaregtUuid))
            {
                mTaregtUuid = ((String) (obj1));
                flag1 = true;
            }
        }
        flag = flag1;
        if (StringUtils.isNotEmpty(s))
        {
            flag = flag1;
            if (!((String) (obj1)).equals(mTargetDialUuid))
            {
                mTargetDialUuid = s;
                flag = true;
            }
        }
        flag1 = flag;
        if (StringUtils.isNotEmpty(((String) (obj))))
        {
            flag1 = flag;
            if (!((String) (obj1)).equals(mTargetFriendlyName))
            {
                mTargetFriendlyName = ((String) (obj));
                flag1 = true;
            }
        }
        if (flag1 && mTargetSelector != null)
        {
            mTargetSelector.updateSelectedTarget(mCurrentTargetUuid, mTaregtUuid, mTargetDialUuid, mTargetFriendlyName);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
label0:
        {
            if (getDeviceFromUuid(mTargetDialUuid) == null)
            {
                break label0;
            }
            obj = getDeviceFromUuid(mTargetDialUuid);
            mCurrentTargetUuid = mTargetDialUuid;
            flag = true;
        }
          goto _L4
        obj = mTargetMap.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            obj1 = (RemoteDevice)((Iterator) (obj)).next();
        } while (!StringUtils.isNotEmpty(mTargetFriendlyName) || !mTargetFriendlyName.equals(((RemoteDevice) (obj1)).friendlyName));
        if (StringUtils.isNotEmpty(((RemoteDevice) (obj1)).dialUuid))
        {
            mCurrentTargetUuid = ((RemoteDevice) (obj1)).dialUuid;
        } else
        {
            mCurrentTargetUuid = ((RemoteDevice) (obj1)).uuid;
        }
        if (!Log.isLoggable("nf_mdx_agent", 3)) goto _L1; else goto _L5
_L5:
        Log.d("nf_mdx_agent", (new StringBuilder()).append("MdxAgent: taregt no longer exist ").append(mCurrentTargetUuid).toString());
        return;
        obj = obj1;
        flag = flag1;
        if (StringUtils.isNotEmpty(((RemoteDevice) (obj1)).dialUuid))
        {
            obj = obj1;
            flag = flag1;
            if (!((RemoteDevice) (obj1)).dialUuid.equals(mCurrentTargetUuid))
            {
                mCurrentTargetUuid = ((RemoteDevice) (obj1)).dialUuid;
                flag = true;
                obj = obj1;
            }
        }
          goto _L4
    }

    private void registerStartStopReceiver()
    {
        IntentFilter intentfilter = new IntentFilter("com.netflix.mediaclient.intent.action.MDXUPDATE_PLAYBACKEND");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.MDXUPDATE_PLAYBACKSTART");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.MDXUPDATE_POSTPLAY");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.MDXUPDATE_SIMPLE_PLAYBACKSTATE");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.MDXUPDATE_ERROR");
        intentfilter.addCategory("com.netflix.mediaclient.intent.category.MDX");
        getContext().registerReceiver(mStartStopErrorReceiver, intentfilter);
    }

    private void releaseWiFi()
    {
        if (mWifiLock != null && mWifiLock.isHeld())
        {
            Log.d("nf_mdx_agent", "WiFi lock was held, release...");
            mWifiLock.release();
            Log.d("nf_mdx_agent", "WiFi lock released.");
        }
        if (mPartialWakeLock != null && mPartialWakeLock.isHeld())
        {
            mPartialWakeLock.release();
        }
    }

    private void removeDiscoveryEventListener()
    {
        mMdxController.removeEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_discovery_devicefound.getName(), mDiscoveryEventListener);
        mMdxController.removeEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_discovery_devicelost.getName(), mDiscoveryEventListener);
        mMdxController.removeEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_discovery_remoteDeviceReady.getName(), mDiscoveryEventListener);
    }

    private void removePairingEventListener(EventListener eventlistener)
    {
        mMdxController.removeEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_pair_pairingresponse.getName(), eventlistener);
        mMdxController.removeEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_pair_regpairresponse.getName(), eventlistener);
        mMdxController.removeEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_pair_pairingdeleted.getName(), eventlistener);
    }

    private void removeSessionEventListener(EventListener eventlistener)
    {
        mMdxController.removeEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_session_startSessionResponse.getName(), eventlistener);
        mMdxController.removeEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_session_messagedelivered.getName(), eventlistener);
        mMdxController.removeEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_session_message.getName(), eventlistener);
        mMdxController.removeEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_session_messagingerror.getName(), eventlistener);
        mMdxController.removeEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_session_sessionended.getName(), eventlistener);
    }

    private void removeStateEventListener()
    {
        mMdxController.removeEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_init.getName(), mStateEventListener);
        mMdxController.removeEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_initerror.getName(), mStateEventListener);
        mMdxController.removeEventListener(com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_mdxstate.getName(), mStateEventListener);
    }

    private void sessionGone()
    {
        if (mTargetManager != null)
        {
            mTargetManager.targetGone(mCurrentTargetUuid);
        }
        mNotifier.error(mCurrentTargetUuid, 201, "stop connecting to target");
        mNotifier.playbackEnd(mCurrentTargetUuid, null);
    }

    private void unregisterStartStopReceiver()
    {
        try
        {
            getContext().unregisterReceiver(mStartStopErrorReceiver);
            return;
        }
        catch (Exception exception)
        {
            Log.i("nf_mdx_agent", (new StringBuilder()).append("unregistermStartStopReceiver ").append(exception).toString());
        }
    }

    private void updateMdxNotification(boolean flag, String s, String s1, String s2)
    {
        if (mMdxNotificationManager != null)
        {
            synchronized (mMdxNotificationManager)
            {
                mMdxNotificationManager.setTitlesNotify(flag, s, s1, s2);
            }
            return;
        } else
        {
            return;
        }
        s;
        mdxnotificationmanager;
        JVM INSTR monitorexit ;
        throw s;
    }

    private void updateMdxRemoteClient(boolean flag, boolean flag1)
    {
label0:
        {
            if (mVideoDetails != null)
            {
                if (mVideoDetails.getType() != VideoType.EPISODE)
                {
                    break label0;
                }
                String s;
                String s1;
                if (flag)
                {
                    s = getContext().getString(0x7f0c0179);
                } else
                {
                    s = mVideoDetails.getParentTitle();
                }
                if (flag1 && (mVideoDetails instanceof EpisodeDetails))
                {
                    s1 = getNextEpisodeTitle();
                } else
                {
                    s1 = getCurrentEpisodeTitle();
                }
                mRemoteControlClientManager.setTitles(s, s1);
            }
            return;
        }
        mRemoteControlClientManager.setTitles(mVideoDetails.getTitle(), null);
    }

    public void destroy()
    {
        mMdxAgentWorkerThread.quit();
        try
        {
            mMdxAgentWorkerThread.join();
        }
        catch (InterruptedException interruptedexception)
        {
            Log.e("nf_mdx_agent", "MdxAgent: mMdxAgentWorkerThread interrupted");
        }
        mMdxAgentWorkerThread = null;
        unregisterUserAgentReceiver();
        if (mMdxController != null)
        {
            mMdxController.removePropertyUpdateListener();
            removeStateEventListener();
            removeDiscoveryEventListener();
            removePairingEventListener(mTargetManager);
            removeSessionEventListener(mTargetManager);
            mMdxController = null;
        }
        if (mBifManager != null)
        {
            mBifManager.release();
            mBifManager = null;
        }
        if (mRemoteControlClientManager != null)
        {
            mRemoteControlClientManager.stop();
            mRemoteControlClientManager = null;
        }
        if (mCastManager != null)
        {
            mCastManager.destroy();
        }
        unregisterStartStopReceiver();
        super.destroy();
    }

    protected void doInit()
    {
        Log.e("nf_mdx_agent", "MdxAgent: doInit");
        if (getNrdController() != null && getNrdController().getNrdp() != null)
        {
            mMdxController = getNrdController().getNrdp().getMdxController();
            mNotifier = new ClientNotifier(getContext());
            mTargetManager = new TargetManager(mNotifier, mMdxController, getConfigurationAgent().getEsnProvider().getEsn());
            mCommandHandler = new CommandHandler(mTargetManager);
            if (mMdxController == null || mNotifier == null || mTargetManager == null || mCommandHandler == null)
            {
                initCompleted(-2);
                return;
            }
        } else
        {
            initCompleted(-4);
            return;
        }
        mReady.set(false);
        mTargetMap.clear();
        mMdxController.setPropertyUpdateListener(this);
        TransactionId.setTransactionIdSource(getNrdController().getNrdp());
        if (Log.isLoggable("nf_mdx_agent", 3))
        {
            Log.d("nf_mdx_agent", (new StringBuilder()).append("MdxAgent: change XID base from ").append(System.currentTimeMillis()).append(" ==> ").append(getNrdController().getNrdp().now()).toString());
        }
        mMdxAgentWorkerHandler.post(new Runnable() {

            final MdxAgent this$0;

            public void run()
            {
                mTargetSelector = new TargetSelector(getContext(), MdxAgent.this);
            }

            
            {
                this$0 = MdxAgent.this;
                super();
            }
        });
        mSwitchTarget = new SwitchTarget(mTargetManager, this);
        if (Log.isLoggable("nf_mdx_agent", 3))
        {
            Log.d("nf_mdx_agent", (new StringBuilder()).append("MdxAgent: doInit mCurrentTargetUuid: ").append(mCurrentTargetUuid).toString());
        }
        mMdxBoxartLoader = new MdxImageLoader(getResourceFetcher(), this, mMdxAgentWorkerHandler);
        mMdxSessionWatchDog = new MdxSessionWatchDog(this, mMdxAgentWorkerHandler);
        registerUserAgentReceiver();
        com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface useragentinterface = getUserAgent();
        if (useragentinterface != null)
        {
            boolean flag;
            if (StringUtils.isNotEmpty(useragentinterface.getCurrentProfileId()) && useragentinterface.isUserLoggedIn())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            notifyIsUserLogin(flag);
        } else
        {
            Log.e("nf_mdx_agent", "MdxAgent: userAgent is not ready yet, skip init");
        }
        registerStartStopReceiver();
        mRemoteControlClientManager = new RemoteControlClientManager(getContext());
        initCompleted(0);
    }

    public ByteBuffer getBifFrame(int i)
    {
        if (mBifManager != null)
        {
            return mBifManager.getIndexFrame(i);
        } else
        {
            return null;
        }
    }

    public String getCurrentTarget()
    {
        if (Log.isLoggable("nf_mdx_agent", 3))
        {
            Log.d("nf_mdx_agent", (new StringBuilder()).append("MdxAgent: getCurrentTarget : ").append(mCurrentTargetUuid).toString());
        }
        return mCurrentTargetUuid;
    }

    public Pair getMdxNotification(boolean flag)
    {
        com.netflix.mediaclient.util.WebApiUtils.VideoIds videoids = mTargetManager.getVideoIds();
        if (videoids == null) goto _L2; else goto _L1
_L1:
        if (videoids.episode != mVideoIds.episode || videoids.episode && videoids.episodeId != mVideoIds.episodeId || videoids.catalogId != mVideoIds.catalogId)
        {
            mVideoIds = videoids;
            fetchVideoDetail(false, flag);
            if (mMdxNotificationManager == null)
            {
                mMdxNotificationManager = new MdxNotificationManager(getContext(), mVideoIds.episode, this);
            }
            return mMdxNotificationManager.getNotification();
        }
        Log.d("nf_mdx_agent", "MdxAgent: videoIds are all same");
        mNotifier.movieMetaDataAvailable(mCurrentTargetUuid);
        if (mMdxNotificationManager == null)
        {
            mMdxNotificationManager = new MdxNotificationManager(getContext(), mVideoIds.episode, this);
        }
        if (mBoxartBitmap != null)
        {
            mMdxNotificationManager.setBoxart(mBoxartBitmap);
        }
        if (mVideoDetails != null)
        {
            Object obj = getContext().getResources();
            int i;
            if (flag)
            {
                i = 0x7f0c0179;
            } else
            {
                i = 0x7f0c0178;
            }
            obj = ((Resources) (obj)).getString(i);
            if (mVideoIds.episode)
            {
                String s = getContext().getString(0x7f0c0181, new Object[] {
                    Integer.valueOf(mVideoDetails.getSeasonNumber()), Integer.valueOf(mVideoDetails.getEpisodeNumber()), mVideoDetails.getTitle()
                });
                mMdxNotificationManager.setTitlesNotify(true, mVideoDetails.getParentTitle(), s, ((String) (obj)));
            } else
            {
                mMdxNotificationManager.setTitlesNotify(false, mVideoDetails.getTitle(), null, ((String) (obj)));
            }
        }
_L4:
        return mMdxNotificationManager.getNotification();
_L2:
        Log.d("nf_mdx_agent", "MdxAgent: new videoIds is null");
        if (mMdxNotificationManager == null)
        {
            mMdxNotificationManager = new MdxNotificationManager(getContext(), true, this);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public PendingIntent getNoActionIntent()
    {
        return PendingIntent.getService(getContext(), 0, new Intent(), 0);
    }

    public PendingIntent getPauseIntent()
    {
        return createNotificationButtonIntent(new Intent("com.netflix.mediaclient.intent.action.MDX_PAUSE"));
    }

    public PendingIntent getPlayNextIntent()
    {
        if (mVideoDetails != null && (mVideoDetails instanceof EpisodeDetails))
        {
            EpisodeDetails episodedetails = (EpisodeDetails)mVideoDetails;
            Intent intent = new Intent("com.netflix.mediaclient.intent.action.MDX_PLAY_VIDEOIDS");
            intent.putExtra("episodeId", Integer.parseInt(episodedetails.getNextEpisodeId()));
            intent.putExtra("catalogId", Integer.parseInt(mVideoDetails.getParentId()));
            return createNotificationButtonIntent(intent);
        } else
        {
            return null;
        }
    }

    public PendingIntent getResumeIntent()
    {
        return createNotificationButtonIntent(new Intent("com.netflix.mediaclient.intent.action.MDX_RESUME"));
    }

    public IMdxSharedState getSharedState()
    {
        if (StringUtils.isNotEmpty(mCurrentTargetUuid))
        {
            return mNotifier.getSharedState(mCurrentTargetUuid);
        } else
        {
            return null;
        }
    }

    public PendingIntent getSkipbackIntent(int i)
    {
        return createNotificationButtonIntent((new Intent("com.netflix.mediaclient.intent.action.MDX_SKIP")).putExtra("time", i));
    }

    public PendingIntent getStopIntent()
    {
        return createNotificationButtonIntent(new Intent("com.netflix.mediaclient.intent.action.MDX_STOP"));
    }

    public Pair[] getTargetList()
    {
label0:
        {
            synchronized (mTargetMap)
            {
                if (!mTargetMap.isEmpty())
                {
                    break label0;
                }
            }
            return null;
        }
        Iterator iterator;
        obj = new Pair[mTargetMap.size()];
        iterator = mTargetMap.iterator();
        int i = 0;
_L2:
        RemoteDevice remotedevice;
        String s;
        String s1;
        String s2;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_285;
        }
        remotedevice = (RemoteDevice)iterator.next();
        s = remotedevice.uuid;
        s1 = remotedevice.dialUuid;
        s2 = remotedevice.friendlyName;
        if (!StringUtils.isNotEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_167;
        }
        int j = i + 1;
        obj[i] = Pair.create(s1, s2);
        i = j;
        if (!Log.isLoggable("nf_mdx_agent", 3)) goto _L2; else goto _L1
_L1:
        Log.d("nf_mdx_agent", (new StringBuilder()).append("MdxAgent: getTargetList : ").append(s1).append(" : ").append(s2).toString());
        i = j;
          goto _L2
        if (!StringUtils.isNotEmpty(s))
        {
            break MISSING_BLOCK_LABEL_255;
        }
        j = i + 1;
        obj[i] = Pair.create(s, s2);
        i = j;
        if (!Log.isLoggable("nf_mdx_agent", 3)) goto _L2; else goto _L3
_L3:
        Log.d("nf_mdx_agent", (new StringBuilder()).append("MdxAgent: getTargetList : ").append(s).append(" : ").append(s2).toString());
        i = j;
          goto _L2
        obj;
        arraylist;
        JVM INSTR monitorexit ;
        throw obj;
        Log.e("nf_mdx_agent", (new StringBuilder()).append("MdxAgent: uuid and dialUuid are invalid ").append(remotedevice).toString());
          goto _L2
        if (Log.isLoggable("nf_mdx_agent", 3))
        {
            Log.d("nf_mdx_agent", (new StringBuilder()).append("MdxAgent: getTargetList has ").append(i).append(" targets").toString());
        }
        arraylist;
        JVM INSTR monitorexit ;
        return ((Pair []) (obj));
    }

    public VideoDetails getVideoDetail()
    {
        return mVideoDetails;
    }

    public com.netflix.mediaclient.util.WebApiUtils.VideoIds getVideoIds()
    {
        return mVideoIds;
    }

    public boolean handleCommand(Intent intent)
    {
        if (StringUtils.isNotEmpty(mCurrentTargetUuid) && !mTargetManager.isTargetHaveContext(mCurrentTargetUuid))
        {
            mTargetManager.targetSelected(getDeviceFromUuid(mCurrentTargetUuid));
        }
        if (intent.hasCategory("com.netflix.mediaclient.intent.category.MDX") && "com.netflix.mediaclient.intent.action.MDX_PLAY_VIDEOIDS".equals(intent.getAction()))
        {
            String s = intent.getStringExtra("uuid");
            if (StringUtils.isEmpty(s) || !s.equals(mCurrentTargetUuid))
            {
                Log.e("nf_mdx_agent", (new StringBuilder()).append("MdxAgent: MDX_PLAY_VIDEOIDS is for uuid: ").append(s).append("vs. ").append(mCurrentTargetUuid).toString());
                return true;
            }
            int k = intent.getIntExtra("catalogId", -1);
            int l = intent.getIntExtra("episodeId", -1);
            int j = intent.getIntExtra("trackId", -1);
            int i = j;
            if (j == -1)
            {
                Log.w("nf_mdx_agent", "MdxAgent: MDX_PLAY_VIDEOIDS has invalid trackId");
                i = 0xd2a38f;
            }
            j = intent.getIntExtra("time", -1);
            mTrackId = i;
            mStartTime = j;
            boolean flag = true;
            if (l == -1)
            {
                flag = false;
            }
            if (Log.isLoggable("nf_mdx_agent", 3))
            {
                Log.d("nf_mdx_agent", (new StringBuilder()).append("MdxAgent: PLAYER_PLAY existing: ").append(mVideoIds.episode).append(",catalogId: ").append(mVideoIds.catalogId).append(",episodeId:").append(mVideoIds.episodeId).toString());
                Log.d("nf_mdx_agent", (new StringBuilder()).append("MdxAgent: PLAYER_PLAY request: ").append(flag).append(",catalogId: ").append(k).append(",episodeId:").append(l).toString());
            }
            if (mVideoIds.episode != flag || mVideoIds.catalogId != k || flag && mVideoIds.episodeId != l)
            {
                mNotifier.commandPlayReceived(mCurrentTargetUuid);
                mVideoIds.episode = flag;
                mVideoIds.catalogId = k;
                mVideoIds.episodeId = l;
                if (mBifManager != null)
                {
                    mBifManager.release();
                    mBifManager = null;
                }
                fetchVideoDetail(true, "com.netflix.mediaclient.intent.action.MDXUPDATE_POSTPLAY".equals(intent.getAction()));
                return true;
            } else
            {
                Log.d("nf_mdx_agent", "MdxAgent: videoIds are same, start play");
                mTargetManager.playerPlay(mCurrentTargetUuid, mVideoIds.catalogIdUrl, mTrackId, mVideoIds.episodeIdUrl, mStartTime);
                mNotifier.movieMetaDataAvailable(mCurrentTargetUuid);
                logPlaystart(false);
                return true;
            }
        }
        if ("com.netflix.mediaclient.intent.action.MDX_SELECT_TARGET".equals(intent.getAction()))
        {
            intent = intent.getStringExtra("uuid");
            Log.d("nf_mdx_agent", (new StringBuilder()).append("MdxAgent: select target ").append(intent).toString());
            setCurrentTarget(intent);
            return true;
        }
        if (intent.hasCategory("com.netflix.mediaclient.intent.category.MDXRCC"))
        {
            Log.d("nf_mdx_agent", "MdxAgent: get nf_mdx_RemoteControlClient intent");
            intent.putExtra("uuid", mCurrentTargetUuid);
            if ("com.netflix.mediaclient.intent.action.MDX_TOGGLE_PAUSE".equals(intent.getAction()))
            {
                Log.d("nf_mdx_agent", "MdxAgent: get nf_mdx_RemoteControlClient intent toggle pause");
                if (mRemoteControlClientManager != null)
                {
                    if (mRemoteControlClientManager.isPaused())
                    {
                        intent.setAction("com.netflix.mediaclient.intent.action.MDX_RESUME");
                    } else
                    {
                        intent.setAction("com.netflix.mediaclient.intent.action.MDX_PAUSE");
                    }
                }
            }
        }
        mCommandHandler.handleCommandIntent(intent);
        return true;
    }

    public boolean hasActiveSession()
    {
        if (mTargetManager != null)
        {
            return mTargetManager.hasActiveSession();
        } else
        {
            return false;
        }
    }

    public boolean isBifReady()
    {
        if (mBifManager != null)
        {
            return mBifManager.isBifReady();
        } else
        {
            return false;
        }
    }

    public boolean isPaused()
    {
        if (mRemoteControlClientManager != null)
        {
            return mRemoteControlClientManager.isPaused();
        } else
        {
            return false;
        }
    }

    public boolean isReady()
    {
        return mReady.get();
    }

    void logPlaystart(boolean flag)
    {
        String s = null;
        if (flag)
        {
            s = "local_playback_transfer";
        }
        getService().getClientLogging().getCustomerEventLogging().logMdxPlaybackStart(mVideoIds.catalogIdUrl, mVideoIds.episodeIdUrl, s, mTrackId);
    }

    public void notifyIsUserLogin(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = mUserIsLogin;
        if (flag1 != flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        mUserIsLogin = flag;
        if (!mUserIsLogin)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        handleAccountConfig();
        mReady.set(false);
        addStateEventListener();
        addDiscoveryEventListener();
        addPairingEventListener(mTargetManager);
        addSessionEventListener(mTargetManager);
        mMdxController.init(new HashMap(), mDisableWebSocket, getService().getConfiguration().getMdxBlackListTargets());
        mTargetMap.clear();
          goto _L1
        Exception exception;
        exception;
        throw exception;
        if (mCastManager != null)
        {
            mCastManager.stop();
        }
        mReady.set(false);
        mMdxController.exit();
        removeStateEventListener();
        removeDiscoveryEventListener();
        removePairingEventListener(mTargetManager);
        removeSessionEventListener(mTargetManager);
        clearVideoDetails();
        sessionGone();
        mTargetMap.clear();
          goto _L1
    }

    public void onBitmapReady(Bitmap bitmap)
    {
        mBoxartBitmap = bitmap;
        if (mRemoteControlClientManager != null)
        {
            mRemoteControlClientManager.setBoxart(mBoxartBitmap);
        }
        if (mMdxNotificationManager != null)
        {
            mMdxNotificationManager.setBoxartNotify(mBoxartBitmap);
        }
    }

    public long onGetTimeOfMostRecentIncomingMessage()
    {
        if (mTargetManager != null)
        {
            return mTargetManager.getTimeOfMostRecentIncomingMessage();
        } else
        {
            return 0L;
        }
    }

    public void onIsReady(boolean flag)
    {
        if (Log.isLoggable("nf_mdx_agent", 3))
        {
            Log.d("nf_mdx_agent", (new StringBuilder()).append("MdxAgent: onIsReady ").append(flag).toString());
        }
    }

    public void onRemoteDeviceMap(ArrayList arraylist)
    {
        if (Log.isLoggable("nf_mdx_agent", 3))
        {
            Log.d("nf_mdx_agent", (new StringBuilder()).append("MdxAgent: onRemoteDeviceMap ").append(arraylist).toString());
        }
        synchronized (mTargetMap)
        {
            mTargetMap.clear();
            mTargetMap.addAll(arraylist);
            reconcileSelectedTargetInfo();
        }
        if (mNotifier != null)
        {
            mNotifier.targetList();
        }
        return;
        arraylist;
        arraylist1;
        JVM INSTR monitorexit ;
        throw arraylist;
    }

    public void onSessionWatchDogExpired()
    {
        if (mNotifier != null)
        {
            mNotifier.playbackEnd(mCurrentTargetUuid, null);
        }
    }

    public void onSetToNewTarget(String s)
    {
        setCurrentTarget(s);
    }

    public void onStickinessExpired()
    {
        setCurrentTarget(new String());
        if (mNotifier != null)
        {
            mNotifier.targetList();
        }
    }

    public void onTargetSelectorLoaded(String s, String s1, String s2, String s3)
    {
        mCurrentTargetUuid = s;
        mTaregtUuid = s1;
        mTargetDialUuid = s2;
        mTargetFriendlyName = s3;
        if (mCastManager != null && StringUtils.isNotEmpty(mCurrentTargetUuid))
        {
            mCastManager.setTargetId(mCurrentTargetUuid);
        }
    }

    void registerUserAgentReceiver()
    {
        LocalBroadcastManager.getInstance(getContext()).registerReceiver(mUserAgentReceiver, UserAgentBroadcastIntents.getNotificationIntentFilter());
    }

    public void setCurrentTarget(String s)
    {
        if (StringUtils.isEmpty(s))
        {
            sessionGone();
            mCurrentTargetUuid = new String();
            mTaregtUuid = new String();
            mTargetDialUuid = new String();
            mTargetFriendlyName = new String();
            clearVideoDetails();
            getService().getClientLogging().getCustomerEventLogging().logMdxTargetSelection("local playback");
            if (mTargetSelector != null)
            {
                mTargetSelector.selectNewTarget(mCurrentTargetUuid, mTaregtUuid, mTargetDialUuid, mTargetFriendlyName);
            }
        } else
        if (!s.equals(mCurrentTargetUuid))
        {
            clearVideoDetails();
            mCurrentTargetUuid = s;
            s = getDeviceFromUuid(mCurrentTargetUuid);
            if (s == null)
            {
                Log.e("nf_mdx_agent", (new StringBuilder()).append("MdxAgent: no such device for ").append(mCurrentTargetUuid).toString());
                mCurrentTargetUuid = new String();
                mTaregtUuid = new String();
                mTargetDialUuid = new String();
                mTargetFriendlyName = new String();
            } else
            {
                mTargetManager.targetSelected(s);
                getService().getClientLogging().getCustomerEventLogging().logMdxTargetSelection("target playback");
                mTaregtUuid = ((RemoteDevice) (s)).uuid;
                mTargetDialUuid = ((RemoteDevice) (s)).dialUuid;
                mTargetFriendlyName = ((RemoteDevice) (s)).friendlyName;
            }
            if (mTargetSelector != null)
            {
                mTargetSelector.selectNewTarget(mCurrentTargetUuid, mTaregtUuid, mTargetDialUuid, mTargetFriendlyName);
                return;
            }
        }
    }

    public boolean setDialUuidAsCurrentTarget(String s)
    {
        if (StringUtils.isNotEmpty(s))
        {
            if (s.equals(mCurrentTargetUuid))
            {
                return true;
            }
            if (getDeviceFromUuid(s) != null)
            {
                setCurrentTarget(s);
                return true;
            }
        }
        return false;
    }

    public void switchPlaybackFromTarget(String s, int i)
    {
        if (Log.isLoggable("nf_mdx_agent", 3))
        {
            Log.d("nf_mdx_agent", (new StringBuilder()).append("switchPlaybackFromTarget to ").append(s).append(", @").append(i).toString());
        }
        if (mSwitchTarget != null)
        {
            mSwitchTarget.startSwitch(mCurrentTargetUuid, s, mVideoIds, i, mTrackId);
        }
        if (StringUtils.isEmpty(s))
        {
            getService().getClientLogging().getCustomerEventLogging().logMdxTargetSelection("local playback");
            return;
        } else
        {
            getService().getClientLogging().getCustomerEventLogging().logMdxTargetSelection("target playback");
            return;
        }
    }

    void unregisterUserAgentReceiver()
    {
        try
        {
            LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(mUserAgentReceiver);
            return;
        }
        catch (Exception exception)
        {
            Log.i("nf_mdx_agent", (new StringBuilder()).append("unregisterUserAgenReceiver ").append(exception).toString());
        }
    }



/*
    static TargetSelector access$002(MdxAgent mdxagent, TargetSelector targetselector)
    {
        mdxagent.mTargetSelector = targetselector;
        return targetselector;
    }

*/









/*
    static MdxNotificationManager access$1502(MdxAgent mdxagent, MdxNotificationManager mdxnotificationmanager)
    {
        mdxagent.mMdxNotificationManager = mdxnotificationmanager;
        return mdxnotificationmanager;
    }

*/



/*
    static VideoDetails access$1602(MdxAgent mdxagent, VideoDetails videodetails)
    {
        mdxagent.mVideoDetails = videodetails;
        return videodetails;
    }

*/





/*
    static Bitmap access$1902(MdxAgent mdxagent, Bitmap bitmap)
    {
        mdxagent.mBoxartBitmap = bitmap;
        return bitmap;
    }

*/








/*
    static com.netflix.mediaclient.util.WebApiUtils.VideoIds access$2402(MdxAgent mdxagent, com.netflix.mediaclient.util.WebApiUtils.VideoIds videoids)
    {
        mdxagent.mVideoIds = videoids;
        return videoids;
    }

*/
















}
