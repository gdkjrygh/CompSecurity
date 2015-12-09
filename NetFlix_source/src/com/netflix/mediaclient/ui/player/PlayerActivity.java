// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.android.widget.AlertDialogFactory;
import com.netflix.mediaclient.android.widget.NetflixSeekBar;
import com.netflix.mediaclient.android.widget.TappableSurfaceView;
import com.netflix.mediaclient.event.nrdp.media.Error;
import com.netflix.mediaclient.event.nrdp.media.NccpActionId;
import com.netflix.mediaclient.event.nrdp.media.NccpError;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.JPlayer.SecondSurface;
import com.netflix.mediaclient.media.Language;
import com.netflix.mediaclient.media.PlayerType;
import com.netflix.mediaclient.media.PlayoutMetadata;
import com.netflix.mediaclient.media.Subtitle;
import com.netflix.mediaclient.net.LogMobileType;
import com.netflix.mediaclient.service.configuration.PlayerTypeFactory;
import com.netflix.mediaclient.service.configuration.SubtitleConfiguration;
import com.netflix.mediaclient.service.logging.client.model.ActionOnUIError;
import com.netflix.mediaclient.service.logging.client.model.DataContext;
import com.netflix.mediaclient.service.logging.client.model.RootCause;
import com.netflix.mediaclient.service.logging.client.model.UIError;
import com.netflix.mediaclient.service.player.subtitles.SubtitleScreen;
import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.servicemgr.IMdx;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.MovieDetails;
import com.netflix.mediaclient.servicemgr.Playable;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.ShowDetails;
import com.netflix.mediaclient.servicemgr.SimpleManagerCallback;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import com.netflix.mediaclient.servicemgr.VideoType;
import com.netflix.mediaclient.ui.Asset;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import com.netflix.mediaclient.ui.common.Social;
import com.netflix.mediaclient.ui.details.EpisodeListFrag;
import com.netflix.mediaclient.ui.kids.player.KidsPlayerActivity;
import com.netflix.mediaclient.ui.mdx.MdxTargetSelection;
import com.netflix.mediaclient.ui.pin.PinDialogVault;
import com.netflix.mediaclient.ui.pin.PinVerifier;
import com.netflix.mediaclient.util.AndroidManifestUtils;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.LanguageChoice;
import com.netflix.mediaclient.util.LogUtils;
import com.netflix.mediaclient.util.PreferenceUtils;
import com.netflix.mediaclient.util.ThreadUtils;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PlayerWorkflowState, PlayScreen, PlayerUiState, TopPanel, 
//            ResourceHelper, SubtitleManager, ErrorManager, BottomPanel, 
//            EnhancedSubtitleManager, SimpleSubtitleManager, PostPlay, LocalizationManager, 
//            SubtitleManagerFactory

