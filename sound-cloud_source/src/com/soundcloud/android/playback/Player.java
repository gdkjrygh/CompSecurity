// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.content.Intent;
import android.util.SparseArray;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.utils.CurrentDateProvider;
import com.soundcloud.java.objects.MoreObjects;
import java.util.EnumSet;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaybackProgress

public interface Player
{
    public static final class Error extends Enum
    {

        private static final Error $VALUES[];
        public static final Error FAILED;
        public static final Error FORBIDDEN;
        public static final Error MEDIA_NOT_FOUND;

        public static Error valueOf(String s)
        {
            return (Error)Enum.valueOf(com/soundcloud/android/playback/Player$Error, s);
        }

        public static Error[] values()
        {
            return (Error[])$VALUES.clone();
        }

        static 
        {
            FAILED = new Error("FAILED", 0);
            MEDIA_NOT_FOUND = new Error("MEDIA_NOT_FOUND", 1);
            FORBIDDEN = new Error("FORBIDDEN", 2);
            $VALUES = (new Error[] {
                FAILED, MEDIA_NOT_FOUND, FORBIDDEN
            });
        }

        private Error(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface PlayerListener
    {

        public abstract void onPlaystateChanged(StateTransition statetransition);

        public abstract void onProgressEvent(long l, long l1);

        public abstract boolean requestAudioFocus();
    }

    public static final class PlayerState extends Enum
    {

        private static final PlayerState $VALUES[];
        public static final PlayerState BUFFERING;
        public static final PlayerState IDLE;
        static final String PLAYER_STATE_EXTRA = "PLAYER_STATE_EXTRA";
        public static final PlayerState PLAYING;

        private void addToIntent(Intent intent)
        {
            intent.putExtra("PLAYER_STATE_EXTRA", ordinal());
        }

        public static PlayerState valueOf(String s)
        {
            return (PlayerState)Enum.valueOf(com/soundcloud/android/playback/Player$PlayerState, s);
        }

        public static PlayerState[] values()
        {
            return (PlayerState[])$VALUES.clone();
        }

        public final boolean isBuffering()
        {
            return this == BUFFERING;
        }

        public final boolean isIdle()
        {
            return this == IDLE;
        }

        public final boolean isPlayerPlaying()
        {
            return this == PLAYING;
        }

        public final boolean isPlaying()
        {
            return this == PLAYING || this == BUFFERING;
        }

        static 
        {
            BUFFERING = new PlayerState("BUFFERING", 0);
            PLAYING = new PlayerState("PLAYING", 1);
            IDLE = new PlayerState("IDLE", 2);
            $VALUES = (new PlayerState[] {
                BUFFERING, PLAYING, IDLE
            });
        }


        private PlayerState(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class Reason extends Enum
    {

        private static final Reason $VALUES[];
        public static final EnumSet ERRORS;
        public static final Reason ERROR_FAILED;
        public static final Reason ERROR_FORBIDDEN;
        public static final Reason ERROR_NOT_FOUND;
        public static final Reason NONE;
        public static final EnumSet PLAYBACK_STOPPED;
        static final String PLAYER_REASON_EXTRA = "PLAYER_REASON_EXTRA";
        public static final Reason PLAY_QUEUE_COMPLETE;
        public static final Reason TRACK_COMPLETE;

        private void addToIntent(Intent intent)
        {
            intent.putExtra("PLAYER_REASON_EXTRA", ordinal());
        }

        public static Reason valueOf(String s)
        {
            return (Reason)Enum.valueOf(com/soundcloud/android/playback/Player$Reason, s);
        }

        public static Reason[] values()
        {
            return (Reason[])$VALUES.clone();
        }

        static 
        {
            NONE = new Reason("NONE", 0);
            TRACK_COMPLETE = new Reason("TRACK_COMPLETE", 1);
            PLAY_QUEUE_COMPLETE = new Reason("PLAY_QUEUE_COMPLETE", 2);
            ERROR_FAILED = new Reason("ERROR_FAILED", 3);
            ERROR_NOT_FOUND = new Reason("ERROR_NOT_FOUND", 4);
            ERROR_FORBIDDEN = new Reason("ERROR_FORBIDDEN", 5);
            $VALUES = (new Reason[] {
                NONE, TRACK_COMPLETE, PLAY_QUEUE_COMPLETE, ERROR_FAILED, ERROR_NOT_FOUND, ERROR_FORBIDDEN
            });
            ERRORS = EnumSet.of(ERROR_FAILED, ERROR_NOT_FOUND, ERROR_FORBIDDEN);
            PLAYBACK_STOPPED = EnumSet.of(TRACK_COMPLETE, ERROR_FAILED, ERROR_NOT_FOUND, ERROR_FORBIDDEN);
        }


        private Reason(String s, int i)
        {
            super(s, i);
        }
    }

    public static class StateTransition
    {

        public static final StateTransition DEFAULT;
        private static final String DURATION_EXTRA = "DURATION_EXTRA";
        public static final int EXTRA_CONNECTION_TYPE = 2;
        public static final int EXTRA_NETWORK_AND_WAKE_LOCKS_ACTIVE = 3;
        public static final int EXTRA_PLAYBACK_PROTOCOL = 0;
        public static final int EXTRA_PLAYER_TYPE = 1;
        public static final int EXTRA_URI = 4;
        private static final String PROGRESS_EXTRA = "PROGRESS_EXTRA";
        private static final String TRACK_URN_EXTRA = "TRACK_URN_EXTRA";
        private final SparseArray extraAttributes;
        private final PlayerState newState;
        private final PlaybackProgress progress;
        private final Reason reason;
        private final Urn trackUrn;

        public void addExtraAttribute(int i, String s)
        {
            extraAttributes.put(i, s);
        }

        public void addToIntent(Intent intent)
        {
            newState.addToIntent(intent);
            reason.addToIntent(intent);
            intent.putExtra("TRACK_URN_EXTRA", getTrackUrn());
            intent.putExtra("PROGRESS_EXTRA", progress.getPosition());
            intent.putExtra("DURATION_EXTRA", progress.getDuration());
        }

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (StateTransition)obj;
                if (!MoreObjects.equal(newState, ((StateTransition) (obj)).newState) || !MoreObjects.equal(reason, ((StateTransition) (obj)).reason) || !MoreObjects.equal(progress, ((StateTransition) (obj)).progress) || !MoreObjects.equal(trackUrn, ((StateTransition) (obj)).trackUrn))
                {
                    return false;
                }
            }
            return true;
        }

        public String getExtraAttribute(int i)
        {
            return (String)extraAttributes.get(i);
        }

        public PlayerState getNewState()
        {
            return newState;
        }

        public PlaybackProgress getProgress()
        {
            return progress;
        }

        public Reason getReason()
        {
            return reason;
        }

        public Urn getTrackUrn()
        {
            return trackUrn;
        }

        public int hashCode()
        {
            int j = newState.hashCode();
            int k = reason.hashCode();
            int l = progress.hashCode();
            int i;
            if (trackUrn != null)
            {
                i = trackUrn.hashCode();
            } else
            {
                i = 0;
            }
            return i + ((j * 31 + k) * 31 + l) * 31;
        }

        public boolean isBuffering()
        {
            return newState.isBuffering();
        }

        public boolean isForTrack(Urn urn)
        {
            return trackUrn != null && trackUrn.equals(urn);
        }

        public boolean isPaused()
        {
            return newState == PlayerState.IDLE && reason == Reason.NONE;
        }

        public boolean isPlayQueueComplete()
        {
            return reason == Reason.PLAY_QUEUE_COMPLETE;
        }

        public boolean isPlayerIdle()
        {
            return newState == PlayerState.IDLE;
        }

        public boolean isPlayerPlaying()
        {
            return newState.isPlayerPlaying();
        }

        boolean isPlaying()
        {
            return newState.isPlaying();
        }

        public boolean playSessionIsActive()
        {
            return newState.isPlaying() || newState == PlayerState.IDLE && reason == Reason.TRACK_COMPLETE;
        }

        public boolean playbackHasStopped()
        {
            return Reason.PLAYBACK_STOPPED.contains(reason);
        }

        public String toString()
        {
            return (new StringBuilder("StateTransition{newState=")).append(newState).append(", reason=").append(reason).append(", currentProgress=").append(progress.getPosition()).append(", duration=").append(progress.getDuration()).append(", trackUrn=").append(trackUrn).append(", extraAttributes=").append(extraAttributes).append('}').toString();
        }

        public boolean trackEnded()
        {
            return newState == PlayerState.IDLE && reason == Reason.TRACK_COMPLETE;
        }

        public boolean wasError()
        {
            return Reason.ERRORS.contains(reason);
        }

        public boolean wasGeneralFailure()
        {
            return reason == Reason.ERROR_FAILED;
        }

        static 
        {
            DEFAULT = new StateTransition(PlayerState.IDLE, Reason.NONE, Urn.NOT_SET);
        }

        public StateTransition(PlayerState playerstate, Reason reason1, Urn urn)
        {
            this(playerstate, reason1, urn, 0L, 0L);
        }

        public StateTransition(PlayerState playerstate, Reason reason1, Urn urn, long l, long l1)
        {
            this(playerstate, reason1, urn, l, l1, new CurrentDateProvider());
        }

        public StateTransition(PlayerState playerstate, Reason reason1, Urn urn, long l, long l1, 
                CurrentDateProvider currentdateprovider)
        {
            extraAttributes = new SparseArray(2);
            newState = playerstate;
            reason = reason1;
            trackUrn = urn;
            progress = new PlaybackProgress(l, l1, currentdateprovider);
        }
    }


    public abstract void destroy();

    public abstract long getProgress();

    public abstract boolean isSeekable();

    public abstract void pause();

    public abstract void play(Urn urn);

    public abstract void play(Urn urn, long l);

    public abstract void playOffline(Urn urn, long l);

    public abstract void playUninterrupted(Urn urn);

    public abstract void resume();

    public abstract long seek(long l, boolean flag);

    public abstract void setListener(PlayerListener playerlistener);

    public abstract void setVolume(float f);

    public abstract void stop();

    public abstract void stopForTrackTransition();
}
