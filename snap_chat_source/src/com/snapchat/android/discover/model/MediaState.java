// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model;


public final class MediaState extends Enum
{

    private static final MediaState $VALUES[];
    public static final MediaState AD_RESOLVE_CLIENT_ERROR;
    public static final MediaState AD_RESOLVE_CONTENT_NO_FILL;
    public static final MediaState AD_RESOLVE_ERROR_CODE_INTERNAL_ERROR;
    public static final MediaState AD_RESOLVE_ERROR_CODE_INVALID_REQUEST;
    public static final MediaState AD_RESOLVE_ERROR_CODE_NETWORK_ERROR;
    public static final MediaState AD_RESOLVE_ERROR_CODE_NO_FILL;
    public static final MediaState AD_RESOLVE_ERROR_CODE_UNKNOWN;
    public static final MediaState AD_RESOLVE_TIMEOUT;
    public static final MediaState CONTENT_ERROR;
    public static final MediaState DISK_FULL_ERROR;
    public static final MediaState EXTERNAL_STORAGE_UNAVAILABLE;
    public static final MediaState FETCHING_MEDIA;
    public static final MediaState GENERIC_ERROR;
    public static final MediaState NETWORK_ERROR;
    public static final MediaState NOT_STARTED;
    public static final MediaState RESOLVED_AD;
    public static final MediaState RESOLVE_NEEDED;
    public static final MediaState RESOLVING_AD;
    public static final MediaState SUCCESS;
    private final boolean a;
    private final boolean b;

    private MediaState(String s, int i, boolean flag, boolean flag1)
    {
        super(s, i);
        a = flag;
        b = flag1;
    }

    public static MediaState valueOf(String s)
    {
        return (MediaState)Enum.valueOf(com/snapchat/android/discover/model/MediaState, s);
    }

    public static MediaState[] values()
    {
        return (MediaState[])$VALUES.clone();
    }

    public final boolean isError()
    {
        return b;
    }

    public final boolean isLoading()
    {
        return a;
    }

    static 
    {
        NOT_STARTED = new MediaState("NOT_STARTED", 0, true, false);
        FETCHING_MEDIA = new MediaState("FETCHING_MEDIA", 1, true, false);
        RESOLVE_NEEDED = new MediaState("RESOLVE_NEEDED", 2, true, false);
        RESOLVING_AD = new MediaState("RESOLVING_AD", 3, true, false);
        RESOLVED_AD = new MediaState("RESOLVED_AD", 4, true, false);
        SUCCESS = new MediaState("SUCCESS", 5, false, false);
        DISK_FULL_ERROR = new MediaState("DISK_FULL_ERROR", 6, false, true);
        CONTENT_ERROR = new MediaState("CONTENT_ERROR", 7, false, true);
        NETWORK_ERROR = new MediaState("NETWORK_ERROR", 8, false, true);
        EXTERNAL_STORAGE_UNAVAILABLE = new MediaState("EXTERNAL_STORAGE_UNAVAILABLE", 9, false, true);
        GENERIC_ERROR = new MediaState("GENERIC_ERROR", 10, false, true);
        AD_RESOLVE_ERROR_CODE_INTERNAL_ERROR = new MediaState("AD_RESOLVE_ERROR_CODE_INTERNAL_ERROR", 11, false, true);
        AD_RESOLVE_ERROR_CODE_INVALID_REQUEST = new MediaState("AD_RESOLVE_ERROR_CODE_INVALID_REQUEST", 12, false, true);
        AD_RESOLVE_ERROR_CODE_NETWORK_ERROR = new MediaState("AD_RESOLVE_ERROR_CODE_NETWORK_ERROR", 13, false, true);
        AD_RESOLVE_ERROR_CODE_NO_FILL = new MediaState("AD_RESOLVE_ERROR_CODE_NO_FILL", 14, false, true);
        AD_RESOLVE_ERROR_CODE_UNKNOWN = new MediaState("AD_RESOLVE_ERROR_CODE_UNKNOWN", 15, false, true);
        AD_RESOLVE_CONTENT_NO_FILL = new MediaState("AD_RESOLVE_CONTENT_NO_FILL", 16, false, true);
        AD_RESOLVE_TIMEOUT = new MediaState("AD_RESOLVE_TIMEOUT", 17, false, true);
        AD_RESOLVE_CLIENT_ERROR = new MediaState("AD_RESOLVE_CLIENT_ERROR", 18, false, true);
        $VALUES = (new MediaState[] {
            NOT_STARTED, FETCHING_MEDIA, RESOLVE_NEEDED, RESOLVING_AD, RESOLVED_AD, SUCCESS, DISK_FULL_ERROR, CONTENT_ERROR, NETWORK_ERROR, EXTERNAL_STORAGE_UNAVAILABLE, 
            GENERIC_ERROR, AD_RESOLVE_ERROR_CODE_INTERNAL_ERROR, AD_RESOLVE_ERROR_CODE_INVALID_REQUEST, AD_RESOLVE_ERROR_CODE_NETWORK_ERROR, AD_RESOLVE_ERROR_CODE_NO_FILL, AD_RESOLVE_ERROR_CODE_UNKNOWN, AD_RESOLVE_CONTENT_NO_FILL, AD_RESOLVE_TIMEOUT, AD_RESOLVE_CLIENT_ERROR
        });
    }
}
