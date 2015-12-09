// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.app.BackgroundTask;
import com.netflix.mediaclient.event.UIEvent;
import com.netflix.mediaclient.event.nrdp.media.AudioTrackChanged;
import com.netflix.mediaclient.event.nrdp.media.BufferRange;
import com.netflix.mediaclient.event.nrdp.media.Buffering;
import com.netflix.mediaclient.event.nrdp.media.Error;
import com.netflix.mediaclient.event.nrdp.media.GenericMediaEvent;
import com.netflix.mediaclient.event.nrdp.media.NccpActionId;
import com.netflix.mediaclient.event.nrdp.media.NccpError;
import com.netflix.mediaclient.event.nrdp.media.RemoveSubtitle;
import com.netflix.mediaclient.event.nrdp.media.ShowSubtitle;
import com.netflix.mediaclient.event.nrdp.media.Statechanged;
import com.netflix.mediaclient.event.nrdp.media.SubtitleData;
import com.netflix.mediaclient.event.nrdp.media.UpdatePts;
import com.netflix.mediaclient.event.nrdp.media.Warning;
import com.netflix.mediaclient.javabridge.ui.EventListener;
import com.netflix.mediaclient.javabridge.ui.IMedia;
import com.netflix.mediaclient.javabridge.ui.Nrdp;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.AudioSubtitleDefaultOrderInfo;
import com.netflix.mediaclient.media.BifManager;
import com.netflix.mediaclient.media.MediaPlayerHelper;
import com.netflix.mediaclient.media.MediaPlayerHelperFactory;
import com.netflix.mediaclient.media.PlayerType;
import com.netflix.mediaclient.media.PlayoutMetadata;
import com.netflix.mediaclient.media.Subtitle;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.NrdController;
import com.netflix.mediaclient.service.ServiceAgent;
import com.netflix.mediaclient.service.configuration.BitrateRangeFactory;
import com.netflix.mediaclient.service.configuration.PlayerTypeFactory;
import com.netflix.mediaclient.service.configuration.SubtitleConfiguration;
import com.netflix.mediaclient.service.player.subtitles.SubtitleParser;
import com.netflix.mediaclient.service.user.SimpleUserAgentWebCallback;
import com.netflix.mediaclient.service.user.UserAgentWebCallback;
import com.netflix.mediaclient.servicemgr.ErrorLogging;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.IPlayer;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.ConnectivityUtils;
import com.netflix.mediaclient.util.DeviceCategory;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.netflix.mediaclient.service.player:
//            PlayerListenerManager, PlayParamsReceiver

