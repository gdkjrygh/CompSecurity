// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerNotification

class MediaPlayerEvent
{
    public static final class Type extends Enum
    {

        private static final Type $VALUES[];
        public static final Type ADBREAK_PLACEMENT_COMPLETED;
        public static final Type ADBREAK_PLACEMENT_FAILED;
        public static final Type ADBREAK_REMOVAL_COMPLETED;
        public static final Type AD_BREAK_COMPLETE;
        public static final Type AD_BREAK_MANIFEST_LOAD_COMPLETE;
        public static final Type AD_BREAK_SKIPPED;
        public static final Type AD_BREAK_START;
        public static final Type AD_CLICK;
        public static final Type AD_COMPLETE;
        public static final Type AD_MANIFEST_LOAD_COMPLETE;
        public static final Type AD_MANIFEST_LOAD_FAILED;
        public static final Type AD_PROGRESS;
        public static final Type AD_START;
        public static final Type AUDIO_TRACK_CHANGED;
        public static final Type AUDIO_TRACK_FAILED;
        public static final Type BACKGROUND_MANIFEST_FAILED;
        public static final Type BUFFERING_COMPLETED;
        public static final Type BUFFERING_FULL;
        public static final Type BUFFERING_STARTED;
        public static final Type CONTENT_CHANGED;
        public static final Type CONTENT_MARKER;
        public static final Type CONTENT_PLACEMENT_COMPLETE;
        public static final Type DRM_METADATA;
        public static final Type ITEM_CREATED;
        public static final Type ITEM_READY;
        public static final Type ITEM_REPLACED;
        public static final Type ITEM_UPDATED;
        public static final Type LOAD_INFO;
        public static final Type OPERATION_FAILED;
        public static final Type OPPORTUNITY_COMPLETED;
        public static final Type OPPORTUNITY_CREATED;
        public static final Type OPPORTUNITY_FAILED;
        public static final Type PLAYBACK_COMPLETED;
        public static final Type PLAYBACK_PAUSED;
        public static final Type PLAYBACK_STARTED;
        public static final Type PLAY_COMPLETE;
        public static final Type PLAY_START;
        public static final Type PREPARED;
        public static final Type PROFILE_CHANGED;
        public static final Type RATE_PLAYING;
        public static final Type RATE_SELECTED;
        public static final Type RESOURCE_LOADED;
        public static final Type SEEK_ADJUST_COMPLETED;
        public static final Type SEEK_COMPLETED;
        public static final Type SEEK_STARTED;
        public static final Type SIZE_CHANGED;
        public static final Type STATE_CHANGED;
        public static final Type TIMED_METADATA_ADDED;
        public static final Type TIMED_METADATA_ADDED_IN_BACKGROUND;
        public static final Type TIMED_METADATA_SKIPPED;
        public static final Type TIMELINE_UPDATED;
        public static final Type UPDATED;
        public static final Type VIDEO_ERROR;
        public static final Type VIDEO_STATE_CHANGED;
        public static final Type VIEW_CLICKED;

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/adobe/mediacore/MediaPlayerEvent$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])$VALUES.clone();
        }

        static 
        {
            RESOURCE_LOADED = new Type("RESOURCE_LOADED", 0);
            ITEM_CREATED = new Type("ITEM_CREATED", 1);
            ITEM_UPDATED = new Type("ITEM_UPDATED", 2);
            ITEM_REPLACED = new Type("ITEM_REPLACED", 3);
            ITEM_READY = new Type("ITEM_READY", 4);
            ADBREAK_PLACEMENT_COMPLETED = new Type("ADBREAK_PLACEMENT_COMPLETED", 5);
            ADBREAK_PLACEMENT_FAILED = new Type("ADBREAK_PLACEMENT_FAILED", 6);
            CONTENT_MARKER = new Type("CONTENT_MARKER", 7);
            CONTENT_PLACEMENT_COMPLETE = new Type("CONTENT_PLACEMENT_COMPLETE", 8);
            AD_MANIFEST_LOAD_COMPLETE = new Type("AD_MANIFEST_LOAD_COMPLETE", 9);
            AD_MANIFEST_LOAD_FAILED = new Type("AD_MANIFEST_LOAD_FAILED", 10);
            AD_BREAK_MANIFEST_LOAD_COMPLETE = new Type("AD_BREAK_MANIFEST_LOAD_COMPLETE", 11);
            CONTENT_CHANGED = new Type("CONTENT_CHANGED", 12);
            PROFILE_CHANGED = new Type("PROFILE_CHANGED", 13);
            SEEK_STARTED = new Type("SEEK_STARTED", 14);
            SEEK_COMPLETED = new Type("SEEK_COMPLETED", 15);
            SEEK_ADJUST_COMPLETED = new Type("SEEK_ADJUST_COMPLETED", 16);
            BUFFERING_STARTED = new Type("BUFFERING_STARTED", 17);
            BUFFERING_FULL = new Type("BUFFERING_FULL", 18);
            BUFFERING_COMPLETED = new Type("BUFFERING_COMPLETED", 19);
            AUDIO_TRACK_FAILED = new Type("AUDIO_TRACK_FAILED", 20);
            AUDIO_TRACK_CHANGED = new Type("AUDIO_TRACK_CHANGED", 21);
            LOAD_INFO = new Type("LOAD_INFO", 22);
            DRM_METADATA = new Type("DRM_METADATA", 23);
            BACKGROUND_MANIFEST_FAILED = new Type("BACKGROUND_MANIFEST_FAILED", 24);
            PLAYBACK_STARTED = new Type("PLAYBACK_STARTED", 25);
            PLAYBACK_PAUSED = new Type("PLAYBACK_PAUSED", 26);
            PLAYBACK_COMPLETED = new Type("PLAYBACK_COMPLETED", 27);
            VIEW_CLICKED = new Type("VIEW_CLICKED", 28);
            PREPARED = new Type("PREPARED", 29);
            UPDATED = new Type("UPDATED", 30);
            TIMELINE_UPDATED = new Type("TIMELINE_UPDATED", 31);
            PLAY_START = new Type("PLAY_START", 32);
            STATE_CHANGED = new Type("STATE_CHANGED", 33);
            VIDEO_STATE_CHANGED = new Type("VIDEO_STATE_CHANGED", 34);
            PLAY_COMPLETE = new Type("PLAY_COMPLETE", 35);
            TIMED_METADATA_ADDED = new Type("TIMED_METADATA_ADDED", 36);
            TIMED_METADATA_ADDED_IN_BACKGROUND = new Type("TIMED_METADATA_ADDED_IN_BACKGROUND", 37);
            SIZE_CHANGED = new Type("SIZE_CHANGED", 38);
            AD_BREAK_START = new Type("AD_BREAK_START", 39);
            AD_BREAK_COMPLETE = new Type("AD_BREAK_COMPLETE", 40);
            AD_BREAK_SKIPPED = new Type("AD_BREAK_SKIPPED", 41);
            AD_START = new Type("AD_START", 42);
            AD_PROGRESS = new Type("AD_PROGRESS", 43);
            AD_COMPLETE = new Type("AD_COMPLETE", 44);
            AD_CLICK = new Type("AD_CLICK", 45);
            VIDEO_ERROR = new Type("VIDEO_ERROR", 46);
            OPPORTUNITY_COMPLETED = new Type("OPPORTUNITY_COMPLETED", 47);
            OPPORTUNITY_CREATED = new Type("OPPORTUNITY_CREATED", 48);
            OPPORTUNITY_FAILED = new Type("OPPORTUNITY_FAILED", 49);
            TIMED_METADATA_SKIPPED = new Type("TIMED_METADATA_SKIPPED", 50);
            ADBREAK_REMOVAL_COMPLETED = new Type("ADBREAK_REMOVAL_COMPLETED", 51);
            OPERATION_FAILED = new Type("OPERATION_FAILED", 52);
            RATE_SELECTED = new Type("RATE_SELECTED", 53);
            RATE_PLAYING = new Type("RATE_PLAYING", 54);
            $VALUES = (new Type[] {
                RESOURCE_LOADED, ITEM_CREATED, ITEM_UPDATED, ITEM_REPLACED, ITEM_READY, ADBREAK_PLACEMENT_COMPLETED, ADBREAK_PLACEMENT_FAILED, CONTENT_MARKER, CONTENT_PLACEMENT_COMPLETE, AD_MANIFEST_LOAD_COMPLETE, 
                AD_MANIFEST_LOAD_FAILED, AD_BREAK_MANIFEST_LOAD_COMPLETE, CONTENT_CHANGED, PROFILE_CHANGED, SEEK_STARTED, SEEK_COMPLETED, SEEK_ADJUST_COMPLETED, BUFFERING_STARTED, BUFFERING_FULL, BUFFERING_COMPLETED, 
                AUDIO_TRACK_FAILED, AUDIO_TRACK_CHANGED, LOAD_INFO, DRM_METADATA, BACKGROUND_MANIFEST_FAILED, PLAYBACK_STARTED, PLAYBACK_PAUSED, PLAYBACK_COMPLETED, VIEW_CLICKED, PREPARED, 
                UPDATED, TIMELINE_UPDATED, PLAY_START, STATE_CHANGED, VIDEO_STATE_CHANGED, PLAY_COMPLETE, TIMED_METADATA_ADDED, TIMED_METADATA_ADDED_IN_BACKGROUND, SIZE_CHANGED, AD_BREAK_START, 
                AD_BREAK_COMPLETE, AD_BREAK_SKIPPED, AD_START, AD_PROGRESS, AD_COMPLETE, AD_CLICK, VIDEO_ERROR, OPPORTUNITY_COMPLETED, OPPORTUNITY_CREATED, OPPORTUNITY_FAILED, 
                TIMED_METADATA_SKIPPED, ADBREAK_REMOVAL_COMPLETED, OPERATION_FAILED, RATE_SELECTED, RATE_PLAYING
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    private MediaPlayerNotification _notification;
    private final Type _type;

    public MediaPlayerEvent(Type type)
    {
        _type = type;
    }

    public MediaPlayerNotification getNotification()
    {
        return _notification;
    }

    public Type getType()
    {
        return _type;
    }

    public void setNotification(MediaPlayerNotification mediaplayernotification)
    {
        _notification = mediaplayernotification;
    }
}
