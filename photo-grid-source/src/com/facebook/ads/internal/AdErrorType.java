// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal;

import com.facebook.ads.AdError;

// Referenced classes of package com.facebook.ads.internal:
//            b

public final class AdErrorType extends Enum
{

    public static final AdErrorType AD_REQUEST_FAILED;
    public static final AdErrorType AD_REQUEST_TIMEOUT;
    public static final AdErrorType ERROR_MESSAGE;
    public static final AdErrorType INTERNAL_ERROR;
    public static final AdErrorType INVALID_PARAMETERS;
    public static final AdErrorType LOAD_TOO_FREQUENTLY;
    public static final AdErrorType NETWORK_ERROR;
    public static final AdErrorType NO_AD_PLACEMENT;
    public static final AdErrorType NO_FILL;
    public static final AdErrorType PARSER_FAILURE;
    public static final AdErrorType SERVER_ERROR;
    public static final AdErrorType START_BEFORE_INIT;
    public static final AdErrorType UNKNOWN_ERROR;
    public static final AdErrorType UNKNOWN_RESPONSE;
    private static final AdErrorType d[];
    private final int a;
    private final String b;
    private final boolean c;

    private AdErrorType(String s, int i, int j, String s1, boolean flag)
    {
        super(s, i);
        a = j;
        b = s1;
        c = flag;
    }

    public static AdErrorType adErrorTypeFromCode(int i)
    {
        AdErrorType aaderrortype[] = values();
        int k = aaderrortype.length;
        for (int j = 0; j < k; j++)
        {
            AdErrorType aderrortype = aaderrortype[j];
            if (aderrortype.getErrorCode() == i)
            {
                return aderrortype;
            }
        }

        return UNKNOWN_ERROR;
    }

    public static AdErrorType valueOf(String s)
    {
        return (AdErrorType)Enum.valueOf(com/facebook/ads/internal/AdErrorType, s);
    }

    public static AdErrorType[] values()
    {
        return (AdErrorType[])d.clone();
    }

    final boolean a()
    {
        return c;
    }

    public final AdError getAdError(String s)
    {
        return (new b(this, s)).b();
    }

    public final b getAdErrorWrapper(String s)
    {
        return new b(this, s);
    }

    public final String getDefaultErrorMessage()
    {
        return b;
    }

    public final int getErrorCode()
    {
        return a;
    }

    static 
    {
        UNKNOWN_ERROR = new AdErrorType("UNKNOWN_ERROR", 0, -1, "unknown error", false);
        NETWORK_ERROR = new AdErrorType("NETWORK_ERROR", 1, 1000, "Network Error", true);
        NO_FILL = new AdErrorType("NO_FILL", 2, 1001, "No Fill", true);
        LOAD_TOO_FREQUENTLY = new AdErrorType("LOAD_TOO_FREQUENTLY", 3, 1002, "Ad was re-loaded too frequently", true);
        INVALID_PARAMETERS = new AdErrorType("INVALID_PARAMETERS", 4, 1003, "Ad was requested with invalid parameters", true);
        SERVER_ERROR = new AdErrorType("SERVER_ERROR", 5, 2000, "Server Error", true);
        INTERNAL_ERROR = new AdErrorType("INTERNAL_ERROR", 6, 2001, "Internal Error", true);
        START_BEFORE_INIT = new AdErrorType("START_BEFORE_INIT", 7, 2004, "initAd must be called before startAd", true);
        AD_REQUEST_FAILED = new AdErrorType("AD_REQUEST_FAILED", 8, 1111, "Facebook Ads SDK request for ads failed", false);
        AD_REQUEST_TIMEOUT = new AdErrorType("AD_REQUEST_TIMEOUT", 9, 1112, "Facebook Ads SDK request for ads timed out", false);
        PARSER_FAILURE = new AdErrorType("PARSER_FAILURE", 10, 1201, "Failed to parse Facebook Ads SDK delivery response", false);
        UNKNOWN_RESPONSE = new AdErrorType("UNKNOWN_RESPONSE", 11, 1202, "Unknown Facebook Ads SDK delivery response type", false);
        ERROR_MESSAGE = new AdErrorType("ERROR_MESSAGE", 12, 1203, "Facebook Ads SDK delivery response Error message", true);
        NO_AD_PLACEMENT = new AdErrorType("NO_AD_PLACEMENT", 13, 1302, "Facebook Ads SDK returned no ad placements", false);
        d = (new AdErrorType[] {
            UNKNOWN_ERROR, NETWORK_ERROR, NO_FILL, LOAD_TOO_FREQUENTLY, INVALID_PARAMETERS, SERVER_ERROR, INTERNAL_ERROR, START_BEFORE_INIT, AD_REQUEST_FAILED, AD_REQUEST_TIMEOUT, 
            PARSER_FAILURE, UNKNOWN_RESPONSE, ERROR_MESSAGE, NO_AD_PLACEMENT
        });
    }
}
