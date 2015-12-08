// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.ave;


public final class ListenerType extends Enum
{

    private static final ListenerType $VALUES[];
    public static final ListenerType BACKGROUND_MANIFEST_ERROR;
    public static final ListenerType BACKGROUND_MANIFEST_WARNING;
    public static final ListenerType DATA;
    public static final ListenerType DICTIONARY_DATA;
    public static final ListenerType DRM_ERROR;
    public static final ListenerType DRM_METADATA;
    public static final ListenerType ERROR;
    public static final ListenerType LOAD_INFO;
    public static final ListenerType MANIFEST_LOAD;
    public static final ListenerType PLAY_STATE;
    public static final ListenerType SEEK_COMPLETE;
    public static final ListenerType STREAM_METADATA;
    public static final ListenerType STREAM_SWITCH;
    public static final ListenerType TIMELINE;
    public static final ListenerType TRICK_PLAY_ENDED;
    public static final ListenerType WARNING;
    private final int value;

    private ListenerType(String s, int i, int j)
    {
        super(s, i);
        value = j;
    }

    public static ListenerType valueOf(String s)
    {
        return (ListenerType)Enum.valueOf(com/adobe/ave/ListenerType, s);
    }

    public static ListenerType[] values()
    {
        return (ListenerType[])$VALUES.clone();
    }

    final int getValue()
    {
        return value;
    }

    static 
    {
        ERROR = new ListenerType("ERROR", 0, 1);
        PLAY_STATE = new ListenerType("PLAY_STATE", 1, 2);
        STREAM_SWITCH = new ListenerType("STREAM_SWITCH", 2, 4);
        STREAM_METADATA = new ListenerType("STREAM_METADATA", 3, 8);
        DRM_METADATA = new ListenerType("DRM_METADATA", 4, 16);
        TIMELINE = new ListenerType("TIMELINE", 5, 32);
        DATA = new ListenerType("DATA", 6, 64);
        MANIFEST_LOAD = new ListenerType("MANIFEST_LOAD", 7, 128);
        SEEK_COMPLETE = new ListenerType("SEEK_COMPLETE", 8, 256);
        WARNING = new ListenerType("WARNING", 9, 512);
        DICTIONARY_DATA = new ListenerType("DICTIONARY_DATA", 10, 1024);
        LOAD_INFO = new ListenerType("LOAD_INFO", 11, 2048);
        TRICK_PLAY_ENDED = new ListenerType("TRICK_PLAY_ENDED", 12, 4096);
        DRM_ERROR = new ListenerType("DRM_ERROR", 13, 8192);
        BACKGROUND_MANIFEST_ERROR = new ListenerType("BACKGROUND_MANIFEST_ERROR", 14, 16384);
        BACKGROUND_MANIFEST_WARNING = new ListenerType("BACKGROUND_MANIFEST_WARNING", 15, 32768);
        $VALUES = (new ListenerType[] {
            ERROR, PLAY_STATE, STREAM_SWITCH, STREAM_METADATA, DRM_METADATA, TIMELINE, DATA, MANIFEST_LOAD, SEEK_COMPLETE, WARNING, 
            DICTIONARY_DATA, LOAD_INFO, TRICK_PLAY_ENDED, DRM_ERROR, BACKGROUND_MANIFEST_ERROR, BACKGROUND_MANIFEST_WARNING
        });
    }
}
