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
    public static final value UPLOAD_COMPLETED;
    public static final value UPLOAD_FAILED;
    public static final value UPLOAD_IN_PROGRESS;
    public static final value UPLOAD_NOT_STARTED;
    public static final value UPLOAD_QUEUED;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/MediaDocument$UPLOAD_STATUS, s);
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
        UPLOAD_NOT_STARTED = new <init>("UPLOAD_NOT_STARTED", 0, 0);
        UPLOAD_QUEUED = new <init>("UPLOAD_QUEUED", 1, 1);
        UPLOAD_IN_PROGRESS = new <init>("UPLOAD_IN_PROGRESS", 2, 2);
        UPLOAD_COMPLETED = new <init>("UPLOAD_COMPLETED", 3, 3);
        UPLOAD_FAILED = new <init>("UPLOAD_FAILED", 4, 4);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 5, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            UPLOAD_NOT_STARTED, UPLOAD_QUEUED, UPLOAD_IN_PROGRESS, UPLOAD_COMPLETED, UPLOAD_FAILED, WRAPPER_UNKNOWN_VALUE
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
