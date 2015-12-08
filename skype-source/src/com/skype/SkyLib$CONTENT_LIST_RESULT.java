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
    public static final value CL_FILE_ERROR;
    public static final value CL_LISTED;
    public static final value CL_NOT_LISTED;
    public static final value CL_QUERY_FAILED;
    public static final value CL_QUERY_PENDING;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/SkyLib$CONTENT_LIST_RESULT, s);
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
        CL_LISTED = new <init>("CL_LISTED", 0, 0);
        CL_NOT_LISTED = new <init>("CL_NOT_LISTED", 1, 1);
        CL_QUERY_PENDING = new <init>("CL_QUERY_PENDING", 2, 2);
        CL_QUERY_FAILED = new <init>("CL_QUERY_FAILED", 3, 3);
        CL_FILE_ERROR = new <init>("CL_FILE_ERROR", 4, 4);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 5, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            CL_LISTED, CL_NOT_LISTED, CL_QUERY_PENDING, CL_QUERY_FAILED, CL_FILE_ERROR, WRAPPER_UNKNOWN_VALUE
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
