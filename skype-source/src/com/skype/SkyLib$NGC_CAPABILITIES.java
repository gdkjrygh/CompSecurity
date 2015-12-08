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
    public static final value NGC_DISABLED;
    public static final value NGC_ENABLED;
    public static final value NGC_GROUP_CALLING_ENABLED;
    public static final value NGC_GROUP_CALLING_INITIATION_ENABLED;
    public static final ED NGC_LYNC_CALLING_ENABLED;
    public static final ED NGC_SKYPE_CALLING_ENABLED;
    public static final ED WRAPPER_UNKNOWN_VALUE;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/SkyLib$NGC_CAPABILITIES, s);
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
        NGC_DISABLED = new <init>("NGC_DISABLED", 0, 0);
        NGC_ENABLED = new <init>("NGC_ENABLED", 1, 1);
        NGC_LYNC_CALLING_ENABLED = new <init>("NGC_LYNC_CALLING_ENABLED", 2, 2);
        NGC_SKYPE_CALLING_ENABLED = new <init>("NGC_SKYPE_CALLING_ENABLED", 3, 4);
        NGC_GROUP_CALLING_ENABLED = new <init>("NGC_GROUP_CALLING_ENABLED", 4, 8);
        NGC_GROUP_CALLING_INITIATION_ENABLED = new <init>("NGC_GROUP_CALLING_INITIATION_ENABLED", 5, 16);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 6, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            NGC_DISABLED, NGC_ENABLED, NGC_LYNC_CALLING_ENABLED, NGC_SKYPE_CALLING_ENABLED, NGC_GROUP_CALLING_ENABLED, NGC_GROUP_CALLING_INITIATION_ENABLED, WRAPPER_UNKNOWN_VALUE
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
