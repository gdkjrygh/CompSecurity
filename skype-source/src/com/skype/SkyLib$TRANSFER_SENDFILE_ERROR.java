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
    public static final value TRANSFER_BAD_FILENAME;
    public static final value TRANSFER_OPEN_FAILED;
    public static final value TRANSFER_OPEN_SUCCESS;
    public static final value TRANSFER_TOO_MANY_PARALLEL;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/SkyLib$TRANSFER_SENDFILE_ERROR, s);
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
        TRANSFER_OPEN_SUCCESS = new <init>("TRANSFER_OPEN_SUCCESS", 0, 0);
        TRANSFER_BAD_FILENAME = new <init>("TRANSFER_BAD_FILENAME", 1, 1);
        TRANSFER_OPEN_FAILED = new <init>("TRANSFER_OPEN_FAILED", 2, 2);
        TRANSFER_TOO_MANY_PARALLEL = new <init>("TRANSFER_TOO_MANY_PARALLEL", 3, 3);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            TRANSFER_OPEN_SUCCESS, TRANSFER_BAD_FILENAME, TRANSFER_OPEN_FAILED, TRANSFER_TOO_MANY_PARALLEL, WRAPPER_UNKNOWN_VALUE
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