public class PlayerAgent extends ServiceAgent
    implements IPlayer, com.netflix.mediaclient.service.configuration.ConfigurationAgent.ConfigAgentListener
{
    private class CloseTimeoutTask extends TimerTask
    {

        final PlayerAgent this$0;

        public void run()
        {
            Log.d(PlayerAgent.TAG, "CloseTimeoutTask to unmute audio!");
            muteAudio(false);
        }

        CloseTimeoutTask()
        {
            this$0 = PlayerAgent.this;
            super();
            Log.d(PlayerAgent.TAG, "CloseTimeoutTask created!");
        }
    }

    private class GenericMediaEventListener
        implements EventListener
    {

        final PlayerAgent this$0;

        public void received(UIEvent uievent)
        {
            Log.d(PlayerAgent.TAG, "Received a media event ");
            if (uievent instanceof GenericMediaEvent)
            {
                handleGenericMediaEvent((GenericMediaEvent)uievent);
                return;
            }
            if (uievent instanceof NccpError)
            {
                handleError((NccpError)uievent);
                return;
            }
            if (uievent instanceof GenericMediaEvent)
            {
                handleGenericMediaEvent((GenericMediaEvent)uievent);
                return;
            }
            if (uievent instanceof Buffering)
            {
                handleBufferring((Buffering)uievent);
                return;
            }
            if (uievent instanceof RemoveSubtitle)
            {
                handleRemoveSubtitle((RemoveSubtitle)uievent);
                return;
            }
            if (uievent instanceof ShowSubtitle)
            {
                handleShowSubtitle((ShowSubtitle)uievent);
                return;
            }
            if (uievent instanceof SubtitleData)
            {
                handleSubtitleData((SubtitleData)uievent);
                return;
            }
            if (uievent instanceof AudioTrackChanged)
            {
                handleAudioTrackChanged((AudioTrackChanged)uievent);
                return;
            }
            if (uievent instanceof Statechanged)
            {
                handleStatechanged((Statechanged)uievent);
                return;
            }
            if (uievent instanceof BufferRange)
            {
                handleBufferRange((BufferRange)uievent);
                return;
            }
            if (uievent instanceof UpdatePts)
            {
                uievent = (UpdatePts)uievent;
                handleUpdatePts(uievent.getPts());
                return;
            }
            if (uievent instanceof Error)
            {
                handleMediaError((Error)uievent);
                return;
            }
            if (uievent instanceof Warning)
            {
                handleMediaWarning((Warning)uievent);
                return;
            } else
            {
                Log.e(PlayerAgent.TAG, (new StringBuilder()).append("Uknown event: ").append(uievent.getType()).toString());
                return;
            }
        }

        private GenericMediaEventListener()
        {
            this$0 = PlayerAgent.this;
            super();
        }

    }

    private class StartPlayTimeoutTask extends TimerTask
    {

        final PlayerAgent this$0;

        public void run()
        {
            Log.d(PlayerAgent.TAG, "StartPlayTimeoutTask to handleFatalError()!");
            handlePlayerListener(mPlayerListenerManager.getPlayerListenerOnNrdFatalErrorHandler(), new Object[0]);
        }

        StartPlayTimeoutTask()
        {
            this$0 = PlayerAgent.this;
            super();
            Log.d(PlayerAgent.TAG, "StartPlayTimeoutTask created!");
        }
    }


    private static final int BANDWITH_CHECK_INTERVAL = 30000;
    public static final int CREATED = 1;
    private static final int EOS_DELTA = 10000;
    public static final int IN_PLAYBACK = 3;
    private static final int MAX_CELLULAR_DOWNLOAD_LIMIT = 0x15f90;
    private static final int MAX_WIFI_DOWNLOAD_LIMIT = 0x493e0;
    private static final int NETWORK_CHECK_INTERVAL = 1000;
    private static final int NETWORK_CHECK_TIMEOUT = 30000;
    public static final int PLAYBACK_ENDED = 4;
    public static final int PLAYBACK_INITIATED = 2;
    private static final int SIXTY_COUNT = 60;
    private static final int STATE_CLOSED = 4;
    private static final int STATE_CREATED = -1;
    private static final int STATE_OPENING = 0;
    private static final int STATE_PAUSED = 2;
    private static final int STATE_PLAYING = 1;
    private static final int STATE_PRECLOSE = 8;
    private static final int STATE_PREOPEN = 5;
    private static final int STATE_PREPLAY = 6;
    private static final int STATE_PRESTOP = 7;
    private static final int STATE_STOPPED = 3;
    private static final String TAG = com/netflix/mediaclient/service/player/PlayerAgent.getSimpleName();
    private static final int TimeToWaitBeforeShutdown = 30000;
    private static final int TimeToWaitBeforeUnmute = 10000;
    private boolean ignoreErrorsWhileActionId12IsProcessed;
    private boolean inPlaybackSession;
    private NccpError mActionId12Error;
    private BifManager mBifManager;
    private int mBitrateCap;
    private long mBookmark;
    private boolean mBufferingCompleted;
    private CloseTimeoutTask mCloseTimeoutTask;
    private boolean mForcedRebuffer;
    private MediaPlayerHelper mHelper;
    private boolean mInPlayback;
    private volatile com.netflix.mediaclient.media.JPlayer.JPlayer.JplayerListener mJPlayerListener;
    private long mLastBandwidthCheck;
    private IMedia mMedia;
    private GenericMediaEventListener mMediaEventListener;
    private long mMovieId;
    private final int mNetworkProfile = 2;
    private Nrdp mNrdp;
    private PlayContext mPlayContext;
    private PlayParamsReceiver mPlayParamsRecvr;
    private ExecutorService mPlayerExecutor;
    private PlayerListenerManager mPlayerListenerManager;
    private PlayerType mPlayerType;
    private boolean mScreenOnWhilePlaying;
    private StartPlayTimeoutTask mStartPlayTimeoutTask;
    private volatile int mState;
    private boolean mStayAwake;
    private SubtitleConfiguration mSubtitleConfiguration;
    private SubtitleParser mSubtitles;
    private Surface mSurface;
    private Timer mTimer;
    private final android.os.PowerManager.WakeLock mWakeLock = null;
    private boolean muted;
    private final Runnable onCloseRunnable = new Runnable() {

        final PlayerAgent this$0;

        public void run()
        {
label0:
            {
                synchronized (PlayerAgent.this)
                {
                    if (mStartPlayTimeoutTask != null)
                    {
                        mStartPlayTimeoutTask.cancel();
                    }
                    if (mTimer != null)
                    {
                        mTimer.purge();
                    }
                    toOpenAfterClose = false;
                    if (mState == 5 || mState == 0 || mState == 3)
                    {
                        toCancelOpen = true;
                    }
                    if (mState != 4 && mState != 8)
                    {
                        break label0;
                    }
                    Log.d(PlayerAgent.TAG, "close() pending or already closed");
                }
                return;
            }
            close2();
            playeragent;
            JVM INSTR monitorexit ;
            if (mTimer != null)
            {
                mCloseTimeoutTask = new CloseTimeoutTask();
                mTimer.schedule(mCloseTimeoutTask, 10000L);
                return;
            } else
            {
                return;
            }
            exception;
            playeragent;
            JVM INSTR monitorexit ;
            throw exception;
        }

            
            {
                this$0 = PlayerAgent.this;
                super();
            }
    };
    private final Runnable onOpenRunnable = new Runnable() {

        final PlayerAgent this$0;

        public void run()
        {
            PlayerAgent playeragent = PlayerAgent.this;
            playeragent;
            JVM INSTR monitorenter ;
            mMedia.reset();
            prevEndPosition = -1;
            validPtsRecieved = false;
            mInPlayback = false;
            inPlaybackSession = false;
            splashScreenRemoved = false;
            preparedCompleted = false;
            seekedToPosition = Long.valueOf(mBookmark).intValue();
            mBufferingCompleted = false;
            pendingError = null;
            if (mTimer != null)
            {
                mStartPlayTimeoutTask = new StartPlayTimeoutTask();
                mTimer.schedule(mStartPlayTimeoutTask, 30000L);
            }
            if (Log.isLoggable(PlayerAgent.TAG, 3))
            {
                Log.d(PlayerAgent.TAG, (new StringBuilder()).append("Player state is ").append(mState).toString());
            }
            if (mState != 4 && mState != -1)
            {
                break MISSING_BLOCK_LABEL_581;
            }
            Log.d(PlayerAgent.TAG, "Player state was CLOSED or CREATED, cancel timeout task!");
            mState = 5;
            if (mStartPlayTimeoutTask == null) goto _L2; else goto _L1
_L1:
            boolean flag = mStartPlayTimeoutTask.cancel();
            if (Log.isLoggable(PlayerAgent.TAG, 3))
            {
                Log.d(PlayerAgent.TAG, (new StringBuilder()).append("Task was canceled ").append(flag).toString());
            }
_L7:
            if (mTimer == null) goto _L4; else goto _L3
_L3:
            int i = mTimer.purge();
            if (Log.isLoggable(PlayerAgent.TAG, 3))
            {
                Log.d(PlayerAgent.TAG, (new StringBuilder()).append("Canceled tasks: ").append(i).toString());
            }
_L8:
            Object obj;
            reloadPlayer();
            mMedia.setStreamingQoe(getConfigurationAgent().getStreamingQoe());
            mMedia.open(mMovieId, mPlayContext, getCurrentNetType());
            toOpenAfterClose = false;
            obj = getConfigurationAgent().getDeviceCategory().getValue();
            if (!com.netflix.mediaclient.javabridge.invoke.media.Open.NetType.wifi.equals(getCurrentNetType())) goto _L6; else goto _L5
_L5:
            Log.i(PlayerAgent.TAG, "Setting WifiApInfo");
            mMedia.setWifiApsInfo(getContext(), ((String) (obj)), true);
_L9:
            sessionInitRxBytes = ConnectivityUtils.getApplicationRx();
            sessionInitTxBytes = ConnectivityUtils.getApplicationTx();
            ptsTicker = -1;
_L10:
            return;
_L2:
            Log.w(PlayerAgent.TAG, "Timer task was null!!!");
              goto _L7
            obj;
            playeragent;
            JVM INSTR monitorexit ;
            throw obj;
_L4:
            Log.w(PlayerAgent.TAG, "Timer was null!!!");
              goto _L8
_L6:
            mMedia.setWifiApsInfo(getContext(), ((String) (obj)), false);
              goto _L9
            toOpenAfterClose = true;
            Log.d(PlayerAgent.TAG, "invokeMethod(open) has to wait...");
              goto _L10
        }

            
            {
                this$0 = PlayerAgent.this;
                super();
            }
    };
    private final Runnable onPlayRunnable = new Runnable() {

        final PlayerAgent this$0;

        public void run()
        {
            PlayerAgent playeragent = PlayerAgent.this;
            playeragent;
            JVM INSTR monitorenter ;
            if (mState == 3)
            {
                break MISSING_BLOCK_LABEL_30;
            }
            toPlayAfterStop = true;
_L2:
            return;
            playWithBookmarkCheck();
            if (true) goto _L2; else goto _L1
_L1:
            Exception exception;
            exception;
            playeragent;
            JVM INSTR monitorexit ;
            throw exception;
        }

            
            {
                this$0 = PlayerAgent.this;
                super();
            }
    };
    private final Runnable onSeekRunnable = new Runnable() {

        final PlayerAgent this$0;

        public void run()
        {
            PlayerAgent playeragent = PlayerAgent.this;
            playeragent;
            JVM INSTR monitorenter ;
            int j;
            int k;
            prevEndPosition = getCurrentPositionMs();
            validPtsRecieved = false;
            seeking = true;
            mInPlayback = false;
            k = getDuration();
            j = seekedToPosition;
            if (seekedToPosition + 10000 < k || k <= 0) goto _L2; else goto _L1
_L1:
            Log.d(PlayerAgent.TAG, "seek to close to EOS, defaulting to 10 seconss before EOS.");
            int i = k - 10000;
_L4:
            mMedia.seekTo(i, mForcedRebuffer);
            seekedToPosition = i;
            mBufferingCompleted = false;
            playeragent;
            JVM INSTR monitorexit ;
            return;
_L2:
            i = j;
            if (!Log.isLoggable(PlayerAgent.TAG, 3))
            {
                continue; /* Loop/switch isn't completed */
            }
            Log.d(PlayerAgent.TAG, (new StringBuilder()).append("seek to position ").append(seekedToPosition).append(", duration ").append(k).toString());
            i = j;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            playeragent;
            JVM INSTR monitorexit ;
            throw exception;
        }

            
            {
                this$0 = PlayerAgent.this;
                super();
            }
    };
    private NccpError pendingError;
    private final BroadcastReceiver playerChangesReceiver = new BroadcastReceiver() {

        final PlayerAgent this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (Log.isLoggable(PlayerAgent.TAG, 2))
            {
                Log.v(PlayerAgent.TAG, (new StringBuilder()).append("Received intent ").append(intent).toString());
            }
            context = intent.getAction();
            if ("com.netflix.mediaclient.intent.action.PLAYER_SUBTITLE_CONFIG_CHANGED".equals(context))
            {
                Log.d(PlayerAgent.TAG, "subtitle configuration is changed");
                updateSubtitleSettingsFromQaLocalOverride(intent.getIntExtra("lookupType", -1));
            } else
            if (Log.isLoggable(PlayerAgent.TAG, 3))
            {
                Log.d(PlayerAgent.TAG, (new StringBuilder()).append("We do not support action ").append(context).toString());
                return;
            }
        }

            
            {
                this$0 = PlayerAgent.this;
                super();
            }
    };
    private boolean preparedCompleted;
    private int prevEndPosition;
    private int ptsTicker;
    private int seekedToPosition;
    private boolean seeking;
    private long sessionInitRxBytes;
    private long sessionInitTxBytes;
    private boolean splashScreenRemoved;
    private boolean toCancelOpen;
    private volatile boolean toOpenAfterClose;
    private boolean toPlayAfterStop;
    private boolean validPtsRecieved;
    private final UserAgentWebCallback webClientCallback = new SimpleUserAgentWebCallback() {

        final PlayerAgent this$0;

        public void onDummyWebCallDone(int i)
        {
            ignoreErrorsWhileActionId12IsProcessed = false;
            if (i == 0)
            {
                Log.d(PlayerAgent.TAG, (new StringBuilder()).append("Dummy webcall completed with statusCode=").append(i).toString());
                NccpError nccperror = mActionId12Error;
                mActionId12Error = null;
                handlePlayerListener(mPlayerListenerManager.getPlayerListenerRestartPlaybackHandler(), new Object[] {
                    nccperror
                });
                return;
            } else
            {
                Log.e(PlayerAgent.TAG, (new StringBuilder()).append("Dummy webcall completed  failed (skipping user info update) with statusCode=").append(i).toString());
                handlePlayerListener(mPlayerListenerManager.getPlayerListenerOnNccpErrorHandler(), new Object[] {
                    mActionId12Error
                });
                return;
            }
        }

            
            {
                this$0 = PlayerAgent.this;
                super();
            }
    };

    public PlayerAgent()
    {
        mPlayerListenerManager = new PlayerListenerManager(this);
        mBitrateCap = -1;
        seeking = false;
        validPtsRecieved = false;
        preparedCompleted = false;
        splashScreenRemoved = false;
        mBufferingCompleted = false;
        ignoreErrorsWhileActionId12IsProcessed = false;
        ptsTicker = 0;
        mState = -1;
        toPlayAfterStop = false;
        toOpenAfterClose = false;
        toCancelOpen = false;
        muted = false;
    }

    private void clearBifs()
    {
        Log.d(TAG, "preRelease()");
        if (mBifManager != null)
        {
            mBifManager.release();
            mBifManager = null;
        }
    }

    private void close2()
    {
        this;
        JVM INSTR monitorenter ;
        mState = 8;
        int i = (int)((ConnectivityUtils.getApplicationRx() - sessionInitRxBytes) / 1024L);
        int j = (int)((ConnectivityUtils.getApplicationTx() - sessionInitTxBytes) / 1024L);
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("Bytes Tx: ").append(j).toString());
            Log.d(TAG, (new StringBuilder()).append("Bytes Rx: ").append(i).toString());
        }
        mMedia.setBytesReport(j, i);
        mMedia.close();
        mNrdp.getLog().flush();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private SubtitleConfiguration findSubtitleConfiguration()
    {
        SubtitleConfiguration subtitleconfiguration = null;
        Object obj = getConfigurationAgent();
        if (obj != null)
        {
            subtitleconfiguration = ((com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface) (obj)).getSubtitleConfiguration();
        }
        obj = subtitleconfiguration;
        if (subtitleconfiguration == null)
        {
            obj = SubtitleConfiguration.DEFAULT;
        }
        return ((SubtitleConfiguration) (obj));
    }

    private com.netflix.mediaclient.javabridge.invoke.media.Open.NetType getCurrentNetType()
    {
        NetworkInfo networkinfo = ConnectivityUtils.getActiveNetworkInfo(getContext());
        if (networkinfo == null)
        {
            return null;
        }
        switch (networkinfo.getType())
        {
        default:
            return com.netflix.mediaclient.javabridge.invoke.media.Open.NetType.mobile;

        case 9: // '\t'
            return com.netflix.mediaclient.javabridge.invoke.media.Open.NetType.wired;

        case 1: // '\001'
            return com.netflix.mediaclient.javabridge.invoke.media.Open.NetType.wifi;
        }
    }

    private void handleAudioTrackChanged(AudioTrackChanged audiotrackchanged)
    {
        Log.d(TAG, "MEDIA_AUDIO_CHANGE 53");
        handlePlayerListener(mPlayerListenerManager.getPlayerListenerOnAudioChangeHandler(), new Object[] {
            Integer.valueOf(audiotrackchanged.getTrackIndex())
        });
    }

    private void handleBufferRange(BufferRange bufferrange)
    {
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("MEDIA_BANDWIDTH_UPDATE :").append(bufferrange.getBandwidth()).toString());
        }
        handlePlayerListener(mPlayerListenerManager.getPlayerListenerOnBandwidthChangeHandler(), new Object[] {
            Integer.valueOf(bufferrange.getBandwidth())
        });
    }

    private void handleBufferingComplete()
    {
        Log.d(TAG, "BUFFERING COMPLETE 100");
        mBufferingCompleted = true;
        handlePlayback();
    }

    private void handleBufferring(Buffering buffering)
    {
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("MEDIA_BANDWIDTH_UPDATE :").append(buffering.getPercentage()).toString());
        }
        handlePlayerListener(mPlayerListenerManager.getPlayerListenerOnBufferingUpdateHandler(), new Object[] {
            Integer.valueOf(buffering.getPercentage())
        });
    }

    private void handleEndOfPlayback()
    {
        Log.d(TAG, "MEDIA_PLAYBACK_COMPLETE 2");
        handlePlayerListener(mPlayerListenerManager.getPlayerListenerOnCompletionHandler(), new Object[0]);
    }

    private void handleError(NccpError nccperror)
    {
        Log.d(TAG, "Nccp error receieved");
        if (ignoreErrorsWhileActionId12IsProcessed) goto _L2; else goto _L1
_L1:
        if (nccperror instanceof NccpActionId) goto _L4; else goto _L3
_L3:
        Log.w(TAG, "We will ignore received NccpNetworkingError/NetworkError, since if we need to handle it will be followed with action ID.");
_L2:
        return;
_L4:
        Object obj;
        obj = (NccpActionId)nccperror;
        if (((NccpActionId) (obj)).getActionId() == 11)
        {
            Log.w(TAG, "ActionID 11 NFErr_MC_Abort Playback.");
            handlePlayerListener(mPlayerListenerManager.getPlayerListenerOnNccpErrorHandler(), new Object[] {
                nccperror
            });
            return;
        }
        if (!inPlaybackSession)
        {
            break; /* Loop/switch isn't completed */
        }
        Log.d(TAG, "We are in playback. Ignore all errors, except 11.");
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("Error in Playback, being ignored ").append(obj).toString());
            return;
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (((NccpActionId) (obj)).getActionId() == 12)
        {
            Log.w(TAG, "ActionID 12 NFErr_MC_StaleCredentials");
            ignoreErrorsWhileActionId12IsProcessed = true;
            mActionId12Error = nccperror;
            getUserAgent().doDummyWebCall(webClientCallback);
            return;
        }
        Log.d(TAG, "Handle all errors except if they are for background events, such as logblob, ping, playdata or heartbeat...");
        obj = ((NccpActionId) (obj)).getTransaction();
        if ("heartbeat".equalsIgnoreCase(((String) (obj))) || "logblob".equalsIgnoreCase(((String) (obj))) || "playdata".equalsIgnoreCase(((String) (obj))) || "ping".equalsIgnoreCase(((String) (obj))))
        {
            if (Log.isLoggable(TAG, 3))
            {
                Log.d(TAG, (new StringBuilder()).append("Ignore action id on ").append(((String) (obj))).append(". We will deal with only licence and authorize here when not in playback").toString());
                return;
            }
        } else
        {
            if ("background".equals(nccperror.getType()))
            {
                Log.d(TAG, "We received background nccp error. Ignoring!");
                return;
            }
            if (Log.isLoggable(TAG, 3))
            {
                Log.d(TAG, (new StringBuilder()).append("Handling error: ").append(nccperror).toString());
            }
            handlePlayerListener(mPlayerListenerManager.getPlayerListenerOnNccpErrorHandler(), new Object[] {
                nccperror
            });
            return;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    private void handleGenericMediaEvent(GenericMediaEvent genericmediaevent)
    {
        genericmediaevent = genericmediaevent.getType();
        if (com.netflix.mediaclient.javabridge.ui.IMedia.MediaEventEnum.media_openComplete.getName().equalsIgnoreCase(genericmediaevent))
        {
            handlePrepare();
        } else
        {
            if (com.netflix.mediaclient.javabridge.ui.IMedia.MediaEventEnum.media_endOfStream.getName().equalsIgnoreCase(genericmediaevent))
            {
                handleEndOfPlayback();
                return;
            }
            if (com.netflix.mediaclient.javabridge.ui.IMedia.MediaEventEnum.media_bufferingComplete.getName().equalsIgnoreCase(genericmediaevent))
            {
                handleBufferingComplete();
                return;
            }
            if (com.netflix.mediaclient.javabridge.ui.IMedia.MediaEventEnum.media_underflow.getName().equalsIgnoreCase(genericmediaevent))
            {
                handleUnderflow();
                return;
            }
            if (Log.isLoggable(TAG, 6))
            {
                Log.e(TAG, (new StringBuilder()).append("Tags not handled yet ").append(genericmediaevent).toString());
                return;
            }
        }
    }

    private void handleMediaError(Error error)
    {
        Log.d(TAG, "Media error receieved");
        if (!ignoreErrorsWhileActionId12IsProcessed)
        {
            handlePlayerListener(mPlayerListenerManager.getPlayerListenerOnMediaErrorHandler(), new Object[] {
                error
            });
        }
    }

    private void handleMediaWarning(Warning warning)
    {
        Log.d(TAG, "Media warning receieved");
        if (warning.containsInStack("NFErr_MC_SubtitleFailure"))
        {
            Log.e(TAG, "=====> Subtitle failed!");
            handlePlayerListener(mPlayerListenerManager.getPlayerListenerOnSubtitleFailedHandler(), new Object[0]);
        }
    }

    private void handlePlayback()
    {
        this;
        JVM INSTR monitorenter ;
        Log.d(TAG, "handlePlayback starts...");
        if (!seeking)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        Log.d(TAG, "MEDIA_SEEK_COMPLETE 4");
        seeking = false;
        handlePlayerListener(mPlayerListenerManager.getPlayerListenerOnSeekCompleteHandler(), new Object[0]);
_L1:
        Log.d(TAG, "handlePlayback end");
        this;
        JVM INSTR monitorexit ;
        return;
        Log.d(TAG, "MEDIA_PLAYBACK_STARTED 6");
        handlePlayerListener(mPlayerListenerManager.getPlayerListenerOnPlayingHandler(), new Object[0]);
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    private transient void handlePlayerListener(final PlayerListenerManager.PlayerListenerHandler handler, final Object arguments[])
    {
        PlayerListenerManager playerlistenermanager = mPlayerListenerManager;
        playerlistenermanager;
        JVM INSTR monitorenter ;
        Iterator iterator = mPlayerListenerManager.getListeners().iterator();
_L2:
        final com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener listener;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_86;
            }
            listener = (com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener)iterator.next();
        } while (listener == null);
        if (!listener.isListening()) goto _L2; else goto _L1
_L1:
        getMainHandler().post(new Runnable() {

            final PlayerAgent this$0;
            final Object val$arguments[];
            final PlayerListenerManager.PlayerListenerHandler val$handler;
            final com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener val$listener;

            public void run()
            {
                handler.handle(listener, arguments);
            }

            
            {
                this$0 = PlayerAgent.this;
                handler = playerlistenerhandler;
                listener = playerlistener;
                arguments = aobj;
                super();
            }
        });
          goto _L2
        handler;
        playerlistenermanager;
        JVM INSTR monitorexit ;
        throw handler;
        playerlistenermanager;
        JVM INSTR monitorexit ;
    }

    private void handlePrepare()
    {
        this;
        JVM INSTR monitorenter ;
        if (!preparedCompleted) goto _L2; else goto _L1
_L1:
        Log.w(TAG, "openComplete already executed");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.d(TAG, "handle openComplete starts...");
        preparedCompleted = true;
        if (!toCancelOpen)
        {
            Log.d(TAG, "handle openComplete notifying client");
            handlePlayerListener(mPlayerListenerManager.getPlayerListenerPrepareHandler(), new Object[0]);
            if (Log.isLoggable(TAG, 3))
            {
                Log.d(TAG, (new StringBuilder()).append("MEDIA_SET_VIDEO_SIZE 5, w ").append(mMedia.getVideoWidth()).append(", h ").append(mMedia.getVideoHeight()).toString());
            }
            Log.d(TAG, "handle openComplete end");
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void handleRemoveSubtitle(RemoveSubtitle removesubtitle)
    {
        Log.d(TAG, "MEDIA_SUBTITLE_REMOVE 52");
        handlePlayerListener(mPlayerListenerManager.getPlayerListenerOnSubtitleRemoveHandler(), new Object[0]);
    }

    private void handleShowSubtitle(ShowSubtitle showsubtitle)
    {
        Log.d(TAG, "MEDIA_SUBTITLE_SHOW 51");
        String s = showsubtitle.getText();
        showsubtitle = s;
        if (s == null)
        {
            showsubtitle = "";
        }
        handlePlayerListener(mPlayerListenerManager.getPlayerListenerOnSubtitleShowHandler(), new Object[] {
            showsubtitle
        });
    }

    private void handleStatechanged(Statechanged statechanged)
    {
        this;
        JVM INSTR monitorenter ;
        statechanged.getState();
        JVM INSTR tableswitch 0 4: default 189
    //                   0 43
    //                   1 77
    //                   2 103
    //                   3 129
    //                   4 159;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.d(TAG, "State OPENING");
        if (mState != 0)
        {
            transitToOpeningState();
            mState = 0;
        }
          goto _L1
        statechanged;
        this;
        JVM INSTR monitorexit ;
        throw statechanged;
_L3:
        Log.d(TAG, "State PLAYING");
        if (mState != 1)
        {
            mState = 1;
        }
          goto _L1
_L4:
        Log.d(TAG, "State PAUSED");
        if (mState != 2)
        {
            mState = 2;
        }
          goto _L1
_L5:
        Log.d(TAG, "State STOPPED");
        if (mState != 3)
        {
            transitToStoppedState();
            mState = 3;
        }
          goto _L1
_L6:
        Log.d(TAG, "State CLOSED");
        if (mState != 4)
        {
            transitToClosedState();
            mState = 4;
        }
          goto _L1
    }

    private void handleSubtitleData(final SubtitleData event)
    {
        Log.d(TAG, "MEDIA_SUBTITLE_DATA 100");
        (new BackgroundTask()).execute(new Runnable() {

            final PlayerAgent this$0;
            final SubtitleData val$event;

            public void run()
            {
                com.netflix.mediaclient.service.player.subtitles.TextStyle textstyle;
                Object obj;
                Log.d(PlayerAgent.TAG, "Subtitles metadata update started.");
                textstyle = getUserAgent().getUserSubtitlePreferences();
                obj = getUserAgent().getSubtitleDefaults();
                obj = new SubtitleParser(mMedia.getDisplayAspectRatio(), textstyle, ((com.netflix.mediaclient.service.player.subtitles.TextStyle) (obj)));
                synchronized (PlayerAgent.this)
                {
                    mSubtitles = ((SubtitleParser) (obj));
                }
                ((SubtitleParser) (obj)).parse(event);
_L2:
                Log.d(PlayerAgent.TAG, "Subtitles metadata updated.");
                return;
                exception;
                playeragent;
                JVM INSTR monitorexit ;
                throw exception;
                Throwable throwable;
                throwable;
_L3:
                Log.e(PlayerAgent.TAG, "We failed to parse subtitle metadata", throwable);
                getService().getClientLogging().getErrorLogging().logHandledException(new RuntimeException("We failed to parse subtitle metadata", throwable));
                if (true) goto _L2; else goto _L1
_L1:
                throwable;
                  goto _L3
            }

            
            {
                this$0 = PlayerAgent.this;
                event = subtitledata;
                super();
            }
        });
    }

    private void handleSubtitleUpdate(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (!com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleOutputMode.EVENTS.equals(mSubtitleConfiguration.getMode())) goto _L2; else goto _L1
_L1:
        Log.d(TAG, "Subtitle output mode Events, do nothing");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, "Subtitle output mode XML, send data");
            Log.d(TAG, (new StringBuilder()).append("Update PTS received ").append(i).toString());
        }
        if (mMedia.getCurrentSubtitleTrack() != null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        Log.d(TAG, "Subtitles are not visible, do not send any update");
          goto _L3
        Exception exception;
        exception;
        throw exception;
        SubtitleParser subtitleparser = mSubtitles;
        if (subtitleparser != null)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        Log.d(TAG, "Subtitle data is not available.");
          goto _L3
label0:
        {
            if (subtitleparser.isReady())
            {
                break label0;
            }
            Log.d(TAG, "Subtitle data is not ready yet!");
        }
          goto _L3
label1:
        {
            if (isPlaying())
            {
                break label1;
            }
            Log.d(TAG, "Not playing, do NOT send subtitle screen update");
        }
          goto _L3
label2:
        {
            if (canUpdatePosition(i))
            {
                break label2;
            }
            Log.d(TAG, "Can not update position, do NOT send subtitle screen update");
        }
          goto _L3
        handlePlayerListener(mPlayerListenerManager.getPlayerListenerOnSubtitleChangeHandler(), new Object[] {
            subtitleparser.getSubtitlesForPosition(i)
        });
          goto _L3
    }

    private void handleUnderflow()
    {
        Log.w(TAG, "MEDIA_PLAYBACK_STALLED 7");
        mBufferingCompleted = false;
        handlePlayerListener(mPlayerListenerManager.getPlayerListenerOnStalledHandler(), new Object[0]);
    }

    private void handleUpdatePts(int i)
    {
        mInPlayback = true;
        inPlaybackSession = true;
        if (!splashScreenRemoved)
        {
            muteAudio(false);
            splashScreenRemoved = true;
            handlePlayerListener(mPlayerListenerManager.getPlayerListenerOnStartedHandler(), new Object[0]);
        }
        if (mInPlayback && mBifManager == null)
        {
            PlayoutMetadata playoutmetadata = getPlayoutMetadata();
            if (playoutmetadata != null && playoutmetadata.targetBitRate >= 500)
            {
                startBif();
            }
        }
        handleSubtitleUpdate(i);
        if (isPlaying())
        {
            int j = ptsTicker + 1;
            ptsTicker = j;
            if (j % 60 == 0 && com.netflix.mediaclient.javabridge.invoke.media.Open.NetType.wifi.equals(getCurrentNetType()))
            {
                mMedia.setWifiLinkSpeed(getContext());
                ptsTicker = 0;
            }
        }
        handlePlayerListener(mPlayerListenerManager.getPlayerListenerOnUpdatePtsHandler(), new Object[] {
            Integer.valueOf(i)
        });
    }

    private void muteAudio(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (flag == muted || getContext() == null) goto _L2; else goto _L1
_L1:
        AudioManager audiomanager = (AudioManager)getContext().getSystemService("audio");
        if (audiomanager == null) goto _L2; else goto _L3
_L3:
        audiomanager.setStreamMute(3, flag);
        muted = flag;
        if (!flag) goto _L5; else goto _L4
_L4:
        Log.d(TAG, "MUTED");
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L5:
        Log.d(TAG, "UN-MUTED");
        if (true) goto _L2; else goto _L6
_L6:
        Exception exception;
        exception;
        throw exception;
    }

    private void playWithBookmarkCheck()
    {
        seekedToPosition = Long.valueOf(mBookmark).intValue();
        int i = getDuration();
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("movie duration = ").append(i).append(", and bookmark = ").append(seekedToPosition).toString());
        }
        mState = 6;
        mMedia.play(mBookmark);
        toPlayAfterStop = false;
    }

    private void preparePlayerType(PlayerType playertype)
    {
        if (playertype == PlayerType.device10 || playertype == PlayerType.device11)
        {
            mHelper.prepareJPlayer(mMedia, mSurface, mJPlayerListener, isPropertyStreamingVideoDrs(), getConfigurationAgent().getJPlayerConfig());
            return;
        } else
        {
            mHelper.prepare(mMedia, mSurface, getContext());
            return;
        }
    }

    private void registerReceivers()
    {
    }

    private void release()
    {
        Log.d(TAG, "release()");
        if (mHelper != null)
        {
            mHelper.release();
            mHelper = null;
        }
        if (mJPlayerListener != null)
        {
            mJPlayerListener = null;
        }
        mBookmark = 0L;
        preparedCompleted = false;
        splashScreenRemoved = false;
        seekedToPosition = 0;
        mBufferingCompleted = false;
        pendingError = null;
        muteAudio(false);
        clearBifs();
    }

    private void startBif()
    {
        this;
        JVM INSTR monitorenter ;
        if (mBifManager == null && mMedia.getTrickplayUrlList() != null)
        {
            com.netflix.mediaclient.media.TrickplayUrl atrickplayurl[] = mMedia.getTrickplayUrlList();
            mBifManager = new BifManager(getContext(), atrickplayurl, seekedToPosition);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void transitToClosedState()
    {
        if (mCloseTimeoutTask != null)
        {
            mCloseTimeoutTask.cancel();
        }
        if (mTimer != null)
        {
            mTimer.purge();
        }
        muteAudio(false);
        toCancelOpen = false;
        toPlayAfterStop = false;
        if (toOpenAfterClose)
        {
            toOpenAfterClose = false;
            mState = 5;
            if (mStartPlayTimeoutTask != null)
            {
                mStartPlayTimeoutTask.cancel();
            }
            if (mTimer != null)
            {
                mTimer.purge();
            }
            reloadPlayer();
            clearBifs();
            mMedia.setStreamingQoe(getConfigurationAgent().getStreamingQoe());
            mMedia.open(mMovieId, mPlayContext, getCurrentNetType());
            return;
        } else
        {
            release();
            handlePlayerListener(mPlayerListenerManager.getPlayerListenerPlaybackClosedHandler(), new Object[0]);
            return;
        }
    }

    private void transitToOpeningState()
    {
        Log.d(TAG, "MP: Set audio bitrange to 64 Kbps");
        mMedia.setAudioBitrateRange(BitrateRangeFactory.getAudioBitrateRange());
        mMedia.setThrotteled(false);
        mMedia.setNetworkProfile(2);
        muteAudio(true);
    }

    private void transitToStoppedState()
    {
        if (mState == 0)
        {
            mMedia.setAudioBitrateRange(BitrateRangeFactory.getAudioBitrateRange());
            mMedia.setVideoBitrateRanges(getConfigurationAgent().getVideoBitrateRange());
            mMedia.setThrotteled(false);
            mMedia.setNetworkProfile(2);
        }
        if (toPlayAfterStop)
        {
            playWithBookmarkCheck();
        }
    }

    private void unRegisterReceivers()
    {
    }

    private void updateSubtitleSettings(boolean flag)
    {
        SubtitleConfiguration subtitleconfiguration = findSubtitleConfiguration();
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("Subtitle configuration was ").append(mSubtitleConfiguration).toString());
            Log.d(TAG, (new StringBuilder()).append("Sets subtitle configuration to ").append(subtitleconfiguration).toString());
        }
        if (mSubtitleConfiguration == subtitleconfiguration && !flag)
        {
            if (Log.isLoggable(TAG, 3))
            {
                Log.d(TAG, "Already used subtitle configuration, do nothing ");
            }
            return;
        }
        if (flag)
        {
            Log.d(TAG, "Forced set of subtitle configuration");
        }
        mMedia.setSubtitleProfile(subtitleconfiguration.getProfile());
        mMedia.setSubtitleOutputMode(subtitleconfiguration.getMode());
        mSubtitleConfiguration = subtitleconfiguration;
    }

    private void updateSubtitleSettingsFromQaLocalOverride(int i)
    {
        SubtitleConfiguration subtitleconfiguration = SubtitleConfiguration.lookup(i);
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("Received local override ").append(i).toString());
            Log.d(TAG, (new StringBuilder()).append("Subtitle configuration was ").append(mSubtitleConfiguration).toString());
            Log.d(TAG, (new StringBuilder()).append("Sets subtitle configuration to ").append(subtitleconfiguration).toString());
        }
        if (mSubtitleConfiguration == subtitleconfiguration)
        {
            if (Log.isLoggable(TAG, 3))
            {
                Log.d(TAG, "Already used subtitle configuration, do nothing ");
            }
            return;
        } else
        {
            mMedia.setSubtitleProfile(subtitleconfiguration.getProfile());
            mMedia.setSubtitleOutputMode(subtitleconfiguration.getMode());
            mSubtitleConfiguration = subtitleconfiguration;
            return;
        }
    }

    public void addPlayerListener(com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener playerlistener)
    {
        mPlayerListenerManager.addPlayerListener(playerlistener);
    }

    public boolean canUpdatePosition(int i)
    {
        if (!seeking) goto _L2; else goto _L1
_L1:
        Log.d(TAG, "canUpdatePosition:: seeking in progress, can not update position");
_L4:
        return false;
_L2:
        if (i < seekedToPosition)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("canUpdatePosition:: pts [").append(i).append("] >= seekedToPosition [").append(seekedToPosition).append("] , can update position").toString());
        }
        if (validPtsRecieved)
        {
            break MISSING_BLOCK_LABEL_176;
        }
        if (prevEndPosition <= seekedToPosition || i < prevEndPosition - 2000)
        {
            break; /* Loop/switch isn't completed */
        }
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("canUpdatePosition:: pts [").append(i).append("] >= prevEndPosition [").append(prevEndPosition).append("] , invlalid PTS").toString());
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        validPtsRecieved = true;
        return true;
        if (!Log.isLoggable(TAG, 5)) goto _L4; else goto _L5
