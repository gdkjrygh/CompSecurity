// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ads;


// Referenced classes of package com.snapchat.android.ads:
//            AdRequestError

public static final class mMetricValue extends Enum
{

    private static final TIMEOUT $VALUES[];
    public static final TIMEOUT ADMANAGER_INACTIVE;
    public static final TIMEOUT CONTENT_NO_FILL;
    public static final TIMEOUT EMPTY_CONTENT;
    public static final TIMEOUT ERROR_CODE_INTERNAL_ERROR;
    public static final TIMEOUT ERROR_CODE_INVALID_REQUEST;
    public static final TIMEOUT ERROR_CODE_NETWORK_ERROR;
    public static final TIMEOUT ERROR_CODE_NO_FILL;
    public static final TIMEOUT ERROR_CODE_UNKNOWN;
    public static final TIMEOUT INVALID_AD_UNIT_URL;
    public static final TIMEOUT TIMEOUT;
    public static final TIMEOUT UNKNOWN;
    private final String mMetricValue;

    public static mMetricValue valueOf(String s)
    {
        return (mMetricValue)Enum.valueOf(com/snapchat/android/ads/AdRequestError$ErrorCode, s);
    }

    public static mMetricValue[] values()
    {
        return (mMetricValue[])$VALUES.clone();
    }

    public final String getMetricValue()
    {
        return mMetricValue;
    }

    static 
    {
        ERROR_CODE_INTERNAL_ERROR = new <init>("ERROR_CODE_INTERNAL_ERROR", 0, "internal_error");
        ERROR_CODE_INVALID_REQUEST = new <init>("ERROR_CODE_INVALID_REQUEST", 1, "invalid_request");
        ERROR_CODE_NETWORK_ERROR = new <init>("ERROR_CODE_NETWORK_ERROR", 2, "network_error");
        ERROR_CODE_NO_FILL = new <init>("ERROR_CODE_NO_FILL", 3, "no_fill");
        ERROR_CODE_UNKNOWN = new <init>("ERROR_CODE_UNKNOWN", 4, "unknown_error");
        CONTENT_NO_FILL = new <init>("CONTENT_NO_FILL", 5, "no_fill");
        EMPTY_CONTENT = new <init>("EMPTY_CONTENT", 6, "empty_content");
        INVALID_AD_UNIT_URL = new <init>("INVALID_AD_UNIT_URL", 7, "invalid_ad_unit_url");
        ADMANAGER_INACTIVE = new <init>("ADMANAGER_INACTIVE", 8, "client_error");
        UNKNOWN = new <init>("UNKNOWN", 9, "unknown_error");
        TIMEOUT = new <init>("TIMEOUT", 10, "timeout");
        $VALUES = (new .VALUES[] {
            ERROR_CODE_INTERNAL_ERROR, ERROR_CODE_INVALID_REQUEST, ERROR_CODE_NETWORK_ERROR, ERROR_CODE_NO_FILL, ERROR_CODE_UNKNOWN, CONTENT_NO_FILL, EMPTY_CONTENT, INVALID_AD_UNIT_URL, ADMANAGER_INACTIVE, UNKNOWN, 
            TIMEOUT
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        mMetricValue = s1;
    }
}
