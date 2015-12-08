// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import java.util.HashMap;
import java.util.Map;

public class ProfileServicesErrors
{
    public static final class ErrorState extends Enum
    {

        private static final ErrorState $VALUES[];
        public static final ErrorState ACTIVITY_LIMIT_REACHED;
        public static final ErrorState ALREADY_VERIFIED;
        public static final ErrorState CODE_HAS_EXPIRED;
        public static final ErrorState CODE_WAS_INCORRECT;
        public static final ErrorState CONNECTION_FAILED;
        public static final ErrorState ENCOUNTERED_A_PROBLEM;
        public static final ErrorState INVALID_PHONE_NUMBER;
        public static final ErrorState JSON_EXCEPTION;
        public static final ErrorState NONE;
        public static final ErrorState PHONE_ALREADY_EXISTS;
        public static final ErrorState TIMEOUT_EXCEPTION;
        public static final ErrorState UNABLE_TO_VERIFY;
        public static final ErrorState UNSUPPORTED_VERIFY_METHOD;
        private static final Map map;
        public final a code;
        public final b message;
        private final String serviceErrorStrings[];

        public static ErrorState fromErrorString(String s)
        {
            return (ErrorState)map.get(s);
        }

        public static ErrorState valueOf(String s)
        {
            return (ErrorState)Enum.valueOf(com/skype/android/app/mnv/ProfileServicesErrors$ErrorState, s);
        }

        public static ErrorState[] values()
        {
            return (ErrorState[])$VALUES.clone();
        }

        static 
        {
            NONE = new ErrorState("NONE", 0, a.NO_CODE, b.NO_MESSAGE, new String[] {
                "No error"
            });
            ACTIVITY_LIMIT_REACHED = new ErrorState("ACTIVITY_LIMIT_REACHED", 1, a.UNABLE, b.ACTIVITY_LIMIT_REACHED, new String[] {
                "ActivityLimitReached"
            });
            UNABLE_TO_VERIFY = new ErrorState("UNABLE_TO_VERIFY", 2, a.UNABLE, b.UNABLE_TO_VERIFY, new String[] {
                "ActivityLimitReached:SendTokenPerPhoneLimitReached", "ActivityLimitReached:SendTokenPerUserLimitReached", "ActivityLimitReached:VerifyTokenPerPhonePerUserLimitReached", "PhoneVerificationQosAlert", "TeleSignDisabled", "TeleSignError"
            });
            ENCOUNTERED_A_PROBLEM = new ErrorState("ENCOUNTERED_A_PROBLEM", 3, a.UNABLE, b.ENCOUNTERED_A_PROBLEM, new String[] {
                "InvalidRequestParameters", "InvalidSkypetoken", "DefaultError"
            });
            PHONE_ALREADY_EXISTS = new ErrorState("PHONE_ALREADY_EXISTS", 4, a.PHONE, b.PHONE_ALREADY_EXISTS, new String[] {
                "PhoneAddError:PhoneAlreadyExists"
            });
            ALREADY_VERIFIED = new ErrorState("ALREADY_VERIFIED", 5, a.PHONE, b.ALREADY_VERIFIED, new String[] {
                "PhoneAlreadyVerified:PhoneToSendTokenAlreadyVerified", "PhoneAlreadyVerified:PhoneToVerifyTokenAlreadyVerified", "PhoneToSendTokenAlreadyVerified:PhoneToVerifyTokenAlreadyVerified", "ProofAlreadyVerified:PhoneToSendTokenAlreadyVerified", "ProofAlreadyVerified:PhoneToVerifyTokenAlreadyVerified"
            });
            CODE_HAS_EXPIRED = new ErrorState("CODE_HAS_EXPIRED", 6, a.PIN, b.CODE_HAS_EXPIRED, new String[] {
                "VerificationTokenError:ExpiredVerificationToken"
            });
            CODE_WAS_INCORRECT = new ErrorState("CODE_WAS_INCORRECT", 7, a.PIN, b.CODE_WAS_INCORRECT, new String[] {
                "VerificationTokenError:InvalidVerificationToken", "VerificationTokenError:UnmatchedVerificationToken"
            });
            INVALID_PHONE_NUMBER = new ErrorState("INVALID_PHONE_NUMBER", 8, a.INVALID, b.INVALID_PHONE_NUMBER, new String[] {
                "InvalidPhoneNumber"
            });
            UNSUPPORTED_VERIFY_METHOD = new ErrorState("UNSUPPORTED_VERIFY_METHOD", 9, a.UNSUPPORTED, b.UNSUPPORTED_VERIFY_METHOD, new String[] {
                "SendTokenError:UnsupportedVerifyMethod"
            });
            CONNECTION_FAILED = new ErrorState("CONNECTION_FAILED", 10, a.RETRY, b.CONNECTION_FAILED, new String[] {
                "ConnectionFailed"
            });
            JSON_EXCEPTION = new ErrorState("JSON_EXCEPTION", 11, a.UNABLE, b.JSON_EXCEPTION, new String[] {
                "JsonException"
            });
            TIMEOUT_EXCEPTION = new ErrorState("TIMEOUT_EXCEPTION", 12, a.UNABLE, b.TIMEOUT_EXCEPTION, new String[] {
                "TimeException"
            });
            $VALUES = (new ErrorState[] {
                NONE, ACTIVITY_LIMIT_REACHED, UNABLE_TO_VERIFY, ENCOUNTERED_A_PROBLEM, PHONE_ALREADY_EXISTS, ALREADY_VERIFIED, CODE_HAS_EXPIRED, CODE_WAS_INCORRECT, INVALID_PHONE_NUMBER, UNSUPPORTED_VERIFY_METHOD, 
                CONNECTION_FAILED, JSON_EXCEPTION, TIMEOUT_EXCEPTION
            });
            map = new HashMap();
            ErrorState aerrorstate[] = values();
            int k = aerrorstate.length;
            for (int i = 0; i < k; i++)
            {
                ErrorState errorstate = aerrorstate[i];
                String as[] = errorstate.serviceErrorStrings;
                int l = as.length;
                for (int j = 0; j < l; j++)
                {
                    String s = as[j];
                    map.put(s, errorstate);
                }

            }

        }

