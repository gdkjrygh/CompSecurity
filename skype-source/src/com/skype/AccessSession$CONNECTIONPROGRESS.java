// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            AccessSession

public static final class value extends Enum
{

    private static final value $VALUES[];
    public static final value CHECKING;
    public static final value COMPLETED;
    public static final value MAXSTEPS;
    public static final value STARTING;
    public static final value SUBMITTING;
    public static final value VERIFYING;
    public static final value WAITING;
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
        return (WRAPPER_UNKNOWN_VALUE)Enum.valueOf(com/skype/AccessSession$CONNECTIONPROGRESS, s);
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
        STARTING = new <init>("STARTING", 0, 0);
        VERIFYING = new <init>("VERIFYING", 1, 1);
        SUBMITTING = new <init>("SUBMITTING", 2, 2);
        CHECKING = new <init>("CHECKING", 3, 3);
        WAITING = new <init>("WAITING", 4, 4);
        COMPLETED = new <init>("COMPLETED", 5, 5);
        MAXSTEPS = new <init>("MAXSTEPS", 6, 6);
        WRAPPER_UNKNOWN_VALUE = new <init>("WRAPPER_UNKNOWN_VALUE", 7, 0x7fffffff);
        $VALUES = (new .VALUES[] {
            STARTING, VERIFYING, SUBMITTING, CHECKING, WAITING, COMPLETED, MAXSTEPS, WRAPPER_UNKNOWN_VALUE
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
