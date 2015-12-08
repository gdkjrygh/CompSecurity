// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.googleapps;


public final class  extends Enum
{

    public static final DELETED_GMAIL ACCOUNT_DISABLED;
    public static final DELETED_GMAIL BAD_REQUEST;
    public static final DELETED_GMAIL BAD_USERNAME;
    public static final DELETED_GMAIL CANCELLED;
    public static final DELETED_GMAIL CAPTCHA;
    public static final DELETED_GMAIL DELETED_GMAIL;
    public static final DELETED_GMAIL LOGIN_FAIL;
    public static final DELETED_GMAIL MISSING_APPS;
    public static final DELETED_GMAIL NETWORK_ERROR;
    public static final DELETED_GMAIL NO_GMAIL;
    public static final DELETED_GMAIL SERVER_ERROR;
    public static final DELETED_GMAIL SUCCESS;
    private static final DELETED_GMAIL a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/googleapps/LoginData$Status, s);
    }

    public static final [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        SUCCESS = new <init>("SUCCESS", 0);
        ACCOUNT_DISABLED = new <init>("ACCOUNT_DISABLED", 1);
        BAD_USERNAME = new <init>("BAD_USERNAME", 2);
        BAD_REQUEST = new <init>("BAD_REQUEST", 3);
        LOGIN_FAIL = new <init>("LOGIN_FAIL", 4);
        SERVER_ERROR = new <init>("SERVER_ERROR", 5);
        MISSING_APPS = new <init>("MISSING_APPS", 6);
        NO_GMAIL = new <init>("NO_GMAIL", 7);
        NETWORK_ERROR = new <init>("NETWORK_ERROR", 8);
        CAPTCHA = new <init>("CAPTCHA", 9);
        CANCELLED = new <init>("CANCELLED", 10);
        DELETED_GMAIL = new <init>("DELETED_GMAIL", 11);
        a = (new a[] {
            SUCCESS, ACCOUNT_DISABLED, BAD_USERNAME, BAD_REQUEST, LOGIN_FAIL, SERVER_ERROR, MISSING_APPS, NO_GMAIL, NETWORK_ERROR, CAPTCHA, 
            CANCELLED, DELETED_GMAIL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
