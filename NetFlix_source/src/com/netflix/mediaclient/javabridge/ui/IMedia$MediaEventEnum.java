// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui;


// Referenced classes of package com.netflix.mediaclient.javabridge.ui:
//            IMedia

public static final class eventName extends Enum
{

    private static final media_subtitledata $VALUES[];
    public static final media_subtitledata generic_background;
    public static final media_subtitledata media_audioTrackChanged;
    public static final media_subtitledata media_buffering;
    public static final media_subtitledata media_bufferingComplete;
    public static final media_subtitledata media_bufferrange;
    public static final media_subtitledata media_endOfStream;
    public static final media_subtitledata media_error;
    public static final media_subtitledata media_exception;
    public static final media_subtitledata media_nccp;
    public static final media_subtitledata media_nccpError;
    public static final media_subtitledata media_newStream;
    public static final media_subtitledata media_openComplete;
    public static final media_subtitledata media_removeSubtitle;
    public static final media_subtitledata media_setvideobitraterange;
    public static final media_subtitledata media_setvideoresolutionrange;
    public static final media_subtitledata media_showSubtitle;
    public static final media_subtitledata media_skip;
    public static final media_subtitledata media_stateChanged;
    public static final media_subtitledata media_streamSelected;
    public static final media_subtitledata media_subtitleTrackChanged;
    public static final media_subtitledata media_subtitledata;
    public static final media_subtitledata media_swim;
    public static final media_subtitledata media_underflow;
    public static final media_subtitledata media_updatePts;
    public static final media_subtitledata media_updateVideoBitrate;
    public static final media_subtitledata media_videoWindowChanged;
    public static final media_subtitledata media_videobitraterangechanged;
    public static final media_subtitledata media_warning;
    protected String eventName;

    public static eventName valueOf(String s)
    {
        return (eventName)Enum.valueOf(com/netflix/mediaclient/javabridge/ui/IMedia$MediaEventEnum, s);
    }

    public static eventName[] values()
    {
        return (eventName[])$VALUES.clone();
    }

    public final String getName()
    {
        return eventName;
    }

    static 
    {
        media_openComplete = new <init>("media_openComplete", 0, "openComplete");
        media_streamSelected = new <init>("media_streamSelected", 1, "streamSelected");
        media_newStream = new <init>("media_newStream", 2, "newStream");
        media_endOfStream = new <init>("media_endOfStream", 3, "endOfStream");
        media_underflow = new <init>("media_underflow", 4, "underflow");
        media_buffering = new <init>("media_buffering", 5, "buffering");
        media_bufferingComplete = new <init>("media_bufferingComplete", 6, "bufferingComplete");
        media_updatePts = new <init>("media_updatePts", 7, "updatePts");
        media_updateVideoBitrate = new <init>("media_updateVideoBitrate", 8, "updateVideoBitrate");
        media_audioTrackChanged = new <init>("media_audioTrackChanged", 9, "audioTrackChanged");
        media_nccpError = new <init>("media_nccpError", 10, "nccperror");
        media_nccp = new <init>("media_nccp", 11, "Nccp");
        media_subtitleTrackChanged = new <init>("media_subtitleTrackChanged", 12, "subtitleTrackChanged");
        media_videoWindowChanged = new <init>("media_videoWindowChanged", 13, "videoWindowChanged");
        media_showSubtitle = new <init>("media_showSubtitle", 14, "showSubtitle");
        media_removeSubtitle = new <init>("media_removeSubtitle", 15, "removeSubtitle");
        media_error = new <init>("media_error", 16, "error");
        media_warning = new <init>("media_warning", 17, "warning");
        media_exception = new <init>("media_exception", 18, "exception");
        media_stateChanged = new <init>("media_stateChanged", 19, "statechanged");
        media_bufferrange = new <init>("media_bufferrange", 20, "bufferrange");
        generic_background = new <init>("generic_background", 21, "background");
        media_skip = new <init>("media_skip", 22, "skip");
        media_swim = new <init>("media_swim", 23, "swim");
        media_setvideobitraterange = new <init>("media_setvideobitraterange", 24, "setvideobitraterange");
        media_setvideoresolutionrange = new <init>("media_setvideoresolutionrange", 25, "setvideoresolutionrange");
        media_videobitraterangechanged = new <init>("media_videobitraterangechanged", 26, "videobitraterangechanged");
        media_subtitledata = new <init>("media_subtitledata", 27, "subtitledata");
        $VALUES = (new .VALUES[] {
            media_openComplete, media_streamSelected, media_newStream, media_endOfStream, media_underflow, media_buffering, media_bufferingComplete, media_updatePts, media_updateVideoBitrate, media_audioTrackChanged, 
            media_nccpError, media_nccp, media_subtitleTrackChanged, media_videoWindowChanged, media_showSubtitle, media_removeSubtitle, media_error, media_warning, media_exception, media_stateChanged, 
            media_bufferrange, generic_background, media_skip, media_swim, media_setvideobitraterange, media_setvideoresolutionrange, media_videobitraterangechanged, media_subtitledata
        });
    }

    private A(String s, int i, String s1)
    {
        super(s, i);
        eventName = s1;
    }
}
