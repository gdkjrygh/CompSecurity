// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.skype.android.app.mnv:
//            ProfileServicesErrors

public static final class serviceErrorStrings extends Enum
{

    private static final map $VALUES[];
    public static final map ACTIVITY_LIMIT_REACHED;
    public static final map ALREADY_VERIFIED;
    public static final map CODE_HAS_EXPIRED;
    public static final map CODE_WAS_INCORRECT;
    public static final map CONNECTION_FAILED;
    public static final map ENCOUNTERED_A_PROBLEM;
    public static final map INVALID_PHONE_NUMBER;
    public static final map JSON_EXCEPTION;
    public static final map NONE;
    public static final map PHONE_ALREADY_EXISTS;
    public static final map TIMEOUT_EXCEPTION;
    public static final map UNABLE_TO_VERIFY;
    public static final map UNSUPPORTED_VERIFY_METHOD;
    private static final Map map;
    public final map code;
    public final map message;
    private final String serviceErrorStrings[];

    public static serviceErrorStrings fromErrorString(String s)
    {
        return (serviceErrorStrings)map.get(s);
    }

    public static map valueOf(String s)
    {
        return (map)Enum.valueOf(com/skype/android/app/mnv/ProfileServicesErrors$ErrorState, s);
    }

    public static map[] values()
    {
        return (map[])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0, <init>, E, new String[] {
            "No error"
        });
        ACTIVITY_LIMIT_REACHED = new <init>("ACTIVITY_LIMIT_REACHED", 1, <init>, LIMIT_REACHED, new String[] {
            "ActivityLimitReached"
        });
        UNABLE_TO_VERIFY = new <init>("UNABLE_TO_VERIFY", 2, <init>, _VERIFY, new String[] {
            "ActivityLimitReached:SendTokenPerPhoneLimitReached", "ActivityLimitReached:SendTokenPerUserLimitReached", "ActivityLimitReached:VerifyTokenPerPhonePerUserLimitReached", "PhoneVerificationQosAlert", "TeleSignDisabled", "TeleSignError"
        });
        ENCOUNTERED_A_PROBLEM = new <init>("ENCOUNTERED_A_PROBLEM", 3, <init>, ED_A_PROBLEM, new String[] {
            "InvalidRequestParameters", "InvalidSkypetoken", "DefaultError"
        });
        PHONE_ALREADY_EXISTS = new <init>("PHONE_ALREADY_EXISTS", 4, <init>, EADY_EXISTS, new String[] {
            "PhoneAddError:PhoneAlreadyExists"
        });
        ALREADY_VERIFIED = new <init>("ALREADY_VERIFIED", 5, <init>, ERIFIED, new String[] {
            "PhoneAlreadyVerified:PhoneToSendTokenAlreadyVerified", "PhoneAlreadyVerified:PhoneToVerifyTokenAlreadyVerified", "PhoneToSendTokenAlreadyVerified:PhoneToVerifyTokenAlreadyVerified", "ProofAlreadyVerified:PhoneToSendTokenAlreadyVerified", "ProofAlreadyVerified:PhoneToVerifyTokenAlreadyVerified"
        });
        CODE_HAS_EXPIRED = new <init>("CODE_HAS_EXPIRED", 6, , EXPIRED, new String[] {
            "VerificationTokenError:ExpiredVerificationToken"
        });
        CODE_WAS_INCORRECT = new <init>("CODE_WAS_INCORRECT", 7, , INCORRECT, new String[] {
            "VerificationTokenError:InvalidVerificationToken", "VerificationTokenError:UnmatchedVerificationToken"
        });
        INVALID_PHONE_NUMBER = new <init>("INVALID_PHONE_NUMBER", 8, <init>, HONE_NUMBER, new String[] {
            "InvalidPhoneNumber"
        });
        UNSUPPORTED_VERIFY_METHOD = new <init>("UNSUPPORTED_VERIFY_METHOD", 9, ED, ED_VERIFY_METHOD, new String[] {
            "SendTokenError:UnsupportedVerifyMethod"
        });
        CONNECTION_FAILED = new <init>("CONNECTION_FAILED", 10, <init>, N_FAILED, new String[] {
            "ConnectionFailed"
        });
        JSON_EXCEPTION = new <init>("JSON_EXCEPTION", 11, <init>, PTION, new String[] {
            "JsonException"
        });
        TIMEOUT_EXCEPTION = new <init>("TIMEOUT_EXCEPTION", 12, <init>, XCEPTION, new String[] {
            "TimeException"
        });
        $VALUES = (new .VALUES[] {
            NONE, ACTIVITY_LIMIT_REACHED, UNABLE_TO_VERIFY, ENCOUNTERED_A_PROBLEM, PHONE_ALREADY_EXISTS, ALREADY_VERIFIED, CODE_HAS_EXPIRED, CODE_WAS_INCORRECT, INVALID_PHONE_NUMBER, UNSUPPORTED_VERIFY_METHOD, 
            CONNECTION_FAILED, JSON_EXCEPTION, TIMEOUT_EXCEPTION
        });
        map = new HashMap();
        e_3B_.clone aclone[] = values();
        int k = aclone.length;
        for (int i = 0; i < k; i++)
        {
            e_3B_.clone clone = aclone[i];
            String as[] = clone.serviceErrorStrings;
            int l = as.length;
            for (int j = 0; j < l; j++)
            {
                String s = as[j];
                map.put(s, clone);
            }

        }

    }

    private transient (String s, int i,  ,  1, String as[])
    {
        super(s, i);
        code = ;
        message = 1;
        serviceErrorStrings = as;
    }
}
