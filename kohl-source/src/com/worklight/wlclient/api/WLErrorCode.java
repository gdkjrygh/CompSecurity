// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;


public final class WLErrorCode extends Enum
{

    private static final WLErrorCode $VALUES[];
    public static final WLErrorCode APP_VERSION_ACCESS_DENIAL;
    public static final WLErrorCode APP_VERSION_ACCESS_NOTIFY;
    public static final WLErrorCode AUTHORIZATION_FAILURE;
    public static final WLErrorCode CHALLENGE_HANDLING_CANCELED;
    public static final WLErrorCode PROCEDURE_ERROR;
    public static final WLErrorCode REQUEST_SERVICE_NOT_FOUND;
    public static final WLErrorCode REQUEST_TIMEOUT;
    public static final WLErrorCode UNEXPECTED_ERROR;
    public static final WLErrorCode UNRESPONSIVE_HOST;
    private final String description;

    private WLErrorCode(String s, int i, String s1)
    {
        super(s, i);
        description = s1;
    }

    public static WLErrorCode valueOf(String s)
    {
        return (WLErrorCode)Enum.valueOf(com/worklight/wlclient/api/WLErrorCode, s);
    }

    public static WLErrorCode[] values()
    {
        return (WLErrorCode[])$VALUES.clone();
    }

    public String getDescription()
    {
        return description;
    }

    static 
    {
        UNEXPECTED_ERROR = new WLErrorCode("UNEXPECTED_ERROR", 0, "Unexpected errorCode occurred. Please try again.");
        REQUEST_TIMEOUT = new WLErrorCode("REQUEST_TIMEOUT", 1, "Request timed out.");
        REQUEST_SERVICE_NOT_FOUND = new WLErrorCode("REQUEST_SERVICE_NOT_FOUND", 2, "Service not found");
        UNRESPONSIVE_HOST = new WLErrorCode("UNRESPONSIVE_HOST", 3, "The service is currently not available.");
        PROCEDURE_ERROR = new WLErrorCode("PROCEDURE_ERROR", 4, "Procedure invocation errorCode.");
        APP_VERSION_ACCESS_DENIAL = new WLErrorCode("APP_VERSION_ACCESS_DENIAL", 5, "Application version denied.");
        APP_VERSION_ACCESS_NOTIFY = new WLErrorCode("APP_VERSION_ACCESS_NOTIFY", 6, "Notify application version changed.");
        AUTHORIZATION_FAILURE = new WLErrorCode("AUTHORIZATION_FAILURE", 7, "Failure during authorization sequence.");
        CHALLENGE_HANDLING_CANCELED = new WLErrorCode("CHALLENGE_HANDLING_CANCELED", 8, "Challenge handler operation was cancelled.");
        $VALUES = (new WLErrorCode[] {
            UNEXPECTED_ERROR, REQUEST_TIMEOUT, REQUEST_SERVICE_NOT_FOUND, UNRESPONSIVE_HOST, PROCEDURE_ERROR, APP_VERSION_ACCESS_DENIAL, APP_VERSION_ACCESS_NOTIFY, AUTHORIZATION_FAILURE, CHALLENGE_HANDLING_CANCELED
        });
    }
}