_L5:
        Log.w(TAG, (new StringBuilder()).append("canUpdatePosition:: pts [").append(i).append("] < seekedToPosition [").append(seekedToPosition).append("] , can NOT update position").toString());
        return false;
    }

    public void close()
    {
        Log.d(TAG, "close()");
        mSurface = null;
        mSubtitles = null;
        inPlaybackSession = false;
        muteAudio(true);
        mPlayerExecutor.execute(onCloseRunnable);
    }

    public void destroy()
    {
        unRegisterReceivers();
        if (mPlayerExecutor != null)
        {
            mPlayerExecutor.shutdown();
        }
        super.destroy();
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("Destroying ").append(getClass().getSimpleName()).toString());
        }
    }

    protected void doInit()
    {
        mNrdp = getNrdController().getNrdp();
        if (mNrdp == null || !mNrdp.isReady())
        {
            initCompleted(-4);
            Log.e(TAG, "NRDP is NOT READY");
            return;
        }
        mMedia = mNrdp.getMedia();
        mMediaEventListener = new GenericMediaEventListener();
        com.netflix.mediaclient.javabridge.ui.IMedia.MediaEventEnum amediaeventenum[] = com.netflix.mediaclient.javabridge.ui.IMedia.MediaEventEnum.values();
        int j = amediaeventenum.length;
        for (int i = 0; i < j; i++)
        {
            com.netflix.mediaclient.javabridge.ui.IMedia.MediaEventEnum mediaeventenum = amediaeventenum[i];
            if (Log.isLoggable(TAG, 3))
            {
                Log.d(TAG, (new StringBuilder()).append("Registering as listener for ").append(mediaeventenum.getName()).toString());
            }
            mMedia.addEventListener(mediaeventenum.getName(), mMediaEventListener);
        }

        mPlayerType = PlayerTypeFactory.getCurrentType(getContext());
        mState = -1;
        toCancelOpen = false;
        if (mPlayerType != null) goto _L2; else goto _L1
_L1:
        Log.e(TAG, "This should not happen, player type was null at this point! Use default.");
        mPlayerType = PlayerTypeFactory.findDefaultPlayerType();
_L4:
        mHelper = MediaPlayerHelperFactory.getInstance(mPlayerType);
        mBitrateCap = BitrateRangeFactory.getBitrateCap(getContext());
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("Current bitrate cap setting ").append(mBitrateCap).toString());
        }
        Log.d(TAG, "MP: Set audio bitrange to 64 Kbps");
        mMedia.setAudioBitrateRange(BitrateRangeFactory.getAudioBitrateRange());
        mMedia.setStreamingQoe(getConfigurationAgent().getStreamingQoe());
        mMedia.setThrotteled(false);
        mMedia.setNetworkProfile(2);
        Log.d(TAG, "MP: Set to Mobile network Profile");
        updateSubtitleSettings(true);
        mTimer = new Timer("watchdog timer");
        registerReceivers();
        mPlayerExecutor = Executors.newSingleThreadExecutor();
        initCompleted(0);
        return;
