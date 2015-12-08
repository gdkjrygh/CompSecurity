// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            MediaDocument

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value STORAGE_POLICY_COPY_TO_CACHE;
    public static final value STORAGE_POLICY_MOVE_TO_CACHE;
    public static final value STORAGE_POLICY_TAKE_OWNERSHIP;
    public static final value STORAGE_POLICY_WEAK_LINK;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/MediaDocument$STORAGE_POLICY, s);
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
        STORAGE_POLICY_COPY_TO_CACHE = new <init>("STORAGE_POLICY_COPY_TO_CACHE", 0, 0);
        STORAGE_POLICY_MOVE_TO_CACHE = new <init>("STORAGE_POLICY_MOVE_TO_CACHE", 1, 1);
        STORAGE_POLICY_WEAK_LINK = new <init>("STORAGE_POLICY_WEAK_LINK", 2, 2);
        STORAGE_POLICY_TAKE_OWNERSHIP = new <init>("STORAGE_POLICY_TAKE_OWNERSHIP", 3, 3);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            STORAGE_POLICY_COPY_TO_CACHE, STORAGE_POLICY_MOVE_TO_CACHE, STORAGE_POLICY_WEAK_LINK, STORAGE_POLICY_TAKE_OWNERSHIP, WRAPPER_UNKNOWN_VALUE
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
