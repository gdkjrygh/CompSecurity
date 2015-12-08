// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.metadata.Metadata;

public abstract class MediaPlayerNotification
{
    public static final class EntryType extends Enum
    {

        private static final EntryType $VALUES[];
        public static final EntryType ERROR;
        public static final EntryType INFO;
        public static final EntryType WARN;

        public static EntryType valueOf(String s)
        {
            return (EntryType)Enum.valueOf(com/adobe/mediacore/MediaPlayerNotification$EntryType, s);
        }

        public static EntryType[] values()
        {
            return (EntryType[])$VALUES.clone();
        }

        static 
        {
            INFO = new EntryType("INFO", 0);
            WARN = new EntryType("WARN", 1);
            ERROR = new EntryType("ERROR", 2);
            $VALUES = (new EntryType[] {
                INFO, WARN, ERROR
            });
        }

        private EntryType(String s, int i)
        {
            super(s, i);
        }
    }

    public static class Error extends MediaPlayerNotification
    {

        public Error(NotificationCode notificationcode, String s)
        {
            _type = EntryType.ERROR;
            _code = notificationcode;
            _description = s;
        }
    }

    public static final class ErrorCode extends Enum
        implements NotificationCode
    {

        private static final ErrorCode $VALUES[];
        public static final ErrorCode AD_INSERTION_FAIL;
        public static final ErrorCode AD_RESOLVER_METADATA_INVALID;
        public static final ErrorCode AD_RESOLVER_RESOLVE_FAIL;
        public static final ErrorCode AUDIO_TRACK_ERROR;
        public static final ErrorCode CONTENT_ERROR;
        public static final ErrorCode DOWNLOAD_ERROR;
        public static final ErrorCode ENGINE_CREATION_ERROR;
        public static final ErrorCode ENGINE_RELEASE_ERROR;
        public static final ErrorCode ENGINE_RESET_ERROR;
        public static final ErrorCode ENGINE_RESOURCES_RELEASE_ERROR;
        public static final ErrorCode ENGINE_SET_VIEW_ERROR;
        public static final ErrorCode GENERIC_ERROR;
        public static final ErrorCode GET_QOS_DATA_ERROR;
        public static final ErrorCode MANIFEST_ERROR;
        public static final ErrorCode NATIVE_ERROR;
        public static final ErrorCode PAUSE_ERROR;
        public static final ErrorCode PERIOD_INFO_ERROR;
        public static final ErrorCode PLAYBACK_ERROR;
        public static final ErrorCode RESOURCE_LOAD_ERROR;
        public static final ErrorCode RESOURCE_PLACEMENT_FAILED;
        public static final ErrorCode RETRIEVE_TIME_ERROR;
        public static final ErrorCode SEEK_ERROR;
        public static final ErrorCode SET_ABR_PARAMETERS_ERROR;
        public static final ErrorCode SET_BUFFER_PARAMETERS_ERROR;
        public static final ErrorCode SET_BUFFER_TIME_ERROR;
        public static final ErrorCode SET_CC_STYLING_ERROR;
        public static final ErrorCode SET_CC_VISIBILITY_ERROR;
        public static final ErrorCode SET_VOLUME_ERROR;
        private final long _code;

        public static ErrorCode valueOf(String s)
        {
            return (ErrorCode)Enum.valueOf(com/adobe/mediacore/MediaPlayerNotification$ErrorCode, s);
        }

        public static ErrorCode[] values()
        {
            return (ErrorCode[])$VALUES.clone();
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
            PLAYBACK_ERROR = new ErrorCode("PLAYBACK_ERROR", 0, 0x18a88L);
            PAUSE_ERROR = new ErrorCode("PAUSE_ERROR", 1, 0x18a90L);
            SEEK_ERROR = new ErrorCode("SEEK_ERROR", 2, 0x18a91L);
            PERIOD_INFO_ERROR = new ErrorCode("PERIOD_INFO_ERROR", 3, 0x18aeeL);
            RETRIEVE_TIME_ERROR = new ErrorCode("RETRIEVE_TIME_ERROR", 4, 0x18aefL);
            GET_QOS_DATA_ERROR = new ErrorCode("GET_QOS_DATA_ERROR", 5, 0x18af0L);
            RESOURCE_LOAD_ERROR = new ErrorCode("RESOURCE_LOAD_ERROR", 6, 0x18ed4L);
            RESOURCE_PLACEMENT_FAILED = new ErrorCode("RESOURCE_PLACEMENT_FAILED", 7, 0x18ed5L);
            NATIVE_ERROR = new ErrorCode("NATIVE_ERROR", 8, 0x19e10L);
            ENGINE_CREATION_ERROR = new ErrorCode("ENGINE_CREATION_ERROR", 9, 0x19e11L);
            ENGINE_RELEASE_ERROR = new ErrorCode("ENGINE_RELEASE_ERROR", 10, 0x19e12L);
            ENGINE_RESOURCES_RELEASE_ERROR = new ErrorCode("ENGINE_RESOURCES_RELEASE_ERROR", 11, 0x19e13L);
            ENGINE_RESET_ERROR = new ErrorCode("ENGINE_RESET_ERROR", 12, 0x19e14L);
            ENGINE_SET_VIEW_ERROR = new ErrorCode("ENGINE_SET_VIEW_ERROR", 13, 0x19e15L);
            SET_VOLUME_ERROR = new ErrorCode("SET_VOLUME_ERROR", 14, 0x1a1f8L);
            SET_BUFFER_TIME_ERROR = new ErrorCode("SET_BUFFER_TIME_ERROR", 15, 0x1a1f9L);
            SET_CC_VISIBILITY_ERROR = new ErrorCode("SET_CC_VISIBILITY_ERROR", 16, 0x1a1faL);
            SET_CC_STYLING_ERROR = new ErrorCode("SET_CC_STYLING_ERROR", 17, 0x1a1fbL);
            SET_ABR_PARAMETERS_ERROR = new ErrorCode("SET_ABR_PARAMETERS_ERROR", 18, 0x1a1fcL);
            SET_BUFFER_PARAMETERS_ERROR = new ErrorCode("SET_BUFFER_PARAMETERS_ERROR", 19, 0x1a1fdL);
            AD_RESOLVER_METADATA_INVALID = new ErrorCode("AD_RESOLVER_METADATA_INVALID", 20, 0x19641L);
            AD_RESOLVER_RESOLVE_FAIL = new ErrorCode("AD_RESOLVER_RESOLVE_FAIL", 21, 0x19643L);
            AD_INSERTION_FAIL = new ErrorCode("AD_INSERTION_FAIL", 22, 0x19645L);
            MANIFEST_ERROR = new ErrorCode("MANIFEST_ERROR", 23, 0x18a8aL);
            CONTENT_ERROR = new ErrorCode("CONTENT_ERROR", 24, 0x18a8cL);
            DOWNLOAD_ERROR = new ErrorCode("DOWNLOAD_ERROR", 25, 0x18b50L);
            AUDIO_TRACK_ERROR = new ErrorCode("AUDIO_TRACK_ERROR", 26, 0x1a9c8L);
            GENERIC_ERROR = new ErrorCode("GENERIC_ERROR", 27, 0x30d3fL);
            $VALUES = (new ErrorCode[] {
                PLAYBACK_ERROR, PAUSE_ERROR, SEEK_ERROR, PERIOD_INFO_ERROR, RETRIEVE_TIME_ERROR, GET_QOS_DATA_ERROR, RESOURCE_LOAD_ERROR, RESOURCE_PLACEMENT_FAILED, NATIVE_ERROR, ENGINE_CREATION_ERROR, 
                ENGINE_RELEASE_ERROR, ENGINE_RESOURCES_RELEASE_ERROR, ENGINE_RESET_ERROR, ENGINE_SET_VIEW_ERROR, SET_VOLUME_ERROR, SET_BUFFER_TIME_ERROR, SET_CC_VISIBILITY_ERROR, SET_CC_STYLING_ERROR, SET_ABR_PARAMETERS_ERROR, SET_BUFFER_PARAMETERS_ERROR, 
                AD_RESOLVER_METADATA_INVALID, AD_RESOLVER_RESOLVE_FAIL, AD_INSERTION_FAIL, MANIFEST_ERROR, CONTENT_ERROR, DOWNLOAD_ERROR, AUDIO_TRACK_ERROR, GENERIC_ERROR
            });
        }

        private ErrorCode(String s, int i, long l)
        {
            super(s, i);
            _code = l;
        }
    }

