// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerNotification

public static final class _code extends Enum
    implements ionCode
{

    private static final GENERIC_INFO $VALUES[];
    public static final GENERIC_INFO AD_BREAK_COMPLETE;
    public static final GENERIC_INFO AD_BREAK_PLACEMENT_COMPLETE;
    public static final GENERIC_INFO AD_BREAK_SKIPPED;
    public static final GENERIC_INFO AD_BREAK_START;
    public static final GENERIC_INFO AD_CLICK;
    public static final GENERIC_INFO AD_COMPLETE;
    public static final GENERIC_INFO AD_PROGRESS;
    public static final GENERIC_INFO AD_START;
    public static final GENERIC_INFO AUDIO_TRACK_CHANGE;
    public static final GENERIC_INFO BITRATE_CHANGE;
    public static final GENERIC_INFO CONTENT_CHANGE;
    public static final GENERIC_INFO CONTENT_MARKER;
    public static final GENERIC_INFO DRM_METADATA_AVAILABLE;
    public static final GENERIC_INFO GENERIC_INFO;
    public static final GENERIC_INFO LOAD_INFO_AVAILABLE;
    public static final GENERIC_INFO PLAYBACK_COMPLETE;
    public static final GENERIC_INFO PLAYBACK_START;
    public static final GENERIC_INFO PLAYER_STATE_CHANGE;
    public static final GENERIC_INFO SEEK_ADJUST_COMPLETE;
    public static final GENERIC_INFO SEEK_COMPLETE;
    public static final GENERIC_INFO SEEK_START;
    public static final GENERIC_INFO TIMED_METADATA_ADD;
    public static final GENERIC_INFO TIMED_METADATA_ADD_IN_BACKGROUND;
    public static final GENERIC_INFO TIMELINE_CHANGE;
    public static final GENERIC_INFO VIDEO_SIZE_CHANGED;
    private final long _code;

    public static ionCode valueOf(String s)
    {
        return (ionCode)Enum.valueOf(com/adobe/mediacore/MediaPlayerNotification$InfoCode, s);
    }

    public static ionCode[] values()
    {
        return (ionCode[])$VALUES.clone();
    }

    public long getCode()
    {
        return _code;
    }

    public String getName()
    {
        return name();
    }

    static 
    {
        PLAYBACK_START = new <init>("PLAYBACK_START", 0, 0x493e0L);
        PLAYBACK_COMPLETE = new <init>("PLAYBACK_COMPLETE", 1, 0x493e1L);
        SEEK_START = new <init>("SEEK_START", 2, 0x493e2L);
        SEEK_COMPLETE = new <init>("SEEK_COMPLETE", 3, 0x493e3L);
        CONTENT_CHANGE = new <init>("CONTENT_CHANGE", 4, 0x493e4L);
        PLAYER_STATE_CHANGE = new <init>("PLAYER_STATE_CHANGE", 5, 0x493e5L);
        CONTENT_MARKER = new <init>("CONTENT_MARKER", 6, 0x493e6L);
        SEEK_ADJUST_COMPLETE = new <init>("SEEK_ADJUST_COMPLETE", 7, 0x493e7L);
        LOAD_INFO_AVAILABLE = new <init>("LOAD_INFO_AVAILABLE", 8, 0x49444L);
        VIDEO_SIZE_CHANGED = new <init>("VIDEO_SIZE_CHANGED", 9, 0x49445L);
        BITRATE_CHANGE = new <init>("BITRATE_CHANGE", 10, 0x49bb0L);
        AUDIO_TRACK_CHANGE = new <init>("AUDIO_TRACK_CHANGE", 11, 0x4a380L);
        TIMELINE_CHANGE = new <init>("TIMELINE_CHANGE", 12, 0x49f98L);
        AD_BREAK_PLACEMENT_COMPLETE = new <init>("AD_BREAK_PLACEMENT_COMPLETE", 13, 0x49f99L);
        AD_BREAK_START = new <init>("AD_BREAK_START", 14, 0x49f9aL);
        AD_BREAK_COMPLETE = new <init>("AD_BREAK_COMPLETE", 15, 0x49f9bL);
        AD_START = new <init>("AD_START", 16, 0x49f9cL);
        AD_COMPLETE = new <init>("AD_COMPLETE", 17, 0x49f9dL);
        AD_PROGRESS = new <init>("AD_PROGRESS", 18, 0x49f9eL);
        TIMED_METADATA_ADD = new <init>("TIMED_METADATA_ADD", 19, 0x49f9fL);
        AD_CLICK = new <init>("AD_CLICK", 20, 0x49fa0L);
        AD_BREAK_SKIPPED = new <init>("AD_BREAK_SKIPPED", 21, 0x49fa1L);
        TIMED_METADATA_ADD_IN_BACKGROUND = new <init>("TIMED_METADATA_ADD_IN_BACKGROUND", 22, 0x2e3bfaL);
        DRM_METADATA_AVAILABLE = new <init>("DRM_METADATA_AVAILABLE", 23, 0x4a768L);
        GENERIC_INFO = new <init>("GENERIC_INFO", 24, 0x61a7fL);
        $VALUES = (new .VALUES[] {
            PLAYBACK_START, PLAYBACK_COMPLETE, SEEK_START, SEEK_COMPLETE, CONTENT_CHANGE, PLAYER_STATE_CHANGE, CONTENT_MARKER, SEEK_ADJUST_COMPLETE, LOAD_INFO_AVAILABLE, VIDEO_SIZE_CHANGED, 
            BITRATE_CHANGE, AUDIO_TRACK_CHANGE, TIMELINE_CHANGE, AD_BREAK_PLACEMENT_COMPLETE, AD_BREAK_START, AD_BREAK_COMPLETE, AD_START, AD_COMPLETE, AD_PROGRESS, TIMED_METADATA_ADD, 
            AD_CLICK, AD_BREAK_SKIPPED, TIMED_METADATA_ADD_IN_BACKGROUND, DRM_METADATA_AVAILABLE, GENERIC_INFO
        });
    }

    private ionCode(String s, int i, long l)
    {
        super(s, i);
        _code = l;
    }
}
