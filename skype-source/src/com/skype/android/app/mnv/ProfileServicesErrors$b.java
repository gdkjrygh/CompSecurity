// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;


// Referenced classes of package com.skype.android.app.mnv:
//            ProfileServicesErrors

static final class  extends Enum
{

    private static final TIMEOUT_EXCEPTION $VALUES[];
    public static final TIMEOUT_EXCEPTION ACTIVITY_LIMIT_REACHED;
    public static final TIMEOUT_EXCEPTION ALREADY_VERIFIED;
    public static final TIMEOUT_EXCEPTION CODE_HAS_EXPIRED;
    public static final TIMEOUT_EXCEPTION CODE_WAS_INCORRECT;
    public static final TIMEOUT_EXCEPTION CONNECTION_FAILED;
    public static final TIMEOUT_EXCEPTION ENCOUNTERED_A_PROBLEM;
    public static final TIMEOUT_EXCEPTION INVALID_PHONE_NUMBER;
    public static final TIMEOUT_EXCEPTION JSON_EXCEPTION;
    public static final TIMEOUT_EXCEPTION NO_MESSAGE;
    public static final TIMEOUT_EXCEPTION PHONE_ALREADY_EXISTS;
    public static final TIMEOUT_EXCEPTION TIMEOUT_EXCEPTION;
    public static final TIMEOUT_EXCEPTION UNABLE_TO_VERIFY;
    public static final TIMEOUT_EXCEPTION UNSUPPORTED_VERIFY_METHOD;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/mnv/ProfileServicesErrors$b, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NO_MESSAGE = new <init>("NO_MESSAGE", 0);
        ACTIVITY_LIMIT_REACHED = new <init>("ACTIVITY_LIMIT_REACHED", 1);
        UNABLE_TO_VERIFY = new <init>("UNABLE_TO_VERIFY", 2);
        ENCOUNTERED_A_PROBLEM = new <init>("ENCOUNTERED_A_PROBLEM", 3);
        PHONE_ALREADY_EXISTS = new <init>("PHONE_ALREADY_EXISTS", 4);
        ALREADY_VERIFIED = new <init>("ALREADY_VERIFIED", 5);
        CODE_HAS_EXPIRED = new <init>("CODE_HAS_EXPIRED", 6);
        CODE_WAS_INCORRECT = new <init>("CODE_WAS_INCORRECT", 7);
        INVALID_PHONE_NUMBER = new <init>("INVALID_PHONE_NUMBER", 8);
        UNSUPPORTED_VERIFY_METHOD = new <init>("UNSUPPORTED_VERIFY_METHOD", 9);
        CONNECTION_FAILED = new <init>("CONNECTION_FAILED", 10);
        JSON_EXCEPTION = new <init>("JSON_EXCEPTION", 11);
        TIMEOUT_EXCEPTION = new <init>("TIMEOUT_EXCEPTION", 12);
        $VALUES = (new .VALUES[] {
            NO_MESSAGE, ACTIVITY_LIMIT_REACHED, UNABLE_TO_VERIFY, ENCOUNTERED_A_PROBLEM, PHONE_ALREADY_EXISTS, ALREADY_VERIFIED, CODE_HAS_EXPIRED, CODE_WAS_INCORRECT, INVALID_PHONE_NUMBER, UNSUPPORTED_VERIFY_METHOD, 
            CONNECTION_FAILED, JSON_EXCEPTION, TIMEOUT_EXCEPTION
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