    public static class Info extends MediaPlayerNotification
    {

        public Info(NotificationCode notificationcode, String s)
        {
            _type = EntryType.INFO;
            _code = notificationcode;
            _description = s;
        }
    }

    public static final class InfoCode extends Enum
        implements NotificationCode
    {

        private static final InfoCode $VALUES[];
        public static final InfoCode AD_BREAK_COMPLETE;
        public static final InfoCode AD_BREAK_PLACEMENT_COMPLETE;
        public static final InfoCode AD_BREAK_SKIPPED;
        public static final InfoCode AD_BREAK_START;
        public static final InfoCode AD_CLICK;
        public static final InfoCode AD_COMPLETE;
        public static final InfoCode AD_PROGRESS;
        public static final InfoCode AD_START;
        public static final InfoCode AUDIO_TRACK_CHANGE;
        public static final InfoCode BITRATE_CHANGE;
        public static final InfoCode CONTENT_CHANGE;
        public static final InfoCode CONTENT_MARKER;
        public static final InfoCode DRM_METADATA_AVAILABLE;
        public static final InfoCode GENERIC_INFO;
        public static final InfoCode LOAD_INFO_AVAILABLE;
        public static final InfoCode PLAYBACK_COMPLETE;
        public static final InfoCode PLAYBACK_START;
        public static final InfoCode PLAYER_STATE_CHANGE;
        public static final InfoCode SEEK_ADJUST_COMPLETE;
        public static final InfoCode SEEK_COMPLETE;
        public static final InfoCode SEEK_START;
        public static final InfoCode TIMED_METADATA_ADD;
        public static final InfoCode TIMED_METADATA_ADD_IN_BACKGROUND;
        public static final InfoCode TIMELINE_CHANGE;
        public static final InfoCode VIDEO_SIZE_CHANGED;
        private final long _code;

        public static InfoCode valueOf(String s)
        {
            return (InfoCode)Enum.valueOf(com/adobe/mediacore/MediaPlayerNotification$InfoCode, s);
        }

        public static InfoCode[] values()
        {
            return (InfoCode[])$VALUES.clone();
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
            PLAYBACK_START = new InfoCode("PLAYBACK_START", 0, 0x493e0L);
            PLAYBACK_COMPLETE = new InfoCode("PLAYBACK_COMPLETE", 1, 0x493e1L);
            SEEK_START = new InfoCode("SEEK_START", 2, 0x493e2L);
            SEEK_COMPLETE = new InfoCode("SEEK_COMPLETE", 3, 0x493e3L);
            CONTENT_CHANGE = new InfoCode("CONTENT_CHANGE", 4, 0x493e4L);
            PLAYER_STATE_CHANGE = new InfoCode("PLAYER_STATE_CHANGE", 5, 0x493e5L);
            CONTENT_MARKER = new InfoCode("CONTENT_MARKER", 6, 0x493e6L);
            SEEK_ADJUST_COMPLETE = new InfoCode("SEEK_ADJUST_COMPLETE", 7, 0x493e7L);
            LOAD_INFO_AVAILABLE = new InfoCode("LOAD_INFO_AVAILABLE", 8, 0x49444L);
            VIDEO_SIZE_CHANGED = new InfoCode("VIDEO_SIZE_CHANGED", 9, 0x49445L);
            BITRATE_CHANGE = new InfoCode("BITRATE_CHANGE", 10, 0x49bb0L);
            AUDIO_TRACK_CHANGE = new InfoCode("AUDIO_TRACK_CHANGE", 11, 0x4a380L);
            TIMELINE_CHANGE = new InfoCode("TIMELINE_CHANGE", 12, 0x49f98L);
            AD_BREAK_PLACEMENT_COMPLETE = new InfoCode("AD_BREAK_PLACEMENT_COMPLETE", 13, 0x49f99L);
            AD_BREAK_START = new InfoCode("AD_BREAK_START", 14, 0x49f9aL);
            AD_BREAK_COMPLETE = new InfoCode("AD_BREAK_COMPLETE", 15, 0x49f9bL);
            AD_START = new InfoCode("AD_START", 16, 0x49f9cL);
            AD_COMPLETE = new InfoCode("AD_COMPLETE", 17, 0x49f9dL);
            AD_PROGRESS = new InfoCode("AD_PROGRESS", 18, 0x49f9eL);
            TIMED_METADATA_ADD = new InfoCode("TIMED_METADATA_ADD", 19, 0x49f9fL);
            AD_CLICK = new InfoCode("AD_CLICK", 20, 0x49fa0L);
            AD_BREAK_SKIPPED = new InfoCode("AD_BREAK_SKIPPED", 21, 0x49fa1L);
            TIMED_METADATA_ADD_IN_BACKGROUND = new InfoCode("TIMED_METADATA_ADD_IN_BACKGROUND", 22, 0x2e3bfaL);
            DRM_METADATA_AVAILABLE = new InfoCode("DRM_METADATA_AVAILABLE", 23, 0x4a768L);
            GENERIC_INFO = new InfoCode("GENERIC_INFO", 24, 0x61a7fL);
            $VALUES = (new InfoCode[] {
                PLAYBACK_START, PLAYBACK_COMPLETE, SEEK_START, SEEK_COMPLETE, CONTENT_CHANGE, PLAYER_STATE_CHANGE, CONTENT_MARKER, SEEK_ADJUST_COMPLETE, LOAD_INFO_AVAILABLE, VIDEO_SIZE_CHANGED, 
                BITRATE_CHANGE, AUDIO_TRACK_CHANGE, TIMELINE_CHANGE, AD_BREAK_PLACEMENT_COMPLETE, AD_BREAK_START, AD_BREAK_COMPLETE, AD_START, AD_COMPLETE, AD_PROGRESS, TIMED_METADATA_ADD, 
                AD_CLICK, AD_BREAK_SKIPPED, TIMED_METADATA_ADD_IN_BACKGROUND, DRM_METADATA_AVAILABLE, GENERIC_INFO
            });
        }

        private InfoCode(String s, int i, long l)
        {
            super(s, i);
            _code = l;
        }
    }