_L2:
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("Player type is ").append(mPlayerType.getDescription()).toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    void excuteOnPlayExecutor(Runnable runnable)
    {
        mPlayerExecutor.execute(runnable);
    }

    public AudioSubtitleDefaultOrderInfo[] getAudioSubtitleDefaultOrderInfo()
    {
        return mMedia.getAudioSubtitleDefaultOrderInfo();
    }

    public AudioSource[] getAudioTrackList()
    {
        return mMedia.getAudioTrackList();
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

    public AudioSource getCurrentAudioTrack()
    {
        return mMedia.getCurrentAudioTrack();
    }

    public int getCurrentPositionMs()
    {
        return mMedia.getMediaPosition();
    }

    public int getCurrentProgress()
    {
        int j = mMedia.getCurrentPosition();
        int i;
        if (j < seekedToPosition)
        {
            i = seekedToPosition;
        } else
        {
            i = j;
            if (!validPtsRecieved)
            {
                if (prevEndPosition - 2000 > seekedToPosition && j >= seekedToPosition + 1500)
                {
                    if (Log.isLoggable(TAG, 3))
                    {
                        Log.d(TAG, (new StringBuilder()).append("pts [").append(j).append("] >= prevEndPosition [").append(prevEndPosition).append("] , invlalid PTS").toString());
                    }
                    return seekedToPosition;
                } else
                {
                    validPtsRecieved = true;
                    return j;
                }
            }
        }
        return i;
    }

    public Subtitle getCurrentSubtitleTrack()
    {
        return mMedia.getCurrentSubtitleTrack();
    }

    public int getDuration()
    {
        return mMedia.getDuration();
    }

    public PlayoutMetadata getPlayoutMetadata()
    {
        return mMedia.getPlayoutMetadata();
    }

    public SubtitleConfiguration getSubtitleConfiguration()
    {
        return mSubtitleConfiguration;
    }

    public com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleProfile getSubtitleProfileFromMetadata()
    {
        SubtitleParser subtitleparser = mSubtitles;
        if (subtitleparser != null)
        {
            return subtitleparser.getSubtitleProfile();
        } else
        {
            return null;
        }
    }

    public Subtitle[] getSubtitleTrackList()
    {
        return mMedia.getSubtitleTrackList();
    }

    public int getVideoHeight()
    {
        return mMedia.getVideoHeight();
    }

    public int getVideoWidth()
    {
        return mMedia.getVideoWidth();
    }

    public void handleConnectivityChange(Intent intent)
    {
        if (ConnectivityUtils.isNetworkTypeCellular(getContext()))
        {
            setVideoStreamingBufferSize(0x15f90);
            return;
        } else
        {
            setVideoStreamingBufferSize(0x493e0);
            return;
        }
    }

    public boolean isBufferingCompleted()
    {
        return mBufferingCompleted && mInPlayback;
    }

    public boolean isPlaying()
    {
        return mMedia.getState() == 1;
    }

    public boolean isPropertyStreamingVideoDrs()
    {
        if (PlayerTypeFactory.isJPlayerBase(PlayerTypeFactory.getCurrentType(getContext())))
        {
            return false;
        } else
        {
            return AndroidUtils.isPropertyStreamingVideoDrs();
        }
    }

    public void onConfigRefreshed(int i)
    {
        if (i == 0)
        {
            updateSubtitleSettings(false);
        }
    }

    public void open(long l, PlayContext playcontext, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("Open called movieId:").append(l).append(" trackId:").append(playcontext.getTrackId()).append(" bookmark:").append(l1).toString());
        }
        mMovieId = l;
        mPlayContext = playcontext;
        mBookmark = l1;
        mPlayerExecutor.execute(onOpenRunnable);
        this;
        JVM INSTR monitorexit ;
        return;
        playcontext;
        this;
        JVM INSTR monitorexit ;
        throw playcontext;
    }

    public void pause()
    {
        mMedia.pause();
    }

    public void play()
    {
        mPlayerExecutor.execute(onPlayRunnable);
    }

    public void reloadPlayer()
    {
        this;
        JVM INSTR monitorenter ;
        PlayerType playertype;
        int i;
        Log.d(TAG, "reloadPlayer if required");
        playertype = PlayerTypeFactory.getCurrentType(getContext());
        i = BitrateRangeFactory.getBitrateCap(getContext());
        mHelper = MediaPlayerHelperFactory.getInstance(playertype);
        if (playertype != mPlayerType || i != mBitrateCap) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable(TAG, 6))
        {
            Log.e(TAG, (new StringBuilder()).append("Player type is not changed! It is still ").append(mPlayerType.getDescription()).append(". Preparing players!").toString());
        }
        preparePlayerType(playertype);
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        mPlayerType = playertype;
        mBitrateCap = i;
        if (mPlayerType != null) goto _L4; else goto _L3
