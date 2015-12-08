// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            Transfer

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value FAILED_READ;
    public static final value FAILED_REMOTE_READ;
    public static final value FAILED_REMOTE_WRITE;
    public static final value FAILED_WRITE;
    public static final value PLACEHOLDER_TIMEOUT;
    public static final value REMOTELY_CANCELLED;
    public static final value REMOTE_DOES_NOT_SUPPORT_FT;
    public static final value REMOTE_OFFLINE_FOR_TOO_LONG;
    public static final value SENDER_NOT_AUTHORISED;
    public static final value TOO_MANY_PARALLEL;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Transfer$FAILUREREASON, s);
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
        SENDER_NOT_AUTHORISED = new <init>("SENDER_NOT_AUTHORISED", 0, 1);
        REMOTELY_CANCELLED = new <init>("REMOTELY_CANCELLED", 1, 2);
        FAILED_READ = new <init>("FAILED_READ", 2, 3);
        FAILED_REMOTE_READ = new <init>("FAILED_REMOTE_READ", 3, 4);
        FAILED_WRITE = new <init>("FAILED_WRITE", 4, 5);
        FAILED_REMOTE_WRITE = new <init>("FAILED_REMOTE_WRITE", 5, 6);
        REMOTE_DOES_NOT_SUPPORT_FT = new <init>("REMOTE_DOES_NOT_SUPPORT_FT", 6, 7);
        REMOTE_OFFLINE_FOR_TOO_LONG = new <init>("REMOTE_OFFLINE_FOR_TOO_LONG", 7, 8);
        TOO_MANY_PARALLEL = new <init>("TOO_MANY_PARALLEL", 8, 9);
        PLACEHOLDER_TIMEOUT = new <init>("PLACEHOLDER_TIMEOUT", 9, 10);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 10, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            SENDER_NOT_AUTHORISED, REMOTELY_CANCELLED, FAILED_READ, FAILED_REMOTE_READ, FAILED_WRITE, FAILED_REMOTE_WRITE, REMOTE_DOES_NOT_SUPPORT_FT, REMOTE_OFFLINE_FOR_TOO_LONG, TOO_MANY_PARALLEL, PLACEHOLDER_TIMEOUT, 
            WRAPPER_UNKNOWN_VALUE
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