    public static interface NotificationCode
    {

        public abstract long getCode();

        public abstract String getName();
    }

    public static class Warning extends MediaPlayerNotification
    {

        public Warning(NotificationCode notificationcode, String s)
        {
            _type = EntryType.WARN;
            _code = notificationcode;
            _description = s;
        }
    }

    public static final class WarningCode extends Enum
        implements NotificationCode
    {

        private static final WarningCode $VALUES[];
        public static final WarningCode AD_MANIFEST_LOAD_FAILED;
        public static final WarningCode AD_RESOLVER_FAIL;
        public static final WarningCode AD_RESOLVER_RETURNED_NO_ADS;
        public static final WarningCode BACKGROUND_MANIFEST_WARNING;
        public static final WarningCode GENERIC_WARNING;
        public static final WarningCode INVALID_SEEK_WARNING;
        public static final WarningCode NATIVE_WARNING;
        public static final WarningCode PLAYBACK_OPERATION_FAIL;
        public static final WarningCode TRICKPLAY_RATE_CHANGE_FAIL;
        public static final WarningCode UNDEFINED_TIME_RANGES;
        private final long _code;

        public static WarningCode valueOf(String s)
        {
            return (WarningCode)Enum.valueOf(com/adobe/mediacore/MediaPlayerNotification$WarningCode, s);
        }

        public static WarningCode[] values()
        {
            return (WarningCode[])$VALUES.clone();
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
            PLAYBACK_OPERATION_FAIL = new WarningCode("PLAYBACK_OPERATION_FAIL", 0, 0x30d40L);
            AD_RESOLVER_FAIL = new WarningCode("AD_RESOLVER_FAIL", 1, 0x31128L);
            AD_MANIFEST_LOAD_FAILED = new WarningCode("AD_MANIFEST_LOAD_FAILED", 2, 0x3112aL);
            AD_RESOLVER_RETURNED_NO_ADS = new WarningCode("AD_RESOLVER_RETURNED_NO_ADS", 3, 0x3112bL);
            BACKGROUND_MANIFEST_WARNING = new WarningCode("BACKGROUND_MANIFEST_WARNING", 4, 0x31ce0L);
            INVALID_SEEK_WARNING = new WarningCode("INVALID_SEEK_WARNING", 5, 0x31ce1L);
            NATIVE_WARNING = new WarningCode("NATIVE_WARNING", 6, 0x330ccL);
            TRICKPLAY_RATE_CHANGE_FAIL = new WarningCode("TRICKPLAY_RATE_CHANGE_FAIL", 7, 0x445c0L);
            GENERIC_WARNING = new WarningCode("GENERIC_WARNING", 8, 0x493dfL);
            UNDEFINED_TIME_RANGES = new WarningCode("UNDEFINED_TIME_RANGES", 9, 0x3a980L);
            $VALUES = (new WarningCode[] {
                PLAYBACK_OPERATION_FAIL, AD_RESOLVER_FAIL, AD_MANIFEST_LOAD_FAILED, AD_RESOLVER_RETURNED_NO_ADS, BACKGROUND_MANIFEST_WARNING, INVALID_SEEK_WARNING, NATIVE_WARNING, TRICKPLAY_RATE_CHANGE_FAIL, GENERIC_WARNING, UNDEFINED_TIME_RANGES
            });
        }

        private WarningCode(String s, int i, long l)
        {
            super(s, i);
            _code = l;
        }
    }


