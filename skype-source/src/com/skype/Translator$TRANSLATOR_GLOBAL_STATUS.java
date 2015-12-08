// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            Translator

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value TRANSLATOR_GLOBALSTATUS_INITFAILED;
    public static final value TRANSLATOR_GLOBALSTATUS_INITIALIZING;
    public static final value TRANSLATOR_GLOBALSTATUS_NOTREADY;
    public static final value TRANSLATOR_GLOBALSTATUS_READY;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Translator$TRANSLATOR_GLOBAL_STATUS, s);
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
        TRANSLATOR_GLOBALSTATUS_NOTREADY = new <init>("TRANSLATOR_GLOBALSTATUS_NOTREADY", 0, 0);
        TRANSLATOR_GLOBALSTATUS_INITIALIZING = new <init>("TRANSLATOR_GLOBALSTATUS_INITIALIZING", 1, 1);
        TRANSLATOR_GLOBALSTATUS_READY = new <init>("TRANSLATOR_GLOBALSTATUS_READY", 2, 2);
        TRANSLATOR_GLOBALSTATUS_INITFAILED = new <init>("TRANSLATOR_GLOBALSTATUS_INITFAILED", 3, 3);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            TRANSLATOR_GLOBALSTATUS_NOTREADY, TRANSLATOR_GLOBALSTATUS_INITIALIZING, TRANSLATOR_GLOBALSTATUS_READY, TRANSLATOR_GLOBALSTATUS_INITFAILED, WRAPPER_UNKNOWN_VALUE
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
