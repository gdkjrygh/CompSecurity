// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import android.view.Surface;
import android.view.SurfaceHolder;
import com.netflix.mediaclient.event.nrdp.media.Error;
import com.netflix.mediaclient.event.nrdp.media.NccpError;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.AudioSubtitleDefaultOrderInfo;
import com.netflix.mediaclient.media.Language;
import com.netflix.mediaclient.media.PlayoutMetadata;
import com.netflix.mediaclient.media.Subtitle;
import com.netflix.mediaclient.service.configuration.SubtitleConfiguration;
import com.netflix.mediaclient.service.player.subtitles.SubtitleScreen;
import com.netflix.mediaclient.ui.common.PlayContext;
import java.nio.ByteBuffer;

public interface IPlayer
{
    public static interface PlayerListener
    {

        public abstract boolean isListening();

        public abstract void onAudioChange(int i);

        public abstract void onBandwidthChange(int i);

        public abstract void onBufferingUpdate(int i);

        public abstract void onCompletion();

        public abstract void onMediaError(Error error);

        public abstract void onNccpError(NccpError nccperror);

        public abstract void onNrdFatalError();

        public abstract void onPlaying();

        public abstract void onPrepared();

        public abstract void onSeekComplete();

        public abstract void onStalled();

        public abstract void onStarted();

        public abstract void onSubtitleChange(SubtitleScreen subtitlescreen);

        public abstract void onSubtitleFailed();

        public abstract void onSubtitleRemove();

        public abstract void onSubtitleShow(String s);

        public abstract void onUpdatePts(int i);

        public abstract void onVideoSizeChanged(int i, int j);

        public abstract void playbackClosed();

        public abstract void restartPlayback(NccpError nccperror);

        public abstract void setLanguage(Language language);
    }


    public static final String EXTRA_TYPE = "lookupType";
    public static final String LOCAL_INTENT_CATEGORY = "com.netflix.mediaclient.intent.category.PLAYER";
    public static final String PLAYER_SUBTITLE_CONFIG_CHANGED = "com.netflix.mediaclient.intent.action.PLAYER_SUBTITLE_CONFIG_CHANGED";

    public abstract void addPlayerListener(PlayerListener playerlistener);

    public abstract boolean canUpdatePosition(int i);

    public abstract void close();

    public abstract AudioSubtitleDefaultOrderInfo[] getAudioSubtitleDefaultOrderInfo();

    public abstract AudioSource[] getAudioTrackList();

    public abstract ByteBuffer getBifFrame(int i);

    public abstract AudioSource getCurrentAudioTrack();

    public abstract int getCurrentPositionMs();

    public abstract int getCurrentProgress();

    public abstract Subtitle getCurrentSubtitleTrack();

    public abstract int getDuration();

    public abstract PlayoutMetadata getPlayoutMetadata();

    public abstract SubtitleConfiguration getSubtitleConfiguration();

    public abstract com.netflix.mediaclient.javabridge.ui.IMedia.SubtitleProfile getSubtitleProfileFromMetadata();

    public abstract Subtitle[] getSubtitleTrackList();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract boolean isBufferingCompleted();

    public abstract boolean isPlaying();

    public abstract void open(long l, PlayContext playcontext, long l1);

    public abstract void pause();

    public abstract void play();

    public abstract void removePlayerListener(PlayerListener playerlistener);

    public abstract void seekTo(int i, boolean flag);

    public abstract boolean selectTracks(AudioSource audiosource, Subtitle subtitle);

    public abstract void setJPlayerListener(com.netflix.mediaclient.media.JPlayer.JPlayer.JplayerListener jplayerlistener);

    public abstract void setSurface(Surface surface);

    public abstract void setSurfaceHolder(SurfaceHolder surfaceholder);

    public abstract void unpause();
}
