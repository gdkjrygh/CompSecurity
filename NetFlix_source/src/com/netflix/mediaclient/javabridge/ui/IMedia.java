// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui;

import android.content.Context;
import android.view.Surface;
import com.netflix.mediaclient.media.AudioSource;
import com.netflix.mediaclient.media.AudioSubtitleDefaultOrderInfo;
import com.netflix.mediaclient.media.PlayerType;
import com.netflix.mediaclient.media.PlayoutMetadata;
import com.netflix.mediaclient.media.Subtitle;
import com.netflix.mediaclient.media.TrickplayUrl;
import com.netflix.mediaclient.media.bitrate.AudioBitrateRange;
import com.netflix.mediaclient.media.bitrate.VideoBitrateRange;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.javabridge.ui:
//            EventListener

public interface IMedia
{
    public static final class MediaEventEnum extends Enum
    {

        private static final MediaEventEnum $VALUES[];
        public static final MediaEventEnum generic_background;
        public static final MediaEventEnum media_audioTrackChanged;
        public static final MediaEventEnum media_buffering;
        public static final MediaEventEnum media_bufferingComplete;
        public static final MediaEventEnum media_bufferrange;
        public static final MediaEventEnum media_endOfStream;
        public static final MediaEventEnum media_error;
        public static final MediaEventEnum media_exception;
        public static final MediaEventEnum media_nccp;
        public static final MediaEventEnum media_nccpError;
        public static final MediaEventEnum media_newStream;
        public static final MediaEventEnum media_openComplete;
        public static final MediaEventEnum media_removeSubtitle;
        public static final MediaEventEnum media_setvideobitraterange;
        public static final MediaEventEnum media_setvideoresolutionrange;
        public static final MediaEventEnum media_showSubtitle;
        public static final MediaEventEnum media_skip;
        public static final MediaEventEnum media_stateChanged;
        public static final MediaEventEnum media_streamSelected;
        public static final MediaEventEnum media_subtitleTrackChanged;
        public static final MediaEventEnum media_subtitledata;
        public static final MediaEventEnum media_swim;
        public static final MediaEventEnum media_underflow;
        public static final MediaEventEnum media_updatePts;
        public static final MediaEventEnum media_updateVideoBitrate;
        public static final MediaEventEnum media_videoWindowChanged;
        public static final MediaEventEnum media_videobitraterangechanged;
        public static final MediaEventEnum media_warning;
        protected String eventName;

        public static MediaEventEnum valueOf(String s)
        {
            return (MediaEventEnum)Enum.valueOf(com/netflix/mediaclient/javabridge/ui/IMedia$MediaEventEnum, s);
        }

        public static MediaEventEnum[] values()
        {
            return (MediaEventEnum[])$VALUES.clone();
        }

        public final String getName()
        {
            return eventName;
        }

