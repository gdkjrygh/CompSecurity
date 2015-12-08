// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            Account

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value CBL_INITIALIZING;
    public static final value CBL_INITIAL_SYNC_PENDING;
    public static final value CBL_IN_SYNC;
    public static final value CBL_REMOTE_SYNC_PENDING;
    public static final value CBL_SYNC_FAILED;
    public static final value CBL_SYNC_IN_PROGRESS;
    public static final value CBL_SYNC_PENDING;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/Account$CBLSYNCSTATUS, s);
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
        CBL_INITIALIZING = new <init>("CBL_INITIALIZING", 0, 0);
        CBL_INITIAL_SYNC_PENDING = new <init>("CBL_INITIAL_SYNC_PENDING", 1, 1);
        CBL_SYNC_PENDING = new <init>("CBL_SYNC_PENDING", 2, 2);
        CBL_SYNC_IN_PROGRESS = new <init>("CBL_SYNC_IN_PROGRESS", 3, 3);
        CBL_IN_SYNC = new <init>("CBL_IN_SYNC", 4, 4);
        CBL_SYNC_FAILED = new <init>("CBL_SYNC_FAILED", 5, 5);
        CBL_REMOTE_SYNC_PENDING = new <init>("CBL_REMOTE_SYNC_PENDING", 6, 6);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 7, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            CBL_INITIALIZING, CBL_INITIAL_SYNC_PENDING, CBL_SYNC_PENDING, CBL_SYNC_IN_PROGRESS, CBL_IN_SYNC, CBL_SYNC_FAILED, CBL_REMOTE_SYNC_PENDING, WRAPPER_UNKNOWN_VALUE
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
