// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.l;


public final class j extends Enum
{

    private static final j $VALUES[];
    public static final j DISABLED;
    public static final j ENABLED;
    public static final j OFF;
    private final boolean mShowPresence;

    private j(String s, int i, boolean flag)
    {
        super(s, i);
        mShowPresence = flag;
    }

    public static j valueOf(String s)
    {
        return (j)Enum.valueOf(com/facebook/l/j, s);
    }

    public static j[] values()
    {
        return (j[])$VALUES.clone();
    }

    public boolean shouldShowPresence()
    {
        return mShowPresence;
    }

    static 
    {
        ENABLED = new j("ENABLED", 0, true);
        DISABLED = new j("DISABLED", 1, false);
        OFF = new j("OFF", 2, true);
        $VALUES = (new j[] {
            ENABLED, DISABLED, OFF
        });
    }
}
