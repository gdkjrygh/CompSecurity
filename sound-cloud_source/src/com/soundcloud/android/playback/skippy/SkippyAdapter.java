// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.skippy;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiUrlBuilder;
import com.soundcloud.android.api.oauth.Token;
import com.soundcloud.android.crypto.CryptoOperations;
import com.soundcloud.android.crypto.DeviceSecret;
import com.soundcloud.android.events.ConnectionType;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlaybackErrorEvent;
import com.soundcloud.android.events.PlaybackPerformanceEvent;
import com.soundcloud.android.events.PlayerType;
import com.soundcloud.android.events.SkippyInitilizationFailedEvent;
import com.soundcloud.android.events.SkippyInitilizationSucceededEvent;
import com.soundcloud.android.events.SkippyPlayEvent;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.offline.SecureFileStorage;
import com.soundcloud.android.playback.BufferUnderrunListener;
import com.soundcloud.android.playback.PlaybackProtocol;
import com.soundcloud.android.playback.Player;
import com.soundcloud.android.skippy.Skippy;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.utils.DebugUtils;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.utils.LockUtil;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.playback.skippy:
//            SkippyFactory

public class SkippyAdapter
    implements Player, com.soundcloud.android.skippy.Skippy.PlayListener
{
    private static class SkippyException extends Exception
    {

        private final String errorCategory;
        private final int line;
        private final String sourceFile;

        public String getMessage()
        {
            return errorCategory;
        }

        public StackTraceElement[] getStackTrace()
        {
            return (new StackTraceElement[] {
                new StackTraceElement(errorCategory, "", sourceFile, line)
            });
        }

        private SkippyException(String s, int i, String s1)
        {
            errorCategory = s;
            line = i;
            sourceFile = s1;
        }

        SkippyException(String s, int i, String s1, _cls1 _pcls1)
        {
            this(s, i, s1);
        }
    }

    static class StateChangeHandler extends Handler
    {

        private BufferUnderrunListener bufferUnderrunListener;
        private final NetworkConnectionHelper connectionHelper;
        private com.soundcloud.android.playback.Player.PlayerListener playerListener;

        public void handleMessage(Message message)
        {
            message = (com.soundcloud.android.playback.Player.StateTransition)message.obj;
            if (playerListener != null)
            {
                playerListener.onPlaystateChanged(message);
            }
            if (bufferUnderrunListener != null)
            {
                bufferUnderrunListener.onPlaystateChanged(message, PlaybackProtocol.HLS, PlayerType.SKIPPY, connectionHelper.getCurrentConnectionType());
            }
        }

        public void setBufferUnderrunListener(BufferUnderrunListener bufferunderrunlistener)
        {
            bufferUnderrunListener = bufferunderrunlistener;
        }

        public void setPlayerListener(com.soundcloud.android.playback.Player.PlayerListener playerlistener)
        {
            playerListener = playerlistener;
        }

        StateChangeHandler(Looper looper, NetworkConnectionHelper networkconnectionhelper)
        {
            super(looper);
            connectionHelper = networkconnectionhelper;
        }
    }


    private static final int INIT_ERROR_CUSTOM_LOG_LINE_COUNT = 5000;
    private static final int PLAY_TYPE_DEFAULT = 0;
    private static final int PLAY_TYPE_OFFLINE = 2;
    private static final int PLAY_TYPE_STREAM_UNINTERRUPTED = 1;
    private static final long POSITION_START = 0L;
    static final String SKIPPY_INIT_ERROR_COUNT_KEY = "SkippyAdapter.initErrorCount";
    static final String SKIPPY_INIT_SUCCESS_COUNT_KEY = "SkippyAdapter.initSuccessCount";
    private static final String TAG = "SkippyAdapter";
    private final AccountOperations accountOperations;
    private final BufferUnderrunListener bufferUnderrunListener;
    private final NetworkConnectionHelper connectionHelper;
    private final CryptoOperations cryptoOperations;
    private volatile String currentStreamUrl;
    private Urn currentTrackUrn;
    private final CurrentDateProvider dateProvider;
    private final EventBus eventBus;
    private long lastStateChangeProgress;
    private final LockUtil lockUtil;
    private com.soundcloud.android.playback.Player.PlayerListener playerListener;
    private final SecureFileStorage secureFileStorage;
    private final SharedPreferences sharedPreferences;
    private final Skippy skippy;
    private final SkippyFactory skippyFactory;
    private final StateChangeHandler stateHandler;
    private final ApiUrlBuilder urlBuilder;

    SkippyAdapter(SkippyFactory skippyfactory, AccountOperations accountoperations, ApiUrlBuilder apiurlbuilder, StateChangeHandler statechangehandler, EventBus eventbus, NetworkConnectionHelper networkconnectionhelper, LockUtil lockutil, 
            BufferUnderrunListener bufferunderrunlistener, SharedPreferences sharedpreferences, SecureFileStorage securefilestorage, CryptoOperations cryptooperations, CurrentDateProvider currentdateprovider)
    {
        skippyFactory = skippyfactory;
        lockUtil = lockutil;
        bufferUnderrunListener = bufferunderrunlistener;
        sharedPreferences = sharedpreferences;
        secureFileStorage = securefilestorage;
        cryptoOperations = cryptooperations;
        skippy = skippyfactory.create(this);
        accountOperations = accountoperations;
        urlBuilder = apiurlbuilder;
        eventBus = eventbus;
        connectionHelper = networkconnectionhelper;
        stateHandler = statechangehandler;
        stateHandler.setBufferUnderrunListener(bufferunderrunlistener);
        dateProvider = currentdateprovider;
    }

    private String buildStreamUrl(int i)
    {
        Preconditions.checkState(accountOperations.isUserLoggedIn(), "SoundCloud User account does not exist");
        if (i == 2)
        {
            return secureFileStorage.getFileUriForOfflineTrack(currentTrackUrn).toString();
        }
        Token token = accountOperations.getSoundCloudToken();
        ApiUrlBuilder apiurlbuilder = urlBuilder.from(ApiEndpoints.HLS_STREAM, new Object[] {
            currentTrackUrn
        });
        if (token.valid())
        {
            apiurlbuilder.withQueryParam(com.soundcloud.android.api.ApiRequest.Param.OAUTH_TOKEN, token.getAccessToken());
        }
        return apiurlbuilder.build();
    }

    private void configureLockBasedOnNewState(com.soundcloud.android.playback.Player.StateTransition statetransition)
    {
        if (statetransition.isPlayerPlaying() || statetransition.isBuffering())
        {
            lockUtil.lock();
            return;
        } else
        {
            lockUtil.unlock();
            return;
        }
    }

    private PlaybackPerformanceEvent createPerformanceEvent(com.soundcloud.android.skippy.Skippy.PlaybackMetric playbackmetric, long l, String s)
    {
        ConnectionType connectiontype = connectionHelper.getCurrentConnectionType();
        Urn urn = accountOperations.getLoggedInUserUrn();
        PlaybackProtocol playbackprotocol = getPlaybackProtocol();
        switch (_cls1..SwitchMap.com.soundcloud.android.skippy.Skippy.PlaybackMetric[playbackmetric.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unexpected performance metric : ")).append(playbackmetric).toString());

        case 1: // '\001'
            return PlaybackPerformanceEvent.timeToPlay(l, playbackprotocol, PlayerType.SKIPPY, connectiontype, s, urn);

        case 2: // '\002'
            return PlaybackPerformanceEvent.timeToBuffer(l, playbackprotocol, PlayerType.SKIPPY, connectiontype, s, urn);

        case 3: // '\003'
            return PlaybackPerformanceEvent.timeToPlaylist(l, playbackprotocol, PlayerType.SKIPPY, connectiontype, s, urn);

        case 4: // '\004'
            return PlaybackPerformanceEvent.timeToSeek(l, playbackprotocol, PlayerType.SKIPPY, connectiontype, s, urn);

        case 5: // '\005'
            return PlaybackPerformanceEvent.fragmentDownloadRate(l, playbackprotocol, PlayerType.SKIPPY, connectiontype, s, urn);

        case 6: // '\006'
            return PlaybackPerformanceEvent.timeToLoad(l, playbackprotocol, PlayerType.SKIPPY, connectiontype, s, urn);

        case 7: // '\007'
            return PlaybackPerformanceEvent.cacheUsagePercent(l, playbackprotocol, PlayerType.SKIPPY, connectiontype, s);

        case 8: // '\b'
            return PlaybackPerformanceEvent.uninterruptedPlaytimeMs(l, playbackprotocol, PlayerType.SKIPPY, connectiontype, s);
        }
    }

    private long fixPosition(long l, long l1)
    {
        if (l > l1)
        {
            ErrorUtils.handleSilentException((new StringBuilder("track [")).append(currentTrackUrn).append("] : position [").append(l).append("] > duration [").append(l1).append("].").toString(), new IllegalStateException("Skippy inconsistent state : position > duration"));
            return l1;
        } else
        {
            return l;
        }
    }

    private int getAndIncrementInitilizationErrors()
    {
        int i = getInitializationErrorCount() + 1;
        sharedPreferences.edit().putInt("SkippyAdapter.initErrorCount", i).apply();
        return i;
    }

    private int getAndIncrementInitilizationSuccesses()
    {
        int i = getInitializationSuccessCount() + 1;
        sharedPreferences.edit().putInt("SkippyAdapter.initSuccessCount", i).apply();
        return i;
    }

    private int getInitializationErrorCount()
    {
        return sharedPreferences.getInt("SkippyAdapter.initErrorCount", 0);
    }

    private int getInitializationSuccessCount()
    {
        return sharedPreferences.getInt("SkippyAdapter.initSuccessCount", 0);
    }

    private PlaybackProtocol getPlaybackProtocol()
    {
        return PlaybackProtocol.HLS;
    }

    private com.soundcloud.android.playback.Player.Reason getTranslatedReason(com.soundcloud.android.skippy.Skippy.Reason reason, com.soundcloud.android.skippy.Skippy.Error error)
    {
        if (reason == com.soundcloud.android.skippy.Skippy.Reason.ERROR)
        {
            switch (_cls1..SwitchMap.com.soundcloud.android.skippy.Skippy.Error[error.ordinal()])
            {
            default:
                throw new IllegalArgumentException((new StringBuilder("Unexpected skippy error code : ")).append(error).toString());

            case 1: // '\001'
            case 2: // '\002'
                return com.soundcloud.android.playback.Player.Reason.ERROR_FAILED;

            case 3: // '\003'
                return com.soundcloud.android.playback.Player.Reason.ERROR_FORBIDDEN;

            case 4: // '\004'
                return com.soundcloud.android.playback.Player.Reason.ERROR_NOT_FOUND;
            }
        }
        if (reason == com.soundcloud.android.skippy.Skippy.Reason.COMPLETE)
        {
            return com.soundcloud.android.playback.Player.Reason.TRACK_COMPLETE;
        } else
        {
            return com.soundcloud.android.playback.Player.Reason.NONE;
        }
    }

    private com.soundcloud.android.playback.Player.PlayerState getTranslatedState(com.soundcloud.android.skippy.Skippy.State state, com.soundcloud.android.skippy.Skippy.Reason reason)
    {
        switch (_cls1..SwitchMap.com.soundcloud.android.skippy.Skippy.State[state.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unexpected skippy state : ")).append(state).toString());

        case 1: // '\001'
            return com.soundcloud.android.playback.Player.PlayerState.IDLE;

        case 2: // '\002'
            break;
        }
        if (reason == com.soundcloud.android.skippy.Skippy.Reason.BUFFERING)
        {
            return com.soundcloud.android.playback.Player.PlayerState.BUFFERING;
        } else
        {
            return com.soundcloud.android.playback.Player.PlayerState.PLAYING;
        }
    }

    private void handleStateChanged(com.soundcloud.android.skippy.Skippy.State state, com.soundcloud.android.skippy.Skippy.Reason reason, com.soundcloud.android.skippy.Skippy.Error error, long l, long l1, 
            String s)
    {
        long l2 = fixPosition(l, l1);
        (new StringBuilder("State = ")).append(state).append(" : ").append(reason).append(" : ").append(error);
        if (s.equals(currentStreamUrl))
        {
            lastStateChangeProgress = l;
            state = new com.soundcloud.android.playback.Player.StateTransition(getTranslatedState(state, reason), getTranslatedReason(reason, error), currentTrackUrn, l2, l1, dateProvider);
            state.addExtraAttribute(0, getPlaybackProtocol().getValue());
            state.addExtraAttribute(1, PlayerType.SKIPPY.getValue());
            state.addExtraAttribute(2, connectionHelper.getCurrentConnectionType().getValue());
            state.addExtraAttribute(3, "true");
            state.addExtraAttribute(4, s);
            if (state.playbackHasStopped())
            {
                currentStreamUrl = null;
            }
            reason = stateHandler.obtainMessage(0, state);
            stateHandler.sendMessage(reason);
            configureLockBasedOnNewState(state);
        }
    }

    private void play(Urn urn, long l, int i)
    {
        currentTrackUrn = urn;
        if (!accountOperations.isUserLoggedIn())
        {
            throw new IllegalStateException("Cannot play a track if no soundcloud account exists");
        }
        if (playerListener == null)
        {
            return;
        }
        if (!playerListener.requestAudioFocus())
        {
            urn = new com.soundcloud.android.playback.Player.StateTransition(com.soundcloud.android.playback.Player.PlayerState.IDLE, com.soundcloud.android.playback.Player.Reason.ERROR_FAILED, currentTrackUrn, l, -1L, dateProvider);
            playerListener.onPlaystateChanged(urn);
            bufferUnderrunListener.onPlaystateChanged(urn, getPlaybackProtocol(), PlayerType.SKIPPY, connectionHelper.getCurrentConnectionType());
            return;
        }
        sendSkippyPlayEvent();
        stateHandler.removeMessages(0);
        lastStateChangeProgress = 0L;
        urn = buildStreamUrl(i);
        if (urn.equals(currentStreamUrl))
        {
            skippy.seek(l);
            skippy.resume();
            return;
        }
        currentStreamUrl = urn;
        switch (i)
        {
        default:
            skippy.play(currentStreamUrl, l);
            return;

        case 1: // '\001'
            skippy.playAd(currentStreamUrl, l);
            return;

        case 2: // '\002'
            urn = cryptoOperations.checkAndGetDeviceKey();
            break;
        }
        skippy.playOffline(currentStreamUrl, l, urn.getKey(), urn.getInitVector());
    }

    private void sendSkippyPlayEvent()
    {
        ConnectionType connectiontype = connectionHelper.getCurrentConnectionType();
        eventBus.publish(EventQueue.TRACKING, new SkippyPlayEvent(connectiontype, true));
    }

    public void destroy()
    {
        skippy.destroy();
    }

    public long getProgress()
    {
        if (currentStreamUrl != null)
        {
            return skippy.getPosition();
        } else
        {
            return lastStateChangeProgress;
        }
    }

    public boolean init(Context context)
    {
        boolean flag = skippy.init(context, skippyFactory.createConfiguration());
        if (flag)
        {
            eventBus.publish(EventQueue.TRACKING, new SkippyInitilizationSucceededEvent(getInitializationErrorCount(), getAndIncrementInitilizationSuccesses()));
        }
        return flag;
    }

    public boolean isSeekable()
    {
        return true;
    }

    public void onDownloadPerformed(long l, long l1, int i, int j, String s)
    {
    }

    public void onErrorMessage(String s, String s1, int i, String s2, String s3, String s4)
    {
        s3 = connectionHelper.getCurrentConnectionType();
        if (!ConnectionType.OFFLINE.equals(s3))
        {
            ErrorUtils.handleSilentExceptionWithLog(new SkippyException(s, i, s1, null), s2);
        }
        s = new PlaybackErrorEvent(s, getPlaybackProtocol(), s4, s3);
        eventBus.publish(EventQueue.PLAYBACK_ERROR, s);
    }

    public void onInitializationError(Throwable throwable, String s)
    {
        ErrorUtils.handleSilentExceptionWithLog(throwable, DebugUtils.getLogDump(5000));
        eventBus.publish(EventQueue.TRACKING, new SkippyInitilizationFailedEvent(throwable, s, getAndIncrementInitilizationErrors(), getInitializationSuccessCount()));
    }

    public void onPerformanceMeasured(com.soundcloud.android.skippy.Skippy.PlaybackMetric playbackmetric, long l, String s, String s1)
    {
        if (!accountOperations.isUserLoggedIn() || playbackmetric.equals(com.soundcloud.android.skippy.Skippy.PlaybackMetric.TIME_TO_BUFFER))
        {
            return;
        } else
        {
            eventBus.publish(EventQueue.PLAYBACK_PERFORMANCE, createPerformanceEvent(playbackmetric, l, s1));
            return;
        }
    }

    public void onProgressChange(long l, long l1, String s)
    {
        l = fixPosition(l, l1);
        if (playerListener != null && s.equals(currentStreamUrl))
        {
            playerListener.onProgressEvent(l, l1);
        }
    }

    public void onStateChanged(com.soundcloud.android.skippy.Skippy.State state, com.soundcloud.android.skippy.Skippy.Reason reason, com.soundcloud.android.skippy.Skippy.Error error, long l, long l1, 
            String s)
    {
        try
        {
            handleStateChanged(state, reason, error, l, l1, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.soundcloud.android.skippy.Skippy.State state)
        {
            ErrorUtils.handleThrowable(state, getClass());
        }
    }

    public void pause()
    {
        skippy.pause();
    }

    public void play(Urn urn)
    {
        play(urn, 0L);
    }

    public void play(Urn urn, long l)
    {
        play(urn, l, 0);
    }

    public void playOffline(Urn urn, long l)
    {
        play(urn, l, 2);
    }

    public void playUninterrupted(Urn urn)
    {
        play(urn, 0L, 1);
    }

    public void resume()
    {
        skippy.resume();
    }

    public long seek(long l, boolean flag)
    {
        if (flag)
        {
            bufferUnderrunListener.onSeek();
            skippy.seek(l);
            long l1 = skippy.getDuration();
            if (playerListener != null && l1 != 0L)
            {
                playerListener.onProgressEvent(l, l1);
            }
        }
        return l;
    }

    public void setListener(com.soundcloud.android.playback.Player.PlayerListener playerlistener)
    {
        playerListener = playerlistener;
        stateHandler.setPlayerListener(playerlistener);
    }

    public void setVolume(float f)
    {
        skippy.setVolume(f);
    }

    public void stop()
    {
        skippy.pause();
    }

    public void stopForTrackTransition()
    {
        stop();
    }

    private class _cls1
    {

        static final int $SwitchMap$com$soundcloud$android$skippy$Skippy$Error[];
        static final int $SwitchMap$com$soundcloud$android$skippy$Skippy$PlaybackMetric[];
        static final int $SwitchMap$com$soundcloud$android$skippy$Skippy$State[];

        static 
        {
            $SwitchMap$com$soundcloud$android$skippy$Skippy$PlaybackMetric = new int[com.soundcloud.android.skippy.Skippy.PlaybackMetric.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$skippy$Skippy$PlaybackMetric[com.soundcloud.android.skippy.Skippy.PlaybackMetric.TIME_TO_PLAY.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror13) { }
            try
            {
                $SwitchMap$com$soundcloud$android$skippy$Skippy$PlaybackMetric[com.soundcloud.android.skippy.Skippy.PlaybackMetric.TIME_TO_BUFFER.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror12) { }
            try
            {
                $SwitchMap$com$soundcloud$android$skippy$Skippy$PlaybackMetric[com.soundcloud.android.skippy.Skippy.PlaybackMetric.TIME_TO_GET_PLAYLIST.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror11) { }
            try
            {
                $SwitchMap$com$soundcloud$android$skippy$Skippy$PlaybackMetric[com.soundcloud.android.skippy.Skippy.PlaybackMetric.TIME_TO_SEEK.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            try
            {
                $SwitchMap$com$soundcloud$android$skippy$Skippy$PlaybackMetric[com.soundcloud.android.skippy.Skippy.PlaybackMetric.FRAGMENT_DOWNLOAD_RATE.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                $SwitchMap$com$soundcloud$android$skippy$Skippy$PlaybackMetric[com.soundcloud.android.skippy.Skippy.PlaybackMetric.TIME_TO_LOAD_LIBRARY.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$soundcloud$android$skippy$Skippy$PlaybackMetric[com.soundcloud.android.skippy.Skippy.PlaybackMetric.CACHE_USAGE_PERCENT.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$soundcloud$android$skippy$Skippy$PlaybackMetric[com.soundcloud.android.skippy.Skippy.PlaybackMetric.UNINTERRUPTED_PLAYTIME.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            $SwitchMap$com$soundcloud$android$skippy$Skippy$Error = new int[com.soundcloud.android.skippy.Skippy.Error.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$skippy$Skippy$Error[com.soundcloud.android.skippy.Skippy.Error.FAILED.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$soundcloud$android$skippy$Skippy$Error[com.soundcloud.android.skippy.Skippy.Error.TIMEOUT.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$soundcloud$android$skippy$Skippy$Error[com.soundcloud.android.skippy.Skippy.Error.FORBIDDEN.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$soundcloud$android$skippy$Skippy$Error[com.soundcloud.android.skippy.Skippy.Error.MEDIA_NOT_FOUND.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            $SwitchMap$com$soundcloud$android$skippy$Skippy$State = new int[com.soundcloud.android.skippy.Skippy.State.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$skippy$Skippy$State[com.soundcloud.android.skippy.Skippy.State.IDLE.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$skippy$Skippy$State[com.soundcloud.android.skippy.Skippy.State.PLAYING.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
