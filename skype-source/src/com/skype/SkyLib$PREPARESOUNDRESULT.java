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
    public static final value PREPARESOUND_FILE_NOT_FOUND;
    public static final value PREPARESOUND_FILE_READ_ERROR;
    public static final value PREPARESOUND_FILE_TOO_BIG;
    public static final value PREPARESOUND_MISC_ERROR;
    public static final value PREPARESOUND_PLAYBACK_NOT_SUPPORTED;
    public static final value PREPARESOUND_SUCCESS;
    public static final value PREPARESOUND_UNSUPPORTED_FILE_FORMAT;
    public static final  WRAPPER_UNKNOWN_VALUE;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/SkyLib$PREPARESOUNDRESULT, s);
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
        PREPARESOUND_SUCCESS = new <init>("PREPARESOUND_SUCCESS", 0, 0);
        PREPARESOUND_MISC_ERROR = new <init>("PREPARESOUND_MISC_ERROR", 1, 1);
        PREPARESOUND_FILE_NOT_FOUND = new <init>("PREPARESOUND_FILE_NOT_FOUND", 2, 2);
        PREPARESOUND_FILE_TOO_BIG = new <init>("PREPARESOUND_FILE_TOO_BIG", 3, 3);
        PREPARESOUND_FILE_READ_ERROR = new <init>("PREPARESOUND_FILE_READ_ERROR", 4, 4);
        PREPARESOUND_UNSUPPORTED_FILE_FORMAT = new <init>("PREPARESOUND_UNSUPPORTED_FILE_FORMAT", 5, 5);
        PREPARESOUND_PLAYBACK_NOT_SUPPORTED = new <init>("PREPARESOUND_PLAYBACK_NOT_SUPPORTED", 6, 6);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 7, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            PREPARESOUND_SUCCESS, PREPARESOUND_MISC_ERROR, PREPARESOUND_FILE_NOT_FOUND, PREPARESOUND_FILE_TOO_BIG, PREPARESOUND_FILE_READ_ERROR, PREPARESOUND_UNSUPPORTED_FILE_FORMAT, PREPARESOUND_PLAYBACK_NOT_SUPPORTED, WRAPPER_UNKNOWN_VALUE
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
