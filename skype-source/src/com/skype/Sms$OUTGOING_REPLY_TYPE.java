// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            Sms

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value REPLY_2WAY_AUTOASSIGNED_NR;
    public static final value REPLY_SKYPENAME;
    public static final value REPLY_TYPE_MIXED;
    public static final value REPLY_USER_PHONE_NR;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Sms$OUTGOING_REPLY_TYPE, s);
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
        REPLY_SKYPENAME = new <init>("REPLY_SKYPENAME", 0, 1);
        REPLY_USER_PHONE_NR = new <init>("REPLY_USER_PHONE_NR", 1, 2);
        REPLY_2WAY_AUTOASSIGNED_NR = new <init>("REPLY_2WAY_AUTOASSIGNED_NR", 2, 3);
        REPLY_TYPE_MIXED = new <init>("REPLY_TYPE_MIXED", 3, 4);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            REPLY_SKYPENAME, REPLY_USER_PHONE_NR, REPLY_2WAY_AUTOASSIGNED_NR, REPLY_TYPE_MIXED, WRAPPER_UNKNOWN_VALUE
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
