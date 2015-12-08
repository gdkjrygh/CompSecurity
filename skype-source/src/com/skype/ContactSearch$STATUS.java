// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            ContactSearch

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value CONSTRUCTION;
    public static final value EXTENDABLE;
    public static final value FAILED;
    public static final value FINISHED;
    public static final value PENDING;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/ContactSearch$STATUS, s);
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
        CONSTRUCTION = new <init>("CONSTRUCTION", 0, 1);
        PENDING = new <init>("PENDING", 1, 2);
        EXTENDABLE = new <init>("EXTENDABLE", 2, 3);
        FINISHED = new <init>("FINISHED", 3, 4);
        FAILED = new <init>("FAILED", 4, 5);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 5, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            CONSTRUCTION, PENDING, EXTENDABLE, FINISHED, FAILED, WRAPPER_UNKNOWN_VALUE
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