_L3:
        Log.e(TAG, "This should not happen, player type was null at this point! Use default.");
        mPlayerType = PlayerTypeFactory.findDefaultPlayerType();
_L7:
        preparePlayerType(mPlayerType);
        mMedia.changePlayer(mPlayerType, mBitrateCap);
        mMedia.setAudioBitrateRange(BitrateRangeFactory.getAudioBitrateRange());
        mMedia.setThrotteled(false);
        mMedia.setNetworkProfile(2);
        Thread.sleep(400L);
_L8:
        Log.d(TAG, "Player changed done");
          goto _L5
        Object obj;
        obj;
        throw obj;
_L4:
        if (!Log.isLoggable(TAG, 3)) goto _L7; else goto _L6
_L6:
        Log.d(TAG, (new StringBuilder()).append("Player type is ").append(mPlayerType.getDescription()).toString());
          goto _L7
        obj;
        Log.e(TAG, "ReloadPlayer ", ((Throwable) (obj)));
          goto _L8
    }

    public void removePlayerListener(com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener playerlistener)
    {
        mPlayerListenerManager.removePlayerListener(playerlistener);
    }

    public void seekTo(int i, boolean flag)
    {
        seekedToPosition = i;
        mForcedRebuffer = flag;
        mPlayerExecutor.execute(onSeekRunnable);
        if (mSubtitles != null)
        {
            mSubtitles.seeked();
        }
    }

    public boolean selectTracks(AudioSource audiosource, Subtitle subtitle)
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("Selected track Audio: ").append(audiosource).toString());
            Log.d(TAG, (new StringBuilder()).append("Selected track Subtitle: ").append(subtitle).toString());
        }
        mMedia.selectTracks(audiosource, subtitle);
        if (subtitle != null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        Log.d(TAG, "Removing subtitles");
        mSubtitles = null;
        this;
        JVM INSTR monitorexit ;
        return true;
        audiosource;
        throw audiosource;
    }

    public void setJPlayerListener(com.netflix.mediaclient.media.JPlayer.JPlayer.JplayerListener jplayerlistener)
    {
        mJPlayerListener = jplayerlistener;
    }

    public void setSurface(Surface surface)
    {
        if (Log.isLoggable(TAG, 3))
        {
            String s1 = TAG;
            StringBuilder stringbuilder = (new StringBuilder()).append("Surface is being set: ");
            String s;
            if (mSurface != null)
            {
                s = "SurfaceExisted";
            } else
            {
                s = "No Surface Existed";
            }
            Log.d(s1, stringbuilder.append(s).toString());
        }
        mSurface = surface;
        mMedia.setSurface(surface);
    }

    public void setSurfaceHolder(SurfaceHolder surfaceholder)
    {
    }

    public void setVOapi(long l, long l1)
    {
        mMedia.setVOapi(l, l1);
    }

    void setVideoBitrateRange(int i, int j)
    {
        if (mMedia == null);
    }

    void setVideoStreamingBufferSize(int i)
    {
        if (mMedia != null)
        {
            mMedia.setMaxVideoBufferSize(i);
        }
    }

    public void unpause()
    {
        mMedia.unpause();
    }




