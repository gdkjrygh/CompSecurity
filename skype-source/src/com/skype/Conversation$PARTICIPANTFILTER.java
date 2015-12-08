// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            Conversation

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value ALL;
    public static final value APPLICANTS;
    public static final value CONSUMERS;
    public static final value CONSUMERS_AND_APPLICANTS;
    public static final value MYSELF;
    public static final value OTHER_CONSUMERS;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Conversation$PARTICIPANTFILTER, s);
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
        ALL = new <init>("ALL", 0, 0);
        CONSUMERS = new <init>("CONSUMERS", 1, 1);
        APPLICANTS = new <init>("APPLICANTS", 2, 2);
        CONSUMERS_AND_APPLICANTS = new <init>("CONSUMERS_AND_APPLICANTS", 3, 3);
        MYSELF = new <init>("MYSELF", 4, 4);
        OTHER_CONSUMERS = new <init>("OTHER_CONSUMERS", 5, 5);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 6, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            ALL, CONSUMERS, APPLICANTS, CONSUMERS_AND_APPLICANTS, MYSELF, OTHER_CONSUMERS, WRAPPER_UNKNOWN_VALUE
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
