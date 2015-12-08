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
    public static final value CONTAINS_INVALID_CHAR;
    public static final value CONTAINS_INVALID_WORD;
    public static final value CONTAINS_SPACE;
    public static final value INVALID_FORMAT;
    public static final value NOT_VALIDATED;
    public static final value SAME_AS_USERNAME;
    public static final value STARTS_WITH_INVALID_CHAR;
    public static final value TOO_LONG;
    public static final value TOO_SHORT;
    public static final value TOO_SIMPLE;
    public static final value VALIDATED_OK;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/SkyLib$VALIDATERESULT, s);
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
        NOT_VALIDATED = new <init>("NOT_VALIDATED", 0, 0);
        VALIDATED_OK = new <init>("VALIDATED_OK", 1, 1);
        TOO_SHORT = new <init>("TOO_SHORT", 2, 2);
        TOO_LONG = new <init>("TOO_LONG", 3, 3);
        CONTAINS_INVALID_CHAR = new <init>("CONTAINS_INVALID_CHAR", 4, 4);
        CONTAINS_SPACE = new <init>("CONTAINS_SPACE", 5, 5);
        SAME_AS_USERNAME = new <init>("SAME_AS_USERNAME", 6, 6);
        INVALID_FORMAT = new <init>("INVALID_FORMAT", 7, 7);
        CONTAINS_INVALID_WORD = new <init>("CONTAINS_INVALID_WORD", 8, 8);
        TOO_SIMPLE = new <init>("TOO_SIMPLE", 9, 9);
        STARTS_WITH_INVALID_CHAR = new <init>("STARTS_WITH_INVALID_CHAR", 10, 10);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 11, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            NOT_VALIDATED, VALIDATED_OK, TOO_SHORT, TOO_LONG, CONTAINS_INVALID_CHAR, CONTAINS_SPACE, SAME_AS_USERNAME, INVALID_FORMAT, CONTAINS_INVALID_WORD, TOO_SIMPLE, 
            STARTS_WITH_INVALID_CHAR, WRAPPER_UNKNOWN_VALUE
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
