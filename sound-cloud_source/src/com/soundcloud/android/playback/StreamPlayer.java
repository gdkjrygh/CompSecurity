// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.content.Context;
import com.soundcloud.android.playback.mediaplayer.MediaPlayerAdapter;
import com.soundcloud.android.playback.skippy.SkippyAdapter;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import com.soundcloud.java.checks.Preconditions;

// Referenced classes of package com.soundcloud.android.playback:
//            Player, PlaybackConstants, PlaybackItem, PlaybackType

class StreamPlayer
    implements Player.PlayerListener
{

    public static final String TAG = "StreamPlayer";
    static boolean skippyFailedToInitialize;
    private Player currentPlayer;
    private Player.StateTransition lastStateTransition;
    private PlaybackItem lastTrackPlayed;
    private final MediaPlayerAdapter mediaPlayerDelegate;
    private final NetworkConnectionHelper networkConnectionHelper;
    private Player.PlayerListener playerListener;
    private final SkippyAdapter skippyPlayerDelegate;

    public StreamPlayer(Context context, MediaPlayerAdapter mediaplayeradapter, SkippyAdapter skippyadapter, NetworkConnectionHelper networkconnectionhelper)
    {
        lastStateTransition = Player.StateTransition.DEFAULT;
        mediaPlayerDelegate = mediaplayeradapter;
        skippyPlayerDelegate = skippyadapter;
        networkConnectionHelper = networkconnectionhelper;
        if (!skippyFailedToInitialize)
        {
            boolean flag;
            if (!skippyPlayerDelegate.init(context))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            skippyFailedToInitialize = flag;
        }
        if (!skippyFailedToInitialize)
        {
            mediaplayeradapter = skippyadapter;
        }
        currentPlayer = mediaplayeradapter;
    }

    private void configureNextPlayerToUse()
    {
        configureNextPlayerToUse(getNextPlayer());
    }

    private void configureNextPlayerToUse(Player player)
    {
        (new StringBuilder("Configuring next player to use : ")).append(player);
        if (currentPlayer != null && currentPlayer != player)
        {
            currentPlayer.stopForTrackTransition();
        }
        currentPlayer = player;
        currentPlayer.setListener(this);
    }

    private Player getNextPlayer()
    {
        if (skippyFailedToInitialize || PlaybackConstants.FORCE_MEDIA_PLAYER)
        {
            return mediaPlayerDelegate;
        } else
        {
            return skippyPlayerDelegate;
        }
    }

    private boolean isUsingSkippyPlayer()
    {
        return currentPlayer == skippyPlayerDelegate;
    }

    private void prepareForPlay(PlaybackItem playbackitem)
    {
        lastTrackPlayed = playbackitem;
        configureNextPlayerToUse();
    }

    private boolean shouldFallbackToMediaPlayer(Player.StateTransition statetransition)
    {
        return isUsingSkippyPlayer() && statetransition.wasGeneralFailure() && networkConnectionHelper.isNetworkConnected();
    }

    public void destroy()
    {
        mediaPlayerDelegate.destroy();
        if (!skippyFailedToInitialize)
        {
            skippyPlayerDelegate.destroy();
        }
    }

    public Player.StateTransition getLastStateTransition()
    {
        return lastStateTransition;
    }

    public long getProgress()
    {
        return currentPlayer.getProgress();
    }

    public Player.PlayerState getState()
    {
        return lastStateTransition.getNewState();
    }

    public boolean isBuffering()
    {
        return lastStateTransition.isBuffering();
    }

    public boolean isPlayerPlaying()
    {
        return lastStateTransition.isPlayerPlaying();
    }

    public boolean isPlaying()
    {
        return lastStateTransition.isPlaying();
    }

    public boolean isSeekable()
    {
        return currentPlayer.isSeekable();
    }

    public void onPlaystateChanged(Player.StateTransition statetransition)
    {
        if (shouldFallbackToMediaPlayer(statetransition))
        {
            long l = skippyPlayerDelegate.getProgress();
            configureNextPlayerToUse(mediaPlayerDelegate);
            mediaPlayerDelegate.play(lastTrackPlayed.getTrackUrn(), l);
            return;
        } else
        {
            Preconditions.checkNotNull(playerListener, "Stream Player Listener is unexpectedly null when passing state");
            lastStateTransition = statetransition;
            playerListener.onPlaystateChanged(statetransition);
            return;
        }
    }

    public void onProgressEvent(long l, long l1)
    {
        playerListener.onProgressEvent(l, l1);
    }

    public void pause()
    {
        currentPlayer.pause();
    }

    public void play(PlaybackItem playbackitem)
    {
        prepareForPlay(playbackitem);
        switch (_cls1..SwitchMap.com.soundcloud.android.playback.PlaybackType[playbackitem.getPlaybackType().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            currentPlayer.play(playbackitem.getTrackUrn(), playbackitem.getStartPosition());
            return;

        case 2: // '\002'
            currentPlayer.playOffline(playbackitem.getTrackUrn(), playbackitem.getStartPosition());
            return;

        case 3: // '\003'
            currentPlayer.playUninterrupted(playbackitem.getTrackUrn());
            break;
        }
    }

    public boolean playbackHasPaused()
    {
        return lastStateTransition.isPaused();
    }

    public boolean requestAudioFocus()
    {
        Preconditions.checkNotNull(playerListener, "Stream Player Listener is unexpectedly null when requesting audio focus");
        return playerListener.requestAudioFocus();
    }

    public void resume()
    {
        currentPlayer.resume();
    }

    public long seek(long l, boolean flag)
    {
        return currentPlayer.seek(l, flag);
    }

    public void setListener(Player.PlayerListener playerlistener)
    {
        playerListener = playerlistener;
        if (currentPlayer != null)
        {
            currentPlayer.setListener(playerlistener);
        }
    }

    public void setVolume(float f)
    {
        currentPlayer.setVolume(f);
    }

    public void stop()
    {
        currentPlayer.stop();
    }

    private class _cls1
    {

        static final int $SwitchMap$com$soundcloud$android$playback$PlaybackType[];

        static 
        {
            $SwitchMap$com$soundcloud$android$playback$PlaybackType = new int[PlaybackType.values().length];
            try
            {
                $SwitchMap$com$soundcloud$android$playback$PlaybackType[PlaybackType.DEFAULT.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$soundcloud$android$playback$PlaybackType[PlaybackType.OFFLINE.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$soundcloud$android$playback$PlaybackType[PlaybackType.UNINTERRUPTED.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
