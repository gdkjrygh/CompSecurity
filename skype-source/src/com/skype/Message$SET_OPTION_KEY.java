// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            Message

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value SET_OPTION_ADMIN_ONLY_ACTIVITIES;
    public static final value SET_OPTION_DISCLOSE_HISTORY;
    public static final value SET_OPTION_ENTRY_LEVEL_RANK;
    public static final value SET_OPTION_HISTORY_LIMIT_IN_DAYS;
    public static final value SET_OPTION_JOINING_ENABLED;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Message$SET_OPTION_KEY, s);
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
        SET_OPTION_JOINING_ENABLED = new <init>("SET_OPTION_JOINING_ENABLED", 0, 3689);
        SET_OPTION_ENTRY_LEVEL_RANK = new <init>("SET_OPTION_ENTRY_LEVEL_RANK", 1, 3625);
        SET_OPTION_DISCLOSE_HISTORY = new <init>("SET_OPTION_DISCLOSE_HISTORY", 2, 3629);
        SET_OPTION_HISTORY_LIMIT_IN_DAYS = new <init>("SET_OPTION_HISTORY_LIMIT_IN_DAYS", 3, 3633);
        SET_OPTION_ADMIN_ONLY_ACTIVITIES = new <init>("SET_OPTION_ADMIN_ONLY_ACTIVITIES", 4, 3637);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 5, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            SET_OPTION_JOINING_ENABLED, SET_OPTION_ENTRY_LEVEL_RANK, SET_OPTION_DISCLOSE_HISTORY, SET_OPTION_HISTORY_LIMIT_IN_DAYS, SET_OPTION_ADMIN_ONLY_ACTIVITIES, WRAPPER_UNKNOWN_VALUE
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