public class PlayerActivity extends NetflixActivity
    implements android.media.AudioManager.OnAudioFocusChangeListener, com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener, com.netflix.mediaclient.media.JPlayer.JPlayer.JplayerListener, com.netflix.mediaclient.android.fragment.NetflixDialogFrag.DialogCanceledListenerProvider
{
    private class FetchVideoDetailsForPlaybackCallback extends LoggingManagerCallback
    {

        private final PlayContext playContext;
        final PlayerActivity this$0;

        private void handleResponse(VideoDetails videodetails, int i)
        {
            boolean flag = false;
            mIsAssetReady = false;
            PlayerActivity playeractivity = PlayerActivity.this;
            if (playeractivity.destroyed())
            {
                return;
            }
            if (i != 0 || videodetails == null)
            {
                Log.w("PlayerActivity", "Error loading video details for video playback");
                Toast.makeText(playeractivity, 0x7f0c00fe, 1).show();
                return;
            }
            playeractivity = PlayerActivity.this;
            PlayContext playcontext = playContext;
            if (!PlayerActivity.PIN_VERIFIED.booleanValue())
            {
                flag = true;
            }
            playeractivity.mAsset = Asset.create(videodetails, playcontext, flag);
            mIsAssetReady = true;
            completeInitIfReady();
            Log.d("PlayerActivity", "Bilboard playback");
            mScreen.getPostPlay().init(mAsset.getPlayableId());
            Log.d("PlayerActivity", "Bilboard playback, check episode visibility");
            mScreen.getTopPanel().setEpisodeSelectorVisibility(mAsset.isEpisode());
        }

        public void onMovieDetailsFetched(MovieDetails moviedetails, int i)
        {
            super.onMovieDetailsFetched(moviedetails, i);
            handleResponse(moviedetails, i);
        }

        public void onShowDetailsFetched(ShowDetails showdetails, int i)
        {
            super.onShowDetailsFetched(showdetails, i);
            handleResponse(showdetails, i);
        }

        public FetchVideoDetailsForPlaybackCallback(PlayContext playcontext)
        {
            this$0 = PlayerActivity.this;
            super("PlayerActivity");
            playContext = playcontext;
        }
    }

    protected static final class PlayerActivityState extends Enum
    {

        private static final PlayerActivityState $VALUES[];
        public static final PlayerActivityState ACTIVITY_NOTREADY;
        public static final PlayerActivityState ACTIVITY_PLAYER_READY;
        public static final PlayerActivityState ACTIVITY_SRVCMNGR_READY;
        int mActivityState;
        String mName;

        public static PlayerActivityState valueOf(String s)
        {
            return (PlayerActivityState)Enum.valueOf(com/netflix/mediaclient/ui/player/PlayerActivity$PlayerActivityState, s);
        }

        public static PlayerActivityState[] values()
        {
            return (PlayerActivityState[])$VALUES.clone();
        }

        protected String getName()
        {
            return mName;
        }

        protected int getState()
        {
            return mActivityState;
        }

        static 
        {
            ACTIVITY_NOTREADY = new PlayerActivityState("ACTIVITY_NOTREADY", 0, 0, "NOTREADY");
            ACTIVITY_SRVCMNGR_READY = new PlayerActivityState("ACTIVITY_SRVCMNGR_READY", 1, 1, "SRVCMNGR_READY");
            ACTIVITY_PLAYER_READY = new PlayerActivityState("ACTIVITY_PLAYER_READY", 2, 2, "PLAYER_READY");
            $VALUES = (new PlayerActivityState[] {
                ACTIVITY_NOTREADY, ACTIVITY_SRVCMNGR_READY, ACTIVITY_PLAYER_READY
            });
        }

        private PlayerActivityState(String s, int i, int j, String s1)
        {
            super(s, i);
            mActivityState = j;
            mName = s1;
        }
    }


    private static final int DELAY_POST = 1000;
    static final String EXTRA_GET_DETAILS_HAS_NEXT_EPISODE = "extra_get_details_has_next_episode";
    static final String EXTRA_GET_DETAILS_PLAY_CONTEXT = "extra_get_details_play_context";
    static final String EXTRA_GET_DETAILS_VIDEO_ID = "extra_get_details_video_id";
    static final String EXTRA_GET_DETAILS_VIDEO_TYPE = "extra_get_details_video_type";
    public static final int INACTIVITY_TIMEOUT = 5000;
    private static final int INVALID_TRACK_INDEX = -1;
    private static final int PAUSE_LOCK_SCREEN_TIMEOUT = 0x1d4c0;
    private static final long PAUSE_TIMEOUT = 0x36ee80L;
    public static final Boolean PIN_VERIFIED = Boolean.valueOf(true);
    private static final int SKIP_DELTA_MS = 30000;
    private static final String TAG = "PlayerActivity";
    public static final String TRACK_ID_PREFIX_TAG = "TRACK_ID: ";
    private static final int VOLUME_TIMEOUT = 500;
    private final Runnable allowScreenLockTimeout = new Runnable() {

        final PlayerActivity this$0;

        public void run()
        {
            Log.d("PlayerActivity", "Pause, release awake clock");
            releaseLockOnScreen();
        }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
    };
    private final android.widget.SeekBar.OnSeekBarChangeListener audioPositionListener = new android.widget.SeekBar.OnSeekBarChangeListener() {

        final PlayerActivity this$0;

        public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
        {
label0:
            {
                if (flag && mState.draggingAudioInProgress && mScreen != null)
                {
                    seekbar = (AudioManager)getSystemService("audio");
                    if (seekbar == null)
                    {
                        break label0;
                    }
                    seekbar.setStreamVolume(3, i, 0);
                }
                return;
            }
            Log.e("PlayerActivity", "Audio manager is not available, can not change volume");
        }

        public void onStartTrackingTouch(SeekBar seekbar)
        {
            mState.draggingAudioInProgress = true;
            Log.d("PlayerActivity", "Start volume change, get awake clock");
            keepScreenOn();
            stopScreenUpdateTask();
        }

        public void onStopTrackingTouch(SeekBar seekbar)
        {
            Log.d("PlayerActivity", "volume::onStopTrackingTouch called");
            mState.draggingAudioInProgress = false;
            mState.audioSeekToInProgress = false;
            startScreenUpdateTask();
        }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
    };
    private final android.view.View.OnClickListener episodesListener = new android.view.View.OnClickListener() {

        final PlayerActivity this$0;

        public void onClick(View view)
        {
            if (destroyed())
            {
                return;
            }
            if (mAsset == null)
            {
                Log.e("PlayerActivity", "mPlayable is null!");
                return;
            }
            if (!mAsset.isEpisode())
            {
                Log.e("PlayerActivity", "mPlayable is not episode detail!");
                return;
            } else
            {
                Log.d("PlayerActivity", "Start episodes dialog");
                stopScreenUpdateTask();
                view = EpisodeListFrag.create(mAsset.getParentId(), mAsset.getPlayableId(), false);
                view.onManagerReady(getServiceManager(), 0);
                view.setCancelable(true);
                showDialog(view);
                return;
            }
        }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
    };
    private ErrorManager errorManager;
    Runnable exitButtonHandler;
    private Language language;
    private int mActionId12Count;
    private Asset mAsset;
    private com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface mConfig;
    private com.netflix.mediaclient.android.fragment.NetflixDialogFrag.DialogCanceledListener mDialogCancedledListener;
    private com.netflix.mediaclient.ui.details.EpisodeRowView.EpisodeRowListener mEpisodeRowListener;
    private String mErrorDialogId;
    protected Handler mHandler;
    private int mHeight;
    private boolean mIsAssetReady;
    private boolean mIsListening;
    private boolean mIsSurfaceReady;
    private boolean mIsZoomedOut;
    private final boolean mKillOnDestroy = false;
    private String mMaxStreamsReachedDialogId;
    private final BroadcastReceiver mNetworkChangeReceiver = new BroadcastReceiver() {

        final PlayerActivity this$0;

        public void onReceive(Context context, Intent intent)
        {
            handleConnectivityCheck();
        }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
    };
    private IPlayer mPlayer;
    private boolean mReloadOnAudioTrackChange;
    private ResourceHelper mResources;
    private boolean mRestartPlayback;
    private PlayScreen mScreen;
    private final com.netflix.mediaclient.ui.common.Social.SocialProviderCallback mSocialProviderCallback = new com.netflix.mediaclient.ui.common.Social.SocialProviderCallback() {

        final PlayerActivity this$0;

        public void doNotShare()
        {
            ServiceManager servicemanager = getServiceManager();
            if (servicemanager == null || !servicemanager.isReady())
            {
                Log.e("PlayerActivity", "Service manager is NOT ready. This should NOT happen!");
            } else
            if (!destroyed())
            {
                mScreen.getTopPanel().getSocial().changeActionState(false);
                servicemanager.hideVideo(mAsset.getPlayableId(), new SimpleManagerCallback() {

                    final _cls19 this$1;

                    public void onVideoHide(int i)
                    {
                        if (Log.isLoggable("PlayerActivity", 3))
                        {
                            Log.d("PlayerActivity", (new StringBuilder()).append("Video is hidden status code ").append(i).toString());
                        }
                    }

            
            {
                this$1 = _cls19.this;
                super();
            }
                });
                return;
            }
        }

        public void extendTimeoutTimer()
        {
            PlayerActivity.this.extendTimeoutTimer();
        }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
    };
    private final PlayerWorkflowState mState = new PlayerWorkflowState();
    private SubtitleManager mSubtitleManager;
    private SecondSurface mSurface2;
    private int mWidth;
    private final Runnable onEverySecond = new Runnable() {

        final PlayerActivity this$0;

        public void run()
        {
            if (destroyed() || mState.draggingInProgress || mState.draggingAudioInProgress)
            {
                Log.d("PlayerActivity", "METADATA exit");
                return;
            }
            synchronized (PlayerActivity.this)
            {
                if (mScreen != null && !mState.draggingInProgress && !mState.draggingAudioInProgress)
                {
                    if (mState.getLastActionTime() > 0L && SystemClock.elapsedRealtime() - mState.getLastActionTime() > 5000L && mScreen.getState() != PlayerUiState.PostPlay)
                    {
                        Log.d("PlayerActivity", "Time to remove panel");
                        clearPanel();
                    }
                    setProgress();
                    updateMetadata();
                }
                repostOnEverySecondRunnable(1000);
            }
            return;
            exception;
            playeractivity;
            JVM INSTR monitorexit ;
            throw exception;
        }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
    };
    private final Runnable pauseTimeout = new Runnable() {

        final PlayerActivity this$0;

        public void run()
        {
            Log.d("PlayerActivity", "pause has timed out, exit playback");
            cleanupAndExit();
        }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
    };
    private final android.view.View.OnClickListener playPauseListener = new android.view.View.OnClickListener() {

        final PlayerActivity this$0;

        public void onClick(View view)
        {
            mState.setLastActionTime(SystemClock.elapsedRealtime());
            mState.userInteraction();
            if (mPlayer.isPlaying())
            {
                doPause(true);
                return;
            } else
            {
                doUnpause();
                return;
            }
        }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
    };
    private final android.view.View.OnClickListener skipBackListener = new android.view.View.OnClickListener() {

        final PlayerActivity this$0;

        public void onClick(View view)
        {
            skipBack();
        }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
    };
    private final android.view.SurfaceHolder.Callback surfaceListener = new android.view.SurfaceHolder.Callback() {

        final PlayerActivity this$0;

        public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
        {
            if (Log.isLoggable("PlayerActivity", 3))
            {
                Log.d("PlayerActivity", (new StringBuilder()).append("Surface changed, format: ").append(i).append(", width: ").append(j).append(", height: ").append(k).toString());
                if (surfaceholder != null && surfaceholder.getSurface() != null)
                {
                    Log.d("PlayerActivity", (new StringBuilder()).append("Holder: ").append(surfaceholder).toString());
                    Log.d("PlayerActivity", (new StringBuilder()).append("Native surface: ").append(surfaceholder.getSurface()).toString());
                }
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceholder)
        {
            this;
            JVM INSTR monitorenter ;
            Log.d("PlayerActivity", "Surface created");
            if (surfaceholder == null) goto _L2; else goto _L1
_L1:
            if (surfaceholder.getSurface() == null || mScreen == null) goto _L2; else goto _L3
_L3:
            mIsSurfaceReady = true;
            mScreen.getSurfaceView().setVisibility(0);
            if (Log.isLoggable("PlayerActivity", 3))
            {
                Log.d("PlayerActivity", (new StringBuilder()).append("Native surface: ").append(surfaceholder.getSurface()).toString());
            }
            completeInitIfReady();
_L5:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            mIsSurfaceReady = false;
            if (mAsset == null)
            {
                Log.e("PlayerActivity", "surfaceCreated again, playout already set to null");
            }
            Log.d("PlayerActivity", "SurfaceCreated again, no playback");
            if (true) goto _L5; else goto _L4
_L4:
            surfaceholder;
            throw surfaceholder;
        }

        public void surfaceDestroyed(SurfaceHolder surfaceholder)
        {
            Log.d("PlayerActivity", "Surface destroyed, exit if we are not already in it");
            mIsSurfaceReady = false;
            if (!mScreen.canExitPlaybackEndOfPlay())
            {
                Log.d("PlayerActivity", "In posplay when surface is destroyed, do not exit");
                return;
            } else
            {
                cleanupAndExit();
                return;
            }
        }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
    };
    private final com.netflix.mediaclient.android.widget.TappableSurfaceView.SurfaceMeasureListener surfaceMeasureListener = new com.netflix.mediaclient.android.widget.TappableSurfaceView.SurfaceMeasureListener() {

        final PlayerActivity this$0;

        public void onSurfaceMeasureChange(int i, int j)
        {
            SecondSurface secondsurface = mSurface2;
            if (secondsurface != null)
            {
                secondsurface.setSurfaceSize(i, j);
            }
        }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
    };
    private final com.netflix.mediaclient.android.widget.TappableSurfaceView.TapListener tapListener = new com.netflix.mediaclient.android.widget.TappableSurfaceView.TapListener() {

        final PlayerActivity this$0;

        public void onTap(MotionEvent motionevent)
        {
            Log.d("PlayerActivity", "PA tap");
            if (mState.seekToInProgress || mState.audioSeekToInProgress)
            {
                Log.d("PlayerActivity", "Seekto in progress, ignore");
                return;
            }
            if (mScreen.inInterruptedOrPendingInterrupted())
            {
                Log.d("PlayerActivity", "In interrupted state, ignore");
                return;
            }
            boolean flag;
            if (motionevent != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mState.setLastActionTime(SystemClock.elapsedRealtime());
            if (!mScreen.inPostPlayOrPendingPostplay())
            {
                mState.userInteraction();
            }
            showControlScreenOverlay(flag);
        }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
    };
    private final android.widget.SeekBar.OnSeekBarChangeListener videoPositionListener = new android.widget.SeekBar.OnSeekBarChangeListener() ;
    private final android.view.View.OnClickListener zoomListener = new android.view.View.OnClickListener() {

        final PlayerActivity this$0;

        public void onClick(View view)
        {
            mState.setLastActionTime(SystemClock.elapsedRealtime());
            mState.userInteraction();
            boolean flag;
            if (mIsZoomedOut)
            {
                doZoomIn();
            } else
            {
                doZoomOut();
            }
            view = PlayerActivity.this;
            if (!mIsZoomedOut)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.mIsZoomedOut = flag;
        }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
    };

    public PlayerActivity()
    {
        mWidth = 0;
        mHeight = 0;
        mHandler = new Handler();
        mReloadOnAudioTrackChange = false;
        mIsZoomedOut = false;
        mActionId12Count = 0;
        mRestartPlayback = false;
        exitButtonHandler = new Runnable() {

            final PlayerActivity this$0;

            public void run()
            {
                Log.d("PlayerActivity", "Playback canceled when not longer on WiFi");
                cleanupAndExit();
            }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
        };
        mEpisodeRowListener = new com.netflix.mediaclient.ui.details.EpisodeRowView.EpisodeRowListener() {

            final PlayerActivity this$0;

            public void onEpisodeSelectedForPlayback(EpisodeDetails episodedetails, PlayContext playcontext)
            {
                if (destroyed())
                {
                    return;
                }
                if (Log.isLoggable("PlayerActivity", 3))
                {
                    Log.d("PlayerActivity", (new StringBuilder()).append("Start playback from episode selector ").append(episodedetails).toString());
                }
                if (mAsset != null && mAsset.getPlayableId() != null && mAsset.getPlayableId().equals(episodedetails.getPlayableId()))
                {
                    Log.d("PlayerActivity", "Request to play same episode, do nothing");
                    startScreenUpdateTask();
                    if (isDialogFragmentVisible())
                    {
                        removeDialogFrag();
                    }
                    doUnpause();
                    return;
                } else
                {
                    cleanupAndExit();
                    PlaybackLauncher.startPlaybackAfterPIN(PlayerActivity.this, episodedetails, playcontext);
                    return;
                }
            }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
        };
        mDialogCancedledListener = new com.netflix.mediaclient.android.fragment.NetflixDialogFrag.DialogCanceledListener() {

            final PlayerActivity this$0;

            public void onDialogCanceled(NetflixDialogFrag netflixdialogfrag)
            {
                if ((netflixdialogfrag instanceof EpisodeListFrag) && !destroyed())
                {
                    mState.setLastActionTime(SystemClock.elapsedRealtime());
                    mState.userInteraction();
                    Log.d("PlayerActivity", "Episode selector was dismissed");
                    if (mPlayer.isPlaying())
                    {
                        doPause(true);
                    } else
                    {
                        doUnpause();
                    }
                    startScreenUpdateTask();
                }
            }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
        };
    }

    private void adjustVolume(boolean flag)
    {
label0:
        {
            PlayScreen playscreen;
            AudioManager audiomanager;
label1:
            {
                playscreen = mScreen;
                if (playscreen == null)
                {
                    break label0;
                }
                audiomanager = (AudioManager)getSystemService("audio");
                if (audiomanager != null)
                {
                    if (!flag || audiomanager.getStreamVolume(3) > 0)
                    {
                        break label1;
                    }
                    Log.d("PlayerActivity", "adjustVolume at lowest");
                }
                return;
            }
            byte byte0;
            if (flag)
            {
                byte0 = -1;
            } else
            {
                byte0 = 1;
            }
            audiomanager.adjustStreamVolume(3, byte0, 0);
            playscreen.setAudioProgress(audiomanager.getStreamVolume(3));
            return;
        }
        Log.w("PlayerActivity", "Unable to adjust volume, leave it to default");
    }

    private void clearPanel()
    {
        if (mScreen.getState() == PlayerUiState.PostPlay)
        {
            Log.d("PlayerActivity", "When in post play do NOT clear panel.");
            return;
        } else
        {
            mState.setLastActionTime(0L);
            mScreen.clearPanel();
            return;
        }
    }

    private void completeInitIfReady()
    {
        if (!mIsSurfaceReady)
        {
            Log.d("PlayerActivity", "Surface not ready - cannot complete init");
            return;
        }
        if (!mIsAssetReady)
        {
            Log.d("PlayerActivity", "Asset not ready - cannot complete init");
            return;
        }
        if (mAsset == null)
        {
            Log.d("PlayerActivity", "Asset is null - cannot complete init");
            return;
        } else
        {
            verifyPinAndContinue(this, mAsset.isPinVerified(), mAsset.isPinProtected());
            return;
        }
    }

    private void continueInitAfterPinVerify()
    {
        Log.v("PlayerActivity", "Completing init process...");
        mScreen.setTitles(mAsset.getTitle(), getParentTitleForScreen(mAsset.getParentTitle()));
        Social social = mScreen.getTopPanel().getSocial();
        boolean flag;
        if (!mAsset.isSocialDoNotShareVisible())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        social.setSharingDisabled(flag);
        if (!mState.videoLoaded && loadVideo())
        {
            mState.activityState = PlayerActivityState.ACTIVITY_PLAYER_READY;
        }
    }

    private static Intent createIntent(NetflixActivity netflixactivity)
    {
        Object obj;
        if (netflixactivity.isForKids())
        {
            obj = com/netflix/mediaclient/ui/kids/player/KidsPlayerActivity;
        } else
        {
            obj = com/netflix/mediaclient/ui/player/PlayerActivity;
        }
        return new Intent(netflixactivity, ((Class) (obj)));
    }

    private PlayScreen.Listeners createListeners()
    {
        PlayScreen.Listeners listeners = new PlayScreen.Listeners();
        listeners.videoPositionListener = videoPositionListener;
        listeners.playPauseListener = playPauseListener;
        listeners.surfaceListener = surfaceListener;
        listeners.tapListener = tapListener;
        listeners.audioPositionListener = audioPositionListener;
        listeners.surfaceMeasureListener = surfaceMeasureListener;
        listeners.skipBackListener = skipBackListener;
        listeners.zoomListener = zoomListener;
        listeners.episodeSelectorListener = episodesListener;
        return listeners;
    }

    private void doPause(boolean flag)
    {
        if (mState.activityState != PlayerActivityState.ACTIVITY_PLAYER_READY)
        {
            Log.i("PlayerActivity", (new StringBuilder()).append("doPause: Invalid state, exit...:").append(mState.activityState.getName()).toString());
            cleanupAndExit();
        } else
        {
            if (isVolumeChangeInProgress())
            {
                Log.i("PlayerActivity", "doPause: volume up or down is pressed, do not pause...");
                return;
            }
            Log.i("PlayerActivity", "doPause: paused");
            if (flag || mPlayer.isBufferingCompleted() && mPlayer.isPlaying())
            {
                if (mScreen != null && mScreen.getMedia() != null)
                {
                    mScreen.getMedia().setImageResource(mResources.play);
                }
                mSubtitleManager.clearPendingUpdates();
                mPlayer.pause();
                Log.d("PlayerActivity", "Pause, release awake clock after 2 minutes.");
                mHandler.postDelayed(allowScreenLockTimeout, 0x1d4c0L);
                mHandler.postDelayed(pauseTimeout, 0x36ee80L);
                return;
            }
        }
    }

    private void doSeek(int i, boolean flag)
    {
        if (mState.activityState != PlayerActivityState.ACTIVITY_PLAYER_READY)
        {
            Log.i("PlayerActivity", (new StringBuilder()).append("doSeek: Invalid state, exit...:").append(mState.activityState.getName()).toString());
            cleanupAndExit();
        } else
        if (mScreen != null)
        {
            Log.w("PlayerActivity", "Playout seek...");
            if (mScreen != null)
            {
                mScreen.changeActionState(false, false);
            }
            mState.seekToInProgress = true;
            onSeek();
            if (Log.isLoggable("PlayerActivity", 3))
            {
                Log.d("PlayerActivity", (new StringBuilder()).append("==> seekTo: ").append(i).toString());
            }
            if (mScreen != null && mScreen.getMedia() != null)
            {
                mScreen.getMedia().setImageResource(mResources.pause);
            }
            mPlayer.seekTo(i, flag);
            mSubtitleManager.onSubtitleRemove();
            return;
        }
    }

    private int getDentDelta(int i)
    {
        return (i * 2) / 100;
    }

    public static void getDetailsAndPlayVideo(NetflixActivity netflixactivity, VideoDetails videodetails, PlayContext playcontext)
    {
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("Starting activity, will get details first for videoId: ").append(videodetails.getId()).toString());
        }
        Intent intent = createIntent(netflixactivity);
        intent.addFlags(0x20000);
        intent.putExtra("extra_get_details_video_id", videodetails.getId());
        intent.putExtra("extra_get_details_video_type", videodetails.getType().getValue());
        intent.putExtra("extra_get_details_play_context", playcontext);
        intent.putExtra("extra_get_details_has_next_episode", videodetails.isNextPlayableEpisode());
        netflixactivity.startActivity(intent);
    }

    private String getParentTitleForScreen(String s)
    {
        if (isTablet())
        {
            return s;
        } else
        {
            return null;
        }
    }

    private PostPlay getPostPlaySafely()
    {
        PlayScreen playscreen = mScreen;
        if (playscreen == null)
        {
            return null;
        } else
        {
            return playscreen.getPostPlay();
        }
    }

    private boolean handleControlButtonPress(int i, KeyEvent keyevent)
    {
        if (i != 96) goto _L2; else goto _L1
_L1:
        if (keyevent.getRepeatCount() <= 0) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        Log.v("PlayerActivity", "A button pressed");
        showControlScreenOverlay(false);
        playPauseListener.onClick(null);
        return true;
_L2:
        if (i != 21 && i != 102)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (mState.activityState != PlayerActivityState.ACTIVITY_PLAYER_READY) goto _L3; else goto _L5
_L5:
        showControlScreenOverlay(false);
        skipBack();
        return true;
        if (i != 22 && i != 103 || mState.activityState != PlayerActivityState.ACTIVITY_PLAYER_READY) goto _L3; else goto _L6
_L6:
        showControlScreenOverlay(false);
        skipForward();
        return true;
    }

    private void initSurfaceFixedSize(int i, int j)
    {
        if (mScreen.getHolder() == null)
        {
            return;
        } else
        {
            mScreen.getHolder().setFixedSize(i, j);
            return;
        }
    }

    private boolean isSeekInSnapZone(int i, SeekBar seekbar, int j)
    {
        j = getDentDelta(j);
        int k = mState.timelineStartSeekPosition;
        return i >= k - j && i <= k + j;
    }

    private boolean isVolumeChangeInProgress()
    {
        return System.currentTimeMillis() - mState.volumeChangeInProgress < 500L;
    }

    private boolean isZoomEnabledByPlayerType()
    {
        return true;
    }

    private void keepScreenOn()
    {
        getWindow().addFlags(128);
        Log.d("PlayerActivity", "KEEP_SCREEN: ON");
        mHandler.removeCallbacks(pauseTimeout);
        mHandler.removeCallbacks(allowScreenLockTimeout);
    }

    private boolean loadVideo()
    {
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("Do load Video ").append(hashCode()).toString());
        }
        if (destroyed())
        {
            return false;
        }
        if (!ConnectivityUtils.isConnectedOrConnecting(this))
        {
            Log.d("PlayerActivity", "Raising no connectivity warning");
            noConnectivityWarning();
            return false;
        }
        if (!handleConnectivityCheck())
        {
            Log.d("PlayerActivity", "Network check fails");
            return false;
        }
        Asset asset = mAsset;
        if (asset == null)
        {
            Log.e("PlayerActivity", "asset is null, this should not happen!");
            return false;
        }
        mState.videoLoaded = true;
        int i;
        int j;
        try
        {
            PlayerType playertype = PlayerTypeFactory.getCurrentType(getBaseContext());
            if (playertype == PlayerType.device10 || playertype == PlayerType.device11)
            {
                if (Log.isLoggable("PlayerActivity", 3))
                {
                    Log.d("PlayerActivity", (new StringBuilder()).append("Set JPlayerListener: ").append(this).toString());
                }
                mPlayer.setJPlayerListener(this);
            }
            j = asset.getPlaybackBookmark();
            if (Log.isLoggable("PlayerActivity", 3))
            {
                Log.d("PlayerActivity", (new StringBuilder()).append(hashCode()).append("Do Play from position ").append(j).toString());
                Log.d("PlayerActivity", (new StringBuilder()).append(hashCode()).append("Do Play asset ").append(asset.toString()).toString());
            }
        }
        catch (Throwable throwable)
        {
            Log.e("PlayerActivity", "Exception in video preparation", throwable);
            errorManager.addError(new NccpActionId(3, "", getString(0x7f0c00fe), "handleActionId", "ACTION_ID", 0, null));
            return false;
        }
        i = j;
        if (j >= 0)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        Log.d("PlayerActivity", (new StringBuilder()).append(hashCode()).append("Invalid bookmark, reset to 0").toString());
        i = 0;
        mPlayer.setSurface(mScreen.getHolder().getSurface());
        mPlayer.setSurfaceHolder(mScreen.getHolder());
        Thread.sleep(30L);
        mPlayer.open(toLongSafe(asset.getPlayableId()), asset, i * 1000);
        notifyOthersOfPlayStart();
        return true;
    }

    private void noConnectivityWarning()
    {
        com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor alertdialogdescriptor = new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor(null, getString(0x7f0c010e), getString(0x104000a), exitButtonHandler);
        displayDialog(AlertDialogFactory.createDialog(this, handler, alertdialogdescriptor));
    }

    private void nonWifiPlayWarning()
    {
        ThreadUtils.assertOnMain();
        com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor alertdialogdescriptor = new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor(null, getString(0x7f0c0112), getString(0x104000a), exitButtonHandler);
        displayDialog(AlertDialogFactory.createDialog(this, handler, alertdialogdescriptor));
    }

    private void onSeek()
    {
        ThreadUtils.assertOnMain();
        Log.d("PlayerActivity", "onSeek");
        mState.stalled = true;
        mScreen.setBufferingOverlayVisibility(true);
    }

    public static void playVideo(NetflixActivity netflixactivity, Playable playable, PlayContext playcontext)
    {
        boolean flag;
        if (!PIN_VERIFIED.booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        playVideo(netflixactivity, Asset.create(playable, playcontext, flag));
    }

    public static void playVideo(NetflixActivity netflixactivity, Asset asset)
    {
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("Asset to playback: ").append(asset).toString());
        }
        if (asset == null)
        {
            return;
        } else
        {
            netflixactivity.startActivity(toIntent(netflixactivity, asset));
            return;
        }
    }

    private void releaseLockOnScreen()
    {
        getWindow().clearFlags(128);
        Log.d("PlayerActivity", "KEEP_SCREEN: OFF");
    }

    private void repostOnEverySecondRunnable(int i)
    {
        mHandler.removeCallbacks(onEverySecond);
        mHandler.postDelayed(onEverySecond, i);
    }

    private void setProgress()
    {
        if (mPlayer != null && !mState.draggingInProgress)
        {
            int i = mPlayer.getCurrentProgress();
            int j = mPlayer.getDuration();
            if (!mState.draggingInProgress && mPlayer.canUpdatePosition(i))
            {
                if (Log.isLoggable("PlayerActivity", 3))
                {
                    Log.d("PlayerActivity", (new StringBuilder()).append("PA#setProgress:: Position: ").append(i).append(", duration: ").append(j).toString());
                }
                mScreen.setProgress(i, j, true);
                return;
            }
            if (Log.isLoggable("PlayerActivity", 5))
            {
                Log.w("PlayerActivity", (new StringBuilder()).append("PA#setProgress:: Draging in progress? ").append(i).append(", duration: ").append(j).toString());
                return;
            }
        }
    }

    private void setSurface(int i, int j, boolean flag)
    {
        if (mScreen.getSurfaceView() == null)
        {
            return;
        } else
        {
            mScreen.getSurfaceView().setVideoWidth(i);
            mScreen.getSurfaceView().setVideoHeight(j);
            return;
        }
    }

    private void setTargetSelection()
    {
        Object obj = getServiceManager();
        if (obj == null || !((ServiceManager) (obj)).isReady() || ((ServiceManager) (obj)).getMdx() == null)
        {
            mScreen.getBottomPanel().setMdxTargetSelector(null);
            return;
        }
        Pair apair[] = ((ServiceManager) (obj)).getMdx().getTargetList();
        if (apair == null || apair.length < 1)
        {
            mScreen.getBottomPanel().setMdxTargetSelector(null);
            return;
        } else
        {
            obj = ((ServiceManager) (obj)).getMdx().getCurrentTarget();
            mScreen.getBottomPanel().setMdxTargetSelector(createMdxTargetSelection(apair, ((String) (obj))));
            return;
        }
    }

    private void showControlScreenOverlay(boolean flag)
    {
        PlayScreen playscreen = mScreen;
        if (playscreen != null)
        {
            playscreen.onTap(flag);
            return;
        } else
        {
            Log.w("PlayerActivity", "Screen is null!");
            return;
        }
    }

    private void skip(int i)
    {
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("Skip back ").append(i).append(" ms").toString());
        }
        mState.setLastActionTime(SystemClock.elapsedRealtime());
        mState.userInteraction();
        int j = mPlayer.getCurrentProgress() + i;
        i = j;
        if (j < 0)
        {
            Log.d("PlayerActivity", "Go back to start, instead of trying to go minus!");
            i = 0;
        }
        doSeek(i, true);
    }

    private void skipBack()
    {
        skip(-30000);
    }

    private void skipForward()
    {
        skip(30000);
    }

    private void slowNetworkWarning()
    {
        com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor alertdialogdescriptor = new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor(null, getString(0x7f0c0093), getString(0x104000a), exitButtonHandler);
        displayDialog(AlertDialogFactory.createDialog(this, handler, alertdialogdescriptor));
    }

    private void startScreenUpdate()
    {
        if (mScreen != null && !destroyed())
        {
            AudioManager audiomanager = (AudioManager)getSystemService("audio");
            if (audiomanager != null)
            {
                audiomanager.setStreamMute(3, false);
                int i = audiomanager.getStreamVolume(3);
                mScreen.initAudioProgress(i);
            } else
            {
                Log.e("PlayerActivity", "Audio manager not found. Unable to unmute!");
            }
            mState.setLastActionTime(SystemClock.elapsedRealtime());
            startScreenUpdateTask();
        }
    }

    private void stopPlayback()
    {
        Log.d("PlayerActivity", "stopPlayback");
        if (mState.activityState == PlayerActivityState.ACTIVITY_SRVCMNGR_READY || mState.activityState == PlayerActivityState.ACTIVITY_PLAYER_READY)
        {
            mPlayer.close();
            mIsListening = false;
            mPlayer.removePlayerListener(this);
            mState.activityState = PlayerActivityState.ACTIVITY_NOTREADY;
            ImageView imageview = mScreen.getMedia();
            if (imageview != null)
            {
                imageview.setEnabled(false);
            }
            if (mState.playStarted)
            {
                notifyOthersOfPlayStop();
            }
        }
        mAsset = null;
        mIsAssetReady = false;
        mReloadOnAudioTrackChange = false;
    }

    private int toBifAjustedProgress(SeekBar seekbar)
    {
        int i = seekbar.getProgress();
        int j = (i / 10000) * 10000;
        if (j == i)
        {
            if (Log.isLoggable("PlayerActivity", 3))
            {
                Log.d("PlayerActivity", (new StringBuilder()).append("Right on target, no need to ajust seekbar position ").append(i).append(" [ms]").toString());
            }
            return j;
        }
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("Progres : ").append(i).append(" [ms] vs. bif position ").append(j).append(" [ms]").toString());
        }
        seekbar.setProgress(j);
        return j;
    }

    private static Intent toIntent(NetflixActivity netflixactivity, Asset asset)
    {
        netflixactivity = createIntent(netflixactivity);
        netflixactivity.addFlags(0x20000);
        netflixactivity.addFlags(0x10000000);
        asset.toIntent(netflixactivity);
        return netflixactivity;
    }

    private long toLong(String s)
        throws NumberFormatException, NullPointerException
    {
        return Long.parseLong(s);
    }

    private long toLongSafe(String s)
    {
        String s1;
        if (s != null)
        {
            if (!"".equals(s1 = s.trim()) && !"null".equalsIgnoreCase(s1))
            {
                long l;
                try
                {
                    l = toLong(s);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return 0L;
                }
                return l;
            }
        }
        return 0L;
    }

    private void updateMetadata()
    {
        if (!PreferenceUtils.getBooleanPref(getBaseContext(), "ui.playeroverlay", false))
        {
            mScreen.setDebugDataVisibility(false);
        } else
        {
            mScreen.setDebugDataVisibility(true);
            boolean flag = false;
            boolean flag1 = false;
            StringBuilder stringbuilder = new StringBuilder();
            StringBuilder stringbuilder1 = new StringBuilder();
            String s = "N/A";
            String s2 = "N/A";
            int i = ((flag1) ? 1 : 0);
            int j = ((flag) ? 1 : 0);
            Object obj = s;
            String s1 = s2;
            if (mPlayer != null)
            {
                Object obj1 = mPlayer.getPlayoutMetadata();
                i = ((flag1) ? 1 : 0);
                j = ((flag) ? 1 : 0);
                obj = s;
                s1 = s2;
                if (obj1 != null)
                {
                    int k = ((PlayoutMetadata) (obj1)).position / 60000;
                    int l = ((PlayoutMetadata) (obj1)).duration / 60000;
                    stringbuilder.append(((PlayoutMetadata) (obj1)).instantBitRate).append("/");
                    stringbuilder.append(((PlayoutMetadata) (obj1)).targetBitRate).append("/");
                    if (((PlayoutMetadata) (obj1)).isSuperHD)
                    {
                        stringbuilder.append(getString(0x7f0c017e));
                    } else
                    if (((PlayoutMetadata) (obj1)).isHD)
                    {
                        stringbuilder.append(getString(0x7f0c00f5));
                    } else
                    {
                        stringbuilder.append(getString(0x7f0c00f4));
                    }
                    stringbuilder1.append(((PlayoutMetadata) (obj1)).language).append("/");
                    stringbuilder1.append(((PlayoutMetadata) (obj1)).getAudioChannel()).append("/");
                    stringbuilder1.append(((PlayoutMetadata) (obj1)).getAudioTrackType());
                    obj = mPlayer.getSubtitleConfiguration();
                    if (obj != null)
                    {
                        s = ((SubtitleConfiguration) (obj)).getString(this);
                    }
                    Log.d("PlayerActivity", (new StringBuilder()).append("Subtitle config: ").append(s).toString());
                    obj1 = mPlayer.getSubtitleProfileFromMetadata();
                    i = l;
                    j = k;
                    obj = s;
                    s1 = s2;
                    if (obj1 != null)
                    {
                        s1 = ((com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleProfile) (obj1)).getNccpCode();
                        obj = s;
                        j = k;
                        i = l;
                    }
                }
            }
            k = (int)(Debug.getNativeHeapAllocatedSize() / 0x100000L);
            s = "N/A";
            if (mSubtitleManager instanceof EnhancedSubtitleManager)
            {
                s = getString(0x7f0c01ae);
            } else
            if (mSubtitleManager instanceof SimpleSubtitleManager)
            {
                s = getString(0x7f0c01b0);
            }
            s2 = PlayerTypeFactory.getCurrentType(getBaseContext()).getDescription();
            s = getString(0x7f0c00f3, new Object[] {
                "Release", Integer.valueOf(AndroidManifestUtils.getVersionCode(getBaseContext())), Integer.valueOf(k), "UI Version", Integer.valueOf(j), Integer.valueOf(i), stringbuilder.toString(), stringbuilder1.toString(), s2, obj, 
                s1, s
            });
            if (mScreen != null)
            {
                mScreen.setDebugData(s);
                return;
            }
        }
    }

    private static void verifyPinAndContinue(PlayerActivity playeractivity, boolean flag, boolean flag1)
    {
        if (flag)
        {
            Log.d("PlayerActivity", String.format("nf_pin PlayerActivity pinVerification skipped - verified:%b, protected:%b", new Object[] {
                Boolean.valueOf(flag), Boolean.valueOf(flag1)
            }));
            playeractivity.continueInitAfterPinVerify();
            return;
        } else
        {
            PinDialogVault pindialogvault = new PinDialogVault(com.netflix.mediaclient.ui.pin.PinDialogVault.PinInvokedFrom.PLAYER.getValue());
            PinVerifier.getInstance().verify(playeractivity, flag1, pindialogvault);
            return;
        }
    }

    public void changeLanguage(Language language1, boolean flag)
    {
        ThreadUtils.assertOnMain();
        if (language1 != null)
        {
            setLanguage(language1);
            mPlayer.selectTracks(language1.getSelectedAudio(), language1.getSelectedSubtitle());
            if (language1.getSelectedSubtitle() == null)
            {
                Log.d("PlayerActivity", "Disable subtitles, none is selected");
                mSubtitleManager.clear();
            }
            language1.commit();
            if (flag)
            {
                Log.d("PlayerActivity", "Starting playback by seek with forceRebuffer to current position");
                mReloadOnAudioTrackChange = true;
                onStalled();
            }
        }
        Log.d("PlayerActivity", "Language change should be completed");
    }

    protected void cleanupAndExit()
    {
        if (mState.activityState == PlayerActivityState.ACTIVITY_PLAYER_READY)
        {
            stopPlayback();
        }
        stopScreenUpdateTask();
        mState.activityState = PlayerActivityState.ACTIVITY_NOTREADY;
        setResult(-1);
        if (!isFinishing())
        {
            Log.d("PlayerActivity", "cleanupAndExit calling finish");
            finish();
        }
    }

    protected ManagerStatusListener createManagerStatusListener()
    {
        return new ManagerStatusListener() {

            final PlayerActivity this$0;

            private Boolean handleBillboard(ServiceManager servicemanager)
            {
                Object obj = getIntent();
                if (((Intent) (obj)).hasExtra("extra_get_details_video_id"))
                {
                    String s = ((Intent) (obj)).getStringExtra("extra_get_details_video_id");
                    VideoType videotype = VideoType.create(((Intent) (obj)).getStringExtra("extra_get_details_video_type"));
                    obj = (PlayContext)((Intent) (obj)).getParcelableExtra("extra_get_details_play_context");
                    if (videotype == VideoType.MOVIE)
                    {
                        servicemanager.fetchMovieDetails(s, new FetchVideoDetailsForPlaybackCallback(((PlayContext) (obj))));
                        return Boolean.TRUE;
                    }
                    if (videotype == VideoType.SHOW)
                    {
                        servicemanager.fetchShowDetails(s, null, new FetchVideoDetailsForPlaybackCallback(((PlayContext) (obj))));
                        return Boolean.FALSE;
                    } else
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Invalid billboard video type: ").append(videotype).toString());
                    }
                } else
                {
                    mIsAssetReady = true;
                    Log.d("PlayerActivity", "Regular playback");
                    return null;
                }
            }

            public void onManagerReady(ServiceManager servicemanager, int i)
            {
                boolean flag2 = false;
                if (Log.isLoggable("PlayerActivity", 3))
                {
                    Log.d("PlayerActivity", (new StringBuilder()).append("ServiceManager ready: ").append(i).toString());
                }
                ThreadUtils.assertOnMain();
                mResources = ResourceHelper.newInstance(getSurfaceView);
                PostPlayFactory.PostPlayType postplaytype;
                boolean flag;
                if (handleBillboard(servicemanager) != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                postplaytype = PostPlay.getPostPlayType(PlayerActivity.this, flag);
                setContentView(PlayScreen.resolveContentView(postplaytype));
                mPlayer = servicemanager.getPlayer();
                mConfig = servicemanager.getConfiguration();
                if (mPlayer == null || mConfig == null)
                {
                    Log.d("PlayerActivity", "Unable to receive handle to player object, finishing activity ");
                    finish();
                    return;
                }
                servicemanager.cancelAllImageLoaderRequests();
                mPlayer.addPlayerListener(PlayerActivity.this);
                mIsListening = true;
                servicemanager = createListeners();
                mScreen = PlayScreen.createInstance(PlayerActivity.this, servicemanager, postplaytype);
                mSubtitleManager = SubtitleManagerFactory.createInstance(mPlayer.getSubtitleConfiguration(), PlayerActivity.this);
                if (!flag)
                {
                    Log.d("PlayerActivity", "Regular launch, check episode visibility");
                    servicemanager = getCurrentAsset();
                    TopPanel toppanel = mScreen.getTopPanel();
                    boolean flag1 = flag2;
                    if (servicemanager != null)
                    {
                        flag1 = flag2;
                        if (servicemanager.isEpisode())
                        {
                            flag1 = true;
                        }
                    }
                    toppanel.setEpisodeSelectorVisibility(flag1);
                    mScreen.getPostPlay().init(servicemanager.getPlayableId());
                }
                if (AndroidUtils.getAndroidVersion() > 18)
                {
                    mScreen.getSurfaceView().setSecure(true);
                }
                setTargetSelection();
                errorManager = new ErrorManager(, PlayerActivity.this, mConfig);
                registerReceiverWithAutoUnregister(mNetworkChangeReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                if (AndroidUtils.getAndroidVersion() >= 16 && (PlayerTypeFactory.isJPlayerBase(PlayerTypeFactory.getCurrentType(PlayerActivity.this)) || PlayerTypeFactory.isJPlayer(PlayerTypeFactory.getCurrentType(PlayerActivity.this))))
                {
                    servicemanager = (TextureView)findViewById(0x7f07014c);
                    mSurface2 = new SecondSurface(servicemanager);
                }
                mState.activityState = PlayerActivityState.ACTIVITY_SRVCMNGR_READY;
            }

            public void onManagerUnavailable(ServiceManager servicemanager, int i)
            {
                Log.e("PlayerActivity", "NetflixService is NOT available!");
                cleanupAndExit();
            }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
        };
    }

    MdxTargetSelection createMdxTargetSelection(Pair apair[], String s)
    {
        return new MdxTargetSelection(apair, s);
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        boolean flag = true;
        if (keyevent.getAction() != 0) goto _L2; else goto _L1
_L1:
        keyevent.getKeyCode();
        JVM INSTR tableswitch 19 25: default 56
    //                   19 142
    //                   20 120
    //                   21 56
    //                   22 56
    //                   23 56
    //                   24 142
    //                   25 120;
           goto _L2 _L3 _L4 _L2 _L2 _L2 _L3 _L4
_L2:
        if (keyevent.getAction() != 1) goto _L6; else goto _L5
_L5:
        keyevent.getKeyCode();
        JVM INSTR tableswitch 19 25: default 112
    //                   19 190
    //                   20 164
    //                   21 112
    //                   22 112
    //                   23 112
    //                   24 190
    //                   25 164;
           goto _L6 _L7 _L8 _L6 _L6 _L6 _L7 _L8
_L6:
        flag = super.dispatchKeyEvent(keyevent);
_L10:
        return flag;
_L4:
        if (mScreen != null)
        {
            mScreen.setSoundBarVisibility(true);
        }
        adjustVolume(true);
        return true;
_L3:
        if (mScreen != null)
        {
            mScreen.setSoundBarVisibility(true);
        }
        adjustVolume(false);
        return true;
_L8:
        Log.d("PlayerActivity", "dispatched key action up on volume down");
        if (mScreen != null)
        {
            mScreen.setSoundBarVisibility(false);
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        Log.d("PlayerActivity", "dispatched key action up on volume up");
        if (mScreen != null)
        {
            mScreen.setSoundBarVisibility(false);
            return true;
        }
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void doPause()
    {
        doPause(false);
    }

    public void doPlaying()
    {
        ThreadUtils.assertOnMain();
        if (mState.stalled)
        {
            Log.d("PlayerActivity", "Dismissing buffering progress bar...");
            mState.seekToInProgress = false;
            mState.audioSeekToInProgress = false;
            mState.stalled = false;
            keepScreenOn();
            if (mScreen != null)
            {
                mScreen.changeActionState(true, false);
                mScreen.setBufferingOverlayVisibility(false);
                Log.d("PlayerActivity", "Remove bif image if it was visible. Only for phones!!!");
                if (!mIsTablet)
                {
                    mScreen.stopBif();
                }
                if (mIsTablet && mScreen.getState() == PlayerUiState.PlayingWithTrickPlayOverlay)
                {
                    Log.d("PlayerActivity", "onPlaying:: screen tapped: moveCurrentTimeWithTimeline(true, true)");
                    mScreen.moveCurrentTimeWithTimeline(true, true);
                }
            }
            startScreenUpdate();
        }
        if (!hasWindowFocus() && !destroyed())
        {
            Log.d("PlayerActivity", "App is not in focus, pause");
            doPause();
        }
    }

    public void doSeek(int i)
    {
        doSeek(i, false);
    }

    public void doUnpause()
    {
        if (mState.activityState != PlayerActivityState.ACTIVITY_PLAYER_READY)
        {
            Log.i("PlayerActivity", (new StringBuilder()).append("doUnPause: Invalid state, exit...:").append(mState.activityState.getName()).toString());
            cleanupAndExit();
        } else
        {
            Log.i("PlayerActivity", "doPlay: resume");
            if (!mPlayer.isPlaying())
            {
                if (mScreen != null && mScreen.getMedia() != null)
                {
                    mScreen.getMedia().setImageResource(mResources.pause);
                }
                keepScreenOn();
                mPlayer.unpause();
                return;
            }
        }
    }

    public void doZoomIn()
    {
        if (mState.activityState != PlayerActivityState.ACTIVITY_PLAYER_READY)
        {
            Log.i("PlayerActivity", (new StringBuilder()).append("doZoomIn: Invalid state, exit...:").append(mState.activityState.getName()).toString());
            cleanupAndExit();
        } else
        {
            Log.i("PlayerActivity", "doZoomIn: start");
            PlayScreen playscreen = mScreen;
            if (playscreen != null)
            {
                playscreen.setZoom(false);
                if (playscreen.getZoom() != null)
                {
                    playscreen.getZoom().setImageResource(mResources.zoomOut);
                    return;
                }
            }
        }
    }

    public void doZoomOut()
    {
        if (mState.activityState != PlayerActivityState.ACTIVITY_PLAYER_READY)
        {
            Log.i("PlayerActivity", (new StringBuilder()).append("doZoomIn: Invalid state, exit...:").append(mState.activityState.getName()).toString());
            cleanupAndExit();
        } else
        {
            Log.d("PlayerActivity", "doZoomOut: start");
            PlayScreen playscreen = mScreen;
            if (playscreen != null)
            {
                playscreen.setZoom(true);
                if (playscreen.getZoom() != null)
                {
                    playscreen.getZoom().setImageResource(mResources.zoomIn);
                    return;
                }
            }
        }
    }

    public void extendTimeoutTimer()
    {
        mState.setLastActionTime(SystemClock.elapsedRealtime());
        mState.userInteraction();
    }

    public Asset getCurrentAsset()
    {
        return mAsset;
    }

    public String getCurrentTitle()
    {
        PlayScreen playscreen = getScreen();
        if (playscreen == null)
        {
            return null;
        } else
        {
            return playscreen.getCurrentTitle();
        }
    }

    protected DataContext getDataContext()
    {
        return new DataContext(mAsset, null);
    }

    public com.netflix.mediaclient.android.fragment.NetflixDialogFrag.DialogCanceledListener getDialogCanceledListener()
    {
        return mDialogCancedledListener;
    }

    public com.netflix.mediaclient.ui.details.EpisodeRowView.EpisodeRowListener getEpisodeRowListener()
    {
        return mEpisodeRowListener;
    }

    ErrorManager getErrorManager()
    {
        return errorManager;
    }

    Handler getHandler()
    {
        return mHandler;
    }

    public Language getLanguage()
    {
        return language;
    }

    public IPlayer getPlayer()
    {
        return mPlayer;
    }

    public PlayScreen getScreen()
    {
        return mScreen;
    }

    public Surface getSecondSurface()
    {
        if (mSurface2 != null)
        {
            return mSurface2.getSurface();
        } else
        {
            return null;
        }
    }

    com.netflix.mediaclient.ui.common.Social.SocialProviderCallback getSocialProviderCallback()
    {
        return mSocialProviderCallback;
    }

    protected PlayerWorkflowState getState()
    {
        return mState;
    }

    SubtitleManager getSubtitleManager()
    {
        return mSubtitleManager;
    }

    public SecondSurface getSurface2()
    {
        return mSurface2;
    }

    public ResourceHelper getUiResources()
    {
        return mResources;
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getUiScreen()
    {
        return com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.playback;
    }

    protected boolean handleBackPressed()
    {
        if (mScreen != null && mScreen.inInterruptedOrPendingInterrupted() && mScreen.getPostPlay() != null)
        {
            mScreen.getPostPlay().moveFromInterruptedToPlaying();
            return true;
        } else
        {
            return false;
        }
    }

    boolean handleConnectivityCheck()
    {
        Log.i("PlayerActivity", "Check connection");
        LogMobileType logmobiletype = ConnectivityUtils.getConnectionType(this);
        if (logmobiletype == null)
        {
            Log.i("PlayerActivity", "No internet connection. Since this is expected state on Verizons' phones, skip");
            return true;
        }
        if (logmobiletype == LogMobileType._2G)
        {
            Log.i("PlayerActivity", "2G only, alert");
            slowNetworkWarning();
            return false;
        }
        if (logmobiletype == LogMobileType.WIFI)
        {
            Log.i("PlayerActivity", "WiFi connection, do playback");
            return true;
        }
        boolean flag = PreferenceUtils.getBooleanPref(this, "nf_play_no_wifi_warning", false);
        Log.i("PlayerActivity", (new StringBuilder()).append("3G Preference setting: ").append(flag).toString());
        if (flag)
        {
            Log.w("PlayerActivity", "We should warn user if he is on NON WIFI network!");
            nonWifiPlayWarning();
            return false;
        } else
        {
            Log.d("PlayerActivity", "Warning is not required, proceed with playback");
            return true;
        }
    }

    public void invalidateOptionsMenu()
    {
        super.invalidateOptionsMenu();
        Log.d("PlayerActivity", "Check if MDX status is changed");
        if (mScreen == null)
        {
            return;
        } else
        {
            setTargetSelection();
            return;
        }
    }

    public boolean isListening()
    {
        return mIsListening;
    }

    public boolean isLoadingData()
    {
        return false;
    }

    public boolean isPaused()
    {
        while (mPlayer == null || mPlayer.isPlaying()) 
        {
            return false;
        }
        return true;
    }

    public boolean isSeeking()
    {
        if (mPlayer == null)
        {
            return false;
        } else
        {
            return mState.seekToInProgress;
        }
    }

    public boolean isStalled()
    {
        return mState.stalled;
    }

    public void notifyOthersOfPlayStart()
    {
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOCAL_PLAYER_PLAY_START");
        sendBroadcast(mAsset.toIntent(intent));
        Log.v("PlayerActivity", "Intent PLAYER_PLAY_START sent");
    }

    public void notifyOthersOfPlayStop()
    {
        PinVerifier.getInstance().registerPlayEvent(mAsset.isPinProtected());
        Intent intent = new Intent("com.netflix.mediaclient.intent.action.LOCAL_PLAYER_PLAY_STOP");
        mAsset.setPlaybackBookmark(mPlayer.getCurrentPositionMs() / 1000);
        sendBroadcast(mAsset.toIntent(intent));
        Log.v("PlayerActivity", "Intent PLAYER_PLAY_STOP sent");
    }

    public void onAudioChange(int i)
    {
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("onAudioChange").append(i).toString());
        }
        if (mReloadOnAudioTrackChange)
        {
            Log.d("PlayerActivity", "Starting playback by seek with forceRebuffer to current position");
            mReloadOnAudioTrackChange = false;
            doSeek(mPlayer.getCurrentPositionMs(), true);
        }
    }

    public void onAudioFocusChange(int i)
    {
        i;
        JVM INSTR tableswitch -3 3: default 44
    //                   -3 136
    //                   -2 129
    //                   -1 122
    //                   0 44
    //                   1 101
    //                   2 108
    //                   3 115;
           goto _L1 _L2 _L3 _L4 _L1 _L5 _L6 _L7
_L1:
        String s = (new StringBuilder()).append("uknowwn ").append(i).toString();
_L9:
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("onAudioFocusChange ").append(s).toString());
        }
        return;
_L5:
        s = "AUDIOFOCUS_GAIN";
        continue; /* Loop/switch isn't completed */
_L6:
        s = "AUDIOFOCUS_GAIN_TRANSIENT";
        continue; /* Loop/switch isn't completed */
_L7:
        s = "AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "AUDIOFOCUS_LOSS";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "AUDIOFOCUS_LOSS_TRANSIENT";
        continue; /* Loop/switch isn't completed */
_L2:
        s = "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK";
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void onBandwidthChange(int i)
    {
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("bandwidth changed to [Kbps]: ").append(i).toString());
        }
    }

    public void onBufferingUpdate(int i)
    {
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("MP onBufferingUpdate ").append(i).append("%").toString());
        }
    }

    public void onCompletion()
    {
        Log.d("PlayerActivity", "onCompletion, check if we are in postplay");
        stopScreenUpdateTask();
        if (mScreen != null && mScreen.canExitPlaybackEndOfPlay())
        {
            cleanupAndExit();
            return;
        } else
        {
            Log.d("PlayerActivity", "In PostPlay, allow screen to lock after timeout...");
            mHandler.postDelayed(allowScreenLockTimeout, 0x1d4c0L);
            return;
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        if (configuration.hardKeyboardHidden == 1)
        {
            Log.d("PlayerActivity", "keyboard out");
        } else
        if (configuration.hardKeyboardHidden == 2)
        {
            Log.d("PlayerActivity", "keyboard in");
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("onCreate started ").append(hashCode()).toString());
        }
        AndroidUtils.logDeviceDensity(this);
        keepScreenOn();
        getWindow().getAttributes().buttonBrightness = 0.0F;
        mState.reset();
        LogUtils.reportPlayActionStarted(this, null, getUiScreen());
        mState.playStartInProgress.set(true);
        LogUtils.pauseReporting(this);
        Log.d("PlayerActivity", "onCreate done");
    }

    protected void onDestroy()
    {
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("====> Destroying PlayActivity ").append(hashCode()).toString());
        }
        getWindow().getAttributes().buttonBrightness = -1F;
        releaseLockOnScreen();
        mHandler.removeCallbacks(pauseTimeout);
        mHandler.removeCallbacks(allowScreenLockTimeout);
        if (mScreen != null)
        {
            mScreen.destroy();
        }
        if (errorManager != null)
        {
            errorManager.destroy();
        }
        if (mSubtitleManager != null)
        {
            mSubtitleManager.clear();
        }
        if (mSurface2 != null)
        {
            mSurface2 = null;
        }
        LogUtils.resumeReporting(this, false);
        super.onDestroy();
        Log.d("PlayerActivity", "====> Destroying PlayActivity done");
    }

    public Surface onGetTextureSurface()
    {
        SecondSurface secondsurface = mSurface2;
        if (secondsurface != null)
        {
            return secondsurface.getSurface();
        } else
        {
            return null;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        boolean flag1;
        flag1 = true;
        if (Log.isLoggable("PlayerActivity", 2))
        {
            Log.v("PlayerActivity", (new StringBuilder()).append("onKeyDown: ").append(keyevent).toString());
        }
        mState.setLastActionTime(SystemClock.elapsedRealtime());
        mState.userInteraction();
        if (i != 4) goto _L2; else goto _L1
_L1:
        if (mScreen == null || !mScreen.inInterruptedOrPendingInterrupted()) goto _L4; else goto _L3
_L3:
        boolean flag;
        Log.d("PlayerActivity", "Back used to dismiss interrupter overlay, send it back to framework");
        flag = super.onKeyDown(i, keyevent);
_L6:
        return flag;
_L4:
        Log.d("PlayerActivity", "Back...");
        cleanupAndExit();
        return true;
_L2:
        flag = flag1;
        if (i != 84)
        {
            if (i == 82)
            {
                keyevent.startTracking();
                return true;
            }
            if (i == 25 || i == 24 || i == 20 || i == 19)
            {
                Log.d("PlayerActivity", "Volume key is pressed");
                mState.volumeChangeInProgress = System.currentTimeMillis();
                return super.onKeyDown(i, keyevent);
            }
            flag = flag1;
            if (!handleControlButtonPress(i, keyevent))
            {
                return super.onKeyDown(i, keyevent);
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean onKeyLongPress(int i, KeyEvent keyevent)
    {
        switch (i)
        {
        default:
            return super.onKeyLongPress(i, keyevent);

        case 82: // 'R'
            return true;
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (i == 82)
        {
            openOptionsMenu();
            return true;
        }
        if (i == 25 || i == 24 || i == 20 || i == 19)
        {
            Log.d("PlayerActivity", "Volume key is released");
            return super.onKeyUp(i, keyevent);
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    public void onMediaError(Error error)
    {
        if (Log.isLoggable("PlayerActivity", 6))
        {
            Log.e("PlayerActivity", (new StringBuilder()).append("Media Error ").append(error).toString());
        }
        errorManager.addMediaError(error);
    }

    public void onNccpError(NccpError nccperror)
    {
        if (Log.isLoggable("PlayerActivity", 6))
        {
            Log.e("PlayerActivity", (new StringBuilder()).append("Nccp Error ").append(nccperror).toString());
        }
        errorManager.addError(nccperror);
    }

    public void onNrdFatalError()
    {
        Log.w("PlayerActivity", "onNrdFatalError");
        com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor alertdialogdescriptor = new com.netflix.mediaclient.android.widget.AlertDialogFactory.AlertDialogDescriptor("", getString(0x7f0c011f), null, new Runnable() {

            final PlayerActivity this$0;

            public void run()
            {
                Log.d("PlayerActivity", "===fatal error, shutdown===");
                int i = Process.myPid();
                Log.d("PlayerActivity", (new StringBuilder()).append("Destroying app proces ").append(i).append("...").toString());
                Process.killProcess(i);
                Log.d("PlayerActivity", (new StringBuilder()).append("Destroying app proces ").append(i).append(" done.").toString());
            }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
        });
        displayDialog(AlertDialogFactory.createDialog(this, mHandler, alertdialogdescriptor));
    }

    protected void onPause()
    {
        PowerManager powermanager;
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("onPause called...").append(hashCode()).toString());
        }
        powermanager = (PowerManager)getSystemService("power");
        if (powermanager == null || powermanager.isScreenOn()) goto _L2; else goto _L1
_L1:
        Log.d("PlayerActivity", "Screen is off, go back to UI ");
        cleanupAndExit();
_L4:
        PostPlay postplay = getPostPlaySafely();
        if (postplay != null)
        {
            postplay.onPause();
        }
        Log.d("PlayerActivity", "onPause called done");
        super.onPause();
        return;
_L2:
        if (mState.activityState == PlayerActivityState.ACTIVITY_PLAYER_READY)
        {
            Log.d("PlayerActivity", "Screen is on, just pause");
            doPause();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onPinVerified(PinDialogVault pindialogvault)
    {
        Log.d("nf_pin", String.format("%s onPinVerification vault: %s", new Object[] {
            com/netflix/mediaclient/ui/player/PlayerActivity.getSimpleName(), pindialogvault
        }));
        if (com.netflix.mediaclient.ui.pin.PinDialogVault.PinInvokedFrom.PLAYER.getValue().equals(pindialogvault.getInvokeLocation()))
        {
            continueInitAfterPinVerify();
        }
    }

    public void onPlaying()
    {
        this;
        JVM INSTR monitorenter ;
        Log.d("PlayerActivity", "Playout (re)started");
        if (mState.activityState != PlayerActivityState.ACTIVITY_PLAYER_READY) goto _L2; else goto _L1
_L1:
        doPlaying();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.e("PlayerActivity", (new StringBuilder()).append("onPlaying not in correct state, destroyed:").append(destroyed()).append(" ActivityState: ").append(mState.activityState.getName()).toString());
        cleanupAndExit();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void onPrepared()
    {
        Log.d("PlayerActivity", "onPrepared called");
        ThreadUtils.assertOnMain();
        if (mState.activityState == PlayerActivityState.ACTIVITY_PLAYER_READY)
        {
            try
            {
                mState.videoPrepared = true;
                mWidth = mPlayer.getVideoWidth();
                mHeight = mPlayer.getVideoHeight();
                if (mWidth != 0 && mHeight != 0 && mScreen != null)
                {
                    if (Log.isLoggable("PlayerActivity", 3))
                    {
                        Log.d("PlayerActivity", (new StringBuilder()).append("====> width = ").append(mWidth).append(", height").append(mHeight).toString());
                    }
                    setSurface(mWidth, mHeight, true);
                    initSurfaceFixedSize(mWidth, mHeight);
                    Log.d("PlayerActivity", "Play");
                    mPlayer.play();
                    int i = mPlayer.getCurrentProgress();
                    int j = mPlayer.getDuration();
                    if (Log.isLoggable("PlayerActivity", 3))
                    {
                        Log.d("PlayerActivity", (new StringBuilder()).append("========> Duration = ").append(j).toString());
                    }
                    mScreen.initProgress(j);
                    if (Log.isLoggable("PlayerActivity", 3))
                    {
                        Log.d("PlayerActivity", (new StringBuilder()).append("Position: ").append(i).append(", duration: ").append(j).toString());
                    }
                    mScreen.setProgress(i, j, true, true);
                    mScreen.setZoomEnabledByPlayertype(isZoomEnabledByPlayerType());
                }
                selectInitialTracks();
                return;
            }
            catch (Exception exception)
            {
                Log.e("PlayerActivity", "Failed to start player", exception);
            }
            cleanupAndExit();
            return;
        } else
        {
            Log.e("PlayerActivity", (new StringBuilder()).append("onPrepared not in correct state, destroyed:").append(destroyed()).append(" ActivityState: ").append(mState.activityState.getName()).toString());
            cleanupAndExit();
            return;
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("onResume: back ").append(hashCode()).toString());
        }
        PostPlay postplay = getPostPlaySafely();
        if (postplay != null)
        {
            postplay.onResume();
        }
    }

    public boolean onSearchRequested()
    {
        return false;
    }

    public void onSeekComplete()
    {
        Log.d("PlayerActivity", "MP onSeekComplete");
        if (mState.activityState == PlayerActivityState.ACTIVITY_PLAYER_READY)
        {
            mState.draggingInProgress = false;
            startScreenUpdateTask();
            doPlaying();
            return;
        } else
        {
            Log.e("PlayerActivity", (new StringBuilder()).append("onSeekComplete not in correct state, destroyed:").append(destroyed()).append(" ActivityState: ").append(mState.activityState.getName()).toString());
            cleanupAndExit();
            return;
        }
    }

    public void onStalled()
    {
        this;
        JVM INSTR monitorenter ;
        Log.w("PlayerActivity", "Playout stalled");
        ThreadUtils.assertOnMain();
        if (mScreen == null || destroyed()) goto _L2; else goto _L1
_L1:
        Log.d("PlayerActivity", "Playout stalled, clear pending updates");
        mSubtitleManager.clearPendingUpdates();
        if (!mState.seekToInProgress && !mState.audioSeekToInProgress) goto _L4; else goto _L3
_L3:
        Log.d("PlayerActivity", "Seek in progress...");
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        mState.stalled = true;
        if (mScreen != null)
        {
            mScreen.changeActionState(false, false);
        }
        if (mScreen != null && mScreen.getMedia() != null)
        {
            mScreen.getMedia().setImageResource(mResources.pause);
        }
        if (mState.lowBandwidth)
        {
            Log.d("PlayerActivity", "Enabled Toast");
            Toast.makeText(getBaseContext(), 0x7f0c00ff, 1).show();
        }
        mScreen.setBufferingOverlayVisibility(true);
        if (true) goto _L2; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    protected void onStart()
    {
        super.onStart();
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("onStart ").append(hashCode()).toString());
        }
        Object obj = (AudioManager)getSystemService("audio");
        if (obj != null)
        {
            ((AudioManager) (obj)).requestAudioFocus(this, 3, 1);
        } else
        {
            Log.e("PlayerActivity", "Audio manager not found. Unable to ask for audio focus!");
        }
        obj = getIntent();
        if (obj == null)
        {
            Log.e("PlayerActivity", "This should NEVER happen, intent is null!");
            setResult(0);
            finish();
        } else
        {
            android.os.Parcelable parcelable = ((Intent) (obj)).getParcelableExtra("PAYLOAD");
            if (parcelable != null && !(parcelable instanceof Asset))
            {
                Log.e("PlayerActivity", "This should NEVER happen, payload is not Asset!");
                setResult(0);
                finish();
                return;
            }
            if (parcelable != null && (parcelable instanceof Asset))
            {
                Log.d("PlayerActivity", "Payload is Asset...");
                obj = (Asset)parcelable;
            } else
            {
                Log.d("PlayerActivity", "Payload is in multiple properties, extract it...");
                obj = Asset.fromIntent(((Intent) (obj)));
            }
            if (obj == null)
            {
                Log.e("PlayerActivity", "This should NEVER happen, asset is null!");
                setResult(0);
                finish();
            } else
            if (Log.isLoggable("PlayerActivity", 3))
            {
                Log.d("PlayerActivity", (new StringBuilder()).append("Asset received: ").append(((Asset) (obj)).toString()).toString());
            }
            mAsset = ((Asset) (obj));
            Log.d("PlayerActivity", "onStart done");
            if (Log.isLoggable("PlayerActivity", 2))
            {
                StringBuilder stringbuilder = (new StringBuilder()).append("TRACK_ID: ");
                if (mAsset == null)
                {
                    obj = "n/a";
                } else
                {
                    obj = Integer.valueOf(mAsset.getTrackId());
                }
                Log.v("PlayerActivity", stringbuilder.append(obj).toString());
                return;
            }
        }
    }

    public void onStarted()
    {
        this;
        JVM INSTR monitorenter ;
        Log.d("PlayerActivity", "Playout started");
        ThreadUtils.assertOnMain();
        if (mState.activityState != PlayerActivityState.ACTIVITY_PLAYER_READY) goto _L2; else goto _L1
_L1:
        mState.playStarted = true;
        mScreen.removeSplashScreen();
        startScreenUpdate();
        LogUtils.reportPlayActionEnded(this, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.success, null, null);
        mState.playStartInProgress.set(false);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.e("PlayerActivity", (new StringBuilder()).append("onStarted not in correct state, destroyed:").append(destroyed()).append(" ActivityState: ").append(mState.activityState.getName()).toString());
        UIError uierror = new UIError(RootCause.clientFailure, ActionOnUIError.handledSilently, null, null);
        LogUtils.reportPlayActionEnded(this, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.failed, uierror, null);
        mState.playStartInProgress.set(false);
        cleanupAndExit();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected void onStop()
    {
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("PlayerActivity::onStop called ").append(hashCode()).toString());
        }
        super.onStop();
        if (mState.playStartInProgress.getAndSet(false))
        {
            Log.d("PlayerActivity", "Start play is in progress and user canceled playback");
            LogUtils.reportPlayActionEnded(this, com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.canceled, null, null);
        }
        Object obj = mMaxStreamsReachedDialogId;
        if (obj != null)
        {
            Log.d("PlayerActivity", "Report max stream reach dialog ended");
            reportUiModelessViewSessionEnded(com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.maxStreamsReached, ((String) (obj)));
        }
        obj = mErrorDialogId;
        if (obj != null)
        {
            Log.d("PlayerActivity", "Report end of error dialog ended");
            reportUiModelessViewSessionEnded(com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.errorDialog, ((String) (obj)));
        }
        obj = (AudioManager)getSystemService("audio");
        if (obj != null)
        {
            ((AudioManager) (obj)).abandonAudioFocus(this);
        } else
        {
            Log.e("PlayerActivity", "Audio manager not found. Unable to abandon audio focus!");
        }
        Log.d("PlayerActivity", "Regular exit from player");
        cleanupAndExit();
        Log.d("PlayerActivity", "PlayerActivity::onStop done");
    }

    public void onSubtitleChange(SubtitleScreen subtitlescreen)
    {
        if (destroyed())
        {
            return;
        }
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("Update subtitles ").append(subtitlescreen).toString());
        }
        mSubtitleManager.onSubtitleChange(subtitlescreen);
    }

    public void onSubtitleFailed()
    {
        if (destroyed())
        {
            return;
        }
        Log.d("PlayerActivity", "We failed to change subtitle");
        Toast.makeText(getBaseContext(), 0x7f0c01b1, 1).show();
        if (language != null)
        {
            Log.d("PlayerActivity", "Try to restore previous subtitle");
            language.restorePreviousSubtitle();
            return;
        } else
        {
            Log.w("PlayerActivity", "Unable to restore previous subtitle, lang is null. This should NOT happen!");
            return;
        }
    }

    public void onSubtitleRemove()
    {
        ThreadUtils.assertOnMain();
        Log.d("PlayerActivity", "onSubtitleRemove");
        mSubtitleManager.onSubtitleRemove();
    }

    public void onSubtitleShow(String s)
    {
        ThreadUtils.assertOnMain();
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("setSubtitle: ").append(s).toString());
        }
        mSubtitleManager.onSubtitleShow(s);
    }

    public void onSurface2Visibility(boolean flag)
    {
        if (Log.isLoggable("PlayerActivity", 3))
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("set surface2 ");
            String s;
            if (flag)
            {
                s = "visible";
            } else
            {
                s = "invisible";
            }
            Log.d("PlayerActivity", stringbuilder.append(s).toString());
        }
        if (flag)
        {
            runInUiThread(new Runnable() {

                final PlayerActivity this$0;

                public void run()
                {
                    SecondSurface secondsurface = mSurface2;
                    if (secondsurface != null)
                    {
                        secondsurface.setSurfaceVisible();
                    }
                }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
            });
            return;
        } else
        {
            runInUiThread(new Runnable() {

                final PlayerActivity this$0;

                public void run()
                {
                    SecondSurface secondsurface = mSurface2;
                    if (secondsurface != null)
                    {
                        secondsurface.setSurfaceInvisible();
                    }
                }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
            });
            return;
        }
    }

    public void onUpdatePts(int i)
    {
        mScreen.getPostPlay().updatePlaybackPosition(i);
        PinVerifier.getInstance().registerPlayEvent(mAsset.isPinProtected());
    }

    protected void onUserLeaveHint()
    {
        Log.d("PlayerActivity", "onUserLeaveHint ");
    }

    public void onVideoSizeChanged(int i, int j)
    {
        if (i == 0 || j == 0)
        {
            Log.e("PlayerActivity", (new StringBuilder()).append("invalid aspect ratio width(").append(i).append(") or aspect ratio height(").append(j).append(")").toString());
            return;
        }
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("MP onVideoSizeChanged: aspect ratio width ").append(i).append(", aspect ratio height ").append(j).toString());
        }
        mWidth = i;
        mHeight = j;
        setSurface(i, j, false);
    }

    public void onWindowFocusChanged(boolean flag)
    {
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("====> In focus: ").append(flag).toString());
        }
        if (flag || destroyed())
        {
            return;
        }
        PlayScreen playscreen = mScreen;
        if (playscreen == null || PlayerUiState.Loading == playscreen.getState())
        {
            Log.d("PlayerActivity", "UI is not in focus on splash screen. Do NOT pause, ignore.");
            return;
        } else
        {
            Log.d("PlayerActivity", "Alert from some other activity is in front of us. Pause.");
            runInUiThread(new Runnable() {

                final PlayerActivity this$0;

                public void run()
                {
                    doPause();
                    Log.d("PlayerActivity", "onWindowFocusChanged done");
                }

            
            {
                this$0 = PlayerActivity.this;
                super();
            }
            });
            return;
        }
    }

    public void performUpAction()
    {
        LogUtils.reportUIViewCommand(this, com.netflix.mediaclient.servicemgr.UIViewLogging.UIViewCommandName.actionBarBackButton, getUiScreen(), getDataContext());
        finish();
    }

    public void playNextVideo(Playable playable, PlayContext playcontext, boolean flag)
    {
        if (destroyed())
        {
            Log.d("PlayerActivity", "Activity already destroyed, ignore next!");
            return;
        }
        boolean flag1 = false;
        int i = ((flag1) ? 1 : 0);
        if (mAsset != null)
        {
            i = ((flag1) ? 1 : 0);
            if (flag)
            {
                i = ((flag1) ? 1 : 0);
                if (mState.noUserInteraction())
                {
                    i = mAsset.getPostPlayVideoPlayed() + 1;
                }
            }
        }
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("Play next video, count ").append(i).append(", from auto play ").append(flag).append(", no user interaction ").append(mState.noUserInteraction()).toString());
        }
        cleanupAndExit();
        if (!PIN_VERIFIED.booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        playable = Asset.createForPostPlay(playable, playcontext, i, flag);
        if (Log.isLoggable("PlayerActivity", 3))
        {
            Log.d("PlayerActivity", (new StringBuilder()).append("Asset to play next: ").append(playable).toString());
        }
        startActivity(toIntent(this, playable));
    }

    public void playbackClosed()
    {
        Log.d("PlayerActivity", "playbackClosed");
        if (mRestartPlayback)
        {
            Log.d("PlayerActivity", "Reloading Video to start playback");
            loadVideo();
            mRestartPlayback = false;
        }
    }

    public void restartPlayback(NccpError nccperror)
    {
        Log.e("PlayerActivity", "Restarting playback");
        mActionId12Count = mActionId12Count + 1;
        if (mActionId12Count > 1)
        {
            errorManager.addError(nccperror);
            return;
        } else
        {
            mRestartPlayback = true;
            mPlayer.close();
            return;
        }
    }

    public void restorePlaybackAfterSnap()
    {
        Log.d("PlayerActivity", "restorePlaybackAfterSnap.");
        keepScreenOn();
        if (mScreen != null && !destroyed())
        {
            AudioManager audiomanager = (AudioManager)getSystemService("audio");
            if (audiomanager != null)
            {
                audiomanager.setStreamMute(3, false);
                int i = audiomanager.getStreamVolume(3);
                mScreen.initAudioProgress(i);
            } else
            {
                Log.e("PlayerActivity", "Audio manager not found. Unable to unmute!");
            }
            mState.setLastActionTime(SystemClock.elapsedRealtime());
            mState.userInteraction();
            repostOnEverySecondRunnable(0);
            startScreenUpdateTask();
        }
        if (mScreen != null)
        {
            mScreen.changeActionState(true, true);
        }
        doUnpause();
    }

    public void selectInitialTracks()
    {
        Subtitle asubtitle[] = mPlayer.getSubtitleTrackList();
        AudioSource aaudiosource[] = mPlayer.getAudioTrackList();
        com.netflix.mediaclient.media.AudioSubtitleDefaultOrderInfo aaudiosubtitledefaultorderinfo[] = mPlayer.getAudioSubtitleDefaultOrderInfo();
        Log.d("PlayerActivity", "Create localization manager");
        Object obj = new LocalizationManager(asubtitle, aaudiosource, aaudiosubtitledefaultorderinfo, null);
        boolean flag = false;
        Object obj1 = ((LocalizationManager) (obj)).findInitialLanguage();
        obj = ((LanguageChoice) (obj1)).getAudio();
        int i = -1;
        int j;
        if (obj != null)
        {
            if (Log.isLoggable("PlayerActivity", 3))
            {
                Log.d("PlayerActivity", (new StringBuilder()).append("Changing initial audio to ").append(obj).toString());
            }
            i = ((AudioSource) (obj)).getNccpOrderNumber();
        } else
        {
            Log.d("PlayerActivity", "No need to set initial audio source");
        }
        obj1 = ((LanguageChoice) (obj1)).getSubtitle();
        j = -1;
        if (obj1 != null)
        {
            if (Log.isLoggable("PlayerActivity", 3))
            {
                Log.d("PlayerActivity", (new StringBuilder()).append("Changing initial subtitle to ").append(obj1).toString());
            }
            j = ((Subtitle) (obj1)).getNccpOrderNumber();
            flag = true;
        } else
        {
            Log.d("PlayerActivity", "No need to set initial subtitle");
        }
        mPlayer.selectTracks(((AudioSource) (obj)), ((Subtitle) (obj1)));
        setLanguage(new Language(aaudiosource, i, asubtitle, j, flag));
    }

    void setErrorDialogId(String s)
    {
        mErrorDialogId = s;
    }

    public void setLanguage(Language language1)
    {
        if (language1 == null)
        {
            Log.w("PlayerActivity", "Language is null!");
            return;
        } else
        {
            Log.d("PlayerActivity", "Sets language");
            language = language1;
            return;
        }
    }

    void setMaxStreamsReachedDialogId(String s)
    {
        mMaxStreamsReachedDialogId = s;
    }

    public boolean showMdxInMenu()
    {
        return true;
    }

    protected boolean showSettingsInMenu()
    {
        return false;
    }

    protected boolean showSignOutInMenu()
    {
        return false;
    }

    void startScreenUpdateTask()
    {
        repostOnEverySecondRunnable(1000);
    }

    void stopScreenUpdateTask()
    {
        mHandler.removeCallbacks(onEverySecond);
        Log.d("PlayerActivity", "===>> Screen update thread canceled");
    }







