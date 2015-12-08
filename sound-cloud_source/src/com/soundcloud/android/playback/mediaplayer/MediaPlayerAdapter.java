// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.mediaplayer;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.events.ConnectionType;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlaybackPerformanceEvent;
import com.soundcloud.android.events.PlayerType;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.BufferUnderrunListener;
import com.soundcloud.android.playback.PlaybackProtocol;
import com.soundcloud.android.playback.Player;
import com.soundcloud.android.playback.StreamUrlBuilder;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import com.soundcloud.rx.eventbus.EventBus;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.playback.mediaplayer:
//            PlaybackState, MediaPlayerManager, TrackCompletionListener

public class MediaPlayerAdapter
    implements android.media.MediaPlayer.OnBufferingUpdateListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnSeekCompleteListener, Player
{
    static class PlayerHandler extends Handler
    {

        static final int CLEAR_LAST_SEEK = 0;
        static final int SEND_PROGRESS = 1;
        private WeakReference mediaPlayerAdapterWeakReference;

        public void handleMessage(Message message)
        {
            MediaPlayerAdapter mediaplayeradapter = (MediaPlayerAdapter)mediaPlayerAdapterWeakReference.get();
            if (mediaplayeradapter == null)
            {
                return;
            }
            switch (message.what)
            {
            default:
                return;

            case 0: // '\0'
                mediaplayeradapter.seekPos = -1L;
                return;

            case 1: // '\001'
                mediaplayeradapter.sendProgress();
                break;
            }
            sendEmptyMessageDelayed(1, 500L);
        }

        void setMediaPlayerAdapter(MediaPlayerAdapter mediaplayeradapter)
        {
            mediaPlayerAdapterWeakReference = new WeakReference(mediaplayeradapter);
        }

        PlayerHandler()
        {
        }
    }


    public static final int MAX_CONNECT_RETRIES = 2;
    private static final int POS_NOT_SET = -1;
    public static final int SEEK_COMPLETE_PROGRESS_DELAY = 3000;
    private static final String TAG = "MediaPlayerAdapter";
    private final AccountOperations accountOperations;
    private final BufferUnderrunListener bufferUnderrunListener;
    private int connectionRetries;
    private final Context context;
    private String currentStreamUrl;
    private final CurrentDateProvider dateProvider;
    private final EventBus eventBus;
    private PlaybackState internalState;
    private double loadPercent;
    private volatile MediaPlayer mediaPlayer;
    private final MediaPlayerManager mediaPlayerManager;
    private final NetworkConnectionHelper networkConnectionHelper;
    private final PlayerHandler playerHandler;
    private com.soundcloud.android.playback.Player.PlayerListener playerListener;
    private long prepareStartTimeMs;
    private long resumePos;
    private long seekPos;
    private Urn track;
    private final StreamUrlBuilder urlBuilder;
    private boolean waitingForSeek;

    public MediaPlayerAdapter(Context context1, MediaPlayerManager mediaplayermanager, PlayerHandler playerhandler, EventBus eventbus, NetworkConnectionHelper networkconnectionhelper, AccountOperations accountoperations, BufferUnderrunListener bufferunderrunlistener, 
            StreamUrlBuilder streamurlbuilder, CurrentDateProvider currentdateprovider)
    {
        internalState = PlaybackState.STOPPED;
        track = Urn.NOT_SET;
        connectionRetries = 0;
        seekPos = -1L;
        resumePos = -1L;
        currentStreamUrl = "";
        bufferUnderrunListener = bufferunderrunlistener;
        urlBuilder = streamurlbuilder;
        dateProvider = currentdateprovider;
        context = context1.getApplicationContext();
        mediaPlayerManager = mediaplayermanager;
        playerHandler = playerhandler;
        eventBus = eventbus;
        playerHandler.setMediaPlayerAdapter(this);
        networkConnectionHelper = networkconnectionhelper;
        accountOperations = accountoperations;
    }

    private void createMediaPlayer()
    {
        mediaPlayer = mediaPlayerManager.create();
        mediaPlayer.setWakeMode(context, 1);
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnErrorListener(this);
        mediaPlayer.setOnPreparedListener(this);
        mediaPlayer.setOnSeekCompleteListener(this);
        mediaPlayer.setOnInfoListener(this);
        mediaPlayer.setOnCompletionListener(new TrackCompletionListener(this));
    }

    private long getAdjustedProgress()
    {
        long l = getDuration();
        long l1 = getProgress();
        if (l > 0L && l1 > l)
        {
            (new StringBuilder("Progress > expectedDuration: ")).append(l1).append(" > ").append(l);
            return l;
        } else
        {
            return l1;
        }
    }

    private PlaybackProtocol getPlaybackProtocol()
    {
        return PlaybackProtocol.HTTPS;
    }

    private com.soundcloud.android.playback.Player.Reason getTranslatedReason()
    {
        switch (_cls1..SwitchMap.com.soundcloud.android.playback.mediaplayer.PlaybackState[internalState.ordinal()])
        {
        default:
            return com.soundcloud.android.playback.Player.Reason.NONE;

        case 4: // '\004'
            if (networkConnectionHelper.isNetworkConnected())
            {
                return com.soundcloud.android.playback.Player.Reason.ERROR_NOT_FOUND;
            } else
            {
                return com.soundcloud.android.playback.Player.Reason.ERROR_FAILED;
            }

        case 5: // '\005'
            return com.soundcloud.android.playback.Player.Reason.TRACK_COMPLETE;
        }
    }

    private com.soundcloud.android.playback.Player.PlayerState getTranslatedState()
    {
        switch (_cls1..SwitchMap.com.soundcloud.android.playback.mediaplayer.PlaybackState[internalState.ordinal()])
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("No translated state for ")).append(internalState).toString());

        case 1: // '\001'
        case 2: // '\002'
            return com.soundcloud.android.playback.Player.PlayerState.BUFFERING;

        case 3: // '\003'
            return com.soundcloud.android.playback.Player.PlayerState.PLAYING;

        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            return com.soundcloud.android.playback.Player.PlayerState.IDLE;
        }
    }

    private boolean handleMediaPlayerError(MediaPlayer mediaplayer, long l)
    {
        if (mediaplayer.equals(mediaPlayer) && internalState != PlaybackState.STOPPED)
        {
            int i = connectionRetries;
            connectionRetries = i + 1;
            if (i < 2)
            {
                (new StringBuilder("stream disconnected, retrying (try=")).append(connectionRetries).append(")");
                setInternalState(PlaybackState.ERROR_RETRYING);
                play(track, l);
            } else
            {
                setInternalState(PlaybackState.ERROR);
                mediaplayer.release();
                resetConnectionRetries();
                mediaPlayer = null;
            }
        }
        return true;
    }

    private void play()
    {
        if (mediaPlayer != null)
        {
            mediaPlayer.start();
            setInternalState(PlaybackState.PLAYING);
        }
    }

    private void publishTimeToPlayEvent(long l, String s)
    {
        s = PlaybackPerformanceEvent.timeToPlay(l, getPlaybackProtocol(), PlayerType.MEDIA_PLAYER, networkConnectionHelper.getCurrentConnectionType(), s, accountOperations.getLoggedInUserUrn());
        eventBus.publish(EventQueue.PLAYBACK_PERFORMANCE, s);
    }

    private boolean releaseUnresettableMediaPlayer()
    {
        if (waitingForSeek || internalState.isLoading())
        {
            mediaPlayerManager.stopAndReleaseAsync(mediaPlayer);
            mediaPlayer = null;
            return true;
        } else
        {
            return false;
        }
    }

    private void reportStateChange(PlaybackState playbackstate, long l, long l1)
    {
        playerHandler.removeMessages(1);
        if (playbackstate == PlaybackState.PLAYING)
        {
            playerHandler.sendEmptyMessage(1);
        }
        if (playerListener != null)
        {
            playbackstate = new com.soundcloud.android.playback.Player.StateTransition(getTranslatedState(), getTranslatedReason(), track, l, l1, dateProvider);
            playbackstate.addExtraAttribute(0, getPlaybackProtocol().getValue());
            playbackstate.addExtraAttribute(1, PlayerType.MEDIA_PLAYER.getValue());
            playbackstate.addExtraAttribute(3, "false");
            playbackstate.addExtraAttribute(2, networkConnectionHelper.getCurrentConnectionType().getValue());
            playerListener.onPlaystateChanged(playbackstate);
            bufferUnderrunListener.onPlaystateChanged(playbackstate, getPlaybackProtocol(), PlayerType.MEDIA_PLAYER, networkConnectionHelper.getCurrentConnectionType());
        }
    }

    private void sendProgress()
    {
        if (playerListener != null)
        {
            long l = getAdjustedProgress();
            long l1 = getDuration();
            playerListener.onProgressEvent(l, l1);
        }
    }

    private void setInternalState(PlaybackState playbackstate)
    {
        internalState = playbackstate;
        reportStateChange(playbackstate, getAdjustedProgress(), getDuration());
    }

    private void setInternalState(PlaybackState playbackstate, long l, long l1)
    {
        internalState = playbackstate;
        reportStateChange(playbackstate, l, l1);
    }

    public void destroy()
    {
        stop();
        playerHandler.removeCallbacksAndMessages(null);
    }

    public long getDuration()
    {
        if (mediaPlayer != null && internalState.canGetMPProgress())
        {
            return (long)mediaPlayer.getDuration();
        } else
        {
            return -1L;
        }
    }

    public long getProgress()
    {
        if (resumePos != -1L)
        {
            return resumePos;
        }
        if (waitingForSeek)
        {
            return seekPos;
        }
        if (mediaPlayer != null && internalState.canGetMPProgress())
        {
            return (long)mediaPlayer.getCurrentPosition();
        } else
        {
            return 0L;
        }
    }

    public long getResumeTime()
    {
        return resumePos;
    }

    public long getSeekPosition()
    {
        return seekPos;
    }

    public boolean hasValidSeekPosition()
    {
        return seekPos != -1L;
    }

    boolean isInErrorState()
    {
        return internalState.isError();
    }

    boolean isPlayerPlaying()
    {
        return internalState == PlaybackState.PLAYING;
    }

    public boolean isSeekable()
    {
        return mediaPlayer != null && internalState.isSeekable();
    }

    public boolean isTryingToResumeTrack()
    {
        return resumePos != -1L;
    }

    public void onBufferingUpdate(MediaPlayer mediaplayer, int i)
    {
        if (mediaPlayer == mediaplayer)
        {
            if (Log.isLoggable("MediaPlayerAdapter", 3) && loadPercent != (double)i)
            {
                (new StringBuilder("onBufferingUpdate(")).append(i).append(")");
            }
            loadPercent = i;
        }
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        return handleMediaPlayerError(mediaplayer, getAdjustedProgress());
    }

    public boolean onInfo(MediaPlayer mediaplayer, int i, int j)
    {
        if (Log.isLoggable("MediaPlayerAdapter", 3))
        {
            (new StringBuilder("onInfo(")).append(i).append(",").append(j).append(", state=").append(internalState).append(")");
        }
        if (internalState == PlaybackState.PREPARING)
        {
            return true;
        }
        if (701 == i)
        {
            setInternalState(PlaybackState.PAUSED_FOR_BUFFERING);
            playerHandler.removeMessages(0);
            return true;
        }
        if (702 == i)
        {
            if (seekPos != -1L && !waitingForSeek)
            {
                playerHandler.removeMessages(0);
                playerHandler.sendEmptyMessageDelayed(0, 3000L);
            } else
            {
                Log.isLoggable("MediaPlayerAdapter", 3);
            }
            if (!internalState.isSupposedToBePlaying())
            {
                pause();
                return true;
            } else
            {
                setInternalState(PlaybackState.PLAYING);
                return true;
            }
        } else
        {
            return false;
        }
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        if (!accountOperations.isUserLoggedIn())
        {
            return;
        }
        if (mediaplayer.equals(mediaPlayer) && internalState == PlaybackState.PREPARING)
        {
            if (playerListener != null && playerListener.requestAudioFocus())
            {
                play();
                publishTimeToPlayEvent(dateProvider.getCurrentDate().getTime() - prepareStartTimeMs, currentStreamUrl);
                if (resumePos > 0L)
                {
                    seek(resumePos, true);
                }
            } else
            {
                setInternalState(PlaybackState.PAUSED);
            }
            resumePos = -1L;
            return;
        } else
        {
            (new StringBuilder("OnPrepared called unexpectedly in state ")).append(internalState);
            return;
        }
    }

    public void onSeekComplete(MediaPlayer mediaplayer)
    {
        if (Log.isLoggable("MediaPlayerAdapter", 3))
        {
            (new StringBuilder("onSeekComplete(state=")).append(internalState).append(")");
        }
        if (mediaPlayer == mediaplayer)
        {
            if (internalState != PlaybackState.PAUSED_FOR_BUFFERING)
            {
                playerHandler.removeMessages(0);
                playerHandler.sendEmptyMessageDelayed(0, 3000L);
            }
            waitingForSeek = false;
            if (internalState == PlaybackState.PAUSED)
            {
                pause();
            } else
            if (internalState.isSupposedToBePlaying())
            {
                if (android.os.Build.VERSION.SDK_INT > 16)
                {
                    mediaplayer.pause();
                    mediaplayer.start();
                }
                setInternalState(PlaybackState.PLAYING);
                return;
            }
        }
    }

    void onTrackEnded()
    {
        resetConnectionRetries();
        setInternalState(PlaybackState.COMPLETED);
    }

    public void pause()
    {
        if (mediaPlayer != null && internalState.isPausable())
        {
            mediaPlayer.pause();
            setInternalState(PlaybackState.PAUSED);
            return;
        } else
        {
            stop();
            return;
        }
    }

    public void play(Urn urn)
    {
        play(urn, 0L);
    }

    public void play(Urn urn, long l)
    {
        if (mediaPlayer == null || releaseUnresettableMediaPlayer())
        {
            createMediaPlayer();
        } else
        {
            mediaPlayer.reset();
        }
        track = urn;
        waitingForSeek = false;
        resumePos = l;
        seekPos = -1L;
        setInternalState(PlaybackState.PREPARING);
        prepareStartTimeMs = dateProvider.getCurrentDate().getTime();
        try
        {
            currentStreamUrl = urlBuilder.buildHttpStreamUrl(urn);
            mediaPlayer.setDataSource(currentStreamUrl);
            mediaPlayer.prepareAsync();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Urn urn)
        {
            handleMediaPlayerError(mediaPlayer, resumePos);
        }
    }

    public void playOffline(Urn urn, long l)
    {
        throw new IllegalStateException("MediaPlayer cannot play offline content!!");
    }

    public void playUninterrupted(Urn urn)
    {
        play(urn);
    }

    void resetConnectionRetries()
    {
        connectionRetries = 0;
    }

    public void resume()
    {
        if (mediaPlayer != null && internalState.isStartable())
        {
            play();
            return;
        } else
        {
            play(track, resumePos);
            return;
        }
    }

    public long seek(long l)
    {
        return seek(l, true);
    }

    public long seek(long l, boolean flag)
    {
        long l2 = 0L;
        if (isSeekable())
        {
            if (l < 0L)
            {
                throw new IllegalArgumentException("Trying to seek before 0");
            }
            long l1 = l2;
            if (mediaPlayer != null)
            {
                l1 = l2;
                if (!internalState.isError())
                {
                    l1 = mediaPlayer.getCurrentPosition();
                }
            }
            if (mediaPlayer == null)
            {
                return l1;
            }
            if (flag && l != l1)
            {
                Log.isLoggable("MediaPlayerAdapter", 3);
                resetConnectionRetries();
                playerHandler.removeMessages(0);
                seekPos = l;
                waitingForSeek = true;
                bufferUnderrunListener.onSeek();
                mediaPlayer.seekTo((int)l);
            }
            return l;
        } else
        {
            return -1L;
        }
    }

    public void setListener(com.soundcloud.android.playback.Player.PlayerListener playerlistener)
    {
        playerListener = playerlistener;
    }

    void setResumeTimeAndInvokeErrorListener(MediaPlayer mediaplayer, long l)
    {
        if (mediaplayer == mediaPlayer)
        {
            handleMediaPlayerError(mediaplayer, l);
        }
    }

    public void setVolume(float f)
    {
        if (mediaPlayer != null)
        {
            mediaPlayer.setVolume(f, f);
        }
    }

    public void stop()
    {
        MediaPlayer mediaplayer = mediaPlayer;
        if (mediaplayer != null)
        {
            long l = getAdjustedProgress();
            long l1 = getDuration();
            if (internalState.isStoppable())
            {
                mediaplayer.stop();
            }
            mediaPlayerManager.stopAndReleaseAsync(mediaplayer);
            mediaPlayer = null;
            setInternalState(PlaybackState.STOPPED, l, l1);
        }
    }

    void stop(MediaPlayer mediaplayer)
    {
        if (mediaplayer == mediaPlayer)
        {
            stop();
        }
    }

    public void stopForTrackTransition()
    {
        stop();
    }


/*
    static long access$002(MediaPlayerAdapter mediaplayeradapter, long l)
    {
        mediaplayeradapter.seekPos = l;
        return l;
    }

*/


    private class _cls1
    {

        static final int $SwitchMap$com$soundcloud$android$playback$mediaplayer$PlaybackState[];

        static 
        {
            $SwitchMap$com$soundcloud$android$playback$mediaplayer$PlaybackState = new int[PlaybackState.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$playback$mediaplayer$PlaybackState[PlaybackState.PREPARING.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$soundcloud$android$playback$mediaplayer$PlaybackState[PlaybackState.PAUSED_FOR_BUFFERING.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$soundcloud$android$playback$mediaplayer$PlaybackState[PlaybackState.PLAYING.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$soundcloud$android$playback$mediaplayer$PlaybackState[PlaybackState.ERROR.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$soundcloud$android$playback$mediaplayer$PlaybackState[PlaybackState.COMPLETED.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$soundcloud$android$playback$mediaplayer$PlaybackState[PlaybackState.PAUSED.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$soundcloud$android$playback$mediaplayer$PlaybackState[PlaybackState.STOPPED.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$playback$mediaplayer$PlaybackState[PlaybackState.ERROR_RETRYING.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