/*
    static boolean access$1002(PlayerAgent playeragent, boolean flag)
    {
        playeragent.mBufferingCompleted = flag;
        return flag;
    }

*/


/*
    static NccpError access$1102(PlayerAgent playeragent, NccpError nccperror)
    {
        playeragent.pendingError = nccperror;
        return nccperror;
    }

*/




/*
    static StartPlayTimeoutTask access$1302(PlayerAgent playeragent, StartPlayTimeoutTask startplaytimeouttask)
    {
        playeragent.mStartPlayTimeoutTask = startplaytimeouttask;
        return startplaytimeouttask;
    }

*/




/*
    static int access$1502(PlayerAgent playeragent, int i)
    {
        playeragent.mState = i;
        return i;
    }

*/





/*
    static boolean access$1902(PlayerAgent playeragent, boolean flag)
    {
        playeragent.toOpenAfterClose = flag;
        return flag;
    }

*/



/*
    static int access$202(PlayerAgent playeragent, int i)
    {
        playeragent.prevEndPosition = i;
        return i;
    }

*/



/*
    static long access$2202(PlayerAgent playeragent, long l)
    {
        playeragent.sessionInitRxBytes = l;
        return l;
    }

*/


/*
    static long access$2302(PlayerAgent playeragent, long l)
    {
        playeragent.sessionInitTxBytes = l;
        return l;
    }

*/