/*
    static ResourceHelper access$1202(PlayerActivity playeractivity, ResourceHelper resourcehelper)
    {
        playeractivity.mResources = resourcehelper;
        return resourcehelper;
    }

*/




/*
    static com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface access$1402(PlayerActivity playeractivity, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface)
    {
        playeractivity.mConfig = configurationagentinterface;
        return configurationagentinterface;
    }

*/


/*
    static boolean access$1502(PlayerActivity playeractivity, boolean flag)
    {
        playeractivity.mIsListening = flag;
        return flag;
    }

*/



/*
    static SubtitleManager access$1702(PlayerActivity playeractivity, SubtitleManager subtitlemanager)
    {
        playeractivity.mSubtitleManager = subtitlemanager;
        return subtitlemanager;
    }

*/



/*
    static ErrorManager access$1902(PlayerActivity playeractivity, ErrorManager errormanager)
    {
        playeractivity.errorManager = errormanager;
        return errormanager;
    }

*/




/*
    static IPlayer access$202(PlayerActivity playeractivity, IPlayer iplayer)
    {
        playeractivity.mPlayer = iplayer;
        return iplayer;
    }

*/




/*
    static SecondSurface access$2202(PlayerActivity playeractivity, SecondSurface secondsurface)
    {
        playeractivity.mSurface2 = secondsurface;
        return secondsurface;
    }

*/


/*
    static boolean access$2302(PlayerActivity playeractivity, boolean flag)
    {
        playeractivity.mIsAssetReady = flag;
        return flag;
    }

*/







/*
    static boolean access$2902(PlayerActivity playeractivity, boolean flag)
    {
        playeractivity.mIsSurfaceReady = flag;
        return flag;
    }

*/





/*
    static Asset access$402(PlayerActivity playeractivity, Asset asset)
    {
        playeractivity.mAsset = asset;
        return asset;
    }

*/



/*
    static boolean access$502(PlayerActivity playeractivity, boolean flag)
    {
        playeractivity.mIsZoomedOut = flag;
        return flag;
    }

*/




/*
    static PlayScreen access$702(PlayerActivity playeractivity, PlayScreen playscreen)
    {
        playeractivity.mScreen = playscreen;
        return playscreen;
    }

*/


}
