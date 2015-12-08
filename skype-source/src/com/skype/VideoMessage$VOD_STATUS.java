// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            VideoMessage

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value VOD_CONVERTING;
    public static final value VOD_NOT_AVAILABLE;
    public static final value VOD_PLAYABLE;
    public static final value VOD_PLAYABLE_LOCAL;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/VideoMessage$VOD_STATUS, s);
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
        VOD_NOT_AVAILABLE = new <init>("VOD_NOT_AVAILABLE", 0, 0);
        VOD_CONVERTING = new <init>("VOD_CONVERTING", 1, 1);
        VOD_PLAYABLE = new <init>("VOD_PLAYABLE", 2, 2);
        VOD_PLAYABLE_LOCAL = new <init>("VOD_PLAYABLE_LOCAL", 3, 3);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            VOD_NOT_AVAILABLE, VOD_CONVERTING, VOD_PLAYABLE, VOD_PLAYABLE_LOCAL, WRAPPER_UNKNOWN_VALUE
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
