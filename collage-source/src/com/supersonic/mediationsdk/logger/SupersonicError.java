// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.supersonic.mediationsdk.logger;


public class SupersonicError
{

    public static final int ERROR_CODE_ADAPTER_INIT_FAILED = 508;
    public static final int ERROR_CODE_APP_KEY_INCORRECT = 504;
    public static final int ERROR_CODE_APP_KEY_NOT_SET = 503;
    private static final int ERROR_CODE_GENERAL = 1;
    public static final int ERROR_CODE_GENERIC = 510;
    public static final int ERROR_CODE_INVALID_KEY_VALUE = 506;
    public static final int ERROR_CODE_KEY_NOT_SET_FOR_PROVIDER = 505;
    public static final int ERROR_CODE_NO_CONFIGURATION_AVAILABLE = 501;
    public static final int ERROR_CODE_SHOW_VIDEO_FAILED = 509;
    public static final int ERROR_CODE_UNSUPPORTED_SDK_VERSION = 507;
    public static final int ERROR_CODE_USING_CACHED_CONFIGURATION = 502;
    private int mErrorCode;
    private String mErrorMsg;

    public SupersonicError(int i, String s)
    {
        mErrorCode = i;
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        mErrorMsg = s1;
    }

    public int getErrorCode()
    {
        return mErrorCode;
    }

    public String getErrorMessage()
    {
        return mErrorMsg;
    }

    public String toString()
    {
        return (new StringBuilder()).append("errorCode:").append(mErrorCode).append(", errorMessage:").append(mErrorMsg).toString();
    }
}
