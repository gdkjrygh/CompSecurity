// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            AccessSession

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value ALREADY_ONLINE;
    public static final value CONNECTION_ERROR;
    public static final value HTTP_FAILURE;
    public static final value LOGIN_ABORTED;
    public static final value LOGIN_FAILURE;
    public static final value LOGOUT_FAILURE;
    public static final value NO_BALANCE;
    public static final value NO_FAILURE;
    public static final value NO_HTML_URL;
    public static final value NO_SUBSCRIPTION;
    public static final value NO_SUPPORT;
    public static final value SSID_QUERY_FAILURE;
    public static final value TOKEN_QUERY_FAILURE;
    public static final value TOO_MANY_REDIRECTS;
    public static final value WISPR_CONTENT_ERROR;
    public static final value WISPR_LOGIN_ERROR;
    public static final value WISPR_LOGIN_REJECTED;
    public static final value WRAPPER_UNKNOWN_VALUE;
    private static final j intToTypeMap;
    private final int value;

    public static value fromInt(int i)
    {
        value value1 = (value)intToTypeMap.a(i);
        if (value1 != null)
        {
            return value1;
        } else
        {
            return WRAPPER_UNKNOWN_VALUE;
        }
    }

    public static WRAPPER_UNKNOWN_VALUE valueOf(String s)
    {
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/AccessSession$FAILUREREASON, s);
    }

    public static WRAPPER_UNKNOWN_VALUE[] values()
    {
        return (WRAPPER_UNKNOWN_VALUE[])$VALUES.clone();
    }

    public final int toInt()
    {
        return value;
    }

    static 
    {
        NO_FAILURE = new <init>("NO_FAILURE", 0, 0);
        NO_BALANCE = new <init>("NO_BALANCE", 1, 1);
        NO_SUBSCRIPTION = new <init>("NO_SUBSCRIPTION", 2, 2);
        NO_SUPPORT = new <init>("NO_SUPPORT", 3, 3);
        LOGIN_FAILURE = new <init>("LOGIN_FAILURE", 4, 4);
        LOGOUT_FAILURE = new <init>("LOGOUT_FAILURE", 5, 5);
        LOGIN_ABORTED = new <init>("LOGIN_ABORTED", 6, 6);
        CONNECTION_ERROR = new <init>("CONNECTION_ERROR", 7, 7);
        ALREADY_ONLINE = new <init>("ALREADY_ONLINE", 8, 8);
        TOO_MANY_REDIRECTS = new <init>("TOO_MANY_REDIRECTS", 9, 9);
        HTTP_FAILURE = new <init>("HTTP_FAILURE", 10, 10);
        WISPR_CONTENT_ERROR = new <init>("WISPR_CONTENT_ERROR", 11, 11);
        WISPR_LOGIN_REJECTED = new <init>("WISPR_LOGIN_REJECTED", 12, 12);
        WISPR_LOGIN_ERROR = new <init>("WISPR_LOGIN_ERROR", 13, 13);
        NO_HTML_URL = new <init>("NO_HTML_URL", 14, 14);
        TOKEN_QUERY_FAILURE = new <init>("TOKEN_QUERY_FAILURE", 15, 15);
        SSID_QUERY_FAILURE = new <init>("SSID_QUERY_FAILURE", 16, 16);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 17, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            NO_FAILURE, NO_BALANCE, NO_SUBSCRIPTION, NO_SUPPORT, LOGIN_FAILURE, LOGOUT_FAILURE, LOGIN_ABORTED, CONNECTION_ERROR, ALREADY_ONLINE, TOO_MANY_REDIRECTS, 
            HTTP_FAILURE, WISPR_CONTENT_ERROR, WISPR_LOGIN_REJECTED, WISPR_LOGIN_ERROR, NO_HTML_URL, TOKEN_QUERY_FAILURE, SSID_QUERY_FAILURE, WRAPPER_UNKNOWN_VALUE
        });
        intToTypeMap = new j();
        value avalue[] = values();
        int k = avalue.length;
        for (int i = 0; i < k; i++)
        {
            value value1 = avalue[i];
            intToTypeMap.a(value1.value, value1);
        }

    }

    private (String s, int i, int k)
    {
        super(s, i);
        value = k;
    }
}
