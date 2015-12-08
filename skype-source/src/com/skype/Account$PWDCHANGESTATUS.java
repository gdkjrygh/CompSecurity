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
    public static final value PWD_CHANGING;
    public static final value PWD_INVALID_NEW_PWD;
    public static final value PWD_INVALID_OLD_PASSWORD;
    public static final value PWD_MUST_DIFFER_FROM_OLD;
    public static final value PWD_MUST_LOG_IN_TO_CHANGE;
    public static final value PWD_OK;
    public static final value PWD_OK_BUT_CHANGE_SUGGESTED;
    public static final value PWD_SERVER_CONNECT_FAILED;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Account$PWDCHANGESTATUS, s);
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
        PWD_OK = new <init>("PWD_OK", 0, 0);
        PWD_CHANGING = new <init>("PWD_CHANGING", 1, 1);
        PWD_INVALID_OLD_PASSWORD = new <init>("PWD_INVALID_OLD_PASSWORD", 2, 2);
        PWD_SERVER_CONNECT_FAILED = new <init>("PWD_SERVER_CONNECT_FAILED", 3, 3);
        PWD_OK_BUT_CHANGE_SUGGESTED = new <init>("PWD_OK_BUT_CHANGE_SUGGESTED", 4, 4);
        PWD_MUST_DIFFER_FROM_OLD = new <init>("PWD_MUST_DIFFER_FROM_OLD", 5, 5);
        PWD_INVALID_NEW_PWD = new <init>("PWD_INVALID_NEW_PWD", 6, 6);
        PWD_MUST_LOG_IN_TO_CHANGE = new <init>("PWD_MUST_LOG_IN_TO_CHANGE", 7, 7);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 8, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            PWD_OK, PWD_CHANGING, PWD_INVALID_OLD_PASSWORD, PWD_SERVER_CONNECT_FAILED, PWD_OK_BUT_CHANGE_SUGGESTED, PWD_MUST_DIFFER_FROM_OLD, PWD_INVALID_NEW_PWD, PWD_MUST_LOG_IN_TO_CHANGE, WRAPPER_UNKNOWN_VALUE
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
