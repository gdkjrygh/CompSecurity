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
    public static final value MSGID_FORCALLEE_ORIG;
    public static final value MSGID_FORCALLEE_TRANSLATED;
    public static final value MSGID_FORCALLER_ORIG;
    public static final value MSGID_FORCALLER_TRANSLATED;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Translator$TRANSLATOR_RESERVED_MSGID, s);
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
        MSGID_FORCALLER_ORIG = new <init>("MSGID_FORCALLER_ORIG", 0, -1);
        MSGID_FORCALLEE_ORIG = new <init>("MSGID_FORCALLEE_ORIG", 1, -2);
        MSGID_FORCALLER_TRANSLATED = new <init>("MSGID_FORCALLER_TRANSLATED", 2, -3);
        MSGID_FORCALLEE_TRANSLATED = new <init>("MSGID_FORCALLEE_TRANSLATED", 3, -4);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            MSGID_FORCALLER_ORIG, MSGID_FORCALLEE_ORIG, MSGID_FORCALLER_TRANSLATED, MSGID_FORCALLEE_TRANSLATED, WRAPPER_UNKNOWN_VALUE
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
