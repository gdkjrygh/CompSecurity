// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;


public final class MoPubErrorCode extends Enum
{

    public static final MoPubErrorCode ADAPTER_CONFIGURATION_ERROR;
    public static final MoPubErrorCode ADAPTER_NOT_FOUND;
    public static final MoPubErrorCode CANCELLED;
    public static final MoPubErrorCode INTERNAL_ERROR;
    public static final MoPubErrorCode MRAID_LOAD_ERROR;
    public static final MoPubErrorCode NETWORK_INVALID_STATE;
    public static final MoPubErrorCode NETWORK_NO_FILL;
    public static final MoPubErrorCode NETWORK_TIMEOUT;
    public static final MoPubErrorCode NO_CONNECTION;
    public static final MoPubErrorCode NO_FILL;
    public static final MoPubErrorCode SERVER_ERROR;
    public static final MoPubErrorCode UNSPECIFIED;
    public static final MoPubErrorCode VIDEO_CACHE_ERROR;
    public static final MoPubErrorCode VIDEO_DOWNLOAD_ERROR;
    public static final MoPubErrorCode VIDEO_NOT_AVAILABLE;
    public static final MoPubErrorCode VIDEO_PLAYBACK_ERROR;
    public static final MoPubErrorCode WARMUP;
    private static final MoPubErrorCode b[];
    private final String a;

    private MoPubErrorCode(String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }

    public static MoPubErrorCode valueOf(String s)
    {
        return (MoPubErrorCode)Enum.valueOf(com/mopub/mobileads/MoPubErrorCode, s);
    }

    public static MoPubErrorCode[] values()
    {
        return (MoPubErrorCode[])b.clone();
    }

    public final String toString()
    {
        return a;
    }

    static 
    {
        NO_FILL = new MoPubErrorCode("NO_FILL", 0, "No ads found.");
        WARMUP = new MoPubErrorCode("WARMUP", 1, "Ad unit is warming up. Try again in a few minutes.");
        SERVER_ERROR = new MoPubErrorCode("SERVER_ERROR", 2, "Unable to connect to MoPub adserver.");
        INTERNAL_ERROR = new MoPubErrorCode("INTERNAL_ERROR", 3, "Unable to serve ad due to invalid internal state.");
        CANCELLED = new MoPubErrorCode("CANCELLED", 4, "Ad request was cancelled.");
        NO_CONNECTION = new MoPubErrorCode("NO_CONNECTION", 5, "No internet connection detected.");
        ADAPTER_NOT_FOUND = new MoPubErrorCode("ADAPTER_NOT_FOUND", 6, "Unable to find Native Network or Custom Event adapter.");
        ADAPTER_CONFIGURATION_ERROR = new MoPubErrorCode("ADAPTER_CONFIGURATION_ERROR", 7, "Native Network or Custom Event adapter was configured incorrectly.");
        NETWORK_TIMEOUT = new MoPubErrorCode("NETWORK_TIMEOUT", 8, "Third-party network failed to respond in a timely manner.");
        NETWORK_NO_FILL = new MoPubErrorCode("NETWORK_NO_FILL", 9, "Third-party network failed to provide an ad.");
        NETWORK_INVALID_STATE = new MoPubErrorCode("NETWORK_INVALID_STATE", 10, "Third-party network failed due to invalid internal state.");
        MRAID_LOAD_ERROR = new MoPubErrorCode("MRAID_LOAD_ERROR", 11, "Error loading MRAID ad.");
        VIDEO_CACHE_ERROR = new MoPubErrorCode("VIDEO_CACHE_ERROR", 12, "Error creating a cache to store downloaded videos.");
        VIDEO_DOWNLOAD_ERROR = new MoPubErrorCode("VIDEO_DOWNLOAD_ERROR", 13, "Error downloading video.");
        VIDEO_NOT_AVAILABLE = new MoPubErrorCode("VIDEO_NOT_AVAILABLE", 14, "No video loaded for ad unit.");
        VIDEO_PLAYBACK_ERROR = new MoPubErrorCode("VIDEO_PLAYBACK_ERROR", 15, "Error playing a video.");
        UNSPECIFIED = new MoPubErrorCode("UNSPECIFIED", 16, "Unspecified error.");
        b = (new MoPubErrorCode[] {
            NO_FILL, WARMUP, SERVER_ERROR, INTERNAL_ERROR, CANCELLED, NO_CONNECTION, ADAPTER_NOT_FOUND, ADAPTER_CONFIGURATION_ERROR, NETWORK_TIMEOUT, NETWORK_NO_FILL, 
            NETWORK_INVALID_STATE, MRAID_LOAD_ERROR, VIDEO_CACHE_ERROR, VIDEO_DOWNLOAD_ERROR, VIDEO_NOT_AVAILABLE, VIDEO_PLAYBACK_ERROR, UNSPECIFIED
        });
    }
}
