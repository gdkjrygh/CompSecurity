// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ads;


public final class AdRequestError extends Exception
{
    public static final class ErrorCode extends Enum
    {

        private static final ErrorCode $VALUES[];
        public static final ErrorCode ADMANAGER_INACTIVE;
        public static final ErrorCode CONTENT_NO_FILL;
        public static final ErrorCode EMPTY_CONTENT;
        public static final ErrorCode ERROR_CODE_INTERNAL_ERROR;
        public static final ErrorCode ERROR_CODE_INVALID_REQUEST;
        public static final ErrorCode ERROR_CODE_NETWORK_ERROR;
        public static final ErrorCode ERROR_CODE_NO_FILL;
        public static final ErrorCode ERROR_CODE_UNKNOWN;
        public static final ErrorCode INVALID_AD_UNIT_URL;
        public static final ErrorCode TIMEOUT;
        public static final ErrorCode UNKNOWN;
        private final String mMetricValue;

        public static ErrorCode valueOf(String s)
        {
            return (ErrorCode)Enum.valueOf(com/snapchat/android/ads/AdRequestError$ErrorCode, s);
        }

        public static ErrorCode[] values()
        {
            return (ErrorCode[])$VALUES.clone();
        }

        public final String getMetricValue()
        {
            return mMetricValue;
        }

        static 
        {
            ERROR_CODE_INTERNAL_ERROR = new ErrorCode("ERROR_CODE_INTERNAL_ERROR", 0, "internal_error");
            ERROR_CODE_INVALID_REQUEST = new ErrorCode("ERROR_CODE_INVALID_REQUEST", 1, "invalid_request");
            ERROR_CODE_NETWORK_ERROR = new ErrorCode("ERROR_CODE_NETWORK_ERROR", 2, "network_error");
            ERROR_CODE_NO_FILL = new ErrorCode("ERROR_CODE_NO_FILL", 3, "no_fill");
            ERROR_CODE_UNKNOWN = new ErrorCode("ERROR_CODE_UNKNOWN", 4, "unknown_error");
            CONTENT_NO_FILL = new ErrorCode("CONTENT_NO_FILL", 5, "no_fill");
            EMPTY_CONTENT = new ErrorCode("EMPTY_CONTENT", 6, "empty_content");
            INVALID_AD_UNIT_URL = new ErrorCode("INVALID_AD_UNIT_URL", 7, "invalid_ad_unit_url");
            ADMANAGER_INACTIVE = new ErrorCode("ADMANAGER_INACTIVE", 8, "client_error");
            UNKNOWN = new ErrorCode("UNKNOWN", 9, "unknown_error");
            TIMEOUT = new ErrorCode("TIMEOUT", 10, "timeout");
            $VALUES = (new ErrorCode[] {
                ERROR_CODE_INTERNAL_ERROR, ERROR_CODE_INVALID_REQUEST, ERROR_CODE_NETWORK_ERROR, ERROR_CODE_NO_FILL, ERROR_CODE_UNKNOWN, CONTENT_NO_FILL, EMPTY_CONTENT, INVALID_AD_UNIT_URL, ADMANAGER_INACTIVE, UNKNOWN, 
                TIMEOUT
            });
        }

        private ErrorCode(String s, int i, String s1)
        {
            super(s, i);
            mMetricValue = s1;
        }
    }

    public static final class ErrorType extends Enum
    {

        private static final ErrorType $VALUES[];
        public static final ErrorType CLIENT_SIDE_ERROR;
        public static final ErrorType SERVER_SIDE_ERROR;

        public static ErrorType valueOf(String s)
        {
            return (ErrorType)Enum.valueOf(com/snapchat/android/ads/AdRequestError$ErrorType, s);
        }

        public static ErrorType[] values()
        {
            return (ErrorType[])$VALUES.clone();
        }

        static 
        {
            SERVER_SIDE_ERROR = new ErrorType("SERVER_SIDE_ERROR", 0);
            CLIENT_SIDE_ERROR = new ErrorType("CLIENT_SIDE_ERROR", 1);
            $VALUES = (new ErrorType[] {
                SERVER_SIDE_ERROR, CLIENT_SIDE_ERROR
            });
        }

        private ErrorType(String s, int i)
        {
            super(s, i);
        }
    }


    public ErrorCode mErrorCode;
    private ErrorType mErrorType;

    public AdRequestError(ErrorCode errorcode, String s)
    {
        super(s);
        mErrorCode = errorcode;
        public static final class _cls1
        {

            public static final int $SwitchMap$com$snapchat$android$ads$AdRequestError$ErrorCode[];

            static 
            {
                $SwitchMap$com$snapchat$android$ads$AdRequestError$ErrorCode = new int[ErrorCode.values().length];
                try
                {
                    $SwitchMap$com$snapchat$android$ads$AdRequestError$ErrorCode[ErrorCode.CONTENT_NO_FILL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$snapchat$android$ads$AdRequestError$ErrorCode[ErrorCode.EMPTY_CONTENT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$snapchat$android$ads$AdRequestError$ErrorCode[ErrorCode.INVALID_AD_UNIT_URL.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$snapchat$android$ads$AdRequestError$ErrorCode[ErrorCode.ADMANAGER_INACTIVE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$snapchat$android$ads$AdRequestError$ErrorCode[ErrorCode.UNKNOWN.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$snapchat$android$ads$AdRequestError$ErrorCode[ErrorCode.TIMEOUT.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$snapchat$android$ads$AdRequestError$ErrorCode[ErrorCode.ERROR_CODE_INTERNAL_ERROR.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$snapchat$android$ads$AdRequestError$ErrorCode[ErrorCode.ERROR_CODE_INVALID_REQUEST.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$snapchat$android$ads$AdRequestError$ErrorCode[ErrorCode.ERROR_CODE_NETWORK_ERROR.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$snapchat$android$ads$AdRequestError$ErrorCode[ErrorCode.ERROR_CODE_NO_FILL.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$snapchat$android$ads$AdRequestError$ErrorCode[ErrorCode.ERROR_CODE_UNKNOWN.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.snapchat.android.ads.AdRequestError.ErrorCode[errorcode.ordinal()];
        JVM INSTR tableswitch 1 6: default 56
    //                   1 66
    //                   2 66
    //                   3 66
    //                   4 66
    //                   5 66
    //                   6 66;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L2
_L1:
        errorcode = ErrorType.SERVER_SIDE_ERROR;
_L4:
        mErrorType = errorcode;
        return;
_L2:
        errorcode = ErrorType.CLIENT_SIDE_ERROR;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
