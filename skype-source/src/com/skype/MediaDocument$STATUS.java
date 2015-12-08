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
    public static final value ACCESS_DENIED;
    public static final value AVAILABLE;
    public static final value DELETED;
    public static final value EXPIRED;
    public static final value FAILED;
    public static final value MALWARE;
    public static final value NOT_AVAILABLE;
    public static final value NOT_CREATED;
    public static final value UNSAFE;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/MediaDocument$STATUS, s);
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
        NOT_CREATED = new <init>("NOT_CREATED", 0, 0);
        NOT_AVAILABLE = new <init>("NOT_AVAILABLE", 1, 1);
        AVAILABLE = new <init>("AVAILABLE", 2, 2);
        ACCESS_DENIED = new <init>("ACCESS_DENIED", 3, 3);
        DELETED = new <init>("DELETED", 4, 4);
        EXPIRED = new <init>("EXPIRED", 5, 5);
        FAILED = new <init>("FAILED", 6, 6);
        MALWARE = new <init>("MALWARE", 7, 8);
        UNSAFE = new <init>("UNSAFE", 8, 9);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 9, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            NOT_CREATED, NOT_AVAILABLE, AVAILABLE, ACCESS_DENIED, DELETED, EXPIRED, FAILED, MALWARE, UNSAFE, WRAPPER_UNKNOWN_VALUE
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
