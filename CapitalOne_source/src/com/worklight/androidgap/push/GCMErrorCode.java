// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.push;


public final class GCMErrorCode extends Enum
{

    public static final GCMErrorCode ACCOUNT_MISSING;
    public static final GCMErrorCode AUTHENTICATION_FAILED;
    private static final GCMErrorCode ENUM$VALUES[];
    public static final GCMErrorCode INVALID_PARAMETERS;
    public static final GCMErrorCode INVALID_SENDER;
    public static final GCMErrorCode PHONE_REGISTRATION_ERROR;
    public static final GCMErrorCode SERVICE_NOT_AVAILABLE;
    public static final GCMErrorCode TOO_MANY_REGISTRATIONS;
    public static final GCMErrorCode UNEXPECTED;
    private final String description;

    private GCMErrorCode(String s, int i, String s1)
    {
        super(s, i);
        description = s1;
    }

    public static GCMErrorCode valueOf(String s)
    {
        return (GCMErrorCode)Enum.valueOf(com/worklight/androidgap/push/GCMErrorCode, s);
    }

    public static GCMErrorCode[] values()
    {
        GCMErrorCode agcmerrorcode[] = ENUM$VALUES;
        int i = agcmerrorcode.length;
        GCMErrorCode agcmerrorcode1[] = new GCMErrorCode[i];
        System.arraycopy(agcmerrorcode, 0, agcmerrorcode1, 0, i);
        return agcmerrorcode1;
    }

    public String getDescription()
    {
        return description;
    }

    static 
    {
        SERVICE_NOT_AVAILABLE = new GCMErrorCode("SERVICE_NOT_AVAILABLE", 0, "Push Service: The device can't read the response, or there was a 500/503 from the server that can be retried later.");
        ACCOUNT_MISSING = new GCMErrorCode("ACCOUNT_MISSING", 1, "Push Service: There is no Google account on the phone.");
        AUTHENTICATION_FAILED = new GCMErrorCode("AUTHENTICATION_FAILED", 2, "Push Service: Bad password.");
        TOO_MANY_REGISTRATIONS = new GCMErrorCode("TOO_MANY_REGISTRATIONS", 3, "Push Service: The user has too many applications registered.");
        INVALID_SENDER = new GCMErrorCode("INVALID_SENDER", 4, "Push Service: The sender account is not recognized.");
        PHONE_REGISTRATION_ERROR = new GCMErrorCode("PHONE_REGISTRATION_ERROR", 5, "Push Service: Incorrect phone registration with Google.");
        INVALID_PARAMETERS = new GCMErrorCode("INVALID_PARAMETERS", 6, "Push Service: Invalid parameter for email sender.");
        UNEXPECTED = new GCMErrorCode("UNEXPECTED", 7, "Push Service: Unexpected error from google gcm service");
        ENUM$VALUES = (new GCMErrorCode[] {
            SERVICE_NOT_AVAILABLE, ACCOUNT_MISSING, AUTHENTICATION_FAILED, TOO_MANY_REGISTRATIONS, INVALID_SENDER, PHONE_REGISTRATION_ERROR, INVALID_PARAMETERS, UNEXPECTED
        });
    }
}
