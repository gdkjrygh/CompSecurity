// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth.tasks;

import java.util.EnumSet;

// Referenced classes of package com.soundcloud.android.onboarding.auth.tasks:
//            AuthTaskResult

private static final class  extends Enum
{

    private static final VALIDATION_ERROR $VALUES[];
    public static final VALIDATION_ERROR DENIED;
    public static final VALIDATION_ERROR DEVICE_CONFLICT;
    public static final VALIDATION_ERROR EMAIL_INVALID;
    public static final VALIDATION_ERROR EMAIL_TAKEN;
    public static final VALIDATION_ERROR FAILURE;
    public static final VALIDATION_ERROR FLAKY_SIGNUP_ERROR;
    public static final VALIDATION_ERROR NETWORK_ERROR;
    public static final VALIDATION_ERROR SERVER_ERROR;
    public static final VALIDATION_ERROR SPAM;
    public static final VALIDATION_ERROR SUCCESS;
    public static final VALIDATION_ERROR UNAUTHORIZED;
    private static EnumSet UNEXPECTED_ERRORS;
    public static final VALIDATION_ERROR VALIDATION_ERROR;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/android/onboarding/auth/tasks/AuthTaskResult$Kind, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public final boolean isUnexpectedError()
    {
        return UNEXPECTED_ERRORS.contains(this);
    }

    static 
    {
        SUCCESS = new <init>("SUCCESS", 0);
        FAILURE = new <init>("FAILURE", 1);
        EMAIL_TAKEN = new <init>("EMAIL_TAKEN", 2);
        SPAM = new <init>("SPAM", 3);
        DENIED = new <init>("DENIED", 4);
        EMAIL_INVALID = new <init>("EMAIL_INVALID", 5);
        FLAKY_SIGNUP_ERROR = new <init>("FLAKY_SIGNUP_ERROR", 6);
        DEVICE_CONFLICT = new <init>("DEVICE_CONFLICT", 7);
        UNAUTHORIZED = new <init>("UNAUTHORIZED", 8);
        NETWORK_ERROR = new <init>("NETWORK_ERROR", 9);
        SERVER_ERROR = new <init>("SERVER_ERROR", 10);
        VALIDATION_ERROR = new <init>("VALIDATION_ERROR", 11);
        $VALUES = (new .VALUES[] {
            SUCCESS, FAILURE, EMAIL_TAKEN, SPAM, DENIED, EMAIL_INVALID, FLAKY_SIGNUP_ERROR, DEVICE_CONFLICT, UNAUTHORIZED, NETWORK_ERROR, 
            SERVER_ERROR, VALIDATION_ERROR
        });
        UNEXPECTED_ERRORS = EnumSet.of(FAILURE, FLAKY_SIGNUP_ERROR, SERVER_ERROR, VALIDATION_ERROR);
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