    protected NotificationCode _code;
    protected String _description;
    protected MediaPlayerNotification _inner;
    protected Metadata _metadata;
    protected EntryType _type;

    public MediaPlayerNotification()
    {
    }

    public static Error createErrorNotification(ErrorCode errorcode, String s)
    {
        return new Error(errorcode, s);
    }

    public static Info createInfoNotification(InfoCode infocode, String s)
    {
        return new Info(infocode, s);
    }

    public static Warning createWarningNotification(WarningCode warningcode, String s)
    {
        return new Warning(warningcode, s);
    }

    public NotificationCode getCode()
    {
        return _code;
    }

    public String getDescription()
    {
        return _description;
    }

    public MediaPlayerNotification getInnerNotification()
    {
        return _inner;
    }

    public Metadata getMetadata()
    {
        return _metadata;
    }

    public EntryType getType()
    {
        return _type;
    }

    public void setInnerNotification(MediaPlayerNotification mediaplayernotification)
    {
        _inner = mediaplayernotification;
    }

    public void setMetadata(Metadata metadata)
    {
        _metadata = metadata;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer("{");
        stringbuffer.append("\"description\":\"").append(_description).append("\",");
        stringbuffer.append("\"type\":\"").append(_type.name()).append("\",");
        stringbuffer.append("\"name\":\"").append(_code.getName()).append("\",");
        stringbuffer.append("\"code\":").append(_code.getCode()).append(",");
        if (_metadata != null)
        {
            stringbuffer.append("\"metadata\":").append(_metadata).append(",");
        } else
        {
            stringbuffer.append("\"metadata\":null,");
        }
        if (_inner != null)
        {
            stringbuffer.append("\"inner-notification\":").append(_inner);
        } else
        {
            stringbuffer.append("\"inner-notification\":null");
        }
        return stringbuffer.append("}").toString();
    }
}
