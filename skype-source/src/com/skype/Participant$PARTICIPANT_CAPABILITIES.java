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
    public static final value PARTICIPANT_CAPABILITIES_ALL;
    public static final value PARTICIPANT_CAPABILITIES_NONE;
    public static final value PARTICIPANT_CAPABILITY_SCREEN_SHARING;
    public static final value PARTICIPANT_CAPABILITY_SCREEN_VIEWING;
    public static final value PARTICIPANT_GROUP_CALL_COMPATIBLE;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Participant$PARTICIPANT_CAPABILITIES, s);
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
        PARTICIPANT_CAPABILITIES_NONE = new <init>("PARTICIPANT_CAPABILITIES_NONE", 0, 0);
        PARTICIPANT_GROUP_CALL_COMPATIBLE = new <init>("PARTICIPANT_GROUP_CALL_COMPATIBLE", 1, 1);
        PARTICIPANT_CAPABILITY_SCREEN_SHARING = new <init>("PARTICIPANT_CAPABILITY_SCREEN_SHARING", 2, 2);
        PARTICIPANT_CAPABILITY_SCREEN_VIEWING = new <init>("PARTICIPANT_CAPABILITY_SCREEN_VIEWING", 3, 4);
        PARTICIPANT_CAPABILITIES_ALL = new <init>("PARTICIPANT_CAPABILITIES_ALL", 4, 65535);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 5, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            PARTICIPANT_CAPABILITIES_NONE, PARTICIPANT_GROUP_CALL_COMPATIBLE, PARTICIPANT_CAPABILITY_SCREEN_SHARING, PARTICIPANT_CAPABILITY_SCREEN_VIEWING, PARTICIPANT_CAPABILITIES_ALL, WRAPPER_UNKNOWN_VALUE
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
