// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;


public final class MMException extends RuntimeException
{

    public static final int AD_BROKEN_REFERENCE = 25;
    public static final int AD_NO_ACTIVITY = 26;
    public static final int CACHE_NOT_EMPTY = 17;
    public static final int DISPLAY_AD_ALREADY_DISPLAYED = 23;
    public static final int DISPLAY_AD_EXPIRED = 21;
    public static final int DISPLAY_AD_NOT_FOUND = 22;
    public static final int DISPLAY_AD_NOT_PERMITTED = 24;
    public static final int DISPLAY_AD_NOT_READY = 20;
    public static final int INNER_EXCEPTION = 2;
    public static final int INVALID_PARAMETER = 1;
    public static final int MAIN_THREAD_REQUIRED = 3;
    static final String MISSING_MMJS = "MMJS is not downloaded";
    public static final int REQUEST_ALREADY_CACHING = 13;
    public static final int REQUEST_BAD_RESPONSE = 15;
    public static final int REQUEST_IN_PROGRESS = 12;
    public static final int REQUEST_NOT_FILLED = 14;
    public static final int REQUEST_NOT_PERMITTED = 16;
    public static final int REQUEST_NO_NETWORK = 11;
    public static final int REQUEST_TIMEOUT = 10;
    public static final int UNKNOWN_ERROR = 100;
    private final int code;

    MMException(int i)
    {
        super(getErrorCodeMessage(i));
        code = i;
    }

    MMException(Exception exception)
    {
        super(exception);
        code = 2;
    }

    MMException(String s, int i)
    {
        super(s);
        code = i;
    }

    MMException(String s, Exception exception)
    {
        super(s, exception);
        code = 2;
    }

    static String getErrorCodeMessage(int i)
    {
        switch (i)
        {
        default:
            return "No error.";

        case 1: // '\001'
            return "An invalid parameter was given.";

        case 3: // '\003'
            return "Requires the main thread.";

        case 10: // '\n'
            return "The request timed out.";

        case 11: // '\013'
            return "There is no network available.";

        case 12: // '\f'
            return "A request is already in progress.";

        case 13: // '\r'
            return "A request is already being cached.";

        case 14: // '\016'
            return "The request was not filled by the server.";

        case 15: // '\017'
            return "The server replied with unknown or bad content.";

        case 16: // '\020'
            return "The system is not permitting a request at this time, try again later.";

        case 17: // '\021'
            return "Previously fetched ad exists in the playback queue";

        case 20: // '\024'
            return "There is no fetched ad to display.";

        case 21: // '\025'
            return "The ad to display has expired.";

        case 22: // '\026'
            return "The ad could not be found on disk.";

        case 23: // '\027'
            return "The ad has already been displayed.";

        case 24: // '\030'
            return "The ad has already been displayed.";

        case 25: // '\031'
            return "The reference to the ad view was broken.";

        case 26: // '\032'
            return "The ad view does not have a parent activity.";

        case 100: // 'd'
            return "An unknown error occured.";
        }
    }

    public int getCode()
    {
        return code;
    }
}
