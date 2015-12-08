// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerNotification

public static final class _code extends Enum
    implements onCode
{

    private static final GENERIC_ERROR $VALUES[];
    public static final GENERIC_ERROR AD_INSERTION_FAIL;
    public static final GENERIC_ERROR AD_RESOLVER_METADATA_INVALID;
    public static final GENERIC_ERROR AD_RESOLVER_RESOLVE_FAIL;
    public static final GENERIC_ERROR AUDIO_TRACK_ERROR;
    public static final GENERIC_ERROR CONTENT_ERROR;
    public static final GENERIC_ERROR DOWNLOAD_ERROR;
    public static final GENERIC_ERROR ENGINE_CREATION_ERROR;
    public static final GENERIC_ERROR ENGINE_RELEASE_ERROR;
    public static final GENERIC_ERROR ENGINE_RESET_ERROR;
    public static final GENERIC_ERROR ENGINE_RESOURCES_RELEASE_ERROR;
    public static final GENERIC_ERROR ENGINE_SET_VIEW_ERROR;
    public static final GENERIC_ERROR GENERIC_ERROR;
    public static final GENERIC_ERROR GET_QOS_DATA_ERROR;
    public static final GENERIC_ERROR MANIFEST_ERROR;
    public static final GENERIC_ERROR NATIVE_ERROR;
    public static final GENERIC_ERROR PAUSE_ERROR;
    public static final GENERIC_ERROR PERIOD_INFO_ERROR;
    public static final GENERIC_ERROR PLAYBACK_ERROR;
    public static final GENERIC_ERROR RESOURCE_LOAD_ERROR;
    public static final GENERIC_ERROR RESOURCE_PLACEMENT_FAILED;
    public static final GENERIC_ERROR RETRIEVE_TIME_ERROR;
    public static final GENERIC_ERROR SEEK_ERROR;
    public static final GENERIC_ERROR SET_ABR_PARAMETERS_ERROR;
    public static final GENERIC_ERROR SET_BUFFER_PARAMETERS_ERROR;
    public static final GENERIC_ERROR SET_BUFFER_TIME_ERROR;
    public static final GENERIC_ERROR SET_CC_STYLING_ERROR;
    public static final GENERIC_ERROR SET_CC_VISIBILITY_ERROR;
    public static final GENERIC_ERROR SET_VOLUME_ERROR;
    private final long _code;

    public static onCode valueOf(String s)
    {
        return (onCode)Enum.valueOf(com/adobe/mediacore/MediaPlayerNotification$ErrorCode, s);
    }

    public static onCode[] values()
    {
        return (onCode[])$VALUES.clone();
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
        PLAYBACK_ERROR = new <init>("PLAYBACK_ERROR", 0, 0x18a88L);
        PAUSE_ERROR = new <init>("PAUSE_ERROR", 1, 0x18a90L);
        SEEK_ERROR = new <init>("SEEK_ERROR", 2, 0x18a91L);
        PERIOD_INFO_ERROR = new <init>("PERIOD_INFO_ERROR", 3, 0x18aeeL);
        RETRIEVE_TIME_ERROR = new <init>("RETRIEVE_TIME_ERROR", 4, 0x18aefL);
        GET_QOS_DATA_ERROR = new <init>("GET_QOS_DATA_ERROR", 5, 0x18af0L);
        RESOURCE_LOAD_ERROR = new <init>("RESOURCE_LOAD_ERROR", 6, 0x18ed4L);
        RESOURCE_PLACEMENT_FAILED = new <init>("RESOURCE_PLACEMENT_FAILED", 7, 0x18ed5L);
        NATIVE_ERROR = new <init>("NATIVE_ERROR", 8, 0x19e10L);
        ENGINE_CREATION_ERROR = new <init>("ENGINE_CREATION_ERROR", 9, 0x19e11L);
        ENGINE_RELEASE_ERROR = new <init>("ENGINE_RELEASE_ERROR", 10, 0x19e12L);
        ENGINE_RESOURCES_RELEASE_ERROR = new <init>("ENGINE_RESOURCES_RELEASE_ERROR", 11, 0x19e13L);
        ENGINE_RESET_ERROR = new <init>("ENGINE_RESET_ERROR", 12, 0x19e14L);
        ENGINE_SET_VIEW_ERROR = new <init>("ENGINE_SET_VIEW_ERROR", 13, 0x19e15L);
        SET_VOLUME_ERROR = new <init>("SET_VOLUME_ERROR", 14, 0x1a1f8L);
        SET_BUFFER_TIME_ERROR = new <init>("SET_BUFFER_TIME_ERROR", 15, 0x1a1f9L);
        SET_CC_VISIBILITY_ERROR = new <init>("SET_CC_VISIBILITY_ERROR", 16, 0x1a1faL);
        SET_CC_STYLING_ERROR = new <init>("SET_CC_STYLING_ERROR", 17, 0x1a1fbL);
        SET_ABR_PARAMETERS_ERROR = new <init>("SET_ABR_PARAMETERS_ERROR", 18, 0x1a1fcL);
        SET_BUFFER_PARAMETERS_ERROR = new <init>("SET_BUFFER_PARAMETERS_ERROR", 19, 0x1a1fdL);
        AD_RESOLVER_METADATA_INVALID = new <init>("AD_RESOLVER_METADATA_INVALID", 20, 0x19641L);
        AD_RESOLVER_RESOLVE_FAIL = new <init>("AD_RESOLVER_RESOLVE_FAIL", 21, 0x19643L);
        AD_INSERTION_FAIL = new <init>("AD_INSERTION_FAIL", 22, 0x19645L);
        MANIFEST_ERROR = new <init>("MANIFEST_ERROR", 23, 0x18a8aL);
        CONTENT_ERROR = new <init>("CONTENT_ERROR", 24, 0x18a8cL);
        DOWNLOAD_ERROR = new <init>("DOWNLOAD_ERROR", 25, 0x18b50L);
        AUDIO_TRACK_ERROR = new <init>("AUDIO_TRACK_ERROR", 26, 0x1a9c8L);
        GENERIC_ERROR = new <init>("GENERIC_ERROR", 27, 0x30d3fL);
        $VALUES = (new .VALUES[] {
            PLAYBACK_ERROR, PAUSE_ERROR, SEEK_ERROR, PERIOD_INFO_ERROR, RETRIEVE_TIME_ERROR, GET_QOS_DATA_ERROR, RESOURCE_LOAD_ERROR, RESOURCE_PLACEMENT_FAILED, NATIVE_ERROR, ENGINE_CREATION_ERROR, 
            ENGINE_RELEASE_ERROR, ENGINE_RESOURCES_RELEASE_ERROR, ENGINE_RESET_ERROR, ENGINE_SET_VIEW_ERROR, SET_VOLUME_ERROR, SET_BUFFER_TIME_ERROR, SET_CC_VISIBILITY_ERROR, SET_CC_STYLING_ERROR, SET_ABR_PARAMETERS_ERROR, SET_BUFFER_PARAMETERS_ERROR, 
            AD_RESOLVER_METADATA_INVALID, AD_RESOLVER_RESOLVE_FAIL, AD_INSERTION_FAIL, MANIFEST_ERROR, CONTENT_ERROR, DOWNLOAD_ERROR, AUDIO_TRACK_ERROR, GENERIC_ERROR
        });
    }

    private onCode(String s, int i, long l)
    {
        super(s, i);
        _code = l;
    }
}
