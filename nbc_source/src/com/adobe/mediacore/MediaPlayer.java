// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.ave.drm.DRMManager;
import com.adobe.mediacore.metadata.TimedMetadata;
import com.adobe.mediacore.qos.LoadInfo;
import com.adobe.mediacore.qos.metrics.PlaybackMetrics;
import com.adobe.mediacore.session.NotificationHistory;
import com.adobe.mediacore.timeline.Timeline;
import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.timeline.advertising.AdClick;
import com.adobe.mediacore.utils.TimeRange;

// Referenced classes of package com.adobe.mediacore:
//            BufferControlParameters, TextFormat, MediaPlayerItem, MediaPlayerView, 
//            AdClientFactory, MediaResource, ABRControlParameters, DRMMetadataInfo, 
//            MediaPlayerNotification

public interface MediaPlayer
{
    public static interface AdPlaybackEventListener
        extends EventListener
    {

        public abstract void onAdBreakComplete(AdBreak adbreak);

        public abstract void onAdBreakSkipped(AdBreak adbreak);

        public abstract void onAdBreakStart(AdBreak adbreak);

        public abstract void onAdClick(AdBreak adbreak, Ad ad, AdClick adclick);

        public abstract void onAdComplete(AdBreak adbreak, Ad ad);

        public abstract void onAdProgress(AdBreak adbreak, Ad ad, int i);

        public abstract void onAdStart(AdBreak adbreak, Ad ad);
    }

    public static interface BlackoutsEventListener
        extends EventListener
    {

        public abstract void onBackgroundManifestFailed();

        public abstract void onTimedMetadataInBackgroundItem(TimedMetadata timedmetadata);
    }

    public static interface DRMEventListener
        extends EventListener
    {

        public abstract void onDRMMetadata(DRMMetadataInfo drmmetadatainfo);
    }

    public static final class Event extends Enum
    {

        private static final Event $VALUES[];
        public static final Event AD_PLAYBACK;
        public static final Event BLACKOUTS;
        public static final Event DRM;
        public static final Event PLAYBACK;
        public static final Event QOS;

        public static Event valueOf(String s)
        {
            return (Event)Enum.valueOf(com/adobe/mediacore/MediaPlayer$Event, s);
        }

        public static Event[] values()
        {
            return (Event[])$VALUES.clone();
        }

        static 
        {
            PLAYBACK = new Event("PLAYBACK", 0);
            AD_PLAYBACK = new Event("AD_PLAYBACK", 1);
            QOS = new Event("QOS", 2);
            DRM = new Event("DRM", 3);
            BLACKOUTS = new Event("BLACKOUTS", 4);
            $VALUES = (new Event[] {
                PLAYBACK, AD_PLAYBACK, QOS, DRM, BLACKOUTS
            });
        }

