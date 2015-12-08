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
    public static final value SET_META_GUIDELINES;
    public static final value SET_META_NAME;
    public static final value SET_META_PICTURE;
    public static final value SET_META_TOPIC;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Message$SET_METADATA_KEY, s);
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
        SET_META_NAME = new <init>("SET_META_NAME", 0, 3640);
        SET_META_TOPIC = new <init>("SET_META_TOPIC", 1, 3644);
        SET_META_GUIDELINES = new <init>("SET_META_GUIDELINES", 2, 3652);
        SET_META_PICTURE = new <init>("SET_META_PICTURE", 3, 3658);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            SET_META_NAME, SET_META_TOPIC, SET_META_GUIDELINES, SET_META_PICTURE, WRAPPER_UNKNOWN_VALUE
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
