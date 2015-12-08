// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            Participant

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value READING;
    public static final value TEXT_NA;
    public static final value TEXT_UNKNOWN;
    public static final value WRAPPER_UNKNOWN_VALUE;
    public static final value WRITING;
    public static final value WRITING_AS_ANGRY;
    public static final value WRITING_AS_CAT;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Participant$TEXT_STATUS, s);
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
        TEXT_UNKNOWN = new <init>("TEXT_UNKNOWN", 0, 0);
        TEXT_NA = new <init>("TEXT_NA", 1, 1);
        READING = new <init>("READING", 2, 2);
        WRITING = new <init>("WRITING", 3, 3);
        WRITING_AS_ANGRY = new <init>("WRITING_AS_ANGRY", 4, 4);
        WRITING_AS_CAT = new <init>("WRITING_AS_CAT", 5, 5);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 6, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            TEXT_UNKNOWN, TEXT_NA, READING, WRITING, WRITING_AS_ANGRY, WRITING_AS_CAT, WRAPPER_UNKNOWN_VALUE
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