/*
    static int access$2402(PlayerAgent playeragent, int i)
    {
        playeragent.ptsTicker = i;
        return i;
    }

*/


/*
    static boolean access$2502(PlayerAgent playeragent, boolean flag)
    {
        playeragent.toPlayAfterStop = flag;
        return flag;
    }

*/



/*
    static boolean access$2702(PlayerAgent playeragent, boolean flag)
    {
        playeragent.seeking = flag;
        return flag;
    }

*/



/*
    static boolean access$2902(PlayerAgent playeragent, boolean flag)
    {
        playeragent.toCancelOpen = flag;
        return flag;
    }

*/



/*
    static boolean access$302(PlayerAgent playeragent, boolean flag)
    {
        playeragent.validPtsRecieved = flag;
        return flag;
    }

*/



/*
    static CloseTimeoutTask access$3102(PlayerAgent playeragent, CloseTimeoutTask closetimeouttask)
    {
        playeragent.mCloseTimeoutTask = closetimeouttask;
        return closetimeouttask;
    }

*/











/*
    static boolean access$402(PlayerAgent playeragent, boolean flag)
    {
        playeragent.mInPlayback = flag;
        return flag;
    }

*/







/*
    static SubtitleParser access$4602(PlayerAgent playeragent, SubtitleParser subtitleparser)
    {
        playeragent.mSubtitles = subtitleparser;
        return subtitleparser;
    }

*/



/*
    static boolean access$4802(PlayerAgent playeragent, boolean flag)
    {
        playeragent.ignoreErrorsWhileActionId12IsProcessed = flag;
        return flag;
    }

*/



/*
    static NccpError access$4902(PlayerAgent playeragent, NccpError nccperror)
    {
        playeragent.mActionId12Error = nccperror;
        return nccperror;
    }

*/



/*
    static boolean access$502(PlayerAgent playeragent, boolean flag)
    {
        playeragent.inPlaybackSession = flag;
        return flag;
    }

*/





/*
    static boolean access$602(PlayerAgent playeragent, boolean flag)
    {
        playeragent.splashScreenRemoved = flag;
        return flag;
    }

*/


/*
    static boolean access$702(PlayerAgent playeragent, boolean flag)
    {
        playeragent.preparedCompleted = flag;
        return flag;
    }

*/



/*
    static int access$802(PlayerAgent playeragent, int i)
    {
        playeragent.seekedToPosition = i;
        return i;
    }

*/

}
