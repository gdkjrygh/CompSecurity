// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;


public final class WLErrorCode extends Enum
{

    public static final WLErrorCode APP_VERSION_ACCESS_DENIAL;
    public static final WLErrorCode APP_VERSION_ACCESS_NOTIFY;
    private static final WLErrorCode ENUM$VALUES[];
    public static final WLErrorCode PROCEDURE_ERROR;
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
        WLErrorCode awlerrorcode[] = ENUM$VALUES;
        int i = awlerrorcode.length;
        WLErrorCode awlerrorcode1[] = new WLErrorCode[i];
        System.arraycopy(awlerrorcode, 0, awlerrorcode1, 0, i);
        return awlerrorcode1;
    }

    public String getDescription()
    {
        return description;
    }

    static 
    {
        UNEXPECTED_ERROR = new WLErrorCode("UNEXPECTED_ERROR", 0, "Unexpected errorCode occurred. Please try again.");
        REQUEST_TIMEOUT = new WLErrorCode("REQUEST_TIMEOUT", 1, "Request timed out.");
        UNRESPONSIVE_HOST = new WLErrorCode("UNRESPONSIVE_HOST", 2, "The service is currently not available.");
        PROCEDURE_ERROR = new WLErrorCode("PROCEDURE_ERROR", 3, "Procedure invocation errorCode.");
        APP_VERSION_ACCESS_DENIAL = new WLErrorCode("APP_VERSION_ACCESS_DENIAL", 4, "Application version denied.");
        APP_VERSION_ACCESS_NOTIFY = new WLErrorCode("APP_VERSION_ACCESS_NOTIFY", 5, "Notify application version changed.");
        ENUM$VALUES = (new WLErrorCode[] {
            UNEXPECTED_ERROR, REQUEST_TIMEOUT, UNRESPONSIVE_HOST, PROCEDURE_ERROR, APP_VERSION_ACCESS_DENIAL, APP_VERSION_ACCESS_NOTIFY
        });
    }
}