        static 
        {
            media_openComplete = new MediaEventEnum("media_openComplete", 0, "openComplete");
            media_streamSelected = new MediaEventEnum("media_streamSelected", 1, "streamSelected");
            media_newStream = new MediaEventEnum("media_newStream", 2, "newStream");
            media_endOfStream = new MediaEventEnum("media_endOfStream", 3, "endOfStream");
            media_underflow = new MediaEventEnum("media_underflow", 4, "underflow");
            media_buffering = new MediaEventEnum("media_buffering", 5, "buffering");
            media_bufferingComplete = new MediaEventEnum("media_bufferingComplete", 6, "bufferingComplete");
            media_updatePts = new MediaEventEnum("media_updatePts", 7, "updatePts");
            media_updateVideoBitrate = new MediaEventEnum("media_updateVideoBitrate", 8, "updateVideoBitrate");
            media_audioTrackChanged = new MediaEventEnum("media_audioTrackChanged", 9, "audioTrackChanged");
            media_nccpError = new MediaEventEnum("media_nccpError", 10, "nccperror");
            media_nccp = new MediaEventEnum("media_nccp", 11, "Nccp");
            media_subtitleTrackChanged = new MediaEventEnum("media_subtitleTrackChanged", 12, "subtitleTrackChanged");
            media_videoWindowChanged = new MediaEventEnum("media_videoWindowChanged", 13, "videoWindowChanged");
            media_showSubtitle = new MediaEventEnum("media_showSubtitle", 14, "showSubtitle");
            media_removeSubtitle = new MediaEventEnum("media_removeSubtitle", 15, "removeSubtitle");
            media_error = new MediaEventEnum("media_error", 16, "error");
            media_warning = new MediaEventEnum("media_warning", 17, "warning");
            media_exception = new MediaEventEnum("media_exception", 18, "exception");
            media_stateChanged = new MediaEventEnum("media_stateChanged", 19, "statechanged");
            media_bufferrange = new MediaEventEnum("media_bufferrange", 20, "bufferrange");
            generic_background = new MediaEventEnum("generic_background", 21, "background");
            media_skip = new MediaEventEnum("media_skip", 22, "skip");
            media_swim = new MediaEventEnum("media_swim", 23, "swim");
            media_setvideobitraterange = new MediaEventEnum("media_setvideobitraterange", 24, "setvideobitraterange");
            media_setvideoresolutionrange = new MediaEventEnum("media_setvideoresolutionrange", 25, "setvideoresolutionrange");
            media_videobitraterangechanged = new MediaEventEnum("media_videobitraterangechanged", 26, "videobitraterangechanged");
            media_subtitledata = new MediaEventEnum("media_subtitledata", 27, "subtitledata");
            $VALUES = (new MediaEventEnum[] {
                media_openComplete, media_streamSelected, media_newStream, media_endOfStream, media_underflow, media_buffering, media_bufferingComplete, media_updatePts, media_updateVideoBitrate, media_audioTrackChanged, 
                media_nccpError, media_nccp, media_subtitleTrackChanged, media_videoWindowChanged, media_showSubtitle, media_removeSubtitle, media_error, media_warning, media_exception, media_stateChanged, 
                media_bufferrange, generic_background, media_skip, media_swim, media_setvideobitraterange, media_setvideoresolutionrange, media_videobitraterangechanged, media_subtitledata
            });
        }

        private MediaEventEnum(String s, int i, String s1)
        {
            super(s, i);
            eventName = s1;
        }
    }

    public static final class SubtitleOutputMode extends Enum
    {

        private static final SubtitleOutputMode $VALUES[];
        public static final SubtitleOutputMode DATA_JSON;
        public static final SubtitleOutputMode DATA_XML;
        public static final SubtitleOutputMode EVENTS;
        protected int mValue;

        public static SubtitleOutputMode valueOf(String s)
        {
            return (SubtitleOutputMode)Enum.valueOf(com/netflix/mediaclient/javabridge/ui/IMedia$SubtitleOutputMode, s);
        }

        public static SubtitleOutputMode[] values()
        {
            return (SubtitleOutputMode[])$VALUES.clone();
        }

        public final int getValue()
        {
            return mValue;
        }

        static 
        {
            EVENTS = new SubtitleOutputMode("EVENTS", 0, 0);
            DATA_XML = new SubtitleOutputMode("DATA_XML", 1, 1);
            DATA_JSON = new SubtitleOutputMode("DATA_JSON", 2, 2);
            $VALUES = (new SubtitleOutputMode[] {
                EVENTS, DATA_XML, DATA_JSON
            });
        }

        private SubtitleOutputMode(String s, int i, int j)
        {
            super(s, i);
            mValue = j;
        }
    }

    public static final class SubtitleProfile extends Enum
    {

        private static final SubtitleProfile $VALUES[];
        public static final SubtitleProfile ENHANCED;
        public static final SubtitleProfile SIMPLE;
        private String mNccpCode;
        private int mValue;

