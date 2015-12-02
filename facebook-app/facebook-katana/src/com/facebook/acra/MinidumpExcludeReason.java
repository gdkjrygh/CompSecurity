// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra;


public final class MinidumpExcludeReason extends Enum
{

    private static final MinidumpExcludeReason $VALUES[];
    public static final MinidumpExcludeReason DUMP_TOO_BIG;
    public static final MinidumpExcludeReason DUMP_TOO_OLD;
    private final int mValue;

    private MinidumpExcludeReason(String s, int i, int j)
    {
        super(s, i);
        mValue = j;
    }

    public static MinidumpExcludeReason valueOf(String s)
    {
        return (MinidumpExcludeReason)Enum.valueOf(com/facebook/acra/MinidumpExcludeReason, s);
    }

    public static MinidumpExcludeReason[] values()
    {
        return (MinidumpExcludeReason[])$VALUES.clone();
    }

    public final int getValue()
    {
        return mValue;
    }

    static 
    {
        DUMP_TOO_BIG = new MinidumpExcludeReason("DUMP_TOO_BIG", 0, 64257);
        DUMP_TOO_OLD = new MinidumpExcludeReason("DUMP_TOO_OLD", 1, 64258);
        $VALUES = (new MinidumpExcludeReason[] {
            DUMP_TOO_BIG, DUMP_TOO_OLD
        });
    }
}
