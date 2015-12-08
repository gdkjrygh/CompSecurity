// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            Account

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value ACCESS_TOKEN_RENEWAL_FAILED;
    public static final value APP_ID_FAILURE;
    public static final value ATO_BLOCKED;
    public static final value DB_ACCESS_DENIED;
    public static final value DB_CANTOPEN;
    public static final value DB_CORRUPT;
    public static final value DB_DISK_FULL;
    public static final value DB_FAILURE;
    public static final value DB_IN_USE;
    public static final value DB_IO_ERROR;
    public static final value HTTPS_PROXY_AUTH_FAILED;
    public static final value INCORRECT_PASSWORD;
    public static final value INVALID_APP_ID;
    public static final value INVALID_EMAIL;
    public static final value INVALID_SKYPENAME;
    public static final value LOGOUT_CALLED;
    public static final value NO_SUCH_IDENTITY;
    public static final value P2P_CONNECT_FAILED;
    public static final value PASSWORD_HAS_CHANGED;
    public static final value PERIODIC_UIC_UPDATE_FAILED;
    public static final value REJECTED_AS_UNDERAGE;
    public static final value REMOTE_LOGOUT;
    public static final value SERVER_CONNECT_FAILED;
    public static final value SERVER_OVERLOADED;
    public static final value SKYPENAME_TAKEN;
    public static final value SOCKS_PROXY_AUTH_FAILED;
    public static final value TOO_MANY_LOGIN_ATTEMPTS;
    public static final value UNACCEPTABLE_PASSWORD;
    public static final value UNSUPPORTED_VERSION;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Account$LOGOUTREASON, s);
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
        LOGOUT_CALLED = new <init>("LOGOUT_CALLED", 0, 1);
        HTTPS_PROXY_AUTH_FAILED = new <init>("HTTPS_PROXY_AUTH_FAILED", 1, 2);
        SOCKS_PROXY_AUTH_FAILED = new <init>("SOCKS_PROXY_AUTH_FAILED", 2, 3);
        P2P_CONNECT_FAILED = new <init>("P2P_CONNECT_FAILED", 3, 4);
        SERVER_CONNECT_FAILED = new <init>("SERVER_CONNECT_FAILED", 4, 5);
        SERVER_OVERLOADED = new <init>("SERVER_OVERLOADED", 5, 6);
        DB_IN_USE = new <init>("DB_IN_USE", 6, 7);
        INVALID_SKYPENAME = new <init>("INVALID_SKYPENAME", 7, 8);
        INVALID_EMAIL = new <init>("INVALID_EMAIL", 8, 9);
        UNACCEPTABLE_PASSWORD = new <init>("UNACCEPTABLE_PASSWORD", 9, 10);
        SKYPENAME_TAKEN = new <init>("SKYPENAME_TAKEN", 10, 11);
        REJECTED_AS_UNDERAGE = new <init>("REJECTED_AS_UNDERAGE", 11, 12);
        NO_SUCH_IDENTITY = new <init>("NO_SUCH_IDENTITY", 12, 13);
        INCORRECT_PASSWORD = new <init>("INCORRECT_PASSWORD", 13, 14);
        TOO_MANY_LOGIN_ATTEMPTS = new <init>("TOO_MANY_LOGIN_ATTEMPTS", 14, 15);
        PASSWORD_HAS_CHANGED = new <init>("PASSWORD_HAS_CHANGED", 15, 16);
        PERIODIC_UIC_UPDATE_FAILED = new <init>("PERIODIC_UIC_UPDATE_FAILED", 16, 17);
        DB_DISK_FULL = new <init>("DB_DISK_FULL", 17, 18);
        DB_IO_ERROR = new <init>("DB_IO_ERROR", 18, 19);
        DB_CORRUPT = new <init>("DB_CORRUPT", 19, 20);
        DB_FAILURE = new <init>("DB_FAILURE", 20, 21);
        INVALID_APP_ID = new <init>("INVALID_APP_ID", 21, 22);
        APP_ID_FAILURE = new <init>("APP_ID_FAILURE", 22, 23);
        UNSUPPORTED_VERSION = new <init>("UNSUPPORTED_VERSION", 23, 24);
        ATO_BLOCKED = new <init>("ATO_BLOCKED", 24, 25);
        REMOTE_LOGOUT = new <init>("REMOTE_LOGOUT", 25, 26);
        ACCESS_TOKEN_RENEWAL_FAILED = new <init>("ACCESS_TOKEN_RENEWAL_FAILED", 26, 27);
        DB_CANTOPEN = new <init>("DB_CANTOPEN", 27, 28);
        DB_ACCESS_DENIED = new <init>("DB_ACCESS_DENIED", 28, 29);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 29, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            LOGOUT_CALLED, HTTPS_PROXY_AUTH_FAILED, SOCKS_PROXY_AUTH_FAILED, P2P_CONNECT_FAILED, SERVER_CONNECT_FAILED, SERVER_OVERLOADED, DB_IN_USE, INVALID_SKYPENAME, INVALID_EMAIL, UNACCEPTABLE_PASSWORD, 
            SKYPENAME_TAKEN, REJECTED_AS_UNDERAGE, NO_SUCH_IDENTITY, INCORRECT_PASSWORD, TOO_MANY_LOGIN_ATTEMPTS, PASSWORD_HAS_CHANGED, PERIODIC_UIC_UPDATE_FAILED, DB_DISK_FULL, DB_IO_ERROR, DB_CORRUPT, 
            DB_FAILURE, INVALID_APP_ID, APP_ID_FAILURE, UNSUPPORTED_VERSION, ATO_BLOCKED, REMOTE_LOGOUT, ACCESS_TOKEN_RENEWAL_FAILED, DB_CANTOPEN, DB_ACCESS_DENIED, WRAPPER_UNKNOWN_VALUE
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