        private transient ErrorState(String s, int i, a a1, b b1, String as[])
        {
            super(s, i);
            code = a1;
            message = b1;
            serviceErrorStrings = as;
        }
    }

    static final class a extends Enum
    {

        private static final a $VALUES[];
        public static final a INVALID;
        public static final a NO_CODE;
        public static final a PHONE;
        public static final a PIN;
        public static final a RETRY;
        public static final a UNABLE;
        public static final a UNSUPPORTED;
        private final boolean hasSkip;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/skype/android/app/mnv/ProfileServicesErrors$a, s);
        }

        public static a[] values()
        {
            return (a[])$VALUES.clone();
        }

        public final boolean hasSkip()
        {
            return hasSkip;
        }

        public final String toString()
        {
            return (new StringBuilder()).append(name()).append(" : ").append(Boolean.toString(hasSkip)).toString();
        }

        static 
        {
            NO_CODE = new a("NO_CODE", 0, false);
            RETRY = new a("RETRY", 1, true);
            UNABLE = new a("UNABLE", 2, false);
            PHONE = new a("PHONE", 3, false);
            PIN = new a("PIN", 4, false);
            INVALID = new a("INVALID", 5, false);
            UNSUPPORTED = new a("UNSUPPORTED", 6, false);
            $VALUES = (new a[] {
                NO_CODE, RETRY, UNABLE, PHONE, PIN, INVALID, UNSUPPORTED
            });
        }

        private a(String s, int i, boolean flag)
        {
            super(s, i);
            name();
            hasSkip = flag;
        }
    }

    static final class b extends Enum
    {

        private static final b $VALUES[];
        public static final b ACTIVITY_LIMIT_REACHED;
        public static final b ALREADY_VERIFIED;
        public static final b CODE_HAS_EXPIRED;
        public static final b CODE_WAS_INCORRECT;
        public static final b CONNECTION_FAILED;
        public static final b ENCOUNTERED_A_PROBLEM;
        public static final b INVALID_PHONE_NUMBER;
        public static final b JSON_EXCEPTION;
        public static final b NO_MESSAGE;
        public static final b PHONE_ALREADY_EXISTS;
        public static final b TIMEOUT_EXCEPTION;
        public static final b UNABLE_TO_VERIFY;
        public static final b UNSUPPORTED_VERIFY_METHOD;

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/skype/android/app/mnv/ProfileServicesErrors$b, s);
        }

        public static b[] values()
        {
            return (b[])$VALUES.clone();
        }

        static 
        {
            NO_MESSAGE = new b("NO_MESSAGE", 0);
            ACTIVITY_LIMIT_REACHED = new b("ACTIVITY_LIMIT_REACHED", 1);
            UNABLE_TO_VERIFY = new b("UNABLE_TO_VERIFY", 2);
            ENCOUNTERED_A_PROBLEM = new b("ENCOUNTERED_A_PROBLEM", 3);
            PHONE_ALREADY_EXISTS = new b("PHONE_ALREADY_EXISTS", 4);
            ALREADY_VERIFIED = new b("ALREADY_VERIFIED", 5);
            CODE_HAS_EXPIRED = new b("CODE_HAS_EXPIRED", 6);
            CODE_WAS_INCORRECT = new b("CODE_WAS_INCORRECT", 7);
            INVALID_PHONE_NUMBER = new b("INVALID_PHONE_NUMBER", 8);
            UNSUPPORTED_VERIFY_METHOD = new b("UNSUPPORTED_VERIFY_METHOD", 9);
            CONNECTION_FAILED = new b("CONNECTION_FAILED", 10);
            JSON_EXCEPTION = new b("JSON_EXCEPTION", 11);
            TIMEOUT_EXCEPTION = new b("TIMEOUT_EXCEPTION", 12);
            $VALUES = (new b[] {
                NO_MESSAGE, ACTIVITY_LIMIT_REACHED, UNABLE_TO_VERIFY, ENCOUNTERED_A_PROBLEM, PHONE_ALREADY_EXISTS, ALREADY_VERIFIED, CODE_HAS_EXPIRED, CODE_WAS_INCORRECT, INVALID_PHONE_NUMBER, UNSUPPORTED_VERIFY_METHOD, 
                CONNECTION_FAILED, JSON_EXCEPTION, TIMEOUT_EXCEPTION
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }
    }


    public ProfileServicesErrors()
    {
    }
}
