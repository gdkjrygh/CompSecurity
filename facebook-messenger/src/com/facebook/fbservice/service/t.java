// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.service;


public final class t extends Enum
{

    private static final t $VALUES[];
    public static final t API_ERROR;
    public static final t CONNECTION_FAILURE;
    public static final t HTTP_400_AUTHENTICATION;
    public static final t HTTP_400_OTHER;
    public static final t HTTP_500_CLASS;
    public static final t NO_ERROR;
    public static final t ORCA_SERVICE_IPC_FAILURE;
    public static final t ORCA_SERVICE_UNKNOWN_OPERATION;
    public static final t OTHER;
    public static final t OUT_OF_MEMORY;
    public static final t PHOTO_UPLOAD_FAILED;
    public static final t PHOTO_UPLOAD_NOT_COMPLETE;

    private t(String s, int i)
    {
        super(s, i);
    }

    public static t valueOf(String s)
    {
        return (t)Enum.valueOf(com/facebook/fbservice/service/t, s);
    }

    public static t[] values()
    {
        return (t[])$VALUES.clone();
    }

    static 
    {
        NO_ERROR = new t("NO_ERROR", 0);
        API_ERROR = new t("API_ERROR", 1);
        HTTP_400_AUTHENTICATION = new t("HTTP_400_AUTHENTICATION", 2);
        HTTP_400_OTHER = new t("HTTP_400_OTHER", 3);
        HTTP_500_CLASS = new t("HTTP_500_CLASS", 4);
        CONNECTION_FAILURE = new t("CONNECTION_FAILURE", 5);
        ORCA_SERVICE_UNKNOWN_OPERATION = new t("ORCA_SERVICE_UNKNOWN_OPERATION", 6);
        ORCA_SERVICE_IPC_FAILURE = new t("ORCA_SERVICE_IPC_FAILURE", 7);
        OUT_OF_MEMORY = new t("OUT_OF_MEMORY", 8);
        OTHER = new t("OTHER", 9);
        PHOTO_UPLOAD_NOT_COMPLETE = new t("PHOTO_UPLOAD_NOT_COMPLETE", 10);
        PHOTO_UPLOAD_FAILED = new t("PHOTO_UPLOAD_FAILED", 11);
        $VALUES = (new t[] {
            NO_ERROR, API_ERROR, HTTP_400_AUTHENTICATION, HTTP_400_OTHER, HTTP_500_CLASS, CONNECTION_FAILURE, ORCA_SERVICE_UNKNOWN_OPERATION, ORCA_SERVICE_IPC_FAILURE, OUT_OF_MEMORY, OTHER, 
            PHOTO_UPLOAD_NOT_COMPLETE, PHOTO_UPLOAD_FAILED
        });
    }
}
