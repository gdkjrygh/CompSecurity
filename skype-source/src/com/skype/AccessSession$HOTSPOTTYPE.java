// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            AccessSession

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value FIRSTPAGEREDIRECT;
    public static final value FORM;
    public static final value NONE;
    public static final value OPEN;
    public static final value SUPPORTED;
    public static final value UNKNOWN;
    public static final value WISPR;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/AccessSession$HOTSPOTTYPE, s);
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
        UNKNOWN = new <init>("UNKNOWN", 0, 0);
        OPEN = new <init>("OPEN", 1, 1);
        WISPR = new <init>("WISPR", 2, 2);
        FORM = new <init>("FORM", 3, 3);
        FIRSTPAGEREDIRECT = new <init>("FIRSTPAGEREDIRECT", 4, 4);
        NONE = new <init>("NONE", 5, 5);
        SUPPORTED = new <init>("SUPPORTED", 6, 6);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 7, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            UNKNOWN, OPEN, WISPR, FORM, FIRSTPAGEREDIRECT, NONE, SUPPORTED, WRAPPER_UNKNOWN_VALUE
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
