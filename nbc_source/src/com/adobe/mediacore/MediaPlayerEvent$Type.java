// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerEvent

public static final class  extends Enum
{

    private static final RATE_PLAYING $VALUES[];
    public static final RATE_PLAYING ADBREAK_PLACEMENT_COMPLETED;
    public static final RATE_PLAYING ADBREAK_PLACEMENT_FAILED;
    public static final RATE_PLAYING ADBREAK_REMOVAL_COMPLETED;
    public static final RATE_PLAYING AD_BREAK_COMPLETE;
    public static final RATE_PLAYING AD_BREAK_MANIFEST_LOAD_COMPLETE;
    public static final RATE_PLAYING AD_BREAK_SKIPPED;
    public static final RATE_PLAYING AD_BREAK_START;
    public static final RATE_PLAYING AD_CLICK;
    public static final RATE_PLAYING AD_COMPLETE;
    public static final RATE_PLAYING AD_MANIFEST_LOAD_COMPLETE;
    public static final RATE_PLAYING AD_MANIFEST_LOAD_FAILED;
    public static final RATE_PLAYING AD_PROGRESS;
    public static final RATE_PLAYING AD_START;
    public static final RATE_PLAYING AUDIO_TRACK_CHANGED;
    public static final RATE_PLAYING AUDIO_TRACK_FAILED;
    public static final RATE_PLAYING BACKGROUND_MANIFEST_FAILED;
    public static final RATE_PLAYING BUFFERING_COMPLETED;
    public static final RATE_PLAYING BUFFERING_FULL;
    public static final RATE_PLAYING BUFFERING_STARTED;
    public static final RATE_PLAYING CONTENT_CHANGED;
    public static final RATE_PLAYING CONTENT_MARKER;
    public static final RATE_PLAYING CONTENT_PLACEMENT_COMPLETE;
    public static final RATE_PLAYING DRM_METADATA;
    public static final RATE_PLAYING ITEM_CREATED;
    public static final RATE_PLAYING ITEM_READY;
    public static final RATE_PLAYING ITEM_REPLACED;
    public static final RATE_PLAYING ITEM_UPDATED;
    public static final RATE_PLAYING LOAD_INFO;
    public static final RATE_PLAYING OPERATION_FAILED;
    public static final RATE_PLAYING OPPORTUNITY_COMPLETED;
    public static final RATE_PLAYING OPPORTUNITY_CREATED;
    public static final RATE_PLAYING OPPORTUNITY_FAILED;
    public static final RATE_PLAYING PLAYBACK_COMPLETED;
    public static final RATE_PLAYING PLAYBACK_PAUSED;
    public static final RATE_PLAYING PLAYBACK_STARTED;
    public static final RATE_PLAYING PLAY_COMPLETE;
    public static final RATE_PLAYING PLAY_START;
    public static final RATE_PLAYING PREPARED;
    public static final RATE_PLAYING PROFILE_CHANGED;
    public static final RATE_PLAYING RATE_PLAYING;
    public static final RATE_PLAYING RATE_SELECTED;
    public static final RATE_PLAYING RESOURCE_LOADED;
    public static final RATE_PLAYING SEEK_ADJUST_COMPLETED;
    public static final RATE_PLAYING SEEK_COMPLETED;
    public static final RATE_PLAYING SEEK_STARTED;
    public static final RATE_PLAYING SIZE_CHANGED;
    public static final RATE_PLAYING STATE_CHANGED;
    public static final RATE_PLAYING TIMED_METADATA_ADDED;
    public static final RATE_PLAYING TIMED_METADATA_ADDED_IN_BACKGROUND;
    public static final RATE_PLAYING TIMED_METADATA_SKIPPED;
    public static final RATE_PLAYING TIMELINE_UPDATED;
    public static final RATE_PLAYING UPDATED;
    public static final RATE_PLAYING VIDEO_ERROR;
    public static final RATE_PLAYING VIDEO_STATE_CHANGED;
    public static final RATE_PLAYING VIEW_CLICKED;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/adobe/mediacore/MediaPlayerEvent$Type, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        RESOURCE_LOADED = new <init>("RESOURCE_LOADED", 0);
        ITEM_CREATED = new <init>("ITEM_CREATED", 1);
        ITEM_UPDATED = new <init>("ITEM_UPDATED", 2);
        ITEM_REPLACED = new <init>("ITEM_REPLACED", 3);
        ITEM_READY = new <init>("ITEM_READY", 4);
        ADBREAK_PLACEMENT_COMPLETED = new <init>("ADBREAK_PLACEMENT_COMPLETED", 5);
        ADBREAK_PLACEMENT_FAILED = new <init>("ADBREAK_PLACEMENT_FAILED", 6);
        CONTENT_MARKER = new <init>("CONTENT_MARKER", 7);
        CONTENT_PLACEMENT_COMPLETE = new <init>("CONTENT_PLACEMENT_COMPLETE", 8);
        AD_MANIFEST_LOAD_COMPLETE = new <init>("AD_MANIFEST_LOAD_COMPLETE", 9);
        AD_MANIFEST_LOAD_FAILED = new <init>("AD_MANIFEST_LOAD_FAILED", 10);
        AD_BREAK_MANIFEST_LOAD_COMPLETE = new <init>("AD_BREAK_MANIFEST_LOAD_COMPLETE", 11);
        CONTENT_CHANGED = new <init>("CONTENT_CHANGED", 12);
        PROFILE_CHANGED = new <init>("PROFILE_CHANGED", 13);
        SEEK_STARTED = new <init>("SEEK_STARTED", 14);
        SEEK_COMPLETED = new <init>("SEEK_COMPLETED", 15);
        SEEK_ADJUST_COMPLETED = new <init>("SEEK_ADJUST_COMPLETED", 16);
        BUFFERING_STARTED = new <init>("BUFFERING_STARTED", 17);
        BUFFERING_FULL = new <init>("BUFFERING_FULL", 18);
        BUFFERING_COMPLETED = new <init>("BUFFERING_COMPLETED", 19);
        AUDIO_TRACK_FAILED = new <init>("AUDIO_TRACK_FAILED", 20);
        AUDIO_TRACK_CHANGED = new <init>("AUDIO_TRACK_CHANGED", 21);
        LOAD_INFO = new <init>("LOAD_INFO", 22);
        DRM_METADATA = new <init>("DRM_METADATA", 23);
        BACKGROUND_MANIFEST_FAILED = new <init>("BACKGROUND_MANIFEST_FAILED", 24);
        PLAYBACK_STARTED = new <init>("PLAYBACK_STARTED", 25);
        PLAYBACK_PAUSED = new <init>("PLAYBACK_PAUSED", 26);
        PLAYBACK_COMPLETED = new <init>("PLAYBACK_COMPLETED", 27);
        VIEW_CLICKED = new <init>("VIEW_CLICKED", 28);
        PREPARED = new <init>("PREPARED", 29);
        UPDATED = new <init>("UPDATED", 30);
        TIMELINE_UPDATED = new <init>("TIMELINE_UPDATED", 31);
        PLAY_START = new <init>("PLAY_START", 32);
        STATE_CHANGED = new <init>("STATE_CHANGED", 33);
        VIDEO_STATE_CHANGED = new <init>("VIDEO_STATE_CHANGED", 34);
        PLAY_COMPLETE = new <init>("PLAY_COMPLETE", 35);
        TIMED_METADATA_ADDED = new <init>("TIMED_METADATA_ADDED", 36);
        TIMED_METADATA_ADDED_IN_BACKGROUND = new <init>("TIMED_METADATA_ADDED_IN_BACKGROUND", 37);
        SIZE_CHANGED = new <init>("SIZE_CHANGED", 38);
        AD_BREAK_START = new <init>("AD_BREAK_START", 39);
        AD_BREAK_COMPLETE = new <init>("AD_BREAK_COMPLETE", 40);
        AD_BREAK_SKIPPED = new <init>("AD_BREAK_SKIPPED", 41);
        AD_START = new <init>("AD_START", 42);
        AD_PROGRESS = new <init>("AD_PROGRESS", 43);
        AD_COMPLETE = new <init>("AD_COMPLETE", 44);
        AD_CLICK = new <init>("AD_CLICK", 45);
        VIDEO_ERROR = new <init>("VIDEO_ERROR", 46);
        OPPORTUNITY_COMPLETED = new <init>("OPPORTUNITY_COMPLETED", 47);
        OPPORTUNITY_CREATED = new <init>("OPPORTUNITY_CREATED", 48);
        OPPORTUNITY_FAILED = new <init>("OPPORTUNITY_FAILED", 49);
        TIMED_METADATA_SKIPPED = new <init>("TIMED_METADATA_SKIPPED", 50);
        ADBREAK_REMOVAL_COMPLETED = new <init>("ADBREAK_REMOVAL_COMPLETED", 51);
        OPERATION_FAILED = new <init>("OPERATION_FAILED", 52);
        RATE_SELECTED = new <init>("RATE_SELECTED", 53);
        RATE_PLAYING = new <init>("RATE_PLAYING", 54);
        $VALUES = (new .VALUES[] {
            RESOURCE_LOADED, ITEM_CREATED, ITEM_UPDATED, ITEM_REPLACED, ITEM_READY, ADBREAK_PLACEMENT_COMPLETED, ADBREAK_PLACEMENT_FAILED, CONTENT_MARKER, CONTENT_PLACEMENT_COMPLETE, AD_MANIFEST_LOAD_COMPLETE, 
            AD_MANIFEST_LOAD_FAILED, AD_BREAK_MANIFEST_LOAD_COMPLETE, CONTENT_CHANGED, PROFILE_CHANGED, SEEK_STARTED, SEEK_COMPLETED, SEEK_ADJUST_COMPLETED, BUFFERING_STARTED, BUFFERING_FULL, BUFFERING_COMPLETED, 
            AUDIO_TRACK_FAILED, AUDIO_TRACK_CHANGED, LOAD_INFO, DRM_METADATA, BACKGROUND_MANIFEST_FAILED, PLAYBACK_STARTED, PLAYBACK_PAUSED, PLAYBACK_COMPLETED, VIEW_CLICKED, PREPARED, 
            UPDATED, TIMELINE_UPDATED, PLAY_START, STATE_CHANGED, VIDEO_STATE_CHANGED, PLAY_COMPLETE, TIMED_METADATA_ADDED, TIMED_METADATA_ADDED_IN_BACKGROUND, SIZE_CHANGED, AD_BREAK_START, 
            AD_BREAK_COMPLETE, AD_BREAK_SKIPPED, AD_START, AD_PROGRESS, AD_COMPLETE, AD_CLICK, VIDEO_ERROR, OPPORTUNITY_COMPLETED, OPPORTUNITY_CREATED, OPPORTUNITY_FAILED, 
            TIMED_METADATA_SKIPPED, ADBREAK_REMOVAL_COMPLETED, OPERATION_FAILED, RATE_SELECTED, RATE_PLAYING
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
