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
    public static final value AVAILABLE;
    public static final value LOGGED_IN;
    public static final value LOGGED_OUT;
    public static final value LOGGING_IN;
    public static final value LOGGING_OUT;
    public static final value LOGIN_FAILED;
    public static final value UNAVAILABLE;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/AccessSession$STATUS, s);
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
        UNAVAILABLE = new <init>("UNAVAILABLE", 0, 0);
        AVAILABLE = new <init>("AVAILABLE", 1, 1);
        LOGGING_IN = new <init>("LOGGING_IN", 2, 2);
        LOGGED_IN = new <init>("LOGGED_IN", 3, 3);
        LOGGED_OUT = new <init>("LOGGED_OUT", 4, 4);
        LOGIN_FAILED = new <init>("LOGIN_FAILED", 5, 5);
        LOGGING_OUT = new <init>("LOGGING_OUT", 6, 6);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 7, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            UNAVAILABLE, AVAILABLE, LOGGING_IN, LOGGED_IN, LOGGED_OUT, LOGIN_FAILED, LOGGING_OUT, WRAPPER_UNKNOWN_VALUE
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