        public static SubtitleProfile fromNccpCode(String s)
        {
            if (!StringUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
            s = SIMPLE;
_L4:
            return s;
_L2:
            String s1 = s.trim();
            SubtitleProfile asubtitleprofile[] = values();
            int j = asubtitleprofile.length;
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= j)
                    {
                        break label1;
                    }
                    SubtitleProfile subtitleprofile = asubtitleprofile[i];
                    s = subtitleprofile;
                    if (subtitleprofile.getNccpCode().equalsIgnoreCase(s1))
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
            return SIMPLE;
        }

        public static SubtitleProfile valueOf(String s)
        {
            return (SubtitleProfile)Enum.valueOf(com/netflix/mediaclient/javabridge/ui/IMedia$SubtitleProfile, s);
        }

        public static SubtitleProfile[] values()
        {
            return (SubtitleProfile[])$VALUES.clone();
        }

        public String getNccpCode()
        {
            return mNccpCode;
        }

        public final int getValue()
        {
            return mValue;
        }

        static 
        {
            SIMPLE = new SubtitleProfile("SIMPLE", 0, 0, "simplesdh");
            ENHANCED = new SubtitleProfile("ENHANCED", 1, 1, "dfxp-ls-sdh");
            $VALUES = (new SubtitleProfile[] {
                SIMPLE, ENHANCED
            });
        }

        private SubtitleProfile(String s, int i, int j, String s1)
        {
            super(s, i);
            mValue = j;
            mNccpCode = s1;
        }
    }


    public static final int CLOSED = 4;
    public static final String NAME = "media";
    public static final int OPENING = 0;
    public static final String PATH = "nrdp.media";
    public static final int PAUSED = 2;
    public static final int PLAYING = 1;
    public static final int STOPPED = 3;

    public abstract void addEventListener(String s, EventListener eventlistener);

    public abstract void changePlayer(PlayerType playertype, int i);

    public abstract void close();

    public abstract AudioSubtitleDefaultOrderInfo[] getAudioSubtitleDefaultOrderInfo();

    public abstract AudioSource[] getAudioTrackList();

    public abstract AudioSource getCurrentAudioTrack();

    public abstract int getCurrentPosition();

    public abstract Subtitle getCurrentSubtitleTrack();

    public abstract float getDisplayAspectRatio();

    public abstract int getDuration();

    public abstract int getMediaPosition();

    public abstract PlayoutMetadata getPlayoutMetadata();

    public abstract int getState();

    public abstract SubtitleOutputMode getSubtitleOutputMode();

    public abstract SubtitleProfile getSubtitleProfile();

    public abstract Subtitle[] getSubtitleTrackList();

    public abstract TrickplayUrl[] getTrickplayUrlList();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void open(long l, PlayContext playcontext, com.netflix.mediaclient.javabridge.invoke.media.Open.NetType nettype);

    public abstract void pause();

    public abstract void play(long l);

    public abstract void removeEventListener(String s, EventListener eventlistener);

    public abstract void reset();

    public abstract void seekTo(int i, boolean flag);

    public abstract boolean selectTracks(AudioSource audiosource, Subtitle subtitle);

    public abstract void setAudioBitrateRange(AudioBitrateRange audiobitraterange);

    public abstract void setBytesReport(int i, int j);

    public abstract void setMaxVideoBufferSize(int i);

    public abstract void setNetworkProfile(int i);

    public abstract void setStreamingQoe(String s);

    public abstract void setSubtitleOutputMode(SubtitleOutputMode subtitleoutputmode);

    public abstract void setSubtitleProfile(SubtitleProfile subtitleprofile);

    public abstract void setSurface(Surface surface);

    public abstract void setThrotteled(boolean flag);

    public abstract void setVOapi(long l, long l1);

    public abstract void setVideoBitrateRange(int i, int j);

    public abstract void setVideoBitrateRanges(VideoBitrateRange avideobitraterange[]);

    public abstract void setWifiApsInfo(Context context, String s, boolean flag);

    public abstract void setWifiLinkSpeed(Context context);

    public abstract void stop();

    public abstract void unpause();
}
