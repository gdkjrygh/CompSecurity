// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.push;


public final class GCMErrorCode extends Enum
{

    private static final GCMErrorCode $VALUES[];
    public static final GCMErrorCode ACCOUNT_MISSING;
    public static final GCMErrorCode AUTHENTICATION_FAILED;
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
        return (GCMErrorCode)Enum.valueOf(com/worklight/push/GCMErrorCode, s);
    }

    public static GCMErrorCode[] values()
    {
        return (GCMErrorCode[])$VALUES.clone();
    }

    public String getDescription()
    {
        return description;
    }

    static 
    {
        SERVICE_NOT_AVAILABLE = new GCMErrorCode("SERVICE_NOT_AVAILABLE", 0, "WLClient.pushDeviceError");
        ACCOUNT_MISSING = new GCMErrorCode("ACCOUNT_MISSING", 1, "WLClient.pushNoGoogleAccount");
        AUTHENTICATION_FAILED = new GCMErrorCode("AUTHENTICATION_FAILED", 2, "WLClient.pushBadPassword");
        TOO_MANY_REGISTRATIONS = new GCMErrorCode("TOO_MANY_REGISTRATIONS", 3, "WLClient.pushTooManyApplications");
        INVALID_SENDER = new GCMErrorCode("INVALID_SENDER", 4, "WLClient.pushSenderAccountNotRecognized");
        PHONE_REGISTRATION_ERROR = new GCMErrorCode("PHONE_REGISTRATION_ERROR", 5, "WLClient.pushIncorrectPhone");
        INVALID_PARAMETERS = new GCMErrorCode("INVALID_PARAMETERS", 6, "WLClient.pushInvalidParameter");
        UNEXPECTED = new GCMErrorCode("UNEXPECTED", 7, "WLClient.pushUnexpectedGCMError");
        $VALUES = (new GCMErrorCode[] {
            SERVICE_NOT_AVAILABLE, ACCOUNT_MISSING, AUTHENTICATION_FAILED, TOO_MANY_REGISTRATIONS, INVALID_SENDER, PHONE_REGISTRATION_ERROR, INVALID_PARAMETERS, UNEXPECTED
        });
    }
}