        private Event(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface EventListener
    {
    }

    public static interface PlaybackEventListener
        extends EventListener
    {

        public abstract void onPlayComplete();

        public abstract void onPlayStart();

        public abstract void onPrepared();

        public abstract void onProfileChanged(long l, long l1);

        public abstract void onRatePlaying(float f);

        public abstract void onRateSelected(float f);

        public abstract void onReplaceMediaPlayerItem();

        public abstract void onSizeAvailable(long l, long l1);

        public abstract void onStateChanged(PlayerState playerstate, MediaPlayerNotification mediaplayernotification);

        public abstract void onTimedMetadata(TimedMetadata timedmetadata);

        public abstract void onTimelineUpdated();

        public abstract void onUpdated();
    }

    public static final class PlayerState extends Enum
    {

        private static final PlayerState $VALUES[];
        public static final PlayerState COMPLETE;
        public static final PlayerState ERROR;
        public static final PlayerState IDLE;
        public static final PlayerState INITIALIZED;
        public static final PlayerState INITIALIZING;
        public static final PlayerState PAUSED;
        public static final PlayerState PLAYING;
        public static final PlayerState PREPARED;
        public static final PlayerState PREPARING;
        public static final PlayerState READY;
        public static final PlayerState RELEASED;
        public static final PlayerState SUSPENDED;

        public static PlayerState valueOf(String s)
        {
            return (PlayerState)Enum.valueOf(com/adobe/mediacore/MediaPlayer$PlayerState, s);
        }

        public static PlayerState[] values()
        {
            return (PlayerState[])$VALUES.clone();
        }

        static 
        {
            IDLE = new PlayerState("IDLE", 0);
            INITIALIZING = new PlayerState("INITIALIZING", 1);
            INITIALIZED = new PlayerState("INITIALIZED", 2);
            PREPARING = new PlayerState("PREPARING", 3);
            PREPARED = new PlayerState("PREPARED", 4);
            READY = new PlayerState("READY", 5);
            PLAYING = new PlayerState("PLAYING", 6);
            PAUSED = new PlayerState("PAUSED", 7);
            COMPLETE = new PlayerState("COMPLETE", 8);
            ERROR = new PlayerState("ERROR", 9);
            RELEASED = new PlayerState("RELEASED", 10);
            SUSPENDED = new PlayerState("SUSPENDED", 11);
            $VALUES = (new PlayerState[] {
                IDLE, INITIALIZING, INITIALIZED, PREPARING, PREPARED, READY, PLAYING, PAUSED, COMPLETE, ERROR, 
                RELEASED, SUSPENDED
            });
        }

        private PlayerState(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface QOSEventListener
        extends EventListener
    {

        public abstract void onBufferComplete();

        public abstract void onBufferStart();

        public abstract void onLoadInfo(LoadInfo loadinfo);

        public abstract void onOperationFailed(MediaPlayerNotification.Warning warning);

        public abstract void onSeekComplete(long l);

        public abstract void onSeekStart();
    }

    public static final class Visibility extends Enum
    {

        private static final Visibility $VALUES[];
        public static final Visibility INVISIBLE;
        public static final Visibility VISIBLE;

        public static Visibility valueOf(String s)
        {
            return (Visibility)Enum.valueOf(com/adobe/mediacore/MediaPlayer$Visibility, s);
        }

        public static Visibility[] values()
        {
            return (Visibility[])$VALUES.clone();
        }

        static 
        {
            VISIBLE = new Visibility("VISIBLE", 0);
            INVISIBLE = new Visibility("INVISIBLE", 1);
            $VALUES = (new Visibility[] {
                VISIBLE, INVISIBLE
            });
        }

        private Visibility(String s, int i)
        {
            super(s, i);
        }
    }


    public static final long LIVE_POINT = -2L;

    public abstract void addEventListener(Event event, EventListener eventlistener);

    public abstract long convertToLocalTime(long l)
        throws IllegalStateException;

    public abstract BufferControlParameters getBufferControlParameters()
        throws IllegalStateException;

    public abstract TimeRange getBufferedRange()
        throws IllegalStateException;

    public abstract TextFormat getCCStyle()
        throws IllegalStateException;

    public abstract Visibility getCCVisibility()
        throws IllegalStateException;

    public abstract MediaPlayerItem getCurrentItem()
        throws IllegalStateException;

    public abstract long getCurrentTime()
        throws IllegalStateException;

    public abstract DRMManager getDRMManager();

    public abstract long getLocalTime()
        throws IllegalStateException;

    public abstract NotificationHistory getNotificationHistory();

    public abstract PlaybackMetrics getPlaybackMetrics()
        throws IllegalStateException;

    public abstract TimeRange getPlaybackRange()
        throws IllegalStateException;

    public abstract float getRate()
        throws IllegalStateException;

    public abstract TimeRange getSeekableRange()
        throws IllegalStateException;

    public abstract PlayerState getStatus()
        throws IllegalStateException;

    public abstract Timeline getTimeline()
        throws IllegalStateException;

    public abstract MediaPlayerView getView()
        throws IllegalStateException;

    public abstract void pause()
        throws IllegalStateException;

    public abstract void play()
        throws IllegalStateException;

    public abstract void prepareBuffer()
        throws IllegalStateException;

    public abstract void prepareToPlay()
        throws IllegalStateException;

    public abstract void prepareToPlay(long l)
        throws IllegalStateException;

    public abstract void registerAdClientFactory(AdClientFactory adclientfactory);

    public abstract void registerCurrentItemAsBackgroundItem()
        throws IllegalStateException;

    public abstract void release();

    public abstract void removeEventListener(Event event, EventListener eventlistener);

    public abstract void replaceCurrentItem(MediaResource mediaresource)
        throws IllegalStateException;

    public abstract void reset()
        throws IllegalStateException;

    public abstract void seek(long l)
        throws IllegalStateException;

    public abstract void seekToLocalTime(long l)
        throws IllegalStateException;

    public abstract void setABRControlParameters(ABRControlParameters abrcontrolparameters)
        throws IllegalStateException;

    public abstract void setBufferControlParameters(BufferControlParameters buffercontrolparameters)
        throws IllegalStateException;

    public abstract void setCCStyle(TextFormat textformat)
        throws IllegalStateException;

    public abstract void setCCVisibility(Visibility visibility)
        throws IllegalStateException;

    public abstract void setCustomConfiguration(String s)
        throws IllegalStateException;

    public abstract void setRate(float f)
        throws IllegalStateException;

    public abstract void setVolume(int i)
        throws IllegalStateException;

    public abstract boolean shouldTriggerSubscribedTagEvent()
        throws IllegalStateException;

    public abstract void unregisterCurrentBackgroundItem()
        throws IllegalStateException;
}
