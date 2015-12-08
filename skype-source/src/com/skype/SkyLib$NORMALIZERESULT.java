// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            SkyLib

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value IDENTITY_CONTAINS_INVALID_CHAR;
    public static final value IDENTITY_EMPTY;
    public static final value IDENTITY_OK;
    public static final value IDENTITY_TOO_LONG;
    public static final value PSTN_NUMBER_HAS_INVALID_PREFIX;
    public static final value PSTN_NUMBER_TOO_SHORT;
    public static final value SKYPENAME_SHORTER_THAN_6_CHARS;
    public static final value SKYPENAME_STARTS_WITH_NONALPHA;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/SkyLib$NORMALIZERESULT, s);
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
        IDENTITY_OK = new <init>("IDENTITY_OK", 0, 0);
        IDENTITY_EMPTY = new <init>("IDENTITY_EMPTY", 1, 1);
        IDENTITY_TOO_LONG = new <init>("IDENTITY_TOO_LONG", 2, 2);
        IDENTITY_CONTAINS_INVALID_CHAR = new <init>("IDENTITY_CONTAINS_INVALID_CHAR", 3, 3);
        PSTN_NUMBER_TOO_SHORT = new <init>("PSTN_NUMBER_TOO_SHORT", 4, 4);
        PSTN_NUMBER_HAS_INVALID_PREFIX = new <init>("PSTN_NUMBER_HAS_INVALID_PREFIX", 5, 5);
        SKYPENAME_STARTS_WITH_NONALPHA = new <init>("SKYPENAME_STARTS_WITH_NONALPHA", 6, 6);
        SKYPENAME_SHORTER_THAN_6_CHARS = new <init>("SKYPENAME_SHORTER_THAN_6_CHARS", 7, 7);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 8, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            IDENTITY_OK, IDENTITY_EMPTY, IDENTITY_TOO_LONG, IDENTITY_CONTAINS_INVALID_CHAR, PSTN_NUMBER_TOO_SHORT, PSTN_NUMBER_HAS_INVALID_PREFIX, SKYPENAME_STARTS_WITH_NONALPHA, SKYPENAME_SHORTER_THAN_6_CHARS, WRAPPER_UNKNOWN_VALUE
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
